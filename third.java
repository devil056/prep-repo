import java.util.Scanner;

class Sample{
	public static void main(String[] args){
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number between 1 and 100: ");
		n=s.nextInt();
		if(n%2==0){
			System.out.println("the number that you entered is even number");
		}else{
			System.out.println("the number that you entered is odd number");
		}
	}
}
