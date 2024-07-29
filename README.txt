YO HO HOI
docker build -t employee . // construye la imagen del docker
docker run --name employee-container -p 3306:3306 -d employee //ejecuta el contenedor

mvn archetype:generate -DgroupId=com.lusterc.jsfRookUI -DartifactId=my-spring-boot-jsf-app -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
