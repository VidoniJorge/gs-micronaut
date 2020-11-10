package ar.com.globallogic.cursos.micronaut.handlers;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.server.exceptions.ExceptionHandler;
import javax.inject.Singleton;

@Singleton
public class ErrorHandlerCustom implements ExceptionHandler<RuntimeException, HttpResponse> {

    @Override
    public HttpResponse handle(HttpRequest request, RuntimeException exception) {
        return HttpResponse.ok().body("{ " +
                    "\"status\" : \"RuntimeException\"" +
                "}");
    }
}
