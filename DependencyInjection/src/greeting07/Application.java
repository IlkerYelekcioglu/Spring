package greeting07;

public class Application {
	public static void main(String[] args) {
		
		ObjectProviderFramework framework = new ObjectProviderFramework() ;

		GreetingRenderer renderer = (GreetingRenderer) framework.getObject("greeting07.StandardOutputRenderer", "greeting07.HelloWorldGreetingProvider");
		renderer.render();
		
//		renderer = (GreetingRenderer) framework.getObject("greeting07.ErrorOutputRenderer", "greeting07.SelamGreetingProvider");
//		renderer.render();
}
}