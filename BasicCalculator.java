# BasicCalculator
    import java.lang.*;
	  import java.util.*; 	
	   public class BasicCalculator {

			public static void main(String[] args)
			{
			
				  double number1, number2;

			    Scanner sc = new Scanner(System.in);
			    
			    System.out.println("Enter the number1 : ");
          number1 = sc.nextDouble();
				
                
          System.out.println("Enter the operator (+,-,*,/,%,^) : ");
				  char operator = sc.next().charAt(0);
                
				  System.out.println("Enter the number2 : ");
				  number2 = sc.nextDouble();
				
				
				  double result = 0;
                                
                
				  switch (operator) {

				
				 case '+':
					 result = number1 + number2;
					 System.out.println();
					
					 System.out.println("The final result:");

					 System.out.println();

					 System.out.println(number1 + " " + operator + " " + number2+ " = " + result);
				
					break;

				case '-':
				    result = number1 - number2;
				    
				    System.out.println();
					
					  System.out.println("The final result:");

					  System.out.println();

					  System.out.println(number1 + " " + operator + " " + number2+ " = " + result);
				
				    break;
				
				case '*':
					  result = number1 * number2;
					
					  System.out.println();
					
					  System.out.println("The final result:");

					  System.out.println();

					  System.out.println(number1 + " " + operator + " " + number2+ " = " + result);
				
					 break;
				
				case '/':
					result = number1 / number2;
					 if(number2 != 0)
					 {	
				    
				    System.out.println(number1/number2);
					
					  System.out.println();
					
					  System.out.println("The final result:");

					  System.out.println();

					  System.out.println(number1 + " " + operator + " " + number2+ " = " + result);
				
					}					
					else
					{	
						System.out.println();
						
						
						System.out.println("The Answer is Undefined");
					}
						break;
					
				
				case '%':					
					 result = (number1 / number2)*100;				
					
					 System.out.println();
					 
					 System.out.println("The final result:");

					 System.out.println();

					 System.out.println(number1 + " " + operator + " " + number2+ " = " + result);
				
					 break;
				
				case '^':
				    result = Math.pow(number1, number2);
				    
				    System.out.println();
					
					  System.out.println("The final result:");
 
					 System.out.println();

					 System.out.println(number1 + " " + operator + " " + number2+ " = " + result);
				 
				    break;
				
			
					
				default:

					System.out.println("You enter wrong input");

					break;
				}

				
			}
		

	}



