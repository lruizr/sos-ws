
/**
 * NotValidOriginFlightError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.4  Built on : Dec 19, 2010 (08:18:42 CET)
 */

package es.upm.fi.sos.t3.travelagency;

public class NotValidOriginFlightError extends java.lang.Exception{
    
    private es.upm.fi.sos.t3.travelagency.NotValidOriginFlightErrorMessage faultMessage;

    
        public NotValidOriginFlightError() {
            super("NotValidOriginFlightError");
        }

        public NotValidOriginFlightError(java.lang.String s) {
           super(s);
        }

        public NotValidOriginFlightError(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public NotValidOriginFlightError(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(es.upm.fi.sos.t3.travelagency.NotValidOriginFlightErrorMessage msg){
       faultMessage = msg;
    }
    
    public es.upm.fi.sos.t3.travelagency.NotValidOriginFlightErrorMessage getFaultMessage(){
       return faultMessage;
    }
}
    