# Refactorización: Move Method

## Situación Inicial
La clase `Cuenta` tiene un método `calcularInteres()` que depende casi totalmente de los datos de la clase `TipoCuenta`. Esto es un "Feature Envy" (envidia de características).

## Objetivo
Mover el método a la clase que realmente posee los datos y la lógica para reducir el acoplamiento y mejorar la cohesión.

## Pasos para el "Vivo"
1. Copiar el método `calcularInteres()` a `TipoCuenta`.
2. Adaptar los parámetros (pasar lo que sea necesario de `Cuenta`).
3. En `Cuenta`, delegar la llamada al nuevo método en `TipoCuenta` o eliminar el viejo si es posible.
