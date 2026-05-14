# Patrón Chain of Responsibility (Nivel avanzado)

Este ejemplo aumenta la complejidad porque el cliente no elige un único objeto colaborador: envía la solicitud a una
cadena y deja que varios handlers decidan si atenderla o escalarla.

## Idea central

- `SolicitudSoporte` encapsula categoría, prioridad y descripción.
- `ManejadorSoporte` define el esqueleto de la cadena.
- `BotPrimerNivel`, `AgenteAplicacion` y `EspecialistaInfraestructura` representan escalones con distintas capacidades.

## Qué discutir en clase

1. Cómo el cliente conoce solo el primer handler.
2. Cómo cada eslabón decide con criterios propios si resuelve o delega.
3. Cómo la cadena modela procesos reales de escalamiento sin un gran bloque de condicionales.

## Ejecución

Ejecutar `MainChainOfResponsibility.java`.
