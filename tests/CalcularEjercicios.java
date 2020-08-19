
import java.util.ArrayList;

public class CalcularEjercicios{
    public static void main(String[] args){
		for(int i=0;i<40;i++){
			System.out.println("------> FINAL: "+ejercicioAlazar()+"<-------"+"\n\n\n\n\n\n");
		}
    }
    
    public static int ejercicioAlazar() {
        int[] resueltos={1,2,3,4};
		int ejercicio=0;
		
		boolean existe=true;
		
		while(existe){
			System.out.println("Generando numero random...");
			while (ejercicio>28 || ejercicio == 0) {
				ejercicio = (int) Math.round(Math.random() * 100);
				System.out.println(ejercicio+"<28 && "+ejercicio+"!=0?");
			}
			System.out.println("----------> POSIBLE: "+ejercicio);
			
			for(int resuelto:resueltos){
				System.out.println(ejercicio+"=="+resuelto+"?");
				if(ejercicio==resuelto){
					System.out.println("break;");
					ejercicio = 0;
					break;
				}else if(/*ejercicio!=resuelto&&*/resuelto==resueltos[resueltos.length-1]){
					System.out.println("Es diferente de todos");
					existe=false;
				}
			}
			System.out.println("existe="+existe);
		}
		return ejercicio;
    }
	
	
	
}