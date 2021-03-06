package paquetes;

import java.util.ArrayList;

public class Seņora extends Empleado {

	private String nombreSeņora;

	public Seņora(ArrayList<Paquete> listaPaquetes, String nombreSeņora) {
		super(listaPaquetes);
		this.nombreSeņora = nombreSeņora;
	}

	@Override
	public boolean puedeCargar(Paquete paquete) {

		if (paquete.getPeso() < 50 && paquete.getDistancia() < 30 && listaPaquetes.size() < 15) {
			return true;
		}
		return false;
	}

	@Override
	public void cargar(Paquete paquete) throws Exception {
		if (this.puedeCargar(paquete))
			this.listaPaquetes.add(paquete);
		else
			throw new Exception("No se puede cargar la wea" + this.nombreSeņora);
	}

}
