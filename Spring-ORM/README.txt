####################################################
To BUILD the application
mvn clean install

To DEPLOY the application
cp target/JMSSpringWebApp-1.0-SNAPSHOT.war JBOSS_HOME/server/messaging_configuration/deploy/

To INVOKE the different operation us the following URL
http://localhost:8080/JMSSpringWebApp-1.0-SNAPSHOT/jms.htm?action=Send&jmsType=Topic

The parameters
action  : can be "Send/Receive"
jmsType : can be "Topic/Queue"

Note* : Receiving messages in Topic mode without message listener has not been implemented.

The application can be deployed into any jboss server with messaging implemented.
Method 1: action=Send&jmsType=Topic // Will send a message to a Topic and 2 listeners are available.
Method 2: action=Send&jmsType=Queue // Will send a message to a Queue and 2 listeners are available.
Method 3: action=Receive&jmsType=Queue // Disable queue listeners in jms-servlet.xml so that messages set in queue from method 2 don' get consumed.
Method 3: action=Receive&jmsType=Topic //Not Implemented
#####################################################