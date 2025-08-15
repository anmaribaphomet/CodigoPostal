import java.io.BufferedReader;//importo las bibliotecas necesarias, en este caso los lectores de archivo, las excepciones y la lista
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {

        ArrayList<String> lines = new ArrayList<>();
        String direccion = "C:\\codigos_postales.txt"; //Registro en un string la direccion donde guarde el archivo de txt con los datos
        String linea;//recibira cada linea del .txt
        String codigoActual;// variable que leera el primer codigo postal y lo comparara con la siguiente linea
        int contador = 0;//registrara cuantas veces se repite un cp

        try (BufferedReader lector = new BufferedReader(new FileReader(direccion))) {//inicio una excepcion para que no colapse en caso de que ocurra un error en la apertura del archivo

            while ((linea = lector.readLine()) != null) {//devuelve cada linea del texto, o vacio cuando ya finaliza el documento
                lines.add(linea);//registra cada linea de dato que devuelve el .readline, en  el arraylist'
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }//finaliza la excepcion o la imprime en  caso de error


        if (!lines.isEmpty()) {//inicia siempre que el array tenga contenido

            codigoActual    = lines.getFirst().split(",")[0];//lee  la posicion 0 de la linea 1 en este caso el cp, el split delimita cual es esa posicion 0
            //como lo converti a un .txt cada dato se divide por una coma por eso split(",")

           // System.out.println ( codigoActual);// imprimiria solo el primer cp 83000

            for (String s : lines) { //el foreach hara una lectura linea por linea del arraylist (almacenado en S)
                String codigoPostal = s.split(",")[0];// vuelta 1 , primer linea, primer dato (cp)

                if (codigoPostal.equals(codigoActual)) {//si el primer cp es igual al cp almacenado en codigo actual (ca), incrementa el contador
                    contador++;
               } else {//si no, detiene el conteo, imprime cuantas veces se repitio el cp anterior, reemplaza el cp por ca y reinicia el contador a 1
                    System.out.println(" Cp " + codigoActual + " Numero de Asentamientos : " + contador );
                    codigoActual = codigoPostal;
                    contador = 1;
                }//el foreach finaliza una vez que no hayan mas lineas que leer
            }
           //Imprime el ultimo cp que no entro al elsee
            System.out.println(" Cp " + codigoActual + " Numero de Asentamientos : " + contador);
        }
       }
          }

