interface compute{
    void convert(double val);
}

class gigatokilo implements compute{
    public void convert(double gb){
        double kb = gb *1024*1024*1024;
        System.out.println(gb+"gb: "+kb+"bytes");
    }
}
class eurotoRupee implements compute{
    public void convert(double euro){
        double rupee = euro * 90;
        System.out.println(euro+"euro: "+rupee+"rupee");
    }
}

public class p9 {
    public static void main(String[] args){
        compute gbtobytes = new gigatokilo();
        compute euroToRupe = new eurotoRupee();

        gbtobytes.convert(10);
        euroToRupe.convert(10);
    }
    
}
