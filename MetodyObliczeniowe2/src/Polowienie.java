public class Polowienie {

	public static double x;
	public static int iloscKrokow = 1;
	public static double a = Startup.a;
	public static double b = Startup.b;
	public static double temp;
	
	public static int p(){
		x  = (a + b)/2;
		temp = (Math.pow(x, 5) + x - 10);
		if(temp<0)
			temp = temp*(-1.0);
		
        System.out.println(x);
		
        if(temp < Startup.przyblizenie){
			return iloscKrokow;
		}
		
		else{
			if(((Math.pow(a, 5) + a - 10) * (Math.pow(x, b) + b - 10))<0){
				b = x;
			}else{
				a = x;
			}
			if((b-a)<Startup.przyblizenie){
				return iloscKrokow;
			}
			else{
				iloscKrokow++;
				p();
			}
		}
		return iloscKrokow;		
	}
}
