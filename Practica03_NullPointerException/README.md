# Práctica 03
## Modelado y Programación.

<div class=text-justify>

**Objetivo:** El objetivo de esta práctica es implementar adecuadamente los patrones Decorator y Adapter en la resolución del problema propuesto. La solución propuesta debe evitar caer en problemas de rigidez, fragilidad, inmovilidad, y viscosidad.

1. Menciona los principios de diseño esenciales de los patrones Decorator y Adapter. Menciona una desventaja de cada patrón.

2. Se te ha encargado implementar la solución a los siguientes puntos:

- El restaurante de baguettes WaySub tiene un menú personalizable para sus productos. En este menú, seleccionas el tipo de pan de la baguette y los ingredientes que va a tener. Dependiendo del tipo de pan y de cuantos ingredientes va a tener, se le va aumentando el precio. Los ingredientes son: pollo, pepperoni, jamón, lechuga, jitomate, cebolla, mostaza, catsup y mayonesa.
Se requiere que se imprima la descripción de la baguette en el ticket y el precio total. Los ingredientes pueden pedirse doble o triple, con lo cual la descripción del pedido los imprimirá el número de cantidades que se pidió, si se pide doble pepperoni se imprimirá “pepperoni, pepperoni” y también se le cobrará doble este ingrediente.

	Los precios de cada ingrediente (incluyendo al menos 3 tipos de panes) son a su elección. Los ingredientes no tienen que estar agrupados. Es posible que un cliente pida pollo, jamón, pollo, lechuga, pollo, etc. y el ticket debería imprimir los ingredientes en el orden que se pidieron, junto con su precio. El ticket debe ser lo más descriptivo posible.

- Luego del éxito del restaurante, decidieron absorber a la cadena de pizzas “Las pizzas de don cangrejo” y vender sus productos en la misma sucursal. Esta cadena de pizzas ya tiene su sistema para las pizzas, el cual tiene métodos que te dicen el tipo de ingrediente que tiene cada pizza, uno para el tipo de queso (cheddar o manchego), el tipo de carne (salchicha, jamón, pollo) y el tipo de masa (masa gruesa, masa delgada), además de un precio exacto de las pizzas. Para no enojar al dueño anterior, decidieron no mover ningún método de las pizzas, pero quieren que el ticket de compra sea estándar, por lo que cuando se compre una pizza también se quiere que se de la descripción y el precio. Sólo se venden 5 tipos de pizza fija (combinando el tipo de ingredientes descrito anteriormente a decisión de ustedes) y tampoco se van a agregar más por respeto al dueño original.

- Para la prueba, realiza un main interactivo en el que primero te pregunte si quieres una baguette o una pizza. En el caso de la baguette te deje agregar tantos ingredientes como quieras hasta que le digas que está lista. En el caso de las pizzas te de la lista de las pizzas con sus precios y sólo te deje elegir una. Al final debe imprimir el ticket con la descripción del platillo seleccionado como se describe arriba.

Realiza los diagramas de clase necesarios y agregalos como imagen en la carpeta de entrega.

Sigan los lineamientos para la entrega de prácticas.

## Evaluación:
- 20% Implementación de cada patrón (en total 40%)
- 10% Parte teórica
- 10% Funcionamiento correcto
- 40% Diagramas (se califica que concuerden con la implementación y sean correctos)

