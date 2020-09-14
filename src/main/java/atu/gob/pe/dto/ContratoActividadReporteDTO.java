package atu.gob.pe.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ContratoActividadReporteDTO {

	private Integer idTrabajadorActividad;
	private Integer idTrabajador;
	private Integer tipoDocumento;
	private String numeroDocumento;
	private String apellidosNombres;
	private String regimenLaboral;
	private String cargo;
	private String direccionOficina;
	private String subdireccionUnidad;
	private LocalDateTime ingreso;
	private LocalDateTime salida;
	private Integer idActividad;
	private Integer formaTrabajo;
	private String descripcionActividad;
	private String producto;
	private String productoEntregado;
	private String comentario;
	private LocalDate fecha;
	private LocalDateTime fechaAprobacion;
	private String usuAprobacion;
	private Integer estreg;
	private boolean select;

public ContratoActividadReporteDTO() {}
	
	public ContratoActividadReporteDTO(Integer idTrabajadorActividad, Integer idTrabajador, Integer idActividad, Integer tipoDocumento, String numeroDocumento, String apellidosNombres, 
										 String regimenLaboral, String cargo, String direccionOficina,String subdireccionUnidad, LocalDateTime ingreso, LocalDateTime salida, 
										 Integer formaTrabajo, String descripcionActividad, String producto, String productoEntregado, String comentario, LocalDate fecha, 
										 LocalDateTime fechaAprobacion, String usuAprobacion, Integer estreg) {
		this.idTrabajadorActividad = idTrabajadorActividad;
		this.idTrabajador = idTrabajador;
		this.idActividad = idActividad;
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
		this.apellidosNombres = apellidosNombres;
		this.regimenLaboral = regimenLaboral;
		this.cargo = cargo;
		this.direccionOficina = direccionOficina;
		this.subdireccionUnidad = subdireccionUnidad;
		this.ingreso = ingreso;
		this.salida = salida;
		this.formaTrabajo = formaTrabajo;
		this.descripcionActividad = descripcionActividad;
		this.producto = producto;
		this.productoEntregado = productoEntregado;
		this.comentario = comentario;
		this.fecha = fecha;
		this.fechaAprobacion = fechaAprobacion;
		this.usuAprobacion = usuAprobacion;
		this.estreg = estreg;
	}

	public Integer getIdTrabajadorActividad() {
		return idTrabajadorActividad;
	}

	public void setIdTrabajadorActividad(Integer idTrabajadorActividad) {
		this.idTrabajadorActividad = idTrabajadorActividad;
	}

	public Integer getIdTrabajador() {
		return idTrabajador;
	}

	public void setIdTrabajador(Integer idTrabajador) {
		this.idTrabajador = idTrabajador;
	}

	public Integer getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(Integer tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getApellidosNombres() {
		return apellidosNombres;
	}

	public void setApellidosNombres(String apellidosNombres) {
		this.apellidosNombres = apellidosNombres;
	}

	public String getRegimenLaboral() {
		return regimenLaboral;
	}

	public void setRegimenLaboral(String regimenLaboral) {
		this.regimenLaboral = regimenLaboral;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getDireccionOficina() {
		return direccionOficina;
	}

	public void setDireccionOficina(String direccionOficina) {
		this.direccionOficina = direccionOficina;
	}

	public String getSubdireccionUnidad() {
		return subdireccionUnidad;
	}

	public void setSubdireccionUnidad(String subdireccionUnidad) {
		this.subdireccionUnidad = subdireccionUnidad;
	}

	public LocalDateTime getIngreso() {
		return ingreso;
	}

	public void setIngreso(LocalDateTime ingreso) {
		this.ingreso = ingreso;
	}

	public LocalDateTime getSalida() {
		return salida;
	}

	public void setSalida(LocalDateTime salida) {
		this.salida = salida;
	}

	public Integer getIdActividad() {
		return idActividad;
	}

	public void setIdActividad(Integer idActividad) {
		this.idActividad = idActividad;
	}

	public Integer getFormaTrabajo() {
		return formaTrabajo;
	}

	public void setFormaTrabajo(Integer formaTrabajo) {
		this.formaTrabajo = formaTrabajo;
	}

	public String getDescripcionActividad() {
		return descripcionActividad;
	}

	public void setDescripcionActividad(String descripcionActividad) {
		this.descripcionActividad = descripcionActividad;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public String getProductoEntregado() {
		return productoEntregado;
	}

	public void setProductoEntregado(String productoEntregado) {
		this.productoEntregado = productoEntregado;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalDateTime getFechaAprobacion() {
		return fechaAprobacion;
	}

	public void setFechaAprobacion(LocalDateTime fechaAprobacion) {
		this.fechaAprobacion = fechaAprobacion;
	}

	public String getUsuAprobacion() {
		return usuAprobacion;
	}

	public void setUsuAprobacion(String usuAprobacion) {
		this.usuAprobacion = usuAprobacion;
	}

	public Integer getEstreg() {
		return estreg;
	}

	public void setEstreg(Integer estreg) {
		this.estreg = estreg;
	}

	public boolean isSelect() {
		return select;
	}

	public void setSelect(boolean select) {
		this.select = select;
	}
	
	

}
