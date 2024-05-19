
/*CONSTRUCTOR SINGLE*/

/*Este constructor se usar cuando quieres que un solo hilo haga una 
tarea, mientras los demas hilos esperan, un ejemplo serie la entrada 
y salida de datos*/

//Ejemplo y sintaxis de single
void ejemplo(){

    #pragma imp parallel
    {
        todosRealizanUnasActividades();
        #pragma omp single
        {
            ActividadE/S();
            // Hilos esperan
        }
        RelizarMasActividades();
    }
}