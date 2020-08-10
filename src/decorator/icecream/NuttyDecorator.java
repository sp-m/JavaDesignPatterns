package decorator.icecream;

public class NuttyDecorator extends IcecreamDecorator {
	public NuttyDecorator(Icecream specialIcecream) {
		super(specialIcecream);
	}
	private String addNuts() {
		return "+ crunchy nuts";
	}
	public String makeIcecream() {
		return specialIcecream.makeIcecream()+addNuts();
	}
}
 