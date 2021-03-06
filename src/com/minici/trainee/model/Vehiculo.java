package com.minici.trainee.model;

public abstract class Vehiculo {
	private String modelo;
	private String marca;
	private double precio;
	
	public Vehiculo(String marca, String modelo, double precio) {
		this.modelo = modelo;
		this.marca = marca;
		this.precio = precio;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
