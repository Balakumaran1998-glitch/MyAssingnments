package Week1.day1;

public class LearnFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int range=8;
int n1=0,n2=1,n3;
System.out.println(n1+""+n2);
for(int i=2; i<range; i++) {
	n3=n1+n2;
	System.out.println(""+n3);
	n1=n2;
	n2=n3;
			
}
	}

}
