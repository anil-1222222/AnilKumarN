package practice_project1;

public class ExplicitTypeCasting {

	public static void main(String[] args) {
	
		double d=34;
		System.out.println("double value is ::"+d);
		
		float f=(float) d;
		System.out.println("float value is ::"+f);
		
		long l=(long) f;
		System.out.println("long value is ::"+l);
		
		int i=(int) l;
		System.out.println("int value is ::"+i);
		
		short s=(short) i;
		System.out.println("short value is ::"+s);
		
		byte b=(byte) s;
		System.out.println("byte value is ::"+b);
		

	}

}
