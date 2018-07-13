# spring-encrypted-properties-dojo
Dojo how to set up spring boot with encrypted properties

This project created following this tutorial:
https://blog.novatec-gmbh.de/encrypted-properties-spring/

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
