package com.ny.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ExampleController {

  @GetMapping("/")
  public Map<String, String> index() {
    Map<String, String> returnVal = new HashMap<>();

    returnVal.put("hello","world");
    return returnVal;
  }
}
