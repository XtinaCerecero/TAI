package com.mycompany.esc_xavier;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main (String[] args) {
        
        // Creamos una instancia/objeto llamado conexion de la clase MiBD
        MiBD conexion =  new MiBD();
        
        // El conjunto de resultados (result set) que obtenemos
        // al ejecutar la consulta SQL (select)
        ResultSet result;
    
        int no_personal;
        int total_clases_imp;
        
        result = conexion.getQuery("select * from Profesores");
        try {
            while(result.next()) {
                no_personal = result.getInt("no_personal"); // si el dato que queremos obtener es INT, usamos getInt(nombreColumna)
                total_clases_imp = result.getInt("total_clases_imp");

                System.out.println ("\nNo de personal: " + no_personal);
                System.out.println("Total clases impartidad: " + total_clases_imp);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
