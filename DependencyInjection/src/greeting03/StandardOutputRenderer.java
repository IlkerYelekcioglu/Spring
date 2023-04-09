package greeting03;

public class StandardOutputRenderer {
private HelloWorldGreetingProvider greetinngProvider = null;

public void setGreetingProvider(HelloWorldGreetingProvider provider){
    this.greetinngProvider = provider;
}
public void render(){
    String greeting = greetinngProvider.getGreeting();
    System.out.println(greeting);
}

}
