package test;

import model.Jeu;
import model.Console;

public class Test {

	public static void main(String[] args) {
		
		Console c1 = new Console ("Switch");
		Console c2 = new Console ("XBox");
		Jeu j1 = new Jeu ("Zelda", c1 );
		Jeu j2 = new Jeu ("The_Witcher", c1);
		Jeu j3 = new Jeu ("Animal_crossing", c1);
		Jeu j4 = new Jeu ("Fortnite", c2);
		Jeu j5 = new Jeu ("Halo", c2);

	}

}
