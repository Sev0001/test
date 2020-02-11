package test.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 */

interface Operation 
{ 
    int operation(int a, int b); 
} 

// sayMessage() is implemented using lambda expressions 
// above 
interface Affichage 
{ 
    void sayMessage(String message); 
} 

  
class Test 
{
	public static int operation(int x, int y, Operation ope) {
		
		return ope.operation(x, y);
		
	}

		
	public static void main(String args[]) 
    { 
		Affichage afficher = message -> System.out.println(message);
		
		Operation add = (x, y) -> x + y;        
        
        int resultAdd = operation(1, 2, add);
        
        afficher.sayMessage(resultAdd+"");
        
        //----------------------------------------
        
        afficher = message -> Logger.getGlobal().info(message);
        
        Operation multiply = (x, y) -> x * y;        
        
        int resultMultiply = operation(1, 2, multiply);
        
        afficher.sayMessage(resultMultiply+"");
        
      //----------------------------------------
      //----------------------------------------
        
        IVehiculeOperation ope =  (km, vehicule) -> vehicule.setKilometrage(km); 
        
        Vehicule v = new Voiture();          
        
        ope.demarrer(10000, v);
        
        afficher.sayMessage(v.getKilometrage()+"");

      //----------------------------------------
        
        Moto m = new Moto();
        
        ope.demarrer(20000, m);
        
        afficher.sayMessage(m.getKilometrage()+"");
        
        Moto m2 = new Moto();
        
        ope.demarrer(20000, m2);
        
        afficher.sayMessage(m2.getKilometrage()+"");
        
    } 
}
