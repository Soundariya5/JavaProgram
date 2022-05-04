package assignments;

public class Car {
	public void applyBreak() {
		int noOfBreak=2;
		System.out.println(noOfBreak);
	}
	public void applyGear(int gear) {
		System.out.println("the car is on " +gear+" gear");
	}
    public void applyAccelerate(int acc) {
    	System.out.println("the car is on "+acc+" k/hr");
    }
    public void switchonAc(int ac) {
    	if(ac==0) {
    	System.out.println(false);
    }else {
    	System.out.println(true);
    }}
	public static void main(String[] args) {
		Car obj=new Car();
		obj.applyBreak();
		obj.applyGear(5);
	    obj.applyAccelerate(60);
	    obj.switchonAc(1);
		// TODO Auto-generated method stub

	}

}
