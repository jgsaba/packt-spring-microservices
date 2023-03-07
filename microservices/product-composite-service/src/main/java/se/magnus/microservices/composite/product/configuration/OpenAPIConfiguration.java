package se.magnus.microservices.composite.product.configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Setter
@Configuration
@ConfigurationProperties(prefix = "api.common")
public class OpenAPIConfiguration {

    private String version;
    private String title;
    private String description;
    private String termsOfService;
    private String license;
    private String licenseUrl;
    private String externalDocDesc;
    private String externalDocUrl;
    private String contactName;
    private String contactUrl;
    private String contactEmail;

    @Bean
    public OpenAPI getOpenAPIDocumentation(){
        return new OpenAPI()
                .info(new Info().title(title)
                        .description(description)
                        .version(version)
                        .contact(new Contact().name(contactName).url(contactUrl).email(contactEmail))
                        .termsOfService(termsOfService)
                        .license(new License().name(license).url(licenseUrl)))
                .externalDocs(new ExternalDocumentation().description(externalDocDesc).url(externalDocUrl));
    }
}
