package JukeBoxes;

public class Test1 {
    public static void main(String[] args) {
        double a = 4.25;
        String a1 = "Double: " + a;
        System.out.println(a1);
        long b = 1_000_000;
        String s = String.format("%,d", b);
        System.out.println(s);
    }
}