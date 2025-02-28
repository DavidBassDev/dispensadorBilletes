

import javax.swing.JOptionPane;

import Servicios.Dispensador;

public class App {
    public static void main(String[] args) throws Exception {
        final Dispensador manejadoraBase = new Dispensador();
        int montoRetirar=0;
        boolean entradaCorrecta = false;
        
        while(!entradaCorrecta){
        String monto = JOptionPane.showInputDialog("Ingresa el monto a retirar");

        try {
            montoRetirar= Integer.parseInt(monto);
            
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "El valor ingresado no es correcto, verifica ingresar solo numeros enteros", "entrada incorrecta",
                    0);

        }
        
        entradaCorrecta = true;
    }
    manejadoraBase.solicitud(montoRetirar);
    }
}
