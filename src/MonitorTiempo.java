import java.util.ArrayList;
import java.util.List;

public class MonitorTiempo implements Subject {


    private float temperatura;
    private List<Observer> observers;

    public MonitorTiempo() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.update(temperatura);
        }
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
        notifyObservers();
    }

    public float getTemperatura() {
        return temperatura;
    }
}
