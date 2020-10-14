package dad.primertrimestre.imc;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class Caracteristicas {

	private DoubleProperty height = new SimpleDoubleProperty();
	private DoubleProperty weight = new SimpleDoubleProperty();
	private DoubleProperty imc = new SimpleDoubleProperty();

	public final DoubleProperty heightproperty() {
		return height;
	}

	public final double getheight() {
		return this.heightproperty().get();

	}

	public final void setheight(double altura) {
		this.heightproperty().set(altura / 100);
	}

	public final DoubleProperty weightproperty() {
		return weight;
	}

	public final double getweight() {
		return this.weightproperty().get();
	}

	public final void setweight(double peso) {
		this.weightproperty().set(peso);
	}

	public final DoubleProperty imcproperty() {
		return imc;
	}

	public final double getimc() {
		return this.imcproperty().get();
	}

	public final void setimc() {
		this.imcproperty().set(getweight() / (Math.pow(getheight(), 2)));
	}
}
