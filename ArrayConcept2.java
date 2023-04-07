package PracticeJava;

public class ArrayConcept2 {

	public static void main(String[] args) {

		
		int i[]= new int[4];
		i[0]= 9;
		i[1]= 3;
		i[2]=55;
		i[3]=46;
		
		System.out.println(i[3]);
		System.out.println(i.length);
		System.out.println(i[0]);
		
		String s[]= new String[3];
		s[0]="Mitul";
		s[1]="I love java";
		s[2]="I love selenium";
		
		System.out.println(s[1]);
		System.out.println(s[2]);
		
		for(int x=0;x<i.length;x++) {
			System.out.println(i[x]);
		}
		
		char c[]= new char[3];
		c[0]= '@';
		c[1]='$';
		c[2]='£';
		
		System.out.println(c[2]);
		
		
		
		
		
		


	}

}
