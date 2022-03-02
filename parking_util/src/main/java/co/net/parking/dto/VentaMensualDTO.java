package co.net.parking.dto;

public class VentaMensualDTO {
	
	private TransaccionMensualDTO transaccionMensual;
	private TerceroDTO terceroMensual;
	private NegocioDTO negocioMensual;
	private MensualDTO mensual;
	private MensualControlDTO mensualControl;
	

	public TransaccionMensualDTO getTransaccionMensual() {
		return transaccionMensual;
	}
	public void setTransaccionMensual(TransaccionMensualDTO transaccionMensual) {
		this.transaccionMensual = transaccionMensual;
	}

	public NegocioDTO getNegocioMensual() {
		return negocioMensual;
	}
	public void setNegocioMensual(NegocioDTO negocioMensual) {
		this.negocioMensual = negocioMensual;
	}
	public TerceroDTO getTerceroMensual() {
		return terceroMensual;
	}
	public void setTerceroMensual(TerceroDTO terceroMensual) {
		this.terceroMensual = terceroMensual;
	}
	public MensualDTO getMensual() {
		return mensual;
	}
	public void setMensual(MensualDTO mensual) {
		this.mensual = mensual;
	}
	public MensualControlDTO getMensualControl() {
		return mensualControl;
	}
	public void setMensualControl(MensualControlDTO mensualControl) {
		this.mensualControl = mensualControl;
	}	
	

}
