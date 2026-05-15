# Ejemplos - Programación II

Este proyecto contiene ejemplos categorizados de conceptos clave de Programación Orientada a Objetos en Java, organizados por temática.

Las [reglas](config/reglas.md) están en revisión continua y las podemos conversar
en [Discussions](https://github.com/orgs/INGCOM-UNRN-PII/discussions).

## Estructura de Clases y Paquetes (Granular)

El proyecto sigue una estructura de **un paquete por ejemplo**, facilitando el aislamiento y la claridad.

```text
src/main/java/ar/unrn/
├── basicos/contador/           # Contador elemental
├── demeter/                    # Ley de Demeter y message chains
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
├── inter/                      # Escala de interdependencia entre modulos
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

## Índice general de todos los ejemplos contenidos

### 1. Fundamentos, sintaxis y utilitarios
- **Básicos**: [`basicos/contador/`](src/main/java/ar/unrn/basicos/contador/).
- **Fundamentos generados**: [`origenesjava/`](src/main/java/ar/unrn/generados/fundamentos/origenesjava/), [`caracteristicaslenguaje/`](src/main/java/ar/unrn/generados/fundamentos/caracteristicaslenguaje/), [`tiposdedatos/`](src/main/java/ar/unrn/generados/fundamentos/tiposdedatos/).
- **Sintaxis generada**: [`argumentosvariables/`](src/main/java/ar/unrn/generados/sintaxis/argumentosvariables/), [`controlflujo/`](src/main/java/ar/unrn/generados/sintaxis/controlflujo/), [`ejemplorecursion/`](src/main/java/ar/unrn/generados/sintaxis/ejemplorecursion/), [`metodos/`](src/main/java/ar/unrn/generados/sintaxis/metodos/).
- **Colecciones generadas**: [`arreglos/`](src/main/java/ar/unrn/generados/colecciones/arreglos/), [`dinamicas/`](src/main/java/ar/unrn/generados/colecciones/dinamicas/), [`genericos/`](src/main/java/ar/unrn/generados/colecciones/genericos/).
- **Objetos generados**: [`interfaces/`](src/main/java/ar/unrn/generados/objetos/interfaces/), [`internas/`](src/main/java/ar/unrn/generados/objetos/internas/), [`memoria/`](src/main/java/ar/unrn/generados/objetos/memoria/).
- **Servicios generados**: [`entradasalida/`](src/main/java/ar/unrn/generados/servicios/entradasalida/), [`manejoarchivos/`](src/main/java/ar/unrn/generados/servicios/manejoarchivos/), [`manejofechas/`](src/main/java/ar/unrn/generados/servicios/manejofechas/).
- **Utilitarios**: [`generados/util/matematica/`](src/main/java/ar/unrn/generados/util/matematica/), [`genericos/`](src/main/java/ar/unrn/genericos/), [`docs/`](src/main/java/ar/unrn/docs/), [`generados/parciales/`](src/main/java/ar/unrn/generados/parciales/).

### 2. Objetos, encapsulamiento y colaboración
- **Dominio y encapsulamiento**: [`dominio/combate/`](src/main/java/ar/unrn/dominio/combate/), [`dominio/geometria/`](src/main/java/ar/unrn/dominio/geometria/).
- **Herencia**: [`herencia/figuras/geometria/`](src/main/java/ar/unrn/herencia/figuras/geometria/), [`herencia/sinoverride/`](src/main/java/ar/unrn/herencia/sinoverride/), [`herencia/superconstructor/`](src/main/java/ar/unrn/herencia/superconstructor/), [`herencia/superkeyword/`](src/main/java/ar/unrn/herencia/superkeyword/).
- **Mutabilidad e inmutabilidad**: [`inmutable/mensaje/`](src/main/java/ar/unrn/inmutable/mensaje/), [`mutable/arreglo/`](src/main/java/ar/unrn/mutable/arreglo/), [`lista/red/`](src/main/java/ar/unrn/lista/red/).
- **Ley de Demeter**: [`demeter/`](src/main/java/ar/unrn/demeter/).
- **Interdependencia**: [`inter/contenido/`](src/main/java/ar/unrn/inter/contenido/), [`inter/global/`](src/main/java/ar/unrn/inter/global/), [`inter/control/`](src/main/java/ar/unrn/inter/control/), [`inter/datos/`](src/main/java/ar/unrn/inter/datos/), [`inter/mensajes/`](src/main/java/ar/unrn/inter/mensajes/).
- **Acoplamiento global con estáticos**: [`estaticos/contadorinstancias/`](src/main/java/ar/unrn/estaticos/contadorinstancias/).

### 3. Contrato de objetos: equals y hashCode
- **Implementación correcta**: [`equals/correcto/persona/`](src/main/java/ar/unrn/equals/correcto/persona/).
- **Identidad y contrato**: [`equals/identidad/`](src/main/java/ar/unrn/equals/identidad/), [`consistencia_equals/`](src/main/java/ar/unrn/equals/identidad/consistencia_equals/), [`consistencia_hash/`](src/main/java/ar/unrn/equals/identidad/consistencia_hash/), [`mutabilidad/`](src/main/java/ar/unrn/equals/identidad/mutabilidad/), [`nullcomparison/`](src/main/java/ar/unrn/equals/identidad/nullcomparison/), [`reflexividad/`](src/main/java/ar/unrn/equals/identidad/reflexividad/), [`simetria/`](src/main/java/ar/unrn/equals/identidad/simetria/), [`transitividad/`](src/main/java/ar/unrn/equals/identidad/transitividad/).
- **Colisiones, contraejemplos y problemas**: [`equals/colision/`](src/main/java/ar/unrn/equals/colision/), [`equals/contraejemplos/`](src/main/java/ar/unrn/equals/contraejemplos/), [`problemas/colisiones/`](src/main/java/ar/unrn/equals/problemas/colisiones/), [`problemas/inconsistencia/`](src/main/java/ar/unrn/equals/problemas/inconsistencia/), [`problemas/rendimiento/`](src/main/java/ar/unrn/equals/problemas/rendimiento/), [`problemas/simetria/`](src/main/java/ar/unrn/equals/problemas/simetria/), [`problemas/sinhashcode/`](src/main/java/ar/unrn/equals/problemas/sinhashcode/).

### 4. Excepciones
- **Jerarquía de excepciones**: [`excepciones/banco/`](src/main/java/ar/unrn/excepciones/banco/).
- **Gestión base y recursos**: [`excepciones/base/gestion/`](src/main/java/ar/unrn/excepciones/base/gestion/).
- **Flujo excepcional**: [`excepciones/flujo/`](src/main/java/ar/unrn/excepciones/flujo/).

### 5. Smells, acoplamiento y diseño defectuoso
- **Code smells clásicos**: [`codesmells/bloaters/`](src/main/java/ar/unrn/codesmells/bloaters/), [`codesmells/change_preventers/`](src/main/java/ar/unrn/codesmells/change_preventers/), [`codesmells/couplers/`](src/main/java/ar/unrn/codesmells/couplers/), [`codesmells/dispensables/`](src/main/java/ar/unrn/codesmells/dispensables/), [`codesmells/oo_abusers/`](src/main/java/ar/unrn/codesmells/oo_abusers/).
- **Smells en español**: [`smells/acoplamiento/`](src/main/java/ar/unrn/smells/acoplamiento/), [`smells/fragilidad/`](src/main/java/ar/unrn/smells/fragilidad/), [`smells/inseparabilidad/`](src/main/java/ar/unrn/smells/inseparabilidad/), [`smells/rigidez/`](src/main/java/ar/unrn/smells/rigidez/), [`smells/viscosidad/`](src/main/java/ar/unrn/smells/viscosidad/).

### 6. Principios SOLID
- [`solid/srp/`](src/main/java/ar/unrn/solid/srp/)
- [`solid/ocp/`](src/main/java/ar/unrn/solid/ocp/)
- [`solid/lsp/`](src/main/java/ar/unrn/solid/lsp/)
- [`solid/isp/`](src/main/java/ar/unrn/solid/isp/)
- [`solid/dip/`](src/main/java/ar/unrn/solid/dip/)

### 7. Patrones de diseño y variantes
- **Patrones generados**: [`observer/`](src/main/java/ar/unrn/generados/patrones/observer/), [`singleton/`](src/main/java/ar/unrn/generados/patrones/singleton/), [`visitor/`](src/main/java/ar/unrn/generados/patrones/visitor/).
- **Comportamiento**: [`strategy básico/`](src/main/java/ar/unrn/patrones/comportamiento/basico/strategy/), [`observer intermedio/`](src/main/java/ar/unrn/patrones/comportamiento/intermedio/observer/), [`chain_of_responsibility avanzado/`](src/main/java/ar/unrn/patrones/comportamiento/avanzado/chain_of_responsibility/), [`state ejercicio/`](src/main/java/ar/unrn/patrones/comportamiento/ejercicio/state/), [`strategy completo/`](src/main/java/ar/unrn/patrones/comportamiento/completo/strategy/).
- **Creacionales**: [`abstract_factory/basico/`](src/main/java/ar/unrn/patrones/creacionales/abstract_factory/basico/), [`abstract_factory/intermedio/`](src/main/java/ar/unrn/patrones/creacionales/abstract_factory/intermedio/), [`abstract_factory/avanzado/`](src/main/java/ar/unrn/patrones/creacionales/abstract_factory/avanzado/), [`builder/basico/`](src/main/java/ar/unrn/patrones/creacionales/builder/basico/), [`builder/intermedio/`](src/main/java/ar/unrn/patrones/creacionales/builder/intermedio/), [`builder/avanzado/`](src/main/java/ar/unrn/patrones/creacionales/builder/avanzado/), [`factory_method/basico/`](src/main/java/ar/unrn/patrones/creacionales/factory_method/basico/), [`factory_method/intermedio/`](src/main/java/ar/unrn/patrones/creacionales/factory_method/intermedio/), [`factory_method/avanzado/`](src/main/java/ar/unrn/patrones/creacionales/factory_method/avanzado/), [`prototype/basico/`](src/main/java/ar/unrn/patrones/creacionales/prototype/basico/), [`prototype/intermedio/`](src/main/java/ar/unrn/patrones/creacionales/prototype/intermedio/), [`prototype/avanzado/`](src/main/java/ar/unrn/patrones/creacionales/prototype/avanzado/), [`singleton/basico/`](src/main/java/ar/unrn/patrones/creacionales/singleton/basico/), [`singleton/intermedio/`](src/main/java/ar/unrn/patrones/creacionales/singleton/intermedio/), [`singleton/avanzado/`](src/main/java/ar/unrn/patrones/creacionales/singleton/avanzado/).
- **Estructurales**: [`bridge/`](src/main/java/ar/unrn/patrones/estructurales/bridge/), [`decorator/`](src/main/java/ar/unrn/patrones/estructurales/decorator/), [`flyweight/`](src/main/java/ar/unrn/patrones/estructurales/flyweight/).
- **Integración de patrones**: [`integracion/smarthome/`](src/main/java/ar/unrn/patrones/integracion/smarthome/).

### 8. Refactorización
- **Índice principal**: [`refactoring/README.md`](src/main/java/ar/unrn/refactoring/README.md).
- **Ejemplos resueltos**: [`refactoring/ejemplos/`](src/main/java/ar/unrn/refactoring/ejemplos/README.md).
- **Enunciados de práctica**: [`refactoring/enunciados/`](src/main/java/ar/unrn/refactoring/enunciados/README.md).
- **Refactorizaciones hacia patrones**: [`refactoring/patrones_diseno/`](src/main/java/ar/unrn/refactoring/patrones_diseno/README.md).

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
