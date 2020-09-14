package atu.gob.pe.documents;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import atu.gob.pe.annotation.CascadeSave;

@Document(collection= "Contrato")
public class Contrato {

	@Id
	private String id;
	
	@DBRef
	@CascadeSave
	private Trabajador trabajador;
	private Integer idRegimenLaboral;
	private String ruc;
	private String razonSocial;
	
	@DBRef
	@CascadeSave
	private DireccionOficina direccionOficina;
	
	@DBRef
	@CascadeSave
	private SubdireccionUnidad subdireccionUnidad;
	private String cargo;
	private LocalDate fechaIni;
	private LocalDate fechaFin;
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
	public Trabajador getTrabajador() {
		return trabajador;
	}
	public void setTrabajador(Trabajador trabajador) {
		this.trabajador = trabajador;
	}
	public Integer getIdRegimenLaboral() {
		return idRegimenLaboral;
	}
	public void setIdRegimenLaboral(Integer idRegimenLaboral) {
		this.idRegimenLaboral = idRegimenLaboral;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public DireccionOficina getDireccionOficina() {
		return direccionOficina;
	}
	public void setDireccionOficina(DireccionOficina direccionOficina) {
		this.direccionOficina = direccionOficina;
	}
	public SubdireccionUnidad getSubdireccionUnidad() {
		return subdireccionUnidad;
	}
	public void setSubdireccionUnidad(SubdireccionUnidad subdireccionUnidad) {
		this.subdireccionUnidad = subdireccionUnidad;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public LocalDate getFechaIni() {
		return fechaIni;
	}
	public void setFechaIni(LocalDate fechaIni) {
		this.fechaIni = fechaIni;
	}
	public LocalDate getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
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
	@Override
	public String toString() {
		return "Contrato [id=" + id + ", trabajador=" + trabajador + ", idRegimenLaboral=" + idRegimenLaboral + ", ruc="
				+ ruc + ", razonSocial=" + razonSocial + ", direccionOficina=" + direccionOficina
				+ ", subdireccionUnidad=" + subdireccionUnidad + ", cargo=" + cargo + ", fechaIni=" + fechaIni
				+ ", fechaFin=" + fechaFin + ", usureg=" + usureg + ", fecreg=" + fecreg + ", usumod=" + usumod
				+ ", fecmod=" + fecmod + ", estreg=" + estreg + "]";
	}
	
}
