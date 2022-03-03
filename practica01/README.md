# Práctica 01.
## Modelado y programación.

Objetivo: El objetivo de esta práctica es implementar adecuadamente los patrones Strategy y Observer en la resolución del problema propuesto. Su solución debe estar integrada en un solo diagrama de clases así como una sola implementación.

Menciona los principios de diseño esenciales del patrón Strategy y Observer. Menciona una desventaja de cada patrón.

Se te ha encargado implementar la siguiente simulación:

Alicia, Bob, César, Diego y Erika desean contratar los servicios de las siguientes compañías: Memeflix, Momazon Prime Video, Spootify, Thisney+ y HVO Max. La simulación representará un año en el que los usuarios probarán los servicios. Cada servicio contabiliza los meses que un cliente lleva pagando un plan y lo notifica cada mes (por ejemplo, debería decir “Alicia, llevas 4 meses usando Memeflix”). ***En caso de que un usuario cancele su suscripción en algún momento y posteriormente la renueve, deberá pagar desde el primer mes***. Las tarifas son las siguientes:

Memeflix cobra $120 para un sólo dispositivo, $170 para 2 dispositivos y $200 para 4 dispositivos. 
Momazon tiene una versión de usuario normal con un costo de $110 y una versión premium con un costo de $150. 
Spootify tiene una versión de usuario normal gratis y una versión premium de $80. 
Thisney+ tiene un costo de $130 para los primeros 3 meses, pero a partir del cuarto mes sube la tarifa a $160.
HVO Max es gratis por los primeros 3 meses, pero a partir del cuarto mes sube su tarifa a $140.

Cuando un usuario se suscribe a un servicio, se le envía un mensaje de bienvenida. Si el usuario se ha suscrito nuevamente luego de haber cancelado su suscripción, se le recibirá con un mensaje “Bienvenido de vuelta <Cliente>”.

Una vez al mes, los servicios cobran su monto dependiendo de la versión contratada y además, envían una recomendación para el cliente (por ejemplo un show, una película, un disco, un video, etc.). Se espera que las recomendaciones cambien mes con mes. Las recomendaciones específicas pueden elegirlas ustedes.

Todos los usuarios tienen una cuenta de banco que efectúa los pagos de forma automatizada y centralizada. El sistema de cobro es único (por servicio), por lo que deberá cambiar su forma de cobro dependiendo de la versión del servicio del cliente. Si le llega un cobro de Memeflix deberá decidir cuánto dinero cobrar. Además, se le notificará al usuario con un mensaje que especifique lo que está pagando. (por ejemplo: Alicia paga $180 por el servicio de Memeflix para 4 dispositivos). Este mensaje es único e individual para cada servicio. Al iniciar un mes el sistema debe recibir una petición del servicio y descontar de su cuenta de banco la cantidad requerida en el orden en que llegan los cobros. El orden en que llegan los cobros depende de ustedes.

Los clientes pueden decidir cancelar la suscripción a un servicio en cualquier momento y volverse a suscribir más adelante, además de poder cambiar la versión de su suscripción (por ejemplo, cambiar de la versión normal de Momazon a una premium). Para esta práctica pueden suponer que un usuario puede darse de baja o de alta en cualquier momento del mes. Además, el sistema de cobro empezará a cobrar el mes desde que se da de alta. Dado que la simulación no mostrará cada día, pueden mostrar que se cobra todo el mes. Es decir, NO es necesario decir explícitamente que se dio de alta el día 5 de octubre, por ejemplo. 

La cuenta de los meses que el servicio lleva contratado debe guardarse aunque se cancele la suscripción. De esta forma, se evita que un usuario cobre los meses gratuitos múltiples veces.

Cada cliente tiene una cantidad limitada de dinero con la que paga el servicio durante esta simulación. Si un cliente no puede pagar el servicio pierde su suscripción y deja de recibir notificaciones. 

Al perder o cancelar la suscripción, se le debe notificar al cliente con un mensaje (por ejemplo: “Lamentamos que dejes el servicio <Cliente>”).

Alicia, al tener dinero suficiente, contrata todos los servicios con la versión más cara disponible desde el primer día. Inicia la simulación con $15000.
Bob, creyendo que puede pagar todos los servicios, contrata la versión más cara disponible. Después de 3 meses, se da de baja en Thisney+ y HVO Max.  El cuarto mes da de baja Memeflix y Momazon. Además, inicia con $2400.
César inicia con $5000 y contrata Thisney+ y HVO Max. Para el séptimo mes, contrata Spootify en su versión premium.
Diego se suscribe a HVO Max, Momazon Prime en su versión premium, y Spootify en su versión normal. En el sexto mes, se suscribe a Thisney+. Para el séptimo mes se suscribe a Memeflix para un dispositivo, cambia a la versión premium de Spootify, y cancela su suscripción a Momazon. Él inicia con $9000.
Erika se suscribe a Memeflix para 4 dispositivos, Spootify en su versión normal, y HVO Max. Para el tercer mes cancela la suscripción de HVO Max y contrata Thisney+. En el sexto mes, cancela todos sus servicios. Para el décimo mes ella contrata Momazon en su versión premium, HVO Max y Thisney+ nuevamente. Ella inicia con $10000.
Fausto contrata Thisney+ y HVO Max. Al pasar tres meses cancela sus suscripciones y contrata Memeflix para 1 dispositivo. El quinto mes contrata nuevamente Thisney+ y HVO Max. El sexto mes cancela sus suscripciones nuevamente. Él empieza con $5000.

El formato de la salida del programa depende de ustedes, pero deben verse todas las transacciones hechas en cada día y para cada cliente. Puedes hacer que se imprima en terminal o que se guarde en un archivo txt.

Realiza los diagramas de clase necesarios y agregalos como imágen en la carpeta de entrega.

Sigan los lineamientos para la entrega de prácticas. El documento estará en el classroom.

Evaluación

20% Implementación de cada patrón (en total 40%).
10% Parte teórica.
10% Funcionamiento correcto.
40% Diagramas (se califica que concuerden con la implementación y sean correctos).

NOTA: Si el código no está comentado en formato Javadoc, como se indica en los lineamientos, se descontarán 10 puntos de 100.

***Nota extra: Es posible que esta línea genere confusión por la redacción. Consideren que si un usuario vuelve a contratar un servicio después de haberlo usado y cancelado, NO se renueva su cuenta de meses. Se debe considerar la misma cuenta. Hay Servicios que tienen descuentos y esta regla afecta la ejecución del sistema.
