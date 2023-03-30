package se.magnus.microservices.core.recommendation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
@Slf4j
@SpringBootApplication
@ComponentScan("se.magnus")
public class RecommendationServiceApplication {

  public static void main(String[] args) {
    ConfigurableApplicationContext ctx = SpringApplication.run(RecommendationServiceApplication.class, args);

    log.info(String.format("Connected to MongoDb: %s:%s",
            ctx.getEnvironment().getProperty("spring.data.mongodb.host"),
            ctx.getEnvironment().getProperty("spring.data.mongodb.port")));
  }
}
