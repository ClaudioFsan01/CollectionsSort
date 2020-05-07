
public class ContaCorrente implements java.lang.Comparable<ContaCorrente>{
		// A interface Comparable<ContaCorrente> irá comparar neste contexto ContaCorrente
	   //A classe ContaCorrente se compromete a implementar o método abstrato compareTo(Objeto) da interface Comparable<tipo Objeto>
	
	private double saldo;
	private String titular;
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public String getTitular() {
		return this.titular;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
     
	public void deposita(double valor)
	{
		if(valor<0) {
			throw new IllegalArgumentException(" Voce tentou depositar um valor invalido na conta corrente !");
			
		}else {
			this.saldo += valor;
			System.out.println(" Deposito efetuado com sucesso na conta corrente no valor de : "+ valor);
		}
		
		
	}
		

	public void saca(double valor)
	{
		if(valor > this.saldo)
		{	
			throw new SaldoInsuficienteException(valor);		
		}
		else
		{
			this.saldo -= valor;
			
			System.out.println(" Saque efetuado com sucesso na conta corrente no valor de : "+ valor);
			
		}
		 
	}
	
	// implementando o método abstrato compareTo(ContaCorrente cc) da interface Comparable<>
	
	/* O método de ordenação sort() da classe Collections inicia apartir do 2° elemento da lista acessa o metodo  compareTo(ContaCorrente cc)
	  do elemento atual e passa no parametro do o metodo  compareTo(ContaCorrente cc) o elemento do index anterior da lista para que seja comparado no metodo compareTo(ContaCorrente cc)
	  o elemento atual com o elemento anterior. O criterio de comparação , ou seja, o que vai ser comparado dentro do método compareTo(ContaCorrente cc)
	  é definido pelo programador.*/
	
	// Neste contexto eu quis comparar pelos saldos das contas.
	// Caso o saldo do elemento atual seja inferior ao saldo do elemento anterior esses elementos são trocados de posição na lista criando assim 
	// uma lista de elementos de saldo crescente
	
	
	//Ordenando a lista pelo saldo da conta
	
	/*
	public int compareTo(ContaCorrente cc)
	{
		if(this.getSaldo() == cc.getSaldo()) {
			return 0; //se o objeto comparado for igual a este objeto
		}else {
			if(this.getSaldo() < cc.getSaldo()) {
				return -1; //se o saldo deste objeto for menor que o saldo do objeto dado
			}else {
				return 1;
			}	
		
	  }

   }*/
	
	//Ordenando a lista pelo titular da conta
	
	public int compareTo(ContaCorrente outraConta) {
		
		/* A classe String implementa a interface Comparable<>* e seu criador implementou o metodo compareTo() na classe String.
		 * Neste contexto vou comparar pelo nome do titular, portanto necessito passar a String Titular da outra conta, que será comparada com a String Titular da conta atual, para o parametro do metodo compareTo() implementado na classe String*/
		
		return this.getTitular().compareTo(outraConta.getTitular())	; /* Nesse caso a String Titular do objeto atual apontado pela palavra this será comparada com a String
		                                                                 do objeto apontado pela variavel outraConta*/
		/*Agora como podemos ver o método compareTo() que está sendo acessado é da classe String uma vez q titular é do tipo String , portanto esse método recebe como parametro
		 uma String e estamos passando uma String no parametro conforme o exemplo : 
		 * this.getTitular().compareTo(outraConta.getTitular())*/
		
	}
	
	
	
	
	
	//Com o código anterior, nossa classe tornou-se "comparável"
	
	/*Repare que o critério de ordenação é totalmente aberto, definido pelo programador. Se quisermos
      ordenar por outro atributo (ou até por uma combinação de atributos), basta modificar a implementação
      do método compareTo na classe.
	 
	  Quando chamarmos o método sort de Collections , ele saberá como fazer a ordenação da lista;
     ele usará o critério que definimos no método compareTo .
	 * */	
	
	
}
