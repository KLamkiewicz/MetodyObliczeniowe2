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
			
			if(((Math.pow(a, 3) + a - 1) * (Math.pow(x, 3) + x - 1))<0){
				b = x;
			}
			else if(((Math.pow(b, 3) + b - 1) * (Math.pow(x, 3) + x - 1))<0){
				a = x;
			}

			iloscKrokow++;
		}
		wynik = (a+b)/2;
		return iloscKrokow;
	}
}
