package cuenta;
public class Cuenta {
    private String nombre,nroCuenta;
    private double interes,saldo;
    
    public Cuenta(){};
    public Cuenta(String nNombre,String nNroCuenta,double nInteres,double nSaldo)
    {nombre=nNombre;nroCuenta=nNroCuenta;interes=nInteres;saldo=nSaldo;}

    public void setNombre(String nNombre) {nombre=nNombre;}
    public void setNroCuenta(String nNroCuenta) {nroCuenta=nNroCuenta;}
    public void setInteres(double nInteres) {interes=nInteres;}
    public void setSaldo(double nSaldo) {saldo=nSaldo;}

    public String getNombre() {return nombre;}
    public String getNroCuenta() {return nroCuenta;}
    public double getInteres() {return interes;}
    public double getSaldo() {return saldo;}
    
    public boolean ingreso(double monto) {
        if(monto>0){saldo+=monto;return true;}
        else return false;
    }
    public boolean reintegro (double monto){
        if(monto>0&&saldo>=monto){saldo-=monto;return true;}
        else return false;
    }
    public boolean transferencia (double importe,Cuenta c){
        boolean check1=false,check2=false;
        if(reintegro(importe)){check1=true;if(c.ingreso(importe)){check2=true;}}
        return check1&&check2 ? true : false;
   }
}