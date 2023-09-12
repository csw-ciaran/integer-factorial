import java.util.Scanner;

class IntegerFactorial {  
    public static void main(String args[]) {  
        int i, number;
        int factorial = 1;  
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        number = sc.nextInt();
        sc.close();
        

        for(i = 1; i <= number; i++) {    
            factorial = factorial * i;    
        }
            
        System.out.println("The Factorial of  " + number + " is " + factorial);    
    }  
}
