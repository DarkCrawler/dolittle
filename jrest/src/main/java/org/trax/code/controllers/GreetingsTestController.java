package org.trax.code.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingsTestController {

   @RequestMapping(method = RequestMethod.GET, value = "/greeting", produces = "application/json")
   public String testGreeting(@RequestParam String name) {
      return String.format("Hello %s", name
      );
   }
}
