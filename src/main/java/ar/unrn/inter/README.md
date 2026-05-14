# Interdependencia

Este paquete muestra una escala didactica de **interdependencia entre modulos**, desde la peor forma de acoplamiento hasta la mas sana.

## Escala

1. [`contenido/`](./contenido/README.md) - una clase manipula detalles internos de otra.
2. [`global/`](./global/README.md) - varias clases dependen de estado global compartido.
3. [`control/`](./control/README.md) - una clase le dice a otra *como* trabajar por medio de flags o codigos de control.
4. [`datos/`](./datos/README.md) - una clase pasa solo los datos necesarios para colaborar.
5. [`mensajes/`](./mensajes/README.md) - una clase le pide a otra que haga su trabajo mediante mensajes de alto nivel.

## Idea central

La escala va de mayor a menor acoplamiento:

- **Contenido**: el peor caso.
- **Global**: comun pero riesgoso.
- **Control**: mejor que el global, pero todavia intrusivo.
- **Datos**: acoplamiento mas acotado.
- **Mensajes**: el ideal.
