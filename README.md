# 🚀 Plan de Estudio: 50 Ejercicios Clave de Java para tu Futuro Backend

¡Hola! Soy tu guía en este viaje para dominar Java con miras al desarrollo backend. Este plan de 50 ejercicios está diseñado como una ruta de aprendizaje progresiva. No te saltes pasos. Cada ejercicio construye sobre el anterior, fortaleciendo tu lógica, tu dominio del lenguaje y tu mentalidad de resolución de problemas.

**Nuestra Metodología:**

* 🎯 **Objetivo Claro:** Cada ejercicio tiene un propósito específico. ¡Entiéndelo antes de empezar!
* 💡 **Relevancia:** Te explicaré por qué cada concepto es importante para un desarrollador (especialmente backend).
* 💻 **Práctica Deliberada:** Escribe, prueba, depura y *experimenta*. No solo copies.
* 🤔 **Análisis:** Pregúntate: ¿Cómo funciona esto? ¿Qué pasa si cambio algo? ¿Hay otra forma de hacerlo?

**¡Empecemos nuestra formación! Marca tu progreso:**

---

## Fase 1: Los Cimientos de Java (Ejercicios 1-10)

> **Maestro Dice:** Aquí sentamos las bases. Dominar esto es como aprender el alfabeto antes de escribir. Es *fundamental* para todo lo que sigue. Concéntrate en la sintaxis exacta y el flujo básico.

- [ ] **1. Tu Primer Programa: El `Hola Mundo`**
      * **Objetivo Específico:** Comprender la estructura mínima de un programa Java ejecutable y cómo mostrar información en la consola.
      * **Por qué es importante:** Es el primer paso universal. Te familiariza con el ciclo de escribir, compilar (si aplica) y ejecutar, además de la función esencial de salida de datos (`System.out.println`).
      * **Instrucciones:** Crea un archivo `HolaMundo.java`, escribe el código necesario para que imprima "¡Hola, Mundo!" y ejecútalo.
      * **Conceptos Reforzados:** `public class`, `public static void main(String[] args)`, `System.out.println()`.

- [ ] **2. El Almacén de Datos: Variables y Tipos Primitivos**
      * **Objetivo Específico:** Aprender a declarar variables para almacenar diferentes tipos de datos básicos (números, booleanos, caracteres) y el tipo `String` para texto.
      * **Por qué es importante:** Las variables son contenedores de información. Necesitas saber qué "tipo" de contenedor usar para cada dato (¿un número entero? ¿un texto? ¿un valor de verdad?). Esto es crucial para manejar cualquier información en tus programas.
      * **Instrucciones:** Declara variables `int`, `double`, `boolean`, `char` y `String`. Asígnales valores e imprímelos para verlos en la consola.
      * **Conceptos Reforzados:** Tipos de datos primitivos, `String`, declaración (`int numero;`), inicialización (`numero = 10;`), asignación.

- [ ] **3. La Calculadora Básica: Operadores Aritméticos**
      * **Objetivo Específico:** Aprender a recibir datos del usuario desde la consola y aplicar los operadores aritméticos fundamentales en Java.
      * **Por qué es importante:** Casi todas las aplicaciones necesitan interactuar con el usuario o con otras fuentes de datos. Comprender los operadores es la base para cualquier cálculo o lógica matemática que necesites implementar (desde calcular totales hasta lógicas de negocio complejas).
      * **Instrucciones:** Usa `Scanner` para leer dos números (ej: `double`). Calcula y muestra la suma, resta, multiplicación, división y módulo.
      * **Conceptos Reforzados:** `java.util.Scanner`, `nextDouble()`, `nextInt()`, operadores `+`, `-`, `*`, `/`, `%`.

- [ ] **4. Tomando Decisiones: Operadores de Comparación y Lógicos**
      * **Objetivo Específico:** Implementar lógica condicional usando `if-else` basada en comparaciones y combinar condiciones usando operadores lógicos.
      * **Por qué es importante:** Los programas toman decisiones constantemente. "¿El usuario es mayor de edad?", "¿La contraseña es correcta?", "¿Hay stock disponible?". Esta es la base para controlar el flujo de tu aplicación.
      * **Instrucciones:** Compara dos números (`>`, `<`, `==`). Verifica si una edad es `>= 18`. Usa `if`, `else if`, `else`. Combina condiciones con `&&` (Y), `||` (O).
      * **Conceptos Reforzados:** `if`, `else if`, `else`, operadores relacionales (`>`, `==`, etc.), operadores lógicos (`&&`, `||`, `!`).

- [ ] **5. Geometría Simple: Uso de la Clase `Math`**
      * **Objetivo Específico:** Utilizar métodos y constantes predefinidas de la librería estándar de Java, específicamente de la clase `Math`.
      * **Por qué es importante:** Java viene con muchas herramientas listas para usar. `Math` te ahorra tener que implementar funciones matemáticas comunes. Aprender a usar las bibliotecas estándar es clave para ser productivo.
      * **Instrucciones:** Calcula el área de un círculo ($\pi r^2$) pidiendo el radio. Usa `Math.PI` para $\pi$ y `Math.pow()` para la potencia.
      * **Conceptos Reforzados:** Clases de utilidad (`Math`), constantes (`Math.PI`), métodos estáticos (`Math.pow`).

- [ ] **6. Conversiones: Aplicando Fórmulas**
      * **Objetivo Específico:** Traducir una fórmula matemática simple a código Java, prestando atención al orden de las operaciones y tipos de datos.
      * **Por qué es importante:** Frecuentemente necesitarás implementar reglas de negocio o cálculos basados en fórmulas. Este ejercicio practica esa traducción directa.
      * **Instrucciones:** Convierte grados Celsius a Fahrenheit ($F = (C \times 9.0/5.0) + 32$). ¡Ojo con la división entera si usas `int`! Usa `double` para precisión.
      * **Conceptos Reforzados:** Orden de operaciones, tipos de datos (`double`), conversión de fórmulas.

- [ ] **7. Clasificación Simple: Par o Impar**
      * **Objetivo Específico:** Aplicar el operador módulo (`%`) para resolver un problema de clasificación simple usando una estructura `if-else`.
      * **Por qué es importante:** El módulo es sorprendentemente útil para muchas tareas (ciclos, distribuciones, validaciones). Este es un uso clásico y fácil de entender.
      * **Instrucciones:** Pide un número entero y determina si es par (resto 0 al dividir por 2) o impar.
      * **Conceptos Reforzados:** Operador módulo (`%`), `if-else`.

- [ ] **8. Repetición Controlada: El Bucle `for`**
      * **Objetivo Específico:** Implementar un bucle que se repite un número conocido de veces usando la estructura `for`.
      * **Por qué es importante:** Los bucles `for` son ideales cuando sabes de antemano cuántas veces necesitas repetir una acción (ej: procesar todos los elementos de una lista de tamaño fijo, iterar 10 veces).
      * **Instrucciones:** Imprime los números enteros del 1 al 10.
      * **Conceptos Reforzados:** Bucle `for` (inicialización, condición, incremento).

- [ ] **9. Repetición Basada en Condición: El Bucle `while`**
      * **Objetivo Específico:** Implementar un bucle que se repite *mientras* una condición sea verdadera.
      * **Por qué es importante:** Los bucles `while` son perfectos cuando no sabes cuántas veces necesitas iterar, pero sí sabes cuándo debes parar (ej: seguir pidiendo input hasta que sea válido, procesar datos mientras haya datos disponibles).
      * **Instrucciones:** Pide un número N. Calcula la suma $1 + 2 + ... + N$ usando `while`. Necesitarás un contador y un acumulador.
      * **Conceptos Reforzados:** Bucle `while`, variables contadoras, variables acumuladoras, condición de parada.

- [ ] **10. El Menú Interactivo: Bucles `do-while` y `switch`**
      * **Objetivo Específico:** Crear un menú de opciones que se muestre al menos una vez y se repita hasta que el usuario elija salir. Usar `switch` para manejar las diferentes opciones.
      * **Por qué es importante:** El `do-while` garantiza la ejecución al menos una vez (útil para menús). El `switch` es una forma organizada de manejar múltiples casos basados en el valor de una variable (mejor que muchos `if-else if` anidados para este escenario).
      * **Instrucciones:** Muestra opciones (1. Acción A, 2. Acción B, 0. Salir). Lee la opción del usuario. Ejecuta la acción correspondiente usando `switch`. Repite con `do-while` hasta que la opción sea 0.
      * **Conceptos Reforzados:** Bucle `do-while`, sentencia `switch`, `case`, `break`, `default`.

---

## Fase 2: Estructurando Datos y Lógica (Ejercicios 11-20)

> **Maestro Dice:** Ahora que controlas el flujo básico, vamos a manejar conjuntos de datos con *arrays* y a implementar algoritmos un poco más elaborados. Esto empieza a parecerse más a resolver problemas reales.

- [ ] **11. Cálculos Recursivos (Iterativo): Factorial**
      * **Objetivo Específico:** Implementar un algoritmo matemático común que requiere acumulación (multiplicación repetida) usando un bucle.
      * **Por qué es importante:** Entender cómo implementar algoritmos matemáticos es útil. El factorial, aunque simple, es un buen ejemplo de acumulación en bucles.
      * **Instrucciones:** Calcula $N! = N \times (N-1) \times ... \times 1$. Pide N al usuario. Usa un bucle `for` o `while`. Considera el caso base (0! = 1).
      * **Conceptos Reforzados:** Bucles, acumulación (producto), casos base (lógica).

- [ ] **12. Búsqueda y Validación: Número Primo**
      * **Objetivo Específico:** Implementar un algoritmo de búsqueda/validación que requiere verificar una condición para un rango de valores usando bucles y lógica booleana.
      * **Por qué es importante:** La validación de datos y la búsqueda de propiedades específicas son tareas comunes. Este ejercicio requiere pensar en eficiencia (no necesitas probar divisores más allá de la raíz cuadrada, aunque puedes empezar probando hasta N/2).
      * **Instrucciones:** Pide un número. Determina si es primo (solo divisible por 1 y por sí mismo). Usa un bucle para probar divisores y una variable `boolean` (flag) para rastrear si encontraste un divisor.
      * **Conceptos Reforzados:** Bucles, operador módulo, variables `boolean` (flags), optimización básica de algoritmos.

- [ ] **13. Secuencias y Estado: Fibonacci**
      * **Objetivo Específico:** Generar una secuencia donde cada término depende de los anteriores, requiriendo el manejo cuidadoso de variables para guardar estados previos.
      * **Por qué es importante:** Muchas veces, el estado actual de tu proceso depende de resultados anteriores. Fibonacci es el ejemplo clásico para practicar cómo gestionar estas dependencias temporales dentro de un bucle.
      * **Instrucciones:** Genera los primeros N números de Fibonacci (0, 1, 1, 2, 3, 5...). Necesitarás variables para guardar los dos números anteriores de la secuencia.
      * **Conceptos Reforzados:** Bucles, gestión de estado entre iteraciones.

- [ ] **14. Colecciones Fijas: Introducción a los Arrays**
      * **Objetivo Específico:** Aprender a declarar, inicializar y recorrer arrays unidimensionales de tamaño fijo para almacenar colecciones de datos del mismo tipo.
      * **Por qué es importante:** Los arrays son la estructura de datos más básica para agrupar elementos. Son fundamentales, aunque en Java moderno a menudo usarás Colecciones más flexibles (Fase 4). Entenderlos es crucial.
      * **Instrucciones:** Crea un `int[]` de tamaño 5. Pide al usuario 5 enteros usando un bucle y guárdalos en el array. Luego, usa otro bucle para mostrar los valores almacenados.
      * **Conceptos Reforzados:** Declaración (`tipo[] nombre`), inicialización (`new tipo[tamaño]`), acceso a elementos (`array[indice]`), recorrido con bucle `for`, propiedad `length`.

- [ ] **15. Operaciones sobre Colecciones: Suma y Promedio en Array**
      * **Objetivo Específico:** Realizar cálculos agregados (suma, promedio) sobre los elementos de un array.
      * **Por qué es importante:** Es muy común necesitar procesar colecciones de datos para obtener estadísticas o resultados consolidados.
      * **Instrucciones:** Dado un array de `double` (puedes llenarlo tú mismo o pedir los datos), calcula la suma total de sus elementos y luego el promedio.
      * **Conceptos Reforzados:** Recorrido de arrays, acumulación, cálculo de promedio.

- [ ] **16. Búsqueda en Colecciones: Máximo y Mínimo en Array**
      * **Objetivo Específico:** Implementar un algoritmo simple para encontrar los valores extremos (máximo y mínimo) dentro de un array.
      * **Por qué es importante:** Encontrar máximos/mínimos es otro procesamiento típico de colecciones de datos. Practica la lógica de comparación y actualización de un valor "candidato".
      * **Instrucciones:** Encuentra el número más grande y el más pequeño en un array de enteros. Necesitarás variables para guardar el máximo/mínimo encontrado *hasta el momento*.
      * **Conceptos Reforzados:** Recorrido de arrays, comparación, actualización condicional de variables.

- [ ] **17. Búsqueda Específica: Encontrar un Elemento en Array (Lineal)**
      * **Objetivo Específico:** Implementar el algoritmo de búsqueda lineal para encontrar la primera ocurrencia de un valor específico dentro de un array.
      * **Por qué es importante:** La búsqueda es una operación fundamental. La búsqueda lineal es la más simple (comprobar uno por uno), y aunque no la más eficiente para arrays grandes y ordenados, es esencial entenderla.
      * **Instrucciones:** Pide un número al usuario. Busca ese número en un array predefinido. Si lo encuentras, informa el índice donde está. Si no, informa que no se encontró. Detén la búsqueda tan pronto como lo encuentres.
      * **Conceptos Reforzados:** Búsqueda lineal, recorrido de arrays, `break` para salir de un bucle.

- [ ] **18. Datos Tabulares: Arrays Bidimensionales (Matrices)**
      * **Objetivo Específico:** Trabajar con arrays de dos dimensiones (matrices) para representar datos tabulares y realizar operaciones entre ellas.
      * **Por qué es importante:** Las matrices son útiles para representar rejillas, tableros, hojas de cálculo, imágenes, etc. Aprender a manejarlas abre la puerta a problemas más complejos.
      * **Instrucciones:** Crea dos matrices `int[3][3]`. Llénalas con números. Calcula la matriz suma (cada elemento `C[i][j] = A[i][j] + B[i][j]`). Muestra la matriz resultante.
      * **Conceptos Reforzados:** Arrays bidimensionales, bucles anidados (`for` dentro de `for`), acceso `matriz[fila][columna]`.

- [ ] **19. Manipulación de Texto: Palíndromos**
      * **Objetivo Específico:** Manipular cadenas de texto (`String`) para verificar una propiedad específica (palíndromo) comparando caracteres desde extremos opuestos.
      * **Por qué es importante:** El procesamiento de texto es omnipresente en el software (validación de entradas, análisis de datos, etc.). Este ejercicio practica el acceso a caracteres individuales y la lógica de comparación simétrica.
      * **Instrucciones:** Pide una palabra. Verifica si es un palíndromo (se lee igual al derecho y al revés). Compara el primer carácter con el último, el segundo con el penúltimo, y así sucesivamente. Ignora mayúsculas/minúsculas si quieres un desafío extra (`toLowerCase()`).
      * **Conceptos Reforzados:** `String`, `length()`, `charAt(index)`, bucles, comparación de caracteres.

- [ ] **20. Análisis de Texto: Contar Vocales**
      * **Objetivo Específico:** Recorrer una cadena de texto y contar las ocurrencias de ciertos caracteres (vocales) usando condicionales.
      * **Por qué es importante:** Otro ejemplo de análisis de texto básico. Te fuerza a pensar en cómo clasificar caracteres y llevar una cuenta.
      * **Instrucciones:** Pide una frase. Cuenta cuántas vocales (a, e, i, o, u, considera también mayúsculas) contiene. Puedes usar un `switch` o múltiples `||` en un `if`.
      * **Conceptos Reforzados:** `String`, `charAt()`, bucles, `switch` o `if-else if`, contadores.

---

## Fase 3: El Paradigma Orientado a Objetos (POO) (Ejercicios 21-30)

> **Maestro Dice:** ¡Aquí es donde Java brilla! La POO nos permite modelar el mundo real (o conceptos abstractos) como "objetos" que tienen características (atributos) y comportamientos (métodos). Esto es *esencial* para construir software complejo y mantenible, la base del backend moderno.

- [ ] **21. Nuestro Primer Objeto: La Clase `Coche`**
      * **Objetivo Específico:** Definir una clase simple con atributos y métodos, y crear instancias (objetos) de esa clase. Entender la diferencia entre clase (plano) y objeto (instancia).
      * **Por qué es importante:** Es la introducción a la POO. Aprender a encapsular datos y comportamiento relacionado en una unidad lógica (la clase) es el primer paso para organizar tu código de manera efectiva.
      * **Instrucciones:** Crea `class Coche` con atributos (marca `String`, modelo `String`, velocidadActual `int`). Añade métodos `acelerar(int aumento)`, `frenar(int decremento)`, `obtenerVelocidad()` y `mostrarInfo()`. En `main`, crea dos objetos `Coche` diferentes (`new Coche(...)`) y llama a sus métodos.
      * **Conceptos Reforzados:** `class`, atributos (variables de instancia), métodos (comportamiento), constructor, `new` (instanciación), palabra clave `this`.

- [ ] **22. Protegiendo Datos: Encapsulamiento con `CuentaBancaria`**
      * **Objetivo Específico:** Aplicar el principio de encapsulamiento usando modificadores de acceso (`private`) para proteger los datos internos de un objeto y exponerlos controladamente a través de métodos públicos (getters/setters).
      * **Por qué es importante:** El encapsulamiento previene modificaciones accidentales o inválidas del estado interno de un objeto. Es clave para la robustez y mantenibilidad. Controlas *cómo* se accede y modifica la información.
      * **Instrucciones:** Crea `class CuentaBancaria` con `private double saldo;` y `private String titular;`. Crea un constructor. Añade métodos `public void depositar(double cantidad)`, `public boolean retirar(double cantidad)` (que verifique fondos) y `public double getSaldo()`, `public String getTitular()`. No permitas establecer el saldo directamente desde fuera.
      * **Conceptos Reforzados:** Modificadores de acceso (`private`, `public`), getters, setters (si son necesarios y seguros), principio de encapsulamiento.

- [ ] **23. Representación Textual: `toString()` en `Estudiante`**
      * **Objetivo Específico:** Sobrescribir el método `toString()` heredado de `Object` para proporcionar una representación textual útil y legible de un objeto.
      * **Por qué es importante:** Por defecto, imprimir un objeto muestra algo poco útil (nombreClase@hashCode). Sobrescribir `toString()` es vital para depuración y logging, permitiéndote ver el estado del objeto fácilmente.
      * **Instrucciones:** Crea `class Estudiante` (nombre, id, `ArrayList<Double> calificaciones`). Sobrescribe `@Override public String toString()` para devolver algo como "Estudiante[nombre=Juan, id=123, calificaciones=[10.0, 8.5]]".
      * **Conceptos Reforzados:** Sobrescritura (`@Override`), método `toString()`, uso básico de `ArrayList`.

- [ ] **24. Jerarquías de Clases: Herencia con `Figura`**
      * **Objetivo Específico:** Implementar la herencia creando una clase base (superclase) con características comunes y clases derivadas (subclases) que heredan y especializan esas características. Introducir clases y métodos abstractos.
      * **Por qué es importante:** La herencia permite reutilizar código y crear jerarquías de tipos ("un Círculo *es una* Figura"). Las clases abstractas definen plantillas que las subclases *deben* completar, asegurando cierta estructura.
      * **Instrucciones:** Crea `abstract class Figura` con un método `public abstract double calcularArea();`. Crea `class Circulo extends Figura` y `class Rectangulo extends Figura`. Cada una debe tener sus propios atributos (radio, base/altura) y *debe* implementar `calcularArea()` con su fórmula específica.
      * **Conceptos Reforzados:** Herencia (`extends`), clases abstractas (`abstract`), métodos abstractos, implementación de métodos heredados.

- [ ] **25. Un Método, Múltiples Formas: Polimorfismo**
      * **Objetivo Específico:** Demostrar el polimorfismo tratando objetos de diferentes subclases de manera uniforme a través de una referencia de la superclase y observando cómo se invoca el método correcto para cada objeto.
      * **Por qué es importante:** El polimorfismo permite escribir código más flexible y extensible. Puedes trabajar con una colección de `Figura`s sin saber exactamente qué tipo de figura es cada una en tiempo de compilación; Java lo resuelve en tiempo de ejecución. ¡Muy poderoso!
      * **Instrucciones:** Crea un array `Figura[] figuras = new Figura[2];`. Guarda un `new Circulo(...)` en `figuras[0]` y un `new Rectangulo(...)` en `figuras[1]`. Recorre el array con un bucle `for-each` (`for (Figura f : figuras)`) y llama a `f.calcularArea()`. Observa que se ejecuta la versión correcta del método.
      * **Conceptos Reforzados:** Polimorfismo, "binding" dinámico (late binding), tratar objetos por su tipo base.

- [ ] **26. Contratos de Comportamiento: Interfaces con `Volador`**
      * **Objetivo Específico:** Definir un "contrato" de comportamiento usando una interfaz y hacer que clases (posiblemente no relacionadas por herencia) cumplan ese contrato.
      * **Por qué es importante:** Las interfaces definen qué métodos *debe* tener una clase, sin decir *cómo* los implementa. Permiten abstraer funcionalidades y desacoplar componentes. Son fundamentales en el diseño de software (ej: `List`, `Map` son interfaces en Java).
      * **Instrucciones:** Crea `interface Volador { void volar(); }`. Crea `class Pajaro implements Volador` y `class Avion implements Volador`. Ambas deben implementar el método `volar()`, cada una a su manera (imprimiendo algo diferente).
      * **Conceptos Reforzados:** `interface`, `implements`, abstracción de comportamiento.

- [ ] **27. Construyendo con Partes: Composición (`Motor` y `Coche`)**
      * **Objetivo Específico:** Modelar una relación "tiene un" (has-a) entre clases, donde una clase contiene una instancia de otra como uno de sus atributos. Diferenciarla de la herencia ("es un", is-a).
      * **Por qué es importante:** La composición es a menudo más flexible que la herencia para reutilizar funcionalidad y construir objetos complejos a partir de partes más simples. Se prefiere la composición sobre la herencia en muchos casos.
      * **Instrucciones:** Crea una clase `Motor` (ej: con atributo `cilindrada`). Modifica la clase `Coche` (Nº 21) para que tenga un atributo `private Motor motor;`. Inicializa el motor en el constructor del coche.
      * **Conceptos Reforzados:** Composición, relación "tiene un", delegación (el coche podría tener un método `arrancar()` que llame a un método del motor).

- [ ] **28. Clases Dentro de Clases: Clases Internas (Opcional Avanzado)**
      * **Objetivo Específico:** Entender el concepto de definir una clase dentro de otra y sus casos de uso (aunque menos común en backend puro inicial).
      * **Por qué es importante:** Útil en escenarios específicos como manejo de eventos en GUI, implementación de iteradores privados o para agrupar lógicamente clases muy cohesivas. No es crucial al principio, pero bueno conocerlo.
      * **Instrucciones:** Investiga y crea un ejemplo simple, como una clase `ListaExterna` que tenga una `ClaseInterna` que pueda acceder a los miembros privados de `ListaExterna`.
      * **Conceptos Reforzados:** Clases internas (Inner classes), acceso a miembros de la clase contenedora.

- [ ] **29. Compartido por Todos: Miembros Estáticos**
      * **Objetivo Específico:** Utilizar variables y métodos estáticos (`static`) que pertenecen a la clase misma, no a instancias individuales.
      * **Por qué es importante:** Lo estático es útil para constantes compartidas (como `Math.PI`), métodos de utilidad que no dependen del estado de un objeto (como `Math.pow`), o para llevar cuentas globales (como el número de instancias creadas).
      * **Instrucciones:** Añade `private static int contadorCoches = 0;` a `Coche`. En el constructor, incrementa `contadorCoches++`. Añade `public static int getContadorCoches()` para obtener el valor. Crea varios coches y verifica el contador.
      * **Conceptos Reforzados:** `static`, variables de clase vs. variables de instancia, métodos de clase vs. métodos de instancia.

- [ ] **30. Organizando el Proyecto: Paquetes**
      * **Objetivo Específico:** Aprender a organizar las clases en paquetes para evitar conflictos de nombres y estructurar lógicamente un proyecto grande.
      * **Por qué es importante:** En cualquier proyecto real, tendrás decenas o cientos de clases. Los paquetes son *esenciales* para mantener el orden, gestionar dependencias y controlar la visibilidad.
      * **Instrucciones:** Mueve tus clases `Figura`, `Circulo`, `Rectangulo` a un paquete llamado `com.tusolucion.geometria`. En tu clase principal (que quizás esté en el paquete por defecto o en `com.tusolucion.main`), usa `import com.tusolucion.geometria.*;` o imports específicos para poder usarlas.
      * **Conceptos Reforzados:** `package`, `import`, estructura de directorios del proyecto.

---

## Fase 4: Herramientas Avanzadas del Lenguaje (Ejercicios 31-40)

> **Maestro Dice:** Ya eres un iniciado en POO. Ahora, vamos a usar herramientas más poderosas de Java: las Colecciones (listas, mapas, conjuntos dinámicos), el manejo profesional de errores (Excepciones) y la interacción con el mundo exterior (Archivos). Esto es el día a día del desarrollador.

- [ ] **31. Listas Dinámicas: `ArrayList`**
      * **Objetivo Específico:** Utilizar `ArrayList`, una implementación de la interfaz `List`, para manejar colecciones de objetos cuyo tamaño puede cambiar dinámicamente.
      * **Por qué es importante:** Los arrays tienen tamaño fijo. `ArrayList` (y otras listas) te permiten añadir y quitar elementos fácilmente, adaptándose a las necesidades. Son *extremadamente* comunes.
      * **Instrucciones:** Crea una `ArrayList<String>` para una lista de tareas. Implementa funciones para: 1) Añadir una nueva tarea. 2) Mostrar todas las tareas. 3) Eliminar una tarea por su índice o contenido.
      * **Conceptos Reforzados:** `java.util.ArrayList`, generics (`<String>`), `add()`, `get()`, `remove()`, `size()`, interfaz `List`.

- [ ] **32. Pares Clave-Valor: `HashMap`**
      * **Objetivo Específico:** Utilizar `HashMap`, una implementación de `Map`, para almacenar datos como pares de clave-valor, permitiendo búsquedas muy rápidas por clave.
      * **Por qué es importante:** Los mapas son perfectos cuando necesitas buscar información asociada a una "llave" única (ej: buscar datos de usuario por su ID, configuraciones por su nombre). Son otra estructura de datos fundamental.
      * **Instrucciones:** Crea un `HashMap<String, String>` para un diccionario Inglés-Español. Implementa: 1) Añadir una palabra y su traducción. 2) Buscar la traducción de una palabra dada (la clave). 3) Verificar si una palabra ya existe en el diccionario.
      * **Conceptos Reforzados:** `java.util.HashMap`, generics (`<String, String>`), `put(clave, valor)`, `get(clave)`, `containsKey(clave)`, interfaz `Map`.

- [ ] **33. Colecciones Sin Duplicados: `HashSet`**
      * **Objetivo Específico:** Utilizar `HashSet`, una implementación de `Set`, para almacenar elementos únicos, descartando automáticamente los duplicados.
      * **Por qué es importante:** Los Sets son ideales cuando solo te interesa saber si un elemento *está* o *no está* en la colección, y no quieres repetidos (ej: IDs de usuarios activos, etiquetas únicas).
      * **Instrucciones:** Pide al usuario que ingrese varios números (permite duplicados). Guárdalos en un `HashSet<Integer>`. Imprime el contenido del Set y observa que no hay duplicados.
      * **Conceptos Reforzados:** `java.util.HashSet`, generics (`<Integer>`), `add()` (devuelve `boolean`), garantía de unicidad, interfaz `Set`.

- [ ] **34. Recorriendo Colecciones: Iteradores (`Iterator`)**
      * **Objetivo Específico:** Aprender a recorrer colecciones usando el patrón `Iterator`, que proporciona una forma estándar y segura de acceder a los elementos, incluyendo la capacidad de eliminar elementos durante la iteración.
      * **Por qué es importante:** Aunque el bucle `for-each` es más simple para solo leer, el `Iterator` te da más control, especialmente si necesitas modificar la colección mientras la recorres (eliminar elementos es el caso de uso principal).
      * **Instrucciones:** Recorre el `ArrayList` de tareas (Nº 31) usando un `Iterator`. Luego, modifica el bucle para eliminar todas las tareas que contengan la palabra "Urgente" usando `iterator.remove()`. Recorre también las claves o valores de tu `HashMap` (Nº 32) con un iterador.
      * **Conceptos Reforzados:** `iterator()`, `Iterator<T>`, `hasNext()`, `next()`, `remove()`.

- [ ] **35. Manejo de Errores Predecibles: `try-catch`**
      * **Objetivo Específico:** Implementar el manejo básico de excepciones usando bloques `try` y `catch` para capturar errores específicos (como `ArithmeticException`) y evitar que el programa se detenga bruscamente.
      * **Por qué es importante:** Los errores ocurren. Un buen programa debe anticiparlos y manejarlos con gracia, en lugar de "crashear". `try-catch` es el mecanismo fundamental para esto en Java.
      * **Instrucciones:** Modifica tu calculadora (Nº 3) para que la operación de división esté dentro de un bloque `try`. Añade un bloque `catch (ArithmeticException e)` que imprima un mensaje amigable si el usuario intenta dividir por cero.
      * **Conceptos Reforzados:** `try`, `catch`, `ArithmeticException`, flujo de ejecución con excepciones.

- [ ] **36. Asegurando la Limpieza: `finally`**
      * **Objetivo Específico:** Utilizar el bloque `finally` para garantizar que cierto código (generalmente de limpieza, como cerrar recursos) se ejecute siempre, haya ocurrido una excepción o no.
      * **Por qué es importante:** Es crucial para liberar recursos (archivos, conexiones de red, etc.) de forma segura. `finally` (o `try-with-resources`) asegura que esta limpieza ocurra incluso si hay errores inesperados.
      * **Instrucciones:** Añade un bloque `finally` al ejercicio anterior (Nº 35) que siempre imprima "Fin de la operación de división.", independientemente de si hubo error o no.
      * **Conceptos Reforzados:** Bloque `finally`, garantía de ejecución.

- [ ] **37. Robustez en la Entrada: Validando con `try-catch`**
      * **Objetivo Específico:** Aplicar `try-catch` para manejar errores comunes de entrada de usuario, como ingresar texto cuando se espera un número (`InputMismatchException`), y permitir al usuario reintentar.
      * **Por qué es importante:** Las entradas del usuario son una fuente común de errores. Validarlas robustamente es esencial para la usabilidad y estabilidad de la aplicación.
      * **Instrucciones:** Modifica un ejercicio que pida un número (ej: Nº 9). Coloca la llamada a `scanner.nextInt()` dentro de un `try-catch (InputMismatchException e)`. Si ocurre la excepción, informa al usuario del error, consume la entrada incorrecta (`scanner.next()`) y vuelve a pedir el número usando un bucle (`while` o `do-while`).
      * **Conceptos Reforzados:** `InputMismatchException`, `Scanner`, bucles para reintentos, limpieza del buffer del scanner.

- [ ] **38. Persistencia Básica: Escribir en Archivos**
      * **Objetivo Específico:** Aprender a escribir datos (texto) desde tu programa Java a un archivo en el sistema de archivos.
      * **Por qué es importante:** Guardar datos en archivos es la forma más básica de persistencia. Necesario para guardar configuraciones, logs, resultados, etc., entre ejecuciones del programa.
      * **Instrucciones:** Pide al usuario que ingrese líneas de texto. Escribe cada línea en un archivo llamado `mi_archivo.txt`. Usa `FileWriter` y `BufferedWriter` para eficiencia. Usa `try-with-resources` para asegurar que el archivo se cierre correctamente. Termina cuando el usuario ingrese una línea vacía.
      * **Conceptos Reforzados:** `java.io.FileWriter`, `java.io.BufferedWriter`, `java.io.IOException`, `try-with-resources`.

- [ ] **39. Persistencia Básica: Leer de Archivos**
      * **Objetivo Específico:** Aprender a leer datos (texto) desde un archivo hacia tu programa Java.
      * **Por qué es importante:** Complemento de la escritura. Permite cargar configuraciones, procesar logs, leer datos guardados previamente.
      * **Instrucciones:** Lee el contenido del archivo `mi_archivo.txt` creado en el ejercicio anterior. Muestra cada línea leída en la consola. Usa `FileReader` y `BufferedReader`. Usa `try-with-resources`.
      * **Conceptos Reforzados:** `java.io.FileReader`, `java.io.BufferedReader`, `readLine()`, `IOException`, `try-with-resources`.

- [ ] **40. Errores Personalizados: Crear y Lanzar Excepciones**
      * **Objetivo Específico:** Definir tus propias clases de excepción para representar condiciones de error específicas de tu aplicación y lanzarlas (`throw`) cuando ocurran esas condiciones.
      * **Por qué es importante:** Permite un manejo de errores más semántico y específico del dominio de tu problema, haciendo el código más claro y fácil de manejar para quien lo use.
      * **Instrucciones:** Crea `class SaldoInsuficienteException extends Exception`. En el método `retirar` de `CuentaBancaria` (Nº 22), si `cantidad > saldo`, lanza `throw new SaldoInsuficienteException("Saldo insuficiente para retirar " + cantidad);`. En el código que llama a `retirar`, añade un `catch (SaldoInsuficienteException e)` para manejar este error específico. Asegúrate de que el método `retirar` declare que puede lanzar esta excepción (`throws SaldoInsuficienteException`).
      * **Conceptos Reforzados:** Crear clases de excepción personalizadas, `throw`, `throws`.

---

## Fase 5: Preparándonos para el Backend (Ejercicios 41-50)

> **Maestro Dice:** ¡Excelente progreso! Ahora introduciremos conceptos más modernos de Java (Lambdas, Streams) y nos acercaremos al núcleo del backend: la concurrencia básica y la interacción con Bases de Datos (JDBC). Esto te dará una ventaja inicial clara.

- [ ] **41. Ordenando Datos: `Comparable` y `Comparator`**
      * **Objetivo Específico:** Aprender a ordenar colecciones de objetos basados en criterios específicos, ya sea implementando un orden "natural" (`Comparable`) o definiendo órdenes alternativos (`Comparator`).
      * **Por qué es importante:** Mostrar datos ordenados es un requisito muy común (listas de usuarios por nombre, productos por precio, etc.). Necesitas saber cómo definir estos criterios de ordenación.
      * **Instrucciones:** Ordena un `ArrayList` de `String`s. Luego, haz que tu clase `Estudiante` (Nº 23) implemente `Comparable<Estudiante>` para ordenarse por ID por defecto. Después, crea un `Comparator<Estudiante>` externo para ordenarlos por nombre. Usa `Collections.sort()` o `list.sort()`.
      * **Conceptos Reforzados:** `java.lang.Comparable`, `java.util.Comparator`, `Collections.sort()`, `List.sort()`.

- [ ] **42. Código Conciso: Expresiones Lambda Básicas**
      * **Objetivo Específico:** Introducir la sintaxis de las expresiones lambda para escribir implementaciones de interfaces funcionales (como `Comparator` o listeners) de forma más breve y directa.
      * **Por qué es importante:** Las lambdas hacen el código más conciso y legible para ciertos patrones, especialmente con la API de Streams y en la programación funcional. Son muy usadas en Java moderno.
      * **Instrucciones:** Re-escribe el `Comparator` de Estudiantes por nombre (del Nº 41) usando una expresión lambda. Usa el método `forEach` de una lista con una lambda para imprimir cada elemento.
      * **Conceptos Reforzados:** Sintaxis lambda (`(parametros) -> { cuerpo }` o `(parametros) -> expresion`), interfaces funcionales.

- [ ] **43. Procesamiento Eficiente de Colecciones: Streams API (Introducción)**
      * **Objetivo Específico:** Utilizar la API de Streams para realizar operaciones de filtrado, mapeo y recolección sobre colecciones de datos de una manera declarativa y potencialmente paralela.
      * **Por qué es importante:** Streams ofrece una forma potente y expresiva de procesar datos. Es una herramienta clave en Java moderno para trabajar con colecciones de forma eficiente y legible. Fundamental para procesamiento de datos en backend.
      * **Instrucciones:** Dada una `List<Integer>`, usa streams para: 1) Filtrar y obtener solo los números pares. 2) Mapear cada número a su cuadrado. 3) Combinar ambas: obtener los cuadrados solo de los números pares. Recolecta los resultados en una nueva lista usando `collect(Collectors.toList())`.
      * **Conceptos Reforzados:** `stream()`, operaciones intermedias (`filter()`, `map()`), operaciones terminales (`forEach()`, `collect()`), `java.util.stream.Collectors`.

- [ ] **44. Tareas Concurrentes: Hilos (`Thread` y `Runnable`)**
      * **Objetivo Específico:** Crear y ejecutar múltiples hilos de ejecución para realizar tareas concurrentemente, entendiendo las dos formas básicas de definir la tarea de un hilo (`extends Thread` o `implements Runnable`).
      * **Por qué es importante:** Las aplicaciones backend a menudo necesitan manejar múltiples solicitudes de clientes simultáneamente o realizar tareas en segundo plano. Entender los hilos es el primer paso hacia la concurrencia.
      * **Instrucciones:** Crea una clase `TareaSimple` que implemente `Runnable` y cuyo método `run()` imprima números del 1 al 5 con una pausa (`Thread.sleep(500)`). En `main`, crea dos `Thread`s, cada uno con una instancia de `TareaSimple`, e inícialos (`start()`). Observa cómo se entrelaza la salida.
      * **Conceptos Reforzados:** `java.lang.Thread`, `java.lang.Runnable`, `run()`, `start()`, `Thread.sleep()`, concurrencia básica.

- [ ] **45. Evitando el Caos: Sincronización Básica (`synchronized`)**
      * **Objetivo Específico:** Comprender el problema de las "condiciones de carrera" (race conditions) cuando múltiples hilos acceden y modifican datos compartidos, y usar la palabra clave `synchronized` para proteger secciones críticas de código.
      * **Por qué es importante:** Sin sincronización, los datos compartidos pueden corromperse en entornos concurrentes. `synchronized` es el mecanismo más básico (aunque no siempre el más eficiente) para garantizar el acceso exclusivo a recursos compartidos. ¡Vital en backend!
      * **Instrucciones:** Crea dos hilos que llamen repetidamente al método `retirar()` de la *misma* instancia de `CuentaBancaria` (Nº 22). Observa si el saldo final es incorrecto (probablemente lo será sin sincronización). Luego, añade `synchronized` al método `retirar` (o crea un bloque `synchronized(this)`) y vuelve a ejecutar. El resultado debería ser consistente ahora.
      * **Conceptos Reforzados:** Condiciones de carrera, datos compartidos, `synchronized` (método y bloque), exclusión mutua (mutex).

- [ ] **46. Conectando con Datos: JDBC - Establecer Conexión**
      * **Objetivo Específico:** Aprender los pasos básicos para establecer una conexión desde una aplicación Java a una base de datos relacional usando JDBC (Java Database Connectivity).
      * **Por qué es importante:** ¡El núcleo del backend! La mayoría de las aplicaciones backend interactúan con una base de datos para almacenar y recuperar información. JDBC es la API estándar de Java para esto.
      * **Instrucciones:** Descarga un driver JDBC (ej: para H2, SQLite o PostgreSQL si lo tienes instalado). Escribe código que cargue el driver (a veces implícito) y use `DriverManager.getConnection("jdbc:url", "usuario", "contraseña")` para conectarte. Maneja `SQLException`. Usa `try-with-resources` para la conexión.
      * **Conceptos Reforzados:** JDBC Driver, URL de conexión JDBC, `DriverManager.getConnection()`, `java.sql.Connection`, `java.sql.SQLException`, `try-with-resources`.

- [ ] **47. Guardando Datos: JDBC - `INSERT` con `PreparedStatement`**
      * **Objetivo Específico:** Utilizar `PreparedStatement` para ejecutar sentencias SQL `INSERT` de forma segura (evitando inyección SQL) y eficiente.
      * **Por qué es importante:** `PreparedStatement` es la forma recomendada para ejecutar SQL en JDBC. Precompila la sentencia y maneja correctamente los parámetros, lo que es crucial para la seguridad y el rendimiento.
      * **Instrucciones:** Crea una tabla simple (ej: `usuarios` con `id INT PRIMARY KEY AUTO_INCREMENT`, `nombre VARCHAR(50)`). Escribe código JDBC que use `connection.prepareStatement("INSERT INTO usuarios (nombre) VALUES (?)")`, asigne un valor al parámetro (`setString(1, "Juan")`) y ejecute la inserción (`executeUpdate()`).
      * **Conceptos Reforzados:** `Connection.prepareStatement()`, `java.sql.PreparedStatement`, `setString()`, `setInt()`, etc., `executeUpdate()`, placeholders (`?`), prevención de inyección SQL.

- [ ] **48. Recuperando Datos: JDBC - `SELECT` y `ResultSet`**
      * **Objetivo Específico:** Ejecutar consultas SQL `SELECT` usando `PreparedStatement` y procesar los resultados devueltos en un objeto `ResultSet`.
      * **Por qué es importante:** Es la operación complementaria al `INSERT`. Necesitas saber cómo traer los datos de la BD a tu aplicación Java para mostrarlos o procesarlos.
      * **Instrucciones:** Escribe código JDBC que ejecute `SELECT id, nombre FROM usuarios`. Obtén el `ResultSet` usando `executeQuery()`. Itera sobre él con `while (resultSet.next())`. Dentro del bucle, obtén los valores de cada columna usando `resultSet.getInt("id")` y `resultSet.getString("nombre")`. Imprime los datos. Cierra el `ResultSet` y `PreparedStatement` (o usa `try-with-resources`).
      * **Conceptos Reforzados:** `executeQuery()`, `java.sql.ResultSet`, `resultSet.next()`, `resultSet.getXXX()`, cierre de recursos.

- [ ] **49. Modificando Datos: JDBC - `UPDATE` y `DELETE`**
      * **Objetivo Específico:** Ejecutar sentencias SQL `UPDATE` y `DELETE` usando `PreparedStatement` para modificar o eliminar registros existentes en la base de datos.
      * **Por qué es importante:** Completa las operaciones básicas de gestión de datos (CRUD: Create, Read, Update, Delete).
      * **Instrucciones:** 1) Escribe código para actualizar el nombre de un usuario específico por su ID (`UPDATE usuarios SET nombre = ? WHERE id = ?`). 2) Escribe código para eliminar un usuario por su ID (`DELETE FROM usuarios WHERE id = ?`). Usa `executeUpdate()` para ambas.
      * **Conceptos Reforzados:** `UPDATE` y `DELETE` SQL con `PreparedStatement`.

- [ ] **50. Proyecto Integrador: CRUD Básico de Consola**
      * **Objetivo Específico:** Integrar los conocimientos de POO, Colecciones, Manejo de Errores y JDBC en una pequeña aplicación funcional que realice las operaciones CRUD (Crear, Leer, Actualizar, Eliminar) para una entidad simple (ej: Producto, Tarea) a través de la consola, persistiendo los datos en una base de datos.
      * **Por qué es importante:** Consolida gran parte de lo aprendido en un proyecto cohesivo. Te da una visión de cómo interactúan las diferentes partes de una aplicación simple y te prepara para aplicaciones más complejas.
      * **Instrucciones:** Diseña una clase (ej: `Producto` con id, nombre, precio). Crea una clase `ProductoDAO` (Data Access Object) con métodos como `crearProducto(Producto p)`, `obtenerProductoPorId(int id)`, `obtenerTodosLosProductos()`, `actualizarProducto(Producto p)`, `eliminarProducto(int id)`. Estos métodos usarán JDBC (Nº 46-49). Crea una clase principal con un menú de consola (como en Nº 10) que llame a los métodos del DAO para interactuar con el usuario y la base de datos.
      * **Conceptos Reforzados:** Integración (POO, JDBC, Consola), patrón DAO (básico), diseño de aplicación simple, CRUD completo.

---

**¡Felicidades por llegar hasta aquí!** Si has completado y *entendido* estos 50 ejercicios, has construido una base increíblemente sólida en Java. Ahora estás mucho mejor preparado/a para los siguientes pasos en tu camino hacia el desarrollo backend profesional que mencionamos anteriormente (Spring Boot, APIs REST, etc.). ¡Sigue aprendiendo y construyendo!