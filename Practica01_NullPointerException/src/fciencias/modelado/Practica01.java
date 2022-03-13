//package src.fciencias.modelado;

public class Practica01{
    
    public static void main(String[] args) {
        // ========================================== CREACION DE SERVICIOS ==========================================
        Memeflix memeflix = new Memeflix("Pronto tendremos recomendaciones para ti","Bienvenido","Bienvenido de vuelta");
        Thisney thisney = new Thisney("Pronto tendremos recomendaciones para ti","Bienvenido","Bienvenido de vuelta");
        Momazon momazon = new Momazon("Pronto tendremos recomendaciones para ti","Bienvenido","Bienvenido de vuelta");
        Spootify spootify = new Spootify("Pronto tendremos recomendaciones para ti","Bienvenido","Bienvenido de vuelta");
        HVOMax hvomax = new HVOMax("Pronto tendremos recomendaciones para ti","Bienvenido","Bienvenido de vuelta");

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
        erika.contratar_servicio("Spotify Normal", spootify, "erika@ciencias.unam.mx");
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

        bob.cancelar_suscripcion(bob.buscar_suscripcion("bob@ciencias.unam.mx", "Memeflix Un Dispositivo"));
        bob.cancelar_suscripcion(bob.buscar_suscripcion("bob@ciencias.unam.mx", "Momazon Normal"));
        
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

        erika.cancelar_suscripcion(fausto.buscar_suscripcion("erika@ciencias.unam.mx", "Thisney Normal"));
        erika.cancelar_suscripcion(fausto.buscar_suscripcion("erika@ciencias.unam.mx", "Memeflix Cuatro Dispositivos"));
        erika.cancelar_suscripcion(fausto.buscar_suscripcion("erika@ciencias.unam.mx", "Spootify Normal"));

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
        cesar.contratar_servicio("Memeflix Un Dispositivo", memeflix, "diego@ciencias.unam.mx");

    }
}