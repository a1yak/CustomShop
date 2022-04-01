package Shop;

import java.util.Comparator;

public class ProductNameComparator implements Comparator<Product>
{

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getProductName().compareToIgnoreCase(o2.getProductName());
    }
}
