import java.util.Scanner;

public class practica {
    public static void main(String[] args) {
    Funciones primeraClase = new Funciones();
    Funciones segundaClase = new Funciones();
    Funciones terceraClase = new Funciones();
    Funciones cuartaClase = new Funciones();

    Scanner teclado = new Scanner(System.in);
    boolean salir = true;
    
    while (salir == true) {
        //5. Mostrar menú
        //Crear un método sin argumentos ni retorno que imprima un menú con varias opciones.
        primeraClase.mostrarMenu();
        int opcion = teclado.nextInt();
        teclado.nextLine(); // Limpiar el buffer después de leer un número
        switch(opcion){
            
//1. Mostrar mensaje fijo
//Crear un método llamado mostrarSaludo() que imprima “Hola, mundo”.

case 1:
    primeraClase.mostrarSaludo();
    System.out.println("Presione Enter para continuar...");
    teclado.nextLine(); // Espera a que el usuario presione Enter
    cuartaClase.limpiarConsola(); // Limpia la consola
    break;


//2. Saludo personalizado
//Crear un método llamado saludar(String nombre) que reciba un nombre como parámetro e imprima un saludo.

case 2:
    System.out.println("Ingrese su nombre:");
    String Nombre = teclado.nextLine();
    if (Nombre.isEmpty()){
        System.out.println("No ingresaste un nombre, por favor intentalo de nuevo");
        break;
    }
    primeraClase.saludar(Nombre);
    System.out.println("Presione Enter para continuar...");
    teclado.nextLine(); // Espera a que el usuario presione Enter
    cuartaClase.limpiarConsola(); // Limpia la consola
    break;


//3. Área de un rectángulo
//Crear un método que reciba dos argumentos (base, altura) y devuelva el área del rectángulo.

case 3:
    System.out.println("Ingrese la Base del rectángulo:");
    double base = teclado.nextDouble();
    if (base <= 0){
        System.out.println("La Base no puede ser menor o igual a 0");
        System.out.println("Presione Enter para continuar...");
        teclado.nextLine(); // Espera a que el usuario presione Enter
        cuartaClase.limpiarConsola(); // Limpia la consola
        break;
    }
    System.out.println("Ingrese la Altura del rectángulo:");
    double altura = teclado.nextDouble();
    if (altura <= 0){
        System.out.println("La Altura no puede ser menor o igual a 0");
        System.out.println("Presione Enter para continuar...");
        teclado.nextLine(); // Espera a que el usuario presione Enter
        cuartaClase.limpiarConsola(); // Limpia la consola
        break;
    }
    double area = primeraClase.calcularArea(base, altura);
    System.out.println("El área del rectángulo es: " + area);
    teclado.nextLine(); // Limpiar el buffer después de leer números
    System.out.println("Presione Enter para continuar...");
    teclado.nextLine(); // Espera a que el usuario presione Enter
    cuartaClase.limpiarConsola(); // Limpia la consola
    break;

//4. Convertir a mayúsculas
//Crear un método que reciba una cadena de texto y devuelva esa cadena en mayúsculas.

case 4:
    System.out.println("Ingrese la palabra a convertir en mayusculas:");
    String cadena = teclado.nextLine();
    if (cadena.isEmpty()){
        System.out.println("No se puede convertir a Mayusculas un texto vacio");
    teclado.nextLine(); // Limpiar el buffer después de leer números
    System.out.println("Presione Enter para continuar...");
    teclado.nextLine(); // Espera a que el usuario presione Enter
        cuartaClase.limpiarConsola(); // Limpia la consola
        break;
    }
    String conversion = primeraClase.convertirMayusculas(cadena);
    System.out.println("La conversion es:" + conversion);
    teclado.nextLine(); // Limpiar el buffer después de leer números
    System.out.println("Presione Enter para continuar...");
    teclado.nextLine(); // Espera a que el usuario presione Enter
    cuartaClase.limpiarConsola(); // Limpia la consola
    break;

/////////////////////////////////////////////////////////////////

//Nivel 2
//6. Número par o impar
//Crear un método esPar(int numero) que devuelva true si el número es par, y false si es impar.

case 5:
    System.out.println("Ingrese el numero que desea saber si es impar o par:");
    int numero = teclado.nextInt();
    if (numero <= 0){
        System.out.println("No se puede procesar este número");
    teclado.nextLine(); // Limpiar el buffer después de leer números
    System.out.println("Presione Enter para continuar...");
    teclado.nextLine(); // Espera a que el usuario presione Enter
        cuartaClase.limpiarConsola(); // Limpia la consola
        break;
    }
    boolean parImpar = segundaClase.esPar(numero);
    System.out.println("El numero es par:" + parImpar);
    teclado.nextLine(); // Limpiar el buffer después de leer números
    System.out.println("Presione Enter para continuar...");
    teclado.nextLine(); // Espera a que el usuario presione Enter
    cuartaClase.limpiarConsola(); // Limpia la consola
    break;

//7. Calcular el cuadrado de un número
//Crear un método que reciba un entero y devuelva su cuadrado.

case 6:
    System.out.println("Ingrese el numero que desea saber el cuadrado:");
    double numeroCuadrado = teclado.nextDouble();
    double cuadrado = segundaClase.cuadradoNumero(numeroCuadrado);
    System.out.println("El cuadrado del numero solicitado es:" + cuadrado);
    teclado.nextLine(); // Limpiar el buffer después de leer números
    System.out.println("Presione Enter para continuar...");
    teclado.nextLine(); // Espera a que el usuario presione Enter
    cuartaClase.limpiarConsola(); // Limpia la consola
    break;

//8. Factorial recursivo
//Crear un método recursivo que calcule el factorial de un número.

case 7:
    System.out.println("Ingrese el numero del cual desea saber el factorial:");
    int calculoFactorial = teclado.nextInt();
    int numeroFactorial = segundaClase.calcularFactorial(calculoFactorial);
    System.out.println("El factorial del numero " + calculoFactorial + " es:" + numeroFactorial);
    teclado.nextLine(); // Limpiar el buffer después de leer números
    System.out.println("Presione Enter para continuar...");
    teclado.nextLine(); // Espera a que el usuario presione Enter
    cuartaClase.limpiarConsola(); // Limpia la consola
    break;




/////////////////////////////////////////////////////////////////

// Nivel 3
//9. Sumar múltiples números (varargs)
//Crear un método sumarNumeros(int... numeros) que reciba una cantidad indefinida de enteros y devuelva la suma.

case 8:
        System.out.println("Ingrese la cantidad de numeros que desea sumar:");
        int cantidadNumeros = teclado.nextInt();
        if (cantidadNumeros <= 0){
            System.out.println("Cantidad inválida. Ingrese un número positivo.");
    teclado.nextLine(); // Limpiar el buffer después de leer números
    System.out.println("Presione Enter para continuar...");
    teclado.nextLine(); // Espera a que el usuario presione Enter
            cuartaClase.limpiarConsola(); // Limpia la consola
            break;
        }
        System.out.println("Ingrese los numeros:");
        int[] arrayNumeros = new int[cantidadNumeros];
        for (int i = 0; i < cantidadNumeros; i++) {
            arrayNumeros[i] = teclado.nextInt();
        }
        int suma = terceraClase.sumarNumeros(arrayNumeros); //Llama al metodo sumarNumeros y le pasa el array como argumento
        System.out.println("La suma de los numeros es: " + suma);
    teclado.nextLine(); // Limpiar el buffer después de leer números
    System.out.println("Presione Enter para continuar...");
    teclado.nextLine(); // Espera a que el usuario presione Enter
        cuartaClase.limpiarConsola(); // Limpia la consola
        break;

//10. Promedio de un array
//Crear un método que reciba un array de double y retorne el promedio.

case 9:
    System.out.println("Ingrese la cantidad de doubles a cargar:");
    int cantidadDoubles = teclado.nextInt();
    if (cantidadDoubles <= 0){
        System.out.println("Cantidad inválida. Ingrese un número positivo.");
    teclado.nextLine(); // Limpiar el buffer después de leer números
    System.out.println("Presione Enter para continuar...");
    teclado.nextLine(); // Espera a que el usuario presione Enter
        cuartaClase.limpiarConsola(); // Limpia la consola
        break;
    }
    System.out.println("Ingrese los doubles:");
    double[] arrayDoubles = new double[cantidadDoubles];
    for (int i = 0; i < cantidadDoubles; i++){
        arrayDoubles[i] = teclado.nextDouble();
    }
    double promedio = terceraClase.calcularPromedio(arrayDoubles);
    System.out.println("El promedio de los numeros sumados es:" + promedio);
    teclado.nextLine(); // Limpiar el buffer después de leer números
    System.out.println("Presione Enter para continuar...");
    teclado.nextLine(); // Espera a que el usuario presione Enter
    cuartaClase.limpiarConsola(); // Limpia la consola
    break;


//11. Buscar valor en array
//Crear un método que reciba un array de int y un número a buscar, y devuelva true si el número está presente.


case 10:
    System.out.println("Ingrese la cantidad de numeros a cargar:");
    int cantidadNums = teclado.nextInt(); //Solicita cantidad de numeros a cargar
    if (cantidadNums <= 0){
        System.out.println("Cantidad inválida. Ingrese un número positivo.");
        teclado.nextLine(); // Limpiar el buffer después de leer números
        System.out.println("Presione Enter para continuar...");
        teclado.nextLine(); // Espera a que el usuario presione Enter
        cuartaClase.limpiarConsola(); // Limpia la consola
        break;
    }
    System.out.println("Ingrese los numeros:");
    int[] arrayBusqueda = new int[cantidadNums];
    for (int i = 0; i < cantidadNums; i++) {
        arrayBusqueda[i] = teclado.nextInt();
    }
    System.out.println("Ingrese el numero a buscar en la lista:");
    int numeroABuscar = teclado.nextInt();
    boolean encontrado = terceraClase.buscarNumero(arrayBusqueda, numeroABuscar);
    if (encontrado == true){
        System.out.println("El numero SI esta dentro de la lista");
    } else {
        System.out.println("El numero NO esta dentro de la lista");
    }
    teclado.nextLine(); // Limpiar el buffer después de leer números
    System.out.println("Presione Enter para continuar...");
    teclado.nextLine(); // Espera a que el usuario presione Enter
    cuartaClase.limpiarConsola(); // Limpia la consola
    break;

// 12. Contar ocurrencias
// Crear un método que reciba un array de String y un string clave, y devuelva cuántas veces aparece.

case 11:
    System.out.println("Ingrese un texto:");
    String texto = teclado.nextLine();
    System.out.println("Ingrese la letra/clave que desea buscar:");
    char letra = teclado.next().charAt(0);
    if (letra == ' '){
        System.out.println("No se puede buscar un espacio en blanco");
        teclado.nextLine(); // Limpiar el buffer después de leer números
        System.out.println("Presione Enter para continuar...");
        teclado.nextLine(); // Espera a que el usuario presione Enter
        cuartaClase.limpiarConsola(); // Limpia la consola
        break;
    }
    int conteoLetra = terceraClase.buscarLetra(texto, letra);
    System.out.println("La letra " + letra + " aparece:" + conteoLetra + " veces");
    teclado.nextLine(); // Limpiar el buffer después de leer números
    System.out.println("Presione Enter para continuar...");
    teclado.nextLine(); // Espera a que el usuario presione Enter
    cuartaClase.limpiarConsola(); // Limpia la consola
    break;


// 🔹 Nivel 4 – Métodos combinados y más complejos

// 13. Imprimir array de forma formateada
// Crear un método que reciba un array de enteros y los imprima entre corchetes, separados por comas.

case 12:
    System.out.println("Ingrese la cantidad de enteros que quiere cargar:");
    int cantidadNumerosCargar = teclado.nextInt();
    if (cantidadNumerosCargar <= 0){
        System.out.println("Cantidad inválida. Ingrese un número positivo.");
        teclado.nextLine(); // Limpiar el buffer después de leer números
        System.out.println("Presione Enter para continuar...");
        teclado.nextLine(); // Espera a que el usuario presione Enter
        cuartaClase.limpiarConsola(); // Limpia la consola
        break;
    }
    System.out.println("Ingrese la enteros:");
    int[] numerosSeparar = new int[cantidadNumerosCargar]; //Crea un array
    for (int i = 0; i < cantidadNumerosCargar; i++) {
        numerosSeparar[i] = teclado.nextInt(); //Carga los numeros al array
        if (numerosSeparar[i] < 0){
            System.out.println("No se pueden cargar numeros negativos, intente de nuevo");
            teclado.nextLine(); // Limpiar el buffer después de leer números
            System.out.println("Presione Enter para continuar...");
            teclado.nextLine(); // Espera a que el usuario presione Enter
            cuartaClase.limpiarConsola(); // Limpia la consola
            break;
        }
    }
    String separados = cuartaClase.separarEnteros(numerosSeparar);
    System.out.println("La cadena de texto esta compuesta por: " + separados);
    teclado.nextLine(); // Limpiar el buffer después de leer números
    System.out.println("Presione Enter para continuar...");
    teclado.nextLine(); // Espera a que el usuario presione Enter
    cuartaClase.limpiarConsola(); // Limpia la consola
    break;


// 14. Invertir array
// Crear un método que reciba un array de enteros y devuelva otro array con los valores en orden inverso.

case 13:
    System.out.println("Ingrese la cantidad de enteros que quiere cargar:");
    int cantNumsCargar = teclado.nextInt();
    if (cantNumsCargar <= 0){
        System.out.println("Cantidad inválida. Ingrese un número positivo.");
            teclado.nextLine(); // Espera a que el usuario presione Enter
        System.out.println("Presione Enter para continuar...");
        teclado.nextLine(); // Espera a que el usuario presione Enter
        cuartaClase.limpiarConsola(); // Limpia la consola
        break;
    }
    System.out.println("Ingrese la enteros:");
    int[] numerosInversos = new int[cantNumsCargar];
    for (int i = 0; i< cantNumsCargar; i++){
        numerosInversos[i] = teclado.nextInt();
        if (numerosInversos[i] < 0){
            System.out.println("No se pueden cargar numeros negativos, intente de nuevo");
                teclado.nextLine(); // Espera a que el usuario presione Enter
            System.out.println("Presione Enter para continuar...");
            teclado.nextLine(); // Espera a que el usuario presione Enter
            cuartaClase.limpiarConsola(); // Limpia la consola
            break;
        }
    };
    String invertidos = cuartaClase.invertirNums(numerosInversos);
    System.out.println("Los numeros inversos son: " + invertidos);
        teclado.nextLine(); // Espera a que el usuario presione Enter
    System.out.println("Presione Enter para continuar...");
    teclado.nextLine(); // Espera a que el usuario presione Enter
    cuartaClase.limpiarConsola(); // Limpia la consola
    break;

//15. Estudiante con mejor nota
//Crear un método que reciba dos arrays: uno con nombres de estudiantes y otro con sus notas, y devuelva el nombre del estudiante con la mejor nota.

case 14:
    System.out.println("Ingrese la cantidad de estudiantes:");
    int cantEstudiantes = teclado.nextInt();
    if (cantEstudiantes <= 0){
        System.out.println("Cantidad inválida. Ingrese un número positivo.");
            teclado.nextLine(); // Espera a que el usuario presione Enter
        System.out.println("Presione Enter para continuar...");
        teclado.nextLine(); // Espera a que el usuario presione Enter
        cuartaClase.limpiarConsola(); // Limpia la consola
        break;
    }
    String[] nombresAlumnos = new String[cantEstudiantes];
    int[] notasAlumnos = new int[cantEstudiantes];
    teclado.nextLine();

    for (int i = 0; i < cantEstudiantes; i++){
        System.out.println("Ingrese el nombre del Alumno N°" + (i+1) + ":");
        nombresAlumnos[i] = teclado.nextLine();
        if (nombresAlumnos[i].isEmpty()){
            System.out.println("No se puede cargar un nombre vacio, intente de nuevo");
                teclado.nextLine(); // Espera a que el usuario presione Enter
            System.out.println("Presione Enter para continuar...");
            teclado.nextLine(); // Espera a que el usuario presione Enter
            cuartaClase.limpiarConsola(); // Limpia la consola
            break;
        }
        System.out.println("Ingrese la nota del alumno del 1 al 10:");
        notasAlumnos[i] = teclado.nextInt();
        if (notasAlumnos[i] < 0 || notasAlumnos[i] > 10){
            System.out.println("No se pueden cargar notas menores a 0 o mayores a 10, intente de nuevo");
                teclado.nextLine(); // Espera a que el usuario presione Enter
            System.out.println("Presione Enter para continuar...");
            teclado.nextLine(); // Espera a que el usuario presione Enter
            cuartaClase.limpiarConsola(); // Limpia la consola
            break;
        }
        System.out.println("Alumno N°" + (i+1) + " cargado correctamente");
            teclado.nextLine(); // Espera a que el usuario presione Enter
        System.out.println("Presione Enter para continuar...");
        teclado.nextLine();

    }
    String mejorAlumno = cuartaClase.mejorAlumno(nombresAlumnos, notasAlumnos);
    System.out.println("El mejor alumno es:" + mejorAlumno);
        teclado.nextLine(); // Espera a que el usuario presione Enter
    System.out.println("Presione Enter para continuar...");
    teclado.nextLine(); // Espera a que el usuario presione Enter
    cuartaClase.limpiarConsola(); // Limpia la consola

    break;



case 999:
    System.out.println("Gracias por usar el sistema, hasta luego!");
    teclado.close();
    salir = false;
    return;
        }
    }

    teclado.close();

    }
}