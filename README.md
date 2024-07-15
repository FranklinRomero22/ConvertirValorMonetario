# Conversor de Divisas con ExchangeRate-API
Este proyecto Java permite convertir diferentes divisas utilizando la API de ExchangeRate-API. Permite realizar conversiones entre dólares estadounidenses (USD) y varias otras monedas como el Lempira Hondureño (HNL), el Peso Argentino (ARS), y el Real Brasileño (BRL).

## Requisitos
Java 17
Biblioteca Gson para el manejo de JSON (incluida en el proyecto)
##Configuración
Antes de comenzar, asegúrate de tener una clave de API válida de ExchangeRate-API. Sustituye "TU_API_KEY" en CurrencyConverter.java con tu propia clave de API.

# Uso
Ejecución de la aplicación:

Compila y ejecuta Main.java.
Selecciona la opción deseada para convertir entre las monedas disponibles.

Opciones de conversión:

Dolar =>> Lempiras hondureño
Lempiras hondureño =>> Dolar
Dolar =>> Peso argentino
Peso argentino =>> Dolar
Dolar =>> Real Brasileño
Real Brasileño =>> Dolar
Finalización:
Selecciona "Salir" para terminar la aplicación.

Estructura del Proyecto
-El proyecto está estructurado de la siguiente manera:

-Main.java: Gestiona la interfaz de consola y las opciones de usuario.
-CurrencyConverter.java: Realiza las solicitudes a la API y realiza las conversiones de divisas.
-ApiResponse.java: Clase que modela la respuesta JSON de la API.
-gson-2.8.8.jar: Biblioteca Gson para el manejo de JSON.
