package atu.gob.pe.documents;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Actividad")
public class Actividad {

	@Id
	private String id;
	private Integer formaTrabajo;
	private String descripcionActividad;
	private String producto;
	private String productoEntregado;
	private String comentario;
	private LocalDate fecha;
	private LocalDateTime fechaAprobacion;
	private String usuAprobacion;
	private String usureg;
	private LocalDateTime fecreg = LocalDateTime.now();
	private String usumod;
	private LocalDateTime fecmod;
	private Integer estreg;
	
	public Actividad() {
		
	}
	
	public Actividad(String id, Integer formaTrabajo, String descripcionActividad, String producto,
			String productoEntregado, String comentario, LocalDate fecha, LocalDateTime fechaAprobacion,
			String usuAprobacion, String usureg) {
		super();
		this.id = id;
		this.formaTrabajo = formaTrabajo;
		this.descripcionActividad = descripcionActividad;
		this.producto = producto;
		this.productoEntregado = productoEntregado;
		this.comentario = comentario;
		this.fecha = fecha;
		this.fechaAprobacion = fechaAprobacion;
		this.usuAprobacion = usuAprobacion;
		this.usureg = usureg;
		this.fecreg = LocalDateTime.now();
		this.estreg = 1;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getUsureg() {
		return usureg;
	}
	public void setUsureg(String usureg) {
		this.usureg = usureg;
	}
	public LocalDateTime getFecreg() {
		return fecreg;
	}
	public void setFecreg(LocalDateTime fecreg) {
		this.fecreg = fecreg;
	}
	public String getUsumod() {
		return usumod;
	}
	public void setUsumod(String usumod) {
		this.usumod = usumod;
	}
	public LocalDateTime getFecmod() {
		return fecmod;
	}
	public void setFecmod(LocalDateTime fecmod) {
		this.fecmod = fecmod;
	}
	public Integer getEstreg() {
		return estreg;
	}
	public void setEstreg(Integer estreg) {
		this.estreg = estreg;
	}
}
