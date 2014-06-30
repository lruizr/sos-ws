
/**
 * NotValidRoomHotelError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.4  Built on : Dec 19, 2010 (08:18:42 CET)
 */

package es.upm.fi.sos.t3.travelagency;

public class NotValidRoomHotelError extends java.lang.Exception{
    
    private es.upm.fi.sos.t3.travelagency.TravelAgencyWSStub.NotValidRoomHotelErrorMessage faultMessage;

    
        public NotValidRoomHotelError() {
            super("NotValidRoomHotelError");
        }

        public NotValidRoomHotelError(java.lang.String s) {
           super(s);
        }

        public NotValidRoomHotelError(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public NotValidRoomHotelError(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(es.upm.fi.sos.t3.travelagency.TravelAgencyWSStub.NotValidRoomHotelErrorMessage msg){
       faultMessage = msg;
    }
    
    public es.upm.fi.sos.t3.travelagency.TravelAgencyWSStub.NotValidRoomHotelErrorMessage getFaultMessage(){
       return faultMessage;
    }
}
    