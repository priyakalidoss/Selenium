package week1.day2;

public class NegativeToPositiveConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int number=-40;
   
   if (number<0) {
	   int number1=number*-1;
	   System.out.println("The number "+number +" is convereted to " +number1);
   }
   else {
	   System.out.println("The number is " +number);
	}

}
}