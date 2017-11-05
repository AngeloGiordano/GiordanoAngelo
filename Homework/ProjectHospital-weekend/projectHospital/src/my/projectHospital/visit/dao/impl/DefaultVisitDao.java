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
package my.projectHospital.visit.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import my.projectHospital.model.VisitModel;
import my.projectHospital.visit.dao.VisitDao;


public class DefaultVisitDao extends AbstractItemDao implements VisitDao
{

	@Override
	public List<VisitModel> findAllVisit()
	{
		final String sql = "SELECT {PK} " + "FROM{Visit}";
		final FlexibleSearchQuery fsq1 = new FlexibleSearchQuery(sql);
		final SearchResult<VisitModel> result1 = getFlexibleSearchService().search(fsq1);
		final List<VisitModel> list1 = result1.getResult();
		return list1;
	}

}