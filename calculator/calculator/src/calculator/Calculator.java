//Calculator

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.util.Scanner;

class Operations
{
    /**
     * add method adds two numbers and returns the result
     */
    double add(double op1,double op2)
    {
        double result = (op1 + op2);
        return result;
        
    }
    
   double subtract(double op1,double op2)
    {   
      double result = (op1 - op2);
      return result;
        
    }
   
   
   double multiply(double op1,double op2)
    {   
      double result = (op1 * op2);
      return result;
    }
   
   
   double divide(double op1,double op2)
    {
      double result = (op1 / op2);
      return result;
    }
}
/**
 *
 * @author sushma
 */
public class Calculator 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Operations O = new Operations();
        Scanner s1 = new Scanner(System.in);
        
        double op1, op2, result = 1.0;
        System.out.println("Enter two numbers :");
        Scanner s = new Scanner(System.in);
        op1 = s.nextDouble();
        op2 = s.nextDouble();
        for(;;)
        {
            System.out.println(" 1. Add\n 2. Subtract\n 3. Multiply\n 4. Divide\n 5. Exit\n");
            
            System.out.println("Enter your choice : ");
            int choice = s1.nextInt();
            
            switch(choice)
            {
                case 1 :System.out.println("Result = "+O.add(op1,op2));
                        break;
                        
                case 2 : System.out.println("Result = "+O.subtract(op1,op2));
                        break;
                        
                case 3 : System.out.println("Result = "+O.multiply(op1,op2));
                        break;
                        
                case 4 : System.out.println("Result = "+O.divide(op1,op2));
                         break;
                         
                case 5 : System.exit(0);
                        break;
                        
                default : System.out.println("Invalid Choice!");
            
            }
        }
    }
    
}
