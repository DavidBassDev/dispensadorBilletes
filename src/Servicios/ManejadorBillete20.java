package Servicios;

public class ManejadorBillete20 implements IManejadora {
  private IManejadora siguienteManejadora;
  private int billetesEntregados = 0;

  @Override
  public void solicitud(int montoRetirar) {
    // valido si puedo resolverlo aca

    if (montoRetirar >= 20000) {
      if (montoRetirar % 20000 == 0) {
        int cantidadBilletes = montoRetirar / 20000;

        setBilletesEntregados(cantidadBilletes);
      } else {
        // es necesario pasarlo a otro metodo
        billetesEntregados = montoRetirar / 20000;
        System.out.println("llega al else valor de int" + billetesEntregados);
        setBilletesEntregados(billetesEntregados);
        montoRetirar = montoRetirar - (billetesEntregados * 20000);
        System.out.println("nuevo valor monto a retirar " + montoRetirar);
        siguienteManejadora.solicitud(montoRetirar);
      }

    }
    // si no

    else {
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

  @Override
  public int getBilletesEntregados() {
    return billetesEntregados;
  }

  @Override
  public void setBilletesEntregados(int billetesEntregados) {
    this.billetesEntregados = billetesEntregados;
  }

}
