package abstractclass;

public class Sedan extends Car {
    
    public Sedan() {
        super();
    }
    
    @Override
    protected void init() {
        WHAT_IS_THIS = "SEDAN";
    }
}
