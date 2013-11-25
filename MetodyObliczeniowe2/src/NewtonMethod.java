public class NewtonMethod {
	static double x = 0;
	static int iloscKrokow = 1;
	static double wynik = 1;

	public static int newton(){
		wynik = wynik - ((Math.pow(wynik, 5) + wynik - 10)/(Math.pow(5*wynik, 4) + 1));
		if((Startup.finalSolution + Startup.przyblizenie)>=wynik && (Startup.finalSolution-Startup.przyblizenie)<=wynik){
			return iloscKrokow;
		}
		else{
			iloscKrokow++;
			newton();
		}
		return iloscKrokow;
	}
}
