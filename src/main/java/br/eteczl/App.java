package br.eteczl;

import java.util.ArrayList;

import model.Automovel;
import model.Caminhao;
import model.Carro;

public class App 
{
	
	private ArrayList<Automovel> automoveis = new ArrayList<Automovel>();
	
    public static void main( String[] args )
    {
    	
    	App app = new App();
    	Automovel carrAuto = new Carro();
    	
    	app.automoveis.add(new Carro());
    	app.automoveis.add(new Caminhao());
    }
}
