package Servicios;

import javax.swing.JOptionPane;

public class ManejadorBillete10 implements IManejadora {
  private IManejadora siguienteManejadora;

  @Override
  public void solicitud(int montoRetirar) {
    // valido si puedo resolverlo aca

    if (montoRetirar >= 10000) {
      if (montoRetirar % 10000 == 0) {
        int cantidadBilletes = montoRetirar / 10000;
        JOptionPane.showMessageDialog(null, "El dispensador te ha entregado " + cantidadBilletes + " de $10.000 pesos",
            "TRANSACCION EXITOSA", 1);
      }

    }
    // si no

    {

      siguienteManejadora.solicitud(montoRetirar);
    }
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
