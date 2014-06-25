
/**
 * NotEnoughRoomsError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.4  Built on : Dec 19, 2010 (08:18:42 CET)
 */

package es.upm.fi.sos.t3.hotelbooking;

public class NotEnoughRoomsError extends java.lang.Exception{
    
    private es.upm.fi.sos.t3.hotelbooking.HotelBookingWSStub.NotEnoughRoomsErrorMessage faultMessage;

    
        public NotEnoughRoomsError() {
            super("NotEnoughRoomsError");
        }

        public NotEnoughRoomsError(java.lang.String s) {
           super(s);
        }

        public NotEnoughRoomsError(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public NotEnoughRoomsError(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(es.upm.fi.sos.t3.hotelbooking.HotelBookingWSStub.NotEnoughRoomsErrorMessage msg){
       faultMessage = msg;
    }
    
    public es.upm.fi.sos.t3.hotelbooking.HotelBookingWSStub.NotEnoughRoomsErrorMessage getFaultMessage(){
       return faultMessage;
    }
}
    