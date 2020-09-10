import java.util.Scanner;

public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {
        int count = 0;
        int x = 0; 
        String str2 = str.toLowerCase();
        for (int i=0 ; i<str2.length(); i++){
            char chare = str2.charAt(i);
            if (chare == 'a') {
                count ++;
            }
            if (chare == 'b') {
                count ++;
            }
            if (chare == 'c') {
                count ++;
            }
            else {
                x = count + 0; //no need for else statement, does absolutely nothing.
            }
        }  
        return count; //returning the total sum of all the letters together
    }
        
    

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(String str) {
        String str2 = str.toLowerCase();
        Boolean str3 = str2.contains("the");
        return str3; //value will be either true or false
        
        
    }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {
      String str2 = str.toLowerCase();
      String pal = "";
      for (int i = str.length(); i > 0; i--) {
        pal += str.charAt(i - 1);
      }
      String low = pal.toLowerCase(); //this makes it so capital letters dont provide a false negative, when paired with str2 which is also all lowercase
      return str2.equals(low);
        
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter a string:");
        String a = scan.nextLine();
        System.out.println("The combined amount of a, b, and c in this string is: " + countABC(a));
        System.out.println("Does this have the word THE? : " + containsThe(a));
        System.out.println("Is this string a palindrome? : " + isPalindrome(a));

        scan.close();


        // YOUR CODE HERE
    }
}
