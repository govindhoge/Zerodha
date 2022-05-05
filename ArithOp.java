package calculator;

public class ArithOp {
	public static float add(int a,float b) { //static method
		return a+b;
	}
	public static float sub(int a,float b) {//static method
		return a-b;
	}
	public float mul(float a,int b) {//Non-static method
		return a*b;
	}
	public float div(float a,float b) {//Non-staic method
		return a/b;
	}
	public static void main(String[] args) {
		float c=add(34,45.44f);
		float d=sub(67,34.34f);
		//float e=mul(23.33f,34);

		ArithOp RefV= new ArithOp();//object creation
		float e=RefV.mul(23.33f,34);
		//float f=div(45.55f,5.5f);
		float f=RefV.div(45.55f,5.5f);

		System.out.println("Addition is "+c);
		System.out.println("Substraction is "+d);
		System.out.println("Multiplication is "+e);
		System.out.println("Division is "+f);
	}

}
