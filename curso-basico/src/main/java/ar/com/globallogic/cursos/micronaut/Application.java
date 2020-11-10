package ar.com.globallogic.cursos.micronaut;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;

@OpenAPIDefinition(
        info = @Info(
                title = "Hello World",
                version = "0.0",
                description = "My API Hello World",
                license = @License(name="Apache 2.0", url = "https://boo.bar"),
                contact = @Contact(url = "https://gigantic-server.com", name = "Fred", email = "Fred@gigagantic-server.com")
        ), security = @SecurityRequirement(name = "Open")

)
@SecurityScheme(type = SecuritySchemeType.APIKEY,
        name = "Open",
        in = SecuritySchemeIn.HEADER)
public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }
}
