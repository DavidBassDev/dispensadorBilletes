package Servicios;

import javax.swing.JOptionPane;

public class ManejadorBillete100 implements IManejadora {
  private IManejadora siguienteManejadora;

  @Override
  public void solicitud(int montoRetirar) {
    // valido si puedo resolverlo aca

    if (montoRetirar >= 100000) {
      if (montoRetirar % 100000 == 0) {
        int cantidadBilletes = montoRetirar / 100000;
        JOptionPane.showMessageDialog(null, "El dispensador te ha entregado " + cantidadBilletes + " de $100.000 pesos",
            "TRANSACCION EXITOSA", 1);
      }

    } else {
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
