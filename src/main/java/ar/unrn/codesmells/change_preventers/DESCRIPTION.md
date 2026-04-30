# Code Smells: Change Preventers

Estos olores significan que si necesitas cambiar algo en un lugar, tienes que hacer muchos cambios en otros lugares
también.

- **Divergent Change**: Una misma clase se modifica frecuentemente por razones muy distintas (violación de SRP).
- **Shotgun Surgery**: Un solo cambio de lógica requiere pequeñas modificaciones en una gran cantidad de clases
  diferentes.
- **Parallel Inheritance Hierarchies**: Cada vez que creas una subclase para una clase, te ves obligado a crear una
  subclase para otra clase.
