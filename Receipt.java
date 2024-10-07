public class Receipt {
    public static void main(String[] args) {
        // Items
        final double APPLE_PRICE = 0.6;
        final double PINEAPPLE_PRICE = 3.59;
        final double RICE_PRICE_PER_LB = 1.39;
        final double KG_PER_RICE_BAG = 2;
        // Unit Conversion
        final double LB_PER_KG = 2.20462;
        // Rice Price
        double lbPerRiceBag = KG_PER_RICE_BAG * LB_PER_KG;
        double ricePricePerBag = lbPerRiceBag * RICE_PRICE_PER_LB;
        // Purchase Information
        String customerName = "Stacey";
        int applesBought = 12;
        int pineapplesBought = 2;
        int riceBagsBought = 3;
        double cashPaid = 40;
        // Extra Purchase Info
        int totalItemCount = applesBought + pineapplesBought + riceBagsBought;
        double totalCost = applesBought * APPLE_PRICE + pineapplesBought * PINEAPPLE_PRICE + riceBagsBought * ricePricePerBag;
        double averageCost = totalCost / totalItemCount;
        
        // Round $
        double roundedTotalCost = Math.round(totalCost * 100) / 100.;
        double roundedAverageCost = Math.round(averageCost * 100) / 100.;
        
        double changeReceived = Math.round((cashPaid - roundedTotalCost) * 100) / 100.;

        // Printed Receipt
        System.out.println("┌──────────────────────────────────");
        System.out.println("│             Receipt");
        System.out.println("│ Customer Name: " + customerName);
        System.out.println("│ Number of Items: " + totalItemCount);
        System.out.println("│ Total Cost: $" + roundedTotalCost);
        System.out.println("│ Average Cost Per Item: $" + roundedAverageCost);
        System.out.println("│");
        System.out.println("│ Cash Tendered: $" + cashPaid);
        System.out.println("│ Change Received: $" + changeReceived);
        System.out.println("│");
        System.out.println("│");
        System.out.println("└──────────────────────────────────");
    }
}