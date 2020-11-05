package sumlt;

public class Sumlt_1 {
	
	  // instance variables
	  private double a, b, sum;
	  
	  // use the two parameters to set the values of your two instance variables
	  public void setNums(double num1, double num2) {
		   a = num1;
		   b = num2;
		 
	  }
	  
	  
	  
	  public void sum() {
		  sum = a + b;
	  }
	  
	  
	  public void print() {
		  System.out.println(sum);
		 }
	  
	  
	  public static void main(String[] args) {
		  Sumlt_1 runner = new Sumlt_1();
		  
		  // should print out 12
		  runner.setNums(5,  7);
		  runner.sum();
		  runner.print();
		  
		  // should print out 40
		  runner.setNums(13, 27);
		  runner.sum();
		  runner.print();
	  }
	  
	}