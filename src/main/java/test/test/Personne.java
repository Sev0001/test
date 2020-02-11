package test.test;

public class Personne implements PersonneSupplier{
	
	public String nom;
	public String prenom;
	public Integer anneeNaissance;
	
	public Personne() {}
	
	
	public Personne(String nom, String prenom, Integer anneeNaissance) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.anneeNaissance = anneeNaissance;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + "]";
	}



	@Override
	public Integer age() {
		// TODO Auto-generated method stub
		return 2020-this.anneeNaissance;
	}
	
	
	
	
	


}
