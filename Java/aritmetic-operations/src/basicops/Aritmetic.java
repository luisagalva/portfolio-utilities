package basicops;

import java.util.ArrayList;
import java.util.List;

public class Aritmetic {
	
	public static List<Integer> factors(int a){
		List<Integer> res = new ArrayList<Integer>();
		for(int x = 1; x <= a/2; x++  ){
			if(!res.contains(a/x) && a%x == 0 ){
				res.add(x);
				res.add(a/x);
			}
		}
		return res;
	}
	
	public static boolean isPrime(int a) {
		if(factors(a).size() == 2) return true;
		return false;
	}
	
	public static List<Integer> primenumbers(int a) {
		List<Integer> res = new ArrayList<Integer>();
		for(int x = 0; x <= a; x++){
			if(isPrime(x)) res.add(x);
		}
		return res;
	}
	
	public static List<Integer> primenumberfact(int a){
		List<Integer> res = new ArrayList<Integer>();
		if(isPrime(a)) {
			res.add(1);
			res.add(a);
			return res;
		}
		
		List<Integer> primes = primenumbers(a);
		int p = a;
		while(p > 1) {
			for(int x = 0; x < primes.size(); x++ ) {
				if(p%primes.get(x) == 0){
					res.add(primes.get(x));
					p = p/primes.get(x);
					break;
				}
			}
		}
		return res;
	}
}
