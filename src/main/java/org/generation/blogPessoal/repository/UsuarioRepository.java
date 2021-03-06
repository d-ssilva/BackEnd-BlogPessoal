package org.generation.blogPessoal.repository;

import java.util.List;
import java.util.Optional;

import org.generation.blogPessoal.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	public Optional<Usuario> findByUsuario(String usuario);
	public Usuario findFirstByNome(String nome);
	public Optional<Usuario> findByUsuarioAndSenha(String usuario, String senha); // achando usuário por usuário e senha
	public List<Usuario> findAllByNomeIgnoreCaseContaining(String nome);
	public List<Usuario> findAllByUsuarioIgnoreCaseContaining(String usuario);
	public boolean findFirstByNome(boolean b);
}
	
