package model;

public class Achat {

	private Jeu Jeu;
	private String date;
	private double prix;
	
	
	
	protected Achat(model.Jeu jeu, String date, double prix) {
		Jeu = jeu;
		this.date = date;
		this.prix = prix;
	}


	public Jeu getJeu() {
		return Jeu;
	}


	public void setJeu(Jeu jeu) {
		Jeu = jeu;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public double getPrix() {
		return prix;
	}


	public void setPrix(double prix) {
		this.prix = prix;
	}


	@Override
	public String toString() {
		return "Achat [Jeu=" + Jeu + ", date=" + date + ", prix=" + prix + "]";
	}
}
