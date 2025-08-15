Etapa 1: Comprensión – Duración: 2 horas.
Analicé la información dada en el documento .csv. Los datos estaban ordenados en secuencia, lo que facilitaba más su conteo.
Planteé ideas de cómo realizarlo, inicialmente considerando el uso de lectores de archivo como FileReader y BufferedReader, junto con el contenedor de datos ArrayList.
Investigé las propiedades de ambas clases y busqué en proyectos anteriores donde había implementado los Readers y el ArrayList.
Como parte final de esta etapa, procedí a hacer la conexión entre GitHub e IntelliJ.

Etapa 2: Borrador – Duración aproximada: 2 horas y 20 minutos.
Antes de empezar a trabajar en la clase principal, decidí probar en una clase aparte la apertura del archivo y su posterior almacenamiento en el ArrayList.
Una vez lograda la prueba anterior, empecé a trabajar en la clase principal.
Traté de dividir el código en métodos, pero no encontré una estructura que se adecuara o, al menos, no tenía el conocimiento necesario. Por ello decidí realizar únicamente una clase main que contuviera todo el procedimiento.

Etapa 3: Aplicación – Duración: 1 hora y 35 minutos.
Una vez que logré compactar todo en la clase principal, tuve un bloqueo, ya que, al ingresar los datos desde un documento exterior al ArrayList, desconocía cómo indicar que el código postal (entero) era el primer dato.
Investigué algún método, clase o librería que me ayudara a establecer un limitador en la lista, y encontré el método split, el cual reconoce los datos hasta el carácter que se indique como separador.
Como decidí pasar los datos a un lector de texto que organizaba la información con comas, mi limitador fueron las comas, y así ya tenía una manera de identificar el código postal como mi dato 0.

Etapa 4: Finalización – Duración: 1 hora.
Ya almacenados e identificados los datos, solo faltaba realizar la comparación para contar los códigos postales.
Primero decidí almacenar el dato 0 (83000) como mi código actual.
Luego utilicé un foreach, el cual hacía una lectura paso a paso de cada línea, comparando el código actual con el dato 0 de la línea de lectura. Si se repetía, aumentaba un contador; de lo contrario, imprimía el conteo anterior y comenzaba uno nuevo con el siguiente código postal.
Finalmente, ya con el código imprimiendo la cantidad de asentamientos, organicé, comenté lo necesario y subí mi repositorio a GitHub.
