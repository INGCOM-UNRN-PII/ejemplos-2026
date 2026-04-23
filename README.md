# Ejemplos - Programación II

Este proyecto contiene ejemplos categorizados de conceptos clave de Programación Orientada a Objetos en Java, organizados por temática.

Las [reglas](config/reglas.md) están en revisión continua y las podemos conversar
en [Discussions](https://github.com/orgs/INGCOM-UNRN-PII/discussions).

## Estructura de Clases y Paquetes

```text
src/main/java/ar/unrn/
├── basicos/                    # Conceptos elementales
│   ├── Contador.java
│   └── ContadorApp.java
├── dos/
│   ├── colisiones/             # Colisiones físicas y objetos simples
│   │   ├── ColisionesApp.java
│   │   └── ObjetoSimple.java
│   ├── dominio/                # Encapsulamiento estricto (Tell Don't Ask)
│   │   ├── Arma.java
│   │   └── Combatiente.java
│   └── equals/                 # Contrato equals/hashCode
│       ├── correcto/           # Implementaciones correctas
│       │   ├── Persona.java
│       │   └── PersonaApp.java
│       ├── identidad/          # Violaciones de identidad (reflexividad, simetría, etc.)
│       │   ├── consistencia_equals/
│       │   ├── consistencia_hash/
│       │   ├── mutabilidad/
│       │   ├── nullcomparison/
│       │   ├── simetria/
│       │   ├── transitividad/
│       │   └── EqualsViolaReflexividad.java
│       └── problemas/          # Contraejemplos y fallos de rendimiento
│           ├── colisiones/     # Colisiones de Hash y rendimiento
│           ├── inconsistencia/ # Mutabilidad y pérdida de objetos
│           ├── rendimiento/    # Medición O(1) vs O(N)
│           ├── simetria/       # Violación de simetría
│           └── sinhashcode/    # Duplicados en mapas
├── excepciones/                # Jerarquías de excepciones personalizadas
│   ├── BancoException.java
│   ├── CuentaBloqueadaException.java
│   ├── DemoExcepciones.java
│   └── SaldoInsuficienteException.java
├── generados/                  # Ejemplos temáticos reorganizados
│   ├── colecciones/            # Arreglos y Framework de Colecciones
│   │   ├── ArreglosEjemplos.java
│   │   ├── EjemploColecciones.java
│   │   └── genericos/          # Clases y métodos genéricos
│   ├── excepciones/            # try-catch-finally y recursos
│   │   └── GestionExcepciones.java
│   ├── funcional/              # Lambdas y Streams
│   │   └── ProgramacionFuncional.java
│   ├── fundamentos/            # Historia y bases del lenguaje
│   │   ├── CaracteristicasLenguaje.java
│   │   ├── OrigenesJava.java
│   │   └── TiposDeDatos.java
│   ├── herencia/               # Polimorfismo y sobreescritura
│   │   ├── sinoverride/        # Problemas por omitir @Override
│   │   └── superkeyword/       # Reuso de lógica del padre
│   ├── objetos/                # Gestión de memoria y visibilidad
│   │   ├── EjemploInterfaces.java
│   │   ├── MemoriaYStrings.java
│   │   └── internas/           # Inner classes y clases anónimas
│   ├── patrones/               # Patrones de diseño clásicos
│   │   ├── PatronObserver.java
│   │   ├── PatronSingleton.java
│   │   └── PatronVisitor.java
│   ├── servicios/              # E/S, Archivos y Tiempo
│   │   ├── EntradaSalida.java
│   │   ├── ManejoArchivos.java
│   │   └── ManejoFechas.java
│   ├── sintaxis/               # Estructuras de control y métodos
│   │   ├── ArgumentosVariables.java
│   │   ├── ControlFlujo.java
│   │   ├── EjemploRecursion.java
│   │   └── Metodos.java
│   └── util/                   # Clases utilitarias y tests
│       └── Matematica.java
├── herencia/                   # Herencia y polimorfismo
│   └── figuras/                # Jerarquía de Punto y Círculo
│       ├── Circulo.java
│       ├── Punto.java
│       └── PuntoApp.java
└── LoaderApp.java              # Cargador principal de ejemplos
```

## Índice de Ejemplos

### 1. Fundamentos y Sintaxis (`ar.unrn.generados.*`)
- **Fundamentos**: Historia, filosofía WORA y conceptos de JVM.
- **Sintaxis**: Control de flujo moderno, métodos y recursión.
- **Argumentos Variables**: Uso de Varargs (`int...`).

### 2. Orientación a Objetos
- **Diseño**: Gestión de memoria, inmutabilidad y clases internas.
- **Encapsulamiento**: Principio "Tell, Don't Ask" en el dominio de combate.
- **Herencia**: Sobreescritura con `super`, polimorfismo y uso de `@Override`.

### 3. El Contrato de Objetos (equals y hashCode)
- **Implementación Correcta**: Uso de pattern matching en `Persona`.
- **Violaciones de Identidad**: Reflexividad, simetría, transitividad, consistencia y comparación con null.
- **Problemas Comunes**: Inconsistencia por mutabilidad y colisiones de hash.
- **Rendimiento**: Comparativa empírica de acceso $O(1)$ vs $O(N)$.

### 4. Temas Avanzados
- **Programación Funcional**: Lambdas y procesamiento de Streams.
- **Excepciones**: Jerarquías personalizadas y captura multinivel.
- **Patrones de Diseño**: Singleton, Observer y Visitor.

---

## Ejecución y Verificación

Para ejecutar un ejemplo específico:
```bash
./gradlew run --args="ar.unrn.generados.sintaxis.ControlFlujo"
```

Para ejecutar el análisis completo de calidad:
```bash
./gradlew analyzeAll
```
