package Servicios;

public class ManejadorBase implements IManejadora{

       int valorBillete;
       int cantidadDisponible;

       

      
            
    public ManejadorBase(int valorBillete, int cantidadDisponible) {
        this.valorBillete = valorBillete;
        this.cantidadDisponible = cantidadDisponible;
    }

    

    public int getValorBillete() {
        return valorBillete;
    }



    public void setValorBillete(int valorBillete) {
        this.valorBillete = valorBillete;
    }



    public int getCantidadDisponible() {
        return cantidadDisponible;
    }



    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }



    @Override
    public void solicitud(int cantidad) {
       
    }

    @Override
    public void setNext(IManejadora manejadora) {
        
    }



}
