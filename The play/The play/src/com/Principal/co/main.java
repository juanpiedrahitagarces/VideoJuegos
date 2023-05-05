package com.Principal.co;

import com.Plataforma.co.baseDePeliculas;
import com.Plataforma.co.peliculas;

public class main {

	public static void main(String[] args) {

		baseDePeliculas baseDepeli = new baseDePeliculas("THE PLAY ", "JUEGOSONLINE", 2019);

		peliculas Gta5 = new peliculas("San andreas", 25000, 8);
		peliculas GearsOfWar = new peliculas(" GearsOfWar", 15000, 2);
		peliculas Fifa2019 = new peliculas("FIFA2019", 45000, 9);
		peliculas MafiaII = new peliculas("mafia", 5000, 5);

		baseDePeliculas.agregarPelicula(Gta5);
		baseDePeliculas.agregarPelicula(GearsOfWar);
		baseDePeliculas.agregarPelicula(Fifa2019);
		baseDePeliculas.agregarPelicula(MafiaII);

		System.out.println("LAS PELICULAS DISPONIBLES SON  " + baseDepeli.getNombre() + " son: ");
		for (int i = 0; i < baseDepeli.getPeliculass().size(); i++) {
			System.out.println(" " + baseDepeli.getPeliculass().get(i).getNombre());
		}

	}

}
