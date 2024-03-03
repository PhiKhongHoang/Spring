package vn.ktn3_group.hello_world;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/")
    public String index() {
        return "Xin chao ban Thang!";
    }

    @GetMapping("/h2")
    public String index2() {
        return "Xin chao cac ban!";
    }

}
