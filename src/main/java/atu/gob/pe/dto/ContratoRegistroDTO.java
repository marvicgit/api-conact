package atu.gob.pe.dto;

import java.time.LocalDateTime;
import java.util.Date;

import javax.validation.constraints.NotEmpty;


public class ContratoRegistroDTO {

	private String id;
	
	@NotEmpty(message="El id de trabajador es obligatorio")
	private String idTrabajador;
	
	@NotEmpty(message="El tipo de documento es obligatorio")
	private String tipoDocumento;
	
	@NotEmpty(message="El número de documento es obligatorio")
	private String numeroDocumento;
	private String apellidosNombres;
	
	private String apellidoPaterno;
	private String apellidoMaterno;
	
	@NotEmpty(message="Los nombres son obligatorio")
	private String nombres;
	
	private String ruc;
	private String razonSocial;
	
	@NotEmpty(message="El régimen laboral es obligatorio")
	private String idRegimenLaboral;
	
	private String regimenLaboral;
	
	@NotEmpty(message="El cargo es obligatorio")
	private String cargo;
	
	@NotEmpty(message="El órgano institucional es obligatorio")
	private String idDireccionOficina;
	private String direccionOficina;
	private String idSubdireccionUnidad;
	private String subdireccionUnidad;

	private Date fechaIni;
	private Date fechaFin;
	
	@NotEmpty(message="El usuario registro es obligatorio")
	private String usureg;
	private LocalDateTime fecreg;
	private String usumod;
	private LocalDateTime fecmod;
	
	@NotEmpty(message="El estado es obligatorio")
	private String estreg;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIdTrabajador() {
		return idTrabajador;
	}

	public void setIdTrabajador(String idTrabajador) {
		this.idTrabajador = idTrabajador;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
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

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
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

	public String getIdRegimenLaboral() {
		return idRegimenLaboral;
	}

	public void setIdRegimenLaboral(String idRegimenLaboral) {
		this.idRegimenLaboral = idRegimenLaboral;
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

	public String getIdDireccionOficina() {
		return idDireccionOficina;
	}

	public void setIdDireccionOficina(String idDireccionOficina) {
		this.idDireccionOficina = idDireccionOficina;
	}

	public String getDireccionOficina() {
		return direccionOficina;
	}

	public void setDireccionOficina(String direccionOficina) {
		this.direccionOficina = direccionOficina;
	}

	public String getIdSubdireccionUnidad() {
		return idSubdireccionUnidad;
	}

	public void setIdSubdireccionUnidad(String idSubdireccionUnidad) {
		this.idSubdireccionUnidad = idSubdireccionUnidad;
	}

	public String getSubdireccionUnidad() {
		return subdireccionUnidad;
	}

	public void setSubdireccionUnidad(String subdireccionUnidad) {
		this.subdireccionUnidad = subdireccionUnidad;
	}

	public Date getFechaIni() {
		return fechaIni;
	}

	public void setFechaIni(Date fechaIni) {
		this.fechaIni = fechaIni;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
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

	public String getEstreg() {
		return estreg;
	}

	public void setEstreg(String estreg) {
		this.estreg = estreg;
	}
}
