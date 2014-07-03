/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.upm.fi.sos.t3.travelagency;

import es.upm.fi.sos.t3.travelagency.TravelAgencyWSStub.*;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;


public class ClientMain {

	/**
	 *
	 */
	public static void main(String [] args) throws RemoteException, RemoteServiceError{

		TravelAgencyWSStub TAstub = null, TAstub2 = null;
		boolean enterCatch = false; 

		try{
			TAstub = new TravelAgencyWSStub();
			TAstub2 = new TravelAgencyWSStub();
		}catch(AxisFault e){
			e.printStackTrace(System.err);
		}

		//PASO 1: Login incorrecto
		TravelAgencyWSStub.Login login = new TravelAgencyWSStub.Login();
		login.setUsername("INCORRECTO");
		login.setPassword("OTCERROCNI");
		TravelAgencyWSStub.LoginResponse loginResponse = null;
		loginResponse = TAstub.login(login);
		if(loginResponse.getLoginResponse() == false){
			System.out.println("PASO 1: OK");
		}
		else{
			System.err.println("PASO 1: ERROR");
			System.exit(-1);
		}
		 
		//PASO 2: Llamada a getBudget con NotValidSessionError
		double budget = -1;
		try{
			budget = TAstub.getBudget().getBudget();
		}catch(NotValidSessionError e){
			enterCatch = true;
			System.out.println("PASO 2: OK");
		}
		if(!enterCatch){
			System.err.println("PASO 2: ERROR");
			System.exit(-2);
		}

		//PASO 3: Login Correcto
		login.setUsername("52014662");
		login.setPassword("26641025");
		loginResponse = TAstub.login(login);
		if(loginResponse.getLoginResponse() == true){
			System.out.println("PASO 3: OK");
		}
		else{
			System.err.println("PASO 3: ERROR");
			System.exit(-3);
		}

		//PASO 4: Llamar a getOriginflightList
		OriginFlightList originFlightList = null;
		try {
			originFlightList = TAstub.getOriginFlightList();
		} catch (NotValidSessionError e) {
			e.printStackTrace(System.err);
			System.err.println("PASO 4: ERROR");
			System.exit(-4);
		}
		if(originFlightList.getOrigin().length >= 0){
			for (int i = 0; i < originFlightList.getOrigin().length; i++) {
				System.out.println("Origen: " + originFlightList.getOrigin()[i]);
			}
			System.out.println("PASO 4: OK");
		}
		else{
			System.err.println("PASO 4: ERROR");
			System.exit(-4);
		}
		//PASO 5: Llamar a getBudget
		try {
			budget = TAstub.getBudget().getBudget();
		} catch (NotValidSessionError e) {
			e.printStackTrace(System.err);
		}
		if(budget >= 0){
			System.out.println(budget);
			System.out.println("PASO 5: OK");
		}
		else
		{
			System.err.println("PASO 5: ERROR");
			System.exit(-5);
		}

		//PASO 6: Obtener los destinos de las 3 primeras ciudades de originFlightList
		OriginFlight threeOrigins = new OriginFlight();
		DestinationFlightList destinations = null;
		for (int i = 0; i < 3; i++) {
			threeOrigins.setOriginFlight(originFlightList.getOrigin()[i]);
			try {
				destinations = TAstub.getDestinationFlightList(threeOrigins);
				for (int j = 0; j < destinations.getDestination().length; j++) {
					System.out.println(destinations.getDestination()[j]);
				}
				
			} catch (Exception e) {
				e.printStackTrace(System.err);
				System.err.println("PASO 6: ERROR");
				System.exit(-6);
			}
		}
		System.out.println("PASO 6: OK");

		//PASO 7: Comprar 3 habitaciones de hotel en un destino con bookOnlyHotel
		BookingOnlyHotel chosenHotel = new BookingOnlyHotel();
		CityHotel ciudadConHoteles = new CityHotel();
		HotelHotelList hotel = new HotelHotelList();
		chosenHotel.setRoom(3);
		try {
			ciudadConHoteles.setCityHotel(destinations.getDestination()[0]);
			hotel.setHotel(TAstub.getHotelHotelList(ciudadConHoteles).getHotel());
			chosenHotel.setCity(ciudadConHoteles.getCityHotel());
			chosenHotel.setHotel(hotel.getHotel()[0]);
			TAstub.bookOnlyHotel(chosenHotel);
		} catch (Exception e) {
			e.printStackTrace(System.err);
			System.err.println("PASO 7: ERROR");
			System.exit(-7);
		}
		System.out.println("PASO 7: OK");

		//PASO 8: Comprobar la sustracci�n de dinero
		CheckingOnlyHotel checkingHotel =  new CheckingOnlyHotel();
		checkingHotel.setCity(chosenHotel.getCity());
		checkingHotel.setHotel(chosenHotel.getHotel());
		CheckingOnlyHotelResponse result = new CheckingOnlyHotelResponse();
		try {
			result = TAstub.checkOnlyHotel(checkingHotel);
			budget = TAstub.getBudget().getBudget();
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
		double auxBudget = 10000.00 - (result.getPrice() * 3);
		System.out.println(auxBudget);
		System.out.println(budget);
		if (budget == auxBudget){
			System.out.println("PASO 8: OK");
		}
		else{
			System.err.println("PASO 8: ERROR");
			System.exit(-8);
		}

		//PASO 9: Llamar a bookTrip
		BookingTrip trip = new BookingTrip();
		trip.setDestination(destinations.getDestination()[0]);
		trip.setOrigin(originFlightList.getOrigin()[0]);
		trip.setRoom(1);
		trip.setHotel(chosenHotel.getHotel());
		trip.setSeat(1);
		try {
			TAstub.bookTrip(trip);
		} catch (Exception e) {
			e.printStackTrace(System.err);
			System.err.println("PASO 9: ERROR");
			System.exit(-9);
		}
		System.out.println("PASO 9: OK");


		//PASO 10: Comprobar la sustracci�n de dinero
		CheckingTrip checkingTrip = new CheckingTrip() ;
		checkingTrip.setHotel(trip.getHotel());
		checkingTrip.setOrigin(trip.getOrigin());
		checkingTrip.setDestination(trip.getDestination());
		CheckingTripResponse result2 = null;
		try {
			result2 = TAstub.checkTrip(checkingTrip);
			budget = TAstub.getBudget().getBudget();
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
		auxBudget =- result2.getRoomPrice() + result2.getSeatPrice();
		if (budget == auxBudget){
			System.out.println("PASO 10: OK");
		}
		else{
			System.err.println("PASO 10: ERROR");
			System.exit(-10);
		}

		//PASO 11: Llamar a logout
		TAstub.logout();
		enterCatch = false;

		//PASO 12: Llamar a getBudget con NotValidSessionError
		try {
			TAstub.getBudget();
		} catch (NotValidSessionError e) {
			enterCatch = true;
			System.out.println("PASO 11: OK");
			System.out.println("PASO 12: OK");
		}
		if(!enterCatch){
			System.err.println("PASO 11: ERROR");
			System.exit(-11);
		}

		//PASO 13: Volver a loguear
		loginResponse = TAstub.login(login);

		try {
			budget = TAstub.getBudget().getBudget();
		} catch (NotValidSessionError e) {
			e.printStackTrace();
		}

		if(budget == auxBudget){
			System.out.println("PASO 13: OK");
		}
		else{
			System.err.print("PASO 13: ERROR");
			System.exit(-13);
		}

		//PASO 14: Dual Login
		login.setUsername("05329261T");
		login.setPassword("T16292350");
		loginResponse = TAstub2.login(login);
		if(loginResponse.getLoginResponse() == true){
			System.out.println("PASO 14: OK");
		}
		else{
			System.err.println("PASO 14: ERROR");
			System.exit(-14);
		}
	}
}