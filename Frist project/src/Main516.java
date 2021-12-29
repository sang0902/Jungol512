import java.util.Scanner;

public class Main516 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble(); //좌항 우항 더블로
		double b = sc.nextDouble();
		String c = sc.next();
		//char c = sc.next(); 오답 예시
		//String c = sc.nextLine(); 띄워쓰기 공백까지 
		sc.close();
		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
		
		System.out.printf("%.2f\n", a) ;
		System.out.printf("%.2f\n", b) ;
		System.out.println(c) ;

	}	
}
