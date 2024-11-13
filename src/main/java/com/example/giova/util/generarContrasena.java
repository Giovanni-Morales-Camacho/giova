package com.example.giova.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class generarContrasena {
        public static void main(String[] args) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        
        String hashedPassword = passwordEncoder.encode("flor"); //Indico el texto o palabra(contraseña) que quiero encriptar
        System.out.println("Contrasena encriptada: " + hashedPassword);
    }/* al ejecutarse esto en la consola saldrá el extenso string de la encriptación de una contraseña 
    la cual saldrá por Consola, y de ahí la debo tomar para incluirla junto con el usuario en la bbdd
    mediante la ejecución del comando Sql que está en el archivo data.sql*/

}
/*   Esto lo anoto aquí solo para que el profe vea cuál es la contraseña.  Jamás pondría notas así en un código real 
CONTRASEÑA              ENCRIPTACIÓN
 *   123                   $2a$10$B/1gkQAdo05RYkcB7jOhgO4plo9Ed2In8P6qJ.4DzwB5bi461bF6K
 */