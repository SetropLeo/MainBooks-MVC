package br.com.mainbooks.main_books.servico;

import java.util.List;
import br.com.mainbooks.main_books.modelo.Fatura;

public interface IFaturaServico {

	public Fatura salvarFatura(Fatura fatura);

	public List<Fatura> buscarTodasFaturas();

	public Fatura bucarFaturaPorId(Long id);

	public void deletarFaturaPorId(Long id);

	public void atualizarFatura(Fatura fatura);

}