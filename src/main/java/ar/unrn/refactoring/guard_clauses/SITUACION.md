# Refactorización: Guard Clauses

## Situación Inicial

Un método tiene múltiples niveles de anidamiento `if-else`, lo que hace que la "lógica principal" quede oculta en el
centro.

## Objetivo

Usar cláusulas de guarda para manejar casos especiales al principio del método y dejar la lógica principal sin
anidamiento.
