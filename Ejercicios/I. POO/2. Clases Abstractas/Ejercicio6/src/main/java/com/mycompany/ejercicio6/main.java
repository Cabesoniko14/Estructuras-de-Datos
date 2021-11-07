/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio6;

/**
 *
 * @author javi
 */
public class main {
    
    public static void main(String[] args) {
        
        // PRUEBA ANTES DE INCISO. Dar de alta empleados
        
        Operario pedrito = new Operario(10, "Pedro Aguayo", 25000);
        Administrativo laura = new Administrativo("Laboral", "5551068942", "Laura Aguayo", 30000);
        Operario jack = new Operario("Jack Torrance");
        Administrativo wendy = new Administrativo("Wendy Torrance");
        
        // Probar información de los empleados  (y constructores que solo piden nombre) 
        
        System.out.println("Información de pedrito:\n" + pedrito.toString());
        System.out.println("Información de Laura:\n" + laura.toString());
        System.out.println("Información de Jack:\n" + jack.toString());
        System.out.println("Información de Wendy:\n" + wendy.toString());
        
        // Probar los calculadores de salario
        
        System.out.println("Salario de Laura: $" + laura.calculaSalario(12, 11));
        System.out.println("Salario de Pedrito: $" + pedrito.calculaSalario(17, 11, 100));
        
        // 1) Dar de alta Operario (y Empresa para dar de alta empleados) y Administrativo
        
        Empresa bobbys = new Empresa ("Bobby's", "Private Drive 4", "Peter Parker");
        bobbys.altaAdministrativo("Legal", "55 5568 6946", "Commodus", 18000);
        bobbys.altaAdministrativo("Compliance", "55 6768 6106", "Máximo Décimo Meridio", 36000);
        bobbys.altaOperario(10, "Steve Rogers", 50000);
        bobbys.altaOperario(16, "Peggy Carter", 80000);
        
        // 2) Generar un reporte con los nombres y sueldos de cada empleado administrativo
        
        System.out.println("\nReporte de empleado administrativo\n" + bobbys.reporteAdmin());
        
        // 3) Dada la clave de un empleado administrativo y un porcentaje de aumento, si está registrado, actualizar su sueldo
        
        bobbys.aumentaSueldoAdmin(104, 10);
        System.out.println("Reporte de administrativo\n" + bobbys.reporteAdmin());
        
        // 4) Dada la clave de un empleado administrativo y un nombre de departamento, si está registrado, registrar el cambio de departamento
        
        bobbys.cambioDepartamento(104, "Contaduría");
        bobbys.cambioDepartamento(105, "Recursos Humanos");
        System.out.println("Reporte de administrativo\n" + bobbys.reporteAdmin());
        
        // 5) Dada la clave de un operario y los datos necesarios, si está, imprimir cuánto cobrará este mes
        
        System.out.println("El empleado 106 ganará $:" + bobbys.calculaSalarioOperario(106, 11, 8, 150) + "\n");
        
        // 6) Generar un reporte con los empleados operarios con un sueldo base menor a un cierto parámetro.
        // Incluir total de quienes lo cumplen
        
        System.out.println("Reporte de operarios con sueldo base menor a 70000\n" + bobbys.generaRep(70000));
        

    }
    
}
