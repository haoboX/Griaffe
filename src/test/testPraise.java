package test;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Griaffe.pojo.Praise;
import com.Griaffe.service.PraiseService;

public class testPraise {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		PraiseService praiseService = (PraiseService) applicationContext.getBean("praiseService");
		Praise praise = new Praise(null, 17, 11);
		ArrayList<Praise> praises = praiseService.selectPraise(praise);
		for (Praise praise2 : praises) {
			System.out.println(praise2.toString());
		}
		System.out.println(praises.isEmpty());
	}
}
