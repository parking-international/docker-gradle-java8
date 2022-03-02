package co.net.parking.beans;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import co.net.parking.dto.ConveniosBahiasDTO;
import co.net.parking.dto.InformacionTerminalBahiasDTO;
import co.net.parking.dto.InformacionTerminalDTO;
import co.net.parking.dto.RespuestaGeneralDTO;
import co.net.parking.dto.RespuestaTerminalDTO;
import co.net.parking.dto.TerminalesDTO;
import co.net.parking.entities.ParkingTarifasParquedero;
import co.net.parking.util.Util;

@Stateless
public class TerminalBean {

	@PersistenceContext(unitName = Util.UP_TRANSACCION_PARKING)
	private EntityManager em;
	
	private ErrorLogBean errorLogBean=new ErrorLogBean();
	
	
	
	public RespuestaTerminalDTO getInformacionTerminal(String codTerminal) {
		RespuestaTerminalDTO respuestaTerminalDTO = this.validaTerminal(codTerminal);
		return respuestaTerminalDTO;
	}
	
	@SuppressWarnings("unchecked")
	public RespuestaTerminalDTO validaTerminal(String codTerminal) {
		RespuestaTerminalDTO queryResult = new RespuestaTerminalDTO();
		String poliza = null;
		List<ParkingTarifasParquedero> tarifas = new ArrayList<ParkingTarifasParquedero>();
		Query q = em.createNativeQuery("select pa.cod_park,te.cod_terminal,rf.num_resolucion,rf.rango_inicial,rf.rango_final,re.fecha_inicial,re.fecha_final\r\n" + 
				"from terminales te\r\n" + 
				"inner join parqueadero pa on te.cod_park=pa.cod_park\r\n" + 
				"inner join rango_facturas rf on te.cod_terminal=rf.cod_terminal\r\n" + 
				"inner join resoluciones re on rf.num_resolucion = re.num_resolucion\r\n" + 
				"where te.cod_terminal=:codTerminal and rf.estado=1 and re.estado=1 ");
		Query q2 = em.createNativeQuery("\r\n" + 
				"  SELECT top (1) po.mensaje \r\n" + 
				"  from poliza po\r\n" + 
				"  order by po.anio desc");
		
		try {
			
			Object[] resultado= (Object[])q.setParameter("codTerminal", codTerminal).getSingleResult();
			queryResult.setCodPark(resultado[0].toString());
			queryResult.setCodTerminal(resultado[1].toString());
			queryResult.setResolucion(resultado[2].toString());
			queryResult.setRangoInicial(resultado[3].toString());
			queryResult.setRangoFinal(resultado[4].toString());
			queryResult.setFechaInicialResolucion(resultado[5].toString());
			queryResult.setFechaFinalResolucion(resultado[6].toString());
			poliza=(String) q2.getSingleResult();
			queryResult.setPoliza(poliza);
			Query q3 = em.createQuery("SELECT t FROM ParkingTarifasParquedero t WHERE codPark=:codPark ");
			tarifas =(List<ParkingTarifasParquedero>) q3.setParameter("codPark", queryResult.getCodPark()).getResultList();
			for (ParkingTarifasParquedero tarifa : tarifas) {
				if(tarifa.getTipoVehiculo()==1) {
					queryResult.setTarifaCarro(tarifa.getValor());
				}else {
					if(tarifa.getTipoVehiculo()==2) {
						queryResult.setTarifaMoto(tarifa.getValor());
					}else {
						if(tarifa.getTipoVehiculo()==100) {
							queryResult.setTarifaBici(tarifa.getValor());
						}
					}
				}
			}
		}catch (NoResultException ex) {
			queryResult=null;
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		return queryResult;
	}
	
	@SuppressWarnings("unchecked")
	public RespuestaTerminalDTO getInformacionTerminalValidacion(String codTerminal) {
	RespuestaTerminalDTO queryResult = new RespuestaTerminalDTO();
//	InformacionTerminalDTO respuesta = new InformacionTerminalDTO();
	List<ParkingTarifasParquedero> tarifas = new ArrayList<ParkingTarifasParquedero>();
	String poliza=null;
	String fraseResolucion=null;
	String horarioInicial=null;
	String horarioFinal=null;
	Query q = em.createNativeQuery("select pa.cod_park ,te.cod_terminal ,te.base_caja,pa.nombre_park,pa.direccion " + 
			"from terminales te\r\n" + 
			"inner join parqueadero pa on te.cod_park=pa.cod_park\r\n" + 
			"where  te.cod_terminal=:codTerminal and te.estado=1");
	//Query sql= em.createNativeQuery("select from terminales ");
	Query q2 = em.createNativeQuery("select rf.num_resolucion,rf.rango_inicial,rf.rango_final\r\n" + 
			"from rango_facturas rf \r\n" + 
			"where rf.cod_terminal=:codTerminal and rf.estado=1");
	
	
	Query q3 = em.createNativeQuery("select re.fecha_inicial,re.fecha_final\r\n" + 
			"from resoluciones re\r\n" + 
			"where re.num_resolucion =:numResolucion and re.estado=1");
	
	Query q4 = em.createNativeQuery("\r\n" + 
			"  SELECT  po.mensaje \r\n" + 
			"  from poliza po\r\n" + 
			"  where anio=( SELECT YEAR(CURRENT_TIMESTAMP))");
	
	Query q5 = em.createQuery("SELECT t FROM ParkingTarifasParquedero t WHERE codPark=:codPark and tipoTarifa  in (1,4,5)");
	
	Query q6= em.createNativeQuery("SELECT rf.frase_resolucion FROM rango_facturas rf "
			+ "where rf.num_resolucion=:numResolucion and rf.cod_terminal=:codTerminal and estado=1");
	
	
	try {
		Object[] resultado= (Object[])q.setParameter("codTerminal", codTerminal).getSingleResult();
		if(resultado!=null) {
			queryResult.setCodPark(resultado[0].toString());
			queryResult.setCodTerminal(resultado[1].toString());
			queryResult.setBaseCaja((int) resultado[2]);
			queryResult.setNombrePark(resultado[3].toString());
			queryResult.setDireccion(resultado[4].toString());
			if(queryResult.getCodPark()!=null) {
				horarioInicial=this.consultarHoraInicialPark(queryResult.getCodPark());
				horarioFinal=this.consultarHoraFinalPark(queryResult.getCodPark());
				if(horarioInicial==null||horarioFinal==null || horarioInicial.equals("") || horarioFinal.equals("")) {
					queryResult.setCodTerminal("NO HORARIO");
					return queryResult;
				}else {
				queryResult.setHorario("De: "+horarioInicial+ " a: "+horarioFinal);
				}
			}
			try {
				Object[] resultado2= (Object[])q2.setParameter("codTerminal", codTerminal).getSingleResult();
				if(resultado2!=null) {
					queryResult.setResolucion(resultado2[0].toString());
					queryResult.setRangoInicial(resultado2[1].toString());
					queryResult.setRangoFinal(resultado2[2].toString());
					try {
						Object[] resultado3= (Object[])q3.setParameter("numResolucion", queryResult.getResolucion()).getSingleResult();
						if(resultado3!=null) {
							queryResult.setFechaInicialResolucion(resultado3[0].toString());
							queryResult.setFechaFinalResolucion(resultado3[1].toString());
							try {
								tarifas =(List<ParkingTarifasParquedero>)
										q5.setParameter("codPark", queryResult.getCodPark()).getResultList();
								if(tarifas!=null && tarifas.size()!=0) {
									for (ParkingTarifasParquedero tarifa : tarifas) {
										queryResult.setTipoTarifa(tarifa.getTipoTarifa());
										if(tarifa.getTipoVehiculo()==1) {
											queryResult.setTarifaCarro(tarifa.getValor());
										}else {
											if(tarifa.getTipoVehiculo()==2) {
												queryResult.setTarifaMoto(tarifa.getValor());
											}else {
												if(tarifa.getTipoVehiculo()==100) {
													queryResult.setTarifaBici(tarifa.getValor());
												}
											}
										}
									}
									try {
										poliza=(String) q4.getSingleResult();
										queryResult.setPoliza(poliza);
										fraseResolucion=(String) q6.setParameter("numResolucion", queryResult.getResolucion()).setParameter("codTerminal", queryResult.getCodTerminal()).getSingleResult();
										queryResult.setMensajeResolucion(fraseResolucion);
									} catch (NoResultException e) {
										queryResult.setCodTerminal("NO POLIZA");
										return queryResult;
									}catch (Exception ex) {
										queryResult.setCodTerminal("NO POLIZA");
										return queryResult;
									}
							
								}else {
									queryResult.setCodTerminal("NO TARIFAS");
									return queryResult;
								}
							} catch (NoResultException e) {
								queryResult.setCodTerminal("NO TARIFAS");
								return queryResult;
							}catch (Exception ex) {
								queryResult.setCodTerminal("NO TARIFAS");
								return queryResult;
							}
							
						}
					} catch (NoResultException ex) {
						queryResult.setCodTerminal("NO RESOLUCION");
						return queryResult;
					} 
					catch (Exception e) {
						queryResult.setCodTerminal("NO RESOLUCION");
						return queryResult;
					}
				}
			} catch (NoResultException e) {
				queryResult.setCodTerminal("NO RANGO");
				return queryResult;
			}
			catch (Exception e) {
				queryResult.setCodTerminal("NO RANGO");
				return queryResult;
			}
			
		}
	} catch (NoResultException e) {
		queryResult.setCodTerminal("NO TERMINAL");
		return queryResult;
	}catch(Exception ex){
		queryResult.setCodTerminal("NO TERMINAL");
		return queryResult;
	}
	
	
	return queryResult;
	}
	
		
	
	public InformacionTerminalBahiasDTO getInfoTerminal(String codTerminal) {
		RespuestaTerminalDTO terminal= this.getInformacionTerminalValidacion(codTerminal);
	List<ConveniosBahiasDTO> listaConvenios=this.consultarConvenios(codTerminal);
		InformacionTerminalBahiasDTO respuesta = new InformacionTerminalBahiasDTO();
		if(terminal.getCodTerminal()!=null) {
		respuesta.setListaConvenios(listaConvenios);
		 respuesta.setCodTerminal(terminal.getCodTerminal());
		 respuesta.setBaseCaja(terminal.getBaseCaja());
		 respuesta.setNombrePark(terminal.getNombrePark());
		 respuesta.setDireccion(terminal.getDireccion());
		 respuesta.setHorario(terminal.getHorario());
		 if(terminal.getCodPark()!=null) {
			 respuesta.setCodPark(terminal.getCodPark());
			 if(terminal.getMensajeResolucion()!=null) {
				 respuesta.setResolucion(terminal.getMensajeResolucion());
				 if(terminal.getPoliza()!=null) {
					 respuesta.setPoliza(terminal.getPoliza());
					 respuesta.setTarifaCarro(terminal.getTarifaCarro());
					 respuesta.setTarifaMoto(terminal.getTarifaMoto());
					 respuesta.setTarifaBici(terminal.getTarifaBici());
					 respuesta.setTipoTarifa(terminal.getTipoTarifa());
					 respuesta.setTiempoGracia(terminal.getTiempoGracia());
					 respuesta.setNombreEmpresa("PARKING INTERNATIONAL S.A.S");
					 respuesta.setNitEmpresa("860.058.760-1");
				 }
			 }else {
				 return respuesta;
			 }
		 }else {
			 return respuesta;
		 }
		 }
		return respuesta;
	}
	
	public RespuestaGeneralDTO getTerminales(String codTerminal){
		RespuestaGeneralDTO response = new RespuestaGeneralDTO();
		TerminalesDTO terminales = new TerminalesDTO();
		response.setMensaje("Error al consultar informacion de terminal");
		response.setEstado(false);
		try {
			Query q1 = em.createQuery("");
			terminales.setCodTerminal((String) q1.getSingleResult());
			if(terminales.getCodTerminal()!=null) {
				Query q2 = em.createQuery("");
				terminales.setCodPark((String) q2.getSingleResult());
				if(terminales.getCodPark()!=null) {
					Query q3 = em.createQuery("");
					Query sql = em.createQuery("");
					terminales.setNombrePark((String) sql.getSingleResult());
					terminales.setTarifa((int)q3.getSingleResult());
					if(terminales.getTarifa()!=0) {
						Query q4= em.createQuery("");
						terminales.setPoliza((String) q4.getSingleResult());
						if(terminales.getPoliza()!=null) {
							String resolucion = null;
							Query q5 = em.createQuery("");
							resolucion = (String) q5.getSingleResult();
							response.setEstado(true);
							response.setMensaje("Consulta de informacion de terminal exitosa");
							response.setDetalle("consulta con exito para"+codTerminal);
							return response;
						}else {
							response.setDetalle("Poliza para "+codTerminal+" no existe");
							return response;
						}
					}else {
						response.setDetalle("Tarifa para "+codTerminal+" no existe");
						return response;
					}
				}else {
					response.setDetalle("Parqueadero para "+codTerminal+"no existe");
					return response;
				}
			}else {

				response.setDetalle("Terminal "+codTerminal+"no existe");
				return response;
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.setDetalle("Error en consulta");
			
		}
		return response;
		
	}
	
	public String consultarHoraInicialPark(String codPark) {
		String horarioInicial = "";
		try {
			String query = "SELECT hora_inicial,hora_final  FROM horario_parqueadero2 where cod_park=:codPark and estado=1 and dia_mysql= DATEPART(weekday,(getdate()))";
			@SuppressWarnings("unchecked")
			ArrayList<Object[]> listaHorario = (ArrayList<Object[]>) em.createNativeQuery(query)
					.setParameter("codPark", codPark).getResultList();
			if (listaHorario != null && listaHorario.size() > 0) {
				Object[] rec = listaHorario.get(0);
				horarioInicial = (rec[0].toString());

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return horarioInicial;
	}

	public String consultarHoraFinalPark(String codPark) {
		String horarioFinal = "";
		try {
			String query = "SELECT hora_inicial,hora_final  FROM horario_parqueadero2 where cod_park=:codPark and estado=1 and dia_mysql= DATEPART(weekday,(getdate()))";
			@SuppressWarnings("unchecked")
			ArrayList<Object[]> listaHorario = (ArrayList<Object[]>) em.createNativeQuery(query)
					.setParameter("codPark", codPark).getResultList();
			if (listaHorario != null && listaHorario.size() > 0) {
				Object[] rec = listaHorario.get(0);
				horarioFinal = (rec[1].toString());

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return horarioFinal;
	}
	
	@SuppressWarnings("unchecked")
	public List<ConveniosBahiasDTO> consultarConvenios(String codTerminal) {
		List<ConveniosBahiasDTO> listaConvenios= new ArrayList<ConveniosBahiasDTO>();
		
		try {
			String query = "SELECT c.cod_park,tipo,nombre_convenio,tiempo_porcentaje,t.cod_terminal, c.id \r\n" + 
					"FROM parking_bahias_configuracion_convenios c, terminales t\r\n" + 
					"where  c.cod_park=t.cod_park\r\n" + 
					"and c.estado=1 and t.cod_terminal=:cod_terminal";
			List<Object[]> lista = (ArrayList<Object[]>) em.createNativeQuery(query)
					.setParameter("cod_terminal", codTerminal).getResultList();
			if (lista != null && lista.size() > 0) {
				for (int i = 0; i < lista.size(); i++) {
				Object[] rec = lista.get(i);
				ConveniosBahiasDTO convenio= new ConveniosBahiasDTO();
				convenio.setId(Integer.parseInt(rec[5].toString()));
				convenio.setNombreConvenio(rec[2].toString());
				convenio.setTiempoDescuento(rec[3].toString());
				convenio.setTipo(rec[1].toString());
				listaConvenios.add(convenio);
				}

			}else {
				listaConvenios=null;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return listaConvenios;
	}
}
