
public class Paciente {
	
	private String nome;
	
	public void setPaciente(String nome){
		
		this.nome=nome;
		SingletonProfessorOnline professorOnline= SingletonProfessorOnline.obterSingletonProfessorOnline(this.nome);


	}

	

	



	
	

}
