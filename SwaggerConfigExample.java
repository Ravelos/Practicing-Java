package nome.de.teu.pacote.aqui.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public GroupedOpenApi api(){
        return GroupedOpenApi.builder()
                .group("OlaMundo")
                .pathsToMatch("/**")
                .build();
    }

    @Bean
    public OpenAPI apiInfo() {
        return new OpenAPI()
                .info(new Info().title("Nome de tu app aqui")
                        .description("Descripção aqui")
                        .version("Número de versão aqui")
                        .contact(new Contact()
                                .name("Nome da organização")
                                .email("email da organização")
                                .url("url da organização")
                        )
                );
    }
}
