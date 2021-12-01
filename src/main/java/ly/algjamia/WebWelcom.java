package ly.algjamia;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebWelcom {

	@GetMapping("/welcome")
	public String Welcome() {
		return "Welcom With Spring Boot Web";
	}
}
