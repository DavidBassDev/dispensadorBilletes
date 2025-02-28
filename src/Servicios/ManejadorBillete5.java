package Servicios;

import javax.swing.JOptionPane;

public class ManejadorBillete5 implements IManejadora {
  private IManejadora siguienteManejadora;
  private int billetesEntregados = 0;

  @Override
  public void solicitud(int montoRetirar) {
    // valido si puedo resolverlo aca

    if (montoRetirar == 5000) {
      if (montoRetirar % 5000 == 0) {
        int cantidadBilletes = montoRetirar / 5000;

        setBilletesEntregados(cantidadBilletes);
      } else {

      }

    } else {
      JOptionPane.showMessageDialog(null, "EL MONTO INGRESADO NO ES MULTIPLO DE 5.000", "ERROR", 0);
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

  @Override
  public int getBilletesEntregados() {
    return billetesEntregados;
  }

  @Override
  public void setBilletesEntregados(int billetesEntregados) {
    this.billetesEntregados = billetesEntregados;
  }

}
