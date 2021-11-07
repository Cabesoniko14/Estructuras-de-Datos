
package cap5;

/**
 * @author Silvia Guardati
 * Programa 5.14
 * Ejemplo del uso de un objeto tipo ArregloBidimensional (programa 5.13), 
 * parametrizado con la clase String.
 * Se usa para almacenar los nombres de los empleados que se destacaron en cada uno
 * de los departamentos (columnas) de una tienda, a lo largo de los últimos meses 
 * (renglones). 
 */
public class RecursosHumanos {
    private String nomGerente, tel;
    private ArregloBidimensional<String> empDestacados;
    private final int MESES = 12;
    private final int DEPTOS = 6;   

    // Se construye un objeto tipo ArregloBidimensional.
    public RecursosHumanos() {
        empDestacados = new ArregloBidimensional(MESES, DEPTOS);
    }

    // Se construye un objeto tipo ArregloBidimensional y se asignan algunos atributos.
    public RecursosHumanos(String nomGerente, String tel) {
        this();
        this.nomGerente = nomGerente;
        this.tel = tel;
    }
    
    /* Asigna el total de meses de los cuales se almacenarán datos (renglones).
     * Si el método settRen() lanza una excepción (no se pudo asignar), regresa false.
     */
    public boolean asignaMeses(int meses){
        boolean resp = true;
        try{
            empDestacados.settRen(meses);
        }
        catch (Exception e){
            resp = false;
        }
        return resp;        
    }
    
    /* Asigna el total de departamentos (columnas). Si el método settCol() lanza una
     * excepción (no se pudo asignar), regresa false.
     */
    public boolean asignaDeptos(int deptos){
        boolean resp = true;
        try{
            empDestacados.settCol(deptos);
        }
        catch (Exception e){
            resp = false;
        }
        return resp;        
    }
    
    /* Asigna el nombre del empleado que se destacó en un cierto departamento y en
     * un cierto mes. Si el método setElem() lanza una excepción, regresa false.
     */
    public boolean asignaEmpleado(int mes, int depto, String nombreEmp){
        boolean resp = true;
        try{
            empDestacados.setElem(mes, depto, nombreEmp);
        }
        catch(Exception e){
            resp = false;
        }
        return resp;        
    }
    
    // Genera y regresa una cadena con los nombres de los empleados destacados.
    public String generaListaEmpleados(){
        return empDestacados.toString();
    }
    
    /* Dado el nombre de un empleado y un mes, regresa true si dicho empleado se 
     * destacó en ese mes. Si el "mes" está fuera de rango, regresa false.
     */
    public boolean consultaEmpleadoyMes(int mes, String nombreEmp){
       boolean resp;
        try {
            resp = empDestacados.cuentaPorRenglón(mes, nombreEmp) > 0; 
        }
        catch (Exception e){
            resp = false;
        }
        return resp;
    }
    
    /* Dado el número de un depto y el nombre de un empleado, regresa el total de
     * meses en los cuales dicho empleado se destacó. Si el "depto" está fuera de
     * rango, regresa -1.
     */
    public int consultaPorDepto(int depto, String nombreEmp){
        int cont;
        try {
            cont = empDestacados.cuentaPorColumna(depto, nombreEmp);
        }
        catch (Exception e){
            cont = -1;
        }
        return cont;
    }
}
