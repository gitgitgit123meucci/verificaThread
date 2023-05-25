/**
 * box dove fanno il pit-stop le macchine
 * @author Langone
 */

public class Box{
    
    /**
     * metodo che gestisce il pit-stop
     * @param name nome del pilota che sta entrando nel pit-stop
     */
    public void pitstop(String name){
        System.out.println(name + " sta facendo il pit-stop");

        try{
            Thread.sleep(((int)Math.random()*4001)+1000);
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }

        System.out.println(name + " ha finito il pit-stop");
    }

}
