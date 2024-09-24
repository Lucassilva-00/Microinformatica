public class Main {
    public static void main (String[] args) {
        boolean x = false; 
        boolean y = false;
        boolean z = true;

        System.out.print((!x & y) | ((y | !z) & x));
    }
}
