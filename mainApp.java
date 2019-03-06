
public class mainApp {
	
	public static void main(String[] argumentos)
	{final int QNT=50;
	   Paciente paciente= new Paciente();
      

   Paciente[] pacientes=new Paciente[QNT];
   for(int i = 0; i<pacientes.length-1;i++){
	   pacientes[i]=paciente;
	   
   }
   pacientes[0].setPaciente("CARLA");
   pacientes[1].setPaciente("VERONICA");
   pacientes[3].setPaciente("RAIMUNDO");


   

   
	   
	}

}
