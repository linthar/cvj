package coop.tecso.asociados.cv.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import coop.tecso.core.service.AbstractService;
import coop.tecso.core.service.search.FinderFilter;
import coop.tecso.core.service.search.callback.FinderFilterCallbackCritera;

import coop.tecso.asociados.cv.callback.CurriculumFinderFilterCallback;
import coop.tecso.asociados.cv.model.*;

/**
 * Service implementation for Curriculum entity
 */
@Service("curriculumService")
public class CurriculumServiceImpl extends AbstractService<Curriculum>
             implements CurriculumService {

    @SuppressWarnings("unused")
	private final Log log = LogFactory.getLog(getClass());
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see coop.tecso.core.service.AbstractService#getEntityClass()
	 */
	@Override
	protected Class<Curriculum> getEntityClass() {
		return Curriculum.class;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * coop.tecso.core.service.AbstractService#getFinderFilterCallback(coop.
	 * tecso.core.service.search.FinderFilter)
	 */
	@Override
	protected FinderFilterCallbackCritera getFinderFilterCallback(
			FinderFilter filter) {
		return new CurriculumFinderFilterCallback(filter);
	}
	
} 