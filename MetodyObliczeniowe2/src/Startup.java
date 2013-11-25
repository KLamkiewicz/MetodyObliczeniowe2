import java.util.Scanner;

public class Startup {
	public static final int a = -2;
	public static final int b = 2;
	public static final double finalSolution = 1.53301;
	public static double przyblizenie = 0.5;
	
	public static void main(String[] args) {
		
		System.out.println("Wprowadz przyblizenie: ");
		String check;
		Scanner sc = new Scanner(System.in);
        do{
            check = sc.next();
            if(!isDouble(check)){
                    System.out.println("Podaj poprawne dane!");
            }
        }while(!isDouble(check));
        przyblizenie = Double.parseDouble(check);
        
        System.out.println(NewtonMethod.newton());
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
