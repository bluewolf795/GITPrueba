package entornosactividad2;
import java.util.Scanner;

/**
 * Clase notas en la que declaramos las variables y creamos un escaner que luego necesitaremos
 * @author Germán
 */
public class notas {
    /**
     * uf1 = la nota de la primera unidad
     * uf2 = la nota de la segunda unidad
     * uf3 = la nota de la tercera unidad
     */
    double uf1, uf2, uf3;
    /**
     * ac1 = se utilizará para crear la ponderación de la primera unidad en un método más adelante
     * ac2 = se utilizará para crear la ponderación de la primera unidad en un método más adelante
     * ac3 = se utilizará para crear la ponderación de la primera unidad en un método más adelante
     */
    double acu1, acu2, acu3, def;
    //utilizames escaner para poder introducir datos
    Scanner entrada = new Scanner(System.in);
    
    
/**
 * Función que muestra un mensaje por pantalla para dejar saber al usuario cuando debe introducir las notas de la uf1, 2 y 3. * 
 */
    public void IngresaNotas() {
        //cuando ejeuctamos este metodo lo primnero que queremos es que nos pida notas
        System.out.println("ingrese las notas del estudiante");
        
        System.out.println("ingrese nota 1: ");
        
        uf1= entrada.nextDouble();

        
        
        System.out.println("ingrese nota 2: ");
        
        uf2= entrada.nextDouble();
        System.out.println("ingrese nota 3: ");
        
        uf3= entrada.nextDouble();
        
    
    }
    
    // metodo para comprobar bien entroduccion de notas
    /**
     * Método para asegurar que la introducción de datos sea correcta, impidiendo que se escriba un número superior al 10, sin embargo permita que sea inferior a 0.
     */
    public void comprobacion(){
        
        if (uf1>10) {
            System.out.println(" nota1 mal introducida");
            
        }else {
            System.out.println(" nota1 correcta");
        }
        
        if (uf2>10) {
            System.out.println(" nota2 mal introducida");
            
        }else {
            System.out.println(" nota2 correcta");
        }
        if (uf3>10) {
            System.out.println(" nota3 mal introducida");
            
        }else {
            System.out.println(" nota3 correcta");
        }
        
            
        
        
    }
    // metodo para calcular nota
    /**
     * Este método calcula las notas pero no las muestra, pondera las 3 unidades formativas y calcula la nota definitiva
     */
    public void Calculonotas() {
        acu1 = uf1 * 0.35;
        acu2 = uf2 * 0.35;
        acu3 = uf3 * 0.30;
        
        def = acu1 + acu2+ acu3;
        
        //hasta aqui la tenemos calculada pero no la mostramos
    }
    
    /**
     * Esta función muestra las notas por pantalla, todas las unidades formativas y la definitiva con las ponderaciones
     */
    public void Mostrar() {
        //print ln lo que hace es que al terminar el print baja la linea
        System.out.println(" notas introducidas son:");
        System.out.println(" nota1 = " + uf1);
        System.out.println(" nota2 = " + uf2);
        System.out.println(" nota3 = " + uf3);
        
        System.out.println(" acumuado 1 = "+ acu1);
        System.out.println(" acumuado 2 = "+ acu2);
        System.out.println(" acumuado 3 = "+ acu3);
        
        System.out.println(" nota definitiva es = "+ def);
        
    }
    /**
     * En este método no aparece la nota, si no que se muestra por pantalla si el alumno ha aprobado o suspendido, o da error en caso de que el número sea erróneo.
     */
    public void aprobado() {
            
            if(def<5 && def>=0) {
                System.out.println("suspendio");
            }else {
                if (def>=5 && def<=10 ) {
                System.out.println("aprobado");
                }else {
                    System.out.println(" error en la notas");
                }
            }
        }
        
    /**
     * Finalmente tenemos las funciones juntas en el main para que se ejecuten una tras la otra.
     */    
    public static void main(String[] args) {
        // creamos mecanimos para llamar a cualquier metodo fuero de la clase
        notas fc= new notas();
        
        fc.IngresaNotas();
        
        fc.comprobacion();
        

        fc.Calculonotas();
        
        fc.Mostrar();
        
        fc.aprobado();
        
    }

}