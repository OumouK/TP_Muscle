package laFac;

public abstract class OffreCo {
	private double taux;
	private ArrayList <Produits> pdtConcerne; //liste de produits beneficiant d'une offre co
	
    public double getTaux() {
		return taux;
	}


	public void setTaux(double taux) {
		this.taux = taux;
	}

	public OffreCo() {
		taux=0.d;
    }
	
	public OffreCo(double t) {
		taux=t;
    }
	
	void recalculePrix(Produit p) {
		p.setPrix(p.getPrix()*taux);
	}
	
	
}
