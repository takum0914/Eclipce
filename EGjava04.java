
public class EGjava04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int[] arr3 = new int[100];
		
		for(int n = 1; n <= 100; n++) {
			arr3[n-1] = n;
			if(arr3[n-1] % 2 == 0) {
				System.out.println(arr3[n-1]);
			}
		}
			
	}
		
		//別解
		/*
		 for(int n = 1; n <= 100; n++){
		 	if(n % 2 ==0)
		 		System.out.println(n)
		 }
		 */

}


