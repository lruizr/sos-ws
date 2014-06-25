
/**
 * NotValidDestinationFlightError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.4  Built on : Dec 19, 2010 (08:18:42 CET)
 */

package es.upm.fi.sos.t3.travelagency;

public class NotValidDestinationFlightError extends java.lang.Exception{
    
    private es.upm.fi.sos.t3.travelagency.NotValidDestinationFlightErrorMessage faultMessage;

    
        public NotValidDestinationFlightError() {
            super("NotValidDestinationFlightError");
        }

        public NotValidDestinationFlightError(java.lang.String s) {
           super(s);
        }

        public NotValidDestinationFlightError(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public NotValidDestinationFlightError(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(es.upm.fi.sos.t3.travelagency.NotValidDestinationFlightErrorMessage msg){
       faultMessage = msg;
    }
    
    public es.upm.fi.sos.t3.travelagency.NotValidDestinationFlightErrorMessage getFaultMessage(){
       return faultMessage;
    }
}
    