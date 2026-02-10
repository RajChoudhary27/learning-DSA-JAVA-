//String is a class in Java that represents a sequence of characters. It is widely used for storing and manipulating text data. Here are some basics about Strings in Java:
public class Basics {
    public static void main(String[] args) {
        //Declaration of String
     /* 
        String str1="Hello";
        String str2=new String("Hello");
     */

        //Taken input from user
    /* 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str3=sc.next();  //only one word will be taken as input
        String str4=sc.nextLine(); //will take the whole line as input
        System.out.println(str3);
        System.out.println(str4);
    */

        //charAt method and length method
     /* 
        String str5="Hello World";
        System.out.println(str5.charAt(0)); //H
        System.out.println(str5.charAt(6)); //W
        System.out.println(str5.length()); //11
     */

        //indexOf method and compareTo method
    /* 
        String str6="Hello";
        String str7="World";
        System.out.println(str6.indexOf('o')); //4
        System.out.println(str6.indexOf('z')); //-1
        System.out.println(str6.compareTo(str7)); //-15 (because H is less than W in ASCII value)
        System.out.println(str7.compareTo(str6)); //15 (because W is greater than H in ASCII value)
        //if both strings are equal then compareTo will return 0
        String str8="Hello";
        System.out.println(str6.compareTo(str8)); //0 (because both strings are equal)
    */

        //startsWith and endsWith method
    /* 
        String str9="Hello World";
        System.out.println(str9.startsWith("Hello")); //true
        System.out.println(str9.endsWith("World")); //true
    */

        //substring method
    /* 
        String str10="Hello World";
        System.out.println(str10.substring(0, 5)); //Hello
        System.out.println(str10.substring(6)); //World
     */

        //StringBuilder class
    
        StringBuilder sb=new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb.toString()); //Hello World
        StringBuilder sb2=new StringBuilder("Hello");
        sb2.append(" World");
        System.out.println(sb2); //Hello World
        //hello->mello
        sb2.setCharAt(0, 'M');
        System.out.println(sb2); //Mello
        
        //insert "Java " at index 6
        sb2.insert(6, "Java ");
        System.out.println(sb2); //Mello Java World

        //delete "Java " from index 6 to 11
        sb2.delete(6, 11);
        System.out.println(sb2); //Mello World
        //reverse the string
        sb2.reverse();
        System.out.println(sb2); //dlroW olleM

      
      //toString method is used to convert StringBuilder to String because StringBuilder does not override equals method and it will compare the reference of the object instead of the value of the object .
      System.out.println(sb.toString().equals(sb2.toString())); //true (because both strings are equal)

      
        System.out.println(sb.equals(sb2)); //false (because StringBuilder does not override equals method) 
        //*stringbuilder is mutable (can be changed) whereas String is immutable (cannot be changed)
     


    }
}
