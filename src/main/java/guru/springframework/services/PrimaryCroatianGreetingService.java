package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"hr", "default"})
public class PrimaryCroatianGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Pozdrav - Primarni servis za pozdravljanje.";
    }
}
