package strategy;

public class Main {
    public static void main(String[] args) {
        Ainterface ainterface = new AinterfaceImpl();

        ainterface.funcA();
        System.out.println("test");
        AObj aObj = new AObj();
        aObj.funcAA();
    }
}
