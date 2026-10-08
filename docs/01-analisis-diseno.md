Analisis y diseño de un sistema de invernadero inteligente

Integrante: Axel Iván Breña Torres

fecha de inicio: 1 de octubre de 2026

--------------

## 1. Descripción del problema

El sistema que hay que hacer es un invernadero con sensores, se 
 miden tres cosas (la temperatura del aire,
la humedad del ambiente y la humedad del suelo), 
y cada una tiene su propio sensor, también hay un sistema de
riego que solo puede estar activo o inactivo.

El programa tiene que manejar datos 
para cada sensor como quién es (un id), donde está instalado,
si está activo y cuánto
midió la última vez.

Lo que tiene que hacer el sistema es recibir una medición e interpretarla 
(baja, adecuada o alta) y con la
humedad del suelo decidir si hay que regar, 
si el suelo está seco se activa el riego y si está adecuado o
alto no hace falta.

Algo que hay qye consideras es que los tres sensores
se parecen mucho pero no interpretan igual el número,
un 32 es temperatura alta, pero en humedad ambiental 
es baja y en humedad del suelo es adecuada, or eso creo
que aquí sirve la herencia, para tener una parte que sea
igual en todos los sensores y otra que cambie en cada uno.

--------
## 2. Identificación de objetos

Los objetos que identifiqué son estos:

- sensor: es la base para el sensor, es necesario porque todos los sensores
  del invernadero comparten datos (id, ubicación, si está activo
, última medición) y no es eficiente repetirlos
tres veces, en pocas palabras guarda información en común


- sensorTemperatura: Es el sensor que mide la temperatura del aire 
en grados centigrados es necesario porque interpreta la medición con 
base en sus rengos propios, su función es decir si la
temperatura es baja, adecuada o alta.


- sensorHumedad. Mide la humedad ambiental en un porcentaje %


- SensorHumedadSuelo. Mide la humedad del suelo en un porcentaje %
y puede decir si hace
  falta regar.


- SistemaRiego. No mide nada,  solo está activo o inactivo y se puede prender o apagar, 
su función es controlar el riego.


---------

# 3. Estado y comportamiento

| Objeto | Función                                          | Información del objeto| Comportamiento                                                                                                             |
|---|--------------------------------------------------|------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------|
| Sensor | Guardar los datos en común de todos los sensores | id<br>ubicación<br>si está activo<br>última medición | puede activarse y desactivarse<br>puede guardar una medición<br>puede consultar sus datos<br>puede interpretar su medición |
| SensorTemperatura | Interpretar mediciones de temperatura            | Lo mismo que Sensor                                  | Interpretar su medición con los rangos de temperatura<br>puede convertir su medición a Fahrenheit                          |
| SensorHumedad | Interpretar mediciones de humedad ambiental      | Lo mismo que Sensor                                  | Interpretar su medición con los rangos de humedad ambiental                                                                |
| SensorHumedadSuelo | Interpretar mediciones de humedad del suelo      | Lo mismo que Sensor                                  | Interpretar su medición con los rangos del suelo<br>pude saber si hace falta regar                                         |
| SistemaRiego | Controlar si se está regando o no                | Si está activo o no                                  | puede activarse<br>puede desactivarse<br>puede consultar su estado                                                         |

-------

