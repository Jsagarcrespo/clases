Pide al usuario las temperaturas de un día (un valor cada hora durante 24 horas) y almacénalas en un array.

Usando los datos contenidos en el array, calcula la temperatura media, la máxima y la mínima.

Visualiza la información en forma de gráfico de barras. Por ejemplo:

```
 0  ***************  15.0
 1  ***************  15.2
 2  ***************  15.1
 3  ***************  15.2
 4  ***************  15.1
 5  ***************  15.1
 6  **************  14.9  --> MIN
 7  ****************  16.1
 8  ****************  16.5
 9  *****************  17.2
10  *******************  19.5
11  ********************  20.0
12  **********************  22.1
13  ***********************  23.3
14  *************************  25.2
15  **************************  26.3  --> MAX
16  *************************  25.9
17  *************************  25.8
18  ************************  24.2
19  ************************  24.1
20  ********************  20.7
21  *******************  19.6
22  *****************  17.3
23  ****************  16.5
Media: 19.4
```

---------------------------------

**Unidad 4 Arrays de un dia**

*Se organizara en dos bucles:*

    - Una en la leeremos la temperatura y calcularemos la suma, el maximo y minimo 
    - La segunda la usaremos para la grafica de barras. Constituira de dos bucles para que en cada iteracion vaya pniendo '*'

**En cuanto a los arrays:**

- double[] temp = new double[24]; lo usaremos para almacenar un valor de 24.
- En cuanto en el for por cada hora que haya preguntara el grado y se almacenara en 'temp' en la posicion 'i'.
- En para mostrar los asteriscos lo que se ha almacenado en 'temp[i]' por cada bucle que pase de 'for j' 