package decorator.icecream;

public class TestDecorator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Icecream icecream = new HoneyDecorator(new NuttyDecorator(new SimpleIcecream()));
		icecream.makeIcecream();
	}

}
