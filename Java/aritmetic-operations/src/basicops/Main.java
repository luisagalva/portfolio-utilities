package basicops;

public class Main {
	public static void main (String[] args) {
	    System.out.println("6. Encuentra la factorizacion de los numeros primos en los siguientes numeros");
	    
	   
	    System.out.println("32:  " + Aritmetic.primenumberfact(32).toString());
	    System.out.println("84:  " + Aritmetic.primenumberfact(84).toString());
	    System.out.println("16:  " + Aritmetic.primenumberfact(16).toString());
	    System.out.println("19:  " + Aritmetic.primenumberfact(19).toString());
	    System.out.println("26:  " + Aritmetic.primenumberfact(26).toString());
	    
	    System.out.println("7. Encuentra los numeros de factores");
	    System.out.println("34:  " + Aritmetic.factors(34).toString());
	    System.out.println("81:  " +Aritmetic.factors(81).toString());
	    System.out.println("36:  " +Aritmetic.factors(36).toString());
	}
}
