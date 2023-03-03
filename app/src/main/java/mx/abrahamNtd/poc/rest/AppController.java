package mx.abrahamNtd.poc.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	private final MathService service = new MathService();

	@GetMapping("/hi")
	public String sayHi(@RequestParam(value = "name", defaultValue = "World") String name) {
		return "Hellow " + name;
	}

	@GetMapping("/factorial")
	public String getFactorial(@RequestParam(value = "number") int number) {
		long result = service.factorial(number);
		return "The result of " + number + "! is: " + result;
	}

	@GetMapping("/plus")
	public String getPlus(@RequestParam(value = "a") int a, @RequestParam(value = "b") int b) {
		long result = service.plus(a,b);
		return "The result of " + a + " + "+ b + " is: " + result;
	}
}