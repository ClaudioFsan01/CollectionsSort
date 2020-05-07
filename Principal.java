import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Principal {
	
/*A classe Collections traz um método estático sort que recebe um List como argumento e o
	ordena por ordem crescente ex: */
	
	public static void main(String [] args) {
		
		List<String> lista = new ArrayList<>(); 
		
		lista.add("Zuila");
		lista.add("Fatima");
		lista.add("Claudio");
		
		System.out.println(lista); // mostra a lista desordenada de acordo com a ordem de inserção
		
		// utilizando o método estatico de ordenação Sort da classe Collection
		// como o metodo Sort é estatico, ou seja, método de classe é necessario utilizar o nome da classe no qual ele pertence 
		// para acessalo
		
		 Collections.sort(lista); // ordena a lista de String por ordem alfabetica 
		 
		 System.out.println(lista); // mostra a lista ordenada
		 
		 /* Mas toda lista em Java pode ser de qualquer tipo de objeto, por exemplo, ContaCorrente
		   Em que ordem a classe Collections ordenará?  Podemos definir esse critério de ordenação.
		   É necessário instruir o sort sobre como comparar nossas ContaCorrente a fim de determinar uma ordem na lista.
		   Para isto, o método sort necessita que todos seus objetos da lista sejam comparáveis e possuam um método que se compara com outra
           ContaCorrente. Isso será feito, novamente, através de um contrato, de uma interface!
           
           Vamos fazer com que os elementos da nossa coleção implementem a interface
          java.lang.Comparable , que define o método int compareTo(Object) . Este método deve retornar
          zero, se o objeto comparado for igual a este objeto, um número negativo, se este objeto for menor que o
          objeto dado, e um número positivo, se este objeto for maior que o objeto dado.
		   */
		 List<ContaCorrente> listaContas = new ArrayList<>();
		 
		 ContaCorrente cc1 = new ContaCorrente();
		 ContaCorrente cc2 = new ContaCorrente();
		 ContaCorrente cc3 = new ContaCorrente();
		 ContaCorrente cc4 = new ContaCorrente();
		 ContaCorrente cc5 = null;
		 
		
		 cc1.setTitular("Zuila");
		 cc1.deposita(1000);
		 
		 cc2.setTitular("Fatima");
		 cc2.deposita(900);
		 
		 cc3.setTitular("Claudio");
		 cc3.deposita(1500);   
		 
		 cc4.setTitular("Ana");
		 cc4.deposita(600);
		 
		 listaContas.add(cc1);
		 listaContas.add(cc2);
		 listaContas.add(cc3);
		 listaContas.add(cc4);
		 
		 mostrarLista(listaContas);
		 
		 Collections.sort(listaContas);	
		 
		 /* O método de ordenação sort() da classe Collections inicia apartir do 2° elemento da lista acessa o metodo  compareTo(ContaCorrente cc)
		  do elemento atual e passa no parametro o elemento do index anterior da lista para que seja comparado no metodo compareTo(ContaCorrente cc)
		  o elemento atual com elemento anterior. O criterio de comparação , ou seja, o que vai ser comparado dentro do método compareTo(ContaCorrente cc)
		  é definido pelo programador.*/
		 
		 System.out.println("-------------- \n");
		 
		 mostrarLista(listaContas);
		 
		
		 
		    int n = Collections.binarySearch(listaContas, cc1);
		 
		  if(n== -1) {			  /*Realiza uma busca binária por determinado elemento na
			   lista ordenada e retorna sua posição ou um número negativo, caso não encontrado.*/
			   
			   System.out.println(" Elemento não encontrado na lista ! \n");
		  }else {
			  System.out.println(" Elemento não posição : "+ (n) +" na lista ! \n");			  
			  
		  }
		  
		  
		   ContaCorrente conta = Collections.max(listaContas); // retorna o o elemento máximo da coleção fornecida, de acordo com a ordem natural de seus elementos.
		   
		   
		   System.out.println(" Elemento maximo da lista : "+ conta.getSaldo());	
		   
		    conta = Collections.min(listaContas); // retorna o o elemento minimo da coleção fornecida, de acordo com a ordem natural de seus elementos.
		   
		    System.out.println(" Elemento minimo da lista : "+ conta.getSaldo());	
		    
		    Collections.reverse(listaContas); // inverte a lista 
		    
		    System.out.println("\n Lista invertida ! \n");	
		    mostrarLista(listaContas);	
		 		 
	}
	
	
	public static void mostrarLista(List<ContaCorrente> listaContas) {
		
		 for(ContaCorrente conta : listaContas) {
			 System.out.println("Titular : "+ conta.getTitular()+" Saldo : "+ conta.getSaldo());
		 }
		 
		
	}
}
