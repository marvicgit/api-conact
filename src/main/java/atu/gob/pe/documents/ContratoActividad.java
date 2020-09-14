package atu.gob.pe.documents;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "ContratoActividad")
public class ContratoActividad {

	@Id
	private String id;
	@DBRef
	private Contrato contrato;
	private LocalDateTime ingreso;
	private LocalDateTime salida;
	private List<Actividad> actividades;
	private LocalDateTime fechaAprobacion;
	private String usuAprobacion;
	private String usureg;
	private LocalDateTime fecreg = LocalDateTime.now();
	private String usumod;
	private LocalDateTime fecmod;
	private Integer estreg;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Contrato getContrato() {
		return contrato;
	}
	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
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
	public List<Actividad> getActividades() {
		return actividades;
	}
	public void setActividades(List<Actividad> actividades) {
		this.actividades = actividades;
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
