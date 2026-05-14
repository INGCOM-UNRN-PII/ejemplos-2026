# Patrón Observer (Nivel intermedio)

Este ejemplo sube la complejidad porque ya no hay un solo contexto cambiando algoritmo, sino un emisor coordinando a
varios receptores.

## Idea central

- `CanalNoticias` publica eventos.
- `ObservadorNoticia` define cómo reaccionan los suscriptores.
- `SuscriptorEmail` y `SuscriptorMovil` muestran dos respuestas distintas ante la misma noticia.

## Qué discutir en clase

1. Cómo el canal no necesita conocer detalles de email o push.
2. Cómo los observadores se agregan y quitan en tiempo de ejecución.
3. Cómo un mismo evento genera múltiples reacciones sin acoplar las clases.

## Ejecución

Ejecutar `MainObserver.java`.
