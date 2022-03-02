package com.note.note.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Usuario extends Entidade{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String senha;
    private String nome;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Role> roles;
}
