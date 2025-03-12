import TP.WSBANQUESERVICE;
import jakarta.xml.ws.Endpoint;

public class serverJWS {
   public static void main (String[] args) {
       String url="http://0.0.0.0:8080/";
       Endpoint.publish( url , new WSBANQUESERVICE());
       System.out.println("Server is deployed in "+url);
   }
}
