public class Singleton {
    private static Singleton instance;
    private static Object object=new Object();

    public static Singleton getInstance(){
        if (instance==null){
            synchronized (object){
                if (instance==null){
                    instance=new Singleton();
                }
            }
        }
        return instance;
    }
}
