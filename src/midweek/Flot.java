package midweek;

public class Flot {
    public static void main( String [] args){
        double a = 25.5, b = 3.5, c = 3.5, d = 3.5, e = 40.5, f= 4.5;
       // ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
        System.out.println((a*b - c * d) / (e - f));
    }
}
  //  Expected Output
  //  2.138888888888889