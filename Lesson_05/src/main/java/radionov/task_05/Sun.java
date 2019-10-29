package radionov.task_05;

public class Sun {
    private static Sun instance;
    private Sun(){}
    public static Sun getInstance(){
            if(instance == null){
                instance = new Sun();
            }
            return instance;
        }
    }
