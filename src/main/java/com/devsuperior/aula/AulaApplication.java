package com.devsuperior.aula;

import com.devsuperior.aula.model.Order;
import com.devsuperior.aula.services.OrderService;
import com.devsuperior.aula.services.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class AulaApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	@Autowired
	private ShippingService shippingService;

	public static void main(String[] args) {
		SpringApplication.run(AulaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o código do pedido: ");
        int code = scanner.nextInt();

        System.out.print("Digite o preço base do pedido: ");
        double basic = scanner.nextDouble();

        System.out.print("Digite o percentual de desconto: ");
        double discount = scanner.nextDouble();

        Order order = new Order(code, basic, discount);

        System.out.print("O valor do frete é: " + shippingService.shipment(order));

        System.out.println("\n O valor total do pedido é: " + orderService.total(order));

        scanner.close();
	}
}
