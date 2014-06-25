
/**
 * NotValidCityHotelError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.4  Built on : Dec 19, 2010 (08:18:42 CET)
 */

package es.upm.fi.sos.t3.travelagency;

public class NotValidCityHotelError extends java.lang.Exception{
    
    private es.upm.fi.sos.t3.travelagency.TravelAgencyWSStub.NotValidCityHotelErrorMessage faultMessage;

    
        public NotValidCityHotelError() {
            super("NotValidCityHotelError");
        }

        public NotValidCityHotelError(java.lang.String s) {
           super(s);
        }

        public NotValidCityHotelError(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public NotValidCityHotelError(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(es.upm.fi.sos.t3.travelagency.TravelAgencyWSStub.NotValidCityHotelErrorMessage msg){
       faultMessage = msg;
    }
    
    public es.upm.fi.sos.t3.travelagency.TravelAgencyWSStub.NotValidCityHotelErrorMessage getFaultMessage(){
       return faultMessage;
    }
}
    