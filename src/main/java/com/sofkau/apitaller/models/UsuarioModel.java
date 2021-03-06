package com.sofkau.apitaller.models;


import javax.persistence.*;


@Entity
@Table(name = "usuario")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private  long id;

    //longitud del nombre puede ser de maximo 50
    @Column(length = 50)
    private String nombre;

    //Se establece nombre de la columna, que no sea nulo, longitud, que no se repita
    @Column(name = "mail", nullable = false, length = 50, unique = true)
    private String email;
    private Integer prioridad;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Integer prioridad) {
        this.prioridad = prioridad;
    }
}
