# 💱 Conversor de Monedas Americanas - Challenge Alura ONE

Este proyecto es parte del **Challenge 2 del programa Oracle Next Education - BackEnd G8 (Alura Latam)**.  
Consiste en crear un conversor de monedas que utilice una API para calcular tasas reales de cambio, aplicando los contenidos aprendidos durante la formación en Java orientado a objetos.

---

## 🧠 Enfoque lógico y construcción del proyecto

Al comenzar este desafío, decidí no limitarme a cumplir el requerimiento básico, sino **construir una lógica desde la perspectiva del usuario final**. 

Así fue como surgió la idea de trabajar con monedas exclusivamente del **continente americano**, separándolas por **zonas geográficas**: Norteamérica, Centroamérica, Caribe y Sudamérica. Esta categorización me permitió estructurar los menús de forma más amigable.

Para filtrar y organizar todas las monedas de la API, utilicé herramientas de apoyo como ChatGPT, que me facilitaron ese proceso para luego así enfocarme en aplicar bien los conceptos técnicos.

### 🔍 Estructura de clases

- **`Moneda.java`** → clase tipo `record` que modela el JSON recibido de la API.
- **`ConsultaMoneda.java`** → clase encargada de hacer la solicitud HTTP, manejar excepciones (`IOException`, `InterruptedException`) y deserializar el JSON con la librería `Gson`.
- **`Principal.java`** → contiene toda la lógica de funcionamiento e interacción con el usuario desde consola.

### 🧭 Lógica funcional

1. El usuario elige si desea:
   - Convertir USD a moneda local, o
   - Convertir moneda local a USD.
2. Luego selecciona una **zona** del continente.
3. Escoge una **moneda específica** dentro de esa zona.
4. Ingresa el monto a convertir.
5. El sistema realiza una operación aritmética simple con la tasa de conversión entregada por la API y muestra el resultado.

Para mejorar la experiencia:
- Implementé formato con `printf` para mostrar solo **2 decimales**.
- Agregué un **bucle `while`** para permitir múltiples conversiones.
- Estructuré los menús mediante `if/else` y `switch`, manteniendo un flujo lógico fácil de seguir.

---

## 📚 Contenidos aplicados en el proyecto

Este proyecto fue pensado como un repaso práctico de **todos los conceptos abordados a lo largo de los 5 cursos** de la formación "Java Orientado a Objetos", incluyendo:

- Uso de `Scanner` para capturar datos del usuario
- Estructuras condicionales: `if`, `else`, `switch`
- Bucles con `while` para mantener la interacción
- Manejo de clases y métodos separados por responsabilidad
- Implementación de clases `record` 
- Consumo de APIs REST con `HttpClient`, `HttpRequest`, `HttpResponse`
- Manejo de respuestas y deserialización JSON usando `Gson`
- Uso de `Map<String, Double>` para leer valores dinámicos desde la API
- Concatenación de cadenas y formateo de salida con `System.out.printf`
- Control de excepciones con `try/catch`
- Separación de lógica por zonas geográficas para mejorar experiencia de usuario
- Uso de inteligencia artificial (ChatGPT) como apoyo para filtrar información, validar ideas y agilizar procesos durante la planificación y desarrollo.

---

## 🚧 Consideraciones y mejoras pendientes

- Tengo total consciencia de que el código puede factorizarse para hacerlo más limpio, reutilizable y robusto.
- Aún no he aplicado validación de entrada para evitar errores si el usuario digita letras o valores inválidos, pero es una mejora reconocida que aplicaré en versiones futuras.
- La intención de este proyecto fue **afianzar conocimientos, practicar la lógica y aplicar conscientemente todos los contenidos vistos hasta ahora**.

---

## 🏁 Conclusión

Este proyecto fue una instancia de **autodesafío y aprendizaje**, donde prioricé la práctica repetida de conceptos, el diseño de flujos desde la empatía con el usuario, y la conexión entre lógica, código y funcionalidad real.

---

## ▶️ Cómo ejecutar el proyecto

1. Clona este repositorio o descarga los archivos.
2. Abre el proyecto en IntelliJ IDEA 
3. Asegúrate de tener acceso a Internet y que la librería `gson-2.13.1.jar` esté incluida.
4. Ejecuta la clase `Principal` desde consola.
5. Sigue las instrucciones del menú interactivo.

---

## 🎥 Demostración

[🎬 https://www.linkedin.com/feed/update/urn:li:ugcPost:7328145163199934464/]

---

## 📌 Sobre mí

Estudiante de Backend Java con Oracle - Alura Latam.  
Este repositorio refleja mi proceso de aprendizaje y crecimiento como desarrolladora.  
Cada línea de código es parte de una construcción real y comprometida con mi formación.

## 📬 Contacto:

📧 nattypavez@gmail.com   
💼 https://www.linkedin.com/in/natalia-pavez-programacion/  
🐙 https://github.com/NattyPavez

---
