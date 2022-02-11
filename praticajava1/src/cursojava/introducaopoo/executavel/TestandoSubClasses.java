package cursojava.introducaopoo.executavel;

import cursojava.introducaopoo.classes.Aluno;
import cursojava.introducaopoo.classes.Diretor;
import cursojava.introducaopoo.classes.Secretario;

public class TestandoSubClasses {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setNome("Rodrigo");
		aluno.setNomeEscola("JDEV Treinamento");
		aluno.setIdade(17);

		Diretor diretor = new Diretor();
		diretor.setNome("Cleitom");
		diretor.setRegistroEducacao("759TD259H");
		diretor.setIdade(50);

		Secretario secretario = new Secretario();
		secretario.setNome("Mariana");
		secretario.setExperiencia("RH");
		secretario.setCpf("859.752.654-71");
		secretario.setIdade(35);

		System.out.println(aluno);
		System.out.println(aluno.salario());

		System.out.println(diretor);
		System.out.println(diretor.salario());
		
		System.out.println(secretario);
		System.out.println(secretario.salario());

	}

}
