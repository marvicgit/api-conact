package atu.gob.pe.documents;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection= "SubdireccionUnidad")
public class SubdireccionUnidad {

	@Id
	private String id;
	
	@DBRef
	private DireccionOficina direccionOficina;
	private String nombre;
	private String descripcion;
	private String usureg;
	private LocalDateTime fecreg;
	private String usumod;
	private LocalDateTime fecmod;
	private Integer estreg;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public DireccionOficina getDireccionOficina() {
		return direccionOficina;
	}
	public void setDireccionOficina(DireccionOficina direccionOficina) {
		this.direccionOficina = direccionOficina;
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
