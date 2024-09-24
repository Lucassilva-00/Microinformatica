public class Port {
    public static void main (String[] args) {
        boolean a2 = false;
        boolean a1 = true;
        boolean a0 = false;

        boolean q5 = a2 & a1;
        boolean q4 = (!a1 | a0) & a2;
        boolean q3 = ((!a2 & a1 & a0) | (a2 & !a1 & a0));
        boolean q2 = a1 & !a0;
        boolean q1 = false;
        boolean q0 = a0;

        
    }
}
