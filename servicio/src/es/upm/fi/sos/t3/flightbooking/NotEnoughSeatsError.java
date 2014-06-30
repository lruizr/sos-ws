
/**
 * NotEnoughSeatsError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.4  Built on : Dec 19, 2010 (08:18:42 CET)
 */

package es.upm.fi.sos.t3.flightbooking;

public class NotEnoughSeatsError extends java.lang.Exception{
    
    private es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.NotEnoughSeatsErrorMessage faultMessage;

    
        public NotEnoughSeatsError() {
            super("NotEnoughSeatsError");
        }

        public NotEnoughSeatsError(java.lang.String s) {
           super(s);
        }

        public NotEnoughSeatsError(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public NotEnoughSeatsError(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.NotEnoughSeatsErrorMessage msg){
       faultMessage = msg;
    }
    
    public es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.NotEnoughSeatsErrorMessage getFaultMessage(){
       return faultMessage;
    }
}
    