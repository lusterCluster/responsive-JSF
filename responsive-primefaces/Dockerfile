# Usa la imagen oficial de MySQL como base
FROM mysql:latest

# Establece variables de entorno para las credenciales de la base de datos
ENV MYSQL_ROOT_PASSWORD=admin
ENV MYSQL_DATABASE=employee

# Copia el script SQL en el contenedor
COPY schema.sql /docker-entrypoint-initdb.d/

# Los scripts en /docker-entrypoint-initdb.d/ se ejecutan automáticamente
# al iniciar el contenedor MySQL
