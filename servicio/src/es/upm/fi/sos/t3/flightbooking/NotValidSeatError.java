
/**
 * NotValidSeatError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.4  Built on : Dec 19, 2010 (08:18:42 CET)
 */

package es.upm.fi.sos.t3.flightbooking;

public class NotValidSeatError extends java.lang.Exception{
    
    private es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.NotValidSeatErrorMessage faultMessage;

    
        public NotValidSeatError() {
            super("NotValidSeatError");
        }

        public NotValidSeatError(java.lang.String s) {
           super(s);
        }

        public NotValidSeatError(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public NotValidSeatError(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.NotValidSeatErrorMessage msg){
       faultMessage = msg;
    }
    
    public es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.NotValidSeatErrorMessage getFaultMessage(){
       return faultMessage;
    }
}
    