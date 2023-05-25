/**
 * classe che indica una macchina da corsa
 * @author Langone
 */
public class Monoposto extends Thread{
    private String scuderia;
    private String pilota;
    private Box box;
    private Semaforo s;

    /**
     * costruttore
     * @param scuderia la scuderia di cui fa parte la macchina
     * @param pilota nome del pilota
     * @param b il box nel quale viene fatto il pit-stop
     * @param s il semaforo per assicurarsi che nel box possa entrare solo 2 auto
     */
    public Monoposto(String scuderia, String pilota, Box b, Semaforo s) {
        this.scuderia = scuderia;
        this.pilota = pilota;
        this.box = b;
        this.s = s;
    }


    public String getScuderia() {
        return scuderia;
    }


    public String getPilota() {
        return pilota;
    }

    /**
     * compie una gara da 10 giri, ogni 3 giri fa un pit-stop
     */
    @Override
    public void run(){
        int giri;
        for(giri = 1; giri <= 10; giri++){
            if(giri%3 == 0){

                s.P(pilota);
                box.pitstop(pilota);
                s.V();
            }

            System.out.println(pilota + (giri == 1 ? " HA INIZIATO ed" :  "") + " è al giro " + giri);
            try{
                sleep(((int)Math.random()*3001)+1000);
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println(pilota + " HA FINITO");
    }
    
}
