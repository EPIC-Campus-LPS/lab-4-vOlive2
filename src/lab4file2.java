import java.util.Scanner;
public class lab4file2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Input: ");
		String str = scan.nextLine();
		int ap = str.indexOf("apple");
		int ch = str.indexOf("cherry");
		int ba = str.indexOf("banana");
		int an = str.indexOf("and");
		int t = 0;
		String rev = "";
		for(int i = 0; i < str.length(); i++) {
			if(str.substring(i, i+3).equals("the")) {t++;}
		}
		for(int i = str.length()-1; i > -1; i--) {
			rev += str.substring(i, i+1);
		}
	}

}
