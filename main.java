import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class main {
	
	
	public main(String[] args) {
		
		Scanner read = new Scanner( System.in );
		
		String nome;
		double valor, totalValor;
		totalValor = 0;
		
		List<Amigo> listaAmigos = new ArrayList<Amigo>();
		
		System.out.println("Amigo: ");
		nome = read.nextLine();
        
		System.out.println("Valor: ");
		valor = read.nextDouble();
		
		for(Amigo listaNova: listaAmigos) {
			Amigo amigo = new Amigo(nome, valor);
			listaAmigos.add(amigo);
			System.out.println("Nome:"+listaNova.getNome()+ "Valor: " +listaNova.getValor());
			valor =+ valor;
		}
		
		totalValor = valor;
		
		System.out.println("Total:"+totalValor);
	}
}
