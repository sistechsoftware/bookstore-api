package br.com.tecnologiasistech.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.tecnologiasistech.bookstore.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
