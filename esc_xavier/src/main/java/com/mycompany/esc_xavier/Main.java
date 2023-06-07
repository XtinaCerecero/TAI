package com.mycompany.esc_xavier;

import java.sql.ResultSet;
import java.sql.SQLException;


/*
En este caso para efectos demostrativos se coloca toda la lógica del programa
en el método main de la clase Main. Lo ideal (y más lógico) es que, por ejemplo,
los atributos ID, EDAD y NOMBRE pertenezcan a una clase que se llame Cliente. Es
decir, que exista coherencia entre lo que representa la clase (en este caso un
cliente) y lo que contiene (sus atributos y métodos). 
*/
public class Main {
    public static void main (String[] args) {
        
        // Creamos una instancia/objeto llamado conexion de la clase MiBD
        MiBD conexion =  new MiBD();
        
        // El conjunto de resultados (result set) que obtenemos
        // al ejecutar la consulta SQL (select)
        ResultSet result;
    
        int dep_num;
        String dep_nom;
        
        // conexion.getQuery() ejecuta el método getQuery que se encuentra en la
        // clase MiBD. El parámetro que le pasamos ("select * from clientes") es
        // la consulta SQL que ejecutamos en la base de datos y que nos proporciona
        // un conjunto de resultados (result set)
        result = conexion.getQuery("select * from departamento");
        try {
            while(result.next()) {
                dep_num = result.getInt("dpto_num"); // si el dato que queremos obtener es INT, usamos getInt(nombreColumna)
                dep_nom = result.getString("dpto_nom"); // si el dato que queremos es texto, usamos getString(nombreColumna)

                System.out.println ("\nNo de departamento: " + dep_num);
                System.out.println("Nombre del departamento: " + dep_nom);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

/*
NOTA: un metodo se declara de la siguiente manera:
public valorRetorno nombreMetodo (tipoDato parametro1, tipoDato parametro2, ...) {

}

El valor de retorno puede ser cualquier tipo de dato válido en Java: int, double,
float, String, boolean (true, false), etc.

El nombre del método, en teoría, puede ser cualquiera. La recomendación es que
el nombre del método sea acorde a lo que hace. No llamar resta() a una
función que realiza una suma, por ejemplo.

public int suma(int a, int b) {
    return a + b;
}

Es un método que realiza la suma de dos números enteros, muy parecido a C solo
que se añade el modififcador de acceso (public, private).

Los métodos deben ir siempre dentro de una clase.
*/