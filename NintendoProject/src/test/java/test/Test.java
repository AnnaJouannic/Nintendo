package test;

import java.time.LocalDate;
import java.util.Collections;

import model.Achat;
import model.Adresse;
import model.Boutique;
import model.Client;
import model.Hybride;
import model.Jeu;
import model.Salon;

import java.util.Collections;

import model.Achat;

public class Test {

	public static void main(String[] args) {
		Hybride co1 = new Hybride ("Switch",300,LocalDate.of(2015, 12, 31));
		Salon co2 = new Salon ("XBox",400,LocalDate.of(2015, 12, 31));
	
		Adresse a1 = new Adresse(2, "rue Charles de Gaulle", "Rennes");
		Adresse a2 = new Adresse(16, "rue Charles de Gaulle", "Rennes");

		Boutique b1 = new Boutique("Super U",a1);
		Jeu j1 = new Jeu ("Zelda", co1, b1);
		Jeu j2 = new Jeu ("The_Witcher", co1, b1);
		Jeu j3 = new Jeu ("Animal_crossing", co1, b1);
		Jeu j4 = new Jeu ("Fortnite", co2, b1);
		Jeu j5 = new Jeu ("Halo", co2, b1);
		
		Achat ac1 = new Achat (j1, "2023-07-27", 10.50 );
		Client cl1 = new Client("John", "Doe");
		Client cl2 = new Client("Jane", "Doe");
		
		Collections.addAll(cl1.getAchats(), ac1);
		
		


		
		

	
		
		
		
		
	
		
		


	}

}
