//import java.util.Scanner;

public class Gugudan_array {
	public static int[] calculate(int times){
		int[] result = new int[9];
		
		for(int k = 0; k < result.length; k++){
			result[k] = times * (k+1);
		}
		return result;
	}
	
	public static void print(int[] result){
		for(int i = 0; i < result.length; i++){
			System.out.println(result[i]);
		}
	}
	
	
	
}
