package com.ar.maraton2022.domain;

import java.sql.Date;

public class Corredor {
	
	private int id;
	private String nombre;
	private String apellido;
	private String dni;
	private String carrera;
	private Date fechaAlta;
	
	
	public Corredor(int id, String nombre, String apellido, String dni, String carrera, Date fechaAlta) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.carrera = carrera;
		this.fechaAlta = fechaAlta;

	}
	
	public Corredor() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	@Override
	public String toString() {
		return "Corredor [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", carrera="
				+ carrera + ", fechaAlta=" + fechaAlta + "]";
	}

	

}
