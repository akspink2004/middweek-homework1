package midweek;

public class Marksheets10 {
    public static void main(String [] args){
        int a = 60,b = 62,c = 59,d = 68,e = 66 ;
        int Total = (a+b+c+d+e);
        double Total1 = Total*100/500;
        System.out.println("              Gujarat Secondary & Higher Secondary Education Board Gandhinagar");
        System.out.println("                       STATEMENT OF MARKS CUM CERTIFICATE ");
        System.out.println(" NAME :-             Akshitkumar madhubhai patel ");
        System.out.println("     -----------------------------------------------------------------------------");
        System.out.println("     MONTH & YEAR OF THE EXAM      SEAT NO.        CENTRE NO.     SCHOOL INDEX NO ");
        System.out.println("     -----------------------------------------------------------------------------");
        System.out.println("            MARCH-1993         |   B 362550      |    118      |       73.185 ");
        System.out.println("   ---------------------------------------------------------------------------------");
        System.out.println("    NAME OF THE SUBJECT WITH CODE NO   |      TOTAL MARK  |     MARK OBTAINED");
        System.out.println("   -----------------------------------------------------------------------------------");
        System.out.println("  ENGLISH                                        100                 " + (a));
        System.out.println("  SOCIAL SCIENCE                                 100                 " + (b));
        System.out.println("  SCIENCE & TECH                                 100                 " + (c));
        System.out.println("  MATHEMATICS                                    100                 " + (d));
        System.out.println("  GUJARATI SL                                    100                 " + (e));
        System.out.println("  -------------------------------------------------------------------------------------");
        System.out.println("  GRAND TOTAL OF MARKS OBTAINED                  500                " + (Total));
        System.out.println("  --------------------------------------------------------------------------------------");
        System.out.println("  PERCENTILE RANK                                                    " + (Total1));
    }
}
