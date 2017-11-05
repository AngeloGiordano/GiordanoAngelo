/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 5-nov-2017 18.44.28                         ---
 * ----------------------------------------------------------------
 */
package my.projectHospital.jalo;

import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import my.projectHospital.constants.ProjectHospitalConstants;
import my.projectHospital.jalo.Department;
import my.projectHospital.jalo.Figure;
import my.projectHospital.jalo.Visit;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Patient}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPatient extends Figure
{
	/** Qualifier of the <code>Patient.dateOfAdmission</code> attribute **/
	public static final String DATEOFADMISSION = "dateOfAdmission";
	/** Qualifier of the <code>Patient.exitDate</code> attribute **/
	public static final String EXITDATE = "exitDate";
	/** Qualifier of the <code>Patient.department</code> attribute **/
	public static final String DEPARTMENT = "department";
	/** Qualifier of the <code>Patient.visit</code> attribute **/
	public static final String VISIT = "visit";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n DEPARTMENT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedPatient> DEPARTMENTHANDLER = new BidirectionalOneToManyHandler<GeneratedPatient>(
	ProjectHospitalConstants.TC.PATIENT,
	false,
	"department",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n VISIT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedPatient> VISITHANDLER = new BidirectionalOneToManyHandler<GeneratedPatient>(
	ProjectHospitalConstants.TC.PATIENT,
	false,
	"visit",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Figure.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(DATEOFADMISSION, AttributeMode.INITIAL);
		tmp.put(EXITDATE, AttributeMode.INITIAL);
		tmp.put(DEPARTMENT, AttributeMode.INITIAL);
		tmp.put(VISIT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		DEPARTMENTHANDLER.newInstance(ctx, allAttributes);
		VISITHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.dateOfAdmission</code> attribute.
	 * @return the dateOfAdmission
	 */
	public Date getDateOfAdmission(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DATEOFADMISSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.dateOfAdmission</code> attribute.
	 * @return the dateOfAdmission
	 */
	public Date getDateOfAdmission()
	{
		return getDateOfAdmission( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.dateOfAdmission</code> attribute. 
	 * @param value the dateOfAdmission
	 */
	public void setDateOfAdmission(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DATEOFADMISSION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.dateOfAdmission</code> attribute. 
	 * @param value the dateOfAdmission
	 */
	public void setDateOfAdmission(final Date value)
	{
		setDateOfAdmission( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.department</code> attribute.
	 * @return the department
	 */
	public Department getDepartment(final SessionContext ctx)
	{
		return (Department)getProperty( ctx, DEPARTMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.department</code> attribute.
	 * @return the department
	 */
	public Department getDepartment()
	{
		return getDepartment( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.department</code> attribute. 
	 * @param value the department
	 */
	public void setDepartment(final SessionContext ctx, final Department value)
	{
		DEPARTMENTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.department</code> attribute. 
	 * @param value the department
	 */
	public void setDepartment(final Department value)
	{
		setDepartment( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.exitDate</code> attribute.
	 * @return the exitDate
	 */
	public Date getExitDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, EXITDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.exitDate</code> attribute.
	 * @return the exitDate
	 */
	public Date getExitDate()
	{
		return getExitDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.exitDate</code> attribute. 
	 * @param value the exitDate
	 */
	public void setExitDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, EXITDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.exitDate</code> attribute. 
	 * @param value the exitDate
	 */
	public void setExitDate(final Date value)
	{
		setExitDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.visit</code> attribute.
	 * @return the visit
	 */
	public Visit getVisit(final SessionContext ctx)
	{
		return (Visit)getProperty( ctx, VISIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Patient.visit</code> attribute.
	 * @return the visit
	 */
	public Visit getVisit()
	{
		return getVisit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.visit</code> attribute. 
	 * @param value the visit
	 */
	public void setVisit(final SessionContext ctx, final Visit value)
	{
		VISITHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Patient.visit</code> attribute. 
	 * @param value the visit
	 */
	public void setVisit(final Visit value)
	{
		setVisit( getSession().getSessionContext(), value );
	}
	
}
