package guru.springframework.controllers;

import guru.springframework.services.GreetingService;

public class ConstructorInjectedController {
    public GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
