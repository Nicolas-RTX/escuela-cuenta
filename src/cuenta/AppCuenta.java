package cuenta;
public class AppCuenta {
    public static void main(String[] args) {
        Cuenta c1=new Cuenta();
        Cuenta c2=new Cuenta("Pedro","256",2,10000);
        
        c1.setNombre("Ana");
        c1.setNroCuenta("512");
        c1.setInteres(40);
        c1.setSaldo(1000000);
        
        System.out.println("\n* CUENTA #1 *\nNombre : "+c1.getNombre()+"\nCuenta : #"+c1.getNroCuenta()+"\nInteres : "+c1.getInteres()+"%\nSaldo : $"+c1.getSaldo());
        System.out.println("\n* CUENTA #2 *\nNombre : "+c2.getNombre()+"\nCuenta : #"+c2.getNroCuenta()+"\nInteres : "+c2.getInteres()+"%\nSaldo : $"+c2.getSaldo()+"\n");
        
        if(c1.ingreso(1000)) System.out.println(c1.getNombre()+", la operacion de Ingreso fue satisfactoria, tu saldo actual es: $"+c1.getSaldo());
        else System.out.println(c1.getNombre()+", la operacion de Ingreso no pudo realizarse, tu saldo actual es: $"+c1.getSaldo());
        
        if(c2.reintegro(100)) System.out.println(c2.getNombre()+", la operacion de Reintegro fue satisfactoria, tu saldo actual es: $"+c2.getSaldo()+"\n");
        else System.out.println(c2.getNombre()+", la operacion de Reintegro no pudo realizarse, tu saldo actual es: $"+c2.getSaldo()+"\n");
        
        if(c1.transferencia(5000,c2)) System.out.println(c1.getNombre()+", la tranferencia hacia "+c2.getNombre()+" fue satisfactoria");
        else System.out.println(c1.getNombre()+", la tranferencia hacia "+c2.getNombre()+" no pudo realizarse");
        System.out.println(c1.getNombre()+", tu saldo actual es: $"+c1.getSaldo()+" | "+c2.getNombre()+", tu saldo actual es de: $"+c2.getSaldo()+"\n");
        
        if(c2.transferencia(2000,c1)) System.out.println(c2.getNombre()+", la tranferencia hacia "+c1.getNombre()+" fue satisfactoria");
        else System.out.println(c2.getNombre()+", la tranferencia hacia "+c1.getNombre()+" no pudo realizarse");
        System.out.println(c1.getNombre()+", tu saldo actual es: $"+c1.getSaldo()+" | "+c2.getNombre()+", tu saldo actual es de: $"+c2.getSaldo()+"\n");
    }
}