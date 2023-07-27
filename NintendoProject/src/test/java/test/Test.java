package test;

import model.Jeu;

import java.time.LocalDate;

import model.Adresse;
import model.Boutique;
import model.Client;
import model.Console;

public class Test {

	public static void main(String[] args) {
		
		Adresse a1 = new Adresse(2, "rue Charles de Gaulle", "Rennes");
		Adresse a2 = new Adresse(16, "rue Charles de Gaulle", "Rennes");

		
		Boutique b1 = new Boutique("Super U",a1);
		Client cl1 = new Client("John", "Doe");
		Client cl2 = new Client("Jane", "Doe");
		
		
		Console co1 = new Console ("Switch",300,LocalDate.of(2015, 12, 31));
		Console co2 = new Console ("XBox",400,LocalDate.of(2015, 12, 31));
		Jeu j1 = new Jeu ("Zelda", co1 );
		Jeu j2 = new Jeu ("The_Witcher", co1);
		Jeu j3 = new Jeu ("Animal_crossing", co1);
		Jeu j4 = new Jeu ("Fortnite", co2);
		Jeu j5 = new Jeu ("Halo", co2);

	}

}
