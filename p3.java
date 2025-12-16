

class ComplexNumber{
    private double real;
    private double imaginary;
    public ComplexNumber(double r, double i){
        real =r;
        imaginary = i;

    }
    public ComplexNumber add(ComplexNumber other){
        return new ComplexNumber(real + other.real, imaginary+other.imaginary);
    }
    public ComplexNumber sub(ComplexNumber other){
        return new ComplexNumber(real - other.real, imaginary-other.imaginary);
    }
    public void display(){
        System.out.println(real+"+"+imaginary+"i");
    }
    public boolean isEqual(ComplexNumber other){
        return real == other.real && imaginary==other.imaginary;
    }
}

public class p3 {
    public static void main(String[] args){
        ComplexNumber a = new ComplexNumber(3.5, 2.5);
        ComplexNumber b = new ComplexNumber(1.5, 1);
        ComplexNumber sum = a.add(b);
        ComplexNumber diff = a.sub(b);
        System.out.println("Addition:");
        sum.display();
        System.out.println("Subtraction:");
        diff.display();
        System.out.println("Both are Equal ??:"+ a.isEqual(b));
    }

}
