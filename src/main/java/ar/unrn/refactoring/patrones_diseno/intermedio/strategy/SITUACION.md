# Refactorización: Replace Type Code with State/Strategy

## Situación Inicial

Un objeto `Pedido` cambia su comportamiento de cálculo de envío basándose en un código de tipo. A diferencia de la
herencia (Polimorfismo), aquí queremos poder cambiar la estrategia de envío en tiempo de ejecución.

## Objetivo

Desacoplar el cálculo del envío del objeto `Pedido` usando el patrón Strategy.

## Pasos para el "Vivo"

1. Crear la interfaz `EstrategiaEnvio`.
2. Implementar `EnvioEstandar`, `EnvioExpress`, `EnvioInternacional`.
3. Agregar un campo `EstrategiaEnvio` a `Pedido`.
4. Delegar el cálculo a la estrategia.
