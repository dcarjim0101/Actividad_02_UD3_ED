package Actividad_01_UD3_ED;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Clase principal que permite leer el contenido de un archivo binario
 * y mostrarlo por pantalla. Utiliza flujos de entrada para acceder al
 * archivo y un buffer intermedio para mejorar la eficiencia de lectura.
 *
 * @author ana
 * @version 1.0
 */
public class Actividad_01_UD3_ED 
{
    /** Buffer temporal utilizado para almacenar los datos leídos del archivo */
    private static byte[] intermedio = new byte[1000];

    /** Nombre del archivo que se va a leer */
    private static String nombreArchivo = "fichero.dat";

    /** Flujo de entrada para acceder al archivo */
    private static FileInputStream puntoEntrada = null;

    /** Flujo de entrada con buffer para mejorar el rendimiento de lectura */
    private static BufferedInputStream entradaMemoriaTemporal = null;

    /**
     * Inicializa los flujos de entrada necesarios para leer el archivo.
     *
     * @throws FileNotFoundException Se lanza si el archivo no existe
     * o no puede abrirse.
     */
    public static void inicializarArchivos() throws FileNotFoundException
    {
        puntoEntrada = new FileInputStream(nombreArchivo);
        entradaMemoriaTemporal = new BufferedInputStream(puntoEntrada);
    }
    
    /**
     * Lee el contenido del archivo y lo muestra por pantalla.
     * Los datos se leen en bloques utilizando el buffer intermedio.
     *
     * @return Número total de bytes leídos del archivo
     * @throws IOException Se lanza si ocurre un error durante la lectura
     */
    public static int mostrarArchivoTexto() throws IOException
    {
        int total = 0;
        int nRead = 0;

        while((nRead = puntoEntrada.read(intermedio)) != -1) 
        {
            System.out.println(new String(intermedio));
            total += nRead;
        }
        
        return total;
    }
    
    /**
     * Método principal del programa.
     * Inicializa los flujos de lectura, muestra el contenido del archivo
     * y finalmente cierra los recursos utilizados.
     *
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) 
    {        
        try 
        {
            inicializarArchivos();
            
            int total = mostrarArchivoTexto();           

            System.out.println("\nLeídos " + total + " bytes");
        }
        catch(IOException ex) 
        {
            System.out.println("Error -> " + ex.toString());                
        }
        finally 
        {
            try 
            {
                if( entradaMemoriaTemporal != null && puntoEntrada != null )
                {
                    puntoEntrada.close();
                    entradaMemoriaTemporal.close();
                }                
            } 
            catch (IOException ex) 
            {
                System.out.println("Error al cerrar el fichero -> " + ex.toString());
            }
        }
    }
    
}