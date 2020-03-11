package cec.edu.negocio;

public class Servicio {
	private String numeroServicio;
	private float valorCancelar;
	private String identificacionPropietario;
	private boolean indicadorServicio;   // True es pagado, Falso es no pagado
	
	public Servicio(String numeroServicio, float valorCancelar, String identificacionPropietario, boolean indicadorPagado){
		this.identificacionPropietario=identificacionPropietario;
		this.indicadorServicio=indicadorPagado;
		this.valorCancelar=valorCancelar;
		this.numeroServicio=numeroServicio;
	}
	
	public String getNumeroServicio() {
		return numeroServicio;
	}
	public void setNumeroServicio(String numeroServicio) {
		this.numeroServicio = numeroServicio;
	}
	public float getValorCancelar() {
		return valorCancelar;
	}
	public void setValorCancelar(float valorCancelar) {
		this.valorCancelar = valorCancelar;
	}
	public String getIdentificacionPropietario() {
		return identificacionPropietario;
	}
	public void setIdentificacionPropietario(String identificacionPropietario) {
		this.identificacionPropietario = identificacionPropietario;
	}
	public boolean isIndicadorPagado() {
		return indicadorServicio;
	}
	public void setIndicadorPagado(boolean indicadorPagado) {
		this.indicadorServicio = indicadorPagado;
	}
	
	
	
	
}
