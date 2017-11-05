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
package my.projectHospital.patient.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import my.projectHospital.model.PatientModel;
import my.projectHospital.patient.dao.PatientDao;



public class DefaultPatientDao extends AbstractItemDao implements PatientDao
{

	@Override
	public List<PatientModel> findAllPatient()
	{
		final String sql = "SELECT {PK} " + "FROM{Patient}";
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(sql);
		final SearchResult<PatientModel> result = getFlexibleSearchService().search(fsq);
		final List<PatientModel> list = result.getResult();
		return list;
	}

}