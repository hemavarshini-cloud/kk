public class App {

    public double calculateCost(int tickets, String category) {

        double price;

        if (category.equalsIgnoreCase("Regular")) {
            price = 500;
        } else if (category.equalsIgnoreCase("Premium")) {
            price = 800;
        } else if (category.equalsIgnoreCase("VIP")) {
            price = 1200;
        } else {
            return -1;
        }

        double total = tickets * price;

        if (tickets > 5) {
            total = total - (total * 0.10);
        }

        return total;
    }

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Number of Tickets: ");
        int tickets = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Category (Regular/Premium/VIP): ");
        String category = sc.nextLine();

        App app = new App();
        double total = app.calculateCost(tickets, category);

        System.out.println("\n----- BOOKING DETAILS -----");
        System.out.println("Customer Name: " + name);
        System.out.println("Number of Tickets: " + tickets);
        System.out.println("Category: " + category);
        System.out.println("Total Amount: Rs." + total);

        sc.close();
    }
}
