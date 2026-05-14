# Ejemplos - Programación II

Este proyecto contiene ejemplos categorizados de conceptos clave de Programación Orientada a Objetos en Java, organizados por temática.

Las [reglas](config/reglas.md) están en revisión continua y las podemos conversar
en [Discussions](https://github.com/orgs/INGCOM-UNRN-PII/discussions).

## Estructura de Clases y Paquetes (Granular)

El proyecto sigue una estructura de **un paquete por ejemplo**, facilitando el aislamiento y la claridad.

```text
src/main/java/ar/unrn/
├── basicos/contador/           # Contador elemental
├── dominio/combate/            # Encapsulamiento estricto (Arma, Combatiente)
├── equals/
│   ├── correcto/persona/       # Implementación robusta (Persona)
│   ├── identidad/              # Violaciones del contrato (reflexividad, simetría, etc.)
│   └── problemas/              # Contraejemplos de rendimiento y colisiones
├── excepciones/
│   ├── banco/                  # Jerarquía de excepciones personalizadas
│   └── base/gestion/           # try-catch y recursos
├── generados/
│   ├── colecciones/            # Arreglos, ArrayList y Genéricos
│   ├── funcional/streams/      # Lambdas y API de Streams
│   ├── fundamentos/            # Historia, JVM y tipos primitivos
│   ├── objetos/                # Memoria, Interfaces y Clases Internas
│   ├── patrones/               # Observer, Singleton y Visitor
│   ├── servicios/              # E/S, Archivos y Tiempo
│   ├── sintaxis/               # Control de flujo y métodos
│   └── util/matematica/        # Clases utilitarias
├── herencia/
│   ├── figuras/geometria/      # Jerarquía de Punto y Círculo
│   ├── sinoverride/            # Problemas por omitir @Override
│   ├── superconstructor/       # Llamada a super() en constructores
│   └── superkeyword/           # Extensión de lógica con super.metodo()
├── inmutable/mensaje/          # Objetos inmutables
├── lista/red/                  # Estructura de datos personalizada
├── mutable/arreglo/            # Mutabilidad en arreglos
├── refactoring/
│   ├── enunciados/             # Ejercicios por dificultad, grupo y refactorización
│   ├── ejemplos/               # Refactorizaciones resueltas, ordenadas por dificultad
│   └── patrones_diseno/        # Refactorizaciones orientadas a patrones de diseño
└── patrones/
    ├── comportamiento/         # Strategy, Observer, State y Chain of Responsibility
    ├── creacionales/           # Builder, Factory Method, Prototype y más
    ├── estructurales/          # Bridge y Flyweight
    └── integracion/smarthome/  # Composición de múltiples patrones
```

## Índice de Ejemplos y Temas

### 1. Fundamentos y Sintaxis
- **Fundamentos**: [`OrigenesJava`](src/main/java/ar/unrn/generados/fundamentos/origenesjava/OrigenesJava.java), [`CaracteristicasLenguaje`](src/main/java/ar/unrn/generados/fundamentos/caracteristicaslenguaje/CaracteristicasLenguaje.java), [`TiposDeDatos`](src/main/java/ar/unrn/generados/fundamentos/tiposdedatos/TiposDeDatos.java).
- **Sintaxis**: [`ControlFlujo`](src/main/java/ar/unrn/generados/sintaxis/controlflujo/ControlFlujo.java), [`Metodos`](src/main/java/ar/unrn/generados/sintaxis/metodos/Metodos.java), [`EjemploRecursion`](src/main/java/ar/unrn/generados/sintaxis/ejemplorecursion/EjemploRecursion.java).
- **Herencia Básica**: [`EjemploSuper`](src/main/java/ar/unrn/herencia/superconstructor/EjemploSuper.java) (Llamada a constructor padre).

### 2. Orientación a Objetos Avanzada
- **Encapsulamiento**: [`Combate`](src/main/java/ar/unrn/dominio/combate/) (Tell, Don't Ask).
- **Sobreescritura**: [`SobreescrituraSuper`](src/main/java/ar/unrn/herencia/superkeyword/SobreescrituraSuper.java), [`ProblemaSinOverride`](src/main/java/ar/unrn/herencia/sinoverride/ProblemaSinOverride.java).
- **Polimorfismo**: [`EjemploInterfaces`](src/main/java/ar/unrn/generados/objetos/interfaces/EjemploInterfaces.java).

### 3. El Contrato de Objetos (equals y hashCode)
- **Implementación**: [`Persona`](src/main/java/ar/unrn/equals/correcto/persona/Persona.java).
- **Fallas de Identidad**: [`Reflexividad`](src/main/java/ar/unrn/equals/identidad/reflexividad/), [`Simetria`](src/main/java/ar/unrn/equals/identidad/simetria/), [`Transitividad`](src/main/java/ar/unrn/equals/identidad/transitividad/).
- **Rendimiento**: [`ComparativaRendimientoHash`](src/main/java/ar/unrn/equals/problemas/rendimiento/ComparativaRendimientoHash.java) ($O(1)$ vs $O(N)$).

### 4. Patrones y Servicios
- **Patrones generados**: [`Observer`](src/main/java/ar/unrn/generados/patrones/observer/), [`Singleton`](src/main/java/ar/unrn/generados/patrones/singleton/), [`Visitor`](src/main/java/ar/unrn/generados/patrones/visitor/).
- **Patrones de comportamiento**:
  - **Básico**: [`Strategy`](src/main/java/ar/unrn/patrones/comportamiento/basico/strategy/) para intercambiar operaciones simples en una calculadora.
  - **Intermedio**: [`Observer`](src/main/java/ar/unrn/patrones/comportamiento/intermedio/observer/) para publicar noticias a suscriptores dinámicos.
  - **Avanzado**: [`Chain of Responsibility`](src/main/java/ar/unrn/patrones/comportamiento/avanzado/chain_of_responsibility/) para escalar solicitudes de soporte.
  - **Ejercicio guiado**: [`State`](src/main/java/ar/unrn/patrones/comportamiento/ejercicio/state/) con una máquina expendedora.
- **Patrones estructurales**: [`Bridge`](src/main/java/ar/unrn/patrones/estructurales/bridge/), [`Flyweight`](src/main/java/ar/unrn/patrones/estructurales/flyweight/).
- **Integración de patrones**: [`Smart Home`](src/main/java/ar/unrn/patrones/integracion/smarthome/).
- **Servicios**: [`ManejoFechas`](src/main/java/ar/unrn/generados/servicios/manejofechas/), [`ManejoArchivos`](src/main/java/ar/unrn/generados/servicios/manejoarchivos/).

### 5. Refactorización
- **Índice general**: [`ar/unrn/refactoring`](src/main/java/ar/unrn/refactoring/README.md).
- **Ejemplos resueltos por dificultad**: [`ejemplos/`](src/main/java/ar/unrn/refactoring/ejemplos/README.md).
- **Enunciados por dificultad, grupo y refactorización**: [`enunciados/`](src/main/java/ar/unrn/refactoring/enunciados/README.md).
- **Refactorizaciones orientadas a patrones de diseño**: [`patrones_diseno/`](src/main/java/ar/unrn/refactoring/patrones_diseno/README.md).

---

## Diagramas (PlantUML)

Los diagramas se encuentran en la carpeta [`docs/diagrams/`](docs/diagrams/):
- [Modelo de Combate](docs/diagrams/combate_dominio.plantuml)
- [Jerarquía de Excepciones](docs/diagrams/excepciones_banco.plantuml)
- [Patrón Observer](docs/diagrams/patron_observer.plantuml)
- [Patrón Visitor](docs/diagrams/patron_visitor.plantuml)
- [Jerarquía de Figuras](docs/diagrams/herencia_figuras.plantuml)

---

## Ejecución y Verificación

Ejecutar un ejemplo específico:
```bash
./gradlew run --args="ar.unrn.basicos.contador.ContadorApp"
```

Verificación completa de calidad:
```bash
./gradlew analyzeAll
```
