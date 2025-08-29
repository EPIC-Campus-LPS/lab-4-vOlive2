import java.util.Scanner;
public class lab4file1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input: ");
		int[] arr = new int[10];
		for(int j = 0; j < 10; j++) {
			arr[j] = scan.nextInt();
		}
		int min = arr[0];
		int max = 0;
		int e = 0;
		String o = "";
		int sum = 0;
		for(int i = 0; i < 10; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
			if(arr[i] % 2 == 0) {
				e++;
			}
			if(arr[i] % 3 == 0) {
				if(o.equals("")) {o = arr[i] + "";}
				else {o += ", "+ arr[i];}
			}
			sum += arr[i];
		}
		System.out.println(o + " are divisable by 3");
		System.out.println("There are " + e + " even numbers");
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + sum/10);
		System.out.println("Largest Digets: ");
		String newMax = Integer.toString(max);
		for(int i = 0; i < newMax.length(); i++) {
			System.out.println(newMax.substring(i, i+1));
		}


		
	}

}
