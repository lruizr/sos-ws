
/**
 * NotEnoughRoomsHotelError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.4  Built on : Dec 19, 2010 (08:18:42 CET)
 */

package es.upm.fi.sos.t3.travelagency;

public class NotEnoughRoomsHotelError extends java.lang.Exception{
    
    private es.upm.fi.sos.t3.travelagency.NotEnoughRoomsHotelErrorMessage faultMessage;

    
        public NotEnoughRoomsHotelError() {
            super("NotEnoughRoomsHotelError");
        }

        public NotEnoughRoomsHotelError(java.lang.String s) {
           super(s);
        }

        public NotEnoughRoomsHotelError(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public NotEnoughRoomsHotelError(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(es.upm.fi.sos.t3.travelagency.NotEnoughRoomsHotelErrorMessage msg){
       faultMessage = msg;
    }
    
    public es.upm.fi.sos.t3.travelagency.NotEnoughRoomsHotelErrorMessage getFaultMessage(){
       return faultMessage;
    }
}
    