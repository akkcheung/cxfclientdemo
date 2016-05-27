2016-04

cxf - upload file

		http://www.coctec.com/docs/java/show-post-60903.html
		
		http://techorgan.com/web-service/web-service-binary-message-transfer-with-mtom-using-apache-cxf/
		
		http://cxf.apache.org/docs/mtom-attachments-with-jaxb.html

cxf - client auth

    http://stackoverflow.com/questions/16698404/how-does-one-configure-cxf-generated-client-for-preemptive-http-auth

		https://forums.alfresco.com/forum/developer-discussions/alfresco-api/how-implement-ssl-apache-cxf-client-04082011-1107
		
		http://www.mkyong.com/webservices/jax-ws/java-security-cert-certificateexception-no-name-matching-localhost-found/

cxf - client auth (JaxWsProxyFactory)

		http://middlewaremagic.com/jboss/?p=976

cxf - setup

    使用apache CXF和maven开发Web Service

    http://www.cnblogs.com/holbrook/archive/2012/12/12/2814821.html

    http://cxf.apache.org/docs/developing-a-consumer.html
    
    http://cxf.apache.org/docs/sample-projects.html

    http://svn.apache.org/viewvc/cxf/trunk/distribution/src/main/release/samples/
    
keytool

	https://www.sslshopper.com/article-most-common-java-keytool-keystore-commands.html

	keytool -export -alias jetty -file jetty.crt -keystore \Users\c7183\Downloads\Tools\jetty-distribution-9.2.15.v20160210\etc\keystore_test.jks
	
	keytool -import -trustcacerts -alias jetty -file projects\cxfclientdemo\jetty.crt -keystore \appl\IBM\SDP85\jdk\jre\lib\security\cacerts
	
	http://certificate.fyicenter.com/120_Java_VM_Password_for_cacerts__Java_System_Keystore.html

mvn - exec

    mvn archetype:generate -DgroupId=com.mycompany -DartifactId=cxfclientdemo -DarchetypeArtifactId=maven-archetype-quickstart 
-DinteractiveMode=false

    http://stackoverflow.com/questions/9846046/run-main-class-of-maven-project
        
    mvn exec:java -Dexec.mainClass="cxfdemo.CXFDemo_CXFDemoImplPort_Client"
    
    mvn exec:java -Dexec.mainClass="uploadDemo.UploadDemoClient"
    
steps :

    - run projects\cxfdemo (mvn jetty:run)

    - save link http://localhost:8081/cxfdemo/services/cxfdemo?wsdl  to cxfdemo.wsdl

    - d:\Users\c7183\Downloads\Tools\apache-cxf-2.7.18\bin\wsdl2java -ant -client -encoding UTF-8 cxfdemo.wsdl

    - create maven project 

    - copy java class

    - copy cxfdemo.wsdl project root  - projects\cxfclientdemo

    - mvn clean compile

    - mvn exec:java -Dexec.mainClass="cxfdemo.CXFDemo_CXFDemoImplPort_Client"
    
    mvn exec:java -Dexec.mainClass="cxfdemotwo.HelloWorld_HelloWorldImplPort_Client"


http://localhost:8080/cxfdemo/services
