import java.util.ArrayList;
import java.lang.Comparable;

public class Z1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        ArrayUtil.jestPalindromem(list);
    }
}
class ArrayUtil {
    public static<T extends Comparable<? super T>> void jestPalindromem(ArrayList<T> lista) {
        ArrayList<T> nowa = new ArrayList<>();
        ArrayList<T> nowa1 = new ArrayList<>();
        for(T element : lista) {
            for(int i=0;i<lista.size()-1;i++) {
                nowa.add(element);
                nowa1.add(i, element);
            }
        }
        if(nowa.equals(nowa1)) {
            System.out.println("Jest palindromem");
        }
    }
}