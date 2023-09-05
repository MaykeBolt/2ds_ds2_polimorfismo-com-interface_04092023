package persistencia;

import java.util.ArrayList;

import model.Carro;

public interface iCarroDAO {
	public void salvar(Carro c1);
	public void alterar(Carro c1, Integer id); //id = PK
	public void deletar(Integer id);
	public void buscar(Integer id);
	public ArrayList<Carro> listar();
	
}
