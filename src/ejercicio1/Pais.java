package ejercicio1;

import java.util.Date;

public class Pais {
	private String nombre;
	private Integer habitantes;
	private Integer metrosCuadrados;
	private Date fechaIndependiencia;
	/**
	 * @param nombre
	 * @param habitantes
	 * @param metrosCuadrados
	 * @param fechaIndependiencia
	 */
	public Pais(String nombre, Integer habitantes, Integer metrosCuadrados, Date fechaIndependiencia) {
		this.nombre = nombre;
		this.habitantes = habitantes;
		this.metrosCuadrados = metrosCuadrados;
		this.fechaIndependiencia = fechaIndependiencia;
	}
	/**
	 * 
	 */
	public Pais() {
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the habitantes
	 */
	public Integer getHabitantes() {
		return habitantes;
	}
	/**
	 * @param habitantes the habitantes to set
	 */
	public void setHabitantes(Integer habitantes) {
		this.habitantes = habitantes;
	}
	/**
	 * @return the metrosCuadrados
	 */
	public Integer getMetrosCuadrados() {
		return metrosCuadrados;
	}
	/**
	 * @param metrosCuadrados the metrosCuadrados to set
	 */
	public void setMetrosCuadrados(Integer metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}
	/**
	 * @return the fechaIndependiencia
	 */
	public Date getFechaIndependiencia() {
		return fechaIndependiencia;
	}
	/**
	 * @param fechaIndependiencia the fechaIndependiencia to set
	 */
	public void setFechaIndependiencia(Date fechaIndependiencia) {
		this.fechaIndependiencia = fechaIndependiencia;
	}
	
	public String impresion(){
		return "nombre :"+this.nombre+"habitante"+this.habitantes;
	}
	

}
