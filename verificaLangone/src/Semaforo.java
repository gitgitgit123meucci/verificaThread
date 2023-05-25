public class Semaforo {
    
    private int valore;

    public Semaforo(int valore){
        this.valore = valore;
    }

    public synchronized void P(String name){
        while(valore == 0){
            try{
                System.out.println(name + " è in attesa al pit-stop");
                wait();
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
        valore--;
    }

    public synchronized void V(){
        valore++;
        notify();
    }
}
