package vn.ktn3_group.properties_congifuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PropertiesCongifurationApplication {
	@Value("${khoahoc.ten}")
	private String ten;

	@Value("${khoahoc.huongdan}")
	private String huongdan;

	@Value("${khoahoc.website}")
	private String website;


	public static void main(String[] args) {
		SpringApplication.run(PropertiesCongifurationApplication.class, args);
	}

	@GetMapping("/")
	public String index() {
		return "KTN3_Group";
	}

	@GetMapping("/info")
	public String info() {
		return "Ten: " + ten + "<br>Huong dan: " + huongdan + "<br>website: " + website;
	}
}
