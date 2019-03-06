

public class SingletonProfessorOnline {
	private static volatile SingletonProfessorOnline singletonProfessorOnline=null;
	private String nomePaciente;
	private String nomeMedico;
	private SingletonProfessorOnline(String nome){
		this.nomePaciente=nome;
		
		if(singletonProfessorOnline==null){
			
				System.out.print("ENTRE AGORA "+ this.nomePaciente);
           
			}
	
			
			
	    	
	}
	public static  SingletonProfessorOnline  obterSingletonProfessorOnline(String nome){
		synchronized(SingletonProfessorOnline.class){
		if(singletonProfessorOnline==null){
			return singletonProfessorOnline=new SingletonProfessorOnline(nome);
			
		}
		return singletonProfessorOnline;
	}}
	
	

}
