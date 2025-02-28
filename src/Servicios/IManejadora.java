package Servicios;

public interface IManejadora {



   public void solicitud(int montoRetirar); 

   public void setNext(IManejadora manejadora);

   public IManejadora getNext();

   public int getBilletesEntregados();

   public void setBilletesEntregados(int billetesEntregados);
    

}
