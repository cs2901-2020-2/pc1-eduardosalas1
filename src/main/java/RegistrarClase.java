import java.text.Format;
import java.util.Scanner;

public class RegistrarClase {

    private String Clase;

    public static void IniciarSesion(String Nombre) throws VacioException{

        if(Nombre.isEmpty()){
            throw new VacioException("No ingreso nombre alguno");
        }

    }

    public void IngresarFormatoClase(String Clase) throws FormatoException {

        this.Clase = Clase;


        if(ValidarClase(Clase)){
            System.out.println("Validacion correcta: "+"https://utec.zoom.us/rec/share/");
        }else{
            throw new FormatoException("No cumple con el formato establecido");
        }


    }

    public static boolean ValidarClase(String nombre) throws FormatoException {

        String Semestre, Codigo, Idioma , Curso, Seccion, NumeroSemana, Profesor, Fecha, Hora, Tipo;

        if(nombre.isEmpty())
            return false;
        else {
        /*for(int index = 0 ; index < Clase.length(); index++){

        }*/

            return true;
        }

    }

    public static void main(String args[]){

    }



}
