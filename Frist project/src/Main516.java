import java.util.Scanner;

public class Main516 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble(); //���� ���� �����
		double b = sc.nextDouble();
		String c = sc.next();
		//char c = sc.next(); ���� ����
		//String c = sc.nextLine(); ������� ������� 
		sc.close();
		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
		
		System.out.printf("%.2f\n", a) ;
		System.out.printf("%.2f\n", b) ;
		System.out.println(c) ;

	}	
}
