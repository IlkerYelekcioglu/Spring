package greeting08;

public class HelloWorldMessageRenderer implements GreetingProvider {
	@Override
	public String getGreeting() {
		return "Hello World!";
	}

}
