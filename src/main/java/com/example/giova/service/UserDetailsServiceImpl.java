package com.example.giova.service;

import java.util.Collections; // para importar grandes cant de datos

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails; 
import org.springframework.security.core.userdetails.UserDetailsService; //importando el REPOSITORIO
import org.springframework.security.core.userdetails.UsernameNotFoundException; 
import org.springframework.stereotype.Service;//este método es para que este archivo se comporte como un servicio.

import com.example.giova.model.User; //importar el modelo   
import com.example.giova.repository.userRepository; //importando el REPOSITORIO

 // y acá ahora sí definimos la clase (en teoría contiene la lógica del negocio y usa al repository para acceder a la bbdd)
@Service
public class UserDetailsServiceImpl implements UserDetailsService{

    @Autowired
    private userRepository userRepository; /* acá implementamos una conexión directa PRIVADA desde userRepository a userRepository
    para establecer conexión con el repositorio*/ 

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{ /* por medio de este método
        el controlador va a leer todos los usuarios de la BBDD por medio de 'username' */
        User user = userRepository.findByUsername(username) /*el servicio está delegando esa tarea a userRepository 
        el cual por eso tiene en su código la instrucción '<User> findByUsername(String username);'*/
            .orElseThrow(() -> new UsernameNotFoundException("¡Datos erróneos! -->" + username));
        /*Este método q sigue implementa una interfaz de detalles de usuario, para que cuando un usr intente loguearse SprigSecurity 
        verifique permisos*/
        return new org.springframework.security.core.userdetails.User(user.getNombreUsuario(), user.getContrasena(),
            Collections.singleton(() -> "ROLE_" + user.getRole()));  // método para verificar permisos
    }//esta es una base para cuando toque crear roles admin y usr normal.
}
// Lo que hace es servir de conexión entre el controlador y la bbdd, por medio del repository.
