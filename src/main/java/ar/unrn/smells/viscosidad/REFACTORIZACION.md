# Refactorización: Viscosidad

## Problemas Detectados
1. **Viscosidad de Diseño**: El uso de variables estáticas como "atajos" para evitar pasar datos a través de múltiples capas. Es más fácil hacer el "hack" que modificar la arquitectura.
2. **Falta de Abstracciones**: La necesidad de manejar detalles de bajo nivel (apertura/cierre de archivos) en cada punto de log en lugar de usar un servicio centralizado.

## Refactorizaciones Sugeridas
- **Refactorización de Pasaje de Parámetros**: Aunque sea costoso inicialmente, pasar las dependencias por constructor asegura un diseño limpio y testeable a largo plazo.
- **Uso de Facades o Wrappers**: Crear un servicio de Logging que oculte la complejidad del manejo de archivos, permitiendo que el resto del sistema sea "fluido" y fácil de usar correctamente.
