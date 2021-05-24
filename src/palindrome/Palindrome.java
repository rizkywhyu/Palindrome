/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

/**
 *
 * @author LENOVO
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public boolean isPalindromRecursive(String value, int i) {
        if (i < value.length()/2) {
            int last = value.length() - i -1;
            
            if (value.charAt(i) != value.charAt(last)) {
                return false;
            } else {
                System.out.println(value.charAt(i));
                return isPalindromRecursive(value, i+1);
            }
        } else {
            return true;
        }
    }
    
    public boolean isPalindrome(String value) {
        //Recursive
        return isPalindromRecursive(value, 0);
      
        //Without temp and optimatizon iteration
//        for (int i = 0; i < value.length()/2; i++) {
//            int last = value.length() - i -1;
//            
//            if (value.charAt(i) != value.charAt(last)) {
//                return false;
//            }
//            System.out.println(value.charAt(i));
//        }
//        return true;
        
//        String temp = "";
//        
//        for (int i = value.length()-1; i >= 0; i--) {
//            temp = temp + value.charAt(i);
//        }
//        System.out.println(temp);
        
//        return false;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Palindrome pd = new Palindrome();
        pd.isPalindrome("katak");
    }
    
}
