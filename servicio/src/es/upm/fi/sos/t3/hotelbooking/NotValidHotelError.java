
/**
 * NotValidHotelError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.4  Built on : Dec 19, 2010 (08:18:42 CET)
 */

package es.upm.fi.sos.t3.hotelbooking;

public class NotValidHotelError extends java.lang.Exception{
    
    private es.upm.fi.sos.t3.hotelbooking.HotelBookingWSStub.NotValidHotelErrorMessage faultMessage;

    
        public NotValidHotelError() {
            super("NotValidHotelError");
        }

        public NotValidHotelError(java.lang.String s) {
           super(s);
        }

        public NotValidHotelError(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public NotValidHotelError(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(es.upm.fi.sos.t3.hotelbooking.HotelBookingWSStub.NotValidHotelErrorMessage msg){
       faultMessage = msg;
    }
    
    public es.upm.fi.sos.t3.hotelbooking.HotelBookingWSStub.NotValidHotelErrorMessage getFaultMessage(){
       return faultMessage;
    }
}
    