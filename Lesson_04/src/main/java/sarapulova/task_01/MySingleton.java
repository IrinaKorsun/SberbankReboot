package sarapulova.task_01;

public class MySingleton {
    private static MySingleton mySingleton;
    private MySingleton(){}

    public static MySingleton getMySingleton(){
        if(mySingleton == null){
            mySingleton = new MySingleton();
        }
        return mySingleton;
    }
}
