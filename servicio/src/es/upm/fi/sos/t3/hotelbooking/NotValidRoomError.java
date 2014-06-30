
/**
 * NotValidRoomError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.4  Built on : Dec 19, 2010 (08:18:42 CET)
 */

package es.upm.fi.sos.t3.hotelbooking;

public class NotValidRoomError extends java.lang.Exception{
    
    private es.upm.fi.sos.t3.hotelbooking.HotelBookingWSStub.NotValidRoomErrorMessage faultMessage;

    
        public NotValidRoomError() {
            super("NotValidRoomError");
        }

        public NotValidRoomError(java.lang.String s) {
           super(s);
        }

        public NotValidRoomError(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public NotValidRoomError(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(es.upm.fi.sos.t3.hotelbooking.HotelBookingWSStub.NotValidRoomErrorMessage msg){
       faultMessage = msg;
    }
    
    public es.upm.fi.sos.t3.hotelbooking.HotelBookingWSStub.NotValidRoomErrorMessage getFaultMessage(){
       return faultMessage;
    }
}
    