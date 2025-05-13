import java.util.Map;

public record Moneda(
        String result, // consulta exitosa
        String base_code, // USD moneda base
        Map<String, Double> conversion_rates // tasa de conversion segun tipo de moneda
) {}
