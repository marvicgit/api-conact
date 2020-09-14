package atu.gob.pe.documents;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "Trabajador")
public class Trabajador {

	@Id
	private String id;
	private Integer tipoDocumento;
	private String numeroDocumento;
	private String nombres;
	private String apellidoPaterno;
	private String apellidoMaterno;
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
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
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
		return "Trabajador [id=" + id + ", tipoDocumento=" + tipoDocumento + ", numeroDocumento=" + numeroDocumento
				+ ", nombres=" + nombres + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno="
				+ apellidoMaterno + ", usureg=" + usureg + ", fecreg=" + fecreg + ", usumod=" + usumod + ", fecmod="
				+ fecmod + ", estreg=" + estreg + "]";
	}
	
}
