# pc1-eduardosalas1
pc1-eduardosalas1 created by GitHub Classroom
## Requerimientos funcionales
1. EPIC: Como profesor de un curso podré registrar en la aplicación el título y enlace

    de cada clase síncrona.
    
  a. El título y el enlace de cada clase deberá ser validado y notificado a: CE2A,
  
    DGA, Counter Docentes y Counter Alumnos.
    
  b. La validación de la descripción corresponde al siguiente formato:
  
    SEMESTRE CODIGO IDIOMA CURSO, SECCIÓN, SemanaNN, Profesor,
    
    MM/DD hh:mm-hh:mm Tipo
    
    Por ejemplo:
    
        2020-II CS2901 ES Ingeniería de Software I, 1, Semana05, Jesus Bellido,
        10/08 08:00-10:00 Laboratorio.
        
        2020-II CS2101 ES Teoría de la Computación, 1, Semana03, Juan Gutierrez,
         09/23 14:00-16:00 Laboratorio.
         
   c. La validación del enlace corresponde a una URL válida que empieza con
      “https://utec.zoom.us/rec/share/”.
      
## Requerimientos no funcionales

   1. La cantidad máxima de profesores registrando al mismo tiempo sus clases en la
      aplicación es de 100 users/second.
   2. El tiempo de respuesta máximo permitido para cada registro es de 500ms.
