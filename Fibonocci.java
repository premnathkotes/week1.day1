package week1.day1;

public class Fibonocci {
public static void main(String[] args) {
	int firstNum=0;
	int sum=0;
	int secondNum=1;
	System.out.println(firstNum);
	for(int i=0; i<=10; i++) {
		sum=firstNum+secondNum;
		firstNum=secondNum;
		secondNum=sum;
		System.out.println(sum);
		
	}
	
}
}
