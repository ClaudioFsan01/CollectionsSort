
public class ContaCorrente implements java.lang.Comparable<ContaCorrente>{
		// A interface Comparable<ContaCorrente> ir� comparar neste contexto ContaCorrente
	   //A classe ContaCorrente se compromete a implementar o m�todo abstrato compareTo(Objeto) da interface Comparable<tipo Objeto>
	
	private double saldo;
	
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
	
	// implementando o m�todo abstrato compareTo(ContaCorrente cc) da interface Comparable<>
	
	/* O m�todo de ordena��o sort() da classe Collections inicia apartir do 2� elemento da lista acessa o metodo  compareTo(ContaCorrente cc)
	  do elemento atual e passa no parametro do o metodo  compareTo(ContaCorrente cc) o elemento do index anterior da lista para que seja comparado no metodo compareTo(ContaCorrente cc)
	  o elemento atual com o elemento anterior. O criterio de compara��o , ou seja, o que vai ser comparado dentro do m�todo compareTo(ContaCorrente cc)
	  � definido pelo programador.*/
	
	// Neste contexto eu quis comparar pelos saldos das contas.
	// Caso o saldo do elemento atual seja inferior ao saldo do elemento anterior esses elementos s�o trocados de posi��o na lista criando assim 
	// uma lista de elementos de saldo crescente
	
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

   }
	
	
	
	//Com o c�digo anterior, nossa classe tornou-se "compar�vel"
	
	/*Repare que o crit�rio de ordena��o � totalmente aberto, definido pelo programador. Se quisermos
      ordenar por outro atributo (ou at� por uma combina��o de atributos), basta modificar a implementa��o
      do m�todo compareTo na classe.
	 
	  Quando chamarmos o m�todo sort de Collections , ele saber� como fazer a ordena��o da lista;
     ele usar� o crit�rio que definimos no m�todo compareTo .
	 * */	
	
	
}
