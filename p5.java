public class p5 {
    public int stringcmp(String st1,String st2){
        return st1.compareTo(st2);
    }
    public int stringcmp(String s1,String s2,int n){
        return s1.substring(0, Math.min(n, s1.length())).compareTo(s2.substring(0,Math.min(n,s2.length())));
    }
    public static void main(String[] arg){
        p5 cmp = new p5();
        
        String s1 ="HelloWorld";
        String s2 = "Hellojava";

        System.out.println("Complete string: "+ cmp.stringcmp(s1,s2));
        System.out.println("First 5 characters:"+cmp.stringcmp(s1, s2, 5));
    }
    
}
