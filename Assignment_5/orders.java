import java.io.*;
class Orders {
    public static void main(String[] args) {
        try {
            String path = "Text/";
            BufferedReader br = new BufferedReader(new FileReader(path + "Orders.txt"));
            BufferedWriter report = new BufferedWriter(new FileWriter(path + "DailySalesReport.txt"));
            BufferedWriter cancelled = new BufferedWriter(new FileWriter(path + "CancelledOrders.txt"));
            String line;
            double totalSales = 0;
            double highest = -1;
            String highestOrder = "";
            while ((line = br.readLine()) != null) {
                try {
                    String[] p = line.split(",");
                    if (p.length != 6)
                        throw new Exception();
                    int id = Integer.parseInt(p[0]);
                    String customer = p[1];
                    String product = p[2];
                    int quantity = Integer.parseInt(p[3]);
                    double price = Double.parseDouble(p[4]);
                    String status = p[5];
                    if (quantity <= 0 || price < 0)
                        throw new Exception();
                    if (!status.equals("Completed") &&
                        !status.equals("Pending") &&
                        !status.equals("Cancelled"))
                        throw new Exception();
                    double value = quantity * price;
                    if (status.equals("Pending"))
                        System.out.println("Pending: " + customer +
                                           " - " + product);
                    if (status.equals("Completed"))
                        totalSales += value;
                    if (value > highest) {
                        highest = value;
                        highestOrder = "Order " + id;
                    }
                    if (status.equals("Cancelled")) {
                        cancelled.write(line);
                        cancelled.newLine();
                    }
                    report.write(line + ",Order Value=" + value);
                    report.newLine();
                } catch (Exception e) {
                    System.out.println("Invalid order: " + line);
                }
            }
            System.out.println("Total Sales: " + totalSales);
            System.out.println("Highest Value Order: " +
                               highestOrder + " = " + highest);
            br.close();
            report.close();
            cancelled.close();
        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        }
    }
}