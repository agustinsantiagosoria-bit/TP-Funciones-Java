public class Funciones {
    public void mostrarSaludo(){
        System.out.println("Hola mundo");
    }

    public void saludar(String Nombre){
        System.out.println("Hola " + Nombre + ", Bienvendido");
    }

    public double calcularArea(double base, double altura){
        double area = base * altura;
        return area;
    }

    public String convertirMayusculas(String Cadena){
        String mayusculas = Cadena.toUpperCase();
        return mayusculas;
    }

    public void mostrarMenu(){

        System.out.println("¡¡Bienvenido Usuario, al sistema de Soria Santiago!!");
        System.out.println("Les dejo las opciones que tiene nuestro sistema:");
        System.out.println("1. Saludo Fijo");
        System.out.println("2. Saludo Personalizado");
        System.out.println("3. Calcular Area de un Rectángulo");
        System.out.println("4. Convertir texto a Mayusculas");
        System.out.println("5. Número Par o Impar");
        System.out.println("6. Calcular cuadrado de un número");
        System.out.println("7. Factorial recursivo de un Número");
        System.out.println("8. Sumar multiples números");
        System.out.println("9. Promedio de un arreglo de números");
        System.out.println("10. Buscar un valor en un array");
        System.out.println("11. Contar ocurrencias");
        System.out.println("12. Imprimir array de forma formateada");
        System.out.println("13. Invertir array");
        System.out.println("14. Estudiante con mejor nota");
        System.out.println("999. Salir del Sistema");
        System.out.print("Elija la opcion que quiera usar:");
    };

    public boolean esPar(int numero){
    if (numero % 2 == 0){
        System.out.println("El numero que usted cargo es par");
        return true;
    } else {
        System.out.println("El numero que usted cargo es impar ");
        return false;
    }
}

    public double cuadradoNumero(double numero){
    numero = numero * numero;
    return numero;
}

    public int calcularFactorial(int numero){
    if(numero <= 1){
        return 1;
    }
    return numero * calcularFactorial(numero - 1);
}

    public int sumarNumeros(int... numeros){
        int suma = 0;
        for (int numero : numeros){
            suma += numero;
        }
        return suma;
    }

    public double calcularPromedio(double[] numeros){
        double promedio = 0;

        for (double numero : numeros){
            promedio += numero;
        }
        promedio = promedio/numeros.length;
        return promedio;
    }

    public boolean buscarNumero(int[] lista, int numeroABuscar){
        boolean encontrado = false;
        for(int i = 0; i < lista.length; i++) {
            if (lista[i] == numeroABuscar){
                encontrado = true;
                return encontrado;
            }
        }
        return encontrado;
    }

    public int buscarLetra(String texto, char letraBuscar){
        int conteo = 0;
        texto = texto.toUpperCase();
        letraBuscar = Character.toUpperCase(letraBuscar);
        for(char letraActual : texto.toCharArray()){
            if (letraActual == letraBuscar){
                conteo++;
            }
        }

        return conteo;
    }


    public String separarEnteros(int[] Lista){

        String salida = "";
        if (Lista == null || Lista.length == 0) {
            return "[]";
        }
        for(int i = 0; i< Lista.length; i++){

        if (i == 0){
            salida += "[" + Lista[i];
        } else{
            salida += ","+ Lista[i];
        }
        }
        salida += "]";
        return salida;
    }

    public String invertirNums(int[] Lista){
        if(Lista == null || Lista.length == 0){
    return "[]";
}
        String salida = "[";
        int fin = Lista.length - 1;

        for (int i = fin; i >= 0; i--){
            if (i == fin){
                salida += Lista[i];
            } else {
                salida += "," + Lista[i];
            }
        }

        salida += "]";
        return salida;
    }
    
    public String mejorAlumno(String[] alumnos, int[] notas){
        int mejorNota = notas[0];
        String mejorAlumno = alumnos[0];

        for (int i = 0; i < alumnos.length; i++){

            if (mejorNota < notas[i]){

                mejorNota = notas[i];
                mejorAlumno = alumnos[i];

            }

        }
        
        return mejorAlumno;
    }

    public void limpiarConsola() {

    for (int i = 0; i < 50; i++){
        System.out.println();
    }
}

}
