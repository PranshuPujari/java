import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TaxInvoice {
    public static void main(String[] args) {
        // Store details
        String storeName = "Woolworths";
        String storeAddress = "La Trobe Street, Melbourne";
        String contactNumber = "+61 234 567 890";
        
        // Items and prices
        String item1 = "Juice";
        double price1 = 3.70;
        String item2 = "Protein Shake";
        double price2 = 4.75;
        String item3 = "Pasta";
        double price3 = 5.45;
        
        // Calculating total price, GST, and final price
        double totalPrice = price1 + price2 + price3;
        double gst = 0.10 * totalPrice;
        double finalPrice = totalPrice + gst;
        
        // To get current date and time
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String dateTime = now.format(formatter);
        
        // Print invoice
        System.out.println("====================================");
        System.out.println("            " + storeName);
        System.out.println("    " + storeAddress);
        System.out.println("   Contact: " + contactNumber);
        System.out.println("====================================");
        System.out.println("             TAX INVOICE");
        System.out.println("Date & Time: " + dateTime);
        System.out.println("------------------------------------");
        System.out.printf("%-15s %10s\n", "Item", "Price ($)");
        System.out.println("------------------------------------");
        System.out.printf("%-15s %10.2f\n", item1, price1);
        System.out.printf("%-15s %10.2f\n", item2, price2);
        System.out.printf("%-15s %10.2f\n", item3, price3);
        System.out.println("------------------------------------");
        System.out.printf("%-15s %10.2f\n", "Total Price:", totalPrice);
        System.out.printf("%-15s %10.2f\n", "GST (10%):", gst);
        System.out.printf("%-15s %10.2f\n", "Final Price:", finalPrice);
        System.out.println("====================================");
        System.out.println("      Thanks for shopping!");
        System.out.println("====================================");
    }
}

/* Algorithm:
INPUT=> take variables

PROCESS=>compute all data

OUTPUT=> invoice print
  
 */