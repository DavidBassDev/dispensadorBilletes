package Servicios;

import javax.swing.JOptionPane;

public class Dispensador implements IManejadora{
    private IManejadora siguienteManejadora;

    @Override
    public void solicitud(int montoRetirar) {

        
        ManejadorBillete100 primerManejador = new ManejadorBillete100();
        setNext(primerManejador);
        

        ManejadorBillete50 segundoManejador = new ManejadorBillete50();
        primerManejador.setNext(segundoManejador);

        ManejadorBillete20 tercerManejador = new ManejadorBillete20();
        segundoManejador.setNext(tercerManejador);

        ManejadorBillete10 cuartoManejador = new ManejadorBillete10();
        tercerManejador.setNext(cuartoManejador);
        ManejadorBillete5 quintoManejador = new ManejadorBillete5();
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

    

}
