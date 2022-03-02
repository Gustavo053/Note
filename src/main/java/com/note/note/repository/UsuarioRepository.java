package com.note.note.repository;

import com.note.note.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByEmailAndAtivoIsTrue(String email);
}
