import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
     
		char X;
		X = sc.next().charAt(0);
		System.out.printf("O valor digitado:" + X);
		
		sc.close();
	}

}
