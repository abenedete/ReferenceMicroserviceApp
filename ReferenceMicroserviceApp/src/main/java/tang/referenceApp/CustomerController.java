package tang.referenceApp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class CustomerController {

	@GetMapping("/customers")
	public ResponseEntity<Iterable<Customer>> customers() {

		List<Customer> customers = new ArrayList<Customer>();
		customers.add(new Customer(Long.valueOf(1), "customer1"));
		customers.add(new Customer(Long.valueOf(2), "customer2"));
		customers.add(new Customer(Long.valueOf(3), "customer3"));
		return ResponseEntity.ok(customers);
	}

}