# Refactorización: Fragilidad

## Problemas Detectados

1. **Estado Global Compartido**: El uso de variables estáticas en `ConfiguracionGlobal` permite que un módulo (
   `ModuloA`) afecte silenciosamente el comportamiento de otro (`ModuloB`), causando fallos inesperados.
2. **Herencia Frágil**: La dependencia de la clase `Derivada` en el orden de ejecución interno de la clase `Base`. Un
   cambio en la superclase rompe la subclase.

## Refactorizaciones Sugeridas

- **Inyección de Dependencias**: Eliminar el estado global estático. Pasar las configuraciones necesarias como
  parámetros o mediante objetos de configuración inyectados.
- **Composición sobre Herencia**: Usar el patrón Template Method con cautela o, preferiblemente, usar composición para
  evitar la fragilidad de la jerarquía de clases.
