package com.minici.trainee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

import com.minici.trainee.model.Automovil;
import com.minici.trainee.model.Motocicleta;
import com.minici.trainee.model.Vehiculo;

public class Trainee {

	public static void main(String[] args) {
		
		String letra = "H";
		
		List<Vehiculo> vehiculos = new ArrayList<>();
		vehiculos = cargarLista();
		vehiculos.forEach(System.out::println);
	
		System.out.println("================");
	
		Vehiculo vehiculoMasCaro = obtenerMasCaro(vehiculos);
		System.out.println(String.format("Vehiculo mas caro: %s %s",  vehiculoMasCaro.getMarca(), vehiculoMasCaro.getModelo()));
		
		Vehiculo vehiculoMasBarato = obtenerMasBarato(vehiculos);
		System.out.println(String.format("Vehiculo mas barato: %s %s", vehiculoMasBarato.getMarca(),vehiculoMasBarato.getModelo()));
		
		vehiculos.stream()
			.filter(vehiculo -> vehiculo.getMarca().startsWith(letra))
			.forEach(vehiculo -> System.out.println(String.format("Vehiculo que contiene en el modelo la letra '%s': %s %s $%,.2f ", 
					letra, vehiculo.getMarca(), vehiculo.getModelo(), vehiculo.getPrecio())));
	
		
		System.out.println("================");
		System.out.println("Vehiculos ordenados por precio de mayor a menor:");
		vehiculos.sort(Comparator.comparing(Vehiculo::getPrecio).reversed());
		vehiculos.forEach(vehiculo -> System.out.println(vehiculo.getMarca()+ " " + vehiculo.getModelo()));
	}


	private static Vehiculo obtenerMasCaro(List<Vehiculo> vehiculos) {
		return Collections.max(vehiculos, Comparator.comparing(Vehiculo::getPrecio));
	}


	private static Vehiculo obtenerMasBarato(List<Vehiculo> vehiculos) {
		return Collections.min(vehiculos, Comparator.comparing(Vehiculo::getPrecio));
	}

	
	private static List<Vehiculo> cargarLista() {
		
		List<Vehiculo> vehiculos = new ArrayList<>();
		vehiculos.add(new Automovil("Peugeot", "206", 200000, 4));
		vehiculos.add(new Motocicleta("Honda", "Titan", 60000,  125));
		vehiculos.add(new Automovil("Peugeot", "208", 250000, 5));
		vehiculos.add(new Motocicleta("Yamaha", "YBR", 80500.50, 160));
		return vehiculos;
	
	}
	
	

}
