import java.util.ArrayList;
import java.util.Scanner;

public class Startup {
	public static final double a = -2;
	public static final double b = 2;
	public static final double finalSolution = 1.53301;
	public static double przyblizenie;
	
    public static boolean isDouble(String s) {
        try {
        	Double.parseDouble(s);
        } catch(NumberFormatException e) {
        	return false;
        }
        return true;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice;
    	String check;
    	ArrayList<Integer> wynikNewton = new ArrayList<Integer>();
    	ArrayList<Integer> wynikPolowienie = new ArrayList<Integer>();
    	ArrayList<Double> przyblizenia = new ArrayList<Double>();
    	boolean done = false;
		
    do{
		System.out.println("Wprowadz przyblizenie o wartosci pomiedzy 0 a 1: ");
        	
			do{
	            check = sc.next();
	            if(!isDouble(check)){
	                    System.out.println("Podaj poprawne dane!");
	            }else{
	       
	            	if(Double.parseDouble(check)>=1 || Double.parseDouble(check)<=0){
	            		System.out.println("Nieprawidlowe dane, przyblizenie ma zawierac sie pomiedzy 0 a 1");
	            		check = "s";
	            	}
	            }
		            
		     }while(!isDouble(check));
	        przyblizenie = Double.parseDouble(check);
			przyblizenia.add(przyblizenie);
	        wynikNewton.add(NewtonMethod.newton());
	        wynikPolowienie.add(Polowienie.p());
	        System.out.println(wynikNewton.get(wynikNewton.size()-1));
	        System.out.println(wynikPolowienie.get(wynikPolowienie.size()-1));
	        
	       
			do{
				 System.out.println("Wpisz 1 aby kontynuowac, 0 aby zakonczyc program");
	            check = sc.next();
	            if(!isDouble(check)){
	                    System.out.println("Podaj poprawne dane!");
	                    done = true;
	            }else{
	            	
	            	if(Double.parseDouble(check)==0){
	            		done = false;
	            	}
	            	else if(Double.parseDouble(check)==1){
	            		done = false;
	            	}
	            	else{
	            		done = true;
	            	}
	            }		   
		     }while(done);
			
	}while(Double.parseDouble(check)!=0);
	 	
    System.out.println("Przyblizenie        Metoda Newtona            Metoda Polowienia");
    for(int i=0; i<wynikNewton.size(); i++){ 
    	System.out.println(przyblizenia.get(i)+"                   " + wynikNewton.get(i)+"                       " + wynikPolowienie.get(i));
    }
    
    
	}
}
