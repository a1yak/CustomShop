package Shop;

import java.util.Comparator;

public class ProductNewestComparator implements Comparator<Product> {
    @Override
    public int compare(Product product, Product  o) {
        return Integer.compare(o.getTimeOfAdding(),product.getTimeOfAdding());
    }
}
