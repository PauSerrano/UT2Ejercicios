# UT2Ejercicios

Esqueletos para los ejercicios del tema 2. Debes forkear el repositorio, importar los proyectos en Eclipse y subir a tu repositorio forkeado las soluciones.

## Ejercicio 1
Tenemos la clase primeNumbers con los métodos isPrime (nos dice si un número es primo) y primesInRange (nos devuelve una lista con los números primos en un rango)

Queremos calcular los números primos entre 2 números y imprimirlos por pantalla.

Requisitos:

* Lee de la entrada estándar 2 números separados por espacio en la primera linea. (Ej: "2 100")
* Utiliza un thread que realice el trabajo y se encargue de imprimir por pantalla la lista resultante.
* Utiliza el método de extender un thread (extends Thread)
* El thread principal debe esperar a la finalización del thread trabajador o "worker".

## Ejercicio 2

Realiza el mismo ejercicio anterior pero utilizando Runnables.

## Ejercicio 3

En este caso intentaremos dividir el trabajo en diferentes threads que se ejecutarán concurrentemente.

Requisitos:

* Lee de la entrada estándar 2 números separados por espacio en la primera linea. (Ej: "1 100")
* Lee de la segunda linea de la entrada estándar el número de threads en los que se tiene que dividir el trabajo.
* Cada thread debe encargarse de realizar una parte equivativa del cálculo
        thread 1 [1..50]
        thread 2 [51..100]
* El thread padre lanzará todos los hilos (mediante un bucle) y guardará una referencia del thread.
* Cada thread debe imprimir por pantalla su id, seguido de la lista de primos en su rango.
* Cada thread siempre tiene que esperar a que finalice el thread anterior antes de imprimir!
* Los ids serán asignados en orden incremental por el thread principal de 1 a N.
* Utiliza el método de implementar Runnable.
* El thread principal debe esperar a la finalización del thread con mayor id (el último).

## Ejercicio 4

Modificación el ejercicio 3 para que se pueda interrumpir el trabajo de los threads "workers" al cabo de un tiempo determinado si no se ha finalizado todavía.

Requisitos:...

* El thread principal debe poder cancelar el trabajo de los threads si se sobrepasa el límite de tiempo.
* Para ello debes utilizar el método interrupt() sobre todos los threads que todavía estén vivos (con el método isAlive(), por ejemplo)
* Los threads deben intentar acabar imprimiendo los resultados parciales que han obtenido.
* El thread principal debe esperar a que finalicen todos los threads.

