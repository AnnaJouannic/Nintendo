package test;

import model.Jeu;
import model.Adresse;
import model.Boutique;
import model.Client;
import model.Console;

public class Test {

	public static void main(String[] args) {
		
		Adresse a1 = new Adresse(2, "rue Charles de Gaulle", "Rennes");
		Adresse a2 = new Adresse(16, "rue Charles de Gaulle", "Rennes");

		
		Boutique b1 = new Boutique("Super U",a1);
		Client c1 = new Client("John", "Doe");
		Client c2 = new Client("Jane", "Doe");
		
		

		
		Console c1 = new Console ("Switch");
		Console c2 = new Console ("XBox");
		Jeu j1 = new Jeu ("Zelda", c1 );
		Jeu j2 = new Jeu ("The_Witcher", c1);
		Jeu j3 = new Jeu ("Animal_crossing", c1);
		Jeu j4 = new Jeu ("Fortnite", c2);
		Jeu j5 = new Jeu ("Halo", c2);

	}

}
