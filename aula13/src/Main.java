public class Main {
    public static void main(String[] args) throws Exception {
        
        for (int i = 0; i < 4; i++) {
            MultiThread thread = new MultiThread(i);
            
            thread.start();
        }


        Thread task = new Thread(new Tarefa());
        task.start();
    }
}
