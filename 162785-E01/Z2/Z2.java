import java.util.ArrayList;

public class Z2 {
    public static <E> void wypiszCoDrugi(Iterable<E> element) {
        for(E i : element) {
            System.out.println(i + ",");
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        wypiszCoDrugi(lista);
    }
}
