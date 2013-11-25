public class Polowienie {

	public static double x;
	public static int iloscKrokow = 1;
	public static double a = Startup.a;
	public static double b = Startup.b;
	public static double f0;
	public static double wynik;
	
	public static int p(){	
		while(Math.abs(a-b)>Startup.przyblizenie){
			x = (a+b)/2;
			
			if(((Math.pow(a, 5) + a - 10) * (Math.pow(x, 5) + x - 10))<0){
				b = x;
			}
			else if(((Math.pow(b, 5) + b - 10) * (Math.pow(x, 5) + x - 10))<0){
				a = x;
			}
			iloscKrokow++;
		}
		wynik = (a+b)/2;
		return iloscKrokow;
	}
}
