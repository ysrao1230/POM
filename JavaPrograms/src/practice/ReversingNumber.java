package practice;

public class ReversingNumber {

	public static void main(String[] args) {
		int num = 54321;
		int rev = 0;
		while(num!=0) {
			rev = rev*10 + num % 10;
			num = num / 10;
		}
		System.out.println(rev);
		
		System.out.println("Reversing a String");
		
		String str = "Srinivasa Rao";
		String rev1 ="";
		for(int i=str.length()-1;i>=0;i--) {
			rev1 = rev1+str.charAt(i);
		}
		System.out.println("Reverese String is: " +rev1);
	}

}
