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
package my.projectHospital.handler;

import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.joda.time.LocalDate;
import org.joda.time.Years;

import my.projectHospital.model.PatientModel;



public class DayHandler implements DynamicAttributeHandler<Integer, PatientModel>
{
	public static int day = 0;

	@Override
	public Integer get(final PatientModel patientModel)
	{
		final DateFormat format = new SimpleDateFormat("dd/mm/yyyy");
		Date d = new Date();
		Date e = new Date();
		try
		{
			d = format.parse(patientModel.getDateOfAdmission().toString());
			e = format.parse(patientModel.getExitDate().toString());
		}
		catch (final ParseException err)
		{
			err.printStackTrace();
		}
		final LocalDate dayOne = new LocalDate(d);
		final LocalDate dayTwo = new LocalDate(e);
		day = Years.yearsBetween(dayOne, dayTwo).getYears();
		final Integer a = new Integer(day);
		return a;
	}

	@Override
	public void set(final PatientModel arg0, final Integer arg1)
	{
		// YTODO Auto-generated method stub

	}

}
