package _02_nested_loops._3_for_loop_gauntlet;

public class for_loop_gauntlet {
public static void main(String[] args) {
	for(int i=0;i<101;i++) {
		System.out.println(i);	
		
	}
	for(int i=100;i>=0;i--) {
		System.out.println(i);
	}
	for(int i=2;i<=100;i+=2) {
		System.out.println(i);
	}
	for(int i=1;i<=99;i+=1	) {
		if(i % 2 != 0) {
		System.out.println(i);
		}
	}
	for(int i=0;i<=500;i++) {
		if(i % 2 ==0) {
			System.out.println(i+" even");
			
		}
		else {
			System.out.println(i+" odd");
		}
	}
	for(int i=1;i<=111;i++) {
		
			System.out.println(i*7);
		
	}
	for(int i=2009;i<=2023;i+=1) {
		System.out.println("In "+i+" i was "+(i-2009));
	}
	for(int i=0;i<3;i++) {
		for(int x=0;x<3;x++) {
			System.out.println(i+" "+ x);
		}
	}
	for(int i=0;i<3;i++) {
		for(int x=0;x<3;x++) {
			System.out.print(((i * 3)+x+1)+ " ");
		}
		System.out.println("");
	}
	for(int i=0;i<10;i++) {
		for(int x=0;x<10;x++) {
			System.out.print(((i*10)+x+1)+ " ");
		
		}
		System.out.println(" ");
	}
for(int i=1;i<=6;i++) {
	for(int x=1;x<=i;x++) {
		System.out.print("*");
	}
	System.out.println(" ");
}
}
}