public class Demo13 {

    public static void main(String[] args) {
        
        //Check whether a character is uppercase or lowercase
        char ch = 'S';
        if (ch >= 'A' && ch <= 'Z')
           System.out.println("Uppercase");
        else if (ch >= 'a' && ch <= 'z')
           System.out.println("Lowercase");
        else
           System.out.println("Not an alphabet");
    }
    
}
