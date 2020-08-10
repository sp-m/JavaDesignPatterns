package decorator.icecream;

public class HoneyDecorator extends IcecreamDecorator{
	public HoneyDecorator(Icecream specialIcecream) {
		super(specialIcecream);
	}
	public String honeyMix() {
		return "+honey mix";
	}
	
	public String makeIcecream() {
		return specialIcecream.makeIcecream()+honeyMix();
	}
}
