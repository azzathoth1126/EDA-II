
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




/*CONSTRUCTOR MASTES*/

/*Este construcutor es muy parecido al constructor single, su diferencia 
es que el hilo que hace las actividades es el hilo maestro, en otras 
palabras es que el hilo maestro realiza la actividad*/

// Sintaxis
/*
    #pragma omp MASTES
    {

    }
*/



/*CLAUSULA NOWAIT*/

/*Esta cláusula permite quitar las barreras implícitas que tienen los 
constructores, como lo son for, single, sections, etc.. Quitar las 
barreras que no son necesarias ayudan a mejorar el desempeño del 
programa.*/