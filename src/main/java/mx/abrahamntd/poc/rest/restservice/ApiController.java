package mx.abrahamntd.poc.rest.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	private static final String template = "Hello %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/hello")
	public RestMessage hello(@RequestParam(value = "name", defaultValue = "abrahamntd") String name) {
		return new RestMessage(counter.incrementAndGet(), String.format(template, name));
	}
}
