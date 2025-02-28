package Servicios;

public class ManejadorBillete10 implements IManejadora {
  private IManejadora siguienteManejadora;
  private int billetesEntregados = 0;

  @Override
  public void solicitud(int montoRetirar) {
    // valido si puedo resolverlo aca

    if (montoRetirar >= 10000) {
      if (montoRetirar % 10000 == 0) {
        int cantidadBilletes = montoRetirar / 10000;
        System.out.println("cumple condicion");
        setBilletesEntregados(cantidadBilletes);
      } else {
        // es necesario pasarlo a otro metodo
        System.out.println("debo pasarlo "+montoRetirar);
        billetesEntregados = montoRetirar / 10000;
        System.out.println("llega al else valor de int" + billetesEntregados);
        setBilletesEntregados(billetesEntregados);
        montoRetirar = montoRetirar - (billetesEntregados * 10000);
        System.out.println("nuevo valor monto a retirar " + montoRetirar);
        siguienteManejadora.solicitud(montoRetirar);
      }

    }
    // si no
     else
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

  @Override
  public int getBilletesEntregados() {
    return billetesEntregados;
  }

  @Override
  public void setBilletesEntregados(int billetesEntregados) {
    this.billetesEntregados = billetesEntregados;
  }

}
