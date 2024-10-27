package factory;

import model.Bus;
import model.Kendaraan;

public class BusFactory extends KendaraanFactory {

	public BusFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Kendaraan buatKendaraan() {
		// TODO Auto-generated method stub
		return new Bus();
	}

}
