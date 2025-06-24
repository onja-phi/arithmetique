package school.hei.arith.endpoint.rest.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AdditionControllerTest {
  private final AdditionController subject = new AdditionController();

  @Test
  void addition_test() {
    assertEquals(3, subject.addition(1, 2));
  }
}
