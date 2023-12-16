import java.util.*;
public class currency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double converted;
        double euro=0.011;
        double usd=0.012;
        double dirham=0.044;
        System.out.println("WELCOME TO CURRENCY CONVERTER: \nEnter amount in Rupee: ");
        int rupee=sc.nextInt();
        System.out.println("Enter currency to convert to (EUR/USD/DIRHAM)");
        String currency=sc.next();
        currency=currency.toUpperCase();
        switch (currency) {
            case "EUR":
                converted=euro*rupee;
                break;
            case "USD":
                converted=usd*rupee;
                break;
            case "DIRHAM":
                converted=dirham*rupee;
                break;
            default:
                System.out.println("Invalid");
                return;
        }System.out.println(rupee+" Rupee is equal to "+ converted+" "+currency);
    }
}
