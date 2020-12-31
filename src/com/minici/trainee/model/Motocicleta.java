package com.minici.trainee.model;

public class Motocicleta extends Vehiculo {

	private int cilindrada;
	
	public Motocicleta(String modelo, String marca, double precio, int cilindrada) {
		super(modelo, marca, precio);
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return String.format("Marca: %s // Modelo: %s // Cilindrada: %d // Precio: $%,.2f", super.getMarca(), super.getModelo(), cilindrada, super.getPrecio());
	}
}
