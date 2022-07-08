package ex0708;

class Accumulator {
	
	static int sum=0;
	
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			Accumulator.add(i);
		}
		Accumulator.showResult();
	}
	public static int add(int num) {
		sum+=num;
		return sum;
	}  
	public static void showResult() {
		System.out.println("sum = "+sum);
	}

}
