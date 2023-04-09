package greeting05;

public interface Factory {
	public GreetingRenderer getGreetingRenderer();

	public GreetingProvider getGreetingProvider();
}
