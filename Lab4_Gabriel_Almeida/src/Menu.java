import java.util.Scanner;
import java.util.ArrayList;

public class Menu {
	
	private ArrayList<Integer> matriculas = new ArrayList();
	private ArrayList<Grupo> grupos = new ArrayList();
	
	public Menu() {
		
	}
	
	public void imprimeMenu() {
		System.out.println("(C)adastrar Aluno\n" + 
				"(E)xibir Aluno\n" + 
				"(N)ovo Grupo\n" + 
				"(A)locar Aluno no Grupo e Imprimir Grupos\n" +
				"(R)egistrar Resposta de Aluno\n" + 
				"(I)mprimir Alunos que Responderam\n" + 
				"(O)ra, vamos fechar o programa!\n" + 
				"\n" + 
				"Opção>");
		
	}
	
	public Aluno cadastraAluno() {
		Scanner s = new Scanner(System.in);
		System.out.print("Matrícula: ");
		int matricula = s.nextInt();
		String aux = s.nextLine(); // Limpando o Buffer deixado pelo nextInt()
		System.out.print("Nome: ");
		String nome = s.nextLine();
		System.out.print("Curso: ");
		String curso = s.nextLine();
		
		if (matriculas.contains(matricula)) {
			System.out.println("MATRÍCULA JÁ CADASTRADA!");
			return new Aluno();
		}
		else {
			System.out.println("CADASTRO REALIZADO!");
			matriculas.add(matricula);
			return new Aluno(nome, matricula, curso);
		}
	}
	
	public void exibeAluno(ArrayList<Aluno> lista) {
		Scanner s = new Scanner(System.in);
		System.out.print("Matrícula: ");
		int matricula = s.nextInt();
		String aux = s.nextLine(); // Limpando o Buffer deixado pelo nextInt()
		boolean achou = false;
		for (Aluno o : lista) {
			if (o.getMatricula() == matricula) {
				System.out.println("\n" + o.toString());
				achou = true;
			}
		}
		if (achou == false) {
			System.out.println("\nAluno não cadastrado.");
		}
	}
	
	public void cadastraGrupo() {
		Scanner s = new Scanner(System.in);
		System.out.print("Grupo: ");
		String grupo = s.nextLine();
		boolean achou = false;
		for (Grupo o : grupos) {
			if (o.nome.equals(grupo)) {
				achou = true;
			}
		}
		if (achou) {
			System.out.println("GRUPO JÁ CADASTRADO!");
		}
		else {
			grupos.add(new Grupo(grupo));
			System.out.println("CADASTRO REALIZADO!");
		}
	}
}
