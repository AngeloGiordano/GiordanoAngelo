/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2017 SAP SE
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 */
/**
 *
 */
package my.projectHospital.visit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import my.projectHospital.model.VisitModel;
import my.projectHospital.visit.dao.VisitDao;
import my.projectHospital.visit.service.VisitService;


public class DefaultVisitService implements VisitService
{
	VisitDao visitDao;

	@Override
	public List<VisitModel> getAllVisit()
	{
		final List<VisitModel> list2 = visitDao.findAllVisit();
		return list2;
	}

	/**
	 * @return the patientDao
	 */
	public VisitDao getVisitDao()
	{
		return visitDao;
	}

	/**
	 * @param patientDao
	 *           the patientDao to set
	 */
	@Required
	public void setVisitDao(final VisitDao visitDao)
	{
		this.visitDao = visitDao;
	}

}
