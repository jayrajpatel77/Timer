import java.util.Scanner;

public class TestTimer {
	
	public static void main(String args[] ) {
		Scanner sc=new Scanner(System.in);
		
		Timer[] t1 =new Timer[3];
		int h1 = 0,m1=0,s1=0;
		t1[0]= new Timer(h1,m1,s1);
		System.out.print(" First timer from the Constructor:");
		h1=sc.nextInt();
		m1=sc.nextInt();
		s1=sc.nextInt();
		
		int h2 = 0,m2=0,s2=0;
		t1[0]= new Timer(h2,m2,s2);
		System.out.print(" Enter second object:");
		h2=sc.nextInt();
		m2=sc.nextInt();
		s2=sc.nextInt();
		
		int h3 = 0,m3=0,s3=0;
		t1[0]= new Timer(h3,m3,s3);
		System.out.print(" Enter the Third object:");
		h3=sc.nextInt();
		m3=sc.nextInt();
		s3=sc.nextInt();
		
		
		int totalHour=0;
		int totalMinute = 0;
		int totalSecond=0;
		totalHour=h1+h2+h3;
		System.out.print(totalHour);
		
		
		if(totalMinute>60) {
			totalMinute=totalMinute%60;
			totalHour+=totalMinute/60;
			
		totalMinute=m1+m2+m3;
		System.out.print(totalMinute);
					
		}
		
		
		System.out.println(totalMinute);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
