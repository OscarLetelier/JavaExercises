# 🚀 50 Ejercicios de Java: Tu Camino a Desarrollador Backend Jr.

¡Bienvenido/a! Esta es una guía de 50 ejercicios prácticos de Java diseñados para llevarte desde los conceptos más básicos hasta temas intermedios esenciales. El objetivo es construir una base sólida en Java, mejorar tu lógica de programación y prepararte para enfrentar los desafíos del desarrollo backend y conseguir tu primer empleo como desarrollador/a Junior.

**Filosofía:**

* 🧠 **Comprende, no copies:** Entiende el *por qué* de cada línea.
* 🧪 **Experimenta:** Modifica el código y observa qué sucede.
* 🐛 **Depura:** Aprender a encontrar errores es crucial. ¡Usa el debugger!
* 📚 **Consulta:** La documentación oficial y las comunidades son tus aliadas.
* 🧩 **Divide y Vencerás:** Descompón problemas grandes en partes pequeñas.

**¡Empecemos! Marca cada ejercicio completado:**

---

## Fase 1: Fundamentos Esenciales (Ejercicios 1-10)

> **🎯 Objetivo:** Familiarizarse con la sintaxis básica, variables, tipos de datos, operadores y entrada/salida simple.

- [ ] **1. Hola Mundo:**
      Escribe, compila y ejecuta un programa que imprima `"¡Hola, Mundo!"` en la consola.
      *Conceptos:* Estructura básica (`public static void main`), `System.out.println()`.
- [ ] **2. Variables y Tipos de Datos:**
      Declara variables de diferentes tipos primitivos (`int`, `double`, `boolean`, `char`, `String`) e imprime sus valores.
      *Conceptos:* Declaración, inicialización, tipos primitivos, `String`.
- [ ] **3. Operadores Aritméticos:**
      Pide al usuario dos números, realiza las operaciones básicas (suma, resta, multiplicación, división, módulo) e imprime los resultados.
      *Conceptos:* `Scanner`, operadores aritméticos (`+`, `-`, `*`, `/`, `%`).
- [ ] **4. Operadores de Comparación y Lógicos:**
      Pide dos números y muestra si el primero es mayor, menor o igual al segundo. Pide una edad y muestra si es mayor de edad (`>= 18`).
      *Conceptos:* Operadores (`>`, `<`, `==`, `>=`, `<=`, `!=`, `&&`, `||`, `!`), `if-else if-else`.
- [ ] **5. Área de un Círculo:**
      Pide el radio y calcula el área ($\text{Área} = \pi \times \text{radio}^2$). Usa `Math.PI` y `Math.pow()`.
      *Conceptos:* Clase `Math`, constantes, métodos estáticos.
- [ ] **6. Conversor de Temperatura:**
      Convierte grados Celsius a Fahrenheit ($F = (C \times 9/5) + 32$).
      *Conceptos:* Fórmulas matemáticas, orden de operaciones.
- [ ] **7. Número Par o Impar:**
      Pide un número entero y determina si es par o impar.
      *Conceptos:* Operador módulo (`%`), `if-else`.
- [ ] **8. Bucle `for` - Números del 1 al 10:**
      Imprime los números del 1 al 10 usando un bucle `for`.
      *Conceptos:* Bucle `for`.
- [ ] **9. Bucle `while` - Suma hasta N:**
      Pide un número N y calcula la suma de 1 hasta N usando `while`.
      *Conceptos:* Bucle `while`, acumuladores.
- [ ] **10. Bucle `do-while` - Menú Simple:**
      Crea un menú (1. Saludar, 2. Despedir, 0. Salir) que se repita hasta elegir 0. Usa `do-while` y `switch`.
      *Conceptos:* Bucle `do-while`, `switch`.

---

## Fase 2: Estructuras de Control y Arrays (Ejercicios 11-20)

> **🎯 Objetivo:** Profundizar en bucles, condicionales y manejo de colecciones de datos simples como los arrays.

- [ ] **11. Factorial de un Número:**
      Calcula el factorial de un número N (N!).
      *Conceptos:* Bucles, multiplicación acumulativa.
- [ ] **12. Número Primo:**
      Determina si un número ingresado es primo.
      *Conceptos:* Bucles, módulo, lógica booleana (flags).
- [ ] **13. Secuencia de Fibonacci:**
      Genera los primeros N números de la secuencia de Fibonacci.
      *Conceptos:* Bucles, manejo de variables de estado.
- [ ] **14. Array: Leer y Mostrar:**
      Crea un array de 5 enteros, pide los números al usuario y muéstralos.
      *Conceptos:* Declaración, inicialización, recorrido de arrays.
- [ ] **15. Array: Suma y Promedio:**
      Calcula la suma y el promedio de los elementos de un array de `double`.
      *Conceptos:* Recorrido de arrays, acumulación.
- [ ] **16. Array: Encontrar el Máximo y Mínimo:**
      Encuentra el valor máximo y mínimo en un array de enteros.
      *Conceptos:* Recorrido, comparación.
- [ ] **17. Array: Buscar un Elemento:**
      Busca si un número existe en un array predefinido e indica su índice.
      *Conceptos:* Búsqueda lineal.
- [ ] **18. Array Bidimensional (Matriz): Sumar Matrices:**
      Crea dos matrices 3x3 y calcula su suma.
      *Conceptos:* Arrays bidimensionales, bucles anidados.
- [ ] **19. Palíndromo:**
      Verifica si una palabra ingresada es un palíndromo.
      *Conceptos:* Manipulación de `String`, `charAt()`, bucles.
- [ ] **20. Contar Vocales:**
      Cuenta las vocales (mayúsculas y minúsculas) en una frase.
      *Conceptos:* Manipulación de `String`, `charAt()`, bucles, condicionales.

---

## Fase 3: Programación Orientada a Objetos (POO) (Ejercicios 21-30)

> **🎯 Objetivo:** Entender los pilares de la POO: clases, objetos, encapsulamiento, herencia y polimorfismo.

- [ ] **21. Clase `Coche`:**
      Crea una clase `Coche` (marca, modelo, año, velActual) con métodos (acelerar, frenar, mostrarInfo). Crea objetos y úsalos.
      *Conceptos:* Clases, atributos, métodos, constructores, `new`, `this`.
- [ ] **22. Encapsulamiento - `CuentaBancaria`:**
      Clase `CuentaBancaria` con atributos privados (saldo, titular). Métodos públicos para depositar, retirar (validando) y consultar.
      *Conceptos:* `private`, `public`, getters/setters, encapsulamiento.
- [ ] **23. Clase `Estudiante` con `toString`:**
      Clase `Estudiante` (nombre, id, calificaciones `ArrayList<Double>`). Sobrescribe `toString()` para mostrar info legible.
      *Conceptos:* `@Override`, `toString()`, `ArrayList` básico.
- [ ] **24. Herencia - `Figura` Geométrica:**
      Clase abstracta `Figura` con método abstracto `calcularArea()`. Clases hijas `Circulo` y `Rectangulo` que la implementen.
      *Conceptos:* Clases/métodos abstractos, `extends`.
- [ ] **25. Polimorfismo:**
      Crea un array de `Figura` con `Circulo`s y `Rectangulo`s. Recorre y llama a `calcularArea()` en cada uno.
      *Conceptos:* Polimorfismo, vinculación dinámica.
- [ ] **26. Interfaces - `Volador`:**
      Interfaz `Volador` con método `volar()`. Clases `Pajaro` y `Avion` que la implementen.
      *Conceptos:* `interface`, `implements`.
- [ ] **27. Composición - `Motor` y `Coche`:**
      Crea una clase `Motor`. Modifica `Coche` para que *tenga un* `Motor` (atributo).
      *Conceptos:* Composición (relación "tiene un").
- [ ] **28. Clases Internas (Opcional):**
      Crea un ejemplo simple usando una clase interna.
      *Conceptos:* Clases dentro de clases.
- [ ] **29. Miembros Estáticos - Contador de Instancias:**
      Añade un contador `static` a una clase (ej: `Coche`) para contar instancias creadas. Método `static` para obtener el contador.
      *Conceptos:* `static` (variables/métodos).
- [ ] **30. Paquetes:**
      Organiza tus clases (ej: `Figura`, `Circulo`) en paquetes (`com.ejercicios.geometria`). Usa `import`.
      *Conceptos:* `package`, `import`.

---

## Fase 4: Colecciones, Excepciones y Archivos (Ejercicios 31-40)

> **🎯 Objetivo:** Manejar colecciones de datos flexibles (Listas, Mapas), gestionar errores y trabajar con archivos.

- [ ] **31. `ArrayList` - Lista de Tareas:**
      Programa para añadir, mostrar y eliminar tareas de un `ArrayList<String>`.
      *Conceptos:* `ArrayList`, `add()`, `get()`, `remove()`, `size()`.
- [ ] **32. `HashMap` - Diccionario Simple:**
      `HashMap<String, String>` como diccionario inglés-español. Añadir y buscar traducciones.
      *Conceptos:* `HashMap`, `put()`, `get()`, `containsKey()`.
- [ ] **33. `HashSet` - Elementos Únicos:**
      Pide números y guárdalos en un `HashSet<Integer>`. Muestra los elementos únicos (sin duplicados).
      *Conceptos:* `HashSet`, unicidad.
- [ ] **34. Iteradores:**
      Recorre un `ArrayList` y un `HashMap` usando `Iterator`. Elimina un elemento del `ArrayList` mientras iteras.
      *Conceptos:* `Iterator`, `hasNext()`, `next()`, `remove()`.
- [ ] **35. Manejo de Excepciones (`try-catch`):**
      Modifica el ejercicio de división (Nº 3) para capturar `ArithmeticException` (división por cero).
      *Conceptos:* `try`, `catch`, `ArithmeticException`.
- [ ] **36. Manejo de Excepciones (`try-catch-finally`):**
      Añade un bloque `finally` al ejercicio anterior que siempre se ejecute.
      *Conceptos:* Bloque `finally`.
- [ ] **37. Validación de Entrada:**
      Modifica un ejercicio que pida número para usar `try-catch` y asegurar entrada numérica (`InputMismatchException`), repitiendo si es inválida.
      *Conceptos:* Captura de `InputMismatchException`, bucles de reintento.
- [ ] **38. Crear y Escribir Archivo:**
      Pide líneas de texto y escríbelas en `"salida.txt"`. Termina con línea vacía.
      *Conceptos:* `FileWriter`, `BufferedWriter`, `IOException`, `try-with-resources`.
- [ ] **39. Leer Archivo:**
      Lee el contenido de `"salida.txt"` y muéstralo en consola.
      *Conceptos:* `FileReader`, `BufferedReader`, `IOException`, `try-with-resources`.
- [ ] **40. Excepciones Personalizadas:**
      Crea `SaldoInsuficienteException`. Lánzala (`throw`) en `retirar` de `CuentaBancaria` (Nº 22) si no hay fondos y captúrala.
      *Conceptos:* Excepciones personalizadas, `throw`, `throws`.

---

## Fase 5: Conceptos Intermedios y Preparación Backend (Ejercicios 41-50)

> **🎯 Objetivo:** Introducir concurrencia básica, manejo de datos avanzado, y conexión a bases de datos (JDBC).

- [ ] **41. Ordenar Colecciones (`Collections.sort`)**:
      Ordena un `ArrayList` de Strings o de objetos `Estudiante` (Nº 23) usando `Comparable` o `Comparator`.
      *Conceptos:* `Collections.sort()`, `Comparable`, `Comparator`.
- [ ] **42. Expresiones Lambda (Básico):**
      Usa lambdas para ordenar la lista de `Estudiante` con `Comparator`. Usa lambdas con `forEach`.
      *Conceptos:* Sintaxis lambda, interfaces funcionales.
- [ ] **43. Streams API (Básico):**
      Usa Streams para filtrar una lista de números (ej: solo pares) y mapear (ej: obtener cuadrados).
      *Conceptos:* `stream()`, `filter()`, `map()`, `collect()`.
- [ ] **44. Hilos (`Thread`) Básico:**
      Crea y ejecuta dos hilos concurrentemente que realicen una tarea simple (ej: imprimir números con retardo). Usa `Runnable` o `Thread`.
      *Conceptos:* Creación/ejecución de hilos, `Runnable`, `Thread.sleep()`.
- [ ] **45. Sincronización Básica (`synchronized`):**
      Crea dos hilos retirando dinero de la *misma* `CuentaBancaria` (Nº 22). Usa `synchronized` en `retirar` para evitar problemas.
      *Conceptos:* Condiciones de carrera, `synchronized`.
- [ ] **46. JDBC - Conexión a Base de Datos:**
      Conéctate a una BD simple (H2, SQLite) usando JDBC. Descarga el driver.
      *Conceptos:* `DriverManager.getConnection()`, `SQLException`, URL JDBC. (**¡Clave Backend!**)
- [ ] **47. JDBC - Insertar Datos:**
      Crea tabla `productos` (id, nombre, precio). Inserta un producto usando `PreparedStatement`.
      *Conceptos:* `Connection.prepareStatement()`, `executeUpdate()`, placeholders (`?`).
- [ ] **48. JDBC - Consultar Datos:**
      Consulta todos los productos y muestra sus datos. Procesa el `ResultSet`.
      *Conceptos:* `executeQuery()`, `ResultSet`, `while(resultSet.next())`, `getXXX()`.
- [ ] **49. JDBC - Actualizar y Eliminar Datos:**
      Actualiza el precio de un producto (por ID) y elimina otro (por ID) usando `PreparedStatement`.
      *Conceptos:* `UPDATE`, `DELETE` SQL con `PreparedStatement`.
- [ ] **50. Mini-Proyecto: CRUD de Consola:**
      Combina POO, Colecciones y JDBC. App de consola para CRUD (Crear, Leer, Actualizar, Eliminar) de una entidad (ej: Producto) en BD.
      *Conceptos:* Integración de conceptos en una aplicación funcional.

---
