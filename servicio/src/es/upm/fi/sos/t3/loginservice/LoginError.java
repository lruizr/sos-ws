
/**
 * LoginError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.4  Built on : Dec 19, 2010 (08:18:42 CET)
 */

package es.upm.fi.sos.t3.loginservice;

public class LoginError extends java.lang.Exception{
    
    private es.upm.fi.sos.t3.loginservice.LoginServiceWSStub.LoginErrorMessage faultMessage;

    
        public LoginError() {
            super("LoginError");
        }

        public LoginError(java.lang.String s) {
           super(s);
        }

        public LoginError(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public LoginError(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(es.upm.fi.sos.t3.loginservice.LoginServiceWSStub.LoginErrorMessage msg){
       faultMessage = msg;
    }
    
    public es.upm.fi.sos.t3.loginservice.LoginServiceWSStub.LoginErrorMessage getFaultMessage(){
       return faultMessage;
    }
}
    