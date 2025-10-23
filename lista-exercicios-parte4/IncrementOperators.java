public class Example3 {
    public static void main(String[] args) {
        int b = 5;
        int a = b++;
        int c = ++b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = b" + c); 
    }
}
