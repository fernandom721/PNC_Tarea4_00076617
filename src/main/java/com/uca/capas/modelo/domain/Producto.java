package com.uca.capas.modelo.domain;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Producto {
	
	@Size(min=12, max=12, message = "El producto debe de tener los 12 digitos de su codigo")
	String codigo;

	@Size(min=1, max=100 , message = "El nombre del Producto debe de tener entre 1 y 100 caracteres")
	String nombre;

	@Size(min=1, max=200 , message = "La marca del Producto debe de tener entre 1 y 100 caracteres")
	String marca;

	@Size(min=1, max=500 , message = "La descripcion del Producto debe de tener entre 1 y 100 caracteres")
	String descripcion;

	@NotEmpty(message = "Debe ingresar la cantidad del producto en existencia")
	int cantidad;

	@NotEmpty(message = "Ingresa una fecha para el producto")
	String fecha;


	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


}
