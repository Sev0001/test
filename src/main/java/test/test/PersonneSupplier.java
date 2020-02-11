package test.test;

@FunctionalInterface
public interface PersonneSupplier {
	//Personne creerInstance(String nom, String prenom);

	Integer age();
	
	static void test() {
		System.out.println("test2");
	}
}
