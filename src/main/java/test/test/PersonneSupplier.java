package test.test;

@FunctionalInterface
public interface PersonneSupplier {
	//Personne creerInstance(String nom, String prenom);

	Integer age(Integer annee);
	
	static void test() {
		System.out.println("test3");
	}
}
