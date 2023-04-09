package greeting06;

public class Application {
	public static void main(String[] args) {
	ObjectProviderFramework framework = new ObjectProviderFramework() ;

	GreetingRenderer renderer = (GreetingRenderer) framework.getObject("greeting06.StandardOutputRenderer");
	GreetingProvider provider = (GreetingProvider) framework.getObject("greeting06.HelloWorldGreetingProvider");
	
	renderer.setGreetingProvider(provider);
	renderer.render();
	
	renderer = (GreetingRenderer) framework.getObject("org.javaturk.spring.di.ch02.greeting06.ErrorOutputRenderer");
	provider = (GreetingProvider) framework.getObject("org.javaturk.spring.di.ch02.greeting06.SelamGreetingProvider");
	
	renderer.setGreetingProvider(provider);
	renderer.render();
	
	provider = (GreetingProvider) framework.getObject("org.javaturk.spring.di.ch02.greeting06.ArabicGreetingProvider");
	
	renderer.setGreetingProvider(provider);
	renderer.render();
}
}
