package config;

import entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import repositories.UserRepository;

@Configuration
public class TestConfig {
    
    @Autowired
    private UserRepository userRepository;
    
    @Bean
    public CommandLineRunner run() {
        return args -> {
    
            User user1 = new User(null, "Fulano", "fulano@gmail.com", "999999999", "123456");
            User user2 = new User(null, "Ciclano", "ciclano@gmail.com", "888888888", "abcdef");
            userRepository.saveAll(Arrays.asList(user1, user2));
        };
    }
}
