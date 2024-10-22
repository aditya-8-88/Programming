public class Supply extends Demand {
    int pproduced;
    double prate;

    Supply(int pproduct, double prate, String pid, String pname, int pdemand) {
        super(pid, pname, pdemand);
        this.pproduced = pproduced;
        this.prate = prate;
    }

    double calculation() {
        return (prate * pdemand) - (prate * pproduced);
    }

    @Override
    void display(){

        super.display();
        System.out.println("product produced"+pproduced);
        System.out.println("product rate"=prade);
    }

}
