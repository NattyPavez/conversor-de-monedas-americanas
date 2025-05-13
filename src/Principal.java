import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {


        System.out.println("BIENVENIDO/A AL CONVERSOR DE MONEDAS AMERICANAS");
        System.out.println("-----------------------------------------------");
        boolean continuar = true;
        while (continuar) {
            int opcionMoneda;
            String codigoMoneda = "";
            int opcionZona = 0;

            String menuInicial = """
                    >>> ¿Qué acción quieres hacer? <<<
                    1 - Convertir UDS en Moneda Local.
                    2 - Convertir Moneda Local en USD.
                    """;
            Scanner teclado = new Scanner(System.in);
            System.out.println(menuInicial);
            var opcionInicial = teclado.nextInt();


            if (opcionInicial == 1) {
                System.out.println(">>> Ingrese el monto en USD que desea convertir <<<");
                var dolaresAmericanos = teclado.nextDouble();
                System.out.println(""" 
                        >>> Selecciona la zona de la moneda local a la que deseas convertir a USD <<<
                        1 - Norteamérica
                        2 - Centroamérica
                        3 - Caribe
                        4 - Sudamérica
                        """);
                opcionZona = teclado.nextInt();
                //guardar codigo real

                switch (opcionZona) {
                    case 1 -> {  // "->" reemplaza al break
                        System.out.println("""
                                >>> Selecciona el tipo de Moneda Local <<<
                                1 - Dolar canadiense.
                                2 - Peso Mexicano.
                                """);
                        opcionMoneda = teclado.nextInt();
                        if (opcionMoneda == 1) codigoMoneda = "CAD";
                        else if (opcionMoneda == 2) codigoMoneda = "MXN";
                    }

                    case 2 -> {
                        System.out.println("""
                                >>> Selecciona el tipo de Moneda Local <<<
                                1 - Quetzal guatemalteco
                                2 - Lempira hondureño
                                3 - Córdoba nicaragüense
                                4 - Colón costarricense
                                5 - Balboa panameño
                                6 - Dólar beliceño
                                """);
                        opcionMoneda = teclado.nextInt();
                        switch (opcionMoneda) {
                            case 1 -> codigoMoneda = "GTQ";
                            case 2 -> codigoMoneda = "HNL";
                            case 3 -> codigoMoneda = "NIO";
                            case 4 -> codigoMoneda = "CRC";
                            case 5 -> codigoMoneda = "PAB";
                            case 6 -> codigoMoneda = "BZD";
                        }
                    }
                    case 3 -> {
                        System.out.println("""
                                >>> Selecciona el tipo de Moneda Local <<<
                                1 - Peso dominicano
                                2 - Gourde haitiano
                                3 - Dólar jamaiquino
                                4 - Dólar de Trinidad y Tobago
                                """);
                        opcionMoneda = teclado.nextInt();
                        switch (opcionMoneda) {
                            case 1 -> codigoMoneda = "DOP";
                            case 2 -> codigoMoneda = "HTG";
                            case 3 -> codigoMoneda = "JMD";
                            case 4 -> codigoMoneda = "TTD";
                        }
                    }

                    case 4 -> {
                        System.out.println("""
                                >>> Selecciona el tipo de Moneda Local <<<
                                 1 - Peso chileno
                                 2 - Peso argentino
                                 3 - Real brasileño
                                 4 - Peso colombiano
                                 5 - Sol peruano
                                 6 - Peso uruguayo
                                 7 - Bolívar venezolano
                                """);
                        opcionMoneda = teclado.nextInt();
                        switch (opcionMoneda) {
                            case 1 -> codigoMoneda = "CLP";
                            case 2 -> codigoMoneda = "ARS";
                            case 3 -> codigoMoneda = "BRL";
                            case 4 -> codigoMoneda = "COP";
                            case 5 -> codigoMoneda = "PEN";
                            case 6 -> codigoMoneda = "UYU";
                            case 7 -> codigoMoneda = "VES";
                        }
                    }
                    default -> {
                        System.out.println("¡Zona inválida!");
                        return;
                    }
                }
                ConsultaMoneda consulta = new ConsultaMoneda();
                Moneda resultado = consulta.buscaMoneda("USD"); // porque estás convirtiendo desde USD

                double tasa = resultado.conversion_rates().get(codigoMoneda);
                double convertido = dolaresAmericanos * tasa;
                // para formatear el resultad con dos decimales sout debe ser "printf"
                System.out.printf("RESULTADO = %.2f USD equivale a %.2f %s%n", dolaresAmericanos, convertido, codigoMoneda);
            }
            //CASO 2//
            if (opcionInicial == 2) {
                System.out.println(""" 
                        >>> Selecciona la zona de la moneda local que deseas convertir a USD <<<
                        1 - Norteamérica
                        2 - Centroamérica
                        3 - Caribe
                        4 - Sudamérica
                        """);
                opcionZona = teclado.nextInt();
                switch (opcionZona) {
                    case 1 -> {  // "->" reemplaza al break
                        System.out.println("""
                                >>> Selecciona el tipo de Moneda Local <<<
                                1 - Dolar canadiense.
                                2 - Peso Mexicano.
                                """);
                        opcionMoneda = teclado.nextInt();
                        if (opcionMoneda == 1) codigoMoneda = "CAD";
                        else if (opcionMoneda == 2) codigoMoneda = "MXN";
                    }

                    case 2 -> {
                        System.out.println("""
                                >>> Selecciona el tipo de Moneda Local <<<
                                1 - Quetzal guatemalteco
                                2 - Lempira hondureño
                                3 - Córdoba nicaragüense
                                4 - Colón costarricense
                                5 - Balboa panameño
                                6 - Dólar beliceño
                                """);
                        opcionMoneda = teclado.nextInt();
                        switch (opcionMoneda) {
                            case 1 -> codigoMoneda = "GTQ";
                            case 2 -> codigoMoneda = "HNL";
                            case 3 -> codigoMoneda = "NIO";
                            case 4 -> codigoMoneda = "CRC";
                            case 5 -> codigoMoneda = "PAB";
                            case 6 -> codigoMoneda = "BZD";
                        }
                    }
                    case 3 -> {
                        System.out.println("""
                                >>> Selecciona el tipo de Moneda Local <<<
                                1 - Peso dominicano
                                2 - Gourde haitiano
                                3 - Dólar jamaiquino
                                4 - Dólar de Trinidad y Tobago
                                """);
                        opcionMoneda = teclado.nextInt();
                        switch (opcionMoneda) {
                            case 1 -> codigoMoneda = "DOP";
                            case 2 -> codigoMoneda = "HTG";
                            case 3 -> codigoMoneda = "JMD";
                            case 4 -> codigoMoneda = "TTD";
                        }
                    }

                    case 4 -> {
                        System.out.println("""
                                >>> Selecciona el tipo de Moneda Local <<<
                                 1 - Peso chileno
                                 2 - Peso argentino
                                 3 - Real brasileño
                                 4 - Peso colombiano
                                 5 - Sol peruano
                                 6 - Peso uruguayo
                                 7 - Bolívar venezolano
                                """);
                        opcionMoneda = teclado.nextInt();
                        switch (opcionMoneda) {
                            case 1 -> codigoMoneda = "CLP";
                            case 2 -> codigoMoneda = "ARS";
                            case 3 -> codigoMoneda = "BRL";
                            case 4 -> codigoMoneda = "COP";
                            case 5 -> codigoMoneda = "PEN";
                            case 6 -> codigoMoneda = "UYU";
                            case 7 -> codigoMoneda = "VES";
                        }
                    }
                    default -> {
                        System.out.println("Zona inválida");
                        return;
                    }

                }
                System.out.println(">>> Ingrese el monto en " + codigoMoneda + " que desea convertir a USD <<<");
                double montoLocal = teclado.nextDouble();

                ConsultaMoneda consulta = new ConsultaMoneda();
                Moneda resultado = consulta.buscaMoneda(codigoMoneda); // moneda local como base

                double tasa = resultado.conversion_rates().get("USD");
                double convertido = montoLocal * tasa;

                System.out.printf("RESULTADO = %.2f %s equivale a %.2f USD%n", montoLocal, codigoMoneda, convertido);

            }

        System.out.println("--------------------------------------");
        System.out.println("""
            >>> ¿DESEA SEGUIR CONVIRTIENDO MONEDAS? <<<
            1 - Sí
            2 - No
            """);
        var consultaFinal = teclado.nextInt();

        if (consultaFinal == 1){
            continuar = true;
        }else  if (consultaFinal == 2){
            continuar = false;
            System.out.println("""
        Gracias por utilizar el Conversor de Monedas Americanas
        ¡Hasta pronto!
        """);
            teclado.close();
            }
        }
    }
}
