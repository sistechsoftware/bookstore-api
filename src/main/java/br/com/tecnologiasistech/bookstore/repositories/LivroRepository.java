package br.com.tecnologiasistech.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.tecnologiasistech.bookstore.domain.Livro;

public interface LivroRepository extends JpaRepository<Livro, Integer> {

}
