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

