package dev.agasen.microservices.mcq.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.agasen.api.core.Mcq;

@RestController
public class McqController {

  @GetMapping("/test")
  public Mcq getMcq() {
    return new Mcq(
      001L,
      "Some Topic",
      "Some QUestion",
      null
    );
  }
}
