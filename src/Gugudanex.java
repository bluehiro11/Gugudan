
	public class Gugudanex {
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
		
		public static void main(String args[]){
			for(int j = 2; j < 10; j++){
				calculate(j);
				print(calculate(j));
			}
		}
		
	}

