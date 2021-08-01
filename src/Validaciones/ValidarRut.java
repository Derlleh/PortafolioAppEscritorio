/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validaciones;

import javax.swing.JOptionPane;

/**
 *
 * @author pablo
 */
public class ValidarRut {
    
         
       public  boolean ValidarRut( String rut ) 
       {
     
        
            if ( rut.length() > 0  )
            {
                // Creamos un arreglo con el rut y el digito verificador
                String[] rut_dv = rut.split("-");
                // Las partes del rut (numero y dv) deben tener una longitud positiva
                if ( rut_dv.length == 2   )
                {
                    // Capturamos error (al convertir un string a entero)
                    try
                    {
                        int nrut = Integer.parseInt( rut_dv[0] );
                        char dv = rut_dv[1].charAt(0);
 
                        // Validamos que sea un rut valido según la norma
                        if ( this.ValidarRut(nrut, dv)  )
                        {
                             
                            return true;
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "El rut ingresado es invalido");
                            return false;
                        }
                    }
                    catch( Exception ex )
                    {
                        JOptionPane.showMessageDialog(null, "El rut ingresado es invalido");
                        return false;
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "El rut ingresado es invalido");
            return false;
        }
     
 
    /*
     * Método Estático que valida si un rut es válido
     * Fuente : http://www.creations.cl/2009/01/generador-de-rut-y-validador/
     */
    public static boolean ValidarRut(int rut, char dv)
    {
        int m = 0, s = 1;
        for (; rut != 0; rut /= 10)
        {
            s = (s + rut % 10 * (9 - m++ % 6)) % 11;
        }
        return dv == (char) (s != 0 ? s + 47 : 75);
    }
 
}
    
    
    

