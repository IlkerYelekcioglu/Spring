package greeting08;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) throws Exception {

		BeanFactory beanfactory = new ClassPathXmlApplicationContext("/Users/yelek/greeting08/resources/beans.xml");
		
		GreetingRenderer renderer = (GreetingRenderer) beanfactory.getBean("renderer");
		renderer.render();

//		GreetingProvider provider = (GreetingProvider) factory.getBean("provider");
//		System.out.println(provider.getGreeting());
	}
}	
