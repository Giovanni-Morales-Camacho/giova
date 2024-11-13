package com.example.giova.repository;

import java.util.Optional; //acá es donde he importado el modelo y ya podría instanciarlo

import org.springframework.data.jpa.repository.JpaRepository;  //permite que la clase que he declarado aquí se comporte como un repositorio

import com.example.giova.model.User;  //para prevenir que se nos caiga en caso de la tabla tenga "null" registros


// así se debe crear la clase repository y sí debe llamarse igual que el nombre del archivo userRepository.java
public interface userRepository extends JpaRepository<User, Long> { 
    Optional<User> findByUsername(String username);//esto hace q vaya a model/User y me devuelva el valor de "username"
}  //Este repository user es para que se comunique con el model. user.java
