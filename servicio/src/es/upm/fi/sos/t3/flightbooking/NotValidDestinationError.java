
/**
 * NotValidDestinationError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.4  Built on : Dec 19, 2010 (08:18:42 CET)
 */

package es.upm.fi.sos.t3.flightbooking;

public class NotValidDestinationError extends java.lang.Exception{
    
    private es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.NotValidDestinationErrorMessage faultMessage;

    
        public NotValidDestinationError() {
            super("NotValidDestinationError");
        }

        public NotValidDestinationError(java.lang.String s) {
           super(s);
        }

        public NotValidDestinationError(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public NotValidDestinationError(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.NotValidDestinationErrorMessage msg){
       faultMessage = msg;
    }
    
    public es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.NotValidDestinationErrorMessage getFaultMessage(){
       return faultMessage;
    }
}
    