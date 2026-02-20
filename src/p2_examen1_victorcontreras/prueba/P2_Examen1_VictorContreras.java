/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p2_examen1_victorcontreras.prueba;

/**
 *
 * @author victo
 */
import java.util.Scanner;
import p2_examen1_victorcontreras.Documental;
import p2_examen1_victorcontreras.Series;


public class P2_Examen1_VictorContreras {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Seleccione un tipo de produccion: ");
        System.out.println("1. Series");
        System.out.println("2. Documentales");
        System.out.println("3. Podcast");
        int op = leer.nextInt();
        switch(op){
            case 1:
                Series();
                break;
            case 2:
                Documentales();
                break;
            case 3:
                Podcast();
        }
    }
    public static void Series(){
        boolean destacada = false;
        Scanner leer = new Scanner(System.in);
        System.out.println("Código único de identificación: ");
        String CodigoIdentificacion = leer.next();
        System.out.println("Titulo: ");
        String Titulo = leer.next();
        System.out.println("Duración en minutos: ");
        int minutos = leer.nextInt();
        System.out.println("Presupuesto base: ");
        double presupuestoBase = leer.nextDouble();
        System.out.println("Numero de temporadas: ");
        int NumeroTemporadas = leer.nextInt();
        if (NumeroTemporadas > 3) {
            destacada = true;
        }else{
            destacada = false;
        }
        System.out.println("Cantidad Episodios: ");
        int CantidadEpisodios = leer.nextInt();
        Series nuevaSerie = new Series(CodigoIdentificacion, Titulo, minutos, presupuestoBase, NumeroTemporadas, CantidadEpisodios);
        System.out.println(nuevaSerie.getCodigoIdentificacion());
        System.out.println(nuevaSerie.getTitulo());
        System.out.println(nuevaSerie.getMinutos());
        System.out.println(nuevaSerie.getPresupuestoBase());
        System.out.println(nuevaSerie.getNumeroTemporadas());
        System.out.println(nuevaSerie.getCantidadEpisodios());
        if ( destacada = true) {
            System.out.println("Esta serie puede ser destacada! ");
        }
        }
    }
    public static void Documentales(){
        boolean destacada = false;
        Scanner leer = new Scanner(System.in);
        System.out.println("Código único de identificación: ");
        String CodigoIdentificacion = leer.next();
        System.out.println("Titulo: ");
        String Titulo = leer.next();
        System.out.println("Duración en minutos: ");
        int minutos = leer.nextInt();
        System.out.println("Presupuesto base: ");
        double presupuestoBase = leer.nextDouble();
        System.out.println("Tema: ");
        String Tema = leer.next();
        System.out.println("Meses de investigacion: ");
        int mesInvestigacion = leer.nextInt();
        if (mesInvestigacion > 6) {
            destacada = true;    
        }else{
            destacada = false;    
        }
        Documental nuevoDocumental = new Documental(CodigoIdentificacion, Titulo, minutos,presupuestoBase , Tema, mesInvestigacion);
        System.out.println(nuevoDocumental.getCodigoIdentificacion());
        System.out.println(nuevoDocumental.getTitulo());
        System.out.println("");
    }
    public static void Podcast(){
        boolean destacada = false;
        boolean invitadosInternacionales = false;
        Scanner leer = new Scanner(System.in);
        System.out.println("Código único de identificación: ");
        String CodigoIdentificacion = leer.next();
        System.out.println("Titulo: ");
        String Titulo = leer.next();
        System.out.println("Duración en minutos: ");
        int minutos = leer.nextInt();
        System.out.println("Presupuesto base: ");
        double presupuestoBase;
        System.out.println("Numero de episodios: ");
        int numEpisodios = leer.nextInt();
        System.out.println("Tiene invitados internacionales: 1/si 2/no");
        int op = leer.nextInt();
        if ("1".equals(op)) {
             invitadosInternacionales = true;
             destacada = true;
        }else if ("2".equals(op)) {
            invitadosInternacionales = false;
            destacada = false;
        }
            
        }
}


