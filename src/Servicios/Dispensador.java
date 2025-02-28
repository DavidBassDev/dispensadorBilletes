package Servicios;



public class Dispensador implements IManejadora{
    private IManejadora siguienteManejadora;
    private int BilletesEntregados=0;
    ManejadorBillete100 primerManejador = new ManejadorBillete100();
    ManejadorBillete50 segundoManejador = new ManejadorBillete50();
    ManejadorBillete20 tercerManejador = new ManejadorBillete20();
    ManejadorBillete10 cuartoManejador = new ManejadorBillete10();
    ManejadorBillete5 quintoManejador = new ManejadorBillete5();

    @Override
    public void solicitud(int montoRetirar) {

        
        setNext(primerManejador);
        primerManejador.getBilletesEntregados();
        

        
        primerManejador.setNext(segundoManejador);

        
        segundoManejador.setNext(tercerManejador);

        
        tercerManejador.setNext(cuartoManejador);
        
        cuartoManejador.setNext(quintoManejador);
        primerManejador.solicitud(montoRetirar);

        

    }

    @Override
    public void setNext(IManejadora siguienteManejadora) {
        this.siguienteManejadora = siguienteManejadora;
    }

    @Override
    public IManejadora getNext() {
        return siguienteManejadora;
    }

    @Override
    public int getBilletesEntregados() {
        return BilletesEntregados;
    }

    @Override
    public void setBilletesEntregados(int billetesEntregados) {
        this.BilletesEntregados = BilletesEntregados;
    }

    public int billetes100Entregados () {
       return primerManejador.getBilletesEntregados();
    }

    public int billetes50Entregados () {
        return segundoManejador.getBilletesEntregados();
    }

    public int billetes20Entregados () {
        return tercerManejador.getBilletesEntregados();
    }

    public int billetes10Entregados () {
        return cuartoManejador.getBilletesEntregados();
    }
    public int billetes5Entregados () {
        return quintoManejador.getBilletesEntregados();
    }

    

}
