package vn.ktn3_group.dev_tools;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
    @GetMapping("/")
    public String index() {
        return "KTN3_Group";
    }

    @GetMapping("/h2")
    public String index2() {
        return "Helle ban Thang!";
    }
}
