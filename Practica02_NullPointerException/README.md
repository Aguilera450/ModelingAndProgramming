# Práctica 01.
## Modelado y programación.

**Objetivo:** El objetivo de esta práctica es implementar adecuadamente los patrones State, Template e Iterator en la resolución del problema propuesto. La solución propuesta debe evitar caer en problemas de rigidez, fragilidad, inmovilidad, y viscosidad.

1. Menciona los principios de diseño esenciales del patrón State, Template e Iterator.
Menciona una desventaja de cada patrón.

2. Se te ha encargado implementar el siguiente problema:

* El restaurante McBurguesas te ha pedido programar un robot que servirá como
mesero y cocinero. Si el prototipo cumple con los requerimientos y las pruebas, los
producirán en masa para toda su franquicia.	   
	   - El robot debe estar encendido todo el tiempo esperando a que un cliente lo active, pero si no está trabajando puede estar suspendido.
	   - Al activarse, el robot empieza a caminar hasta llegar a la mesa del cliente.
	   - Una vez que se encuentra frente al cliente debe leerle todo el menú del restaurante.
	   - El cliente elige lo que quiere comer y el robot se pone a cocinar el platillo.
	   - Al terminar de cocinar, entrega la comida y vuelve a suspender hasta que otro cliente lo activa.
	   - Si el robot está **suspendido** no puede hacer otra cosa más que activarse. Si el robot está **caminando** puede **suspenderse** de nuevo, pero no puede **cocinar**, pues sería peligroso para los clientes. Si el robot está **atendiendo** a un cliente no puede **suspenderse** ni ponerse a caminar, solamente empezará a **cocinar** hasta tener la orden del cliente. Si está **cocinando**, ya no podrá tomar otra orden hasta terminar el platillo y no se pondrá a **caminar** mientras **cocina**.

* 

	   