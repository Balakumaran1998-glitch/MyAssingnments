package Week1.day1;

public class CheckNuberIsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=6;
boolean isPrime=true;
for(int i=2;i<=num/2;) {
	if(num%i==0);
	isPrime=false;
	break;
}
if(isPrime==true) {
	System.out.println("prime num");
} 
else {
	System.out.println("non prime");
		
}
	}

}
