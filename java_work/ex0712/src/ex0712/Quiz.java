package ex0712;

public class Quiz {

	public static void main(String[] args) {

		int[] ar= {3,5,1,4,6,7};
		System.out.println("최댓값 = "+maxValue(ar));
		System.out.println("최솟값 = "+minValue(ar));
	}
	
	public static int minValue(int[] arr) {
		
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		return min;
		
	}
	
public static int maxValue(int[] arr) {
		
		int max=arr[0];
		for(int i:arr) {
			if(max<i) {
				max=i;
			}
		}
		return max;
		
	}

}
