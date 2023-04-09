package greeting05;

public class Application {
	public static void main(String[] args) {
		Factory factory = GreetingFactory.getInstance();

		GreetingRenderer renderer = factory.getGreetingRenderer();
		GreetingProvider provider = factory.getGreetingProvider();
		renderer.setGreetingProvider(provider);
		renderer.render();
	}

}
