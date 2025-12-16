import java.util.*;

class DivideByZeroException extends Exception{
    public DivideByZeroException (String message){
        super(message);
    }
}
class NegativeNumberException extends Exception{
    public NegativeNumberException (String message){
        super(message);
    }
}

public class p8{
    public static double divide(int n , int d) throws DivideByZeroException, NegativeNumberException {
        if( n < 0 || d <0){
            throw new NegativeNumberException("Number cannot be negative!!\n");
        }
        if ( d == 0){
            throw new DivideByZeroException("Denominator cannot be Zero!!\n");
        }

        return (double)n/d;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Enter the numerator:");
            int n = sc.nextInt();
            System.out.print("Enter the denominator:");
            int d = sc.nextInt();

            double result = divide(n,d);
            System.out.println("The answer:"+ result);

        }catch(NegativeNumberException e){
            System.out.println("The error message: " +e.getMessage());
        }catch(DivideByZeroException e){
            System.out.println("The error mesage: "+e.getMessage());
        }catch( Exception e){
            System.out.println("Invalid Input! try again");
        }finally{
            sc.close();
        }
    }
}

