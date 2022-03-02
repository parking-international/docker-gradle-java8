package co.net.parking.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="impuestos")
@NamedQueries({@NamedQuery(name = "ivaActual", query = "SELECT e FROM Impuesto e Where estado=1")})
public class Impuesto {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;

		@Column(name="codigo")
		private String codigo;
		
		@Column(name="nombre")
		private String nombre;
		
		@Column(name="descripcion")
		private String descripcion;
		
		@Column(name="base_gravable")
		private String baseGravable;
		
		@Column(name="porcentaje")
		private int porcentaje;
		
		@Column(name="fecha_inicial")
		private String fechaInicial;
		
		@Column(name="fecha_final")
		private String fechaFinal;
		
		@Column(name="estado")
		private int estado;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getCodigo() {
			return codigo;
		}

		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getDescripcion() {
			return descripcion;
		}

		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}

		public String getBaseGravable() {
			return baseGravable;
		}

		public void setBaseGravable(String baseGravable) {
			this.baseGravable = baseGravable;
		}

		public int getPorcentaje() {
			return porcentaje;
		}

		public void setPorcentaje(int porcentaje) {
			this.porcentaje = porcentaje;
		}

		public String getFechaInicial() {
			return fechaInicial;
		}

		public void setFechaInicial(String fechaInicial) {
			this.fechaInicial = fechaInicial;
		}

		public String getFechaFinal() {
			return fechaFinal;
		}

		public void setFechaFinal(String fechaFinal) {
			this.fechaFinal = fechaFinal;
		}

		public int getEstado() {
			return estado;
		}

		public void setEstado(int estado) {
			this.estado = estado;
		}
		
		
		
		
		

}
