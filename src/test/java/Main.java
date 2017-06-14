import com.bro.swagger.codegen.BroControllerCodegen;
import io.swagger.codegen.ClientOptInput;
import io.swagger.codegen.ClientOpts;
import io.swagger.codegen.Codegen;
import io.swagger.models.Swagger;
import io.swagger.parser.SwaggerParser;


public class Main {

    public static void main(String[] args) {
        ClientOptInput clientOptInput = new ClientOptInput();
        clientOptInput.setConfig(new BroControllerCodegen());
        ClientOpts clientOpts = new ClientOpts();
        Swagger swagger = new SwaggerParser().read("api.yaml", clientOptInput.getAuthorizationValues(), true);
        clientOptInput
                .opts(clientOpts)
                .swagger(swagger);
        new Codegen().opts(clientOptInput).generate();
    }
}
