/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p2_examen1_victorcontreras;

/**
 *
 * @author victo
 */
public class Podcast extends Produccion {
    private int NumEpisodios;
    private boolean invitadosInternacionales;

    public Podcast(int NumEpisodios, boolean invitadosInternacionales, String CodigoIdentificacion, String Titulo, int minutos, double presupuestoBase) {
        super(CodigoIdentificacion, Titulo, minutos, presupuestoBase);
        this.NumEpisodios = NumEpisodios;
        this.invitadosInternacionales = invitadosInternacionales;
    }

    public int getNumEpisodios() {
        return NumEpisodios;
    }

    public void setNumEpisodios(int NumEpisodios) {
        this.NumEpisodios = NumEpisodios;
    }

    public boolean isInvitadosInternacionales() {
        return invitadosInternacionales;
    }

    public void setInvitadosInternacionales(boolean invitadosInternacionales) {
        this.invitadosInternacionales = invitadosInternacionales;
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
        return PresupuestoBase + (NumEpisodios *1000);
    }
    @Override
    public String toString() {
        return "Podcast{" + "NumEpisodios=" + NumEpisodios + ", invitadosInternacionales=" + invitadosInternacionales + '}';
    }

    
    
}
