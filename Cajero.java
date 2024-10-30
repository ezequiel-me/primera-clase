public class Cajero{
    String nombreDelCliente;
    int balanceDelCliente;
    boolean cuentaDeAhorro;
    public Cajero(String elegirNombreDelCliente, int elBalanceDelCliente){
        nombreDelCliente = elegirNombreDelCliente;
        balanceDelCliente = elBalanceDelCliente;
        cuentaDeAhorro = true;
    }
    
    public int getBalanceCliente(){
        return balanceDelCliente;
    }
    
    public boolean getCuentaDeAhorro(){
        return cuentaDeAhorro;
    }
    
    public void imprimirEstadoObjeto(){
        if(cuentaDeAhorro == true){
            System.out.println("NOMBRE DEL CLIENTE: " + nombreDelCliente + " | BALANCE DEL CLIENTE: " + balanceDelCliente + " | CUENTA DE AHORRO: Verdadero");    
        }else{
            System.out.println("NOMBRE DEL CLIENTE: " + nombreDelCliente + " | BALANCE DEL CLIENTE: " + balanceDelCliente + " | CUENTA DE AHORRO: Falso");
    
        }
    }
    
    public String devolverEstadoObjeto(){
        String estadoCompleto = "NOMBRE DEL CLIENTE: " + nombreDelCliente + " | BALANCE DEL CLIENTE: " + balanceDelCliente + " | CUENTA DE AHORRO: " + cuentaDeAhorro;
        return estadoCompleto;
    }
    
    /*
     * PRIMER METODO
     */
    public void modificarNombreCliente(String nuevoNombreCliente){
        nombreDelCliente = nuevoNombreCliente;
    }
    
    /*
     * SEGUNDO METODO
     */
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
    
    /*
     * TERCER METODO
     */
    public void modificarTipoDeCuenta(){
        if(cuentaDeAhorro == true){
            cuentaDeAhorro = false;
        }else{
            cuentaDeAhorro = true;
        }
    }
    
    public String getNombreCliente(){
        return nombreDelCliente;
    }
}

