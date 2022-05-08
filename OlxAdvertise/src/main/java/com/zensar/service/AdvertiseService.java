package com.zensar.service;

import java.util.List;

import com.zensar.entity.Advertise;


public interface AdvertiseService {
	Advertise addAdvertise( Advertise advertise,String username,  String password);
	 
	 Advertise getAdvertise( long postId, String username, String password);
    
	 Advertise updateAdvertise( long id,  Advertise advertises, String username, String password);
	 
	 List<Advertise> getAllAdvertise( String username, String password);
	 
	 boolean deleteAdvertise( long id, String username, String password);
	 
	 Advertise searchAdvertisementsByCriteria( String category, String toDate,Long filtercriteria, String fromDate);
	 
	 List<Advertise> searchAdvertise();
	 
	 List<Advertise> advertiseDetails( long id, String username, String password);
}
