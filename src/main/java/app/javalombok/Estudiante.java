/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.javalombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;



/**
 *
 * @author ariel
 */



@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Estudiante {
    
    String nombre;
    String apellidos;
    int edad;

}
