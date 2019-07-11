package com.mitocode.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

@Entity
@Table(name = "signos")
public class Signos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idSignos;

	@Column(name = "temperatura", nullable = false, length = 50)
	private String temperatura;
	
	@Column(name = "pulso", nullable = false, length = 50)
	private String pulso;
	
	@Column(name = "ritmo", nullable = false, length = 50)
	private String ritmo;
	
	@JsonSerialize(using = ToStringSerializer.class) // ISODate 2019-04-22T05:00:00
	private LocalDateTime fecha;
	
	@ManyToOne
	@JoinColumn(name = "id_paciente", nullable = false, foreignKey = @ForeignKey(name = "fk_signos_paciente"))
	private Paciente paciente;

	public Integer getIdSignos() {
		return idSignos;
	}

	public void setIdSignos(Integer idSignos) {
		this.idSignos = idSignos;
	}

	public String getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}

	public String getPulso() {
		return pulso;
	}

	public void setPulso(String pulso) {
		this.pulso = pulso;
	}

	public String getRitmo() {
		return ritmo;
	}

	public void setRitmo(String ritmo) {
		this.ritmo = ritmo;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
		
}
