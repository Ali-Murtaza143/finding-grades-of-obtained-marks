import java.util.*;
	public class grades {
	    public static void main(String[] args) {
	        Scanner Input= new Scanner (System.in);
	        System.out.println("Enter your subject marks out of 100");
	        double marks= Input.nextDouble();
	        if (marks<0 || marks>100)
	            System.out.println("Invalid Marks");
	        else {
	            int percentage= (int)(marks*100/100);
	            System.out.println(percentage);
	            if(percentage>90)
	                System.out.println("your grade is A+");
	            else if (percentage>70 || percentage<=90)
	                System.out.println("your grade is A");
	            else if(percentage>50 || percentage<=70)
	                System.out.println("your grade is B");
	            else
	                System.out.println("your grade is C");
	        }
	    }
	}
