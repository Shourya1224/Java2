public class Demo10 {

    public static void main(String[] args){

        int num = 7;
        boolean isPrime = true;
        for (int i = 2; i <= num / 2; i++) {
           if (num % i == 0) {
               isPrime = false;
               break;
           }
        }
       System.out.println(isPrime ? "Prime" : "Not Prime");



    }

     

}





        