
package cap2;

/**
 * @author Silvia Guardati
 * Programa 2.4
 * Ejemplo de clases anidadas y estáticas. Definición y acceso a sus miembros.
 */
public class ClaseEnvolvente {

    private int ate1;

    public ClaseEnvolvente() {
    }

    public ClaseEnvolvente(int ate1) {
        this.ate1 = ate1;
    }

    /* Este método crea una instancia de la clase ClaseInterior1 y regresa una
     * cadena con los datos del objeto creado.
     */
    public String haceAlgo(){
        ClaseInterior1 objCI = new ClaseInterior1(1);
        return "\nDesde ClaseEnvolvente se imprime un objeto de ClaseInterior1: " + objCI;
    }
    /* Este método crea una instancia de la clase ClaseEstática1 -que es estática y
     * privada. Regresa una cadena con los datos del objeto creado.
     */
    public String haceOtraCosa(){
        ClaseEstática1 objCEst1 = new ClaseEstática1();
        return "\nDesde ClaseEnvolvente se imprime un objeto de ClaseEstática1: " + objCEst1;        
    }

    @Override
    public String toString() {
        return "\nEl atributo de ClaseEnvolvente: " + ate1;
    }

    /* Se define una clase anidada y privada, por lo tanto sólo podrá ser usada
     * dentro de la clase envolvente o exterior. Analice el método haceAlgo().
     */
    private class ClaseInterior1{
        private int ati1;

        private ClaseInterior1() {
        }

        private ClaseInterior1(int ati1) {
            this.ati1 = ati1;
        }

        // Observe que se tiene acceso al atributo de la clase envolvente que es privado.
        public String toString() {
            return "\nAtributo de ClaseInterior1: " + ati1 + " - atributo de la clase exterior: " + ate1;
        }
    }

    /* Se define una clase anidada y protegida, por lo tanto podrá ser usada
     * dentro de la clase envolvente y sus derivadas.
     * El acceso a un objeto de este tipo será a través de un objeto de la clase exterior.
     * Analice el código del programa 2.5.
     */
    protected class ClaseInterior2{
            private int ati2;

            protected ClaseInterior2() {
            }

            protected ClaseInterior2(int ati2) {
                this.ati2 = ati2;
            }

            public String toString() {
            return "\nAtributo de ClaseInterior2: " + ati2;
            }
            
            /* Regresa el objeto de la clase exterior por medio del cual se tuvo acceso
             * a esta clase.
             */
            protected ClaseEnvolvente getClaseEnvolvente(){
                return ClaseEnvolvente.this;
            }
            
            // Regresa el objeto de la clase interior.
            protected ClaseInterior2 getClaseInterior2(){
                return this;
            }
    }

    /* Se define una clase anidada y pública.
     * El acceso a un objeto de este tipo será a través de un objeto de la clase exterior.
     * Analice el código del programa 2.5.
     */
    public class ClaseInterior3{
            private int ati3;

            public ClaseInterior3() {
            }

            public ClaseInterior3(int ati3) {
                this.ati3 = ati3;
            }

            public String toString() {
            return "\nAtributo de ClaseInterior3: " + ati3;
            }
    }

    /* Se define una clase estática y privada. Analice el código del método haceOtraCosa()
     * y del programa 2.5.
     */
    private static class ClaseEstática1{
            private int ats1;

            private ClaseEstática1() {
            }

            private ClaseEstática1(int ats1) {
                this.ats1 = ats1;
            }

            public String toString() {
                return "\nAtributo de ClaseEstática1: " + ats1;
            }
    }

    // Se define una clase estática y protegida. Analice el código del programa 2.5.
    protected static class ClaseEstática2{
            private int ats2;

            protected ClaseEstática2() {
            }

            protected ClaseEstática2(int ats2) {
                this.ats2 = ats2;
            }

            public String toString() {
            return "\nAtributo de ClaseEstática2: " + ats2;
            }
    }

     // Se define una clase estática y pública. Analice el código del programa 2.5.
    public static class ClaseEstática3{
            private int ats3;

            public ClaseEstática3() {
            }

            public ClaseEstática3(int ats3){
                this.ats3 = ats3;
            }

            public String toString() {
                return "\nAtributo de ClaseEstática3: " + ats3;
            }
    }
}
