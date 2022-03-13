
/**
 * Clase principal del proyecto.
 * Esta clase realizara las suscripciones y cobros durante los 12 meses que se requiere.
 * @author Adrian Aguilera Moreno     - Aguiler450
 * @author Rosas Franco Diego Angel   - shikitimiau
 * @author Marco Antonio Rivera Silva - DONMARCORS
 * @version  1.0 - 12/03/2022
 */
public class Practica01{
        public static void main(String[] args) {
        // ========================================== CREACION DE SERVICIOS ==========================================
        Memeflix memeflix = new Memeflix("Pronto tendremos recomendaciones para ti","Bienvenido a Memeflix","Bienvenido de vuelta a Memeflix");
        Thisney thisney = new Thisney("Pronto tendremos recomendaciones para ti","Bienvenido a Thisney","Bienvenido de vuelta a Thisney");
        Momazon momazon = new Momazon("Pronto tendremos recomendaciones para ti","Bienvenido a Momazon","Bienvenido de vuelta a Momazon");
        Spootify spootify = new Spootify("Pronto tendremos recomendaciones para ti","Bienvenido a Spootify","Bienvenido de vuelta a Spootify");
        HVOMax hvomax = new HVOMax("Pronto tendremos recomendaciones para ti","Bienvenido a HVOMax","Bienvenido de vuelta a HVOMax");

        //======== Recomendaciones ======
        hvomax.agregar_recomendacion("Cloudfoaem con su nuevo estreno inedito Las tortugas espaciales, solo por HVOMax.");                                                      
        hvomax.agregar_recomendacion("Este mes por HVOMax, AMECHI, una combinación entre rivales.");                                                                            
        hvomax.agregar_recomendacion("Royer deneiro, este mes vuelve a HVOMax, con los cuentos del don Manuel.");                                                                   
        hvomax.agregar_recomendacion("El de la pierna izquierda, una pelicula basada en hechos reales, solo por HVOMax.");                                                          
        hvomax.agregar_recomendacion("Doctor antepus, la verdadera historia detras la araña roja, solo en HVOMax.");                                                            
        hvomax.agregar_recomendacion("El clon de la Vero, una historia de computologos.");                                                                                      
        hvomax.agregar_recomendacion("Este mes, en HVOMax; La tarantula negra, una version aterradora.");                                                                       
        hvomax.agregar_recomendacion("Llega a HVOMax, el Chems Arturo, una historia de sufrimiento y desolacion por parte de sus disipulos, este mes, no se lo pierda.");           
        hvomax.agregar_recomendacion("Todo el mes, por HVOMax, La selva eterna, una pelicula para disfrutar en familia.");                                                      
        hvomax.agregar_recomendacion("Se recomienda al publico en general, La consulta, un proceso de no acabar. Solo por HVOMax.");                                            
        hvomax.agregar_recomendacion("Boris cotson, Valvimir Patin, Jonson Bonden, Juntos hasta la muerte, solo en HVOMax.");                                                   
        hvomax.agregar_recomendacion("Este mes, no te lo puedes perder La ultima y nos vamos, por HVOMax.");

        spootify.agregar_recomendacion("Swetttt gren, este mes suena lo mejor de Spootify.");                                                                                         
        spootify.agregar_recomendacion("Este mes, suena por Spotify Los sonidos del mas haya, una de las mejores rolas que no debes perderte.");                                  
        spootify.agregar_recomendacion("Escucha todo el mes el album: Power Ide desde tu cuenta Spootify.");                                                                      
        spootify.agregar_recomendacion("Los manes de blanco, y su nuevo album que puedes encontrar en la plataforma de Spootify.");                                               
        spootify.agregar_recomendacion("Todo el mes puedes consultar el nuevo album de Adela en la plataforma de Spootify.");                                                         
        spootify.agregar_recomendacion("El rey de la cumbia y su Macareno y el meneo, llegan a Spootify ya!.");                                                                   
        spootify.agregar_recomendacion("Escucha hoy, La mano del rey conga, esto y mas este mes en Spootify.");                                                                   
        spootify.agregar_recomendacion("Durante todo el mes puedes consultar El puntito mamalón y los rolones que tiene.");                                                       
        spootify.agregar_recomendacion("El mes que llega con el rolón The end of the world in the black, no te lo puedes perder.");                                                   
        spootify.agregar_recomendacion("Escucha hoy Memin patin, con su nuevo cumbión loco.");                                                                                    
        spootify.agregar_recomendacion("La gaviota y el mar, una produccion inedita, lista para ti este mes por Spootify.");                                                          
        spootify.agregar_recomendacion("El baritono entolao, una producción del rey zoptokzin, solo por Spootify.");

        momazon.agregar_recomendacion("Durante todo el mes, escucha el nuevo album de Norvonda, solo por Mamazon.");                                                              
        momazon.agregar_recomendacion("Los Zopilotes amarillos, nuevo documental en Mamazon, como inicio este equipo en el deporte y hasta donde ha llegado.");                   
        momazon.agregar_recomendacion("Ve durante todo el mes la serie Toluca Sort, una ordenacion tipo mexicana que te dejara con más dudas que respuestas, esto desde tu cuenta Mamazon.");                                                                                                                                                                      
        momazon.agregar_recomendacion("Durante este mes puedes consultar la trilogia Muñecos con ralladuras, una pelicula que te recordara tu infancia.");                        
        momazon.agregar_recomendacion("Chupky, nuevo estreno durante este mes desde tu cuenta Mamazon.");                                                                          
        momazon.agregar_recomendacion("Durante todo el mes puedes ver el documental La manzana  que cambio la fisica, esto desde Mamazon.");                                      
        momazon.agregar_recomendacion("Este mes, desde Mamazon, no te pierdas el estreno de La morza que juega ajedrez, una pelicula inspirada en una historia real.");           
        momazon.agregar_recomendacion("Puedes ver a partir de este mes la serie documental La verdad de los gobiernos, una critica en contra del asesinato de los floristas en Mexico.");                                                                                                                                                                          
        momazon.agregar_recomendacion("201 perros pastor, pelicula de estreno en Mamazon, esto y mas durante el mes.");                                                           
        momazon.agregar_recomendacion("Nueva serie dirigida por Mamazon puede interesarte, Ya wey, una serie que muestra a un escritor de codigo al que lo han puesto a escribir \recomendaciones de una manera desesperada por terminar.");                                                                                                                        
        momazon.agregar_recomendacion("Este mes, por Mamazon, una historia acerca de una bruja en el bosque, Gregel y Hapser, la historia detras de la realidad.");               
        momazon.agregar_recomendacion("Nueva pelicula americana por Mamazon; La invasion a Polonia, este puede ser una de las peliculas mas aclamadas por la comunidad de Ciencias.");

        thisney.agregar_recomendacion("El oso amarillo que queria comer miel, capitulos nuevos todo el mes, esto podría ser de su interes con su cuenta Thisney.");               
        thisney.agregar_recomendacion("La tiburoncita, este mes por Thisney, solo con tu cuenta plus.");                                                                          
        thisney.agregar_recomendacion("Se recomienda discresion: Los mimson, nueva serie de las dominadas por Thisney.");                                                         
        thisney.agregar_recomendacion("Nueva serie SatMar, serie patrocinada y dirigida por Thisney.");                                                                           
        thisney.agregar_recomendacion("Para todas las princesaas y principes de casa, este mes por Thisney tenemos Negra neves.");                                                
        thisney.agregar_recomendacion("Camberlen, nueva serie por Thisney, para todas las adas que nos ven durante este mes.");                                                   
        thisney.agregar_recomendacion("Este mes puedes consultar por Thisney la nueva pelicula La quemacienta, pelicula para los consentidos de la casa.");                       
        thisney.agregar_recomendacion("La manga y el magamondo, de estreno por Thisney durante todo el mes desde tu cuenta plus.");                                               
        thisney.agregar_recomendacion("Nueva pelicula para Thisney, accede desde tu cuenta a Toro, pelicula del mes.");                                                           
        thisney.agregar_recomendacion("Puedes ver la pelicula de estreno Cabra miel, solo por Thisney, ¡accede desde tu cuenta ya!.");                                            
        thisney.agregar_recomendacion("Una aventura de reinas, nuevo estreno para Thisney durante todo el mes.");                                                                 
        thisney.agregar_recomendacion("Los chivas y el condor, nueva serie musical en Thisney.");

        memeflix.agregar_recomendacion("Puedes ver la pelicula de estreno El pincipe pantera durante todo este mes, con su cuenta de Memeflix.");                                 
        memeflix.agregar_recomendacion("Durante este mes puedes consultar la serie Hary Peter y la roca de la filosofia con tu cuenta de Memeflix.");                             
        memeflix.agregar_recomendacion("Tenemos el estreno de El rey ballena, durante todo el mes, accede a este estreno con tu cuenta de Memeflix.");                            
        memeflix.agregar_recomendacion("¡Ya disponible!, la ultima temporada del Señor de las espadas, consulta ya desde tu cuenta Memeflix.");                                   
        memeflix.agregar_recomendacion("Este mes pudes ver la Trigresa verde, solo con tu cuenta Memeflix.");                                                                     
        memeflix.agregar_recomendacion("¡Puedes consultar ya!, la serie Alis en los bosques encantados, esto desde tu cuenta de Memeflix.");                                      
        memeflix.agregar_recomendacion("Ahora puedes ver la Ultima vida de un luchador desde cuenta de servicios Memeflix.");                                                     
        memeflix.agregar_recomendacion("Es hoy!, es hoy!, El misterio de la cobra, solo por Memeflix.");                                                                          
        memeflix.agregar_recomendacion("Puedes ver la serie de estreno La choza de vidrio, una serie de miedo, solo por memeflix.");                                              
        memeflix.agregar_recomendacion("Este mes solo por Memeflix puedes consultar la gran Cortina del arriero, serie original de Memeflix.");                                   
        memeflix.agregar_recomendacion("Librando a la ballena azul, serie recomendada para usted durante este mes.");                                                             
        memeflix.agregar_recomendacion("Las aventuras de dos compadres y uno de gorra, una serie patrocinada por Memeflix, ya disponible con tu cuenta.");

        // ========================================== CREACION DE USUARIOS ===========================================
        Usuario alicia = new Usuario("Alicia", 15000f);
        Usuario bob = new Usuario("Bob", 2400f);
        Usuario cesar = new Usuario("Cesar", 5000f);
        Usuario diego = new Usuario("Diego", 9000f);
        Usuario erika = new Usuario("Erika", 10000f);
        Usuario fausto = new Usuario("Fausto", 5000f);

        // =========================================== PRIMER MENSUALIDAD ============================================
        /**
         * Alicia contrata todos los servicios con la version mas cara disponible desde el primer dia.
         */
        alicia.contratar_servicio("Spotify Premium", spootify, "alcia@ciencias.unam.mx");
        alicia.contratar_servicio("Memeflix Cuatro Dispositivos", memeflix, "alcia@ciencias.unam.mx");
        alicia.contratar_servicio("Momazon Premium", momazon, "alcia@ciencias.unam.mx");
        alicia.contratar_servicio("Thisney Normal", thisney, "alcia@ciencias.unam.mx");
        alicia.contratar_servicio("HVOMax Normal", hvomax, "alcia@ciencias.unam.mx");
        
        /**
         * Bob creyendo que puede contratar todos los servicios contrata la version mas cara disponible
         */
        bob.contratar_servicio("Spotify Premium", spootify, "bob@ciencias.unam.mx");
        bob.contratar_servicio("Memeflix Cuatro Dispositivos", memeflix, "bob@ciencias.unam.mx");
        bob.contratar_servicio("Momazon Premium", momazon, "bob@ciencias.unam.mx");
        bob.contratar_servicio("Thisney Normal", thisney, "bob@ciencias.unam.mx");
        bob.contratar_servicio("HVOMax Normal", hvomax, "bob@ciencias.unam.mx");

        /**
         * Cesar contrata Thisney y HVOMax
         */
        cesar.contratar_servicio("Thisney Normal", thisney, "cesar@ciencias.unam.mx");
        cesar.contratar_servicio("HVOMax Normal", hvomax, "cesar@ciencias.unam.mx");

        /**
         * Diego se suscribe HVOMax, Momazon Premium y Spootify Normal (Gratis)
         */
        diego.contratar_servicio("HVOMax Normal", hvomax, "diego@ciencias.unam.mx");
        diego.contratar_servicio("Momazon Premium", momazon, "diego@ciencias.unam.mx");
        diego.contratar_servicio("Spotify Normal", spootify, "diego@ciencias.unam.mx");

        /**
         * Erika se suscribe a Memeflix para 4 dispositivos, Spootify Normal (Gratis) y
         * HVOMax.
         */
        erika.contratar_servicio("Memeflix Cuatro Dispositivos", memeflix, "erika@ciencias.unam.mx");
        erika.contratar_servicio("Spootify Normal", spootify, "erika@ciencias.unam.mx");
        erika.contratar_servicio("HVOMax Normal", hvomax, "erika@ciencias.unam.mx");

        /**
         * Fausto contrata Thisney y HVOMax.
         */
        fausto.contratar_servicio("Thisney Normal", thisney, "fausto@ciencias.unam.mx");
        fausto.contratar_servicio("HVOMax Normal", hvomax, "fausto@ciencias.unam.mx");

        /**
         * Los Servicios realizan el cobro de sus usuarios.
         */

        /**
         * PRIMER MES: Sin cambios.
         */
        memeflix.notificar();
        spootify.notificar();
        thisney.notificar();
        hvomax.notificar();
        momazon.notificar();

        /**
         * SEGUNDO MES: Sin cambios.
         */

        memeflix.notificar();
        spootify.notificar();
        thisney.notificar();
        hvomax.notificar();
        momazon.notificar();

        /** 
         * TERCER MES:
         * Despues de 3 meses Fausto cancela sus suscripciones y contrara
         * Memeflix para 1 dispositivo
         * 
         * Despues de 3 meses Bob cancela Thisney+ v HVOMax
         * 
         * Despues de 3 meses Erika cancela HVOMax y contrata Thisney
         */

        memeflix.notificar();
        spootify.notificar();
        thisney.notificar();
        hvomax.notificar();
        momazon.notificar();

        fausto.cancelar_suscripcion(fausto.buscar_suscripcion("fausto@ciencias.unam.mx", "Thisney Normal"));
        fausto.cancelar_suscripcion(fausto.buscar_suscripcion("fausto@ciencias.unam.mx", "HVOMax Normal"));
        fausto.contratar_servicio("Memeflix Un Dispositivo", memeflix, "fausto@ciencias.unam.mx");

        bob.cancelar_suscripcion(bob.buscar_suscripcion("bob@ciencias.unam.mx", "Thisney Normal"));
        bob.cancelar_suscripcion(bob.buscar_suscripcion("bob@ciencias.unam.mx", "HVOMax Normal"));

        erika.cancelar_suscripcion(erika.buscar_suscripcion("erika@ciencias.unam.mx", "HVOMax Normal"));
        erika.contratar_servicio("Thisney Normal", thisney, "erika@ciencias.unam.mx");

        /**
         * CUARTO MES:
         * 
         * Bob en el 4to mes da de baja Memeflix y Momazon
         */

        bob.cancelar_suscripcion(bob.buscar_suscripcion("bob@ciencias.unam.mx", "Memeflix Cuatro Dispositivos"));
        bob.cancelar_suscripcion(bob.buscar_suscripcion("bob@ciencias.unam.mx", "Momazon Premium"));
        
        memeflix.notificar();
        spootify.notificar();
        thisney.notificar();
        hvomax.notificar();
        momazon.notificar();

        /**
         * QUINTO MES:
         * Fausto contrata nuevamente Thisney y HVOMax
         */

        fausto.contratar_servicio("Thisney Normal", thisney, "fausto@ciencias.unam.mx");
        fausto.contratar_servicio("HVOMax Normal", hvomax, "fausto@ciencias.unam.mx");

        memeflix.notificar();
        spootify.notificar();
        thisney.notificar();
        hvomax.notificar();
        momazon.notificar();

        /**
         * SEXTO MES:
         * Despues de 5 meses Bob cancela Memeflix y Momazon
         * 
         * Para el 6to mes Fausto cancela todas sus suscripciones.
         * 
         * Para el 6to Mes Erika cancela todos sus servicios.
         * 
         * Para el 6to mes Diego se suscribe a thisney
         */
        fausto.cancelar_suscripcion(fausto.buscar_suscripcion("fausto@ciencias.unam.mx", "Thisney Normal"));
        fausto.cancelar_suscripcion(fausto.buscar_suscripcion("fausto@ciencias.unam.mx", "HVOMax Normal"));
        fausto.cancelar_suscripcion(fausto.buscar_suscripcion("fausto@ciencias.unam.mx", "Memeflix Un Dispositivo"));

        erika.cancelar_suscripcion(erika.buscar_suscripcion("erika@ciencias.unam.mx", "Thisney Normal"));
        erika.cancelar_suscripcion(erika.buscar_suscripcion("erika@ciencias.unam.mx", "Memeflix Cuatro Dispositivos"));
        erika.cancelar_suscripcion(erika.buscar_suscripcion("erika@ciencias.unam.mx", "Spootify Normal"));

        diego.contratar_servicio("Thisney Normal", thisney, "diego@ciencias.unam.mx");

        memeflix.notificar();
        spootify.notificar();
        thisney.notificar();
        hvomax.notificar();
        momazon.notificar();

        /**
         * SEPTIMO MES:
         * Para el 7mo mes Cesar contrata Spootify Premium
         * Para el 7mo mes Diego se suscribe a Memeflix 1 Dispositivo
         */

        cesar.contratar_servicio("Spootify Premium", spootify, "cesar@ciencias.unam.mx");
        diego.contratar_servicio("Memeflix Un Dispositivo", memeflix, "diego@ciencias.unam.mx");
        diego.cambiar_suscripcion(diego.buscar_suscripcion("diego@ciencias.unam.mx", "Spootify Normal"), "Spootify Premium");

        memeflix.notificar();
        spootify.notificar();
        thisney.notificar();
        hvomax.notificar();
        momazon.notificar();

        /**
         * OCTAVO MES
         * Sin cambios
         */

        memeflix.notificar();
        spootify.notificar();
        thisney.notificar();
        hvomax.notificar();
        momazon.notificar();

        /**
         * NOVENO MES
         * SIN CAMBIOS
         */

        memeflix.notificar();
        spootify.notificar();
        thisney.notificar();
        hvomax.notificar();
        momazon.notificar();

        /**
         * DECIMO MES
         */
        erika.contratar_servicio("Thisney Normal", thisney, "erika@ciencias.unam.mx");
        erika.contratar_servicio("HVOMax Normal", hvomax, "erika@ciencias.unam.mx");
        erika.contratar_servicio("Momazon Premium", momazon, "erika@ciencias.unam.mx");

        memeflix.notificar();
        spootify.notificar();
        thisney.notificar();
        hvomax.notificar();
        momazon.notificar();

        /**
         * DECIMO PRIMER MES
         * Sin cambios
         */

        memeflix.notificar();
        spootify.notificar();
        thisney.notificar();
        hvomax.notificar();
        momazon.notificar();

        /**
         * DECIMO SEGUNDO MES
         * Sin cambios.
         */

        memeflix.notificar();
        spootify.notificar();
        thisney.notificar();
        hvomax.notificar();
        momazon.notificar();
    }
}