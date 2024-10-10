# Introduction 

Mediante la aplicación Demoblaze - es una pagina para seleccionar un teléfono y añadirlo a compras
Inicialmente se van a abordar pruebas funcionales de la aplicación, funcionalidades de negocio y automatización de flujos de negocio que contemplan de manera general las funcionalidades:

Registro de un usuario nuevo
Login al aplicativo
Selección de un teléfono

En cuanto a la implementación tecnológica va estar enfocada bajo el patrón screenplay orientado a comportamientos, lenguaje de programación java y alojado en repositorio GitHub para versionamiento del código realizado, con un Readme o instrucciones donde se indica cómo ejecutar el proyecto bajo sistema de construcción Gradle.
Metodología adoptada, scrum para garantizar entregas incrementales en los sprint que va a estar estimados en dos semanas cada uno, con el fin y encaminados a el producto mínimo viable del negocio.



# Getting Started
 información en general del proyecto.
 
1.	proyecto construido por el gestor de dependencias Gradle.
2.	visualizar el feature los cuales lo componen (login,registro,compra)
3.	Dependencias en el Buid Gradle Utilizadas.

# Build and Test
 mediante consola se puede ejecutar el proyecto gradle test aggregate generando el reporte de las pruebas en la carpeta targe/site/serenity/html.index
 que contiene la evidencia paso a paso de la las pruebas.
 
 Example:
 ./gradlew clean test  --tests co.com.demoblaze.com.co.runners.Login* -i



