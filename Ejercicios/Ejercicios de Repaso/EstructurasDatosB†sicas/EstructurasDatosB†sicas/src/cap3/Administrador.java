
package cap3;

/**
 * @author Silvia Guardati
 * Programa 3.7
 * Clase concreta que hereda de la clase Empleado.
 */
public  class Administrador extends Empleado{
    private  String  departamento;

    public Administrador() {
    }
	
    public  Administrador(String  n, String  fn, String  d, String  dep){
        super(n, fn, d);
	departamento = dep;
    }	
    
    /* Método heredado de Empleado y que debe implementar por ser un método 
     * abstracto. Se debe respetar la firma del método, según su declaración en
     * la clase base.
     */		
    public  double calculaPago(double monto){
        double pago;
        if (departamento.equals ("Ventas"))
            pago = monto * 1.5;
        else
            if (departamento.equals ("Recursos Humanos"))
                pago = monto * 1.25;
            else
                if (departamento.equals ("Informática"))
                    pago = monto * 1.6;
                else
                    pago = monto * 1.1;
        return pago;
    }
	
    public  void  setDepartamento(String  dep){
        departamento = dep;
    }
	
    public  String  toString (){
        return "Administrador\n" + super.toString () + "\nDepartamento:\t" + 
                      departamento  + "\n";
    }
}
