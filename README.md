# 🚀 Plan de Estudio: 50 Ejercicios Clave de Java para tu Futuro Backend ☕

![Java](https://img.shields.io/badge/Lenguaje-Java-orange?style=for-the-badge&logo=java) ![Nivel](https://img.shields.io/badge/Nivel-Principiante_a_Intermedio-blue?style=for-the-badge) ![Objetivo](https://img.shields.io/badge/Objetivo-Backend_Jr.-success?style=for-the-badge)

¡Hola! 👋 Soy tu guía en este emocionante viaje para dominar Java, preparándote para el mundo del desarrollo backend. Este plan de 50 ejercicios es tu hoja de ruta progresiva. ¡No te saltes niveles! Cada paso fortalece tu lógica, tu manejo del lenguaje y tu habilidad para resolver problemas. 🧠

---

### ✨ Nuestra Metodología ✨

* 🎯 **Objetivo Claro:** Entiende el *propósito* de cada ejercicio antes de codificar.
* 💡 **Relevancia:** Descubre *por qué* cada concepto es vital para un desarrollador backend.
* 💻 **Práctica Deliberada:** **Escribe**, **prueba**, **depura** y *experimenta*. ¡No solo copies!
* 🤔 **Análisis Crítico:** Pregúntate siempre: *¿Cómo funciona? ¿Qué alternativas hay? ¿Cómo puedo mejorarlo?*

---

### 🚀 ¡Empecemos nuestra formación! Marca tu progreso: 👇

---

## 1️⃣ Fase 1: Los Cimientos de Java (Ejercicios 1-10) 🧱

> **👨‍🏫 Maestro Dice:** ¡Atención! Aquí construimos la base. Es como aprender el abecedario antes de escribir. Dominar esto es *crítico*. Concéntrate en la sintaxis precisa y el flujo elemental.

-   [ ] **1. Tu Primer Programa: El `Hola Mundo`** 👋
    * **🎯 Objetivo Específico:** Comprender la estructura mínima de un programa Java ejecutable y cómo mostrar información en la consola.
    * **💡 Por qué es importante:** Es el rito de iniciación universal. Te familiariza con el ciclo escribir-compilar-ejecutar y la salida básica (`System.out.println`).
    * **📝 Instrucciones:** Crea `HolaMundo.java`, escribe el código para imprimir `"¡Hola, Mundo!"` y ejecútalo.
    * **🔑 Conceptos Reforzados:** `public class`, `public static void main(String[] args)`, `System.out.println()`.

-   [ ] **2. El Almacén de Datos: Variables y Tipos Primitivos** 📦
    * **🎯 Objetivo Específico:** Aprender a declarar variables para diferentes tipos de datos básicos (`int`, `double`, `boolean`, `char`) y `String`.
    * **💡 Por qué es importante:** Las variables guardan información. Necesitas saber qué "caja" usar para cada tipo de dato. Esencial para manejar cualquier información.
    * **📝 Instrucciones:** Declara variables de los tipos mencionados, asígnales valores e imprímelos.
    * **🔑 Conceptos Reforzados:** Tipos primitivos, `String`, declaración, inicialización, asignación.

-   [ ] **3. La Calculadora Básica: Operadores Aritméticos** ➕➖✖️➗
    * **🎯 Objetivo Específico:** Aprender a recibir datos del usuario (`Scanner`) y aplicar operadores aritméticos básicos.
    * **💡 Por qué es importante:** Interactuar con el usuario y realizar cálculos es fundamental para casi cualquier aplicación (desde sumas simples hasta lógica de negocio compleja).
    * **📝 Instrucciones:** Usa `Scanner` para leer dos números (`double`). Calcula y muestra suma, resta, multiplicación, división y módulo.
    * **🔑 Conceptos Reforzados:** `java.util.Scanner`, `nextDouble()`, `nextInt()`, operadores `+`, `-`, `*`, `/`, `%`.

-   [ ] **4. Tomando Decisiones: Operadores de Comparación y Lógicos** 🤔✅❌
    * **🎯 Objetivo Específico:** Implementar lógica condicional (`if-else`) basada en comparaciones y combinar condiciones (`&&`, `||`, `!`).
    * **💡 Por qué es importante:** Los programas *deciden*. "¿Es mayor de edad?", "¿Contraseña válida?". Controlar el flujo es clave.
    * **📝 Instrucciones:** Compara números (`>`, `<`, `==`). Verifica mayoría de edad (`>= 18`). Usa `if-else if-else`. Combina condiciones.
    * **🔑 Conceptos Reforzados:** `if`, `else if`, `else`, operadores relacionales (`>`, `==`, etc.), operadores lógicos (`&&`, `||`, `!`).

-   [ ] **5. Geometría Simple: Uso de la Clase `Math`** 📐🔢
    * **🎯 Objetivo Específico:** Usar métodos y constantes predefinidas de la librería estándar (`Math`).
    * **💡 Por qué es importante:** Java te da herramientas listas. `Math` evita reimplementar funciones matemáticas comunes. ¡Aprovecha la librería estándar!
    * **📝 Instrucciones:** Calcula el área de un círculo ($\pi r^2$). Usa `Math.PI` y `Math.pow()`.
    * **🔑 Conceptos Reforzados:** Clases de utilidad (`Math`), constantes (`Math.PI`), métodos estáticos (`Math.pow`).

-   [ ] **6. Conversiones: Aplicando Fórmulas** 🌡️🔄
    * **🎯 Objetivo Específico:** Traducir una fórmula matemática a código Java, cuidando tipos de datos y orden de operaciones.
    * **💡 Por qué es importante:** A menudo implementarás reglas de negocio o cálculos basados en fórmulas. Practica esa traducción.
    * **📝 Instrucciones:** Convierte Celsius a Fahrenheit ($F = (C \times 9.0/5.0) + 32$). Usa `double` para precisión.
    * **🔑 Conceptos Reforzados:** Orden de operaciones, `double`, conversión de fórmulas.

-   [ ] **7. Clasificación Simple: Par o Impar** ✌️
    * **🎯 Objetivo Específico:** Aplicar el operador módulo (`%`) para clasificación simple con `if-else`.
    * **💡 Por qué es importante:** El módulo es útil para muchas tareas (ciclos, validaciones). Un uso clásico y fácil.
    * **📝 Instrucciones:** Pide un entero. Determina si es par (resto 0 al dividir por 2) o impar.
    * **🔑 Conceptos Reforzados:** Operador módulo (`%`), `if-else`.

-   [ ] **8. Repetición Controlada: El Bucle `for`** 🔁🔢
    * **🎯 Objetivo Específico:** Implementar bucles que se repiten un número *conocido* de veces.
    * **💡 Por qué es importante:** Ideal cuando sabes cuántas veces iterar (ej: procesar N elementos, repetir 10 veces).
    * **📝 Instrucciones:** Imprime los números del 1 al 10.
    * **🔑 Conceptos Reforzados:** Bucle `for` (inicialización, condición, incremento).

-   [ ] **9. Repetición Basada en Condición: El Bucle `while`** 🔁❓
    * **🎯 Objetivo Específico:** Implementar bucles que se repiten *mientras* una condición sea verdadera.
    * **💡 Por qué es importante:** Perfecto cuando no sabes cuántas iteraciones, pero sí cuándo parar (ej: hasta input válido, mientras haya datos).
    * **📝 Instrucciones:** Pide N. Calcula la suma $1 + ... + N$ usando `while`. Necesitas contador y acumulador.
    * **🔑 Conceptos Reforzados:** Bucle `while`, contadores, acumuladores, condición de parada.

-   [ ] **10. El Menú Interactivo: Bucles `do-while` y `switch`** 🕹️
    * **🎯 Objetivo Específico:** Crear menús interactivos (ejecutar al menos una vez) y manejar opciones con `switch`.
    * **💡 Por qué es importante:** `do-while` asegura la primera ejecución. `switch` organiza el manejo de múltiples casos de forma limpia.
    * **📝 Instrucciones:** Menú (1. Op A, 2. Op B, 0. Salir). Lee opción. Usa `switch` para actuar. Repite con `do-while` hasta opción 0.
    * **🔑 Conceptos Reforzados:** Bucle `do-while`, `switch`, `case`, `break`, `default`.

---

## 2️⃣ Fase 2: Estructurando Datos y Lógica (Ejercicios 11-20) 🏗️

> **👨‍🏫 Maestro Dice:** ¡Bien! Ya controlas el flujo. Ahora, a manejar conjuntos de datos con `arrays` y a crear algoritmos más interesantes. ¡Esto se acerca a resolver problemas del mundo real!

-   [ ] **11. Cálculos Recursivos (Iterativo): Factorial** fact(N)
    * **🎯 Objetivo Específico:** Implementar un algoritmo matemático común que requiere acumulación (multiplicación repetida) usando un bucle.
    * **💡 Por qué es importante:** Entender cómo implementar algoritmos matemáticos es útil. El factorial, aunque simple, es un buen ejemplo de acumulación en bucles.
    * **📝 Instrucciones:** Calcula $N! = N \times (N-1) \times ... \times 1$. Pide N al usuario. Usa un bucle `for` o `while`. Considera el caso base (0! = 1).
    * **🔑 Conceptos Reforzados:** Bucles, acumulación (producto), casos base (lógica).

-   [ ] **12. Búsqueda y Validación: Número Primo** 🧐
    * **🎯 Objetivo Específico:** Implementar un algoritmo de búsqueda/validación que requiere verificar una condición para un rango de valores usando bucles y lógica booleana.
    * **💡 Por qué es importante:** La validación de datos y la búsqueda de propiedades específicas son tareas comunes. Este ejercicio requiere pensar en eficiencia (puedes optimizar la búsqueda de divisores).
    * **📝 Instrucciones:** Pide un número. Determina si es primo (solo divisible por 1 y por sí mismo). Usa un bucle para probar divisores y una variable `boolean` (flag).
    * **🔑 Conceptos Reforzados:** Bucles, operador módulo, variables `boolean` (flags), optimización básica.

-   [ ] **13. Secuencias y Estado: Fibonacci** 🔢➡️🔢
    * **🎯 Objetivo Específico:** Generar una secuencia donde cada término depende de los anteriores, requiriendo el manejo cuidadoso de variables para guardar estados previos.
    * **💡 Por qué es importante:** Muchas veces, el estado actual depende de resultados anteriores. Fibonacci es el ejemplo clásico para practicar esto.
    * **📝 Instrucciones:** Genera los primeros N números de Fibonacci (0, 1, 1, 2, 3, 5...). Necesitas variables para guardar los dos números anteriores.
    * **🔑 Conceptos Reforzados:** Bucles, gestión de estado entre iteraciones.

-   [ ] **14. Colecciones Fijas: Introducción a los Arrays** ⛓️
    * **🎯 Objetivo Específico:** Aprender a declarar, inicializar y recorrer arrays unidimensionales de tamaño fijo.
    * **💡 Por qué es importante:** Los arrays son la estructura básica para agrupar elementos. Fundamentales, aunque luego usarás Colecciones más flexibles.
    * **📝 Instrucciones:** Crea `int[5]`. Pide 5 enteros y guárdalos. Luego, muéstralos.
    * **🔑 Conceptos Reforzados:** Declaración (`tipo[]`), inicialización (`new tipo[tamaño]`), acceso (`array[indice]`), recorrido `for`, `length`.

-   [ ] **15. Operaciones sobre Colecciones: Suma y Promedio en Array** 📊
    * **🎯 Objetivo Específico:** Realizar cálculos agregados (suma, promedio) sobre los elementos de un array.
    * **💡 Por qué es importante:** Muy común necesitar procesar colecciones para obtener estadísticas o resultados consolidados.
    * **📝 Instrucciones:** Dado un `double[]`, calcula la suma total y el promedio.
    * **🔑 Conceptos Reforzados:** Recorrido de arrays, acumulación, cálculo de promedio.

-   [ ] **16. Búsqueda en Colecciones: Máximo y Mínimo en Array** 🔼🔽
    * **🎯 Objetivo Específico:** Implementar un algoritmo simple para encontrar los valores extremos (máximo y mínimo) dentro de un array.
    * **💡 Por qué es importante:** Otro procesamiento típico de colecciones. Practica la lógica de comparación y actualización.
    * **📝 Instrucciones:** Encuentra el número más grande y el más pequeño en un `int[]`. Guarda el máx/mín encontrado *hasta ahora*.
    * **🔑 Conceptos Reforzados:** Recorrido, comparación, actualización condicional.

-   [ ] **17. Búsqueda Específica: Encontrar Elemento en Array (Lineal)** 🔍
    * **🎯 Objetivo Específico:** Implementar la búsqueda lineal para encontrar la primera ocurrencia de un valor en un array.
    * **💡 Por qué es importante:** La búsqueda es fundamental. La lineal es la más simple (uno por uno), esencial entenderla.
    * **📝 Instrucciones:** Pide un número. Búscalo en un array predefinido. Indica el índice si lo encuentras, o informa si no está. Detente al encontrarlo (`break`).
    * **🔑 Conceptos Reforzados:** Búsqueda lineal, recorrido, `break`.

-   [ ] **18. Datos Tabulares: Arrays Bidimensionales (Matrices)** 🔢<0xC2><0xAD>🔢
    * **🎯 Objetivo Específico:** Trabajar con arrays de dos dimensiones (matrices) para representar datos tabulares y operar con ellos.
    * **💡 Por qué es importante:** Útiles para rejillas, tableros, etc. Abren la puerta a problemas más complejos.
    * **📝 Instrucciones:** Crea dos matrices `int[3][3]`. Llénalas. Calcula la matriz suma ($C_{ij} = A_{ij} + B_{ij}$). Muestra el resultado.
    * **🔑 Conceptos Reforzados:** Arrays bidimensionales, bucles anidados, acceso `matriz[fila][columna]`.

-   [ ] **19. Manipulación de Texto: Palíndromos** A🔄A
    * **🎯 Objetivo Específico:** Manipular `String`s para verificar si son palíndromos comparando caracteres desde los extremos.
    * **💡 Por qué es importante:** El procesamiento de texto es omnipresente. Practica acceso a caracteres y lógica simétrica.
    * **📝 Instrucciones:** Pide una palabra. Verifica si es palíndromo. Compara `charAt(0)` con `charAt(n-1)`, etc. Opcional: ignora mayúsculas/minúsculas (`toLowerCase()`).
    * **🔑 Conceptos Reforzados:** `String`, `length()`, `charAt()`, bucles, comparación.

-   [ ] **20. Análisis de Texto: Contar Vocales** 🗣️ AEIOU
    * **🎯 Objetivo Específico:** Recorrer un `String` y contar ocurrencias de ciertos caracteres (vocales) usando condicionales.
    * **💡 Por qué es importante:** Otro ejemplo de análisis de texto. Practica clasificación de caracteres y contadores.
    * **📝 Instrucciones:** Pide una frase. Cuenta las vocales (a, e, i, o, u, mayúsculas y minúsculas). Usa `switch` o `if` con `||`.
    * **🔑 Conceptos Reforzados:** `String`, `charAt()`, bucles, `switch` o `if-else if`, contadores.

---

## 3️⃣ Fase 3: El Paradigma Orientado a Objetos (POO) (Ejercicios 21-30) 🏛️

> **👨‍🏫 Maestro Dice:** ¡El corazón de Java! Modelaremos el mundo como "objetos" con características (atributos) y comportamientos (métodos). *Esencial* para software complejo y mantenible (¡hola, backend!).

-   [ ] **21. Nuestro Primer Objeto: La Clase `Coche`** 🚗
    * **🎯 Objetivo Específico:** Definir una clase simple con atributos y métodos, y crear instancias (objetos). Diferenciar clase (plano) y objeto (instancia).
    * **💡 Por qué es importante:** Introducción a POO. Encapsular datos y comportamiento en una unidad lógica (clase) es clave para organizar el código.
    * **📝 Instrucciones:** Crea `class Coche` (marca, modelo, velActual). Métodos `acelerar()`, `frenar()`, `obtenerVelocidad()`, `mostrarInfo()`. Crea dos objetos `Coche` y usa sus métodos.
    * **🔑 Conceptos Reforzados:** `class`, atributos, métodos, constructor, `new`, `this`.

-   [ ] **22. Protegiendo Datos: Encapsulamiento con `CuentaBancaria`** 🏦🔒
    * **🎯 Objetivo Específico:** Aplicar encapsulamiento (`private`) para proteger datos internos y exponerlos controladamente (`public` getters/setters).
    * **💡 Por qué es importante:** Previene modificaciones inválidas del estado interno. Clave para robustez y mantenibilidad. Controlas el acceso.
    * **📝 Instrucciones:** Crea `class CuentaBancaria` (`private double saldo`, `private String titular`). Métodos `public depositar()`, `public retirar()` (validando fondos), `public getSaldo()`, `public getTitular()`. No permitas `setSaldo()` directo.
    * **🔑 Conceptos Reforzados:** `private`, `public`, getters, setters (controlados), encapsulamiento.

-   [ ] **23. Representación Textual: `toString()` en `Estudiante`** 🧑‍🎓💬
    * **🎯 Objetivo Específico:** Sobrescribir `toString()` para dar una representación textual útil de un objeto.
    * **💡 Por qué es importante:** Por defecto, imprimir un objeto no es útil. `toString()` es vital para depuración y logging.
    * **📝 Instrucciones:** Crea `class Estudiante` (nombre, id, `ArrayList<Double> calificaciones`). Sobrescribe `@Override public String toString()` para devolver algo legible.
    * **🔑 Conceptos Reforzados:** `@Override`, `toString()`, `ArrayList` básico.

-   [ ] **24. Jerarquías de Clases: Herencia con `Figura`** 🌳
    * **🎯 Objetivo Específico:** Implementar herencia (superclase base, subclases derivadas) e introducir clases/métodos abstractos.
    * **💡 Por qué es importante:** Reutilizar código y crear jerarquías ("Círculo *es una* Figura"). Clases abstractas definen plantillas que las subclases *deben* completar.
    * **📝 Instrucciones:** Crea `abstract class Figura` con `abstract double calcularArea();`. Crea `class Circulo extends Figura` y `class Rectangulo extends Figura`. Implementa `calcularArea()` en cada una con su fórmula.
    * **🔑 Conceptos Reforzados:** `extends`, `abstract class`, `abstract` método, implementación.

-   [ ] **25. Un Método, Múltiples Formas: Polimorfismo** 🎭
    * **🎯 Objetivo Específico:** Demostrar polimorfismo tratando objetos de subclases uniformemente vía la superclase.
    * **💡 Por qué es importante:** Permite código flexible y extensible. Puedes trabajar con `Figura`s sin saber el tipo exacto en tiempo de compilación. ¡Muy potente!
    * **📝 Instrucciones:** Crea `Figura[] figuras`. Guarda un `Circulo` y un `Rectangulo`. Recorre el array y llama a `f.calcularArea()`. Observa cómo se ejecuta el método correcto.
    * **🔑 Conceptos Reforzados:** Polimorfismo, binding dinámico, referencia de tipo base.

-   [ ] **26. Contratos de Comportamiento: Interfaces con `Volador`** 📜✈️🐦
    * **🎯 Objetivo Específico:** Definir un "contrato" (`interface`) y hacer que clases (no necesariamente relacionadas) lo cumplan (`implements`).
    * **💡 Por qué es importante:** Definen *qué* métodos debe tener una clase, no *cómo*. Permiten abstraer funcionalidad y desacoplar. Fundamentales (`List`, `Map` son interfaces).
    * **📝 Instrucciones:** Crea `interface Volador { void volar(); }`. Crea `class Pajaro implements Volador` y `class Avion implements Volador`. Implementa `volar()` en cada una.
    * **🔑 Conceptos Reforzados:** `interface`, `implements`, abstracción de comportamiento.

-   [ ] **27. Construyendo con Partes: Composición (`Motor` y `Coche`)** 🧩
    * **🎯 Objetivo Específico:** Modelar relación "tiene un" (has-a), donde una clase contiene una instancia de otra. Diferenciar de herencia ("es un", is-a).
    * **💡 Por qué es importante:** A menudo más flexible que herencia para reutilizar y construir objetos complejos. *Preferir composición sobre herencia*.
    * **📝 Instrucciones:** Crea `class Motor`. Modifica `Coche` para que tenga `private Motor motor;`. Inicializa el motor en el constructor del coche.
    * **🔑 Conceptos Reforzados:** Composición, relación "tiene un", delegación.

-   [ ] **28. Clases Dentro de Clases: Clases Internas (Opcional Avanzado)** nesting dolls
    * **🎯 Objetivo Específico:** Entender el concepto de definir una clase dentro de otra.
    * **💡 Por qué es importante:** Útil en escenarios específicos (eventos GUI, iteradores privados). No crucial al inicio, pero bueno conocerlo.
    * **📝 Instrucciones:** Investiga y crea un ejemplo simple de clase interna.
    * **🔑 Conceptos Reforzados:** Clases internas (Inner classes).

-   [ ] **29. Compartido por Todos: Miembros Estáticos** 🌐
    * **🎯 Objetivo Específico:** Usar variables y métodos `static` que pertenecen a la clase, no a instancias individuales.
    * **💡 Por qué es importante:** Útil para constantes (`Math.PI`), métodos de utilidad (`Math.pow`), o contadores globales (nº instancias).
    * **📝 Instrucciones:** Añade `private static int contadorInstancias = 0;` a una clase. Incrementa en constructor. Añade `public static int getContador()`. Crea instancias y verifica.
    * **🔑 Conceptos Reforzados:** `static`, variable/método de clase vs. de instancia.

-   [ ] **30. Organizando el Proyecto: Paquetes** 🗂️
    * **🎯 Objetivo Específico:** Aprender a organizar clases en paquetes para evitar conflictos de nombres y estructurar proyectos grandes.
    * **💡 Por qué es importante:** *Esencial* para mantener orden, gestionar dependencias y visibilidad en proyectos reales.
    * **📝 Instrucciones:** Mueve clases `Figura`, `Circulo`, `Rectangulo` al paquete `com.tusolucion.geometria`. En `main`, usa `import` para poder usarlas.
    * **🔑 Conceptos Reforzados:** `package`, `import`, estructura de directorios (`src/`).

---

## 4️⃣ Fase 4: Herramientas Avanzadas del Lenguaje (Ejercicios 31-40) ⚙️

> **👨‍🏫 Maestro Dice:** ¡Progresando! Dominaremos herramientas poderosas: Colecciones dinámicas (`List`, `Map`, `Set`), manejo profesional de errores (Excepciones) e interacción con archivos. El pan de cada día del desarrollador.

-   [ ] **31. Listas Dinámicas: `ArrayList`** 📝➕➖
    * **🎯 Objetivo Específico:** Usar `ArrayList` (`List`) para manejar colecciones de tamaño dinámico.
    * **💡 Por qué es importante:** Arrays tienen tamaño fijo. `ArrayList` permite añadir/quitar elementos fácilmente. *Extremadamente* comunes.
    * **📝 Instrucciones:** Crea `ArrayList<String>` para tareas. Implementa añadir, mostrar y eliminar tareas.
    * **🔑 Conceptos Reforzados:** `java.util.ArrayList`, generics (`<String>`), `add()`, `get()`, `remove()`, `size()`, interfaz `List`.

-   [ ] **32. Pares Clave-Valor: `HashMap`** 🔑➡️💾
    * **🎯 Objetivo Específico:** Usar `HashMap` (`Map`) para almacenar pares clave-valor con búsqueda rápida por clave.
    * **💡 Por qué es importante:** Perfectos para buscar info asociada a una "llave" única (ID de usuario, nombre de config). Otra estructura fundamental.
    * **📝 Instrucciones:** Crea `HashMap<String, String>` (diccionario). Implementa añadir palabra/traducción, buscar traducción por palabra, verificar si existe.
    * **🔑 Conceptos Reforzados:** `java.util.HashMap`, generics, `put()`, `get()`, `containsKey()`, interfaz `Map`.

-   [ ] **33. Colecciones Sin Duplicados: `HashSet`** ✨🚫👯
    * **🎯 Objetivo Específico:** Usar `HashSet` (`Set`) para almacenar elementos únicos, descartando duplicados.
    * **💡 Por qué es importante:** Ideal cuando solo importa la presencia/ausencia de un elemento y no quieres repetidos (IDs únicos, tags).
    * **📝 Instrucciones:** Pide números (permite duplicados). Guárdalos en `HashSet<Integer>`. Imprime el Set (verás que no hay duplicados).
    * **🔑 Conceptos Reforzados:** `java.util.HashSet`, generics, `add()` (devuelve boolean), unicidad, interfaz `Set`.

-   [ ] **34. Recorriendo Colecciones: Iteradores (`Iterator`)** 🚶‍♂️➡️
    * **🎯 Objetivo Específico:** Aprender a recorrer colecciones con `Iterator`, permitiendo eliminación segura durante la iteración.
    * **💡 Por qué es importante:** `for-each` es simple para leer. `Iterator` da más control, especialmente para modificar (eliminar) mientras recorres.
    * **📝 Instrucciones:** Recorre `ArrayList` (Nº 31) con `Iterator`. Elimina tareas "Urgente" usando `iterator.remove()`. Recorre claves/valores de `HashMap` (Nº 32) con iterador.
    * **🔑 Conceptos Reforzados:** `iterator()`, `Iterator<T>`, `hasNext()`, `next()`, `remove()`.

-   [ ] **35. Manejo de Errores Predecibles: `try-catch`** 🛡️💥
    * **🎯 Objetivo Específico:** Implementar `try-catch` para capturar errores específicos (`ArithmeticException`) y evitar que el programa "crashee".
    * **💡 Por qué es importante:** Los errores ocurren. Un buen programa debe anticiparlos y manejarlos. `try-catch` es fundamental.
    * **📝 Instrucciones:** Modifica calculadora (Nº 3): pon división en `try`. Añade `catch (ArithmeticException e)` para división por cero.
    * **🔑 Conceptos Reforzados:** `try`, `catch`, `ArithmeticException`, flujo con excepciones.

-   [ ] **36. Asegurando la Limpieza: `finally`** 🧹🧼
    * **🎯 Objetivo Específico:** Usar `finally` para garantizar que código de limpieza (cerrar recursos) se ejecute siempre.
    * **💡 Por qué es importante:** Crucial para liberar recursos (archivos, conexiones) de forma segura, incluso con errores.
    * **📝 Instrucciones:** Añade bloque `finally` al Nº 35 que siempre imprima "Fin de operación.".
    * **🔑 Conceptos Reforzados:** Bloque `finally`, garantía de ejecución.

-   [ ] **37. Robustez en la Entrada: Validando con `try-catch`** 🙏🔢
    * **🎯 Objetivo Específico:** Usar `try-catch` para manejar errores de entrada (`InputMismatchException`) y permitir reintentos.
    * **💡 Por qué es importante:** Entradas de usuario son fuente común de errores. Validarlas robustamente es esencial.
    * **📝 Instrucciones:** Modifica ejercicio que pide número (ej: Nº 9). Pon `scanner.nextInt()` en `try-catch (InputMismatchException e)`. Si hay error, informa, consume entrada errónea (`scanner.next()`) y vuelve a pedir con bucle.
    * **🔑 Conceptos Reforzados:** `InputMismatchException`, `Scanner`, bucles de reintento, limpieza de buffer.

-   [ ] **38. Persistencia Básica: Escribir en Archivos** 💾✍️
    * **🎯 Objetivo Específico:** Aprender a escribir datos (texto) desde Java a un archivo.
    * **💡 Por qué es importante:** Forma básica de persistencia (guardar configs, logs, resultados).
    * **📝 Instrucciones:** Pide líneas de texto. Escríbelas en `mi_archivo.txt`. Usa `FileWriter`, `BufferedWriter`. Usa `try-with-resources`. Termina con línea vacía.
    * **🔑 Conceptos Reforzados:** `java.io.FileWriter`, `BufferedWriter`, `IOException`, `try-with-resources`.

-   [ ] **39. Persistencia Básica: Leer de Archivos** 📖💾
    * **🎯 Objetivo Específico:** Aprender a leer datos (texto) desde un archivo.
    * **💡 Por qué es importante:** Complemento de escritura. Cargar configs, procesar logs, leer datos guardados.
    * **📝 Instrucciones:** Lee `mi_archivo.txt` (del Nº 38). Muestra cada línea. Usa `FileReader`, `BufferedReader`. Usa `try-with-resources`.
    * **🔑 Conceptos Reforzados:** `java.io.FileReader`, `BufferedReader`, `readLine()`, `IOException`, `try-with-resources`.

-   [ ] **40. Errores Personalizados: Crear y Lanzar Excepciones** ❗🔥
    * **🎯 Objetivo Específico:** Definir tus propias clases de excepción (`extends Exception`) y lanzarlas (`throw`) para errores específicos de tu app.
    * **💡 Por qué es importante:** Manejo de errores más semántico y específico del dominio. Código más claro.
    * **📝 Instrucciones:** Crea `SaldoInsuficienteException`. En `retirar()` (Nº 22), si no hay fondos, haz `throw new SaldoInsuficienteException(...)`. Captúrala con `catch`. Declara `throws` en `retirar()`.
    * **🔑 Conceptos Reforzados:** Excepciones personalizadas, `throw`, `throws`.

---

## 5️⃣ Fase 5: Preparándonos para el Backend (Ejercicios 41-50) 🔗☁️

> **👨‍🏫 Maestro Dice:** ¡Recta final (de esta etapa)! Introducimos conceptos modernos (Lambdas, Streams), concurrencia básica y el núcleo backend: Bases de Datos (JDBC). ¡Esto te dará una ventaja inicial!

-   [ ] **41. Ordenando Datos: `Comparable` y `Comparator`** ⇅🔀
    * **🎯 Objetivo Específico:** Ordenar colecciones por criterios, implementando orden "natural" (`Comparable`) o alternativos (`Comparator`).
    * **💡 Por qué es importante:** Mostrar datos ordenados es requisito común (listas por nombre, precio). Necesitas definir criterios.
    * **📝 Instrucciones:** Ordena `ArrayList<String>`. Haz `Estudiante` (Nº 23) `Comparable` (por ID). Crea `Comparator` externo (por nombre). Usa `Collections.sort()` / `list.sort()`.
    * **🔑 Conceptos Reforzados:** `Comparable`, `Comparator`, `Collections.sort()`, `List.sort()`.

-   [ ] **42. Código Conciso: Expresiones Lambda Básicas** λ✨
    * **🎯 Objetivo Específico:** Usar sintaxis lambda para implementaciones breves de interfaces funcionales (`Comparator`, etc.).
    * **💡 Por qué es importante:** Código más conciso y legible para ciertos patrones (Streams, funcional). Muy usado en Java moderno.
    * **📝 Instrucciones:** Re-escribe `Comparator` (Nº 41) con lambda. Usa `list.forEach(elemento -> ...)` para imprimir.
    * **🔑 Conceptos Reforzados:** Sintaxis lambda (`(p) -> expr`), interfaces funcionales.

-   [ ] **43. Procesamiento Eficiente: Streams API (Introducción)** 💧➡️🏭
    * **🎯 Objetivo Específico:** Usar Streams para filtrar, mapear y recolectar datos de colecciones de forma declarativa.
    * **💡 Por qué es importante:** Forma potente y expresiva de procesar datos. Clave en Java moderno para colecciones. Fundamental en backend.
    * **📝 Instrucciones:** Dada `List<Integer>`, usa streams para: 1) Filtrar pares. 2) Mapear a cuadrados. 3) Combinar: cuadrados de pares. Recolecta en nueva lista (`collect(Collectors.toList())`).
    * **🔑 Conceptos Reforzados:** `stream()`, `filter()`, `map()`, `forEach()`, `collect()`, `Collectors`.

-   [ ] **44. Tareas Concurrentes: Hilos (`Thread` y `Runnable`)** 👯‍♀️🏃‍♀️
    * **🎯 Objetivo Específico:** Crear y ejecutar múltiples hilos concurrentemente (`extends Thread` / `implements Runnable`).
    * **💡 Por qué es importante:** Backend necesita manejar requests simultáneos o tareas en background. Hilos son el primer paso a concurrencia.
    * **📝 Instrucciones:** Crea `TareaSimple implements Runnable` (imprime 1-5 con pausa `Thread.sleep()`). En `main`, crea dos `Thread`s con `TareaSimple`, inícialos (`start()`). Observa salida entrelazada.
    * **🔑 Conceptos Reforzados:** `Thread`, `Runnable`, `run()`, `start()`, `Thread.sleep()`, concurrencia.

-   [ ] **45. Evitando el Caos: Sincronización Básica (`synchronized`)** 🚦🔒
    * **🎯 Objetivo Específico:** Entender "condiciones de carrera" y usar `synchronized` para proteger datos compartidos accedidos por múltiples hilos.
    * **💡 Por qué es importante:** Sin sincronización, datos compartidos pueden corromperse. `synchronized` es mecanismo básico para acceso exclusivo. ¡Vital en backend!
    * **📝 Instrucciones:** Dos hilos llaman repetidamente a `retirar()` de la *misma* `CuentaBancaria` (Nº 22). Observa saldo final (probablemente incorrecto). Añade `synchronized` a `retirar()` y re-ejecuta (debería ser consistente).
    * **🔑 Conceptos Reforzados:** Race conditions, datos compartidos, `synchronized`, exclusión mutua.

-   [ ] **46. Conectando con Datos: JDBC - Establecer Conexión** 🔌🐘<0xE3><0x80><0x80>💾
    * **🎯 Objetivo Específico:** Aprender pasos básicos para conectar Java a una BD relacional usando JDBC.
    * **💡 Por qué es importante:** ¡Núcleo backend! Mayoría de apps interactúan con BD. JDBC es la API estándar.
    * **📝 Instrucciones:** Descarga driver JDBC (H2, SQLite, PostgreSQL). Carga driver (implícito a veces). Usa `DriverManager.getConnection("jdbc:url", "user", "pass")`. Maneja `SQLException`. Usa `try-with-resources`.
    * **🔑 Conceptos Reforzados:** JDBC Driver, URL JDBC, `DriverManager.getConnection()`, `Connection`, `SQLException`, `try-with-resources`.

-   [ ] **47. Guardando Datos: JDBC - `INSERT` con `PreparedStatement`** ✅➡️💾
    * **🎯 Objetivo Específico:** Usar `PreparedStatement` para ejecutar `INSERT` SQL de forma segura (evita inyección SQL) y eficiente.
    * **💡 Por qué es importante:** Forma recomendada. Precompila, maneja parámetros correctamente (seguridad, rendimiento).
    * **📝 Instrucciones:** Crea tabla `productos` (id, nombre, precio). Usa `connection.prepareStatement("INSERT INTO productos (nombre, precio) VALUES (?, ?)")`. Asigna valores (`setString()`, `setDouble()`). Ejecuta (`executeUpdate()`).
    * **🔑 Conceptos Reforzados:** `prepareStatement()`, `PreparedStatement`, `setXXX()`, `executeUpdate()`, placeholders (`?`), prevención inyección SQL.

-   [ ] **48. Recuperando Datos: JDBC - `SELECT` y `ResultSet`** 🔍💾➡️
    * **🎯 Objetivo Específico:** Ejecutar `SELECT` con `PreparedStatement` y procesar resultados en `ResultSet`.
    * **💡 Por qué es importante:** Complemento de `INSERT`. Traer datos de BD a Java para mostrar/procesar.
    * **📝 Instrucciones:** Ejecuta `SELECT id, nombre, precio FROM productos`. Obtén `ResultSet` (`executeQuery()`). Itera `while (resultSet.next())`. Obtén valores (`getInt()`, `getString()`, etc.). Imprime. Cierra recursos (`try-with-resources`).
    * **🔑 Conceptos Reforzados:** `executeQuery()`, `ResultSet`, `next()`, `getXXX()`, cierre de recursos.

-   [ ] **49. Modificando Datos: JDBC - `UPDATE` y `DELETE`** ✏️🗑️💾
    * **🎯 Objetivo Específico:** Ejecutar `UPDATE` y `DELETE` con `PreparedStatement` para modificar/eliminar registros.
    * **💡 Por qué es importante:** Completa operaciones básicas CRUD (Create, Read, Update, Delete).
    * **📝 Instrucciones:** 1) Actualiza nombre/precio de producto por ID (`UPDATE ... SET ... WHERE id = ?`). 2) Elimina producto por ID (`DELETE FROM ... WHERE id = ?`). Usa `executeUpdate()`.
    * **🔑 Conceptos Reforzados:** `UPDATE`, `DELETE` SQL con `PreparedStatement`.

-   [ ] **50. Proyecto Integrador: CRUD Básico de Consola** 🏁🏆
    * **🎯 Objetivo Específico:** Integrar POO, Colecciones, Excepciones y JDBC en app de consola funcional para CRUD de entidad simple (Producto, Tarea) en BD.
    * **💡 Por qué es importante:** Consolida lo aprendido. Visión de cómo interactúan partes de app simple. Prepara para apps más complejas.
    * **📝 Instrucciones:** Diseña clase (`Producto`). Crea `ProductoDAO` (Data Access Object) con métodos CRUD (`crear`, `obtenerPorId`, `obtenerTodos`, `actualizar`, `eliminar`) que usen JDBC (Nº 46-49). Crea clase `main` con menú de consola (Nº 10) que llame a métodos del DAO.
    * **🔑 Conceptos Reforzados:** Integración (POO, JDBC, Consola), patrón DAO (básico), diseño app simple, CRUD completo.

---
