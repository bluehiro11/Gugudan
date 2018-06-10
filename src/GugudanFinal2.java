import java.util.Scanner;

public class GugudanFinal2 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String inputValue = sc.nextLine();
		String[] spletedValue = inputValue.split(",");
		
		int first = Integer.parseInt(spletedValue[0]);
		int second = Integer.parseInt(spletedValue[1]);
		
		for(int i = 2; i <= first; i++){
			for(int j = 1; j <= second; j++){
				System.out.println(i + "*" + j + "=" + i*j);
			}
		}
		
	}
}
