package factory;

import model.Kendaraan;
import model.Kereta;

public class KeretaFactory extends KendaraanFactory {

	public KeretaFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Kendaraan buatKendaraan() {
		// TODO Auto-generated method stub
		return new Kereta();
	}

}
