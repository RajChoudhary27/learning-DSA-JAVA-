//**WAP to find the first non-repeating character in a given string.
public class Ques6 {
    public static void main(String[] args) {
       String str="hello world";
         int[] freq=new int[256]; // Assuming ASCII character set
        // Count the frequency of each character in the string
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            freq[ch]++; // Increment the frequency of the character
         }
        // Find the first non-repeating character
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(freq[ch]==1)
            {
                System.out.println("First non-repeating character is: "+ch);
                break;
            }
        }
}
}

/*
we use hashing to solve this problem. we can use a hash map to store the frequency of each character in the string. then we can iterate through the string again and check the frequency of each character in the hash map. the first character with a frequency of 1 is the first non-repeating character in the string. this algorithm has a time complexity of O(n) and a space complexity of O(n) due to the hash map storing the frequencies.
 */
