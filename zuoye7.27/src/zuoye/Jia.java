package zuoye;
import java.util.Scanner;
public class Jia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("������һ����:");
		int a=scanner.nextInt();
		System.out.println("������λ����");
		int n=scanner.nextInt();
		
		int num = a;
		int  sum = 0;
		
		
		for (int i = 0; i < n; i++) {
			sum += a;
			a = a * 10 + num;
			
		
		}
		System.out.println("sum=" + sum);
	}
}
	    
	   