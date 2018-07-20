# spring-encrypted-properties-dojo
Dojo how to set up spring boot with encrypted properties

This project created following this tutorial:
https://blog.novatec-gmbh.de/encrypted-properties-spring/

Encrypted property looks like this:
<pre>
encrypted.property={cipher}de80c695fb48cdc5af050342403a9920544dc5a10fb647e8f3c177260551e591
</pre>


Compile
<pre>
mvn clean install -DskipTests
</pre>

Run

<pre>
ENCRYPT_KEY=dojo-passwd java -jar target/encrypted-properties-0.0.1-SNAPSHOT.jar
</pre>

Check

<pre>
curl http://localhost:8080/test
</pre>
 
 
# Integration with jib
 https://github.com/GoogleContainerTools/jib/blob/master/README.md
 
 Make sure you have docker install and configured
 
 <pre>
  mvn compile jib:dockerBuild
 </pre> 
 
 List images
 
 <pre>
 docker images
 </pre>  
 
 Run it
 
 <pre>
  docker run -it --rm -e ENCRYPT_KEY='dojo-passwd' -p 8080:8080 encrypted-properties
 </pre>
 
 Check again
 
 <pre>
 curl http://localhost:8080/test
 </pre>
  
Clean up
<pre>
mvn clean
docker rmi encrypted-properties
</pre> 
  