/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p2_examen1_victorcontreras;

/**
 *
 * @author victo
 */
public class Produccion {
    protected  String CodigoIdentificacion;
    protected String Titulo;
    protected int minutos;
    protected double presupuestoBase;

    public Produccion(String CodigoIdentificacion, String Titulo, int minutos, double presupuestoBase) {
        this.CodigoIdentificacion = CodigoIdentificacion;
        this.Titulo = Titulo;
        this.minutos = minutos;
        this.presupuestoBase = presupuestoBase;
    }

    public String getCodigoIdentificacion() {
        return CodigoIdentificacion;
    }

    public void setCodigoIdentificacion(String CodigoIdentificacion) {
        this.CodigoIdentificacion = CodigoIdentificacion;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public double getPresupuestoBase() {
        return presupuestoBase;
    }

    public void setPresupuestoBase(double presupuestoBase) {
        this.presupuestoBase = presupuestoBase;
    }
    public int calcularCosto(){
        
        return 0;
        
    }
    @Override
    public String toString() {
        return "Produccion{" + "CodigoIdentificacion=" + CodigoIdentificacion + ", Titulo=" + Titulo + ", minutos=" + minutos + ", presupuestoBase=" + presupuestoBase + '}';
    }



    
    
}
