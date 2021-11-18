package trab_final;

import java.util.ArrayList;
import java.util.List;

public class SistemaDisciplina {
	
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>(); //lista disciplina
	
	public void adicionar(Disciplina d) { //adicionar valor disciplina
		disciplinas.add(d);
	}
	public List<Disciplina> listarDisciplinas(){ //listando lista disciplina
		return disciplinas;
	}
	
}