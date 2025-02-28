
import javax.swing.JOptionPane;

import Servicios.Dispensador;

public class App {
    public static void main(String[] args) throws Exception {

        int montoRetirar = 0;
        boolean entradaCorrecta = false;

        Dispensador manejadoraBase = new Dispensador();

        while (!entradaCorrecta) {
            String monto = JOptionPane.showInputDialog("Ingresa el monto a retirar");

            try {
                montoRetirar = Integer.parseInt(monto);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,
                        "El valor ingresado no es correcto, verifica ingresar solo numeros enteros",
                        "entrada incorrecta",
                        0);

            }

            entradaCorrecta = true;
        }
        if(montoRetirar%5000==0){
        manejadoraBase.solicitud(montoRetirar);
        JOptionPane.showMessageDialog(null, "Hola, este es el resultado de la transaccion en la dispensadora: \n"
                + "Billetes 100.000 : " + manejadoraBase.billetes100Entregados() + "\n" + "Billetes 50.000 : "
                + manejadoraBase.billetes50Entregados() + "\n" + "Billetes 20.000 : " + manejadoraBase.billetes20Entregados() + "\n" + "Billetes 10.000 : "
                + manejadoraBase.billetes10Entregados() + "\n" + "Billetes 5.000 : "
                + manejadoraBase.billetes5Entregados() + "\n" + "TOTAL ENTREGADO "+montoRetirar, "RESULTADO TRANSACCION",
                1);}
                else {
                    JOptionPane.showMessageDialog(null, "Debes ingresar un monto multiplo de 5.000", "MONTO NO VALIDO", 0);
                }
    }
}
