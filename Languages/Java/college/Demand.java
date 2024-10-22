public class Demand {
    String pid;
    String pname;
    int pdemand;

    Demand(String pid, String pname, int pdemand) {
        this.pid = pid;
        this.pname = pname;
        this.pdemand = pdemand;
    }

    void display() {
        System.out.println("Product ID: " + pid);
        System.out.println("Product Name: " + pname);
        System.out.println("Product Demand: " + pdemand);
    }
}