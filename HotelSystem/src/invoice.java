//import java.io.FileWriter;
//import java.io.IOException;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//
//public class invoice extends Customer {
//    private int invoiceId;
//    private double totalAmount;
//
//    public invoice(int id, String name, String email, String contactDetails, String address, String role,int invoiceId, double totalAmount) {
//        super();
//        this.invoiceId = invoiceId;
//        this.totalAmount = totalAmount;
//    }
//
//    private int calculateDays(String checkInDate, String checkOutDate) {
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        LocalDate startDate = LocalDate.parse(checkInDate, formatter);
//        LocalDate endDate = LocalDate.parse(checkOutDate, formatter);
//
//        return (int) startDate.until(endDate).getDays();
//    }
//
//    public void setInvoiceId(int invoiceId) {
//        this.invoiceId = invoiceId;
//    }
//
//    public int getInvoiceId() {
//        return invoiceId;
//    }
//
//    public void setTotalAmount(double totalAmount) {
//        this.totalAmount = totalAmount;
//    }
//
//    public double getTotalAmount() {
//        return totalAmount;
//    }
//
//    public void generateInvoice(String roomType, double roomPricePerDay, String checkInDate, String checkOutDate) {
//        try (FileWriter writer = new FileWriter("invoice_" + getInvoiceId() + ".txt")) {
//            writer.write("Customer: " + getName() + "\n");
//            writer.write("Customer ID: " + getId() + "\n");
//            writer.write("Email: " + getEmail() + "\n");
//            writer.write("Invoice ID: " + invoiceId + "\n");
//            writer.write("Room Type: " + roomType + "\n");
//            writer.write("Checkin: " + checkInDate + "\n");
//            writer.write("Checkout: " + checkOutDate + "\n");
//            writer.write("Total Amount: " + totalAmount + "\n");
//
//            double roomPrice = roomPricePerDay * calculateDays(checkInDate, checkOutDate);
//            writer.write("Room Price Per Day: " + roomPricePerDay + "\n");
//            writer.write("Room Price: " + roomPrice + "\n");
//        } catch (IOException e) {
//            System.out.println("Error generating invoice file: " + e.getMessage());
//        }
//    }
//}