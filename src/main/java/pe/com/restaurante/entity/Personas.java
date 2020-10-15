package pe.com.restaurante.entity;

public class Personas {
 private int personas;
 private String nombres;
 private String correo;
 private String telefono;
 
 public Personas() {
	 
 }

 public Personas(int personas, String nombres, String correo, String telefono) {
	super();
	this.personas = personas;
	this.nombres = nombres;
	this.correo = correo;
	this.telefono = telefono;
 }

public int getPersonas() {
	return personas;
}

public void setPersonas(int personas) {
	this.personas = personas;
}

public String getNombres() {
	return nombres;
}

public void setNombres(String nombres) {
	this.nombres = nombres;
}

public String getCorreo() {
	return correo;
}

public void setCorreo(String correo) {
	this.correo = correo;
}

public String getTelefono() {
	return telefono;
}

public void setTelefono(String telefono) {
	this.telefono = telefono;
}
 
 
 
}
