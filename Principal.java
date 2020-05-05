import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Principal {
	
/*A classe Collections traz um m�todo est�tico sort que recebe um List como argumento e o
	ordena por ordem crescente ex: */
	
	public static void main(String [] args) {
		
		List<String> lista = new ArrayList<>(); 
		
		lista.add("Zuila");
		lista.add("Fatima");
		lista.add("Claudio");
		
		System.out.println(lista); // mostra a lista desordenada de acordo com a ordem de inser��o
		
		// utilizando o m�todo estatico de ordena��o Sort da classe Collection
		// como o metodo Sort � estatico, ou seja, m�todo de classe � necessario utilizar o nome da classe no qual ele pertence 
		// para acessalo
		
		 Collections.sort(lista); // ordena a lista de String por ordem alfabetica 
		 
		 System.out.println(lista); // mostra a lista ordenada
		 
		 /* Mas toda lista em Java pode ser de qualquer tipo de objeto, por exemplo, ContaCorrente
		   Em que ordem a classe Collections ordenar�?  Podemos definir esse crit�rio de ordena��o.
		   � necess�rio instruir o sort sobre como comparar nossas ContaCorrente a fim de determinar uma ordem na lista.
		   Para isto, o m�todo sort necessita que todos seus objetos da lista sejam compar�veis e possuam um m�todo que se compara com outra
           ContaCorrente. Isso ser� feito, novamente, atrav�s de um contrato, de uma interface!
           
           Vamos fazer com que os elementos da nossa cole��o implementem a interface
          java.lang.Comparable , que define o m�todo int compareTo(Object) . Este m�todo deve retornar
          zero, se o objeto comparado for igual a este objeto, um n�mero negativo, se este objeto for menor que o
          objeto dado, e um n�mero positivo, se este objeto for maior que o objeto dado.
		  * */
		 List<ContaCorrente> listaContas = new ArrayList<>();
		 
		 ContaCorrente cc1 = new ContaCorrente();
		 ContaCorrente cc2 = new ContaCorrente();
		 ContaCorrente cc3 = new ContaCorrente();
		 ContaCorrente cc4 = new ContaCorrente();
		 
		 cc1.deposita(1000);
		 cc2.deposita(900);
		 cc3.deposita(1500);
		 cc4.deposita(600);
		 
		 listaContas.add(cc1);
		 listaContas.add(cc2);
		 listaContas.add(cc3);
		 listaContas.add(cc4);
		 
		 for(ContaCorrente conta : listaContas) {
			 System.out.println(" Saldo : "+ conta.getSaldo());
		 }
		 
		 
		 Collections.sort(listaContas);		
		 
		 System.out.println("-------------- \n");
		 
		 for(ContaCorrente conta : listaContas) {
			 System.out.println(" Saldo : "+ conta.getSaldo());
		 }
		 
		 /* O m�todo de ordena��o sort() da classe Collections inicia apartir do 2� elemento da lista acessa o metodo  compareTo(ContaCorrente cc)
		  do elemento atual e passa no parametro o elemento do index anterior da lista para que seja comparado no metodo compareTo(ContaCorrente cc)
		  o elemento atual com elemento anterior. O criterio de compara��o , ou seja, o que vai ser comparado dentro do m�todo compareTo(ContaCorrente cc)
		  � definido pelo programador.*/
		
		 
		 
	}
}
