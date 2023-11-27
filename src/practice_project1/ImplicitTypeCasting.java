package practice_project1;

public class ImplicitTypeCasting {

	public static void main(String[] args) {
		
		byte b=25;
		System.out.println("byte value is ::"+b);
		
		//Implicit TypeCasting
		short s=b;
		System.out.println("short value is ::"+s);
		
		int i=s;
		System.out.println("int value is ::"+i);
		
		long l=i;
		System.out.println("long value is ::"+l);
		
		float f=l;
		System.out.println("float value is ::"+f);
		
		double d=f;
		System.out.println("double value is ::"+d);

	}

}
