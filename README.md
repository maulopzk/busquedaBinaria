## BUSCAR UN NUMERO DENTRO DE UN ARREGLO CON BUSQUEDA BINARIA

Dado un arreglo con elementos unicos y ordenados, mediante
la busqueda binaria se localiza si ún numero se encuentra dentro de ella

## ¿Qué se utilizó para este codigo?

1. Se utiliza un arreglo normal, NO se hacen uso de listas
2. Estructuras de control - Estructuras de control repetitivas
3. Uso de scanner para la entrada de datos

## ¿Como funciona el algoritmo? 

1. Este método usa posiciones para hacer la búsqueda.
2. Busca por mitades

## ¿Posiciones para hacer la búsqueda?

Se puede hacer la búsqueda de un elemento de un arreglo mediante su indice.
En este caso ese indice se obtiene de la siguiente forma:
Dado un valor m = n / 2;
Donde m = posición (indice), n = cantidad de elementos del arreglo

## Obtener valor de m mediante iteraciones

Se actualiza el valor de n siempre y cuando el arreglo evaluado en m sea
diferente a el numero que se desea confirmar su existencia dentro del arreglo

## Condiciones
Dado que el valor de m se va reduciendo en cada iteración, se tienen que ir actualizando
los valores del arreglo de acuerdo a lo siguiente:
Se actualizan los valores del arreglo siempre y cuando el
arreglo evaluado en m sea menor que el numero ingresado anteriormente:
array[m] < numero_a_encontrar


