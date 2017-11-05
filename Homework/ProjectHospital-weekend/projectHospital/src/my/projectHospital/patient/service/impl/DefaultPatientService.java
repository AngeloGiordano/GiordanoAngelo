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
package my.projectHospital.patient.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import my.projectHospital.model.PatientModel;
import my.projectHospital.patient.dao.PatientDao;
import my.projectHospital.patient.service.PatientService;


public class DefaultPatientService implements PatientService
{
	PatientDao patientDao;

	@Override
	public List<PatientModel> getAllPatient()
	{
		final List<PatientModel> list = patientDao.findAllPatient();
		return list;
	}

	/**
	 * @return the patientDao
	 */
	public PatientDao getPatientDao()
	{
		return patientDao;
	}

	/**
	 * @param patientDao
	 *           the patientDao to set
	 */
	@Required
	public void setPatientDao(final PatientDao patientDao)
	{
		this.patientDao = patientDao;
	}

}
