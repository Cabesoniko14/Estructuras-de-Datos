
package cap2;

/**
 * @author Silvia Guardati
 * Programa 2.19
 * Ejemplo de herencia simple.
 * Uso de las clases definidas en los programas 2.16, 2.17 y 2.18.
 */

public  class UsaCuentas{
	
    public  static void  main (String [] args) {
        double cant;
		
        /* 
         * Se declara e instancia un objeto de cada uno de los tipos de cuentas definidas por 
         * medio de las clases derivadas.
         */
	CuentaAhorro tuCuenAho = new CuentaAhorro("Isidoro Cañones", 5000,8.5);
        CuentaCheques suCuenChe = new CuentaCheques("Luna Martínez", 30000);
		
	/* Despliegue de la información de las cuentas bancarias. */
	System.out.println(tuCuenAho);
	System.out.println(suCuenChe);
		
	/* Calcula el interés a pagar en la cuenta de ahorro. 
         * Se imprime el resultado obtenido por el método.
         */
	cant = tuCuenAho.calculaInterés();
        System.out.println("\n\nA la cuenta: " + tuCuenAho + "Se le pagó: $" + cant + 
                                       " de interés\n");
		
	/* Se realiza -si el saldo lo permite- un retiro de la cuenta de ahorro y se muestra el 
         * saldo actualizado. En caso de fracaso se despliega un mensaje. 
         * Se invoca a métodos heredados de la clase CuentaBancaria: getNumCta() y getSaldo().
         */
	if (tuCuenAho.retiro(725.32))
	    System.out.println("\n\nRetiro realizado en: " + tuCuenAho.getNumCta() +
                                            "\nNuevo saldo: $" + tuCuenAho.getSaldo() + "\n" );
	else  
	    System.out.println("\n\nRetiro no efectuado en: " + tuCuenAho.getNumCta() + 
                                           " por saldo insuficiente: $" + tuCuenAho.getSaldo() + "\n" );
		
	/* Se realiza un depósito en la cuenta de ahorro -si el monto es correcto- y se despliega el
         * nuevo saldo. En caso contrario se muestra un mensaje.
         */
	if (suCuenChe.depósito(1000))
	    System.out.println("\n\nDepósito realizado en: " + suCuenChe.getNumCta() +
                                           "\nNuevo saldo: $" + suCuenChe.getSaldo() + "\n" );
	else  
	     System.out.println("\n\nDepósito no efectuado en: " + suCuenChe.getNumCta()
                                              + " Error en el dato.\n");
			
        /* Se realiza un retiro de la cuenta de cheque -si el saldo y la cantidad asignada para 
	 * sobre giro lo permite- y se muestra el saldo actualizado. Para ello, se invoca al método 
         * sobreescrito en la subclase. En caso de fracaso se despliega un mensaje. 
         */
	if (suCuenChe.retiro(4100)) 
	    System.out.println("\n\nRetiro realizado en: " + suCuenChe.getNumCta() + 
                                           "\nNuevo saldo: $" + suCuenChe.getSaldo() + "\n" );
	else 
	    System.out.println("\n\nRetiro no efectuado en: " + suCuenChe.getNumCta() +
                                           " por saldo insuficiente: $" + suCuenChe.getSaldo() + "\n" );
    }
}

