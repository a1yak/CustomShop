package Shop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Shop shop = new Shop();
        int choise=0, temp =0;
            do {
                try {
                System.out.println("Choose your variant: 1)Add product to a list\n2)Sort list of products" +
                        "\n3)Change information about certain product\n4)Remove product from the list\n5)Show whole list\n6)exit");

                    choise = sc.nextInt();
                switch (choise) {
                    case 1:
                        shop.addProductToList();
                        break;
                    case 2:
                        System.out.println("Which Sort do you want to do (1. Sort by price(from low to high) 2. Sort by product name(A-Z) 3. Sort by newest)");
                               temp = sc.nextInt();
                          
                        switch (temp)
                        {
                            case 1: shop.SortPrice();break;
                            case 2: shop.SortName();break;
                            case 3: shop.SortNewest();break;
                         default: throw new WrongInputException("Incorrect input, try again");
                        }
                        break;
                    case 3:
                        System.out.println("Enter ID of the product you want to change information about");
                        shop.changeInfoAboutProduct(sc.nextInt());
                        break;
                    case 4:
                        System.out.println("Enter ID of the product you want to remove from the list");
                        shop.removeProductFromList(sc.nextInt());
                        break;
                    case 5:
                        shop.ShowList();
                        break;
                    case 6:
                        break;
                    default: throw new WrongInputException("Wrong Input, try again");
                }

        }catch(WrongInputException ex)
        {
            System.out.println(ex);
        } catch(InputMismatchException exception)
                {
                    System.out.println(exception+"  Wrong input, try again");
                    sc = new Scanner(System.in);
                }
        } while (choise != 6);
        sc.close();
    }
}
