package Shop;

import java.util.*;

import static java.util.Collections.sort;

public class Shop
{
    private List<Product> listofproducts = new LinkedList<Product>();
    Scanner sc = new Scanner(System.in);

    public Shop()
    {

    }

    public List<Product> addProductToList()
    {
        System.out.println("Enter product name");
        String name = sc.next();
        System.out.println("Enter product price");
        int price = sc.nextInt();
        System.out.println("Enter product Id");
        int id = sc.nextInt();
        boolean check = true;
        ListIterator<Product> listIterator =  listofproducts.listIterator();
        while(listIterator.hasNext())
        {
            if(listIterator.next().getID()==id) {
                check = false;
                System.out.println("This ID is already registered, try another one");
            }
        }
        if(check) {
            Product product = new Product(id, name, price, listofproducts.size()+1);
            listofproducts.add(product);
        }
        return listofproducts;
    }
    public List<Product> removeProductFromList(int id)
    {
        if(listofproducts.size()==0)
        {System.out.println("List is empty, nothing to remove from!!"); return listofproducts;}
        boolean isIn = true;
        ListIterator<Product> listIterator =  listofproducts.listIterator();
      while(listIterator.hasNext()) {
          if (listIterator.next().getID() == id) {
              listofproducts.remove(listIterator.previous());
              return listofproducts;
          }
      }
      if(isIn)
          System.out.println("No such Id in the List");
      return listofproducts;
    }
    public void ShowList()
    {
        int counter = 1;
        ListIterator<Product> listIterator =  listofproducts.listIterator();
        if(listofproducts.size()==0)
        {
            System.out.println("The List is empty!!");
        }
        while(listIterator.hasNext())
        {
            System.out.println(counter+") "+listIterator.next().getProductName()+"\n Product ID: "+listIterator.previous().getID()
                    +"\nPrice: "+listIterator.next().getProductPrice());
            counter++;
        }
    }
    public List<Product> changeInfoAboutProduct(int identificator)
    {
        if(listofproducts.size()==0)
        {System.out.println("List is empty, nothing to change!!"); return listofproducts;}
        ListIterator<Product> listIterator =  listofproducts.listIterator();
        while(listIterator.hasNext())
        {
            if(listIterator.next().getID()==identificator) {
                System.out.println("Enter new product ID:");
                listIterator.previous().setID(sc.nextInt());
                System.out.println("Enter new product name:");
                listIterator.next().setProductName(sc.next());
                System.out.println("Enter new product price:");
                listIterator.previous().setProductPrice(sc.nextInt());
                return listofproducts;
            }
        }
        System.out.println("There is no such product on the list");
        return listofproducts;
    }
    public List<Product> SortName()
    {
        if(listofproducts.size()==0)
        {System.out.println("List is empty, nothing to sort!!!"); return listofproducts;}
        ProductNameComparator comp = new ProductNameComparator();
        listofproducts.sort(comp);
        return listofproducts;
    }
    public List<Product> SortPrice()
    {
        if(listofproducts.size()==0)
        {System.out.println("List is empty, nothing to sort!!!"); return listofproducts;}
        ProductPriceComparator comp = new ProductPriceComparator();
        listofproducts.sort(comp);
        return listofproducts;
    }
    public List<Product> SortNewest()
    {
        if(listofproducts.size()==0)
        {System.out.println("List is empty, nothing to sort!!!"); return listofproducts;}
            ProductNewestComparator comp = new ProductNewestComparator();
        listofproducts.sort(comp);
        return listofproducts;
    }
    public int getValue()
    {
        return listofproducts.size()+1;
    }


    // sc.close();
};
