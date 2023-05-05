package com.Plataforma.co;

import java.util.ArrayList;

public class baseDePeliculas {

	private String nombre;
	private String marca;
	private int Actualizacion;
	private peliculas pelicula;
	private ArrayList<peliculas> peliculass;
	private ArrayList<peliculas> Base = new ArrayList<>();

	public baseDePeliculas(String nombre, String marca, int Actualizacion) {
		this.nombre = nombre;
		this.marca = marca;
		this.Actualizacion = Actualizacion;
		this.peliculass = new ArrayList<>();

	}
	//AGREGAR PELICULA

	public static void agregarPelicula(peliculas pelicula) {
		//this.pelicula = pelicula;
		//Base.add(this.pelicula);
	}
	
	//ALQUILAR PELICULA //FALTA SACAR DEL PRECIO

	public void sacarPelicula(peliculas pelicula) {
		if (Base.indexOf(pelicula) != -1) {
			int NombreDePelicula = Base.indexOf(pelicula);
			if (Base.get(NombreDePelicula).getCantidad() > 0) {
				int z = Base.get(NombreDePelicula).getCantidad() - 1;
				Base.get(NombreDePelicula).setCantidad(z);
				System.out.println("Quedaron " + Base.get(NombreDePelicula).getCantidad() + " "
						+ Base.get(NombreDePelicula).getNombre());

			} else {
				System.out.println("No hay suficientes productos de " + Base.get(NombreDePelicula).getNombre());
			}
		} else {
			System.out.println("El producto " + pelicula + " no existe.");
		}

	}
	//CONSULTAR LA CANTIDAD DE PELICULA

	public void consultarCantidadDePeliculas(peliculas pelicula) {

		if (Base.indexOf(pelicula) != -1) {
			int NombreDePelicula = Base.indexOf(pelicula);
			System.out.println(
					"Hay " + Base.get(NombreDePelicula).getCantidad() + " " + Base.get(NombreDePelicula).getNombre());
		} else {
			System.out.println("El producto " + pelicula + " no existe.");
		}

	}
	
	//CONSULTAR PELICULAS AGOTADAS

	public void consultarPeliculasAgotados() {
		for (int i = 0; i < Base.size(); i++) {
			if (Base.get(i).getCantidad() == 0) {
				System.out.println("El producto " + Base.get(i).getNombre() + " está agotado.");
			}

		}

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

	public int getActualizacion() {
		return Actualizacion;
	}

	public void setActualizacion(int actualizacion) {
		Actualizacion = actualizacion;
	}

	public peliculas getPelicula() {
		return pelicula;
	}

	public void setPelicula(peliculas pelicula) {
		this.pelicula = pelicula;
	}

	public ArrayList<peliculas> getPeliculass() {
		return peliculass;
	}

	public void setPeliculass(ArrayList<peliculas> peliculass) {
		this.peliculass = peliculass;
	}

	public ArrayList<peliculas> getBase() {
		return Base;
	}

	public void setBase(ArrayList<peliculas> base) {
		Base = base;
	}

}
