package be.vdab;

import java.math.BigDecimal;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import be.vdab.services.EuroService;

public class Main {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"container.xml")) {
			System.out.println(context.getBean(EuroService.class).naarDollar(
					BigDecimal.valueOf(2)));
		}

	}

}
