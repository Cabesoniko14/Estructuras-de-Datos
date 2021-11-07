/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio4;

/**
 *
 * @author javi
 */
public class Empresa {
    
    public String nombreEmpresa;
    public String direccion;
    public String nombreDueño;
    private Administrativo[] administrativo;
    private Operario[] operario;
    private int totAdmin;
    private final int MAX_ADMIN = 100;
    private int totOperario;
    private final int MAX_OPERARIO = 100;
    
    public Empresa(){
        operario = new Operario[MAX_OPERARIO];
        totOperario = 0;
        administrativo = new Administrativo[MAX_ADMIN];
        totAdmin = 0;
    }
    
    public Empresa(String nombreEmpresa, String direccion, String nombreDueño){
        this();
        this.nombreEmpresa = nombreEmpresa;
        this.direccion = direccion;
        this.nombreDueño = nombreDueño;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombreDueño() {
        return nombreDueño;
    }

    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }
    
    public int buscaOperario(Operario oper){
        int izq, der, cen;
        izq = 0;
        der = totOperario -1;
        cen = der/1;
        while (izq <= der && !operario[cen].equals(oper)){
            if (operario[cen].compareTo(oper) > 0)
                der = cen -1;
            else
                izq = cen + 1;
            cen = (izq + der)/2;
        }
        if (izq > der)
            cen = -1 * (izq + 1);
        return cen;
    }
    
    public int buscaAdministrativo(Administrativo admin){
        int izq, der, cen;
        izq = 0;
        der = totAdmin -1;
        cen = der/1;
        while (izq <= der && !administrativo[cen].equals(admin)){
            if (administrativo[cen].compareTo(admin) > 0)
                der = cen -1;
            else
                izq = cen + 1;
            cen = (izq + der)/2;
        }
        if (izq > der)
            cen = -1 * (izq + 1);
        return cen;
    }
    
    public boolean altaOperario(int horasExtras, String nombre, double sueldo){
        boolean resp = false;
        
        if (totOperario < operario.length){
            Operario nuevo = new Operario (horasExtras, nombre, sueldo);
            int pos;
            
            pos = buscaOperario(nuevo);
            if (pos < 0){ //No se repite
                resp = true;
                pos = -1*pos -1;
                for (int i = totOperario; i > pos; i--)
                    operario[i] = operario[i-1];
                operario[pos] = nuevo;
                totOperario++; //Para no afectar la búsqueda del for
            }
        }
        return resp;  
    }
    
    public boolean altaAdministrativo(String depto, String tel, String nombre, double sueldo){
        boolean resp = false;
        
        if (totAdmin < administrativo.length){
            Administrativo nuevo = new Administrativo (depto, tel, nombre, sueldo);
            int pos;
            
            pos = buscaAdministrativo(nuevo);
            if (pos < 0){ //No se repite
                resp = true;
                pos = -1*pos -1;
                for (int i = totAdmin; i > pos; i--)
                    administrativo[i] = administrativo[i-1];
                administrativo[pos] = nuevo;
                totAdmin++; //Para no afectar la búsqueda del for
            }
        }
        return resp;  
    }
    
    public String reporteAdmin(){
        StringBuilder cad = new StringBuilder();
        
        for(int i = 0; i < totAdmin; i++)
            cad.append("Nombre del empleado administrativo: " + administrativo[i].getNombreEmpleado() + "\nSueldo base: $" + administrativo[i].getSueldoBase() + "\n");
        
        return cad.toString();
    
    }
    
    public String reporteOperario(){
        StringBuilder cad = new StringBuilder();
        
        for(int i = 0; i < totOperario; i++)
            cad.append("Nombre del operario: " + operario[i].getNombreEmpleado() + "\nSueldo base: $" + operario[i].getSueldoBase() + "\n");
        
        return cad.toString();
    
    }
    
    public void sueldoOperario(int claveUnica, double monto){
        Operario aBuscar = new Operario(claveUnica);
        int pos;
        
        pos = buscaOperario(aBuscar);
        if (pos >= 0)
            operario[pos].setSueldoBase(monto);
    }
    
    public void sueldoAdministrativo(int claveUnica, double monto){
        Administrativo aBuscar = new Administrativo(claveUnica);
        int pos;
        
        pos = buscaAdministrativo(aBuscar);
        if (pos >= 0)
            administrativo[pos].setSueldoBase(monto);
    }
        
    public void aumentaSueldoOperario(int claveUnica, double porcentaje){
        Operario aBuscar = new Operario(claveUnica);
        int pos;
        
        pos = buscaOperario(aBuscar);
        if (pos >= 0)
            operario[pos].aumentaSueldo(porcentaje);
        
    }
    
    public void aumentaSueldoAdmin(int claveUnica, double porcentaje){
        Administrativo aBuscar = new Administrativo(claveUnica);
        int pos;
        
        pos = buscaAdministrativo(aBuscar);
        if (pos >= 0)
            administrativo[pos].aumentaSueldo(porcentaje);
        
    }
    
    public void cambioDepartamento(int claveUnica, String dpto){
        Administrativo aBuscar = new Administrativo(claveUnica);
        int pos;
        
        pos = buscaAdministrativo(aBuscar);
        if (pos >= 0)
            administrativo[pos].setDepartamento(dpto);    
    }
    
    
    public double calculaSalarioOperario(int claveUnica, double prestac, double deduc, double precioHE){
        Operario aBuscar = new Operario(claveUnica);
        int pos;
        
        pos = buscaOperario(aBuscar);
        if (pos >= 0)
            operario[pos].calculaSalario(prestac, deduc, precioHE);
        return operario[pos].calculaSalario(prestac, deduc, precioHE);
        
 
    }
    
    public String generaRep (double monto){
        int cont = 0;
        StringBuilder cad = new StringBuilder();
        
        for (int i = 0; i < totOperario; i++)
            if (operario[i].getSueldoBase() < monto){
                cad.append(operario[i].getNombreEmpleado() + "\n");
                cont++;
            }
        if (cont>0)
            cad.append("Total de operarios con sueldo menor a $" + monto + ": " + cont);
        else
            cad.append("\nNingún operario tiene un sueldo menor a : $" + monto);
        
        return cad.toString();
        
    }
    


}
