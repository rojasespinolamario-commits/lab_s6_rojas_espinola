public class TiempoApp {
    public static void main(String[] args) {

        MonitorTiempo monitor = new MonitorTiempo();

        PantallaLCD pantallaLCD = new PantallaLCD();
        VentanaDeComputador ventana = new VentanaDeComputador();
        PantallaRelojInteligente reloj = new PantallaRelojInteligente();

        monitor.registerObserver(pantallaLCD);
        monitor.registerObserver(ventana);
        monitor.registerObserver(reloj);

        monitor.setTemperatura(20.0f);
    }
}