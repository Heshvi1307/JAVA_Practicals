import java.util.*;
class VendingMachine
{
    enum Coin{ ONE,TWO,FIVE,TEN}
    public static void main(String[] args)
    {
    int price=15;
    int total=0;
    Scanner s=new Scanner(System.in);

    while(total<price)
    {
        System.out.println("Enter the coin :");
        String input = s.nextLine().trim().toUpperCase();
        Coin coin = Coin.valueOf(input);
        int value =0;

        switch(coin)
        {
            case ONE:
            value = 1;
            break;
            case TWO:
            value = 2;
            break;
            case FIVE:
            value = 5;
            break;
            case TEN:
            value =10;
            break;
            default :
            System.out.println("Invalid input.");
            break;
        };
        total+=value;
        System.out.println("Total so far : " + total);
    }
    System.out.println("Paid. Change : " + (total-price));
    s.close();
} 
} 
