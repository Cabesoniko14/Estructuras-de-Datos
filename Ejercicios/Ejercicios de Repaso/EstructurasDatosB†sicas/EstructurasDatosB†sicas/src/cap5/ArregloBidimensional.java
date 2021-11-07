
package cap5;

/**
 * @author Silvia Guardati
 * Programa 5.13
 * Se define una clase para representar a los arreglos bidimensionales genéricos.
 * Se incluyen aquellas operaciones que puedan aplicarse a cualquier tipo de datos.
 */
public class  ArregloBidimensional <T> {
    private T colec[][];
    private int tRen, tCol;
    private final int MAX_REN = 10;
    private final int MAX_COL = 10;

    // Constructor por omisión. Se usan las constantes para instanciar al arreglo.
    public ArregloBidimensional() {
        colec = (T[][]) new Object[MAX_REN][MAX_COL];
        tRen = 0;
        tCol = 0;
    }

    // Se recibe el máximo de renglones y de columnas que tendrá el arreglo.
    public ArregloBidimensional(int maxRen, int maxCol) {
        colec = (T[][]) new Object[maxRen][maxCol];
        tRen = 0;
        tCol = 0;
    }
    
    /* Valida que el índice dado como renglón sea mayor o igual que 0 y menor que el
     * total de renglones asignados al arreglo.
     */
    private boolean validaRen(int índice){
        return índice >= 0 && índice < tRen;
    }
    
    /* Valida que el índice dado como columna sea mayor o igual que 0 y menor que el
     * total de columnas asignadas al arreglo.
     */
    private boolean validaCol(int índice){
        return índice >= 0 && índice < tCol;
    }
    
    /* Se asigna el dato en la casilla indicada. Si los índices están fuera de rango
     * se lanza una excepción.
     */
    public void setElem(int ren, int col, T dato){
        if (validaRen(ren) && validaCol(col))
            colec[ren][col] = dato;
        else
            throw new IndexOutOfBoundsException();
    }
    
    /* Regresa el elemento de la casilla indicada. Si los índices están fuera de rango
     * se lanza una excepción.
     */
    public T getElem(int ren, int col){
        if (validaRen(ren) && validaCol(col))
            return colec[ren][col];
        else
            throw new IndexOutOfBoundsException();
    }

    /* Asigna el total de renglones. Si el valor dado está fuera de rango se lanza
     * una excepción.
     */
    public void settRen(int tRen) {
        if (tRen > 0 && tRen <= colec.length)
            this.tRen = tRen;
        else
            throw new IndexOutOfBoundsException();
    }

    /* Asigna el total de columnas. Si el valor dado está fuera de rango se lanza
     * una excepción.
     */
    public void settCol(int tCol) {
        if (tCol > 0 && tCol <= colec[0].length)
            this.tCol = tCol;
        else
            throw new IndexOutOfBoundsException();
    }

    // Regresa el total de renglones.
    public int gettRen() {
        return tRen;
    }

    // Regresa el total de columnas.
    public int gettCol() {
        return tCol;
    }
    
    // Genera una cadena con el contenido del arreglo, por renglón.
    public String toString(){
        int r, c;
        StringBuilder cad = new StringBuilder();
        
        for (r = 0; r < tRen; r++){
            for (c = 0; c < tCol; c++)
                cad.append(colec[r][c] + "   ");
            cad.append("\n");
        }
        return cad.toString();
    }
    
    /* Cuenta y regresa el total de veces que el dato se encuentra en el renglón
     * dado como parámetro (ren). Si ren está fuera de rango lanza una excepción.
     */
    public int cuentaPorRenglón(int ren, T dato){
        if (validaRen(ren)){
            int c, cont;
            
            cont = 0;
            for (c = 0; c < tCol; c++)
                if (colec[ren][c].equals(dato))
                    cont = cont + 1;
            return cont;
        }
        else
            throw new IndexOutOfBoundsException();        
    }
    
    /* Cuenta y regresa el total de veces que el dato se encuentra en la columna
     * dada como parámetro (col). Si col está fuera de rango lanza una excepción.
     */
    public int cuentaPorColumna(int col, T dato){
        if (validaCol(col)){
            int r, cont;
        
            cont = 0;
            for (r = 0; r < tRen; r++)
                if (colec[r][col].equals(dato))
                    cont = cont + 1;
            return cont;
        }
        else
           throw new IndexOutOfBoundsException();        
    }
}
