package coop.tecso.asociados.cv.callback;

import org.hibernate.criterion.DetachedCriteria;

import coop.tecso.asociados.cv.model.*;
import coop.tecso.core.service.search.FinderFilter;
import coop.tecso.core.service.search.callback.FinderFilterCallbackCritera;

/**
 * FinderFilterCallbackCritera for Curriculum entity
 */
public class CurriculumFinderFilterCallback extends FinderFilterCallbackCritera {

	public static final String USERNAME = "username";
	public static final String JSON = "json";

	/**
	 * Default Constructor
	 * 
	 * @param finderFilter
	 *            filter to create the query criteria
	 */
	public CurriculumFinderFilterCallback(FinderFilter finderFilter) {
		super(Curriculum.class, finderFilter);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seecoop.tecso.core.service.search.callback.FinderFilterCallbackCritera#
	 * addRestrictions(org.hibernate.criterion.DetachedCriteria)
	 */
	@Override
	protected void addRestrictions(DetachedCriteria criteria) {

		this.addRestrictionStringStartsLike(criteria, USERNAME);
		this.addRestrictionStringStartsLike(criteria, JSON);
	}
}
