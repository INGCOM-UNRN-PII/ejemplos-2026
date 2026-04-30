# Refactorización: Inseparabilidad

## Problemas Detectados
1. **Lógica de Negocio en la UI**: El cálculo del IVA está dentro de un manejador de eventos de la ventana, lo que impide reusar esa lógica en un sistema web o una API.
2. **Acoplamiento a Infraestructura**: La validación de usuarios depende de archivos específicos del sistema operativo (`/etc/passwd`), haciendo que el código sea imposible de mover a otros entornos (como Windows o la nube).

## Refactorizaciones Sugeridas
- **Separación de Capas (MVC)**: Mover la lógica de cálculo a una clase de dominio (ej: `CalculadoraIVA`) que sea independiente de Swing.
- **Patrón Repository**: Abstraer el acceso a los datos de usuario mediante una interfaz, permitiendo diferentes implementaciones según el entorno (Base de datos, Memoria, Archivo).
