package faculdade;

public class Main {

	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa("Alex", 10);
		System.out.println("Nome da pessoa 1 é " + pessoa1.getNome() + " e sua matricula é "+ pessoa1.getMatricula()+".");
		
		System.out.println();
		
		Professor prof1 = new Professor("Girafales", "Matemática", 20);
		System.out.println(prof1.getNome());
		System.out.println(prof1.getMatricula());
		System.out.println(prof1.getDisciplina());
		
		System.out.println();
		
		Coordenador coord1 = new Coordenador("Ciencias Contabeis", "Tributação", 30, "Eliede");
		System.out.println(pessoa1.getNome());
		System.out.println(coord1.getMatricula());
		System.out.println(prof1.getDisciplina());
		System.out.println(coord1.getCurso());

	}//fim do main
} //fim da classe