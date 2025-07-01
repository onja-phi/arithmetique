package com.example.demo.endpoint.rest.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AdditionControllerTest {
  private final AdditionController subject = new AdditionController();

  @Test
  void addition_test() {
    assertEquals(3, subject.addition(1, 2));
  }

  @Test
  void addition_no_overflow() {
    assertEquals(3_000_000_000L, subject.addition(1_000_000_000, 2_000_000_000));
  }
}
