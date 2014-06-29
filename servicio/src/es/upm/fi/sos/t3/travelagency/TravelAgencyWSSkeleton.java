
/**
 * TravelAgencyWSSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.4  Built on : Dec 19, 2010 (08:18:42 CET)
 */
package es.upm.fi.sos.t3.travelagency;

import java.util.*;
import org.apache.axis2.AxisFault;

import java.rmi.RemoteException;
import es.upm.fi.sos.t3.loginservice.LoginServiceWSStub.LoginToken;
import es.upm.fi.sos.t3.hotelbooking.HotelBookingWSStub.CancellingHotel;
import es.upm.fi.sos.t3.hotelbooking.HotelBookingWSStub.CheckingHotel;
import es.upm.fi.sos.t3.hotelbooking.HotelBookingWSStub;
import es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.CheckingFlight;

import es.upm.fi.sos.t3.hotelbooking.NotValidRoomError;
import es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub;
import es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.BookingFlight;
import es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.BookingFlightResponse;
import es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.Origin;
import es.upm.fi.sos.t3.hotelbooking.NotValidHotelError;
import es.upm.fi.sos.t3.flightbooking.FlightBookingWSStub.CancellingFlight;
import es.upm.fi.sos.t3.loginservice.LoginError;
import es.upm.fi.sos.t3.loginservice.LoginServiceWSStub;
import es.upm.fi.sos.t3.hotelbooking.NotEnoughRoomsError;
import es.upm.fi.sos.t3.flightbooking.NotEnoughSeatsError;
import es.upm.fi.sos.t3.hotelbooking.NotValidCityError;
import es.upm.fi.sos.t3.hotelbooking.HotelBookingWSStub.BookingHotel;
import es.upm.fi.sos.t3.hotelbooking.HotelBookingWSStub.City;
import es.upm.fi.sos.t3.flightbooking.NotValidDestinationError;
import es.upm.fi.sos.t3.flightbooking.NotValidSeatError;
import es.upm.fi.sos.t3.hotelbooking.HotelBookingWSStub.BookingHotelResponse;
import es.upm.fi.sos.t3.flightbooking.NotValidOriginError;


/**
 *  TravelAgencyWSSkeleton java skeleton for the axisService
 */
public class TravelAgencyWSSkeleton{


	/**
	 * Auto generated method signature
	 * 
	 * @param checkingTrip
	 * @throws NotValidOriginFlightError : 
	 * @throws NotValidDestinationFlightError : 
	 * @throws NotValidCityHotelError : 
	 * @throws NotValidHotelHotelError : 
	 * @throws RemoteServiceError : 
	 * @throws NotValidSessionError : 
	 */

	static class Usuario{
		public double presupuesto;
		public boolean sesion;
		public Usuario() {
			this.presupuesto = 10000.00;
			this.sesion = false;
		}
	}

	private static HashMap<String, Usuario> registro = new HashMap<String, Usuario>();
	private Usuario user_aux = new Usuario();
	private String name_key = null;
	try{
		LoginServiceWSStub ls = new LoginServiceWSStub();
		ls._getServiceClient().engageModule("addressing");
		ls._getServiceClient().getOptions().setManageSession(true);

		FlightBookingWSStub fb = new FlightBookingWSStub();
		fb._getServiceClient().engageModule("addressing");
		fb._getServiceClient().getOptions().setManageSession(true);

		HotelBookingWSstub hb = new HotelBookingWSStub();
		hb._getServiceClient().engageModule("addressing");
		hb._getServiceClient().getOptions().setManageSession(true);
	}
	catch (AxisFault e){
		e.printStackTrace(System.err);
	}

	private void compruebaSesion() throws NotValidSessionError{
		if(!user_aux.sesion){
			NotValidSessionError err = new NotValidSessionError();
			ErrorMessage message = new ErrorMessage();
			message.setErrorMessage("NotValidSessionError");
			err.setFaultMessage(message);
			throw err;
		}
	}

	public es.upm.fi.sos.t3.travelagency.CheckingTripResponse checkTrip
		(es.upm.fi.sos.t3.travelagency.CheckingTrip checkingTrip)
		throws NotValidOriginFlightError,NotValidDestinationFlightError,NotValidCityHotelError,NotValidHotelHotelError,RemoteServiceError,NotValidSessionError{
		CheckingTripResponse resp = new CheckingTripResponse();
		
	}


	/**
	 * Auto generated method signature
	 * 
	 * @param cancellingOnlyHotel
	 * @throws NotValidCityHotelError : 
	 * @throws NotValidHotelHotelError : 
	 * @throws NotEnoughRoomsHotelError : 
	 * @throws NotValidRoomHotelError : 
	 * @throws RemoteServiceError : 
	 * @throws NotValidSessionError : 
	 */

	public es.upm.fi.sos.t3.travelagency.CancellingOnlyHotelResponse cancelOnlyHotel
		(
		 es.upm.fi.sos.t3.travelagency.CancellingOnlyHotel cancellingOnlyHotel
		)
		throws NotValidCityHotelError,NotValidHotelHotelError,NotEnoughRoomsHotelError,NotValidRoomHotelError,RemoteServiceError,NotValidSessionError{
		//TODO : fill this with the necessary business logic
		throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#cancelOnlyHotel");
		}


	/**
	 * Auto generated method signature
	 * 
	 * @param login
	 * @throws RemoteServiceError : 
	 */

	public es.upm.fi.sos.t3.travelagency.LoginResponse login
		(
		 es.upm.fi.sos.t3.travelagency.Login login
		)
		throws RemoteServiceError{
			LoginResponse resp = new LoginResponse();
			Usuario user = registro.get(login.getUsername());
			if(user.sesion){
				resp.setLoginResponse(true);
			}
			else{
			/* Primero llamamos a Login Service para autenticar el usuario */
				LoginToken lt = new LoginToken();
				lt.setUsername(login.getUsername());
				lt.setPassword(login.getPassword());

				try{
					resp.setLoginResponse(ls.authenticateUser(lt).getLoginTokenResponse());
				}
				catch (RemoteException e){
					RemoteServiceError err = new RemoteServiceError();
					ErrorMessage message = new ErrorMessage();
					message.setErrorMessage("RemoteServiceError");
					err.setFaultMessage(message);
					throw err;
				}catch (LoginError e){
					RemoteServiceError err = new RemoteServiceError();
					ErrorMessage message = new ErrorMessage();
					message.setErrorMessage("RemoteServiceError");
					err.setFaultMessage(message);
					throw err;
				}
				if(resp.getLoginResponse()){
					String nombre = login.getUsername();
					if(registro.containsKey(nombre)){
						registro.get(nombre).sesion = true;
					}
					else{
						Usuario usuario = new Usuario();
						registro.put(nombre, usuario);
						registro.get(nombre).sesion = true;
					}
					resp.setLoginResponse(true);
				}
			}
			name_key = login.getUsername();
			user_aux = user;
			return resp;
		}


	
	/**
	 * Auto generated method signature
	 * 
	 * @throws RemoteServiceError : 
	 * @throws NotValidSessionError : 
	 */

	public es.upm.fi.sos.t3.travelagency.CityHotelList getCityHotelList
		()
		throws RemoteServiceError,NotValidSessionError{
		compruebaSesion();
		CityHotelList resp = new CityHotelList();
		try{
			String[] ciudades = hg.getCityList().getCity();
			resp.setCity(ciudades);
		}
		catch(RemoteException e){
			RemoteServiceError err_remote = new RemoteServiceError();
			ErrorMessage message = new ErrorMessage();
			message.setErrorMessage("RemoteServiceError");
			err_remote.setFaultMessage(message);
			throw err_remote;
		}
		return resp;
		}


	/**
	 * Auto generated method signature
	 * 
	 * @param bookingTrip
	 * @throws NotValidOriginFlightError : 
	 * @throws NotValidDestinationFlightError : 
	 * @throws NotEnoughSeatsFlightError : 
	 * @throws NotValidSeatFlightError : 
	 * @throws NotValidCityHotelError : 
	 * @throws NotValidHotelHotelError : 
	 * @throws NotEnoughRoomsHotelError : 
	 * @throws NotValidRoomHotelError : 
	 * @throws RemoteServiceError : 
	 * @throws NotValidSessionError : 
	 * @throws NotEnoughBudgetError : 
	 */

	public es.upm.fi.sos.t3.travelagency.BookingTripResponse bookTrip
		(es.upm.fi.sos.t3.travelagency.BookingTrip bookingTrip)
		throws NotValidOriginFlightError,NotValidDestinationFlightError,NotEnoughSeatsFlightError,NotValidSeatFlightError,NotValidCityHotelError,NotValidHotelHotelError,NotEnoughRoomsHotelError,NotValidRoomHotelError,RemoteServiceError,NotValidSessionError,NotEnoughBudgetError{
		compruebaSesion();
		BookingTripResponse resp = new BookingTripResponse();
		/* Inicialmente establecemos a falsa la reserva */
		resp.setBookingResult(false);
		String origen = bookTrip.getOrigin();
		String destino = bookTrip.getDestination();
		String hotel = bookTrip.getHotel();
		int asientos = bookTrip.getSeat();
		int habitaciones = bookTrip.getRoom();
		/* Reserva de vuelo */
		BookingOnlyFlight bof = new BookingOnlyFlight();
		/* Reserva de hotel*/
		BookingOnlyHotel boh = new BookingOnlyHotel();
		bof.setOrigin(origen);
		bof.setDestination(destino);
		boh.setCity(destino);
		boh.setHotel(hotel);
		/* Ahora vamos a obtener las respuestas */
		BookingOnlyFlightResponse bof_resp = bookOnlyFlight(bof);
		BookingOnlyHotelResponse boh_resp = bookOnlyHotel(boh);
		/* Si se ejecuta la siguiente sentencia es que todo se ha llevado a cabo correctamente */
		resp.setBookingResult(true);
		int precio = bof_resp.getPrice() + boh_resp.getPrice();
		resp.setPrice(precio);
		return resp;
		}


	/**
	 * Auto generated method signature
	 * 
	 * @throws NotValidSessionError : 
	 */

	public es.upm.fi.sos.t3.travelagency.Budget getBudget()
		throws NotValidSessionError{
		compruebaSesion();
		Budget resp = new Budget();
		double presupuesto = user_aux.presupuesto;
		resp.setBudget(presupuesto);
		return resp;
	}


	/**
	 * Auto generated method signature
	 * 
	 * @throws RemoteServiceError : 
	 * @throws NotValidSessionError : 
	 */

	public es.upm.fi.sos.t3.travelagency.OriginFlightList getOriginFlightList
		(

		)
		throws RemoteServiceError,NotValidSessionError{
		//TODO : fill this with the necessary business logic
		throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#getOriginFlightList");
		}


	/**
	 * Auto generated method signature
	 * 
	 * @param checkingOnlyHotel
	 * @throws NotValidCityHotelError : 
	 * @throws NotValidHotelHotelError : 
	 * @throws RemoteServiceError : 
	 * @throws NotValidSessionError : 
	 */

	public es.upm.fi.sos.t3.travelagency.CheckingOnlyHotelResponse checkOnlyHotel
		(es.upm.fi.sos.t3.travelagency.CheckingOnlyHotel checkingOnlyHotel)
		throws NotValidCityHotelError,NotValidHotelHotelError,RemoteServiceError,NotValidSessionError{
		compruebaSesion();
		CheckingOnlyHotelResponse resp = new CheckingOnlyHotelResponse();
		CheckingHotel ch = new CheckingHotel();
		ch.setCity(checkingOnlyHotel.getCity());
		ch.setHotel(checkingOnlyHote.getHotel());
		try{
			int habitaciones = hb.checkHotel(ch).getRoomAvailability();
			double precio = hb.checkHotel(ch).getPrice();
			resp.setRoomAvailability(habitaciones);
			resp.setPrice(precio);
		}
		catch (RemoteException e){
			RemoteServiceError err_remote = new RemoteServiceError();
			ErrorMessage message_remote = new ErrorMessage();
			message_remote.setErrorMessage("RemoteServiceError");
			err_remote.setFaultMessage(message_remote);
			throw err_remote;
		}
		catch (NotValidCityHotelError){
			NotValidCityHotelError err_city = new NotValidCityHotelError();
			ErrorMessage message_city = new ErrorMessage();
			message_city.setErrorMessage("NotValidCityHotelError");
			err_city.setFaultMessage(message_city);
			throw err_city;
		}
		catch (NotValidHotelHotelError){
			NotValidHotelHotelError err_hotel = new NotValidHotelHotelError();
			ErrorMessage message_hotel = new ErrorMessage();
			message_hotel.setErrorMessage("NotvalidHotelHotelError");
			err_hotel.setFaultMessage(message_hotel);
			throw eer_hotel;
		}
		return resp;
		}


	/**
	 * Auto generated method signature
	 * 
	 * @param originFlight
	 * @throws NotValidOriginFlightError : 
	 * @throws RemoteServiceError : 
	 * @throws NotValidSessionError : 
	 */

	public es.upm.fi.sos.t3.travelagency.DestinationFlightList getDestinationFlightList
		(
		 es.upm.fi.sos.t3.travelagency.OriginFlight originFlight
		)
		throws NotValidOriginFlightError,RemoteServiceError,NotValidSessionError{
		//TODO : fill this with the necessary business logic
		throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#getDestinationFlightList");
		}


	/**
	 * Auto generated method signature
	 * 
	 * @param cityHotel
	 * @throws NotValidCityHotelError : 
	 * @throws RemoteServiceError : 
	 * @throws NotValidSessionError : 
	 */

	public es.upm.fi.sos.t3.travelagency.HotelHotelList getHotelHotelList
		(es.upm.fi.sos.t3.travelagency.CityHotel cityHotel)
		throws NotValidCityHotelError,RemoteServiceError,NotValidSessionError{
		compruebaSesion();
		HotelHotelList resp = new HotelHotelList();
		try{
			String[] hoteles = hb.getHotelList().getHotel();
			resp.setHotel(hoteles);
		}
		catch(RemoteException e){
			RemoteServiceError err_remote = new RemoteServiceError();
			ErrorMessage message_remote = new ErrorMessage();
			message_remote.setErrorMessage("RemoteServiceError");
			err_remote.setFaultMessage(message_remote);
			throw err_remote;
		}
		catch(NotValidCityHotelError e){
			NotValidCityHotelError err_hotel = new NotValidCityHotelError();
			ErrorMessage message_hotel = new ErrorMessage();
			message_hotel.setErrorMessage("NotValidCityHotelError");
			err_hotel.setFaultMessage(message_hotel);
			throw err_hotel;
		}
		return resp;
		}


	/**
	 * Auto generated method signature
	 * 
	 */

	public void logout(){
		if(user_aux.sesion){
			user_aux.sesion = false;
			registro.get(name_key).sesion = false;
		}
	}


	/**
	 * Auto generated method signature
	 * 
	 * @param bookingOnlyHotel
	 * @throws NotValidCityHotelError : 
	 * @throws NotValidHotelHotelError : 
	 * @throws NotEnoughRoomsHotelError : 
	 * @throws NotValidRoomHotelError : 
	 * @throws RemoteServiceError : 
	 * @throws NotValidSessionError : 
	 * @throws NotEnoughBudgetError : 
	 */

	public es.upm.fi.sos.t3.travelagency.BookingOnlyHotelResponse bookOnlyHotel
		(es.upm.fi.sos.t3.travelagency.BookingOnlyHotel bookingOnlyHotel)
		throws NotValidCityHotelError,NotValidHotelHotelError,NotEnoughRoomsHotelError,NotValidRoomHotelError,RemoteServiceError,NotValidSessionError,NotEnoughBudgetError{
		compruebaSesion();
		BookingOnlyHotelResponse resp = new BookingOnlyHotelResponse();
		BookingHotel bh = new BookingHotel();
		bh.setCity(bookingOnlyHotel.getCity());
		bh.setHotel(bookingOnlyHotel.getHotel());
		bh.setRoom(bookingOnlyHotel.getRoom());
		try{
			BookingHotelResp bh_resp = hb.bookHotel(bh);
			double precio = bh_resp.getPrice();
			boolean reservado = bh_resp.getBookingResult();
			if(user_aux.budget >= precio){
				resp.setPrice(precio);
				resp.setBookingResult(reservado);
				user_aux.presupuesto -= precio;
				registro.get(name_key).presupuesto -= precio;
			}
			else{
				/* Si no hay suficiente presupuesto, se cancela la reserva */
				CancellingOnlyHotel coh = new CancellingOnlyHotel();
				coh.setCity(bookingOnlyHotel.getCity());
				coh.setHotel(bookingOnlyHotel.getHotel());
				coh.setRoom(bookingOnlyHotel.getRoom());
				CancellingOnlyHotelResponse coh_resp = cancelOnlyHotel(coh);

				/* Y se lanza la excepción correspondiente*/
				NotEnoughBudgetError err_budget = new NotEnoughBudgetError();
				ErrorMessage message_budget = new ErrorMessage();
				message_budget.setErrorMessage("NotEnoughBudgetError");
				err_budget.setFaultMessage(message_budget);
				throw err_budget;
			}
		}
		catch (RemoteException e){
			RemoteServiceError err_remote = new RemoteServiceError();
			ErrorMessage message_remote = new ErrorMessage();
			message_remote.setErrorMessage("RemoteServiceError");
			err_remote.setFaultMessage(message_remote);
			throw err_remote;
		}
		catch (NotValidCityHotelError e){
			NotValidCityHotelError err_city = new NotValidCityHotelError();
			ErrorMessage message_city = new ErrorMessage();
			message_city.setErrorMessage("NotValidCityHotelError");
			err_city.setFaultMessage(message_city);
			throw err_city;
		}
		catch (NotValidHotelHotelError e){
			NotValidHotelHotelError err_hotel = new NotValidHotelHotelError();
			ErrorMessage message_hotel = new ErrorMessage();
			message_hotel.setErrorMessage("NotValidHotelHotelError");
			err_hotel.setFaultMessage(message_hotel);
			throw err_hotel;
		}
		catch (NotEnoughRoomsHotelError e){
			NotEnoughRoomsHotelError err_rooms = new NotEnoughRoomsHotelError();
			ErrorMessage message_rooms = new ErrorMessage();
			message_rooms.setErrorMessage("NotEnoughRoomsHotelError");
			err_rooms.setFaultMessage(message_rooms);
			throw err_rooms;
		}
		catch (NotValidRoomHotelError e){
			NotValidRoomHotelError err_room = new NotValidRoomHotelError();
			ErrorMessage message_room = new ErrorMessage();
			message_room.setErrorMessage("NotValidRoomHotelError");
			err_room.setFaultMessage(message_room);
			throw err_room;
		}
		return resp;
		}


	/**
	 * Auto generated method signature
	 * 
	 * @param cancellingOnlyFlight
	 * @throws NotValidOriginFlightError : 
	 * @throws NotValidDestinationFlightError : 
	 * @throws NotEnoughSeatsFlightError : 
	 * @throws NotValidSeatFlightError : 
	 * @throws RemoteServiceError : 
	 * @throws NotValidSessionError : 
	 */

	public es.upm.fi.sos.t3.travelagency.CancellingOnlyFlightResponse cancelOnlyFlight
		(
		 es.upm.fi.sos.t3.travelagency.CancellingOnlyFlight cancellingOnlyFlight
		)
		throws NotValidOriginFlightError,NotValidDestinationFlightError,NotEnoughSeatsFlightError,NotValidSeatFlightError,RemoteServiceError,NotValidSessionError{
		//TODO : fill this with the necessary business logic
		throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#cancelOnlyFlight");
		}


	/**
	 * Auto generated method signature
	 * 
	 * @param bookingOnlyFlight
	 * @throws NotValidOriginFlightError : 
	 * @throws NotValidDestinationFlightError : 
	 * @throws NotEnoughSeatsFlightError : 
	 * @throws NotValidSeatFlightError : 
	 * @throws RemoteServiceError : 
	 * @throws NotValidSessionError : 
	 * @throws NotEnoughBudgetError : 
	 */

	public es.upm.fi.sos.t3.travelagency.BookingOnlyFlightResponse bookOnlyFlight
		(
		 es.upm.fi.sos.t3.travelagency.BookingOnlyFlight bookingOnlyFlight
		)
		throws NotValidOriginFlightError,NotValidDestinationFlightError,NotEnoughSeatsFlightError,NotValidSeatFlightError,RemoteServiceError,NotValidSessionError,NotEnoughBudgetError{
		//TODO : fill this with the necessary business logic
		throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#bookOnlyFlight");
		}


	/**
	 * Auto generated method signature
	 * 
	 * @param checkingOnlyFlight
	 * @throws NotValidOriginFlightError : 
	 * @throws NotValidDestinationFlightError : 
	 * @throws RemoteServiceError : 
	 * @throws NotValidSessionError : 
	 */

	public es.upm.fi.sos.t3.travelagency.CheckingOnlyFlightResponse checkOnlyFlight
		(
		 es.upm.fi.sos.t3.travelagency.CheckingOnlyFlight checkingOnlyFlight
		)
		throws NotValidOriginFlightError,NotValidDestinationFlightError,RemoteServiceError,NotValidSessionError{
		//TODO : fill this with the necessary business logic
		throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#checkOnlyFlight");
		}

}

