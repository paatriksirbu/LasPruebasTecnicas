# Gestion de Codigos de Productos

### Descripción
Para este ejercicio se nos pide crear una clase codigo codigo producto que contenga un metodo GeneraCodigo que permite generar un codigo unico para cada producto basado en la descripcion del producto y la categoria a la que pertenece. Para esto, usaremos un try-catch para manejar las excepciones que puedan surgir, es decir, si se introduce un argumento incorrecto, el metodo devuelve una cadena vacia. Si el metodo recibe que la descripcion y la categoria son nulas, el metodo devuelve una cadena vacia. Si la descripcion es nula, el metodo devuelve una cadena vacia. Si la categoria es nula, el metodo devuelve una cadena vacia. Si la descripcion y la categoria son nulas o estan vacias se lanza una excepcion diciendo que estas no pueden estar vacias.

Si la descripcion y la categoria no son nulas, el metodo devuelve un codigo unico para cada producto basado en la descripcion del producto y la categoria a la que pertenece. Para esto, se concatenan las primeras 2 letras de la descripcion y las primeras 2 letras de la categoria y se le añade un numero que es el contador de productos que se va sumando en el caso de que querramos añadir mas productos con la misma descripcion y categoria.

En el main, mostramos un ejemplo de como se usaria el metodo GeneraCodigo. Pedimos al usuario la descripcion y la categoria del producto y mostramos el codigo que se ha generado. Tambien ofrecemos la opcion de añadir mas productos con la misma descripcion y categoria.


## Contacto

Patrik Paul Sirbu - https://github.com/paatriksirbu

Mail: patrikpsirbu@gmail.com

Enlace del proyecto: https://github.com/paatriksirbu/LasPruebasTecnicas.git