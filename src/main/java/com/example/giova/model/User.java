package com.example.giova.model;
//el nombre del archivo inicia en mayúscula para coincidir con nombre de la clase "User"
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
 
@Entity
@Table(name = "app_usuario")
public class User {      //acá estamos definiendo la tabla
    @Id  //para hacerlo llave primaria
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    private String username;
    private String password;
    private String role;
 
    //siguen los getters y setters
    public Long getId(){
        return id;
    }
 
    public void setId(Long id){
        this.id = id;
    }
 
    public String getNombreUsuario(){
        return username;
    }
 
    public void setNombreUsuario(String username){
        this.username = username;
    }
 
    public String getContrasena(){
        return password;
    }
 
    public void setcontrasena(String contrasena){
        this.password = contrasena;
    }
 
    public String getRole(){
        return role;
    }
 
    public void setRole(String role){
        this.role = role;
    }
 
} //después de esto tengo que crear el repository para poder entablar comunicación con la bbdd
