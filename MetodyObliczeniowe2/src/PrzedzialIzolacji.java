
public class PrzedzialIzolacji {
	public int[] f(){
		int[] przedzial = new int[2];
		
			if(((Math.pow(przedzial[0], 5) + przedzial[0] -10)*(Math.pow(przedzial[1],5) + przedzial[1] - 10))<0){
				return przedzial;
			}
			else{
				f();
			}
		
		return przedzial;
	}
}
