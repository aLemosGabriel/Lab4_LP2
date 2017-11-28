
public class Aluno {
	
	private String nome;
	private int matricula;
	private String curso;
	
	public Aluno(String nome, int matricula, String curso) {
		this.curso = curso;
		this.matricula = matricula;
		this.nome = nome;
	}
	
	public Aluno() {
		this.curso = "@@@";
		this.matricula = 0;
		this.nome = "@@@";
	}

	public String getNome() {
		return nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public String getCurso() {
		return curso;
	}

	@Override
	public String toString() {
		return matricula + " - " + nome + " - " + curso;
	}
	
	
}
