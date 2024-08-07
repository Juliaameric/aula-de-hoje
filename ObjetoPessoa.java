package pessoa;


public class ObjetoPessoa {

	public static void main(String[] args) {
		// criando objetos de classe pessoa
			Pessoa pessoa1 = new Pessoa();
			Pessoa pessoa2 = new Pessoa();
			
		 //objeto 1
			pessoa1.setNome("Tom Cruise");
			pessoa1.setIdade(60);
			pessoa1.setEndereco("California, USA");
			pessoa1.setProfissao("Ator");
			pessoa1.setCpf("223.086.058.77");
			pessoa1.setRg("22564");
			
		//objeto 2
			pessoa2.setNome("Kyan");
			pessoa2.setIdade(23);
			pessoa2.setEndereco("Brasil");
			pessoa2.setProfissao("Cantor");
			pessoa2.setCpf("213.089.058.77");
			pessoa2.setRg("22564");
			
	 //chamando o metodo get () para apresentar os objetos
			System.out.println("-----OBJETO 1-----");
			System.out.println(pessoa1.getNome());
			System.out.println(pessoa1.getIdade());
			System.out.println(pessoa1.getEndereco());
			System.out.println(pessoa1.getProfissao());
			System.out.println(pessoa1.getCpf());
			System.out.println(pessoa1.getRg());
			
			System.out.println("-----OBJETO 2-----");
			System.out.println(pessoa2.getNome());
			System.out.println(pessoa2.getIdade());
			System.out.println(pessoa2.getEndereco());
			System.out.println(pessoa2.getProfissao());
			System.out.println(pessoa2.getCpf());
			System.out.println(pessoa2.getRg());
			}
	}