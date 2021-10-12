# Graficacion_2D

Transformaciones  Bidimensionales


Las transformaciones nos permiten alterar de una forma uniforme toda la imagen. Es un hecho que a veces es más fácil modificar toda la imagen que una porción de ella. Esto supone un complemento muy útil para las técnicas de dibujo manual, donde es normalmente más fácil modificar una pequeña porción del dibujo que crear un dibujo completamente nuevo.

librerias utilizadas 

![1](https://user-images.githubusercontent.com/71719625/136871257-9050341c-cddb-4e2d-be36-89d1fb73e849.png)

![2](https://user-images.githubusercontent.com/71719625/136871281-563eeffe-41df-43d5-a44e-38806cd99932.png)

se le asigna a todos los botones la  sintaxis para que se  pueda abrir la ventana emergente dependiendo  la eleccion

![3](https://user-images.githubusercontent.com/71719625/136871287-2db4f890-905c-4932-a3fc-c32eec75f288.png)

Ejecucion de la  ventana principal

![ejecucion d graficacion](https://user-images.githubusercontent.com/71719625/136871530-b77a3f32-b8cb-4cdd-9e51-329c305416df.png)

Traslacion
Una traslación es el movimiento en línea recta de un objeto de una posición a otra.

Se traslada un punto de la posición coordenada (X, Y) a una nueva posición (x’, y’) agregando distancias de traslación, Tx y Ty,

Sintaxis de la ventana de Traslacion

primero se empieza declarando las variables que se usaran 

![sintaxis traslacion](https://user-images.githubusercontent.com/71719625/136872850-1a1b0112-fc04-4213-a4f9-7fd976d2a16b.png)

ejecucion de la ventana Traslacion

![ejecucion traslacio](https://user-images.githubusercontent.com/71719625/136873638-42b3e409-11f4-47ff-8e05-bacabbc4b8b8.png)

Su funcionalidad sera  que se tendra que ingresar un numero determinado para las coordenadas(X, Y)



Escalamiento

Una transformación para alterar el tamaño de un objeto se denomina Escalación. 
Esta operación puede efectuarse con polígonos multiplicando los valores coordenados (X, Y)
de cada vértice de frontera por los factores de escalación Sx y Sy para producir las coordenadas transformadas (x’, y’).

Sintaxis de la ventana  Escalamiento

![Sintaxis escalamie](https://user-images.githubusercontent.com/71719625/136873849-3f832cb6-78a4-475c-bf98-3e3d8a9136c1.png)

Se declaran las variables que se usaran, en este caso se añadira la de escaladox y escladoy, las cuales eran en donde se almacenaran los datos ingresados

![Sintaxis escalamie (2)](https://user-images.githubusercontent.com/71719625/136873860-4d5abfc1-af2b-467f-b7c2-f193748c991b.png)


ejecucion de la ventana Escalamiento

![ejecucion escal_1_](https://user-images.githubusercontent.com/71719625/136874146-b17ab74a-eb4f-4552-b5ae-52cdeb815f7c.png)

Al ingresar un numero en  "X" y "Y" el tamaño de nuestra figura ira cambiando

![ejecucion escal_2_](https://user-images.githubusercontent.com/71719625/136874333-22ea9752-7e71-4b96-92ca-977588006cad.png)

Al activar la opcion Uniforme, ambos valores seran iguales, por  lo que la figura tendra lados iguales





Rotacion

La transformación de puntos de un objeto situados en trayectorias circulares es llama rotación.
Este tipo de transformación se especifica con un ángulo de rotación, el cual determina 
la cantidad de rotación de cada vértice de un polígono.


Sintaxis de la ventana Rotacion

![sintaxis rota 1](https://user-images.githubusercontent.com/71719625/136874487-05a67120-7b58-4b1c-8c3b-594112c57c3a.png)

Declaramos las variables

permite implementar un cuadro de selección (básicamente un botón de dos estados)

![sintaxis rota2](https://user-images.githubusercontent.com/71719625/136874876-1905c17e-618d-4df9-bf60-5ee7c3a2ca25.png)



Ejecucion de la ventana Rotacion

![ejecucion rot_1_](https://user-images.githubusercontent.com/71719625/136874949-0fd8e536-3bc3-40f8-8d22-d0d42f97e193.png)

Al ejecutarse se modificara la rotacion de la imagen, siempre y cuando se incremente los grados 

![ejecucion rot_2_](https://user-images.githubusercontent.com/71719625/136875062-bf1a90fc-07c7-4248-a3d2-c7add253b8ac.png)




Sesgado

El sesgado es un tipo de transformación no rígida, pues existe una deformación del objeto original al aplicar dicha transformación.
Existen dos tipos de sesgo: sesgo horizontal y sesgo vertical. 



Sintaxis de la ventana Sesgado

![sintaxis sesga 1](https://user-images.githubusercontent.com/71719625/136875492-fcee5dad-88ec-4b32-acac-bc883cabb276.png)

![sintaxis sesga 2](https://user-images.githubusercontent.com/71719625/136875543-22ac983d-5505-4158-9800-efc49a993c04.png)



Ejecucion de la ventana Sesgado

La primera modificacion que se realizara en la imagen sera en el eje x

![ejecucion sesgado_1_](https://user-images.githubusercontent.com/71719625/136875621-3f9c63f3-c40e-4144-bbae-e6baaf75b848.png)

despues modificamos el eje y, y vemos que la figura se deforma de ambos angulos

![ejecucion sesgado_2_](https://user-images.githubusercontent.com/71719625/136875790-d2330e62-04a4-4512-a82f-7959334c1435.png)


