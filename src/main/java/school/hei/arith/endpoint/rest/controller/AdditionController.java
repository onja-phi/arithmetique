package school.hei.arith.endpoint.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdditionController {
  @GetMapping("/add")
  public int addition(@RequestParam int a, @RequestParam int b) {
    return a + b;
  }
}
