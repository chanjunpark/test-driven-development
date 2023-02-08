package abstractclass;

public abstract class Car {
    
    protected String WHAT_IS_THIS;
    
    public Car() {
        init();
    }
    
    protected abstract void init();
}
