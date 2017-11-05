/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 5-nov-2017 18.44.28                         ---
 * ----------------------------------------------------------------
 */
package my.projectHospital.constants;

/**
 * @deprecated use constants in Model classes instead
 */
@Deprecated
@SuppressWarnings({"unused","cast","PMD"})
public class GeneratedProjectHospitalConstants
{
	public static final String EXTENSIONNAME = "projectHospital";
	public static class TC
	{
		public static final String DEPARTMENT = "Department".intern();
		public static final String FIGURE = "Figure".intern();
		public static final String MEDICAL = "Medical".intern();
		public static final String OUTCOME = "Outcome".intern();
		public static final String PATIENT = "Patient".intern();
		public static final String SEX = "Sex".intern();
		public static final String VISIT = "Visit".intern();
	}
	public static class Attributes
	{
		// no constants defined.
	}
	public static class Enumerations
	{
		public static class Outcome
		{
			public static final String POSITIVE = "POSITIVE".intern();
			public static final String NEGATIVE = "NEGATIVE".intern();
		}
		public static class Sex
		{
			public static final String M = "M".intern();
			public static final String F = "F".intern();
		}
	}
	public static class Relations
	{
		public static final String DEPARTMENT2MEDICALRELATION = "Department2MedicalRelation".intern();
		public static final String DEPARTMENT2PATIENTRELATION = "Department2PatientRelation".intern();
		public static final String VISIT2PATIENTRELATION = "Visit2PatientRelation".intern();
	}
	
	protected GeneratedProjectHospitalConstants()
	{
		// private constructor
	}
	
	
}
