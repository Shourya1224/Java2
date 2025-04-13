public class Demo7 {

    public static void main(String[] args) {
        
        // leap year 

        int year = 1900 ;
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
           System.out.println(" Year is Leap year");
        else
           System.out.println(" Year is not a leap year"); 

        
       

    }

}
