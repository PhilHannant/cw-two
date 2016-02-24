package Implementation;

import Interfaces.Game;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Factory {

    public static Game getInstance(Class c, Boolean b)throws Exception {
        BeanFactory factory = getBeanFactory();
        Game GI = (Game) factory.getBean("gameImpl");

        return new GameImpl(b);
    }

    private static BeanFactory getBeanFactory() throws Exception {
        // create a bean factory from anno.xml
        BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
        return factory;
    }

}
