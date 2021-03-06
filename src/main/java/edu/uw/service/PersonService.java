package edu.uw.service;

import java.util.Date;

import edu.uw.exceptions.PersonServiceException;
import edu.uw.model.PersonEntity;
import edu.uw.ui.model.People;
import edu.uw.ui.model.PeopleResult;

public interface PersonService {
	/**
	 * Save file
	 * 
	 * @param person
	 * @return
	 */
	public PersonEntity save(PersonEntity person) throws PersonServiceException;

	/**
	 * save a person
	 * 
	 * @param people
	 * @return
	 */

	public PersonEntity save(People people) throws PersonServiceException;

	/**
	 * This method allows client to search people and filter with affiliation
	 * and active date
	 * 
	 * @param affiliation
	 * @param activeOn
	 * @param zip
	 * @param page
	 * @param size
	 * @return
	 */
	public PeopleResult findAll(String affiliation, Date activeOn, Integer zip, int page, int size) throws PersonServiceException;

	/**
	 * Allows client to retrieve single person by person id
	 * 
	 * @param personId
	 * @return
	 */
	public People findOne(Long personId) throws PersonServiceException;

	public PeopleResult findByLastName(String lastName,int page, int size) throws PersonServiceException;
}
