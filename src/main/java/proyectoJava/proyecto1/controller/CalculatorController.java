package proyectoJava.proyecto1.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import proyectoJava.proyecto1.model.Calculator;

@Tag(name = "Calculadora", description = "Operaciones básicas de una calculadora")
@RestController
@RequestMapping("/api/calculadora")
public class CalculatorController {

    @Operation(summary = "Suma dos números")
    @GetMapping("/sumar")
    public int add(
            @Parameter(description = "Primer número", example = "10") @RequestParam int numero1,
            @Parameter(description = "Segundo número", example = "5") @RequestParam int numero2) {
        return new Calculator().add(numero1,numero2);
    }

}
