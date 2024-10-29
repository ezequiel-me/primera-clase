public class Cajero{
    String nombreDelCliente;
    int balanceDelCliente;
    boolean cuentaDeAhorro;
    public Cajero(String elegirNombreDelCliente, boolean elegirCuentaDeAhorro){
        nombreDelCliente = elegirNombreDelCliente;
        balanceDelCliente = 0;
        cuentaDeAhorro = elegirCuentaDeAhorro;
    }

    public String getNombreCliente(){
        return nombreDelCliente;
    }

    
    public int getBalanceCliente(){
        return balanceDelCliente;
    }
    
    public boolean getCuentaDeAhorro(){
        return cuentaDeAhorro;
    }
    
    public void introducirDinero(int cantidadDeDineroIntroducida){
        int totalCantidadDeDineroIntroducida = cantidadDeDineroIntroducida;
        if(totalCantidadDeDineroIntroducida >= 5){
            balanceDelCliente = balanceDelCliente + cantidadDeDineroIntroducida;
            System.out.println("Has ingresado " + totalCantidadDeDineroIntroducida + " euros");
            System.out.println("Tu saldo actual es de " + balanceDelCliente + " euros");
        }else{
            System.out.println("La cantidad mínima de ingreso son 5 euros");
        }
    }
    
    public void imprimirEstadoObjeto(){
        System.out.println("NOMBRE DEL CLIENTE: " + nombreDelCliente + " | BALANCE DEL CLIENTE: " + balanceDelCliente + " | CUENTA DE AHORRO: " + cuentaDeAhorro);
    
    }
    
    public String devolverEstadoObjeto(){
        String estadoCompleto = "NOMBRE DEL CLIENTE: " + nombreDelCliente + " | BALANCE DEL CLIENTE: " + balanceDelCliente + " | CUENTA DE AHORRO: " + cuentaDeAhorro;
        return estadoCompleto;
    }
}

