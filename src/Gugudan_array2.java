
public class Gugudan_array2 {

	public static void main(String args[]){
		int[] a = new int[8];
		int[] b = new int[9];
		
		for(int i = 0; i < a.length; i++){
			a[i] = i + 2;
			for(int j =0; j < b.length; j++){
				b[j] = j+1;
				System.out.println(a[i] + "*" + b[j] + "=" + a[i]*b[j]);
			}
		}
	}

}
