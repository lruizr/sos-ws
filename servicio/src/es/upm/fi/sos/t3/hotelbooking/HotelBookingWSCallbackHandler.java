
/**
 * HotelBookingWSCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.4  Built on : Dec 19, 2010 (08:18:42 CET)
 */

    package es.upm.fi.sos.t3.hotelbooking;

    /**
     *  HotelBookingWSCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class HotelBookingWSCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public HotelBookingWSCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public HotelBookingWSCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getCityList method
            * override this method for handling normal response from getCityList operation
            */
           public void receiveResultgetCityList(
                    es.upm.fi.sos.t3.hotelbooking.HotelBookingWSStub.CityList result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getCityList operation
           */
            public void receiveErrorgetCityList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getHotelList method
            * override this method for handling normal response from getHotelList operation
            */
           public void receiveResultgetHotelList(
                    es.upm.fi.sos.t3.hotelbooking.HotelBookingWSStub.HotelList result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getHotelList operation
           */
            public void receiveErrorgetHotelList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for checkHotel method
            * override this method for handling normal response from checkHotel operation
            */
           public void receiveResultcheckHotel(
                    es.upm.fi.sos.t3.hotelbooking.HotelBookingWSStub.CheckingHotelResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from checkHotel operation
           */
            public void receiveErrorcheckHotel(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for bookHotel method
            * override this method for handling normal response from bookHotel operation
            */
           public void receiveResultbookHotel(
                    es.upm.fi.sos.t3.hotelbooking.HotelBookingWSStub.BookingHotelResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from bookHotel operation
           */
            public void receiveErrorbookHotel(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for cancelHotel method
            * override this method for handling normal response from cancelHotel operation
            */
           public void receiveResultcancelHotel(
                    es.upm.fi.sos.t3.hotelbooking.HotelBookingWSStub.CancellingHotelResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from cancelHotel operation
           */
            public void receiveErrorcancelHotel(java.lang.Exception e) {
            }
                


    }
    