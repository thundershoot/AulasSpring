import javax.swing.JOptionPane;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.spring.beans.BeanPessoa;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"br/com/spring/config/ApplicationContext.xml");


		JOptionPane.showMessageDialog(null, appContext.getBean("beanpessoa"));
	}

}
