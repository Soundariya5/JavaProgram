package assignments;

public class ArmstrongNumber {
	public void numberArm(int n) {
		int original=n;
		int cal=0,rem;
		while(n>0) {
		rem=n%10;
		cal=cal+(rem*rem*rem);
		n=n/10;
		}
		if(original==cal) {
			System.out.println("Given number is armstrong");
		}
		else
		{
			System.out.println("Given number is not a armstrong number");
		}
	}

	public static void main(String[] args) {
		ArmstrongNumber num=new ArmstrongNumber();
		num.numberArm(153);
		}

}
