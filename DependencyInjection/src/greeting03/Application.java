package greeting03;

public class Application {
    public static void main(String[] args){
     StandardOutputRenderer renderer = new StandardOutputRenderer();

     HelloWorldGreetingProvider provider = new HelloWorldGreetingProvider();

     renderer.setGreetingProvider(provider);

     renderer.render();
    }
}
