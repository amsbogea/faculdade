package faculdade;

public class Coordenador extends Professor{
	
	private String curso;

	
		
//	construtor inicio
	public Coordenador( String curso, String disciplina,  int matricula, String nome) {
		super( disciplina, curso,  matricula );
		this.curso = curso;
	}
//	construtor fim


//	gets e sets inicio
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
//	gets e sets fim
}
