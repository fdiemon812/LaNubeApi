package com.example.demo.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Clase Alumno
 * @author estudiante
 *
 */
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
public class Alumno {

	private String nombre="";
	
	private String apellidos="";
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	private String dni="";
	private String direccion="";
	private LocalDate fechaNacimiento=LocalDate.now();
	private String horaEntrada="00:00";
	private String horaSalida="00:00";
	private String comida="";
	private boolean comeEnCentro=false;
	private String observaciones="";
	
//	@JsonIgnore
	@ManyToOne
	private Aula aula;
	
	@JsonIgnore
	@ManyToMany
	private List<Tutor> tutores;
	
	@JsonIgnore
	@OneToMany
	private List<EstadoAlumno> estados;
	
	/**
	 * Constructor Alumno con parametro ID
	 * @param id
	 */
	public Alumno(int id) {
		this.id=id;
	}
	
	
	/** 
	 * Constructor Alumno con todos los parametros
	 * @param nombre
	 * @param apellidos
	 * @param dni
	 * @param direccion
	 * @param fechaNacimiento
	 * @param horaEntrada
	 * @param horaSalida
	 * @param comida
	 * @param comeEnCentro
	 * @param observaciones
	 * @param aula
	 */
	public Alumno(String nombre, String apellidos, String dni, String direccion, LocalDate fechaNacimiento,
			String horaEntrada, String horaSalida, String comida, boolean comeEnCentro,
			String observaciones, Aula aula) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.direccion = direccion;
		this.fechaNacimiento = fechaNacimiento;
		this.horaEntrada = horaEntrada;
		this.horaSalida = horaSalida;
		this.comida = comida;
		this.comeEnCentro = comeEnCentro;
		this.observaciones = observaciones;
		this.aula = aula;
		this.tutores=new ArrayList<Tutor>();
		this.estados=new ArrayList<EstadoAlumno>();

	}
	
	




	/**
	 * Cosntructor Alumno
	 * @param nombre
	 * @param apellidos
	 * @param dni
	 */
	public Alumno(String nombre, String apellidos, String dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.tutores=new ArrayList<Tutor>();
		this.estados=new ArrayList<EstadoAlumno>();
	}






	/**
	 * Constructor Alumno
	 */
	public Alumno() {
		this.tutores=new ArrayList<Tutor>();
		this.estados=new ArrayList<EstadoAlumno>();
	}

	

	
	
	public String getNombre() {
		return nombre;
	}





	public void setNombre(String nombre) {
		this.nombre = nombre;
	}





	public String getApellidos() {
		return apellidos;
	}





	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}





	public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}





	public String getDni() {
		return dni;
	}





	public void setDni(String dni) {
		this.dni = dni;
	}





	public String getDireccion() {
		return direccion;
	}





	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}





	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}





	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}





	public String getHoraEntrada() {
		return horaEntrada;
	}





	public void setHoraEntrada(String horaEntrada) {
		this.horaEntrada = horaEntrada;
	}





	public String getHoraSalida() {
		return horaSalida;
	}





	public void setHoraSalida(String horaSalida) {
		this.horaSalida = horaSalida;
	}





	public String getComida() {
		return comida;
	}





	public void setComida(String comida) {
		this.comida = comida;
	}





	public boolean isComeEnCentro() {
		return comeEnCentro;
	}





	public void setComeEnCentro(boolean comeEnCentro) {
		this.comeEnCentro = comeEnCentro;
	}





	public String getObservaciones() {
		return observaciones;
	}





	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}





	public Aula getAula() {
		return aula;
	}





	public void setAula(Aula aula) {
		this.aula = aula;
	}





	public List<Tutor> getTutores() {
		return tutores;
	}





	public void setTutores(List<Tutor> tutores) {
		this.tutores = tutores;
	}





	public List<EstadoAlumno> getEstados() {
		return estados;
	}





	public void setEstados(List<EstadoAlumno> estados) {
		this.estados = estados;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return id == other.id;
	}





	
	
	
	
}
