package assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		for(int i=1;i<=10;i++) {
       int c=a+b;
       a=b;
       b=c;
		System.out.println(b);
		// TODO Auto-generated method stub
		}
	}

}
