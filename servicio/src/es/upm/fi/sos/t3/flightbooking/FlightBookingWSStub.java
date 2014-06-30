
/**
 * FlightBookingWSStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.4  Built on : Dec 19, 2010 (08:18:42 CET)
 */
package es.upm.fi.sos.t3.flightbooking;



/*
 *  FlightBookingWSStub java implementation
 */


public class FlightBookingWSStub extends org.apache.axis2.client.Stub
{
	protected org.apache.axis2.description.AxisOperation[] _operations;

	//hashmaps to keep the fault mapping
	private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
	private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
	private java.util.HashMap faultMessageMap = new java.util.HashMap();

	private static int counter = 0;

	private static synchronized java.lang.String getUniqueSuffix(){
		// reset the counter if it is greater than 99999
		if (counter > 99999){
			counter = 0;
		}
		counter = counter + 1; 
		return java.lang.Long.toString(java.lang.System.currentTimeMillis()) + "_" + counter;
	}


	private void populateAxisService() throws org.apache.axis2.AxisFault {

		//creating the Service with a unique name
		_service = new org.apache.axis2.description.AxisService("FlightBookingWS" + getUniqueSuffix());
		addAnonymousOperations();

		//creating the operations
		org.apache.axis2.description.AxisOperation __operation;

		_operations = new org.apache.axis2.description.AxisOperation[5];

		__operation = new org.apache.axis2.description.OutInAxisOperation();


		__operation.setName(new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es", "bookFlight"));
		_service.addOperation(__operation);




		_operations[0]=__operation;


		__operation = new org.apache.axis2.description.OutInAxisOperation();


		__operation.setName(new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es", "checkFlight"));
		_service.addOperation(__operation);




		_operations[1]=__operation;


		__operation = new org.apache.axis2.description.OutInAxisOperation();


		__operation.setName(new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es", "getDestinationList"));
		_service.addOperation(__operation);




		_operations[2]=__operation;


		__operation = new org.apache.axis2.description.OutInAxisOperation();


		__operation.setName(new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es", "cancelFlight"));
		_service.addOperation(__operation);




		_operations[3]=__operation;


		__operation = new org.apache.axis2.description.OutInAxisOperation();


		__operation.setName(new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es", "getOriginList"));
		_service.addOperation(__operation);




		_operations[4]=__operation;


	}

	//populates the faults
	private void populateFaults(){

		faultExceptionNameMap.put( new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","notValidOriginErrorMessage"),"es.upm.fi.sos.t3.flightbooking.NotValidOriginError");
		faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","notValidOriginErrorMessage"),"es.upm.fi.sos.t3.flightbooking.NotValidOriginError");
		faultMessageMap.put( new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","notValidOriginErrorMessage"),"es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub$NotValidOriginErrorMessage");

		faultExceptionNameMap.put( new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","notValidDestinationErrorMessage"),"es.upm.fi.sos.t3.flightbooking.NotValidDestinationError");
		faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","notValidDestinationErrorMessage"),"es.upm.fi.sos.t3.flightbooking.NotValidDestinationError");
		faultMessageMap.put( new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","notValidDestinationErrorMessage"),"es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub$NotValidDestinationErrorMessage");

		faultExceptionNameMap.put( new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","notEnoughSeatsErrorMessage"),"es.upm.fi.sos.t3.flightbooking.NotEnoughSeatsError");
		faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","notEnoughSeatsErrorMessage"),"es.upm.fi.sos.t3.flightbooking.NotEnoughSeatsError");
		faultMessageMap.put( new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","notEnoughSeatsErrorMessage"),"es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub$NotEnoughSeatsErrorMessage");

		faultExceptionNameMap.put( new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","notValidSeatErrorMessage"),"es.upm.fi.sos.t3.flightbooking.NotValidSeatError");
		faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","notValidSeatErrorMessage"),"es.upm.fi.sos.t3.flightbooking.NotValidSeatError");
		faultMessageMap.put( new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","notValidSeatErrorMessage"),"es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub$NotValidSeatErrorMessage");

		faultExceptionNameMap.put( new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","notValidOriginErrorMessage"),"es.upm.fi.sos.t3.flightbooking.NotValidOriginError");
		faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","notValidOriginErrorMessage"),"es.upm.fi.sos.t3.flightbooking.NotValidOriginError");
		faultMessageMap.put( new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","notValidOriginErrorMessage"),"es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub$NotValidOriginErrorMessage");

		faultExceptionNameMap.put( new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","notValidDestinationErrorMessage"),"es.upm.fi.sos.t3.flightbooking.NotValidDestinationError");
		faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","notValidDestinationErrorMessage"),"es.upm.fi.sos.t3.flightbooking.NotValidDestinationError");
		faultMessageMap.put( new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","notValidDestinationErrorMessage"),"es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub$NotValidDestinationErrorMessage");

		faultExceptionNameMap.put( new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","notValidOriginErrorMessage"),"es.upm.fi.sos.t3.flightbooking.NotValidOriginError");
		faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","notValidOriginErrorMessage"),"es.upm.fi.sos.t3.flightbooking.NotValidOriginError");
		faultMessageMap.put( new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","notValidOriginErrorMessage"),"es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub$NotValidOriginErrorMessage");

		faultExceptionNameMap.put( new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","notValidOriginErrorMessage"),"es.upm.fi.sos.t3.flightbooking.NotValidOriginError");
		faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","notValidOriginErrorMessage"),"es.upm.fi.sos.t3.flightbooking.NotValidOriginError");
		faultMessageMap.put( new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","notValidOriginErrorMessage"),"es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub$NotValidOriginErrorMessage");

		faultExceptionNameMap.put( new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","notValidDestinationErrorMessage"),"es.upm.fi.sos.t3.flightbooking.NotValidDestinationError");
		faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","notValidDestinationErrorMessage"),"es.upm.fi.sos.t3.flightbooking.NotValidDestinationError");
		faultMessageMap.put( new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","notValidDestinationErrorMessage"),"es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub$NotValidDestinationErrorMessage");

		faultExceptionNameMap.put( new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","notEnoughSeatsErrorMessage"),"es.upm.fi.sos.t3.flightbooking.NotEnoughSeatsError");
		faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","notEnoughSeatsErrorMessage"),"es.upm.fi.sos.t3.flightbooking.NotEnoughSeatsError");
		faultMessageMap.put( new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","notEnoughSeatsErrorMessage"),"es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub$NotEnoughSeatsErrorMessage");

		faultExceptionNameMap.put( new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","notValidSeatErrorMessage"),"es.upm.fi.sos.t3.flightbooking.NotValidSeatError");
		faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","notValidSeatErrorMessage"),"es.upm.fi.sos.t3.flightbooking.NotValidSeatError");
		faultMessageMap.put( new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","notValidSeatErrorMessage"),"es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub$NotValidSeatErrorMessage");



	}

	/**
	 *Constructor that takes in a configContext
	 */

	public FlightBookingWSStub(org.apache.axis2.context.ConfigurationContext configurationContext,
			java.lang.String targetEndpoint)
		throws org.apache.axis2.AxisFault {
		this(configurationContext,targetEndpoint,false);
	}


	/**
	 * Constructor that takes in a configContext  and useseperate listner
	 */
	public FlightBookingWSStub(org.apache.axis2.context.ConfigurationContext configurationContext,
			java.lang.String targetEndpoint, boolean useSeparateListener)
		throws org.apache.axis2.AxisFault {
		//To populate AxisService
		populateAxisService();
		populateFaults();

		_serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,_service);


		_serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(
					targetEndpoint));
		_serviceClient.getOptions().setUseSeparateListener(useSeparateListener);

		//Set the soap version
		_serviceClient.getOptions().setSoapVersionURI(org.apache.axiom.soap.SOAP12Constants.SOAP_ENVELOPE_NAMESPACE_URI);


	}

	/**
	 * Default Constructor
	 */
	public FlightBookingWSStub(org.apache.axis2.context.ConfigurationContext configurationContext) throws org.apache.axis2.AxisFault {

		this(configurationContext,"http://adapt08.ls.fi.upm.es:8080/axis2/services/FlightBookingWS" );

	}

	/**
	 * Default Constructor
	 */
	public FlightBookingWSStub() throws org.apache.axis2.AxisFault {

		this("http://adapt08.ls.fi.upm.es:8080/axis2/services/FlightBookingWS" );

	}

	/**
	 * Constructor taking the target endpoint
	 */
	public FlightBookingWSStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
		this(null,targetEndpoint);
	}




	/**
	 * Auto generated method signature
	 * 
	 * @see es.upm.fi.sos.t3.flightbooking.FlightBookingWS#bookFlight
	 * @param bookingFlight1

	 * @throws es.upm.fi.sos.t3.flightbooking.NotValidOriginError : 
	 * @throws es.upm.fi.sos.t3.flightbooking.NotValidDestinationError : 
	 * @throws es.upm.fi.sos.t3.flightbooking.NotEnoughSeatsError : 
	 * @throws es.upm.fi.sos.t3.flightbooking.NotValidSeatError : 
	 */



	public  es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.BookingFlightResponse bookFlight(

			es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.BookingFlight bookingFlight1)


		throws java.rmi.RemoteException


		,es.upm.fi.sos.t3.flightbooking.NotValidOriginError
		,es.upm.fi.sos.t3.flightbooking.NotValidDestinationError
		,es.upm.fi.sos.t3.flightbooking.NotEnoughSeatsError
		,es.upm.fi.sos.t3.flightbooking.NotValidSeatError{
			org.apache.axis2.context.MessageContext _messageContext = null;
			try{
				org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
				_operationClient.getOptions().setAction("urn:bookFlight");
				_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);



				addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");


				// create a message context
				_messageContext = new org.apache.axis2.context.MessageContext();



				// create SOAP envelope with that payload
				org.apache.axiom.soap.SOAPEnvelope env = null;


				env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
						bookingFlight1,
						optimizeContent(new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es",
								"bookFlight")));

				//adding SOAP soap_headers
				_serviceClient.addHeadersToEnvelope(env);
				// set the message context with that soap envelope
				_messageContext.setEnvelope(env);

				// add the message contxt to the operation client
				_operationClient.addMessageContext(_messageContext);

				//execute the operation client
				_operationClient.execute(true);


				org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
						org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
				org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


				java.lang.Object object = fromOM(
						_returnEnv.getBody().getFirstElement() ,
						es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.BookingFlightResponse.class,
						getEnvelopeNamespaces(_returnEnv));


				return (es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.BookingFlightResponse)object;

			}catch(org.apache.axis2.AxisFault f){

				org.apache.axiom.om.OMElement faultElt = f.getDetail();
				if (faultElt!=null){
					if (faultExceptionNameMap.containsKey(faultElt.getQName())){
						//make the fault by reflection
						try{
							java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
							java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
							java.lang.Exception ex=
								(java.lang.Exception) exceptionClass.newInstance();
							//message class
							java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
							java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
							java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
							java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
									new java.lang.Class[]{messageClass});
							m.invoke(ex,new java.lang.Object[]{messageObject});

							if (ex instanceof es.upm.fi.sos.t3.flightbooking.NotValidOriginError){
								throw (es.upm.fi.sos.t3.flightbooking.NotValidOriginError)ex;
							}

							if (ex instanceof es.upm.fi.sos.t3.flightbooking.NotValidDestinationError){
								throw (es.upm.fi.sos.t3.flightbooking.NotValidDestinationError)ex;
							}

							if (ex instanceof es.upm.fi.sos.t3.flightbooking.NotEnoughSeatsError){
								throw (es.upm.fi.sos.t3.flightbooking.NotEnoughSeatsError)ex;
							}

							if (ex instanceof es.upm.fi.sos.t3.flightbooking.NotValidSeatError){
								throw (es.upm.fi.sos.t3.flightbooking.NotValidSeatError)ex;
							}


							throw new java.rmi.RemoteException(ex.getMessage(), ex);
						}catch(java.lang.ClassCastException e){
							// we cannot intantiate the class - throw the original Axis fault
							throw f;
						} catch (java.lang.ClassNotFoundException e) {
							// we cannot intantiate the class - throw the original Axis fault
							throw f;
						}catch (java.lang.NoSuchMethodException e) {
							// we cannot intantiate the class - throw the original Axis fault
							throw f;
						} catch (java.lang.reflect.InvocationTargetException e) {
							// we cannot intantiate the class - throw the original Axis fault
							throw f;
						}  catch (java.lang.IllegalAccessException e) {
							// we cannot intantiate the class - throw the original Axis fault
							throw f;
						}   catch (java.lang.InstantiationException e) {
							// we cannot intantiate the class - throw the original Axis fault
							throw f;
						}
					}else{
						throw f;
					}
				}else{
					throw f;
				}
			} finally {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see es.upm.fi.sos.t3.flightbooking.FlightBookingWS#startbookFlight
	 * @param bookingFlight1

*/
	public  void startbookFlight(

			es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.BookingFlight bookingFlight1,

			final es.upm.fi.sos.t3.flightbooking.FlightBookingWSCallbackHandler callback)

		throws java.rmi.RemoteException{

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
		_operationClient.getOptions().setAction("urn:bookFlight");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);



		addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");



		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env=null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


		//Style is Doc.


		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
				bookingFlight1,
				optimizeContent(new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es",
						"bookFlight")));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);



		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
				try {
					org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
						es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.BookingFlightResponse.class,
						getEnvelopeNamespaces(resultEnv));
					callback.receiveResultbookFlight(
						(es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.BookingFlightResponse)object);

				} catch (org.apache.axis2.AxisFault e) {
					callback.receiveErrorbookFlight(e);
				}
			}

			public void onError(java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt!=null){
						if (faultExceptionNameMap.containsKey(faultElt.getQName())){
							//make the fault by reflection
							try{
								java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
								java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								java.lang.Exception ex=
									(java.lang.Exception) exceptionClass.newInstance();
								//message class
								java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
								java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
								java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[]{messageClass});
								m.invoke(ex,new java.lang.Object[]{messageObject});

								if (ex instanceof es.upm.fi.sos.t3.flightbooking.NotValidOriginError){
									callback.receiveErrorbookFlight((es.upm.fi.sos.t3.flightbooking.NotValidOriginError)ex);
									return;
								}

								if (ex instanceof es.upm.fi.sos.t3.flightbooking.NotValidDestinationError){
									callback.receiveErrorbookFlight((es.upm.fi.sos.t3.flightbooking.NotValidDestinationError)ex);
									return;
								}

								if (ex instanceof es.upm.fi.sos.t3.flightbooking.NotEnoughSeatsError){
									callback.receiveErrorbookFlight((es.upm.fi.sos.t3.flightbooking.NotEnoughSeatsError)ex);
									return;
								}

								if (ex instanceof es.upm.fi.sos.t3.flightbooking.NotValidSeatError){
									callback.receiveErrorbookFlight((es.upm.fi.sos.t3.flightbooking.NotValidSeatError)ex);
									return;
								}


								callback.receiveErrorbookFlight(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch(java.lang.ClassCastException e){
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorbookFlight(f);
							} catch (java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorbookFlight(f);
							} catch (java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorbookFlight(f);
							} catch (java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorbookFlight(f);
							} catch (java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorbookFlight(f);
							} catch (java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorbookFlight(f);
							} catch (org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorbookFlight(f);
							}
						} else {
							callback.receiveErrorbookFlight(f);
						}
					} else {
						callback.receiveErrorbookFlight(f);
					}
				} else {
					callback.receiveErrorbookFlight(error);
				}
			}

			public void onFault(org.apache.axis2.context.MessageContext faultContext) {
				org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorbookFlight(axisFault);
				}
			}
		});


		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if ( _operations[0].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[0].setMessageReceiver(
					_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);

			}

	/**
	 * Auto generated method signature
	 * 
	 * @see es.upm.fi.sos.t3.flightbooking.FlightBookingWS#checkFlight
	 * @param checkingFlight3

	 * @throws es.upm.fi.sos.t3.flightbooking.NotValidOriginError : 
	 * @throws es.upm.fi.sos.t3.flightbooking.NotValidDestinationError : 
	 */



	public  es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.CheckingFlightResponse checkFlight(

			es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.CheckingFlight checkingFlight3)


		throws java.rmi.RemoteException


		,es.upm.fi.sos.t3.flightbooking.NotValidOriginError
		,es.upm.fi.sos.t3.flightbooking.NotValidDestinationError{
			org.apache.axis2.context.MessageContext _messageContext = null;
			try{
				org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
				_operationClient.getOptions().setAction("urn:checkFlight");
				_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);



				addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");


				// create a message context
				_messageContext = new org.apache.axis2.context.MessageContext();



				// create SOAP envelope with that payload
				org.apache.axiom.soap.SOAPEnvelope env = null;


				env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
						checkingFlight3,
						optimizeContent(new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es",
								"checkFlight")));

				//adding SOAP soap_headers
				_serviceClient.addHeadersToEnvelope(env);
				// set the message context with that soap envelope
				_messageContext.setEnvelope(env);

				// add the message contxt to the operation client
				_operationClient.addMessageContext(_messageContext);

				//execute the operation client
				_operationClient.execute(true);


				org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
						org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
				org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


				java.lang.Object object = fromOM(
						_returnEnv.getBody().getFirstElement() ,
						es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.CheckingFlightResponse.class,
						getEnvelopeNamespaces(_returnEnv));


				return (es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.CheckingFlightResponse)object;

			}catch(org.apache.axis2.AxisFault f){

				org.apache.axiom.om.OMElement faultElt = f.getDetail();
				if (faultElt!=null){
					if (faultExceptionNameMap.containsKey(faultElt.getQName())){
						//make the fault by reflection
						try{
							java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
							java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
							java.lang.Exception ex=
								(java.lang.Exception) exceptionClass.newInstance();
							//message class
							java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
							java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
							java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
							java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
									new java.lang.Class[]{messageClass});
							m.invoke(ex,new java.lang.Object[]{messageObject});

							if (ex instanceof es.upm.fi.sos.t3.flightbooking.NotValidOriginError){
								throw (es.upm.fi.sos.t3.flightbooking.NotValidOriginError)ex;
							}

							if (ex instanceof es.upm.fi.sos.t3.flightbooking.NotValidDestinationError){
								throw (es.upm.fi.sos.t3.flightbooking.NotValidDestinationError)ex;
							}


							throw new java.rmi.RemoteException(ex.getMessage(), ex);
						}catch(java.lang.ClassCastException e){
							// we cannot intantiate the class - throw the original Axis fault
							throw f;
						} catch (java.lang.ClassNotFoundException e) {
							// we cannot intantiate the class - throw the original Axis fault
							throw f;
						}catch (java.lang.NoSuchMethodException e) {
							// we cannot intantiate the class - throw the original Axis fault
							throw f;
						} catch (java.lang.reflect.InvocationTargetException e) {
							// we cannot intantiate the class - throw the original Axis fault
							throw f;
						}  catch (java.lang.IllegalAccessException e) {
							// we cannot intantiate the class - throw the original Axis fault
							throw f;
						}   catch (java.lang.InstantiationException e) {
							// we cannot intantiate the class - throw the original Axis fault
							throw f;
						}
					}else{
						throw f;
					}
				}else{
					throw f;
				}
			} finally {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see es.upm.fi.sos.t3.flightbooking.FlightBookingWS#startcheckFlight
	 * @param checkingFlight3

*/
	public  void startcheckFlight(

			es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.CheckingFlight checkingFlight3,

			final es.upm.fi.sos.t3.flightbooking.FlightBookingWSCallbackHandler callback)

		throws java.rmi.RemoteException{

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
		_operationClient.getOptions().setAction("urn:checkFlight");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);



		addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");



		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env=null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


		//Style is Doc.


		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
				checkingFlight3,
				optimizeContent(new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es",
						"checkFlight")));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);



		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
				try {
					org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
						es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.CheckingFlightResponse.class,
						getEnvelopeNamespaces(resultEnv));
					callback.receiveResultcheckFlight(
						(es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.CheckingFlightResponse)object);

				} catch (org.apache.axis2.AxisFault e) {
					callback.receiveErrorcheckFlight(e);
				}
			}

			public void onError(java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt!=null){
						if (faultExceptionNameMap.containsKey(faultElt.getQName())){
							//make the fault by reflection
							try{
								java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
								java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								java.lang.Exception ex=
									(java.lang.Exception) exceptionClass.newInstance();
								//message class
								java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
								java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
								java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[]{messageClass});
								m.invoke(ex,new java.lang.Object[]{messageObject});

								if (ex instanceof es.upm.fi.sos.t3.flightbooking.NotValidOriginError){
									callback.receiveErrorcheckFlight((es.upm.fi.sos.t3.flightbooking.NotValidOriginError)ex);
									return;
								}

								if (ex instanceof es.upm.fi.sos.t3.flightbooking.NotValidDestinationError){
									callback.receiveErrorcheckFlight((es.upm.fi.sos.t3.flightbooking.NotValidDestinationError)ex);
									return;
								}


								callback.receiveErrorcheckFlight(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch(java.lang.ClassCastException e){
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcheckFlight(f);
							} catch (java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcheckFlight(f);
							} catch (java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcheckFlight(f);
							} catch (java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcheckFlight(f);
							} catch (java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcheckFlight(f);
							} catch (java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcheckFlight(f);
							} catch (org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcheckFlight(f);
							}
						} else {
							callback.receiveErrorcheckFlight(f);
						}
					} else {
						callback.receiveErrorcheckFlight(f);
					}
				} else {
					callback.receiveErrorcheckFlight(error);
				}
			}

			public void onFault(org.apache.axis2.context.MessageContext faultContext) {
				org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorcheckFlight(axisFault);
				}
			}
		});


		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if ( _operations[1].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[1].setMessageReceiver(
					_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);

			}

	/**
	 * Auto generated method signature
	 * 
	 * @see es.upm.fi.sos.t3.flightbooking.FlightBookingWS#getDestinationList
	 * @param origin5

	 * @throws es.upm.fi.sos.t3.flightbooking.NotValidOriginError : 
	 */



	public  es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.DestinationList getDestinationList(

			es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.Origin origin5)


		throws java.rmi.RemoteException


		,es.upm.fi.sos.t3.flightbooking.NotValidOriginError{
			org.apache.axis2.context.MessageContext _messageContext = null;
			try{
				org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
				_operationClient.getOptions().setAction("urn:getDestinationList");
				_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);



				addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");


				// create a message context
				_messageContext = new org.apache.axis2.context.MessageContext();



				// create SOAP envelope with that payload
				org.apache.axiom.soap.SOAPEnvelope env = null;


				env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
						origin5,
						optimizeContent(new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es",
								"getDestinationList")));

				//adding SOAP soap_headers
				_serviceClient.addHeadersToEnvelope(env);
				// set the message context with that soap envelope
				_messageContext.setEnvelope(env);

				// add the message contxt to the operation client
				_operationClient.addMessageContext(_messageContext);

				//execute the operation client
				_operationClient.execute(true);


				org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
						org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
				org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


				java.lang.Object object = fromOM(
						_returnEnv.getBody().getFirstElement() ,
						es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.DestinationList.class,
						getEnvelopeNamespaces(_returnEnv));


				return (es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.DestinationList)object;

			}catch(org.apache.axis2.AxisFault f){

				org.apache.axiom.om.OMElement faultElt = f.getDetail();
				if (faultElt!=null){
					if (faultExceptionNameMap.containsKey(faultElt.getQName())){
						//make the fault by reflection
						try{
							java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
							java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
							java.lang.Exception ex=
								(java.lang.Exception) exceptionClass.newInstance();
							//message class
							java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
							java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
							java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
							java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
									new java.lang.Class[]{messageClass});
							m.invoke(ex,new java.lang.Object[]{messageObject});

							if (ex instanceof es.upm.fi.sos.t3.flightbooking.NotValidOriginError){
								throw (es.upm.fi.sos.t3.flightbooking.NotValidOriginError)ex;
							}


							throw new java.rmi.RemoteException(ex.getMessage(), ex);
						}catch(java.lang.ClassCastException e){
							// we cannot intantiate the class - throw the original Axis fault
							throw f;
						} catch (java.lang.ClassNotFoundException e) {
							// we cannot intantiate the class - throw the original Axis fault
							throw f;
						}catch (java.lang.NoSuchMethodException e) {
							// we cannot intantiate the class - throw the original Axis fault
							throw f;
						} catch (java.lang.reflect.InvocationTargetException e) {
							// we cannot intantiate the class - throw the original Axis fault
							throw f;
						}  catch (java.lang.IllegalAccessException e) {
							// we cannot intantiate the class - throw the original Axis fault
							throw f;
						}   catch (java.lang.InstantiationException e) {
							// we cannot intantiate the class - throw the original Axis fault
							throw f;
						}
					}else{
						throw f;
					}
				}else{
					throw f;
				}
			} finally {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see es.upm.fi.sos.t3.flightbooking.FlightBookingWS#startgetDestinationList
	 * @param origin5

*/
	public  void startgetDestinationList(

			es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.Origin origin5,

			final es.upm.fi.sos.t3.flightbooking.FlightBookingWSCallbackHandler callback)

		throws java.rmi.RemoteException{

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
		_operationClient.getOptions().setAction("urn:getDestinationList");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);



		addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");



		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env=null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


		//Style is Doc.


		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
				origin5,
				optimizeContent(new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es",
						"getDestinationList")));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);



		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
				try {
					org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
						es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.DestinationList.class,
						getEnvelopeNamespaces(resultEnv));
					callback.receiveResultgetDestinationList(
						(es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.DestinationList)object);

				} catch (org.apache.axis2.AxisFault e) {
					callback.receiveErrorgetDestinationList(e);
				}
			}

			public void onError(java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt!=null){
						if (faultExceptionNameMap.containsKey(faultElt.getQName())){
							//make the fault by reflection
							try{
								java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
								java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								java.lang.Exception ex=
									(java.lang.Exception) exceptionClass.newInstance();
								//message class
								java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
								java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
								java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[]{messageClass});
								m.invoke(ex,new java.lang.Object[]{messageObject});

								if (ex instanceof es.upm.fi.sos.t3.flightbooking.NotValidOriginError){
									callback.receiveErrorgetDestinationList((es.upm.fi.sos.t3.flightbooking.NotValidOriginError)ex);
									return;
								}


								callback.receiveErrorgetDestinationList(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch(java.lang.ClassCastException e){
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetDestinationList(f);
							} catch (java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetDestinationList(f);
							} catch (java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetDestinationList(f);
							} catch (java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetDestinationList(f);
							} catch (java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetDestinationList(f);
							} catch (java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetDestinationList(f);
							} catch (org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetDestinationList(f);
							}
						} else {
							callback.receiveErrorgetDestinationList(f);
						}
					} else {
						callback.receiveErrorgetDestinationList(f);
					}
				} else {
					callback.receiveErrorgetDestinationList(error);
				}
			}

			public void onFault(org.apache.axis2.context.MessageContext faultContext) {
				org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorgetDestinationList(axisFault);
				}
			}
		});


		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if ( _operations[2].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[2].setMessageReceiver(
					_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);

			}

	/**
	 * Auto generated method signature
	 * 
	 * @see es.upm.fi.sos.t3.flightbooking.FlightBookingWS#cancelFlight
	 * @param cancellingFlight7

	 * @throws es.upm.fi.sos.t3.flightbooking.NotValidOriginError : 
	 * @throws es.upm.fi.sos.t3.flightbooking.NotValidDestinationError : 
	 * @throws es.upm.fi.sos.t3.flightbooking.NotEnoughSeatsError : 
	 * @throws es.upm.fi.sos.t3.flightbooking.NotValidSeatError : 
	 */



	public  es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.CancellingFlightResponse cancelFlight(

			es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.CancellingFlight cancellingFlight7)


		throws java.rmi.RemoteException


		,es.upm.fi.sos.t3.flightbooking.NotValidOriginError
		,es.upm.fi.sos.t3.flightbooking.NotValidDestinationError
		,es.upm.fi.sos.t3.flightbooking.NotEnoughSeatsError
		,es.upm.fi.sos.t3.flightbooking.NotValidSeatError{
			org.apache.axis2.context.MessageContext _messageContext = null;
			try{
				org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
				_operationClient.getOptions().setAction("urn:cancelFlight");
				_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);



				addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");


				// create a message context
				_messageContext = new org.apache.axis2.context.MessageContext();



				// create SOAP envelope with that payload
				org.apache.axiom.soap.SOAPEnvelope env = null;


				env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
						cancellingFlight7,
						optimizeContent(new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es",
								"cancelFlight")));

				//adding SOAP soap_headers
				_serviceClient.addHeadersToEnvelope(env);
				// set the message context with that soap envelope
				_messageContext.setEnvelope(env);

				// add the message contxt to the operation client
				_operationClient.addMessageContext(_messageContext);

				//execute the operation client
				_operationClient.execute(true);


				org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
						org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
				org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


				java.lang.Object object = fromOM(
						_returnEnv.getBody().getFirstElement() ,
						es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.CancellingFlightResponse.class,
						getEnvelopeNamespaces(_returnEnv));


				return (es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.CancellingFlightResponse)object;

			}catch(org.apache.axis2.AxisFault f){

				org.apache.axiom.om.OMElement faultElt = f.getDetail();
				if (faultElt!=null){
					if (faultExceptionNameMap.containsKey(faultElt.getQName())){
						//make the fault by reflection
						try{
							java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
							java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
							java.lang.Exception ex=
								(java.lang.Exception) exceptionClass.newInstance();
							//message class
							java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
							java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
							java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
							java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
									new java.lang.Class[]{messageClass});
							m.invoke(ex,new java.lang.Object[]{messageObject});

							if (ex instanceof es.upm.fi.sos.t3.flightbooking.NotValidOriginError){
								throw (es.upm.fi.sos.t3.flightbooking.NotValidOriginError)ex;
							}

							if (ex instanceof es.upm.fi.sos.t3.flightbooking.NotValidDestinationError){
								throw (es.upm.fi.sos.t3.flightbooking.NotValidDestinationError)ex;
							}

							if (ex instanceof es.upm.fi.sos.t3.flightbooking.NotEnoughSeatsError){
								throw (es.upm.fi.sos.t3.flightbooking.NotEnoughSeatsError)ex;
							}

							if (ex instanceof es.upm.fi.sos.t3.flightbooking.NotValidSeatError){
								throw (es.upm.fi.sos.t3.flightbooking.NotValidSeatError)ex;
							}


							throw new java.rmi.RemoteException(ex.getMessage(), ex);
						}catch(java.lang.ClassCastException e){
							// we cannot intantiate the class - throw the original Axis fault
							throw f;
						} catch (java.lang.ClassNotFoundException e) {
							// we cannot intantiate the class - throw the original Axis fault
							throw f;
						}catch (java.lang.NoSuchMethodException e) {
							// we cannot intantiate the class - throw the original Axis fault
							throw f;
						} catch (java.lang.reflect.InvocationTargetException e) {
							// we cannot intantiate the class - throw the original Axis fault
							throw f;
						}  catch (java.lang.IllegalAccessException e) {
							// we cannot intantiate the class - throw the original Axis fault
							throw f;
						}   catch (java.lang.InstantiationException e) {
							// we cannot intantiate the class - throw the original Axis fault
							throw f;
						}
					}else{
						throw f;
					}
				}else{
					throw f;
				}
			} finally {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see es.upm.fi.sos.t3.flightbooking.FlightBookingWS#startcancelFlight
	 * @param cancellingFlight7

*/
	public  void startcancelFlight(

			es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.CancellingFlight cancellingFlight7,

			final es.upm.fi.sos.t3.flightbooking.FlightBookingWSCallbackHandler callback)

		throws java.rmi.RemoteException{

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
		_operationClient.getOptions().setAction("urn:cancelFlight");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);



		addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");



		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env=null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


		//Style is Doc.


		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
				cancellingFlight7,
				optimizeContent(new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es",
						"cancelFlight")));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);



		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
				try {
					org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
						es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.CancellingFlightResponse.class,
						getEnvelopeNamespaces(resultEnv));
					callback.receiveResultcancelFlight(
						(es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.CancellingFlightResponse)object);

				} catch (org.apache.axis2.AxisFault e) {
					callback.receiveErrorcancelFlight(e);
				}
			}

			public void onError(java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt!=null){
						if (faultExceptionNameMap.containsKey(faultElt.getQName())){
							//make the fault by reflection
							try{
								java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
								java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								java.lang.Exception ex=
									(java.lang.Exception) exceptionClass.newInstance();
								//message class
								java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
								java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
								java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[]{messageClass});
								m.invoke(ex,new java.lang.Object[]{messageObject});

								if (ex instanceof es.upm.fi.sos.t3.flightbooking.NotValidOriginError){
									callback.receiveErrorcancelFlight((es.upm.fi.sos.t3.flightbooking.NotValidOriginError)ex);
									return;
								}

								if (ex instanceof es.upm.fi.sos.t3.flightbooking.NotValidDestinationError){
									callback.receiveErrorcancelFlight((es.upm.fi.sos.t3.flightbooking.NotValidDestinationError)ex);
									return;
								}

								if (ex instanceof es.upm.fi.sos.t3.flightbooking.NotEnoughSeatsError){
									callback.receiveErrorcancelFlight((es.upm.fi.sos.t3.flightbooking.NotEnoughSeatsError)ex);
									return;
								}

								if (ex instanceof es.upm.fi.sos.t3.flightbooking.NotValidSeatError){
									callback.receiveErrorcancelFlight((es.upm.fi.sos.t3.flightbooking.NotValidSeatError)ex);
									return;
								}


								callback.receiveErrorcancelFlight(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch(java.lang.ClassCastException e){
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcancelFlight(f);
							} catch (java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcancelFlight(f);
							} catch (java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcancelFlight(f);
							} catch (java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcancelFlight(f);
							} catch (java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcancelFlight(f);
							} catch (java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcancelFlight(f);
							} catch (org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcancelFlight(f);
							}
						} else {
							callback.receiveErrorcancelFlight(f);
						}
					} else {
						callback.receiveErrorcancelFlight(f);
					}
				} else {
					callback.receiveErrorcancelFlight(error);
				}
			}

			public void onFault(org.apache.axis2.context.MessageContext faultContext) {
				org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorcancelFlight(axisFault);
				}
			}
		});


		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if ( _operations[3].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[3].setMessageReceiver(
					_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);

			}

	/**
	 * Auto generated method signature
	 * 
	 * @see es.upm.fi.sos.t3.flightbooking.FlightBookingWS#getOriginList
	 */



	public  es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.OriginList getOriginList(

			)


		throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try{
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
			_operationClient.getOptions().setAction("urn:getOriginList");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);



			addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");


			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();



			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			//Style is taken to be "document". No input parameters
			// according to the WS-Basic profile in this case we have to send an empty soap message
			org.apache.axiom.soap.SOAPFactory factory = getFactory(_operationClient.getOptions().getSoapVersionURI());
			env = factory.getDefaultEnvelope();

			//adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			//execute the operation client
			_operationClient.execute(true);


			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
					org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement() ,
					es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.OriginList.class,
					getEnvelopeNamespaces(_returnEnv));


			return (es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.OriginList)object;

		}catch(org.apache.axis2.AxisFault f){

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt!=null){
				if (faultExceptionNameMap.containsKey(faultElt.getQName())){
					//make the fault by reflection
					try{
						java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.Exception ex=
							(java.lang.Exception) exceptionClass.newInstance();
						//message class
						java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[]{messageClass});
						m.invoke(ex,new java.lang.Object[]{messageObject});


						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					}catch(java.lang.ClassCastException e){
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}  catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}   catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				}else{
					throw f;
				}
			}else{
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see es.upm.fi.sos.t3.flightbooking.FlightBookingWS#startgetOriginList
	 */
	public  void startgetOriginList(



			final es.upm.fi.sos.t3.flightbooking.FlightBookingWSCallbackHandler callback)

		throws java.rmi.RemoteException{

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
		_operationClient.getOptions().setAction("urn:getOriginList");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);



		addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");



		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env=null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


		//Style is taken to be "document". No input parameters
		// according to the WS-Basic profile in this case we have to send an empty soap message
		org.apache.axiom.soap.SOAPFactory factory = getFactory(_operationClient.getOptions().getSoapVersionURI());
		env = factory.getDefaultEnvelope();

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);



		_operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
				try {
					org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

					java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
						es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.OriginList.class,
						getEnvelopeNamespaces(resultEnv));
					callback.receiveResultgetOriginList(
						(es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.OriginList)object);

				} catch (org.apache.axis2.AxisFault e) {
					callback.receiveErrorgetOriginList(e);
				}
			}

			public void onError(java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					org.apache.axiom.om.OMElement faultElt = f.getDetail();
					if (faultElt!=null){
						if (faultExceptionNameMap.containsKey(faultElt.getQName())){
							//make the fault by reflection
							try{
								java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
								java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
								java.lang.Exception ex=
									(java.lang.Exception) exceptionClass.newInstance();
								//message class
								java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
								java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
								java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
								java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
										new java.lang.Class[]{messageClass});
								m.invoke(ex,new java.lang.Object[]{messageObject});


								callback.receiveErrorgetOriginList(new java.rmi.RemoteException(ex.getMessage(), ex));
							} catch(java.lang.ClassCastException e){
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetOriginList(f);
							} catch (java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetOriginList(f);
							} catch (java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetOriginList(f);
							} catch (java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetOriginList(f);
							} catch (java.lang.IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetOriginList(f);
							} catch (java.lang.InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetOriginList(f);
							} catch (org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetOriginList(f);
							}
						} else {
							callback.receiveErrorgetOriginList(f);
						}
					} else {
						callback.receiveErrorgetOriginList(f);
					}
				} else {
					callback.receiveErrorgetOriginList(error);
				}
			}

			public void onFault(org.apache.axis2.context.MessageContext faultContext) {
				org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorgetOriginList(axisFault);
				}
			}
		});


		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if ( _operations[4].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[4].setMessageReceiver(
					_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);

			}



	/**
	 *  A utility method that copies the namepaces from the SOAPEnvelope
	 */
	private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
		java.util.Map returnMap = new java.util.HashMap();
		java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
		while (namespaceIterator.hasNext()) {
			org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
			returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
		}
		return returnMap;
	}



	private javax.xml.namespace.QName[] opNameArray = null;
	private boolean optimizeContent(javax.xml.namespace.QName opName) {


		if (opNameArray == null) {
			return false;
		}
		for (int i = 0; i < opNameArray.length; i++) {
			if (opName.equals(opNameArray[i])) {
				return true;   
			}
		}
		return false;
	}
	//http://adapt08.ls.fi.upm.es:8080/axis2/services/FlightBookingWS
	public static class BookingFlightResponse
			implements org.apache.axis2.databinding.ADBBean{

			public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
					"http://flightbooking.t3.sos.fi.upm.es",
					"bookingFlightResponse",
					"ns1");



			private static java.lang.String generatePrefix(java.lang.String namespace) {
				if(namespace.equals("http://flightbooking.t3.sos.fi.upm.es")){
					return "ns1";
				}
				return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
			}



			/**
			 * field for BookingResult
			 */


			protected boolean localBookingResult ;


			/**
			 * Auto generated getter method
			 * @return boolean
			 */
			public  boolean getBookingResult(){
				return localBookingResult;
			}



			/**
			 * Auto generated setter method
			 * @param param BookingResult
			 */
			public void setBookingResult(boolean param){

				this.localBookingResult=param;


			}


			/**
			 * field for Price
			 */


			protected double localPrice ;


			/**
			 * Auto generated getter method
			 * @return double
			 */
			public  double getPrice(){
				return localPrice;
			}



			/**
			 * Auto generated setter method
			 * @param param Price
			 */
			public void setPrice(double param){

				this.localPrice=param;


			}


			/**
			 * isReaderMTOMAware
			 * @return true if the reader supports MTOM
			 */
			public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
				boolean isReaderMTOMAware = false;

				try{
					isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
				}catch(java.lang.IllegalArgumentException e){
					isReaderMTOMAware = false;
				}
				return isReaderMTOMAware;
			}


			/**
			 *
			 * @param parentQName
			 * @param factory
			 * @return org.apache.axiom.om.OMElement
			 */
			public org.apache.axiom.om.OMElement getOMElement (
					final javax.xml.namespace.QName parentQName,
					final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



				org.apache.axiom.om.OMDataSource dataSource =
					new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

						public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
							BookingFlightResponse.this.serialize(MY_QNAME,factory,xmlWriter);
						}
					};
				return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
						MY_QNAME,factory,dataSource);

					}

			public void serialize(final javax.xml.namespace.QName parentQName,
					final org.apache.axiom.om.OMFactory factory,
					org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
				serialize(parentQName,factory,xmlWriter,false);
			}

			public void serialize(final javax.xml.namespace.QName parentQName,
					final org.apache.axiom.om.OMFactory factory,
					org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
					boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{




				java.lang.String prefix = null;
				java.lang.String namespace = null;


				prefix = parentQName.getPrefix();
				namespace = parentQName.getNamespaceURI();

				if ((namespace != null) && (namespace.trim().length() > 0)) {
					java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
					if (writerPrefix != null) {
						xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
					} else {
						if (prefix == null) {
							prefix = generatePrefix(namespace);
						}

						xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);
					}
				} else {
					xmlWriter.writeStartElement(parentQName.getLocalPart());
				}

				if (serializeType){


					java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://flightbooking.t3.sos.fi.upm.es");
					if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
						writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
								namespacePrefix+":bookingFlightResponse",
								xmlWriter);
					} else {
						writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
								"bookingFlightResponse",
								xmlWriter);
					}


				}

				namespace = "http://flightbooking.t3.sos.fi.upm.es";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"bookingResult", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"bookingResult");
					}

				} else {
					xmlWriter.writeStartElement("bookingResult");
				}

				if (false) {

					throw new org.apache.axis2.databinding.ADBException("bookingResult cannot be null!!");

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBookingResult));
				}

				xmlWriter.writeEndElement();

				namespace = "http://flightbooking.t3.sos.fi.upm.es";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"price", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"price");
					}

				} else {
					xmlWriter.writeStartElement("price");
				}

				if (java.lang.Double.isNaN(localPrice)) {

					throw new org.apache.axis2.databinding.ADBException("price cannot be null!!");

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPrice));
				}

				xmlWriter.writeEndElement();

				xmlWriter.writeEndElement();


			}

			/**
			 * Util method to write an attribute with the ns prefix
			 */
			private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
					java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
				if (xmlWriter.getPrefix(namespace) == null) {
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				}

				xmlWriter.writeAttribute(namespace,attName,attValue);

			}

			/**
			 * Util method to write an attribute without the ns prefix
			 */
			private void writeAttribute(java.lang.String namespace,java.lang.String attName,
					java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
				if (namespace.equals(""))
				{
					xmlWriter.writeAttribute(attName,attValue);
				}
				else
				{
					registerPrefix(xmlWriter, namespace);
					xmlWriter.writeAttribute(namespace,attName,attValue);
				}
			}


			/**
			 * Util method to write an attribute without the ns prefix
			 */
			private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
					javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

				java.lang.String attributeNamespace = qname.getNamespaceURI();
				java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
				if (attributePrefix == null) {
					attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
				}
				java.lang.String attributeValue;
				if (attributePrefix.trim().length() > 0) {
					attributeValue = attributePrefix + ":" + qname.getLocalPart();
				} else {
					attributeValue = qname.getLocalPart();
				}

				if (namespace.equals("")) {
					xmlWriter.writeAttribute(attName, attributeValue);
				} else {
					registerPrefix(xmlWriter, namespace);
					xmlWriter.writeAttribute(namespace, attName, attributeValue);
				}
			}
			/**
			 *  method to handle Qnames
			 */

			private void writeQName(javax.xml.namespace.QName qname,
					javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
				java.lang.String namespaceURI = qname.getNamespaceURI();
				if (namespaceURI != null) {
					java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
					if (prefix == null) {
						prefix = generatePrefix(namespaceURI);
						xmlWriter.writeNamespace(prefix, namespaceURI);
						xmlWriter.setPrefix(prefix,namespaceURI);
					}

					if (prefix.trim().length() > 0){
						xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
					} else {
						// i.e this is the default namespace
						xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
					}

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}
			}

			private void writeQNames(javax.xml.namespace.QName[] qnames,
					javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

				if (qnames != null) {
					// we have to store this data until last moment since it is not possible to write any
					// namespace data after writing the charactor data
					java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
					java.lang.String namespaceURI = null;
					java.lang.String prefix = null;

					for (int i = 0; i < qnames.length; i++) {
						if (i > 0) {
							stringToWrite.append(" ");
						}
						namespaceURI = qnames[i].getNamespaceURI();
						if (namespaceURI != null) {
							prefix = xmlWriter.getPrefix(namespaceURI);
							if ((prefix == null) || (prefix.length() == 0)) {
								prefix = generatePrefix(namespaceURI);
								xmlWriter.writeNamespace(prefix, namespaceURI);
								xmlWriter.setPrefix(prefix,namespaceURI);
							}

							if (prefix.trim().length() > 0){
								stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
							} else {
								stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
							}
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					}
					xmlWriter.writeCharacters(stringToWrite.toString());
				}

			}


			/**
			 * Register a namespace prefix
			 */
			private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
				java.lang.String prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
						prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
					}

					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);
				}

				return prefix;
			}



			/**
			 * databinding method to get an XML representation of this object
			 *
			 */
			public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException{



				java.util.ArrayList elementList = new java.util.ArrayList();
				java.util.ArrayList attribList = new java.util.ArrayList();


				elementList.add(new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es",
							"bookingResult"));

				elementList.add(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBookingResult));

				elementList.add(new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es",
							"price"));

				elementList.add(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPrice));


				return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());



			}



			/**
			 *  Factory class that keeps the parse method
			 */
			public static class Factory{




				/**
				 * static method to create the object
				 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
				 *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
				 * Postcondition: If this object is an element, the reader is positioned at its end element
				 *                If this object is a complex type, the reader is positioned at the end element of its outer element
				 */
				public static BookingFlightResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
					BookingFlightResponse object =
						new BookingFlightResponse();

					int event;
					java.lang.String nillableValue = null;
					java.lang.String prefix ="";
					java.lang.String namespaceuri ="";
					try {

						while (!reader.isStartElement() && !reader.isEndElement())
							reader.next();


						if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
							java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
									"type");
							if (fullTypeName!=null){
								java.lang.String nsPrefix = null;
								if (fullTypeName.indexOf(":") > -1){
									nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
								}
								nsPrefix = nsPrefix==null?"":nsPrefix;

								java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);

								if (!"bookingFlightResponse".equals(type)){
									//find namespace for the prefix
									java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
									return (BookingFlightResponse)ExtensionMapper.getTypeObject(
											nsUri,type,reader);
								}


							}


						}




						// Note all attributes that were handled. Used to differ normal attributes
						// from anyAttributes.
						java.util.Vector handledAttributes = new java.util.Vector();




						reader.next();


						while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

						if (reader.isStartElement() && new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","bookingResult").equals(reader.getName())){

							java.lang.String content = reader.getElementText();

							object.setBookingResult(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

							reader.next();

						}  // End of if for expected property start element

						else{
							// A start element we are not expecting indicates an invalid parameter was passed
							throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
						}


						while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

						if (reader.isStartElement() && new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","price").equals(reader.getName())){

							java.lang.String content = reader.getElementText();

							object.setPrice(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));

							reader.next();

						}  // End of if for expected property start element

						else{
							// A start element we are not expecting indicates an invalid parameter was passed
							throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
						}

						while (!reader.isStartElement() && !reader.isEndElement())
							reader.next();

						if (reader.isStartElement())
							// A start element we are not expecting indicates a trailing invalid property
							throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());




					} catch (javax.xml.stream.XMLStreamException e) {
						throw new java.lang.Exception(e);
					}

					return object;
				}

			}//end of factory class



	}


	public static class BookingFlight
			implements org.apache.axis2.databinding.ADBBean{

			public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
					"http://flightbooking.t3.sos.fi.upm.es",
					"bookingFlight",
					"ns1");



			private static java.lang.String generatePrefix(java.lang.String namespace) {
				if(namespace.equals("http://flightbooking.t3.sos.fi.upm.es")){
					return "ns1";
				}
				return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
			}



			/**
			 * field for Origin
			 */


			protected java.lang.String localOrigin ;


			/**
			 * Auto generated getter method
			 * @return java.lang.String
			 */
			public  java.lang.String getOrigin(){
				return localOrigin;
			}



			/**
			 * Auto generated setter method
			 * @param param Origin
			 */
			public void setOrigin(java.lang.String param){

				this.localOrigin=param;


			}


			/**
			 * field for Destination
			 */


			protected java.lang.String localDestination ;


			/**
			 * Auto generated getter method
			 * @return java.lang.String
			 */
			public  java.lang.String getDestination(){
				return localDestination;
			}



			/**
			 * Auto generated setter method
			 * @param param Destination
			 */
			public void setDestination(java.lang.String param){

				this.localDestination=param;


			}


			/**
			 * field for Seat
			 */


			protected int localSeat ;


			/**
			 * Auto generated getter method
			 * @return int
			 */
			public  int getSeat(){
				return localSeat;
			}



			/**
			 * Auto generated setter method
			 * @param param Seat
			 */
			public void setSeat(int param){

				this.localSeat=param;


			}


			/**
			 * isReaderMTOMAware
			 * @return true if the reader supports MTOM
			 */
			public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
				boolean isReaderMTOMAware = false;

				try{
					isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
				}catch(java.lang.IllegalArgumentException e){
					isReaderMTOMAware = false;
				}
				return isReaderMTOMAware;
			}


			/**
			 *
			 * @param parentQName
			 * @param factory
			 * @return org.apache.axiom.om.OMElement
			 */
			public org.apache.axiom.om.OMElement getOMElement (
					final javax.xml.namespace.QName parentQName,
					final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



				org.apache.axiom.om.OMDataSource dataSource =
					new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

						public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
							BookingFlight.this.serialize(MY_QNAME,factory,xmlWriter);
						}
					};
				return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
						MY_QNAME,factory,dataSource);

					}

			public void serialize(final javax.xml.namespace.QName parentQName,
					final org.apache.axiom.om.OMFactory factory,
					org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
				serialize(parentQName,factory,xmlWriter,false);
			}

			public void serialize(final javax.xml.namespace.QName parentQName,
					final org.apache.axiom.om.OMFactory factory,
					org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
					boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{




				java.lang.String prefix = null;
				java.lang.String namespace = null;


				prefix = parentQName.getPrefix();
				namespace = parentQName.getNamespaceURI();

				if ((namespace != null) && (namespace.trim().length() > 0)) {
					java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
					if (writerPrefix != null) {
						xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
					} else {
						if (prefix == null) {
							prefix = generatePrefix(namespace);
						}

						xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);
					}
				} else {
					xmlWriter.writeStartElement(parentQName.getLocalPart());
				}

				if (serializeType){


					java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://flightbooking.t3.sos.fi.upm.es");
					if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
						writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
								namespacePrefix+":bookingFlight",
								xmlWriter);
					} else {
						writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
								"bookingFlight",
								xmlWriter);
					}


				}

				namespace = "http://flightbooking.t3.sos.fi.upm.es";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"origin", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"origin");
					}

				} else {
					xmlWriter.writeStartElement("origin");
				}


				if (localOrigin==null){
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("origin cannot be null!!");

				}else{


					xmlWriter.writeCharacters(localOrigin);

				}

				xmlWriter.writeEndElement();

				namespace = "http://flightbooking.t3.sos.fi.upm.es";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"destination", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"destination");
					}

				} else {
					xmlWriter.writeStartElement("destination");
				}


				if (localDestination==null){
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("destination cannot be null!!");

				}else{


					xmlWriter.writeCharacters(localDestination);

				}

				xmlWriter.writeEndElement();

				namespace = "http://flightbooking.t3.sos.fi.upm.es";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"seat", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"seat");
					}

				} else {
					xmlWriter.writeStartElement("seat");
				}

				if (localSeat==java.lang.Integer.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("seat cannot be null!!");

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSeat));
				}

				xmlWriter.writeEndElement();

				xmlWriter.writeEndElement();


			}

			/**
			 * Util method to write an attribute with the ns prefix
			 */
			private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
					java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
				if (xmlWriter.getPrefix(namespace) == null) {
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				}

				xmlWriter.writeAttribute(namespace,attName,attValue);

			}

			/**
			 * Util method to write an attribute without the ns prefix
			 */
			private void writeAttribute(java.lang.String namespace,java.lang.String attName,
					java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
				if (namespace.equals(""))
				{
					xmlWriter.writeAttribute(attName,attValue);
				}
				else
				{
					registerPrefix(xmlWriter, namespace);
					xmlWriter.writeAttribute(namespace,attName,attValue);
				}
			}


			/**
			 * Util method to write an attribute without the ns prefix
			 */
			private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
					javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

				java.lang.String attributeNamespace = qname.getNamespaceURI();
				java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
				if (attributePrefix == null) {
					attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
				}
				java.lang.String attributeValue;
				if (attributePrefix.trim().length() > 0) {
					attributeValue = attributePrefix + ":" + qname.getLocalPart();
				} else {
					attributeValue = qname.getLocalPart();
				}

				if (namespace.equals("")) {
					xmlWriter.writeAttribute(attName, attributeValue);
				} else {
					registerPrefix(xmlWriter, namespace);
					xmlWriter.writeAttribute(namespace, attName, attributeValue);
				}
			}
			/**
			 *  method to handle Qnames
			 */

			private void writeQName(javax.xml.namespace.QName qname,
					javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
				java.lang.String namespaceURI = qname.getNamespaceURI();
				if (namespaceURI != null) {
					java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
					if (prefix == null) {
						prefix = generatePrefix(namespaceURI);
						xmlWriter.writeNamespace(prefix, namespaceURI);
						xmlWriter.setPrefix(prefix,namespaceURI);
					}

					if (prefix.trim().length() > 0){
						xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
					} else {
						// i.e this is the default namespace
						xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
					}

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}
			}

			private void writeQNames(javax.xml.namespace.QName[] qnames,
					javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

				if (qnames != null) {
					// we have to store this data until last moment since it is not possible to write any
					// namespace data after writing the charactor data
					java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
					java.lang.String namespaceURI = null;
					java.lang.String prefix = null;

					for (int i = 0; i < qnames.length; i++) {
						if (i > 0) {
							stringToWrite.append(" ");
						}
						namespaceURI = qnames[i].getNamespaceURI();
						if (namespaceURI != null) {
							prefix = xmlWriter.getPrefix(namespaceURI);
							if ((prefix == null) || (prefix.length() == 0)) {
								prefix = generatePrefix(namespaceURI);
								xmlWriter.writeNamespace(prefix, namespaceURI);
								xmlWriter.setPrefix(prefix,namespaceURI);
							}

							if (prefix.trim().length() > 0){
								stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
							} else {
								stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
							}
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					}
					xmlWriter.writeCharacters(stringToWrite.toString());
				}

			}


			/**
			 * Register a namespace prefix
			 */
			private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
				java.lang.String prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
						prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
					}

					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);
				}

				return prefix;
			}



			/**
			 * databinding method to get an XML representation of this object
			 *
			 */
			public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException{



				java.util.ArrayList elementList = new java.util.ArrayList();
				java.util.ArrayList attribList = new java.util.ArrayList();


				elementList.add(new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es",
							"origin"));

				if (localOrigin != null){
					elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOrigin));
				} else {
					throw new org.apache.axis2.databinding.ADBException("origin cannot be null!!");
				}

				elementList.add(new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es",
							"destination"));

				if (localDestination != null){
					elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDestination));
				} else {
					throw new org.apache.axis2.databinding.ADBException("destination cannot be null!!");
				}

				elementList.add(new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es",
							"seat"));

				elementList.add(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSeat));


				return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());



			}



			/**
			 *  Factory class that keeps the parse method
			 */
			public static class Factory{




				/**
				 * static method to create the object
				 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
				 *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
				 * Postcondition: If this object is an element, the reader is positioned at its end element
				 *                If this object is a complex type, the reader is positioned at the end element of its outer element
				 */
				public static BookingFlight parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
					BookingFlight object =
						new BookingFlight();

					int event;
					java.lang.String nillableValue = null;
					java.lang.String prefix ="";
					java.lang.String namespaceuri ="";
					try {

						while (!reader.isStartElement() && !reader.isEndElement())
							reader.next();


						if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
							java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
									"type");
							if (fullTypeName!=null){
								java.lang.String nsPrefix = null;
								if (fullTypeName.indexOf(":") > -1){
									nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
								}
								nsPrefix = nsPrefix==null?"":nsPrefix;

								java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);

								if (!"bookingFlight".equals(type)){
									//find namespace for the prefix
									java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
									return (BookingFlight)ExtensionMapper.getTypeObject(
											nsUri,type,reader);
								}


							}


						}




						// Note all attributes that were handled. Used to differ normal attributes
						// from anyAttributes.
						java.util.Vector handledAttributes = new java.util.Vector();




						reader.next();


						while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

						if (reader.isStartElement() && new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","origin").equals(reader.getName())){

							java.lang.String content = reader.getElementText();

							object.setOrigin(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

							reader.next();

						}  // End of if for expected property start element

						else{
							// A start element we are not expecting indicates an invalid parameter was passed
							throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
						}


						while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

						if (reader.isStartElement() && new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","destination").equals(reader.getName())){

							java.lang.String content = reader.getElementText();

							object.setDestination(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

							reader.next();

						}  // End of if for expected property start element

						else{
							// A start element we are not expecting indicates an invalid parameter was passed
							throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
						}


						while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

						if (reader.isStartElement() && new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","seat").equals(reader.getName())){

							java.lang.String content = reader.getElementText();

							object.setSeat(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

							reader.next();

						}  // End of if for expected property start element

						else{
							// A start element we are not expecting indicates an invalid parameter was passed
							throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
						}

						while (!reader.isStartElement() && !reader.isEndElement())
							reader.next();

						if (reader.isStartElement())
							// A start element we are not expecting indicates a trailing invalid property
							throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());




					} catch (javax.xml.stream.XMLStreamException e) {
						throw new java.lang.Exception(e);
					}

					return object;
				}

			}//end of factory class



	}


	public static class NotValidOriginErrorMessage
			implements org.apache.axis2.databinding.ADBBean{

			public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
					"http://flightbooking.t3.sos.fi.upm.es",
					"notValidOriginErrorMessage",
					"ns1");



			private static java.lang.String generatePrefix(java.lang.String namespace) {
				if(namespace.equals("http://flightbooking.t3.sos.fi.upm.es")){
					return "ns1";
				}
				return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
			}



			/**
			 * field for NotValidOriginErrorMessage
			 */


			protected java.lang.String localNotValidOriginErrorMessage ;


			/**
			 * Auto generated getter method
			 * @return java.lang.String
			 */
			public  java.lang.String getNotValidOriginErrorMessage(){
				return localNotValidOriginErrorMessage;
			}



			/**
			 * Auto generated setter method
			 * @param param NotValidOriginErrorMessage
			 */
			public void setNotValidOriginErrorMessage(java.lang.String param){

				this.localNotValidOriginErrorMessage=param;


			}


			/**
			 * isReaderMTOMAware
			 * @return true if the reader supports MTOM
			 */
			public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
				boolean isReaderMTOMAware = false;

				try{
					isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
				}catch(java.lang.IllegalArgumentException e){
					isReaderMTOMAware = false;
				}
				return isReaderMTOMAware;
			}


			/**
			 *
			 * @param parentQName
			 * @param factory
			 * @return org.apache.axiom.om.OMElement
			 */
			public org.apache.axiom.om.OMElement getOMElement (
					final javax.xml.namespace.QName parentQName,
					final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



				org.apache.axiom.om.OMDataSource dataSource =
					new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

						public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
							NotValidOriginErrorMessage.this.serialize(MY_QNAME,factory,xmlWriter);
						}
					};
				return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
						MY_QNAME,factory,dataSource);

					}

			public void serialize(final javax.xml.namespace.QName parentQName,
					final org.apache.axiom.om.OMFactory factory,
					org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
				serialize(parentQName,factory,xmlWriter,false);
			}

			public void serialize(final javax.xml.namespace.QName parentQName,
					final org.apache.axiom.om.OMFactory factory,
					org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
					boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{


				//We can safely assume an element has only one type associated with it

				java.lang.String namespace = "http://flightbooking.t3.sos.fi.upm.es";
				java.lang.String localName = "notValidOriginErrorMessage";

				if (! namespace.equals("")) {
					java.lang.String prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix, localName, namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace, localName);
					}

				} else {
					xmlWriter.writeStartElement(localName);
				}

				// add the type details if this is used in a simple type
				if (serializeType){
					java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://flightbooking.t3.sos.fi.upm.es");
					if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
						writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
								namespacePrefix+":notValidOriginErrorMessage",
								xmlWriter);
					} else {
						writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
								"notValidOriginErrorMessage",
								xmlWriter);
					}
				}

				if (localNotValidOriginErrorMessage==null){

					throw new org.apache.axis2.databinding.ADBException("Value cannot be null !!");

				}else{

					xmlWriter.writeCharacters(localNotValidOriginErrorMessage);

				}

				xmlWriter.writeEndElement();



			}

			/**
			 * Util method to write an attribute with the ns prefix
			 */
			private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
					java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
				if (xmlWriter.getPrefix(namespace) == null) {
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				}

				xmlWriter.writeAttribute(namespace,attName,attValue);

			}

			/**
			 * Util method to write an attribute without the ns prefix
			 */
			private void writeAttribute(java.lang.String namespace,java.lang.String attName,
					java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
				if (namespace.equals(""))
				{
					xmlWriter.writeAttribute(attName,attValue);
				}
				else
				{
					registerPrefix(xmlWriter, namespace);
					xmlWriter.writeAttribute(namespace,attName,attValue);
				}
			}


			/**
			 * Util method to write an attribute without the ns prefix
			 */
			private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
					javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

				java.lang.String attributeNamespace = qname.getNamespaceURI();
				java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
				if (attributePrefix == null) {
					attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
				}
				java.lang.String attributeValue;
				if (attributePrefix.trim().length() > 0) {
					attributeValue = attributePrefix + ":" + qname.getLocalPart();
				} else {
					attributeValue = qname.getLocalPart();
				}

				if (namespace.equals("")) {
					xmlWriter.writeAttribute(attName, attributeValue);
				} else {
					registerPrefix(xmlWriter, namespace);
					xmlWriter.writeAttribute(namespace, attName, attributeValue);
				}
			}
			/**
			 *  method to handle Qnames
			 */

			private void writeQName(javax.xml.namespace.QName qname,
					javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
				java.lang.String namespaceURI = qname.getNamespaceURI();
				if (namespaceURI != null) {
					java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
					if (prefix == null) {
						prefix = generatePrefix(namespaceURI);
						xmlWriter.writeNamespace(prefix, namespaceURI);
						xmlWriter.setPrefix(prefix,namespaceURI);
					}

					if (prefix.trim().length() > 0){
						xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
					} else {
						// i.e this is the default namespace
						xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
					}

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}
			}

			private void writeQNames(javax.xml.namespace.QName[] qnames,
					javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

				if (qnames != null) {
					// we have to store this data until last moment since it is not possible to write any
					// namespace data after writing the charactor data
					java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
					java.lang.String namespaceURI = null;
					java.lang.String prefix = null;

					for (int i = 0; i < qnames.length; i++) {
						if (i > 0) {
							stringToWrite.append(" ");
						}
						namespaceURI = qnames[i].getNamespaceURI();
						if (namespaceURI != null) {
							prefix = xmlWriter.getPrefix(namespaceURI);
							if ((prefix == null) || (prefix.length() == 0)) {
								prefix = generatePrefix(namespaceURI);
								xmlWriter.writeNamespace(prefix, namespaceURI);
								xmlWriter.setPrefix(prefix,namespaceURI);
							}

							if (prefix.trim().length() > 0){
								stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
							} else {
								stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
							}
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					}
					xmlWriter.writeCharacters(stringToWrite.toString());
				}

			}


			/**
			 * Register a namespace prefix
			 */
			private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
				java.lang.String prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
						prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
					}

					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);
				}

				return prefix;
			}



			/**
			 * databinding method to get an XML representation of this object
			 *
			 */
			public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException{




				//We can safely assume an element has only one type associated with it
				return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(MY_QNAME,
						new java.lang.Object[]{
							org.apache.axis2.databinding.utils.reader.ADBXMLStreamReader.ELEMENT_TEXT,
					   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNotValidOriginErrorMessage)
						},
						null);

			}



			/**
			 *  Factory class that keeps the parse method
			 */
			public static class Factory{




				/**
				 * static method to create the object
				 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
				 *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
				 * Postcondition: If this object is an element, the reader is positioned at its end element
				 *                If this object is a complex type, the reader is positioned at the end element of its outer element
				 */
				public static NotValidOriginErrorMessage parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
					NotValidOriginErrorMessage object =
						new NotValidOriginErrorMessage();

					int event;
					java.lang.String nillableValue = null;
					java.lang.String prefix ="";
					java.lang.String namespaceuri ="";
					try {

						while (!reader.isStartElement() && !reader.isEndElement())
							reader.next();




						// Note all attributes that were handled. Used to differ normal attributes
						// from anyAttributes.
						java.util.Vector handledAttributes = new java.util.Vector();



						while(!reader.isEndElement()) {
							if (reader.isStartElement() ){

								if (reader.isStartElement() && new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","notValidOriginErrorMessage").equals(reader.getName())){

									java.lang.String content = reader.getElementText();

									object.setNotValidOriginErrorMessage(
											org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

								}  // End of if for expected property start element

								else{
									// A start element we are not expecting indicates an invalid parameter was passed
									throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
								}

							} else {
								reader.next();
							}  
						}  // end of while loop




					} catch (javax.xml.stream.XMLStreamException e) {
						throw new java.lang.Exception(e);
					}

					return object;
				}

			}//end of factory class



	}


	public static class NotEnoughSeatsErrorMessage
			implements org.apache.axis2.databinding.ADBBean{

			public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
					"http://flightbooking.t3.sos.fi.upm.es",
					"notEnoughSeatsErrorMessage",
					"ns1");



			private static java.lang.String generatePrefix(java.lang.String namespace) {
				if(namespace.equals("http://flightbooking.t3.sos.fi.upm.es")){
					return "ns1";
				}
				return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
			}



			/**
			 * field for NotEnoughSeatsErrorMessage
			 */


			protected java.lang.String localNotEnoughSeatsErrorMessage ;


			/**
			 * Auto generated getter method
			 * @return java.lang.String
			 */
			public  java.lang.String getNotEnoughSeatsErrorMessage(){
				return localNotEnoughSeatsErrorMessage;
			}



			/**
			 * Auto generated setter method
			 * @param param NotEnoughSeatsErrorMessage
			 */
			public void setNotEnoughSeatsErrorMessage(java.lang.String param){

				this.localNotEnoughSeatsErrorMessage=param;


			}


			/**
			 * isReaderMTOMAware
			 * @return true if the reader supports MTOM
			 */
			public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
				boolean isReaderMTOMAware = false;

				try{
					isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
				}catch(java.lang.IllegalArgumentException e){
					isReaderMTOMAware = false;
				}
				return isReaderMTOMAware;
			}


			/**
			 *
			 * @param parentQName
			 * @param factory
			 * @return org.apache.axiom.om.OMElement
			 */
			public org.apache.axiom.om.OMElement getOMElement (
					final javax.xml.namespace.QName parentQName,
					final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



				org.apache.axiom.om.OMDataSource dataSource =
					new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

						public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
							NotEnoughSeatsErrorMessage.this.serialize(MY_QNAME,factory,xmlWriter);
						}
					};
				return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
						MY_QNAME,factory,dataSource);

					}

			public void serialize(final javax.xml.namespace.QName parentQName,
					final org.apache.axiom.om.OMFactory factory,
					org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
				serialize(parentQName,factory,xmlWriter,false);
			}

			public void serialize(final javax.xml.namespace.QName parentQName,
					final org.apache.axiom.om.OMFactory factory,
					org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
					boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{


				//We can safely assume an element has only one type associated with it

				java.lang.String namespace = "http://flightbooking.t3.sos.fi.upm.es";
				java.lang.String localName = "notEnoughSeatsErrorMessage";

				if (! namespace.equals("")) {
					java.lang.String prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix, localName, namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace, localName);
					}

				} else {
					xmlWriter.writeStartElement(localName);
				}

				// add the type details if this is used in a simple type
				if (serializeType){
					java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://flightbooking.t3.sos.fi.upm.es");
					if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
						writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
								namespacePrefix+":notEnoughSeatsErrorMessage",
								xmlWriter);
					} else {
						writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
								"notEnoughSeatsErrorMessage",
								xmlWriter);
					}
				}

				if (localNotEnoughSeatsErrorMessage==null){

					throw new org.apache.axis2.databinding.ADBException("Value cannot be null !!");

				}else{

					xmlWriter.writeCharacters(localNotEnoughSeatsErrorMessage);

				}

				xmlWriter.writeEndElement();



			}

			/**
			 * Util method to write an attribute with the ns prefix
			 */
			private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
					java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
				if (xmlWriter.getPrefix(namespace) == null) {
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				}

				xmlWriter.writeAttribute(namespace,attName,attValue);

			}

			/**
			 * Util method to write an attribute without the ns prefix
			 */
			private void writeAttribute(java.lang.String namespace,java.lang.String attName,
					java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
				if (namespace.equals(""))
				{
					xmlWriter.writeAttribute(attName,attValue);
				}
				else
				{
					registerPrefix(xmlWriter, namespace);
					xmlWriter.writeAttribute(namespace,attName,attValue);
				}
			}


			/**
			 * Util method to write an attribute without the ns prefix
			 */
			private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
					javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

				java.lang.String attributeNamespace = qname.getNamespaceURI();
				java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
				if (attributePrefix == null) {
					attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
				}
				java.lang.String attributeValue;
				if (attributePrefix.trim().length() > 0) {
					attributeValue = attributePrefix + ":" + qname.getLocalPart();
				} else {
					attributeValue = qname.getLocalPart();
				}

				if (namespace.equals("")) {
					xmlWriter.writeAttribute(attName, attributeValue);
				} else {
					registerPrefix(xmlWriter, namespace);
					xmlWriter.writeAttribute(namespace, attName, attributeValue);
				}
			}
			/**
			 *  method to handle Qnames
			 */

			private void writeQName(javax.xml.namespace.QName qname,
					javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
				java.lang.String namespaceURI = qname.getNamespaceURI();
				if (namespaceURI != null) {
					java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
					if (prefix == null) {
						prefix = generatePrefix(namespaceURI);
						xmlWriter.writeNamespace(prefix, namespaceURI);
						xmlWriter.setPrefix(prefix,namespaceURI);
					}

					if (prefix.trim().length() > 0){
						xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
					} else {
						// i.e this is the default namespace
						xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
					}

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}
			}

			private void writeQNames(javax.xml.namespace.QName[] qnames,
					javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

				if (qnames != null) {
					// we have to store this data until last moment since it is not possible to write any
					// namespace data after writing the charactor data
					java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
					java.lang.String namespaceURI = null;
					java.lang.String prefix = null;

					for (int i = 0; i < qnames.length; i++) {
						if (i > 0) {
							stringToWrite.append(" ");
						}
						namespaceURI = qnames[i].getNamespaceURI();
						if (namespaceURI != null) {
							prefix = xmlWriter.getPrefix(namespaceURI);
							if ((prefix == null) || (prefix.length() == 0)) {
								prefix = generatePrefix(namespaceURI);
								xmlWriter.writeNamespace(prefix, namespaceURI);
								xmlWriter.setPrefix(prefix,namespaceURI);
							}

							if (prefix.trim().length() > 0){
								stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
							} else {
								stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
							}
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					}
					xmlWriter.writeCharacters(stringToWrite.toString());
				}

			}


			/**
			 * Register a namespace prefix
			 */
			private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
				java.lang.String prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
						prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
					}

					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);
				}

				return prefix;
			}



			/**
			 * databinding method to get an XML representation of this object
			 *
			 */
			public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException{




				//We can safely assume an element has only one type associated with it
				return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(MY_QNAME,
						new java.lang.Object[]{
							org.apache.axis2.databinding.utils.reader.ADBXMLStreamReader.ELEMENT_TEXT,
					   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNotEnoughSeatsErrorMessage)
						},
						null);

			}



			/**
			 *  Factory class that keeps the parse method
			 */
			public static class Factory{




				/**
				 * static method to create the object
				 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
				 *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
				 * Postcondition: If this object is an element, the reader is positioned at its end element
				 *                If this object is a complex type, the reader is positioned at the end element of its outer element
				 */
				public static NotEnoughSeatsErrorMessage parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
					NotEnoughSeatsErrorMessage object =
						new NotEnoughSeatsErrorMessage();

					int event;
					java.lang.String nillableValue = null;
					java.lang.String prefix ="";
					java.lang.String namespaceuri ="";
					try {

						while (!reader.isStartElement() && !reader.isEndElement())
							reader.next();




						// Note all attributes that were handled. Used to differ normal attributes
						// from anyAttributes.
						java.util.Vector handledAttributes = new java.util.Vector();



						while(!reader.isEndElement()) {
							if (reader.isStartElement() ){

								if (reader.isStartElement() && new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","notEnoughSeatsErrorMessage").equals(reader.getName())){

									java.lang.String content = reader.getElementText();

									object.setNotEnoughSeatsErrorMessage(
											org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

								}  // End of if for expected property start element

								else{
									// A start element we are not expecting indicates an invalid parameter was passed
									throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
								}

							} else {
								reader.next();
							}  
						}  // end of while loop




					} catch (javax.xml.stream.XMLStreamException e) {
						throw new java.lang.Exception(e);
					}

					return object;
				}

			}//end of factory class



	}


	public static class DestinationList
			implements org.apache.axis2.databinding.ADBBean{

			public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
					"http://flightbooking.t3.sos.fi.upm.es",
					"destinationList",
					"ns1");



			private static java.lang.String generatePrefix(java.lang.String namespace) {
				if(namespace.equals("http://flightbooking.t3.sos.fi.upm.es")){
					return "ns1";
				}
				return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
			}



			/**
			 * field for Destination
			 * This was an Array!
			 */


			protected java.lang.String[] localDestination ;

			/*  This tracker boolean wil be used to detect whether the user called the set method
			 *   for this attribute. It will be used to determine whether to include this field
			 *   in the serialized XML
			 */
			protected boolean localDestinationTracker = false ;


			/**
			 * Auto generated getter method
			 * @return java.lang.String[]
			 */
			public  java.lang.String[] getDestination(){
				return localDestination;
			}






			/**
			 * validate the array for Destination
			 */
			protected void validateDestination(java.lang.String[] param){

			}


			/**
			 * Auto generated setter method
			 * @param param Destination
			 */
			public void setDestination(java.lang.String[] param){

				validateDestination(param);


				if (param != null){
					//update the setting tracker
					localDestinationTracker = true;
				} else {
					localDestinationTracker = false;

				}

				this.localDestination=param;
			}



			/**
			 * Auto generated add method for the array for convenience
			 * @param param java.lang.String
			 */
			public void addDestination(java.lang.String param){
				if (localDestination == null){
					localDestination = new java.lang.String[]{};
				}


				//update the setting tracker
				localDestinationTracker = true;


				java.util.List list =
					org.apache.axis2.databinding.utils.ConverterUtil.toList(localDestination);
				list.add(param);
				this.localDestination =
					(java.lang.String[])list.toArray(
							new java.lang.String[list.size()]);

			}


			/**
			 * isReaderMTOMAware
			 * @return true if the reader supports MTOM
			 */
			public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
				boolean isReaderMTOMAware = false;

				try{
					isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
				}catch(java.lang.IllegalArgumentException e){
					isReaderMTOMAware = false;
				}
				return isReaderMTOMAware;
			}


			/**
			 *
			 * @param parentQName
			 * @param factory
			 * @return org.apache.axiom.om.OMElement
			 */
			public org.apache.axiom.om.OMElement getOMElement (
					final javax.xml.namespace.QName parentQName,
					final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



				org.apache.axiom.om.OMDataSource dataSource =
					new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

						public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
							DestinationList.this.serialize(MY_QNAME,factory,xmlWriter);
						}
					};
				return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
						MY_QNAME,factory,dataSource);

					}

			public void serialize(final javax.xml.namespace.QName parentQName,
					final org.apache.axiom.om.OMFactory factory,
					org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
				serialize(parentQName,factory,xmlWriter,false);
			}

			public void serialize(final javax.xml.namespace.QName parentQName,
					final org.apache.axiom.om.OMFactory factory,
					org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
					boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{




				java.lang.String prefix = null;
				java.lang.String namespace = null;


				prefix = parentQName.getPrefix();
				namespace = parentQName.getNamespaceURI();

				if ((namespace != null) && (namespace.trim().length() > 0)) {
					java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
					if (writerPrefix != null) {
						xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
					} else {
						if (prefix == null) {
							prefix = generatePrefix(namespace);
						}

						xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);
					}
				} else {
					xmlWriter.writeStartElement(parentQName.getLocalPart());
				}

				if (serializeType){


					java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://flightbooking.t3.sos.fi.upm.es");
					if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
						writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
								namespacePrefix+":destinationList",
								xmlWriter);
					} else {
						writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
								"destinationList",
								xmlWriter);
					}


				}
				if (localDestinationTracker){
					if (localDestination!=null) {
						namespace = "http://flightbooking.t3.sos.fi.upm.es";
						boolean emptyNamespace = namespace == null || namespace.length() == 0;
						prefix =  emptyNamespace ? null : xmlWriter.getPrefix(namespace);
						for (int i = 0;i < localDestination.length;i++){

							if (localDestination[i] != null){

								if (!emptyNamespace) {
									if (prefix == null) {
										java.lang.String prefix2 = generatePrefix(namespace);

										xmlWriter.writeStartElement(prefix2,"destination", namespace);
										xmlWriter.writeNamespace(prefix2, namespace);
										xmlWriter.setPrefix(prefix2, namespace);

									} else {
										xmlWriter.writeStartElement(namespace,"destination");
									}

								} else {
									xmlWriter.writeStartElement("destination");
								}


								xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDestination[i]));

								xmlWriter.writeEndElement();

							} else {

								// we have to do nothing since minOccurs is zero

							}

						}
					} else {

						throw new org.apache.axis2.databinding.ADBException("destination cannot be null!!");

					}

				}
				xmlWriter.writeEndElement();


			}

			/**
			 * Util method to write an attribute with the ns prefix
			 */
			private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
					java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
				if (xmlWriter.getPrefix(namespace) == null) {
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				}

				xmlWriter.writeAttribute(namespace,attName,attValue);

			}

			/**
			 * Util method to write an attribute without the ns prefix
			 */
			private void writeAttribute(java.lang.String namespace,java.lang.String attName,
					java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
				if (namespace.equals(""))
				{
					xmlWriter.writeAttribute(attName,attValue);
				}
				else
				{
					registerPrefix(xmlWriter, namespace);
					xmlWriter.writeAttribute(namespace,attName,attValue);
				}
			}


			/**
			 * Util method to write an attribute without the ns prefix
			 */
			private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
					javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

				java.lang.String attributeNamespace = qname.getNamespaceURI();
				java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
				if (attributePrefix == null) {
					attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
				}
				java.lang.String attributeValue;
				if (attributePrefix.trim().length() > 0) {
					attributeValue = attributePrefix + ":" + qname.getLocalPart();
				} else {
					attributeValue = qname.getLocalPart();
				}

				if (namespace.equals("")) {
					xmlWriter.writeAttribute(attName, attributeValue);
				} else {
					registerPrefix(xmlWriter, namespace);
					xmlWriter.writeAttribute(namespace, attName, attributeValue);
				}
			}
			/**
			 *  method to handle Qnames
			 */

			private void writeQName(javax.xml.namespace.QName qname,
					javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
				java.lang.String namespaceURI = qname.getNamespaceURI();
				if (namespaceURI != null) {
					java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
					if (prefix == null) {
						prefix = generatePrefix(namespaceURI);
						xmlWriter.writeNamespace(prefix, namespaceURI);
						xmlWriter.setPrefix(prefix,namespaceURI);
					}

					if (prefix.trim().length() > 0){
						xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
					} else {
						// i.e this is the default namespace
						xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
					}

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}
			}

			private void writeQNames(javax.xml.namespace.QName[] qnames,
					javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

				if (qnames != null) {
					// we have to store this data until last moment since it is not possible to write any
					// namespace data after writing the charactor data
					java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
					java.lang.String namespaceURI = null;
					java.lang.String prefix = null;

					for (int i = 0; i < qnames.length; i++) {
						if (i > 0) {
							stringToWrite.append(" ");
						}
						namespaceURI = qnames[i].getNamespaceURI();
						if (namespaceURI != null) {
							prefix = xmlWriter.getPrefix(namespaceURI);
							if ((prefix == null) || (prefix.length() == 0)) {
								prefix = generatePrefix(namespaceURI);
								xmlWriter.writeNamespace(prefix, namespaceURI);
								xmlWriter.setPrefix(prefix,namespaceURI);
							}

							if (prefix.trim().length() > 0){
								stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
							} else {
								stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
							}
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					}
					xmlWriter.writeCharacters(stringToWrite.toString());
				}

			}


			/**
			 * Register a namespace prefix
			 */
			private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
				java.lang.String prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
						prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
					}

					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);
				}

				return prefix;
			}



			/**
			 * databinding method to get an XML representation of this object
			 *
			 */
			public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException{



				java.util.ArrayList elementList = new java.util.ArrayList();
				java.util.ArrayList attribList = new java.util.ArrayList();

				if (localDestinationTracker){
					if (localDestination!=null){
						for (int i = 0;i < localDestination.length;i++){

							if (localDestination[i] != null){
								elementList.add(new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es",
											"destination"));
								elementList.add(
										org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDestination[i]));
							} else {

								// have to do nothing

							}


						}
					} else {

						throw new org.apache.axis2.databinding.ADBException("destination cannot be null!!");

					}

				}

				return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());



			}



			/**
			 *  Factory class that keeps the parse method
			 */
			public static class Factory{




				/**
				 * static method to create the object
				 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
				 *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
				 * Postcondition: If this object is an element, the reader is positioned at its end element
				 *                If this object is a complex type, the reader is positioned at the end element of its outer element
				 */
				public static DestinationList parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
					DestinationList object =
						new DestinationList();

					int event;
					java.lang.String nillableValue = null;
					java.lang.String prefix ="";
					java.lang.String namespaceuri ="";
					try {

						while (!reader.isStartElement() && !reader.isEndElement())
							reader.next();


						if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
							java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
									"type");
							if (fullTypeName!=null){
								java.lang.String nsPrefix = null;
								if (fullTypeName.indexOf(":") > -1){
									nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
								}
								nsPrefix = nsPrefix==null?"":nsPrefix;

								java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);

								if (!"destinationList".equals(type)){
									//find namespace for the prefix
									java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
									return (DestinationList)ExtensionMapper.getTypeObject(
											nsUri,type,reader);
								}


							}


						}




						// Note all attributes that were handled. Used to differ normal attributes
						// from anyAttributes.
						java.util.Vector handledAttributes = new java.util.Vector();




						reader.next();

						java.util.ArrayList list1 = new java.util.ArrayList();


						while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

						if (reader.isStartElement() && new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","destination").equals(reader.getName())){



							// Process the array and step past its final element's end.
							list1.add(reader.getElementText());

							//loop until we find a start element that is not part of this array
							boolean loopDone1 = false;
							while(!loopDone1){
								// Ensure we are at the EndElement
								while (!reader.isEndElement()){
									reader.next();
								}
								// Step out of this element
								reader.next();
								// Step to next element event.
								while (!reader.isStartElement() && !reader.isEndElement())
									reader.next();
								if (reader.isEndElement()){
									//two continuous end elements means we are exiting the xml structure
									loopDone1 = true;
								} else {
									if (new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","destination").equals(reader.getName())){
										list1.add(reader.getElementText());

									}else{
										loopDone1 = true;
									}
								}
							}
							// call the converter utility  to convert and set the array

							object.setDestination((java.lang.String[])
									list1.toArray(new java.lang.String[list1.size()]));

						}  // End of if for expected property start element

						else {

						}

						while (!reader.isStartElement() && !reader.isEndElement())
							reader.next();

						if (reader.isStartElement())
							// A start element we are not expecting indicates a trailing invalid property
							throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());




					} catch (javax.xml.stream.XMLStreamException e) {
						throw new java.lang.Exception(e);
					}

					return object;
				}

			}//end of factory class



	}


	public static class CancellingFlightResponse
			implements org.apache.axis2.databinding.ADBBean{

			public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
					"http://flightbooking.t3.sos.fi.upm.es",
					"cancellingFlightResponse",
					"ns1");



			private static java.lang.String generatePrefix(java.lang.String namespace) {
				if(namespace.equals("http://flightbooking.t3.sos.fi.upm.es")){
					return "ns1";
				}
				return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
			}



			/**
			 * field for CancellingResult
			 */


			protected boolean localCancellingResult ;


			/**
			 * Auto generated getter method
			 * @return boolean
			 */
			public  boolean getCancellingResult(){
				return localCancellingResult;
			}



			/**
			 * Auto generated setter method
			 * @param param CancellingResult
			 */
			public void setCancellingResult(boolean param){

				this.localCancellingResult=param;


			}


			/**
			 * field for ReturnedMoney
			 */


			protected double localReturnedMoney ;


			/**
			 * Auto generated getter method
			 * @return double
			 */
			public  double getReturnedMoney(){
				return localReturnedMoney;
			}



			/**
			 * Auto generated setter method
			 * @param param ReturnedMoney
			 */
			public void setReturnedMoney(double param){

				this.localReturnedMoney=param;


			}


			/**
			 * isReaderMTOMAware
			 * @return true if the reader supports MTOM
			 */
			public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
				boolean isReaderMTOMAware = false;

				try{
					isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
				}catch(java.lang.IllegalArgumentException e){
					isReaderMTOMAware = false;
				}
				return isReaderMTOMAware;
			}


			/**
			 *
			 * @param parentQName
			 * @param factory
			 * @return org.apache.axiom.om.OMElement
			 */
			public org.apache.axiom.om.OMElement getOMElement (
					final javax.xml.namespace.QName parentQName,
					final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



				org.apache.axiom.om.OMDataSource dataSource =
					new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

						public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
							CancellingFlightResponse.this.serialize(MY_QNAME,factory,xmlWriter);
						}
					};
				return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
						MY_QNAME,factory,dataSource);

					}

			public void serialize(final javax.xml.namespace.QName parentQName,
					final org.apache.axiom.om.OMFactory factory,
					org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
				serialize(parentQName,factory,xmlWriter,false);
			}

			public void serialize(final javax.xml.namespace.QName parentQName,
					final org.apache.axiom.om.OMFactory factory,
					org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
					boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{




				java.lang.String prefix = null;
				java.lang.String namespace = null;


				prefix = parentQName.getPrefix();
				namespace = parentQName.getNamespaceURI();

				if ((namespace != null) && (namespace.trim().length() > 0)) {
					java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
					if (writerPrefix != null) {
						xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
					} else {
						if (prefix == null) {
							prefix = generatePrefix(namespace);
						}

						xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);
					}
				} else {
					xmlWriter.writeStartElement(parentQName.getLocalPart());
				}

				if (serializeType){


					java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://flightbooking.t3.sos.fi.upm.es");
					if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
						writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
								namespacePrefix+":cancellingFlightResponse",
								xmlWriter);
					} else {
						writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
								"cancellingFlightResponse",
								xmlWriter);
					}


				}

				namespace = "http://flightbooking.t3.sos.fi.upm.es";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"cancellingResult", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"cancellingResult");
					}

				} else {
					xmlWriter.writeStartElement("cancellingResult");
				}

				if (false) {

					throw new org.apache.axis2.databinding.ADBException("cancellingResult cannot be null!!");

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCancellingResult));
				}

				xmlWriter.writeEndElement();

				namespace = "http://flightbooking.t3.sos.fi.upm.es";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"returnedMoney", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"returnedMoney");
					}

				} else {
					xmlWriter.writeStartElement("returnedMoney");
				}

				if (java.lang.Double.isNaN(localReturnedMoney)) {

					throw new org.apache.axis2.databinding.ADBException("returnedMoney cannot be null!!");

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReturnedMoney));
				}

				xmlWriter.writeEndElement();

				xmlWriter.writeEndElement();


			}

			/**
			 * Util method to write an attribute with the ns prefix
			 */
			private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
					java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
				if (xmlWriter.getPrefix(namespace) == null) {
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				}

				xmlWriter.writeAttribute(namespace,attName,attValue);

			}

			/**
			 * Util method to write an attribute without the ns prefix
			 */
			private void writeAttribute(java.lang.String namespace,java.lang.String attName,
					java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
				if (namespace.equals(""))
				{
					xmlWriter.writeAttribute(attName,attValue);
				}
				else
				{
					registerPrefix(xmlWriter, namespace);
					xmlWriter.writeAttribute(namespace,attName,attValue);
				}
			}


			/**
			 * Util method to write an attribute without the ns prefix
			 */
			private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
					javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

				java.lang.String attributeNamespace = qname.getNamespaceURI();
				java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
				if (attributePrefix == null) {
					attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
				}
				java.lang.String attributeValue;
				if (attributePrefix.trim().length() > 0) {
					attributeValue = attributePrefix + ":" + qname.getLocalPart();
				} else {
					attributeValue = qname.getLocalPart();
				}

				if (namespace.equals("")) {
					xmlWriter.writeAttribute(attName, attributeValue);
				} else {
					registerPrefix(xmlWriter, namespace);
					xmlWriter.writeAttribute(namespace, attName, attributeValue);
				}
			}
			/**
			 *  method to handle Qnames
			 */

			private void writeQName(javax.xml.namespace.QName qname,
					javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
				java.lang.String namespaceURI = qname.getNamespaceURI();
				if (namespaceURI != null) {
					java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
					if (prefix == null) {
						prefix = generatePrefix(namespaceURI);
						xmlWriter.writeNamespace(prefix, namespaceURI);
						xmlWriter.setPrefix(prefix,namespaceURI);
					}

					if (prefix.trim().length() > 0){
						xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
					} else {
						// i.e this is the default namespace
						xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
					}

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}
			}

			private void writeQNames(javax.xml.namespace.QName[] qnames,
					javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

				if (qnames != null) {
					// we have to store this data until last moment since it is not possible to write any
					// namespace data after writing the charactor data
					java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
					java.lang.String namespaceURI = null;
					java.lang.String prefix = null;

					for (int i = 0; i < qnames.length; i++) {
						if (i > 0) {
							stringToWrite.append(" ");
						}
						namespaceURI = qnames[i].getNamespaceURI();
						if (namespaceURI != null) {
							prefix = xmlWriter.getPrefix(namespaceURI);
							if ((prefix == null) || (prefix.length() == 0)) {
								prefix = generatePrefix(namespaceURI);
								xmlWriter.writeNamespace(prefix, namespaceURI);
								xmlWriter.setPrefix(prefix,namespaceURI);
							}

							if (prefix.trim().length() > 0){
								stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
							} else {
								stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
							}
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					}
					xmlWriter.writeCharacters(stringToWrite.toString());
				}

			}


			/**
			 * Register a namespace prefix
			 */
			private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
				java.lang.String prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
						prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
					}

					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);
				}

				return prefix;
			}



			/**
			 * databinding method to get an XML representation of this object
			 *
			 */
			public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException{



				java.util.ArrayList elementList = new java.util.ArrayList();
				java.util.ArrayList attribList = new java.util.ArrayList();


				elementList.add(new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es",
							"cancellingResult"));

				elementList.add(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCancellingResult));

				elementList.add(new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es",
							"returnedMoney"));

				elementList.add(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReturnedMoney));


				return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());



			}



			/**
			 *  Factory class that keeps the parse method
			 */
			public static class Factory{




				/**
				 * static method to create the object
				 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
				 *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
				 * Postcondition: If this object is an element, the reader is positioned at its end element
				 *                If this object is a complex type, the reader is positioned at the end element of its outer element
				 */
				public static CancellingFlightResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
					CancellingFlightResponse object =
						new CancellingFlightResponse();

					int event;
					java.lang.String nillableValue = null;
					java.lang.String prefix ="";
					java.lang.String namespaceuri ="";
					try {

						while (!reader.isStartElement() && !reader.isEndElement())
							reader.next();


						if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
							java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
									"type");
							if (fullTypeName!=null){
								java.lang.String nsPrefix = null;
								if (fullTypeName.indexOf(":") > -1){
									nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
								}
								nsPrefix = nsPrefix==null?"":nsPrefix;

								java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);

								if (!"cancellingFlightResponse".equals(type)){
									//find namespace for the prefix
									java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
									return (CancellingFlightResponse)ExtensionMapper.getTypeObject(
											nsUri,type,reader);
								}


							}


						}




						// Note all attributes that were handled. Used to differ normal attributes
						// from anyAttributes.
						java.util.Vector handledAttributes = new java.util.Vector();




						reader.next();


						while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

						if (reader.isStartElement() && new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","cancellingResult").equals(reader.getName())){

							java.lang.String content = reader.getElementText();

							object.setCancellingResult(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

							reader.next();

						}  // End of if for expected property start element

						else{
							// A start element we are not expecting indicates an invalid parameter was passed
							throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
						}


						while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

						if (reader.isStartElement() && new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","returnedMoney").equals(reader.getName())){

							java.lang.String content = reader.getElementText();

							object.setReturnedMoney(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));

							reader.next();

						}  // End of if for expected property start element

						else{
							// A start element we are not expecting indicates an invalid parameter was passed
							throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
						}

						while (!reader.isStartElement() && !reader.isEndElement())
							reader.next();

						if (reader.isStartElement())
							// A start element we are not expecting indicates a trailing invalid property
							throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());




					} catch (javax.xml.stream.XMLStreamException e) {
						throw new java.lang.Exception(e);
					}

					return object;
				}

			}//end of factory class



	}


	public static class OriginList
			implements org.apache.axis2.databinding.ADBBean{

			public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
					"http://flightbooking.t3.sos.fi.upm.es",
					"originList",
					"ns1");



			private static java.lang.String generatePrefix(java.lang.String namespace) {
				if(namespace.equals("http://flightbooking.t3.sos.fi.upm.es")){
					return "ns1";
				}
				return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
			}



			/**
			 * field for Origin
			 * This was an Array!
			 */


			protected java.lang.String[] localOrigin ;

			/*  This tracker boolean wil be used to detect whether the user called the set method
			 *   for this attribute. It will be used to determine whether to include this field
			 *   in the serialized XML
			 */
			protected boolean localOriginTracker = false ;


			/**
			 * Auto generated getter method
			 * @return java.lang.String[]
			 */
			public  java.lang.String[] getOrigin(){
				return localOrigin;
			}






			/**
			 * validate the array for Origin
			 */
			protected void validateOrigin(java.lang.String[] param){

			}


			/**
			 * Auto generated setter method
			 * @param param Origin
			 */
			public void setOrigin(java.lang.String[] param){

				validateOrigin(param);


				if (param != null){
					//update the setting tracker
					localOriginTracker = true;
				} else {
					localOriginTracker = false;

				}

				this.localOrigin=param;
			}



			/**
			 * Auto generated add method for the array for convenience
			 * @param param java.lang.String
			 */
			public void addOrigin(java.lang.String param){
				if (localOrigin == null){
					localOrigin = new java.lang.String[]{};
				}


				//update the setting tracker
				localOriginTracker = true;


				java.util.List list =
					org.apache.axis2.databinding.utils.ConverterUtil.toList(localOrigin);
				list.add(param);
				this.localOrigin =
					(java.lang.String[])list.toArray(
							new java.lang.String[list.size()]);

			}


			/**
			 * isReaderMTOMAware
			 * @return true if the reader supports MTOM
			 */
			public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
				boolean isReaderMTOMAware = false;

				try{
					isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
				}catch(java.lang.IllegalArgumentException e){
					isReaderMTOMAware = false;
				}
				return isReaderMTOMAware;
			}


			/**
			 *
			 * @param parentQName
			 * @param factory
			 * @return org.apache.axiom.om.OMElement
			 */
			public org.apache.axiom.om.OMElement getOMElement (
					final javax.xml.namespace.QName parentQName,
					final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



				org.apache.axiom.om.OMDataSource dataSource =
					new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

						public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
							OriginList.this.serialize(MY_QNAME,factory,xmlWriter);
						}
					};
				return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
						MY_QNAME,factory,dataSource);

					}

			public void serialize(final javax.xml.namespace.QName parentQName,
					final org.apache.axiom.om.OMFactory factory,
					org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
				serialize(parentQName,factory,xmlWriter,false);
			}

			public void serialize(final javax.xml.namespace.QName parentQName,
					final org.apache.axiom.om.OMFactory factory,
					org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
					boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{




				java.lang.String prefix = null;
				java.lang.String namespace = null;


				prefix = parentQName.getPrefix();
				namespace = parentQName.getNamespaceURI();

				if ((namespace != null) && (namespace.trim().length() > 0)) {
					java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
					if (writerPrefix != null) {
						xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
					} else {
						if (prefix == null) {
							prefix = generatePrefix(namespace);
						}

						xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);
					}
				} else {
					xmlWriter.writeStartElement(parentQName.getLocalPart());
				}

				if (serializeType){


					java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://flightbooking.t3.sos.fi.upm.es");
					if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
						writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
								namespacePrefix+":originList",
								xmlWriter);
					} else {
						writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
								"originList",
								xmlWriter);
					}


				}
				if (localOriginTracker){
					if (localOrigin!=null) {
						namespace = "http://flightbooking.t3.sos.fi.upm.es";
						boolean emptyNamespace = namespace == null || namespace.length() == 0;
						prefix =  emptyNamespace ? null : xmlWriter.getPrefix(namespace);
						for (int i = 0;i < localOrigin.length;i++){

							if (localOrigin[i] != null){

								if (!emptyNamespace) {
									if (prefix == null) {
										java.lang.String prefix2 = generatePrefix(namespace);

										xmlWriter.writeStartElement(prefix2,"origin", namespace);
										xmlWriter.writeNamespace(prefix2, namespace);
										xmlWriter.setPrefix(prefix2, namespace);

									} else {
										xmlWriter.writeStartElement(namespace,"origin");
									}

								} else {
									xmlWriter.writeStartElement("origin");
								}


								xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOrigin[i]));

								xmlWriter.writeEndElement();

							} else {

								// we have to do nothing since minOccurs is zero

							}

						}
					} else {

						throw new org.apache.axis2.databinding.ADBException("origin cannot be null!!");

					}

				}
				xmlWriter.writeEndElement();


			}

			/**
			 * Util method to write an attribute with the ns prefix
			 */
			private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
					java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
				if (xmlWriter.getPrefix(namespace) == null) {
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				}

				xmlWriter.writeAttribute(namespace,attName,attValue);

			}

			/**
			 * Util method to write an attribute without the ns prefix
			 */
			private void writeAttribute(java.lang.String namespace,java.lang.String attName,
					java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
				if (namespace.equals(""))
				{
					xmlWriter.writeAttribute(attName,attValue);
				}
				else
				{
					registerPrefix(xmlWriter, namespace);
					xmlWriter.writeAttribute(namespace,attName,attValue);
				}
			}


			/**
			 * Util method to write an attribute without the ns prefix
			 */
			private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
					javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

				java.lang.String attributeNamespace = qname.getNamespaceURI();
				java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
				if (attributePrefix == null) {
					attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
				}
				java.lang.String attributeValue;
				if (attributePrefix.trim().length() > 0) {
					attributeValue = attributePrefix + ":" + qname.getLocalPart();
				} else {
					attributeValue = qname.getLocalPart();
				}

				if (namespace.equals("")) {
					xmlWriter.writeAttribute(attName, attributeValue);
				} else {
					registerPrefix(xmlWriter, namespace);
					xmlWriter.writeAttribute(namespace, attName, attributeValue);
				}
			}
			/**
			 *  method to handle Qnames
			 */

			private void writeQName(javax.xml.namespace.QName qname,
					javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
				java.lang.String namespaceURI = qname.getNamespaceURI();
				if (namespaceURI != null) {
					java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
					if (prefix == null) {
						prefix = generatePrefix(namespaceURI);
						xmlWriter.writeNamespace(prefix, namespaceURI);
						xmlWriter.setPrefix(prefix,namespaceURI);
					}

					if (prefix.trim().length() > 0){
						xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
					} else {
						// i.e this is the default namespace
						xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
					}

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}
			}

			private void writeQNames(javax.xml.namespace.QName[] qnames,
					javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

				if (qnames != null) {
					// we have to store this data until last moment since it is not possible to write any
					// namespace data after writing the charactor data
					java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
					java.lang.String namespaceURI = null;
					java.lang.String prefix = null;

					for (int i = 0; i < qnames.length; i++) {
						if (i > 0) {
							stringToWrite.append(" ");
						}
						namespaceURI = qnames[i].getNamespaceURI();
						if (namespaceURI != null) {
							prefix = xmlWriter.getPrefix(namespaceURI);
							if ((prefix == null) || (prefix.length() == 0)) {
								prefix = generatePrefix(namespaceURI);
								xmlWriter.writeNamespace(prefix, namespaceURI);
								xmlWriter.setPrefix(prefix,namespaceURI);
							}

							if (prefix.trim().length() > 0){
								stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
							} else {
								stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
							}
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					}
					xmlWriter.writeCharacters(stringToWrite.toString());
				}

			}


			/**
			 * Register a namespace prefix
			 */
			private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
				java.lang.String prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
						prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
					}

					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);
				}

				return prefix;
			}



			/**
			 * databinding method to get an XML representation of this object
			 *
			 */
			public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException{



				java.util.ArrayList elementList = new java.util.ArrayList();
				java.util.ArrayList attribList = new java.util.ArrayList();

				if (localOriginTracker){
					if (localOrigin!=null){
						for (int i = 0;i < localOrigin.length;i++){

							if (localOrigin[i] != null){
								elementList.add(new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es",
											"origin"));
								elementList.add(
										org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOrigin[i]));
							} else {

								// have to do nothing

							}


						}
					} else {

						throw new org.apache.axis2.databinding.ADBException("origin cannot be null!!");

					}

				}

				return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());



			}



			/**
			 *  Factory class that keeps the parse method
			 */
			public static class Factory{




				/**
				 * static method to create the object
				 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
				 *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
				 * Postcondition: If this object is an element, the reader is positioned at its end element
				 *                If this object is a complex type, the reader is positioned at the end element of its outer element
				 */
				public static OriginList parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
					OriginList object =
						new OriginList();

					int event;
					java.lang.String nillableValue = null;
					java.lang.String prefix ="";
					java.lang.String namespaceuri ="";
					try {

						while (!reader.isStartElement() && !reader.isEndElement())
							reader.next();


						if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
							java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
									"type");
							if (fullTypeName!=null){
								java.lang.String nsPrefix = null;
								if (fullTypeName.indexOf(":") > -1){
									nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
								}
								nsPrefix = nsPrefix==null?"":nsPrefix;

								java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);

								if (!"originList".equals(type)){
									//find namespace for the prefix
									java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
									return (OriginList)ExtensionMapper.getTypeObject(
											nsUri,type,reader);
								}


							}


						}




						// Note all attributes that were handled. Used to differ normal attributes
						// from anyAttributes.
						java.util.Vector handledAttributes = new java.util.Vector();




						reader.next();

						java.util.ArrayList list1 = new java.util.ArrayList();


						while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

						if (reader.isStartElement() && new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","origin").equals(reader.getName())){



							// Process the array and step past its final element's end.
							list1.add(reader.getElementText());

							//loop until we find a start element that is not part of this array
							boolean loopDone1 = false;
							while(!loopDone1){
								// Ensure we are at the EndElement
								while (!reader.isEndElement()){
									reader.next();
								}
								// Step out of this element
								reader.next();
								// Step to next element event.
								while (!reader.isStartElement() && !reader.isEndElement())
									reader.next();
								if (reader.isEndElement()){
									//two continuous end elements means we are exiting the xml structure
									loopDone1 = true;
								} else {
									if (new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","origin").equals(reader.getName())){
										list1.add(reader.getElementText());

									}else{
										loopDone1 = true;
									}
								}
							}
							// call the converter utility  to convert and set the array

							object.setOrigin((java.lang.String[])
									list1.toArray(new java.lang.String[list1.size()]));

						}  // End of if for expected property start element

						else {

						}

						while (!reader.isStartElement() && !reader.isEndElement())
							reader.next();

						if (reader.isStartElement())
							// A start element we are not expecting indicates a trailing invalid property
							throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());




					} catch (javax.xml.stream.XMLStreamException e) {
						throw new java.lang.Exception(e);
					}

					return object;
				}

			}//end of factory class



	}


	public static class CheckingFlightResponse
			implements org.apache.axis2.databinding.ADBBean{

			public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
					"http://flightbooking.t3.sos.fi.upm.es",
					"checkingFlightResponse",
					"ns1");



			private static java.lang.String generatePrefix(java.lang.String namespace) {
				if(namespace.equals("http://flightbooking.t3.sos.fi.upm.es")){
					return "ns1";
				}
				return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
			}



			/**
			 * field for SeatAvailability
			 */


			protected int localSeatAvailability ;


			/**
			 * Auto generated getter method
			 * @return int
			 */
			public  int getSeatAvailability(){
				return localSeatAvailability;
			}



			/**
			 * Auto generated setter method
			 * @param param SeatAvailability
			 */
			public void setSeatAvailability(int param){

				this.localSeatAvailability=param;


			}


			/**
			 * field for Price
			 */


			protected double localPrice ;


			/**
			 * Auto generated getter method
			 * @return double
			 */
			public  double getPrice(){
				return localPrice;
			}



			/**
			 * Auto generated setter method
			 * @param param Price
			 */
			public void setPrice(double param){

				this.localPrice=param;


			}


			/**
			 * isReaderMTOMAware
			 * @return true if the reader supports MTOM
			 */
			public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
				boolean isReaderMTOMAware = false;

				try{
					isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
				}catch(java.lang.IllegalArgumentException e){
					isReaderMTOMAware = false;
				}
				return isReaderMTOMAware;
			}


			/**
			 *
			 * @param parentQName
			 * @param factory
			 * @return org.apache.axiom.om.OMElement
			 */
			public org.apache.axiom.om.OMElement getOMElement (
					final javax.xml.namespace.QName parentQName,
					final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



				org.apache.axiom.om.OMDataSource dataSource =
					new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

						public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
							CheckingFlightResponse.this.serialize(MY_QNAME,factory,xmlWriter);
						}
					};
				return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
						MY_QNAME,factory,dataSource);

					}

			public void serialize(final javax.xml.namespace.QName parentQName,
					final org.apache.axiom.om.OMFactory factory,
					org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
				serialize(parentQName,factory,xmlWriter,false);
			}

			public void serialize(final javax.xml.namespace.QName parentQName,
					final org.apache.axiom.om.OMFactory factory,
					org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
					boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{




				java.lang.String prefix = null;
				java.lang.String namespace = null;


				prefix = parentQName.getPrefix();
				namespace = parentQName.getNamespaceURI();

				if ((namespace != null) && (namespace.trim().length() > 0)) {
					java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
					if (writerPrefix != null) {
						xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
					} else {
						if (prefix == null) {
							prefix = generatePrefix(namespace);
						}

						xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);
					}
				} else {
					xmlWriter.writeStartElement(parentQName.getLocalPart());
				}

				if (serializeType){


					java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://flightbooking.t3.sos.fi.upm.es");
					if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
						writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
								namespacePrefix+":checkingFlightResponse",
								xmlWriter);
					} else {
						writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
								"checkingFlightResponse",
								xmlWriter);
					}


				}

				namespace = "http://flightbooking.t3.sos.fi.upm.es";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"seatAvailability", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"seatAvailability");
					}

				} else {
					xmlWriter.writeStartElement("seatAvailability");
				}

				if (localSeatAvailability==java.lang.Integer.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("seatAvailability cannot be null!!");

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSeatAvailability));
				}

				xmlWriter.writeEndElement();

				namespace = "http://flightbooking.t3.sos.fi.upm.es";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"price", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"price");
					}

				} else {
					xmlWriter.writeStartElement("price");
				}

				if (java.lang.Double.isNaN(localPrice)) {

					throw new org.apache.axis2.databinding.ADBException("price cannot be null!!");

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPrice));
				}

				xmlWriter.writeEndElement();

				xmlWriter.writeEndElement();


			}

			/**
			 * Util method to write an attribute with the ns prefix
			 */
			private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
					java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
				if (xmlWriter.getPrefix(namespace) == null) {
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				}

				xmlWriter.writeAttribute(namespace,attName,attValue);

			}

			/**
			 * Util method to write an attribute without the ns prefix
			 */
			private void writeAttribute(java.lang.String namespace,java.lang.String attName,
					java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
				if (namespace.equals(""))
				{
					xmlWriter.writeAttribute(attName,attValue);
				}
				else
				{
					registerPrefix(xmlWriter, namespace);
					xmlWriter.writeAttribute(namespace,attName,attValue);
				}
			}


			/**
			 * Util method to write an attribute without the ns prefix
			 */
			private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
					javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

				java.lang.String attributeNamespace = qname.getNamespaceURI();
				java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
				if (attributePrefix == null) {
					attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
				}
				java.lang.String attributeValue;
				if (attributePrefix.trim().length() > 0) {
					attributeValue = attributePrefix + ":" + qname.getLocalPart();
				} else {
					attributeValue = qname.getLocalPart();
				}

				if (namespace.equals("")) {
					xmlWriter.writeAttribute(attName, attributeValue);
				} else {
					registerPrefix(xmlWriter, namespace);
					xmlWriter.writeAttribute(namespace, attName, attributeValue);
				}
			}
			/**
			 *  method to handle Qnames
			 */

			private void writeQName(javax.xml.namespace.QName qname,
					javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
				java.lang.String namespaceURI = qname.getNamespaceURI();
				if (namespaceURI != null) {
					java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
					if (prefix == null) {
						prefix = generatePrefix(namespaceURI);
						xmlWriter.writeNamespace(prefix, namespaceURI);
						xmlWriter.setPrefix(prefix,namespaceURI);
					}

					if (prefix.trim().length() > 0){
						xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
					} else {
						// i.e this is the default namespace
						xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
					}

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}
			}

			private void writeQNames(javax.xml.namespace.QName[] qnames,
					javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

				if (qnames != null) {
					// we have to store this data until last moment since it is not possible to write any
					// namespace data after writing the charactor data
					java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
					java.lang.String namespaceURI = null;
					java.lang.String prefix = null;

					for (int i = 0; i < qnames.length; i++) {
						if (i > 0) {
							stringToWrite.append(" ");
						}
						namespaceURI = qnames[i].getNamespaceURI();
						if (namespaceURI != null) {
							prefix = xmlWriter.getPrefix(namespaceURI);
							if ((prefix == null) || (prefix.length() == 0)) {
								prefix = generatePrefix(namespaceURI);
								xmlWriter.writeNamespace(prefix, namespaceURI);
								xmlWriter.setPrefix(prefix,namespaceURI);
							}

							if (prefix.trim().length() > 0){
								stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
							} else {
								stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
							}
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					}
					xmlWriter.writeCharacters(stringToWrite.toString());
				}

			}


			/**
			 * Register a namespace prefix
			 */
			private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
				java.lang.String prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
						prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
					}

					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);
				}

				return prefix;
			}



			/**
			 * databinding method to get an XML representation of this object
			 *
			 */
			public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException{



				java.util.ArrayList elementList = new java.util.ArrayList();
				java.util.ArrayList attribList = new java.util.ArrayList();


				elementList.add(new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es",
							"seatAvailability"));

				elementList.add(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSeatAvailability));

				elementList.add(new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es",
							"price"));

				elementList.add(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPrice));


				return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());



			}



			/**
			 *  Factory class that keeps the parse method
			 */
			public static class Factory{




				/**
				 * static method to create the object
				 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
				 *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
				 * Postcondition: If this object is an element, the reader is positioned at its end element
				 *                If this object is a complex type, the reader is positioned at the end element of its outer element
				 */
				public static CheckingFlightResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
					CheckingFlightResponse object =
						new CheckingFlightResponse();

					int event;
					java.lang.String nillableValue = null;
					java.lang.String prefix ="";
					java.lang.String namespaceuri ="";
					try {

						while (!reader.isStartElement() && !reader.isEndElement())
							reader.next();


						if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
							java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
									"type");
							if (fullTypeName!=null){
								java.lang.String nsPrefix = null;
								if (fullTypeName.indexOf(":") > -1){
									nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
								}
								nsPrefix = nsPrefix==null?"":nsPrefix;

								java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);

								if (!"checkingFlightResponse".equals(type)){
									//find namespace for the prefix
									java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
									return (CheckingFlightResponse)ExtensionMapper.getTypeObject(
											nsUri,type,reader);
								}


							}


						}




						// Note all attributes that were handled. Used to differ normal attributes
						// from anyAttributes.
						java.util.Vector handledAttributes = new java.util.Vector();




						reader.next();


						while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

						if (reader.isStartElement() && new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","seatAvailability").equals(reader.getName())){

							java.lang.String content = reader.getElementText();

							object.setSeatAvailability(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

							reader.next();

						}  // End of if for expected property start element

						else{
							// A start element we are not expecting indicates an invalid parameter was passed
							throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
						}


						while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

						if (reader.isStartElement() && new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","price").equals(reader.getName())){

							java.lang.String content = reader.getElementText();

							object.setPrice(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));

							reader.next();

						}  // End of if for expected property start element

						else{
							// A start element we are not expecting indicates an invalid parameter was passed
							throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
						}

						while (!reader.isStartElement() && !reader.isEndElement())
							reader.next();

						if (reader.isStartElement())
							// A start element we are not expecting indicates a trailing invalid property
							throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());




					} catch (javax.xml.stream.XMLStreamException e) {
						throw new java.lang.Exception(e);
					}

					return object;
				}

			}//end of factory class



	}


	public static class ExtensionMapper{

		public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
				java.lang.String typeName,
				javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{


			throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
		}

	}

	public static class NotValidDestinationErrorMessage
			implements org.apache.axis2.databinding.ADBBean{

			public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
					"http://flightbooking.t3.sos.fi.upm.es",
					"notValidDestinationErrorMessage",
					"ns1");



			private static java.lang.String generatePrefix(java.lang.String namespace) {
				if(namespace.equals("http://flightbooking.t3.sos.fi.upm.es")){
					return "ns1";
				}
				return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
			}



			/**
			 * field for NotValidDestinationErrorMessage
			 */


			protected java.lang.String localNotValidDestinationErrorMessage ;


			/**
			 * Auto generated getter method
			 * @return java.lang.String
			 */
			public  java.lang.String getNotValidDestinationErrorMessage(){
				return localNotValidDestinationErrorMessage;
			}



			/**
			 * Auto generated setter method
			 * @param param NotValidDestinationErrorMessage
			 */
			public void setNotValidDestinationErrorMessage(java.lang.String param){

				this.localNotValidDestinationErrorMessage=param;


			}


			/**
			 * isReaderMTOMAware
			 * @return true if the reader supports MTOM
			 */
			public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
				boolean isReaderMTOMAware = false;

				try{
					isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
				}catch(java.lang.IllegalArgumentException e){
					isReaderMTOMAware = false;
				}
				return isReaderMTOMAware;
			}


			/**
			 *
			 * @param parentQName
			 * @param factory
			 * @return org.apache.axiom.om.OMElement
			 */
			public org.apache.axiom.om.OMElement getOMElement (
					final javax.xml.namespace.QName parentQName,
					final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



				org.apache.axiom.om.OMDataSource dataSource =
					new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

						public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
							NotValidDestinationErrorMessage.this.serialize(MY_QNAME,factory,xmlWriter);
						}
					};
				return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
						MY_QNAME,factory,dataSource);

					}

			public void serialize(final javax.xml.namespace.QName parentQName,
					final org.apache.axiom.om.OMFactory factory,
					org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
				serialize(parentQName,factory,xmlWriter,false);
			}

			public void serialize(final javax.xml.namespace.QName parentQName,
					final org.apache.axiom.om.OMFactory factory,
					org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
					boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{


				//We can safely assume an element has only one type associated with it

				java.lang.String namespace = "http://flightbooking.t3.sos.fi.upm.es";
				java.lang.String localName = "notValidDestinationErrorMessage";

				if (! namespace.equals("")) {
					java.lang.String prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix, localName, namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace, localName);
					}

				} else {
					xmlWriter.writeStartElement(localName);
				}

				// add the type details if this is used in a simple type
				if (serializeType){
					java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://flightbooking.t3.sos.fi.upm.es");
					if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
						writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
								namespacePrefix+":notValidDestinationErrorMessage",
								xmlWriter);
					} else {
						writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
								"notValidDestinationErrorMessage",
								xmlWriter);
					}
				}

				if (localNotValidDestinationErrorMessage==null){

					throw new org.apache.axis2.databinding.ADBException("Value cannot be null !!");

				}else{

					xmlWriter.writeCharacters(localNotValidDestinationErrorMessage);

				}

				xmlWriter.writeEndElement();



			}

			/**
			 * Util method to write an attribute with the ns prefix
			 */
			private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
					java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
				if (xmlWriter.getPrefix(namespace) == null) {
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				}

				xmlWriter.writeAttribute(namespace,attName,attValue);

			}

			/**
			 * Util method to write an attribute without the ns prefix
			 */
			private void writeAttribute(java.lang.String namespace,java.lang.String attName,
					java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
				if (namespace.equals(""))
				{
					xmlWriter.writeAttribute(attName,attValue);
				}
				else
				{
					registerPrefix(xmlWriter, namespace);
					xmlWriter.writeAttribute(namespace,attName,attValue);
				}
			}


			/**
			 * Util method to write an attribute without the ns prefix
			 */
			private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
					javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

				java.lang.String attributeNamespace = qname.getNamespaceURI();
				java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
				if (attributePrefix == null) {
					attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
				}
				java.lang.String attributeValue;
				if (attributePrefix.trim().length() > 0) {
					attributeValue = attributePrefix + ":" + qname.getLocalPart();
				} else {
					attributeValue = qname.getLocalPart();
				}

				if (namespace.equals("")) {
					xmlWriter.writeAttribute(attName, attributeValue);
				} else {
					registerPrefix(xmlWriter, namespace);
					xmlWriter.writeAttribute(namespace, attName, attributeValue);
				}
			}
			/**
			 *  method to handle Qnames
			 */

			private void writeQName(javax.xml.namespace.QName qname,
					javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
				java.lang.String namespaceURI = qname.getNamespaceURI();
				if (namespaceURI != null) {
					java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
					if (prefix == null) {
						prefix = generatePrefix(namespaceURI);
						xmlWriter.writeNamespace(prefix, namespaceURI);
						xmlWriter.setPrefix(prefix,namespaceURI);
					}

					if (prefix.trim().length() > 0){
						xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
					} else {
						// i.e this is the default namespace
						xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
					}

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}
			}

			private void writeQNames(javax.xml.namespace.QName[] qnames,
					javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

				if (qnames != null) {
					// we have to store this data until last moment since it is not possible to write any
					// namespace data after writing the charactor data
					java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
					java.lang.String namespaceURI = null;
					java.lang.String prefix = null;

					for (int i = 0; i < qnames.length; i++) {
						if (i > 0) {
							stringToWrite.append(" ");
						}
						namespaceURI = qnames[i].getNamespaceURI();
						if (namespaceURI != null) {
							prefix = xmlWriter.getPrefix(namespaceURI);
							if ((prefix == null) || (prefix.length() == 0)) {
								prefix = generatePrefix(namespaceURI);
								xmlWriter.writeNamespace(prefix, namespaceURI);
								xmlWriter.setPrefix(prefix,namespaceURI);
							}

							if (prefix.trim().length() > 0){
								stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
							} else {
								stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
							}
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					}
					xmlWriter.writeCharacters(stringToWrite.toString());
				}

			}


			/**
			 * Register a namespace prefix
			 */
			private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
				java.lang.String prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
						prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
					}

					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);
				}

				return prefix;
			}



			/**
			 * databinding method to get an XML representation of this object
			 *
			 */
			public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException{




				//We can safely assume an element has only one type associated with it
				return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(MY_QNAME,
						new java.lang.Object[]{
							org.apache.axis2.databinding.utils.reader.ADBXMLStreamReader.ELEMENT_TEXT,
					   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNotValidDestinationErrorMessage)
						},
						null);

			}



			/**
			 *  Factory class that keeps the parse method
			 */
			public static class Factory{




				/**
				 * static method to create the object
				 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
				 *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
				 * Postcondition: If this object is an element, the reader is positioned at its end element
				 *                If this object is a complex type, the reader is positioned at the end element of its outer element
				 */
				public static NotValidDestinationErrorMessage parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
					NotValidDestinationErrorMessage object =
						new NotValidDestinationErrorMessage();

					int event;
					java.lang.String nillableValue = null;
					java.lang.String prefix ="";
					java.lang.String namespaceuri ="";
					try {

						while (!reader.isStartElement() && !reader.isEndElement())
							reader.next();




						// Note all attributes that were handled. Used to differ normal attributes
						// from anyAttributes.
						java.util.Vector handledAttributes = new java.util.Vector();



						while(!reader.isEndElement()) {
							if (reader.isStartElement() ){

								if (reader.isStartElement() && new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","notValidDestinationErrorMessage").equals(reader.getName())){

									java.lang.String content = reader.getElementText();

									object.setNotValidDestinationErrorMessage(
											org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

								}  // End of if for expected property start element

								else{
									// A start element we are not expecting indicates an invalid parameter was passed
									throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
								}

							} else {
								reader.next();
							}  
						}  // end of while loop




					} catch (javax.xml.stream.XMLStreamException e) {
						throw new java.lang.Exception(e);
					}

					return object;
				}

			}//end of factory class



	}


	public static class NotValidSeatErrorMessage
			implements org.apache.axis2.databinding.ADBBean{

			public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
					"http://flightbooking.t3.sos.fi.upm.es",
					"notValidSeatErrorMessage",
					"ns1");



			private static java.lang.String generatePrefix(java.lang.String namespace) {
				if(namespace.equals("http://flightbooking.t3.sos.fi.upm.es")){
					return "ns1";
				}
				return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
			}



			/**
			 * field for NotValidSeatErrorMessage
			 */


			protected java.lang.String localNotValidSeatErrorMessage ;


			/**
			 * Auto generated getter method
			 * @return java.lang.String
			 */
			public  java.lang.String getNotValidSeatErrorMessage(){
				return localNotValidSeatErrorMessage;
			}



			/**
			 * Auto generated setter method
			 * @param param NotValidSeatErrorMessage
			 */
			public void setNotValidSeatErrorMessage(java.lang.String param){

				this.localNotValidSeatErrorMessage=param;


			}


			/**
			 * isReaderMTOMAware
			 * @return true if the reader supports MTOM
			 */
			public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
				boolean isReaderMTOMAware = false;

				try{
					isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
				}catch(java.lang.IllegalArgumentException e){
					isReaderMTOMAware = false;
				}
				return isReaderMTOMAware;
			}


			/**
			 *
			 * @param parentQName
			 * @param factory
			 * @return org.apache.axiom.om.OMElement
			 */
			public org.apache.axiom.om.OMElement getOMElement (
					final javax.xml.namespace.QName parentQName,
					final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



				org.apache.axiom.om.OMDataSource dataSource =
					new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

						public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
							NotValidSeatErrorMessage.this.serialize(MY_QNAME,factory,xmlWriter);
						}
					};
				return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
						MY_QNAME,factory,dataSource);

					}

			public void serialize(final javax.xml.namespace.QName parentQName,
					final org.apache.axiom.om.OMFactory factory,
					org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
				serialize(parentQName,factory,xmlWriter,false);
			}

			public void serialize(final javax.xml.namespace.QName parentQName,
					final org.apache.axiom.om.OMFactory factory,
					org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
					boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{


				//We can safely assume an element has only one type associated with it

				java.lang.String namespace = "http://flightbooking.t3.sos.fi.upm.es";
				java.lang.String localName = "notValidSeatErrorMessage";

				if (! namespace.equals("")) {
					java.lang.String prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix, localName, namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace, localName);
					}

				} else {
					xmlWriter.writeStartElement(localName);
				}

				// add the type details if this is used in a simple type
				if (serializeType){
					java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://flightbooking.t3.sos.fi.upm.es");
					if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
						writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
								namespacePrefix+":notValidSeatErrorMessage",
								xmlWriter);
					} else {
						writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
								"notValidSeatErrorMessage",
								xmlWriter);
					}
				}

				if (localNotValidSeatErrorMessage==null){

					throw new org.apache.axis2.databinding.ADBException("Value cannot be null !!");

				}else{

					xmlWriter.writeCharacters(localNotValidSeatErrorMessage);

				}

				xmlWriter.writeEndElement();



			}

			/**
			 * Util method to write an attribute with the ns prefix
			 */
			private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
					java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
				if (xmlWriter.getPrefix(namespace) == null) {
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				}

				xmlWriter.writeAttribute(namespace,attName,attValue);

			}

			/**
			 * Util method to write an attribute without the ns prefix
			 */
			private void writeAttribute(java.lang.String namespace,java.lang.String attName,
					java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
				if (namespace.equals(""))
				{
					xmlWriter.writeAttribute(attName,attValue);
				}
				else
				{
					registerPrefix(xmlWriter, namespace);
					xmlWriter.writeAttribute(namespace,attName,attValue);
				}
			}


			/**
			 * Util method to write an attribute without the ns prefix
			 */
			private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
					javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

				java.lang.String attributeNamespace = qname.getNamespaceURI();
				java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
				if (attributePrefix == null) {
					attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
				}
				java.lang.String attributeValue;
				if (attributePrefix.trim().length() > 0) {
					attributeValue = attributePrefix + ":" + qname.getLocalPart();
				} else {
					attributeValue = qname.getLocalPart();
				}

				if (namespace.equals("")) {
					xmlWriter.writeAttribute(attName, attributeValue);
				} else {
					registerPrefix(xmlWriter, namespace);
					xmlWriter.writeAttribute(namespace, attName, attributeValue);
				}
			}
			/**
			 *  method to handle Qnames
			 */

			private void writeQName(javax.xml.namespace.QName qname,
					javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
				java.lang.String namespaceURI = qname.getNamespaceURI();
				if (namespaceURI != null) {
					java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
					if (prefix == null) {
						prefix = generatePrefix(namespaceURI);
						xmlWriter.writeNamespace(prefix, namespaceURI);
						xmlWriter.setPrefix(prefix,namespaceURI);
					}

					if (prefix.trim().length() > 0){
						xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
					} else {
						// i.e this is the default namespace
						xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
					}

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}
			}

			private void writeQNames(javax.xml.namespace.QName[] qnames,
					javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

				if (qnames != null) {
					// we have to store this data until last moment since it is not possible to write any
					// namespace data after writing the charactor data
					java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
					java.lang.String namespaceURI = null;
					java.lang.String prefix = null;

					for (int i = 0; i < qnames.length; i++) {
						if (i > 0) {
							stringToWrite.append(" ");
						}
						namespaceURI = qnames[i].getNamespaceURI();
						if (namespaceURI != null) {
							prefix = xmlWriter.getPrefix(namespaceURI);
							if ((prefix == null) || (prefix.length() == 0)) {
								prefix = generatePrefix(namespaceURI);
								xmlWriter.writeNamespace(prefix, namespaceURI);
								xmlWriter.setPrefix(prefix,namespaceURI);
							}

							if (prefix.trim().length() > 0){
								stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
							} else {
								stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
							}
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					}
					xmlWriter.writeCharacters(stringToWrite.toString());
				}

			}


			/**
			 * Register a namespace prefix
			 */
			private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
				java.lang.String prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
						prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
					}

					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);
				}

				return prefix;
			}



			/**
			 * databinding method to get an XML representation of this object
			 *
			 */
			public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException{




				//We can safely assume an element has only one type associated with it
				return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(MY_QNAME,
						new java.lang.Object[]{
							org.apache.axis2.databinding.utils.reader.ADBXMLStreamReader.ELEMENT_TEXT,
					   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNotValidSeatErrorMessage)
						},
						null);

			}



			/**
			 *  Factory class that keeps the parse method
			 */
			public static class Factory{




				/**
				 * static method to create the object
				 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
				 *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
				 * Postcondition: If this object is an element, the reader is positioned at its end element
				 *                If this object is a complex type, the reader is positioned at the end element of its outer element
				 */
				public static NotValidSeatErrorMessage parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
					NotValidSeatErrorMessage object =
						new NotValidSeatErrorMessage();

					int event;
					java.lang.String nillableValue = null;
					java.lang.String prefix ="";
					java.lang.String namespaceuri ="";
					try {

						while (!reader.isStartElement() && !reader.isEndElement())
							reader.next();




						// Note all attributes that were handled. Used to differ normal attributes
						// from anyAttributes.
						java.util.Vector handledAttributes = new java.util.Vector();



						while(!reader.isEndElement()) {
							if (reader.isStartElement() ){

								if (reader.isStartElement() && new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","notValidSeatErrorMessage").equals(reader.getName())){

									java.lang.String content = reader.getElementText();

									object.setNotValidSeatErrorMessage(
											org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

								}  // End of if for expected property start element

								else{
									// A start element we are not expecting indicates an invalid parameter was passed
									throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
								}

							} else {
								reader.next();
							}  
						}  // end of while loop




					} catch (javax.xml.stream.XMLStreamException e) {
						throw new java.lang.Exception(e);
					}

					return object;
				}

			}//end of factory class



	}


	public static class CheckingFlight
			implements org.apache.axis2.databinding.ADBBean{

			public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
					"http://flightbooking.t3.sos.fi.upm.es",
					"checkingFlight",
					"ns1");



			private static java.lang.String generatePrefix(java.lang.String namespace) {
				if(namespace.equals("http://flightbooking.t3.sos.fi.upm.es")){
					return "ns1";
				}
				return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
			}



			/**
			 * field for Origin
			 */


			protected java.lang.String localOrigin ;


			/**
			 * Auto generated getter method
			 * @return java.lang.String
			 */
			public  java.lang.String getOrigin(){
				return localOrigin;
			}



			/**
			 * Auto generated setter method
			 * @param param Origin
			 */
			public void setOrigin(java.lang.String param){

				this.localOrigin=param;


			}


			/**
			 * field for Destination
			 */


			protected java.lang.String localDestination ;


			/**
			 * Auto generated getter method
			 * @return java.lang.String
			 */
			public  java.lang.String getDestination(){
				return localDestination;
			}



			/**
			 * Auto generated setter method
			 * @param param Destination
			 */
			public void setDestination(java.lang.String param){

				this.localDestination=param;


			}


			/**
			 * isReaderMTOMAware
			 * @return true if the reader supports MTOM
			 */
			public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
				boolean isReaderMTOMAware = false;

				try{
					isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
				}catch(java.lang.IllegalArgumentException e){
					isReaderMTOMAware = false;
				}
				return isReaderMTOMAware;
			}


			/**
			 *
			 * @param parentQName
			 * @param factory
			 * @return org.apache.axiom.om.OMElement
			 */
			public org.apache.axiom.om.OMElement getOMElement (
					final javax.xml.namespace.QName parentQName,
					final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



				org.apache.axiom.om.OMDataSource dataSource =
					new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

						public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
							CheckingFlight.this.serialize(MY_QNAME,factory,xmlWriter);
						}
					};
				return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
						MY_QNAME,factory,dataSource);

					}

			public void serialize(final javax.xml.namespace.QName parentQName,
					final org.apache.axiom.om.OMFactory factory,
					org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
				serialize(parentQName,factory,xmlWriter,false);
			}

			public void serialize(final javax.xml.namespace.QName parentQName,
					final org.apache.axiom.om.OMFactory factory,
					org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
					boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{




				java.lang.String prefix = null;
				java.lang.String namespace = null;


				prefix = parentQName.getPrefix();
				namespace = parentQName.getNamespaceURI();

				if ((namespace != null) && (namespace.trim().length() > 0)) {
					java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
					if (writerPrefix != null) {
						xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
					} else {
						if (prefix == null) {
							prefix = generatePrefix(namespace);
						}

						xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);
					}
				} else {
					xmlWriter.writeStartElement(parentQName.getLocalPart());
				}

				if (serializeType){


					java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://flightbooking.t3.sos.fi.upm.es");
					if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
						writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
								namespacePrefix+":checkingFlight",
								xmlWriter);
					} else {
						writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
								"checkingFlight",
								xmlWriter);
					}


				}

				namespace = "http://flightbooking.t3.sos.fi.upm.es";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"origin", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"origin");
					}

				} else {
					xmlWriter.writeStartElement("origin");
				}


				if (localOrigin==null){
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("origin cannot be null!!");

				}else{


					xmlWriter.writeCharacters(localOrigin);

				}

				xmlWriter.writeEndElement();

				namespace = "http://flightbooking.t3.sos.fi.upm.es";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"destination", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"destination");
					}

				} else {
					xmlWriter.writeStartElement("destination");
				}


				if (localDestination==null){
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("destination cannot be null!!");

				}else{


					xmlWriter.writeCharacters(localDestination);

				}

				xmlWriter.writeEndElement();

				xmlWriter.writeEndElement();


			}

			/**
			 * Util method to write an attribute with the ns prefix
			 */
			private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
					java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
				if (xmlWriter.getPrefix(namespace) == null) {
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				}

				xmlWriter.writeAttribute(namespace,attName,attValue);

			}

			/**
			 * Util method to write an attribute without the ns prefix
			 */
			private void writeAttribute(java.lang.String namespace,java.lang.String attName,
					java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
				if (namespace.equals(""))
				{
					xmlWriter.writeAttribute(attName,attValue);
				}
				else
				{
					registerPrefix(xmlWriter, namespace);
					xmlWriter.writeAttribute(namespace,attName,attValue);
				}
			}


			/**
			 * Util method to write an attribute without the ns prefix
			 */
			private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
					javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

				java.lang.String attributeNamespace = qname.getNamespaceURI();
				java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
				if (attributePrefix == null) {
					attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
				}
				java.lang.String attributeValue;
				if (attributePrefix.trim().length() > 0) {
					attributeValue = attributePrefix + ":" + qname.getLocalPart();
				} else {
					attributeValue = qname.getLocalPart();
				}

				if (namespace.equals("")) {
					xmlWriter.writeAttribute(attName, attributeValue);
				} else {
					registerPrefix(xmlWriter, namespace);
					xmlWriter.writeAttribute(namespace, attName, attributeValue);
				}
			}
			/**
			 *  method to handle Qnames
			 */

			private void writeQName(javax.xml.namespace.QName qname,
					javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
				java.lang.String namespaceURI = qname.getNamespaceURI();
				if (namespaceURI != null) {
					java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
					if (prefix == null) {
						prefix = generatePrefix(namespaceURI);
						xmlWriter.writeNamespace(prefix, namespaceURI);
						xmlWriter.setPrefix(prefix,namespaceURI);
					}

					if (prefix.trim().length() > 0){
						xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
					} else {
						// i.e this is the default namespace
						xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
					}

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}
			}

			private void writeQNames(javax.xml.namespace.QName[] qnames,
					javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

				if (qnames != null) {
					// we have to store this data until last moment since it is not possible to write any
					// namespace data after writing the charactor data
					java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
					java.lang.String namespaceURI = null;
					java.lang.String prefix = null;

					for (int i = 0; i < qnames.length; i++) {
						if (i > 0) {
							stringToWrite.append(" ");
						}
						namespaceURI = qnames[i].getNamespaceURI();
						if (namespaceURI != null) {
							prefix = xmlWriter.getPrefix(namespaceURI);
							if ((prefix == null) || (prefix.length() == 0)) {
								prefix = generatePrefix(namespaceURI);
								xmlWriter.writeNamespace(prefix, namespaceURI);
								xmlWriter.setPrefix(prefix,namespaceURI);
							}

							if (prefix.trim().length() > 0){
								stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
							} else {
								stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
							}
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					}
					xmlWriter.writeCharacters(stringToWrite.toString());
				}

			}


			/**
			 * Register a namespace prefix
			 */
			private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
				java.lang.String prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
						prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
					}

					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);
				}

				return prefix;
			}



			/**
			 * databinding method to get an XML representation of this object
			 *
			 */
			public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException{



				java.util.ArrayList elementList = new java.util.ArrayList();
				java.util.ArrayList attribList = new java.util.ArrayList();


				elementList.add(new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es",
							"origin"));

				if (localOrigin != null){
					elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOrigin));
				} else {
					throw new org.apache.axis2.databinding.ADBException("origin cannot be null!!");
				}

				elementList.add(new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es",
							"destination"));

				if (localDestination != null){
					elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDestination));
				} else {
					throw new org.apache.axis2.databinding.ADBException("destination cannot be null!!");
				}


				return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());



			}



			/**
			 *  Factory class that keeps the parse method
			 */
			public static class Factory{




				/**
				 * static method to create the object
				 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
				 *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
				 * Postcondition: If this object is an element, the reader is positioned at its end element
				 *                If this object is a complex type, the reader is positioned at the end element of its outer element
				 */
				public static CheckingFlight parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
					CheckingFlight object =
						new CheckingFlight();

					int event;
					java.lang.String nillableValue = null;
					java.lang.String prefix ="";
					java.lang.String namespaceuri ="";
					try {

						while (!reader.isStartElement() && !reader.isEndElement())
							reader.next();


						if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
							java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
									"type");
							if (fullTypeName!=null){
								java.lang.String nsPrefix = null;
								if (fullTypeName.indexOf(":") > -1){
									nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
								}
								nsPrefix = nsPrefix==null?"":nsPrefix;

								java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);

								if (!"checkingFlight".equals(type)){
									//find namespace for the prefix
									java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
									return (CheckingFlight)ExtensionMapper.getTypeObject(
											nsUri,type,reader);
								}


							}


						}




						// Note all attributes that were handled. Used to differ normal attributes
						// from anyAttributes.
						java.util.Vector handledAttributes = new java.util.Vector();




						reader.next();


						while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

						if (reader.isStartElement() && new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","origin").equals(reader.getName())){

							java.lang.String content = reader.getElementText();

							object.setOrigin(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

							reader.next();

						}  // End of if for expected property start element

						else{
							// A start element we are not expecting indicates an invalid parameter was passed
							throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
						}


						while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

						if (reader.isStartElement() && new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","destination").equals(reader.getName())){

							java.lang.String content = reader.getElementText();

							object.setDestination(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

							reader.next();

						}  // End of if for expected property start element

						else{
							// A start element we are not expecting indicates an invalid parameter was passed
							throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
						}

						while (!reader.isStartElement() && !reader.isEndElement())
							reader.next();

						if (reader.isStartElement())
							// A start element we are not expecting indicates a trailing invalid property
							throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());




					} catch (javax.xml.stream.XMLStreamException e) {
						throw new java.lang.Exception(e);
					}

					return object;
				}

			}//end of factory class



	}


	public static class Origin
			implements org.apache.axis2.databinding.ADBBean{

			public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
					"http://flightbooking.t3.sos.fi.upm.es",
					"origin",
					"ns1");



			private static java.lang.String generatePrefix(java.lang.String namespace) {
				if(namespace.equals("http://flightbooking.t3.sos.fi.upm.es")){
					return "ns1";
				}
				return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
			}



			/**
			 * field for Origin
			 */


			protected java.lang.String localOrigin ;


			/**
			 * Auto generated getter method
			 * @return java.lang.String
			 */
			public  java.lang.String getOrigin(){
				return localOrigin;
			}



			/**
			 * Auto generated setter method
			 * @param param Origin
			 */
			public void setOrigin(java.lang.String param){

				this.localOrigin=param;


			}


			/**
			 * isReaderMTOMAware
			 * @return true if the reader supports MTOM
			 */
			public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
				boolean isReaderMTOMAware = false;

				try{
					isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
				}catch(java.lang.IllegalArgumentException e){
					isReaderMTOMAware = false;
				}
				return isReaderMTOMAware;
			}


			/**
			 *
			 * @param parentQName
			 * @param factory
			 * @return org.apache.axiom.om.OMElement
			 */
			public org.apache.axiom.om.OMElement getOMElement (
					final javax.xml.namespace.QName parentQName,
					final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



				org.apache.axiom.om.OMDataSource dataSource =
					new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

						public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
							Origin.this.serialize(MY_QNAME,factory,xmlWriter);
						}
					};
				return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
						MY_QNAME,factory,dataSource);

					}

			public void serialize(final javax.xml.namespace.QName parentQName,
					final org.apache.axiom.om.OMFactory factory,
					org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
				serialize(parentQName,factory,xmlWriter,false);
			}

			public void serialize(final javax.xml.namespace.QName parentQName,
					final org.apache.axiom.om.OMFactory factory,
					org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
					boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{


				//We can safely assume an element has only one type associated with it

				java.lang.String namespace = "http://flightbooking.t3.sos.fi.upm.es";
				java.lang.String localName = "origin";

				if (! namespace.equals("")) {
					java.lang.String prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix, localName, namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace, localName);
					}

				} else {
					xmlWriter.writeStartElement(localName);
				}

				// add the type details if this is used in a simple type
				if (serializeType){
					java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://flightbooking.t3.sos.fi.upm.es");
					if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
						writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
								namespacePrefix+":origin",
								xmlWriter);
					} else {
						writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
								"origin",
								xmlWriter);
					}
				}

				if (localOrigin==null){

					throw new org.apache.axis2.databinding.ADBException("Value cannot be null !!");

				}else{

					xmlWriter.writeCharacters(localOrigin);

				}

				xmlWriter.writeEndElement();



			}

			/**
			 * Util method to write an attribute with the ns prefix
			 */
			private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
					java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
				if (xmlWriter.getPrefix(namespace) == null) {
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				}

				xmlWriter.writeAttribute(namespace,attName,attValue);

			}

			/**
			 * Util method to write an attribute without the ns prefix
			 */
			private void writeAttribute(java.lang.String namespace,java.lang.String attName,
					java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
				if (namespace.equals(""))
				{
					xmlWriter.writeAttribute(attName,attValue);
				}
				else
				{
					registerPrefix(xmlWriter, namespace);
					xmlWriter.writeAttribute(namespace,attName,attValue);
				}
			}


			/**
			 * Util method to write an attribute without the ns prefix
			 */
			private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
					javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

				java.lang.String attributeNamespace = qname.getNamespaceURI();
				java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
				if (attributePrefix == null) {
					attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
				}
				java.lang.String attributeValue;
				if (attributePrefix.trim().length() > 0) {
					attributeValue = attributePrefix + ":" + qname.getLocalPart();
				} else {
					attributeValue = qname.getLocalPart();
				}

				if (namespace.equals("")) {
					xmlWriter.writeAttribute(attName, attributeValue);
				} else {
					registerPrefix(xmlWriter, namespace);
					xmlWriter.writeAttribute(namespace, attName, attributeValue);
				}
			}
			/**
			 *  method to handle Qnames
			 */

			private void writeQName(javax.xml.namespace.QName qname,
					javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
				java.lang.String namespaceURI = qname.getNamespaceURI();
				if (namespaceURI != null) {
					java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
					if (prefix == null) {
						prefix = generatePrefix(namespaceURI);
						xmlWriter.writeNamespace(prefix, namespaceURI);
						xmlWriter.setPrefix(prefix,namespaceURI);
					}

					if (prefix.trim().length() > 0){
						xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
					} else {
						// i.e this is the default namespace
						xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
					}

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}
			}

			private void writeQNames(javax.xml.namespace.QName[] qnames,
					javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

				if (qnames != null) {
					// we have to store this data until last moment since it is not possible to write any
					// namespace data after writing the charactor data
					java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
					java.lang.String namespaceURI = null;
					java.lang.String prefix = null;

					for (int i = 0; i < qnames.length; i++) {
						if (i > 0) {
							stringToWrite.append(" ");
						}
						namespaceURI = qnames[i].getNamespaceURI();
						if (namespaceURI != null) {
							prefix = xmlWriter.getPrefix(namespaceURI);
							if ((prefix == null) || (prefix.length() == 0)) {
								prefix = generatePrefix(namespaceURI);
								xmlWriter.writeNamespace(prefix, namespaceURI);
								xmlWriter.setPrefix(prefix,namespaceURI);
							}

							if (prefix.trim().length() > 0){
								stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
							} else {
								stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
							}
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					}
					xmlWriter.writeCharacters(stringToWrite.toString());
				}

			}


			/**
			 * Register a namespace prefix
			 */
			private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
				java.lang.String prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
						prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
					}

					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);
				}

				return prefix;
			}



			/**
			 * databinding method to get an XML representation of this object
			 *
			 */
			public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException{




				//We can safely assume an element has only one type associated with it
				return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(MY_QNAME,
						new java.lang.Object[]{
							org.apache.axis2.databinding.utils.reader.ADBXMLStreamReader.ELEMENT_TEXT,
					   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOrigin)
						},
						null);

			}



			/**
			 *  Factory class that keeps the parse method
			 */
			public static class Factory{




				/**
				 * static method to create the object
				 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
				 *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
				 * Postcondition: If this object is an element, the reader is positioned at its end element
				 *                If this object is a complex type, the reader is positioned at the end element of its outer element
				 */
				public static Origin parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
					Origin object =
						new Origin();

					int event;
					java.lang.String nillableValue = null;
					java.lang.String prefix ="";
					java.lang.String namespaceuri ="";
					try {

						while (!reader.isStartElement() && !reader.isEndElement())
							reader.next();




						// Note all attributes that were handled. Used to differ normal attributes
						// from anyAttributes.
						java.util.Vector handledAttributes = new java.util.Vector();



						while(!reader.isEndElement()) {
							if (reader.isStartElement() ){

								if (reader.isStartElement() && new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","origin").equals(reader.getName())){

									java.lang.String content = reader.getElementText();

									object.setOrigin(
											org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

								}  // End of if for expected property start element

								else{
									// A start element we are not expecting indicates an invalid parameter was passed
									throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
								}

							} else {
								reader.next();
							}  
						}  // end of while loop




					} catch (javax.xml.stream.XMLStreamException e) {
						throw new java.lang.Exception(e);
					}

					return object;
				}

			}//end of factory class



	}


	public static class CancellingFlight
			implements org.apache.axis2.databinding.ADBBean{

			public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
					"http://flightbooking.t3.sos.fi.upm.es",
					"cancellingFlight",
					"ns1");



			private static java.lang.String generatePrefix(java.lang.String namespace) {
				if(namespace.equals("http://flightbooking.t3.sos.fi.upm.es")){
					return "ns1";
				}
				return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
			}



			/**
			 * field for Origin
			 */


			protected java.lang.String localOrigin ;


			/**
			 * Auto generated getter method
			 * @return java.lang.String
			 */
			public  java.lang.String getOrigin(){
				return localOrigin;
			}



			/**
			 * Auto generated setter method
			 * @param param Origin
			 */
			public void setOrigin(java.lang.String param){

				this.localOrigin=param;


			}


			/**
			 * field for Destination
			 */


			protected java.lang.String localDestination ;


			/**
			 * Auto generated getter method
			 * @return java.lang.String
			 */
			public  java.lang.String getDestination(){
				return localDestination;
			}



			/**
			 * Auto generated setter method
			 * @param param Destination
			 */
			public void setDestination(java.lang.String param){

				this.localDestination=param;


			}


			/**
			 * field for Seat
			 */


			protected int localSeat ;


			/**
			 * Auto generated getter method
			 * @return int
			 */
			public  int getSeat(){
				return localSeat;
			}



			/**
			 * Auto generated setter method
			 * @param param Seat
			 */
			public void setSeat(int param){

				this.localSeat=param;


			}


			/**
			 * isReaderMTOMAware
			 * @return true if the reader supports MTOM
			 */
			public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
				boolean isReaderMTOMAware = false;

				try{
					isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
				}catch(java.lang.IllegalArgumentException e){
					isReaderMTOMAware = false;
				}
				return isReaderMTOMAware;
			}


			/**
			 *
			 * @param parentQName
			 * @param factory
			 * @return org.apache.axiom.om.OMElement
			 */
			public org.apache.axiom.om.OMElement getOMElement (
					final javax.xml.namespace.QName parentQName,
					final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{



				org.apache.axiom.om.OMDataSource dataSource =
					new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME){

						public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
							CancellingFlight.this.serialize(MY_QNAME,factory,xmlWriter);
						}
					};
				return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
						MY_QNAME,factory,dataSource);

					}

			public void serialize(final javax.xml.namespace.QName parentQName,
					final org.apache.axiom.om.OMFactory factory,
					org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
				serialize(parentQName,factory,xmlWriter,false);
			}

			public void serialize(final javax.xml.namespace.QName parentQName,
					final org.apache.axiom.om.OMFactory factory,
					org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
					boolean serializeType)
				throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{




				java.lang.String prefix = null;
				java.lang.String namespace = null;


				prefix = parentQName.getPrefix();
				namespace = parentQName.getNamespaceURI();

				if ((namespace != null) && (namespace.trim().length() > 0)) {
					java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
					if (writerPrefix != null) {
						xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
					} else {
						if (prefix == null) {
							prefix = generatePrefix(namespace);
						}

						xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);
					}
				} else {
					xmlWriter.writeStartElement(parentQName.getLocalPart());
				}

				if (serializeType){


					java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://flightbooking.t3.sos.fi.upm.es");
					if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
						writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
								namespacePrefix+":cancellingFlight",
								xmlWriter);
					} else {
						writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
								"cancellingFlight",
								xmlWriter);
					}


				}

				namespace = "http://flightbooking.t3.sos.fi.upm.es";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"origin", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"origin");
					}

				} else {
					xmlWriter.writeStartElement("origin");
				}


				if (localOrigin==null){
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("origin cannot be null!!");

				}else{


					xmlWriter.writeCharacters(localOrigin);

				}

				xmlWriter.writeEndElement();

				namespace = "http://flightbooking.t3.sos.fi.upm.es";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"destination", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"destination");
					}

				} else {
					xmlWriter.writeStartElement("destination");
				}


				if (localDestination==null){
					// write the nil attribute

					throw new org.apache.axis2.databinding.ADBException("destination cannot be null!!");

				}else{


					xmlWriter.writeCharacters(localDestination);

				}

				xmlWriter.writeEndElement();

				namespace = "http://flightbooking.t3.sos.fi.upm.es";
				if (! namespace.equals("")) {
					prefix = xmlWriter.getPrefix(namespace);

					if (prefix == null) {
						prefix = generatePrefix(namespace);

						xmlWriter.writeStartElement(prefix,"seat", namespace);
						xmlWriter.writeNamespace(prefix, namespace);
						xmlWriter.setPrefix(prefix, namespace);

					} else {
						xmlWriter.writeStartElement(namespace,"seat");
					}

				} else {
					xmlWriter.writeStartElement("seat");
				}

				if (localSeat==java.lang.Integer.MIN_VALUE) {

					throw new org.apache.axis2.databinding.ADBException("seat cannot be null!!");

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSeat));
				}

				xmlWriter.writeEndElement();

				xmlWriter.writeEndElement();


			}

			/**
			 * Util method to write an attribute with the ns prefix
			 */
			private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
					java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
				if (xmlWriter.getPrefix(namespace) == null) {
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				}

				xmlWriter.writeAttribute(namespace,attName,attValue);

			}

			/**
			 * Util method to write an attribute without the ns prefix
			 */
			private void writeAttribute(java.lang.String namespace,java.lang.String attName,
					java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
				if (namespace.equals(""))
				{
					xmlWriter.writeAttribute(attName,attValue);
				}
				else
				{
					registerPrefix(xmlWriter, namespace);
					xmlWriter.writeAttribute(namespace,attName,attValue);
				}
			}


			/**
			 * Util method to write an attribute without the ns prefix
			 */
			private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
					javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

				java.lang.String attributeNamespace = qname.getNamespaceURI();
				java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
				if (attributePrefix == null) {
					attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
				}
				java.lang.String attributeValue;
				if (attributePrefix.trim().length() > 0) {
					attributeValue = attributePrefix + ":" + qname.getLocalPart();
				} else {
					attributeValue = qname.getLocalPart();
				}

				if (namespace.equals("")) {
					xmlWriter.writeAttribute(attName, attributeValue);
				} else {
					registerPrefix(xmlWriter, namespace);
					xmlWriter.writeAttribute(namespace, attName, attributeValue);
				}
			}
			/**
			 *  method to handle Qnames
			 */

			private void writeQName(javax.xml.namespace.QName qname,
					javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
				java.lang.String namespaceURI = qname.getNamespaceURI();
				if (namespaceURI != null) {
					java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
					if (prefix == null) {
						prefix = generatePrefix(namespaceURI);
						xmlWriter.writeNamespace(prefix, namespaceURI);
						xmlWriter.setPrefix(prefix,namespaceURI);
					}

					if (prefix.trim().length() > 0){
						xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
					} else {
						// i.e this is the default namespace
						xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
					}

				} else {
					xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
				}
			}

			private void writeQNames(javax.xml.namespace.QName[] qnames,
					javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

				if (qnames != null) {
					// we have to store this data until last moment since it is not possible to write any
					// namespace data after writing the charactor data
					java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
					java.lang.String namespaceURI = null;
					java.lang.String prefix = null;

					for (int i = 0; i < qnames.length; i++) {
						if (i > 0) {
							stringToWrite.append(" ");
						}
						namespaceURI = qnames[i].getNamespaceURI();
						if (namespaceURI != null) {
							prefix = xmlWriter.getPrefix(namespaceURI);
							if ((prefix == null) || (prefix.length() == 0)) {
								prefix = generatePrefix(namespaceURI);
								xmlWriter.writeNamespace(prefix, namespaceURI);
								xmlWriter.setPrefix(prefix,namespaceURI);
							}

							if (prefix.trim().length() > 0){
								stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
							} else {
								stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
							}
						} else {
							stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
						}
					}
					xmlWriter.writeCharacters(stringToWrite.toString());
				}

			}


			/**
			 * Register a namespace prefix
			 */
			private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
				java.lang.String prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
						prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
					}

					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);
				}

				return prefix;
			}



			/**
			 * databinding method to get an XML representation of this object
			 *
			 */
			public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
				throws org.apache.axis2.databinding.ADBException{



				java.util.ArrayList elementList = new java.util.ArrayList();
				java.util.ArrayList attribList = new java.util.ArrayList();


				elementList.add(new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es",
							"origin"));

				if (localOrigin != null){
					elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOrigin));
				} else {
					throw new org.apache.axis2.databinding.ADBException("origin cannot be null!!");
				}

				elementList.add(new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es",
							"destination"));

				if (localDestination != null){
					elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDestination));
				} else {
					throw new org.apache.axis2.databinding.ADBException("destination cannot be null!!");
				}

				elementList.add(new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es",
							"seat"));

				elementList.add(
						org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSeat));


				return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());



			}



			/**
			 *  Factory class that keeps the parse method
			 */
			public static class Factory{




				/**
				 * static method to create the object
				 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
				 *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
				 * Postcondition: If this object is an element, the reader is positioned at its end element
				 *                If this object is a complex type, the reader is positioned at the end element of its outer element
				 */
				public static CancellingFlight parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
					CancellingFlight object =
						new CancellingFlight();

					int event;
					java.lang.String nillableValue = null;
					java.lang.String prefix ="";
					java.lang.String namespaceuri ="";
					try {

						while (!reader.isStartElement() && !reader.isEndElement())
							reader.next();


						if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
							java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
									"type");
							if (fullTypeName!=null){
								java.lang.String nsPrefix = null;
								if (fullTypeName.indexOf(":") > -1){
									nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
								}
								nsPrefix = nsPrefix==null?"":nsPrefix;

								java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);

								if (!"cancellingFlight".equals(type)){
									//find namespace for the prefix
									java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
									return (CancellingFlight)ExtensionMapper.getTypeObject(
											nsUri,type,reader);
								}


							}


						}




						// Note all attributes that were handled. Used to differ normal attributes
						// from anyAttributes.
						java.util.Vector handledAttributes = new java.util.Vector();




						reader.next();


						while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

						if (reader.isStartElement() && new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","origin").equals(reader.getName())){

							java.lang.String content = reader.getElementText();

							object.setOrigin(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

							reader.next();

						}  // End of if for expected property start element

						else{
							// A start element we are not expecting indicates an invalid parameter was passed
							throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
						}


						while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

						if (reader.isStartElement() && new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","destination").equals(reader.getName())){

							java.lang.String content = reader.getElementText();

							object.setDestination(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

							reader.next();

						}  // End of if for expected property start element

						else{
							// A start element we are not expecting indicates an invalid parameter was passed
							throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
						}


						while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

						if (reader.isStartElement() && new javax.xml.namespace.QName("http://flightbooking.t3.sos.fi.upm.es","seat").equals(reader.getName())){

							java.lang.String content = reader.getElementText();

							object.setSeat(
									org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

							reader.next();

						}  // End of if for expected property start element

						else{
							// A start element we are not expecting indicates an invalid parameter was passed
							throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
						}

						while (!reader.isStartElement() && !reader.isEndElement())
							reader.next();

						if (reader.isStartElement())
							// A start element we are not expecting indicates a trailing invalid property
							throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());




					} catch (javax.xml.stream.XMLStreamException e) {
						throw new java.lang.Exception(e);
					}

					return object;
				}

			}//end of factory class



	}


	private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.BookingFlight param, boolean optimizeContent)
		throws org.apache.axis2.AxisFault {


		try{
			return param.getOMElement(es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.BookingFlight.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}

	private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.BookingFlightResponse param, boolean optimizeContent)
		throws org.apache.axis2.AxisFault {


		try{
			return param.getOMElement(es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.BookingFlightResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}

	private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.NotValidOriginErrorMessage param, boolean optimizeContent)
		throws org.apache.axis2.AxisFault {


		try{
			return param.getOMElement(es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.NotValidOriginErrorMessage.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}

	private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.NotValidDestinationErrorMessage param, boolean optimizeContent)
		throws org.apache.axis2.AxisFault {


		try{
			return param.getOMElement(es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.NotValidDestinationErrorMessage.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}

	private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.NotEnoughSeatsErrorMessage param, boolean optimizeContent)
		throws org.apache.axis2.AxisFault {


		try{
			return param.getOMElement(es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.NotEnoughSeatsErrorMessage.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}

	private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.NotValidSeatErrorMessage param, boolean optimizeContent)
		throws org.apache.axis2.AxisFault {


		try{
			return param.getOMElement(es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.NotValidSeatErrorMessage.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}

	private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.CheckingFlight param, boolean optimizeContent)
		throws org.apache.axis2.AxisFault {


		try{
			return param.getOMElement(es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.CheckingFlight.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}

	private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.CheckingFlightResponse param, boolean optimizeContent)
		throws org.apache.axis2.AxisFault {


		try{
			return param.getOMElement(es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.CheckingFlightResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}

	private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.Origin param, boolean optimizeContent)
		throws org.apache.axis2.AxisFault {


		try{
			return param.getOMElement(es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.Origin.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}

	private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.DestinationList param, boolean optimizeContent)
		throws org.apache.axis2.AxisFault {


		try{
			return param.getOMElement(es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.DestinationList.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}

	private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.CancellingFlight param, boolean optimizeContent)
		throws org.apache.axis2.AxisFault {


		try{
			return param.getOMElement(es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.CancellingFlight.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}

	private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.CancellingFlightResponse param, boolean optimizeContent)
		throws org.apache.axis2.AxisFault {


		try{
			return param.getOMElement(es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.CancellingFlightResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}

	private  org.apache.axiom.om.OMElement  toOM(es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.OriginList param, boolean optimizeContent)
		throws org.apache.axis2.AxisFault {


		try{
			return param.getOMElement(es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.OriginList.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}


	private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.BookingFlight param, boolean optimizeContent)
		throws org.apache.axis2.AxisFault{


		try{

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(param.getOMElement(es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.BookingFlight.MY_QNAME,factory));
			return emptyEnvelope;
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}


	/* methods to provide back word compatibility */



	private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.CheckingFlight param, boolean optimizeContent)
		throws org.apache.axis2.AxisFault{


		try{

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(param.getOMElement(es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.CheckingFlight.MY_QNAME,factory));
			return emptyEnvelope;
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}


	/* methods to provide back word compatibility */



	private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.Origin param, boolean optimizeContent)
		throws org.apache.axis2.AxisFault{


		try{

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(param.getOMElement(es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.Origin.MY_QNAME,factory));
			return emptyEnvelope;
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}


	/* methods to provide back word compatibility */



	private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.CancellingFlight param, boolean optimizeContent)
		throws org.apache.axis2.AxisFault{


		try{

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(param.getOMElement(es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.CancellingFlight.MY_QNAME,factory));
			return emptyEnvelope;
		} catch(org.apache.axis2.databinding.ADBException e){
			throw org.apache.axis2.AxisFault.makeFault(e);
		}


	}


	/* methods to provide back word compatibility */




	/**
	 *  get the default envelope
	 */
	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
		return factory.getDefaultEnvelope();
	}


	private  java.lang.Object fromOM(
			org.apache.axiom.om.OMElement param,
			java.lang.Class type,
			java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

		try {

			if (es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.BookingFlight.class.equals(type)){

				return es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.BookingFlight.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.BookingFlightResponse.class.equals(type)){

				return es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.BookingFlightResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.NotValidOriginErrorMessage.class.equals(type)){

				return es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.NotValidOriginErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.NotValidDestinationErrorMessage.class.equals(type)){

				return es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.NotValidDestinationErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.NotEnoughSeatsErrorMessage.class.equals(type)){

				return es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.NotEnoughSeatsErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.NotValidSeatErrorMessage.class.equals(type)){

				return es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.NotValidSeatErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.CheckingFlight.class.equals(type)){

				return es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.CheckingFlight.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.CheckingFlightResponse.class.equals(type)){

				return es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.CheckingFlightResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.NotValidOriginErrorMessage.class.equals(type)){

				return es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.NotValidOriginErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.NotValidDestinationErrorMessage.class.equals(type)){

				return es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.NotValidDestinationErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.Origin.class.equals(type)){

				return es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.Origin.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.DestinationList.class.equals(type)){

				return es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.DestinationList.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.NotValidOriginErrorMessage.class.equals(type)){

				return es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.NotValidOriginErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.CancellingFlight.class.equals(type)){

				return es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.CancellingFlight.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.CancellingFlightResponse.class.equals(type)){

				return es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.CancellingFlightResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.NotValidOriginErrorMessage.class.equals(type)){

				return es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.NotValidOriginErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.NotValidDestinationErrorMessage.class.equals(type)){

				return es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.NotValidDestinationErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.NotEnoughSeatsErrorMessage.class.equals(type)){

				return es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.NotEnoughSeatsErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.NotValidSeatErrorMessage.class.equals(type)){

				return es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.NotValidSeatErrorMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

			if (es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.OriginList.class.equals(type)){

				return es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.OriginList.Factory.parse(param.getXMLStreamReaderWithoutCaching());


			}

		} catch (java.lang.Exception e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
		return null;
			}




}

