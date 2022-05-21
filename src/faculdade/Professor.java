package faculdade;

public class Professor extends Pessoa{
	
	private String disciplina;

//	Metodo construtor inicio
	public Professor(String nome, String disciplina, int matricula) {
		super(nome, matricula);
		this.disciplina = disciplina;
	}
//	Metodo construtor fim
	
//	gets e sets inicio
	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
//	gets e sets fim
	
	
}
