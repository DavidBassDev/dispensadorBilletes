import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Por favor ingresa la cantidad de dinero a retirar");
        Scanner scanner = new Scanner(System.in);
        int cantidad = scanner.nextInt();
        validarSolicitud(cantidad);
       
    }

    
    public static boolean validarSolicitud(int cantidad) {
        boolean multiploDe5 = false;
        if(cantidad % 5000==0){
            multiploDe5 = true;
            System.out.println("es valido");
        }
        return multiploDe5;
    }
}
