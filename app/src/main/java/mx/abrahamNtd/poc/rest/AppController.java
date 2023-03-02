package mx.abrahamNtd.poc.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	private final MathService server = new MathService();

	@GetMapping("/hi")
	public String sayHi(@RequestParam(value = "name", defaultValue = "World") String name) {
		return "Hellow " + name;
	}

	@GetMapping("/factorial")
	public String getFactorial(@RequestParam(value = "number") String number) {
		long result = 0;
		return "The result is: " + result;
	}

	@GetMapping("/plus")
	public String getPlus(@RequestParam(value = "a") String a, @RequestParam(value = "b") String b) {
		long result = 0;
		return "The result is: " + result;
	}
}