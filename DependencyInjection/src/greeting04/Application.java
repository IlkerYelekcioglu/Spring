package greeting04;

public class Application {
	public static void main(String[] args) {
		Application app = new Application();
		
		GreetingRenderer renderer = new StandartOutputRenderer();

		GreetingProvider helloGreetingProvider = new HelloWorldGreetingProvider();
		renderer.setGreetingProvider(helloGreetingProvider);
		renderer.render();
		
		renderer = new ErrorOutputRenderer();

		GreetingProvider selamGreetingProvider = new SelamGreetingProvider();
		renderer.setGreetingProvider(selamGreetingProvider);
		renderer.render();
	}
}
