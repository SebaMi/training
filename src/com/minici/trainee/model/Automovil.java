package com.minici.trainee.model;

public class Automovil extends Vehiculo{

	private int puertas;
	
	public Automovil(String modelo, String marca, double precio, int puertas) {
		super(modelo, marca, precio);
		this.puertas = puertas;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	@Override
	public String toString() {
		return String.format("Marca: %s // Modelo: %s // Puertas: %d // Precio: $%,.2f", super.getMarca(), super.getModelo(), puertas, super.getPrecio());
	}

}
