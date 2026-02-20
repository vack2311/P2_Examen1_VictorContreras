/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p2_examen1_victorcontreras;

/**
 *
 * @author victo
 */
public class Series extends Produccion {

    private int NumeroTemporadas;
    private int CantidadEpisodios;

    public Series(String CodigoIdentificacion, String Titulo, int NumeroTemporadas, double presupuestoBase, int CantidadEpisodios, int minutos) {
        super(CodigoIdentificacion, Titulo, minutos, presupuestoBase);
        this.NumeroTemporadas = NumeroTemporadas;
        this.CantidadEpisodios = CantidadEpisodios;
    }

    public int getNumeroTemporadas() {
        return NumeroTemporadas;
    }

    public void setNumeroTemporadas(int NumeroTemporadas) {
        this.NumeroTemporadas = NumeroTemporadas;
    }

    public int getCantidadEpisodios() {
        return CantidadEpisodios;
    }

    public void setCantidadEpisodios(int CantidadEpisodios) {
        this.CantidadEpisodios = CantidadEpisodios;
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
        return PresupuestoBase + (CantidadEpisodios * 500);
    }

}
