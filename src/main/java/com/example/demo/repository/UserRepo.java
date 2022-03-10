package com.example.demo.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Usuario;


/**
 * Conecta usuario con la BBDD
 * @author estudiante
 *
 */
public interface UserRepo extends JpaRepository<Usuario, Long> {
   //Método para obtener un usuario por su email
	public Optional<Usuario> findByEmail(String email);

}
