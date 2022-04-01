package Shop;

import java.util.Comparator;

public class ProductPriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product product, Product  o) {
        return Integer.compare(product.getProductPrice(),o.getProductPrice());
    }
}
