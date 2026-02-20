/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p2_examen1_victorcontreras;

/**
 *
 * @author victo
 */
public class Documental extends Produccion{
    private String Tema;
    private int mesInvestigacion;

    public Documental(String Tema, String CodigoIdentificacion, int mesInvestigacion, double presupuestoBase, String Titulo, int minutos) {
        super(CodigoIdentificacion, Titulo, minutos, presupuestoBase);
        this.Tema = Tema;
        this.mesInvestigacion = mesInvestigacion;
    }

    public String getTema() {
        return Tema;
    }

    public void setTema(String Tema) {
        this.Tema = Tema;
    }

    public int getMesInvestigacion() {
        return mesInvestigacion;
    }

    public void setMesInvestigacion(int mesInvestigacion) {
        this.mesInvestigacion = mesInvestigacion;
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

    
    
    public int calcularCosto(int PresupuestoBase) {
        return PresupuestoBase + (mesInvestigacion *1000);
    }
    @Override
    public String toString() {
        return "Documental{" + "Tema=" + Tema + ", mesInvestigacion=" + mesInvestigacion + '}';
    }
    
}
