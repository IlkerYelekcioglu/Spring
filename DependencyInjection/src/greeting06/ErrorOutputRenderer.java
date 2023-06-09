package greeting06;

public class ErrorOutputRenderer implements GreetingRenderer{
	private GreetingProvider greetingProvider = null;
	
	@Override
	public void setGreetingProvider(GreetingProvider greetingProvider) {
		this.greetingProvider = greetingProvider;
	}

	@Override
	public void render() {
		String greeting = greetingProvider.getGreeting();
		System.err.println(greeting);
	}

}
