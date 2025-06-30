package school.hei.arith.endpoint.rest.controller;

import school.hei.arith.service.HelloWorldService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class HelloWorldController {
    private final HelloWorldService service;

    @GetMapping("/hello")
    public String helloWorld(@RequestParam String name) {
        return service.uploadHelloWorldMessage(name);
    }
}
/*package school.hei.arith.endpoint.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "... world!";
    }
}
*/