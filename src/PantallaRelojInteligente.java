public class PantallaRelojInteligente implements Observer, ElementosDespliegue {

    @Override
    public void update (float temperatura) {
        mostrar(temperatura);
    }

    @Override
    public void mostrar(float temperatura) {
        System.out.println("La temperatura en la pantalla de reloj inteligente es: " + temperatura);
    }
}
