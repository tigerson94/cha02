package sec02.exam04;

public class CharExample {
	public static void main(String[] args) {
	    int x = 5; 
	    boolean result = (x == 5);
		
		char s1 = 'A';
	    char s2 = 'B';
	    System.out.println((char)(s1 + s2));
		int aa = 10;
	    double bb = 20;
	    
	    
		
		byte b = 1;
	    int i = 0;
	    i = b;
	    b = (byte) i;
	    
		
		char c1 = 'A';          //문자를 직접 저장
		System.out.println( (char)(c1 + 32) );
		double d = 10.34;
		System.out.println();
		
		
		
		char c2 = 65;          	//십진수로 저장
		char c3 = '\u0041';    	//16진수로 저장
		
		char c4 = '가';         	//문자를 직접 저장
		char c5 = 44032;      	//십진수로 저장
		char c6 = '\uac00';    	//16진수로 저장
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
	}
}
