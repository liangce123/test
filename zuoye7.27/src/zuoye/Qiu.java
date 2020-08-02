package zuoye;

public class Qiu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double hight=100;
		double sum= 100;
		
		for(int i=1;i<10;i++)
		{
		hight /= 2;	
		sum += hight * 2;
		}
		
	    
	   
		System.out.println("球共经过"+sum+"米");
	}

}
