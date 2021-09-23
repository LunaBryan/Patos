public abstract class Pato 
{
	//comportamientos
	IVuelo comportamientoVolar;
	IGraznido comportamientoGraznar;
        IFlotar comportamientoFlotar;

	//volamos
	public String realizarVuelo() 
	{
		return comportamientoVolar.volar();
	}
	
	//graznamos
	public String  realizarGraznido() 
	{
		return comportamientoGraznar.graznar();
	}
        //nadamos
        public String realizarFlotavilidad()
        {
            return comportamientoFlotar.flotar();
        }
	
	//establecemos un nuevo comportamiento
	public void setComportamientoVolar(IVuelo compv) 
	{
		comportamientoVolar = compv;
	}
	
	public void setComportamientoGraznar(IGraznido compg) 
	{
		comportamientoGraznar = compg;
	}
	public void setComportamientoFLotar(IFlotar compf)
        {
            comportamientoFlotar = compf;
        }
	
	public abstract String dibujar();
}
