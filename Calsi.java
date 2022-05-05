package calculator;

public class Calsi {
	public String Operation(int a, int b) {
		return ((a+b)+"\n"+(a-b)+"\n"+(a*b)+"\n"+(a/b));

	}
	public static void main(String[] args) {
		Calsi RefV=new Calsi();
		String c=RefV.Operation(25,5);
		System.out.println(c);
	}

}
