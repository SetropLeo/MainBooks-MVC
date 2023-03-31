package br.com.mainbooks.main_books.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.mainbooks.main_books.modelo.Fatura;

public interface FaturaRepositorio extends JpaRepository<Fatura, Long> {

}