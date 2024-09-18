//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double itemCost = 28;
        final double TAX_RATE = 0.05;
        double taxCost = (itemCost * TAX_RATE) + itemCost;
        System.out.println("The cost of your item was: " + itemCost + " and the cost of your item with a 5% tax is: " + taxCost);



    }
}