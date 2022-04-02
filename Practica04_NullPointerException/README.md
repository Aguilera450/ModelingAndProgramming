# Práctica 04.
## Modelado y Programación.
**Objetivo:** El objetivo de esta práctica es implementar adecuadamente alguno de los patrones Factory, Abstract Factory, o Builder en la resolución del problema propuesto.  La solución propuesta debe evitar caer en problemas de rigidez, fragilidad, inmovilidad, y viscosidad.

1. Menciona los principios de diseño esenciales de los patrones Factory, Abstract Factory y Builder. Menciona una desventaja de cada patrón.
2. Se te ha encargado implementar una solución para el siguiente problema:

El Imperio Galáctico te ha pedido diseñar un sistema que pueda crear naves espaciales. Las naves están compuestas de: 

- Sistema de propulsión: Viaje intercontinental, Viaje interplanetario, Viaje intergaláctico
- Blindaje: Simple, Reforzado, Fortaleza
- Cabina: 1 piloto, Tripulación pequeña, Ejército
- Armas:  Láser simple, Misiles de plasma, Láser destructor de planetas

Cada componente tiene un nombre, descripción, y precio. Además, cada componente afecta las cualidades específicas de la nave: Ataque, Defensa, Velocidad, Peso, y Precio. Estos valores deben asignarse como lo prefieras, es decir que tú decides cuánto y cómo afecta cada componente al producto final.

El sistema debe permitirle al usuario armar una nave con las partes que desee. Al inicio, deberá preguntarle su presupuesto. Posteriormente se le mostrarán los componentes disponibles en el sistema para cada parte de la nave (por categoría). El usuario elegirá los componentes deseados y se le mostrará la nave final, con todos los componentes y el precio. Dependiendo del costo final de la nave y del presupuesto inicial, se le mostrará un mensaje al usuario “Tu nave está lista para recoger, estas son sus características, paga en la caja la cantidad de $n” en caso de que su presupuesto le alcance, o “El costo de tu nave sobrepasa tu presupuesto. ¿Deseas diseñar otra nave o ver nuestro catálogo?” en caso de que no tenga dinero suficiente. Si decide la primera opción, el menú de componentes se despliega nuevamente. Si decide la segunda opción, se debe desplegar 3 opciones de naves que el sistema tiene de manera fija:

- Nave individual de combate.
- Nave militar de transporte.
- Base espacial de guerra.

La combinación de componentes para estas naves queda a su elección. Al elegir una nave, se desplegarán los componentes y el precio final de la nave. Si aún no le alcanza para una de estas naves, debe tener una opción para salir y acabar con la simulación. No es necesaria una opción para modificar las naves existentes.

Para la prueba se requiere de un menú interactivo con las opciones mencionadas.

Realiza los diagramas de clase necesarios y agregalos como imagen en la carpeta de entrega.

Sigan los lineamientos para la entrega de prácticas. El documento estará en el classroom. Además, deberán incluir una breve justificación del patrón que decidieron usar para resolver el problema dentro del archivo README.

## Evaluación: 
- 10% Parte teórica
- 10% Funcionamiento correcto
- 40% Diagramas (se califica que concuerden con la implementación y sean correctos)
- 40% Implementación de un patrón


