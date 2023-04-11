package conta.repository;

import conta.model.Conta;

public interface ContaRepository {
	
	public abstract void procurarPorNumero(int numero);
	public abstract void listarTodas();
	public abstract void cadastrar(Conta conta);
	public abstract void atualizar(Conta conta);
	public abstract void deletar(int numero);
	
	public abstract void sacar(int numero, float valor);
	public abstract void depositar(int numero, float valor);
	public abstract void transferir(int numeroOrigem, int numeroDestino, float valor);
	
}
