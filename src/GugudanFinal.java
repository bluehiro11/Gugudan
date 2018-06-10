import java.util.Scanner;

public class GugudanFinal {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String inputValue = sc.nextLine();
		System.out.println(inputValue);
		int times = Integer.parseInt(inputValue); 
		
		for(int i = 2; i <= times; i++){
			for(int j=1; j <= times; j++){
				System.out.println(i + "*" + j + "=" + i*j);
			}
		}
	}
}
