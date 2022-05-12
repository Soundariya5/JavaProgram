package week1.day1;
//import testing.MobileO;
public class TwoWheeler {
	String bikeName="R15";
	char firstLetter='R';
	short noOfMirrors=1;
	boolean isPuntured=false;
	int noOfWheels=2;
	double runningKM=26.5;
	long chassisNumber=6341747l;
	public static void main(String[] args) {
		TwoWheeler object=new TwoWheeler();
		System.out.println(object.bikeName);
		System.out.println(object.firstLetter);
		System.out.println(object.noOfMirrors);
		System.out.println(object.noOfWheels);
		System.out.println(object.isPuntured);
		System.out.println(object.chassisNumber);
		System.out.println(object.runningKM);

	}

}
