package Shop;

public class Product
{
    private int ID;
    private String productName;
    private int productPrice;
    private int timeOfAdding;
    public Product(int id, String name, int price, int timeofadd)
    {
        this.ID=id;
        this.productName=name;
        this.productPrice=price;
        this.timeOfAdding = timeofadd;
    }


    public int getID()
        {
            return this.ID;
        }
    public void setID(int id)
    {
        this.ID=id;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return this.productName;
    }

    public int getProductPrice() {
        return this.productPrice;
    }
    public int getTimeOfAdding()
{
    return this.timeOfAdding;
}


}
