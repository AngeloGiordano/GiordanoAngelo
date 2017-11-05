/*
 * [y] hybris Platform
 * 
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information of SAP 
 * Hybris ("Confidential Information"). You shall not disclose such 
 * Confidential Information and shall use it only in accordance with the 
 * terms of the license agreement you entered into with SAP Hybris.
 */
package my.projectHospital.setup;

import static my.projectHospital.constants.ProjectHospitalConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import my.projectHospital.constants.ProjectHospitalConstants;
import my.projectHospital.service.ProjectHospitalService;


@SystemSetup(extension = ProjectHospitalConstants.EXTENSIONNAME)
public class ProjectHospitalSystemSetup
{
	private final ProjectHospitalService projectHospitalService;

	public ProjectHospitalSystemSetup(final ProjectHospitalService projectHospitalService)
	{
		this.projectHospitalService = projectHospitalService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		projectHospitalService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return ProjectHospitalSystemSetup.class.getResourceAsStream("/projectHospital/sap-hybris-platform.png");
	}
}
