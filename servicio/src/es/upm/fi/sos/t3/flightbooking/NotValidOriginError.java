
/**
 * NotValidOriginError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.4  Built on : Dec 19, 2010 (08:18:42 CET)
 */

package es.upm.fi.sos.t3.flightbooking;

public class NotValidOriginError extends java.lang.Exception{
    
    private es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.NotValidOriginErrorMessage faultMessage;

    
        public NotValidOriginError() {
            super("NotValidOriginError");
        }

        public NotValidOriginError(java.lang.String s) {
           super(s);
        }

        public NotValidOriginError(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public NotValidOriginError(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.NotValidOriginErrorMessage msg){
       faultMessage = msg;
    }
    
    public es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.NotValidOriginErrorMessage getFaultMessage(){
       return faultMessage;
    }
}
    