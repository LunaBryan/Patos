
public class SimuladorPatos
{
	public static void main( String args[] )
	{
		//Los patos		
		Pato p1 = new Mergo();
		Pato p2 = new Goma();	
                Pato p3 = new Madera();
                        
		//comportamientos
		NoVolar nv = new NoVolar();
		GraznarAlto ga = new GraznarAlto();
                NoGraznar noga = new NoGraznar();
                Flotar fl = new Flotar();
                
			
		System.out.println("\n### Simulador de patos ###\n");
		//Pato Mergo
		System.out.println(p1.dibujar()+"\n");
		System.out.println(p1.realizarVuelo()+"\n");
		System.out.println(p1.realizarGraznido()+"\n");
		//cambiamos el comportamiento
		System.out.println("El pato 1 se estrella...\n");		
		p1.setComportamientoVolar(nv);
		System.out.println(p1.realizarVuelo()+"\n");
                //Cambiemos el comportamiento
                System.out.println("El pato cae al agua...\n");		
		p1.setComportamientoFLotar(fl);
		System.out.println(p1.realizarFlotavilidad()+"\n");
		
		//Pato de Goma
		System.out.println(p2.dibujar()+"\n");
		System.out.println(p2.realizarVuelo()+"\n");
		System.out.println(p2.realizarGraznido()+"\n");
		//cambiamos el comportamiento
		System.out.println("El pato 2 puede graznar...\n");		
		p2.setComportamientoGraznar(ga);
		System.out.println(p2.realizarGraznido()+"\n");	
                //Cambiemos el comportamiento
                System.out.println("El pato 2 cae al agua...\n");		
		p2.setComportamientoFLotar(fl);
		System.out.println(p2.realizarFlotavilidad()+"\n");
                
                //Pato de Madera
		System.out.println(p3.dibujar()+"\n");
		System.out.println(p3.realizarVuelo()+"\n");
		System.out.println(p3.realizarGraznido()+"\n");
		//cambiamos el comportamiento
		System.out.println("El pato 3 no puede graznar...\n");		
		p3.setComportamientoGraznar(noga);
		System.out.println(p3.realizarGraznido()+"\n");	
                //Cambiemos el comportamiento
                System.out.println("El pato 3 cae al agua...\n");		
		p3.setComportamientoFLotar(fl);
		System.out.println(p3.realizarFlotavilidad()+"\n");
	}
}