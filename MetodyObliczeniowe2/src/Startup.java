import java.util.Scanner;

public class Startup {
	public static final double a = -2;
	public static final double b = 2;
	public static final double finalSolution = 1.53301;
	public static double przyblizenie;
	
	public static void main(String[] args) {
		
		System.out.println("Wprowadz przyblizenie o wartosci pomiedzy 0 a 1: ");
		String check;
		Scanner sc = new Scanner(System.in);
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
        
        System.out.println(NewtonMethod.newton());
        System.out.println(Polowienie.p());


     }
	
    public static boolean isDouble(String s) {
        try {
        	Double.parseDouble(s);
        } catch(NumberFormatException e) {
        	return false;
        }
        return true;
    }
}
