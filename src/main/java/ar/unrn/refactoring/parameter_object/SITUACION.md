# Refactorización: Introduce Parameter Object

## Situación Inicial
Tenemos un método de búsqueda que recibe una larga lista de parámetros (rango de fechas, filtros, flags). Estos parámetros suelen viajar juntos por varios métodos.

## Objetivo
Agrupar los parámetros relacionados en un solo objeto (Data Class o Record) para simplificar la firma del método y mejorar la cohesión.

## Pasos para el "Vivo"
1. Identificar los parámetros que "viajan juntos".
2. Crear un `record` o clase `RangoFechas` (u otro nombre apropiado).
3. Reemplazar los parámetros individuales por el nuevo objeto.
