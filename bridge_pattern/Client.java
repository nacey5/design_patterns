public class Client {
    public static void main(String[] args) {
        Abstraction ab=new RefineAbstraction();

        ab.setImplementor(new ConcreteImplementorA());
        ab.operation();
        ab.setImplementor(new ConcreteImplementorB());
        ab.operation();

    }
}
