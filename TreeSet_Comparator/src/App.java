import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        Set<Produto> set = new TreeSet<>();

        set.add(new Produto("TV", 900.00));
        set.add(new Produto("Laptop", 400.00));
        set.add(new Produto("Celular", 700.00));

        for(Produto p : set){
            System.out.println(p);
        }

    }
}
