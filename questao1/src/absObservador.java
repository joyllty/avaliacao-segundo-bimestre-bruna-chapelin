public abstract class absObservador {

    protected Produto observado;


    public absObservador(Produto observado){
        this.observado = observado;
    }

    public abstract void update();

}
