package demo;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DocumentedController {

    @Autowired
    @Qualifier("Vasya")
    Lector lector;

    @ApiOperation(
        httpMethod = "GET",
        value = "Get information about lector"
    )
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "The lector details were found"),
        @ApiResponse(code = 404, message = "The lector details was not found"),
        @ApiResponse(code = 500, message = "An internal error was produced during the execution")
    })
    @GetMapping("/lector/{lectorId}")
    public Lector get(@PathVariable("lectorId") int lectorId) {
        System.out.printf("Lector %d was requested%n", lectorId);

        return lector;
    }
}
