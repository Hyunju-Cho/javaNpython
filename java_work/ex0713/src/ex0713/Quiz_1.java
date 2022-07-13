package ex0713;

public class Quiz_1 {

	public static void main(String[] args) {

		int ar[][]= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		System.out.println("변경 전");
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				System.out.print(ar[i][j]+"\t");
			}
		System.out.println();
		}
		addTwoDArr(ar,3);
		
		int ar2[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9},
		};
		System.out.println("변경 전");
		for(int i=0;i<ar2.length;i++) {
			for(int j=0;j<ar2[i].length;j++) {
				System.out.print(ar2[i][j]+"\t");
			}
		System.out.println();
		}
		change(ar2);
		
	
	}
	
	public static void addTwoDArr(int[][] arr, int add){
		System.out.println("변경 후");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]+=add;
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public static void change(int[][]arr) {
		int num=arr.length;//3
		int temp[]=arr[num-1];//맨 마지막 행을 임시 배열에 담아둠
		
		for(int i=num-1;i>0;i--) {//3행이 2행 값으로 바뀜->1행이 0행 값으로 바뀜
			arr[i]=arr[i-1];
		}
		arr[0]=temp;//0행(첫번째 행)이 임시 배열에 담아 둔 행의 값으로 바뀜
		
		System.out.println("변경 후");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
		System.out.println();
		}
	}
}

