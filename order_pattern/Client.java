public class Client {
    public static void main(String[] args) {
        Receiver r=new Receiver();
        Command command=new ConcreteCommand(r);
        Invoke i=new Invoke();
        i.setCommand(command);
        i.executeCommand();
    }
}
