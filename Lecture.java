package week04.Invoice;

public class Lecture {
   public static void main(String[] args0) {
      Invoice invoice = new Invoice("1234", "Widget", 10, 2.5);
      System.out.println("Part Number: " + invoice.getPartNumber());
      System.out.println("Part Description: " + invoice.getPartDescription());
      System.out.println("Quantity: " + invoice.getQuantity());
      System.out.println("Price per Item: " + invoice.getPricePerItem());
   }
}
