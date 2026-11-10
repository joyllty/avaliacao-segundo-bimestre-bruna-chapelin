import java.util.ArrayList;
import java.util.List;


public abstract class absObservado {
    
    private List<absObservador> observadores = new ArrayList<>();


    public void adicionarObserver(absObservador observador){
        observadores.add(observador);
    }

    public void removerObserver(absObservador observador){
        observadores.remove(observador);
    }

    public void notificarObservers(){
        for (absObservador observador : observadores) {
            observador.update();
        }
    }
}
