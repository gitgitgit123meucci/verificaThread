public class App {
    public static void main(String[] args) throws Exception {
        Box b = new Box();
        Semaforo s = new Semaforo(1);
        Monoposto m1 = new Monoposto("ferrari", "marcello", b, s);
        Monoposto m2 = new Monoposto("bugatti", "faginali", b, s);
        Monoposto m3 = new Monoposto("porche", "soso", b, s);

        m1.start();
        m2.start();
        m3.start();

        m1.join();
        m2.join();
        m3.join();
    }
}
