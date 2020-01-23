public class ShowTable {
    public static void main(String[] args) {
        Table table1 = new Table("IKEA","white", 180);
        Table table2 = new Table("Bodzio","brown", 300);


        System.out.println("Table 1" + "\n" +"producer: " + table1.producer + "\n" + "colour: " + table1.colour + "\n"
        + "price: " + table1.price + "\n");
        System.out.println("Table 2 " + "\n" +"producer: " + table2.producer + "\n" + "colour: " + table2.colour + "\n"
                + "price: " + table2.price + "\n");
    }
}