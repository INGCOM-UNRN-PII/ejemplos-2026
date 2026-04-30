# Refactorización: Rigidez

## Problemas Detectados
1. **Lógica Centralizada**: `GeneradorReporte` usa estructuras `if-else` basadas en tipos (PDF, CSV). Agregar un nuevo formato requiere modificar múltiples métodos, lo que hace al sistema rígido al cambio.
2. **Acoplamiento Físico**: `SistemaCaja` depende de un modelo específico de impresora, impidiendo el soporte para otros modelos sin reescribir la lógica de cobro.

## Refactorizaciones Sugeridas
- **Patrón Strategy / Polimorfismo**: Crear una interfaz `Reporte` con implementaciones como `ReportePDF` y `ReporteCSV`. El generador simplemente iterará sobre ellas.
- **Abstracción de Hardware**: Definir una interfaz `Impresora` para desacoplar la lógica de negocio del modelo físico del dispositivo.
