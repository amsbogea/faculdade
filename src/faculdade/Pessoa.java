package faculdade;

public class Pessoa {
	private String nome;
	private int matricula;
	
//	construtor incio*****************************************************
	public Pessoa(String nome, int matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
	}
//	construtor final******************************************************

//	metodos gets e sets inicio********************************************
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
//	metodos gets e sets final****************************************************
}
