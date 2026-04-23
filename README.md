# Ejemplos - Programación II

Este proyecto contiene ejemplos categorizados de conceptos clave de Programación Orientada a Objetos en Java, organizados por temática.

Las [reglas](config/reglas.md) están en revisión continua y las podemos conversar
en [Discussions](https://github.com/orgs/INGCOM-UNRN-PII/discussions).

## Contenido de Ejemplos

## Índice de Ejemplos

Este proyecto contiene ejemplos categorizados de conceptos clave de Programación Orientada a Objetos en Java, organizados por temática.

### 1. Fundamentos y Sintaxis (`ar.unrn.generados.*`)

#### [Fundamentos](src/main/java/ar/unrn/generados/fundamentos/)
- **`OrigenesJava`**: Historia, filosofía WORA y conceptos de JVM/Garbage Collector.
- **`CaracteristicasLenguaje`**: Tipado estático y fuerte, estructura de clases y métodos estáticos.
- **`TiposDeDatos`**: Detalle de tipos primitivos, precisión de punto flotante y casting.

#### [Sintaxis y Control](src/main/java/ar/unrn/generados/sintaxis/)
- **`ControlFlujo`**: Uso de `if`, `switch` moderno y lazos (`for`, `while`) usando banderas booleanas.
- **`Metodos`**: Firmas, sobrecarga, pasaje por valor y recursión básica.
- **`ArgumentosVariables`**: Uso de Varargs (`int...`) para recibir múltiples argumentos.
- **`EjemploRecursion`**: Factorial, Fibonacci y búsqueda binaria recursiva.

### 2. Orientación a Objetos y Colecciones

#### [Diseño de Objetos](src/main/java/ar/unrn/generados/objetos/)
- **`MemoriaYStrings`**: Stack vs Heap, alias de referencias e inmutabilidad de `String`.
- **`ClasesInternas`**: Miembros, estáticas y clases anónimas.
- **`EjemploInterfaces`**: Definición de contratos y polimorfismo mediante interfaces.

#### [Estructuras de Datos](src/main/java/ar/unrn/generados/colecciones/)
- **`ArreglosEjemplos`**: Arreglos estáticos, utilidades de `java.util.Arrays` y búsqueda con bandera.
- **`EjemploColecciones`**: Uso de `ArrayList`, iteración `for-each` y operaciones básicas de lista.
- **`GenericosEjemplo`**: Clases y métodos genéricos, seguridad de tipos y `Type Erasure`.

#### [Orientación a Objetos Avanzada](src/main/java/ar/unrn/generados/herencia/)
- **`ProblemaSinOverride`**: Demostración de errores comunes al omitir la anotación `@Override` (sobrecarga accidental).
- **`SobreescrituraSuper`**: Uso de `super` para extender la funcionalidad del padre o reutilizar partes de su implementación.

#### [Encapsulamiento y Comportamiento](src/main/java/ar/unrn/dos/dominio/)
- **`Arma`** y **`Combatiente`**: Ejemplo de encapsulamiento estricto (sin getters/setters) y el principio "Tell, Don't Ask".

### 3. El Contrato de Objetos (equals y hashCode)

#### [Implementaciones Correctas](src/main/java/ar/unrn/dos/equals/)
- **`Persona`**: Implementación robusta de `equals` y `hashCode` usando pattern matching.
- **`PersonaApp`**: Demostración de reflexividad, simetría y transitividad.

#### [Problemas y Contraejemplos](src/main/java/ar/unrn/dos/equals/problemas/)
- **`ProblemaEqualsSimetria`**: Fallos en colecciones por violar la simetría.
- **`ProblemaHashCodeInconsistente`**: Objetos que "desaparecen" de un `Set` por mutabilidad.
- **`ProblemaEqualsSinHashCode`**: Duplicados en mapas por omitir `hashCode`.
- **`ProblemaColisionesHash`**: Degradación de rendimiento por mala distribución de hash.
- **`ComparativaRendimientoHash`**: Medición empírica del impacto de las colisiones ($O(1)$ vs $O(N)$).

### 4. Temas Avanzados y Servicios

#### [Programación Funcional](src/main/java/ar/unrn/generados/funcional/)
- **`ProgramacionFuncional`**: Introducción a Lambdas, Streams, filtrado, transformación y reducción.

#### [Gestión de Errores](src/main/java/ar/unrn/generados/excepciones/)
- **`GestionExcepciones`**: Uso de `try-catch`, `finally`, excepciones personalizadas y `try-with-resources`.

#### [Servicios del Sistema](src/main/java/ar/unrn/generados/servicios/)
- **`EntradaSalida`**: Uso de `Scanner` (lectura validada) y `printf` para formato.
- **`ManejoArchivos`**: API NIO.2 (`Files`, `Path`) para lectura y escritura de archivos.
- **`ManejoFechas`**: API `java.time` moderna (inmutabilidad y thread-safety).

#### [Patrones de Diseño](src/main/java/ar/unrn/generados/patrones/)
- **`PatronSingleton`**: Garantía de instancia única.
- **`PatronObserver`**: Desacoplamiento mediante notificaciones uno-a-muchos.
- **`PatronVisitor`**: Extensión de operaciones sobre una jerarquía fija mediante doble despacho.

---

### Ejecutar ejemplos

Para ejecutar todos los ejemplos del paquete `ar.unrn.cuatro`:

```bash
./gradlew run
```

O ejecutar un ejemplo específico directamente desde tu IDE o con:

```bash
./gradlew run --args="ar.unrn.cuatro.NombreDelEjemplo"
```

Cada ejemplo tiene un método `main` que demuestra el problema específico con salida explicativa en consola.

## Comando de verificación completo

Ejecuta todas las verificaciones y genera reporte consolidado:

```bash
./gradlew analyzeAll
```

Este comando ejecuta en orden:

1. Limpieza del proyecto
2. **Compilación** (Error Prone + NullAway automático)
3. **Tests unitarios** (incluyendo ArchUnit para arquitectura)
4. **Cobertura de código** (JaCoCo)
5. **Análisis estático** (Checkstyle, PMD, SpotBugs)
6. **Verificación calidad de tests** (sin lógica condicional)
7. **Reporte consolidado** (Informe Dredd)

## Reglas de Programación

Las reglas empleadas están orientadas para su uso en una cátedra, por lo que se revisa una gran cantidad de detalles.

📖 **Ver todas las reglas en**: [`config/reglas.md`](config/reglas.md)

Las reglas están categorizadas con numeración hexadecimal:

- `0x0xxx`: Nomenclatura y formato general
- `0x1xxx`: Documentación y comentarios
- `0x2xxx`: Diseño de clases y POO
- `0x3xxx`: Manejo de excepciones
- `0x4xxx`: Testing
- `0x5xxx`: Estructuras de control
- `0x6xxx`: Restricciones de programación funcional
- `0xExxx`: Errores comunes (Error-Prone)

### Reglas integradas

#### [Checkstyle](https://checkstyle.sourceforge.io/)

Verificación de estilo de código (~25 reglas)

**Reglas principales verificadas**:

- **Nomenclatura**: `0x0001` (clases CamelloCase), `0x0003` (variables dromedarioCase), `0x0004` (métodos
  dromedarioCase), `0x0005` (constantes SNAKE_CASE)
- **Formato**: `0x0009` (espacios en operadores), `0x000A` (no apilar líneas), `0x000B` (llaves en bloques)
- **Documentación**: `0x1000` (formato Javadoc), `0x1001` (documentar clases/métodos/atributos)
- **Diseño**: `0x200A` (métodos máx 30 líneas), `0x2001` (atributos private), `0x2011` (máx 5 parámetros)

```bash
./gradlew checkstyleMain checkstyleTest
```

Reportes generados en:

- `build/reports/checkstyle/main.html`
- `build/reports/checkstyle/test.html`

📖 **Detalle completo**: [`config/reglas.md`](config/reglas.md) secciones 0x0, 0x1, 0x2

#### [PMD](https://pmd.github.io/)

Análisis estático de código (~15 reglas)

**Reglas principales verificadas**:

- **Nomenclatura**: `0x0003` (variables locales), `0x0005` (constantes)
- **Diseño**: `0x200A` (métodos cortos), `0x2007` (sin código duplicado), `0x200C` (getters/setters justificados)
- **Complejidad**: `0x2011` (parámetros), `0x200D` (responsabilidad única)
- **Buenas prácticas**: `0xA012` (sin números mágicos), `0x5006` (bucles con terminación clara)

```bash
./gradlew pmdMain pmdTest
```

Reportes generados en:

- `build/reports/pmd/main.html`
- `build/reports/pmd/test.html`

📖 **Detalle completo**: [`config/reglas.md`](config/reglas.md) secciones 0x0, 0x2, 0x5

#### [SpotBugs](https://spotbugs.github.io/)

Detección de bugs (~5 reglas)

**Categorías verificadas**:

- Problemas de concurrencia
- Comparaciones incorrectas (relacionado con `0xE001`)
- Uso incorrecto de APIs
- Errores de lógica comunes

```bash
./gradlew spotbugsMain spotbugsTest
```

Reportes generados en:

- `build/reports/spotbugs/main.html`
- `build/reports/spotbugs/test.html`

#### [Error Prone](https://errorprone.info/)

**Se ejecuta automáticamente durante la compilación** (6 reglas)

Detecta errores comunes durante la compilación:

- `0xE001` - Comparar objetos con `==` en lugar de `equals()` → check `StringEquality`
- `0xE002` - No cerrar recursos → check `MissingOverride`
- `0xE003` - Modificar colección durante iteración → check `ModifyCollectionInEnhancedForLoop`
- `0xE004` - Ignorar valor de retorno → checks `ReturnValueIgnored`, `CheckReturnValue`
- `0x200F` - equals primero de Object → check `EqualsIncompatibleType`
- `0x2010` - hashCode con librería → check `EqualsHashCode`

```bash
# Se ejecuta automáticamente con:
./gradlew compileJava
```

📖 **Detalle completo**: [`config/reglas.md`](config/reglas.md) sección 0xE (Errores comunes)

#### [NullAway](https://github.com/uber/NullAway)

**Se ejecuta automáticamente durante la compilación** (4 reglas)

Verificación de errores provocables por `null` en tiempo de compilación:

- `0x200B` - Evitar retornos null (usar @Nullable si es necesario)
- `0x2011` - Constructores validan parámetros (null checks)
- `0x3006` - Situaciones diferentes → excepciones diferentes
- `0x3007` - Largo cero ≠ null

```bash
# Se ejecuta automáticamente con:
./gradlew compileJava
```

📖 **Detalle completo**: [`config/reglas.md`](config/reglas.md) secciones 0x2 (Diseño POO), 0x3 (Excepciones)

#### [ArchUnit](https://www.archunit.org/)

**Se ejecuta automáticamente con los tests** (5 reglas)

Tests que verifican reglas de arquitectura POO:

- `0x2001` - Atributos deben ser private (encapsulamiento)
- `0x2003` - Paquetes deben comenzar con ar.unrn
- `0x2009` - Atributos estáticos justificados (solo constantes)
- `0x200D` - Clases con única responsabilidad (SRP, máx 20 miembros)
- `0x0006A` - Nomenclatura de interfaces (-able para instancia, -or/-er para funcional)

```bash
./gradlew test --tests ReglasArquitecturaTest
```

📖 **Detalle completo**: [`config/reglas.md`](config/reglas.md) secciones 0x0 (Nomenclatura), 0x2 (Diseño POO)

### Analisis de tests

#### [JaCoCo](https://www.jacoco.org/jacoco/)

Cobertura de las pruebas

Genera reportes de cobertura de líneas, ramas, métodos y clases. Ayuda a identificar código no testeado.

```bash
./gradlew test jacocoTestReport
```

Reportes generados en:

- `build/reports/tests/test/index.html` - Resultados de tests
- `build/reports/jacoco/test/html/index.html` - Cobertura de código

**Configuración**: Cobertura mínima 50%, excluye clases *App y métodos main

#### [PIT (Pitest)](https://pitest.org/)

**No se ejecuta automáticamente** (4 reglas indirectas)

Verifica calidad de tests mediante mutaciones del código. Útil para validar calidad de tests antes de entregas.

**Reglas verificadas indirectamente**:

- `0x4001` - Estructura AAA (tests débiles fallan con mutaciones)
- `0x4002` - Una llamada por test (baja cobertura indica problema)
- `0x4004` - Tests sin lógica condicional (verificar con `verifyTestQuality`)
- `0x4005` - Tests independientes (mutaciones revelan dependencias)

Es necesario ejecutarlo explícitamente con:

```bash
./gradlew pitest

# Verificar calidad de tests (sin lógica condicional):
./gradlew verifyTestQuality
```

Reportes generados en:

- `build/reports/pitest/index.html`

Configuración utilizada, umbrales 80% mutaciones, 54% cobertura. Excluye clases `*App`.
Detalles en [`config/reglas.md`](config/reglas.md) sección 0x4 (Testing)

## Reporte Consolidado (Dredd)

Genera un reporte consolidado en Markdown con resultados de todas las herramientas:

```bash
./gradlew check dredd
```

Reporte generado en:

- `build/reports/dredd.md`

## Documentación de Contratos (Design by Contract)

El proyecto está configurado para soportar etiquetas Javadoc personalizadas que permiten documentar formalmente el comportamiento de los métodos mediante contratos:

- `@contract.pre`: **Precondición**. Requisitos que deben cumplirse antes de llamar al método.
- `@contract.post`: **Postcondición**. Garantías que el método asegura al finalizar su ejecución.
- `@contract.invar`: **Invariante**. Condiciones que permanecen constantes durante la vida del objeto.

### Ejemplo: Uso con prosa
Ideal para descripciones conceptuales o reglas de negocio complejas.

```java
/**
 * Transfiere fondos a otra cuenta.
 *
 * @param destino La cuenta que recibirá los fondos.
 * @param monto   La cantidad a transferir.
 * @contract.pre La cuenta de destino debe estar activa y el monto no puede ser negativo.
 * @contract.post El saldo de la cuenta origen disminuye y el de destino aumenta.
 */
public void transferir(Cuenta destino, double monto) { ... }
```

### Ejemplo: Uso con código
Ideal para expresar condiciones lógicas precisas.

```java
/**
 * Calcula el área de un rectángulo.
 *
 * @contract.pre ancho > 0 && alto > 0
 * @contract.post result == ancho * alto
 */
public double calcularArea(double ancho, double alto) { ... }
```

## Estructura del proyecto

```
proyecto-gradle/
├── src/
│   ├── main/java/ar/unrn/                  # Código fuente
│   │   ├── LoaderApp.java                  # Cargador de aplicaciones
│   │   └── PlantillaApp.java               # Plantilla de aplicación de consola
│   └── test/java/ar/unrn/                  # Tests
│       ├── PlantillaAppTest.java           # Plantilla de tests de aplicaciones 
│       └── ReglasArquitecturaTest.java     # Tests ArchUnit (parte de las reglas de verificación)
├── config/
│   ├── checkstyle/                         # Configuración Checkstyle
│   │   ├── checkstyle.xml
│   │   └── suppressions.xml
│   ├── pmd/                                # Configuración PMD
│   │   └── programacion2.xml
│   ├── stylesheets/                        # XSL para reportes
│   ├── dredd/                              # Plantillas para reporte consolidado
│   └── reglas.md                           # Documentación básica de las reglas
├── build.gradle                            # Configuración del proyecto
├── settings.gradle                         # La configuración del proyecto
└── README.md                               # Este archivo
```
