/* 
Ques-8 ->Water Bottles You are given the number of full bottles and exchange rate.Find the maximum number of bootles you can drink.
 */
public class Day8 {
    public static void main(String[] args) {
        int numbottles = 12;
        int exchange = 3;
        int consume=numbottles;
        int empty=numbottles;

        
            while(empty>=exchange)
         {
            consume+=(empty/exchange);
            empty=(empty/exchange);      
         }
      System.out.print(consume+" Bottles you will drink");
    }
}
/*
Dry run ->

 1 1 1 1
 1 1 1 1  -> cousume=12   consume=12+4=16       comsume=16+1=17
 1 1 1 1  -> empty=12     empty=4               empty=1
 1 1 1 1 
*/
