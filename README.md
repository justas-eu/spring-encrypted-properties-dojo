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
