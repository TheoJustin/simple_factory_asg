package factory;

import model.Kendaraan;
import model.Pesawat;

public class PesawatFactory extends KendaraanFactory {

	public PesawatFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Kendaraan buatKendaraan() {
		// TODO Auto-generated method stub
		return new Pesawat();
	}

}
