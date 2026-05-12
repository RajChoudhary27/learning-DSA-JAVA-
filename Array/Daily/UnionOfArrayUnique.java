import java.util.ArrayList;
import java.util.HashSet;

public class UnionOfArrayUnique {
    static ArrayList<Integer> UniqueUnionMerge(int[] a,int[] b)
    {
       HashSet<Integer> set=new HashSet<>();
       
       for(int x:a)
       {
        set.add(x);
       }
       for(int x:b)
       {
        set.add(x);
       }
       return new ArrayList<>(set);
    }
    public static void main(String[] args) {
        int[] a={1, 2, 3, 2, 1};
        int[] b={3, 2, 2, 3, 3, 2};
        ArrayList<Integer> result = UniqueUnionMerge(a,b);
        System.out.println(result);
    }
}
