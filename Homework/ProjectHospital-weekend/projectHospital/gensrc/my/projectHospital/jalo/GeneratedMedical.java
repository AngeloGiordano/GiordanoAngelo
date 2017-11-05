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
import java.util.HashMap;
import java.util.Map;
import my.projectHospital.constants.ProjectHospitalConstants;
import my.projectHospital.jalo.Department;
import my.projectHospital.jalo.Figure;
import my.projectHospital.jalo.Visit;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Medical}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedMedical extends Figure
{
	/** Qualifier of the <code>Medical.listNumber</code> attribute **/
	public static final String LISTNUMBER = "listNumber";
	/** Qualifier of the <code>Medical.visit</code> attribute **/
	public static final String VISIT = "visit";
	/** Qualifier of the <code>Medical.department</code> attribute **/
	public static final String DEPARTMENT = "department";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n DEPARTMENT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedMedical> DEPARTMENTHANDLER = new BidirectionalOneToManyHandler<GeneratedMedical>(
	ProjectHospitalConstants.TC.MEDICAL,
	false,
	"department",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Figure.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(LISTNUMBER, AttributeMode.INITIAL);
		tmp.put(VISIT, AttributeMode.INITIAL);
		tmp.put(DEPARTMENT, AttributeMode.INITIAL);
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
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Medical.department</code> attribute.
	 * @return the department
	 */
	public Department getDepartment(final SessionContext ctx)
	{
		return (Department)getProperty( ctx, DEPARTMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Medical.department</code> attribute.
	 * @return the department
	 */
	public Department getDepartment()
	{
		return getDepartment( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Medical.department</code> attribute. 
	 * @param value the department
	 */
	public void setDepartment(final SessionContext ctx, final Department value)
	{
		DEPARTMENTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Medical.department</code> attribute. 
	 * @param value the department
	 */
	public void setDepartment(final Department value)
	{
		setDepartment( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Medical.listNumber</code> attribute.
	 * @return the listNumber
	 */
	public String getListNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LISTNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Medical.listNumber</code> attribute.
	 * @return the listNumber
	 */
	public String getListNumber()
	{
		return getListNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Medical.listNumber</code> attribute. 
	 * @param value the listNumber
	 */
	public void setListNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LISTNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Medical.listNumber</code> attribute. 
	 * @param value the listNumber
	 */
	public void setListNumber(final String value)
	{
		setListNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Medical.visit</code> attribute.
	 * @return the visit
	 */
	public Visit getVisit(final SessionContext ctx)
	{
		return (Visit)getProperty( ctx, VISIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Medical.visit</code> attribute.
	 * @return the visit
	 */
	public Visit getVisit()
	{
		return getVisit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Medical.visit</code> attribute. 
	 * @param value the visit
	 */
	public void setVisit(final SessionContext ctx, final Visit value)
	{
		setProperty(ctx, VISIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Medical.visit</code> attribute. 
	 * @param value the visit
	 */
	public void setVisit(final Visit value)
	{
		setVisit( getSession().getSessionContext(), value );
	}
	
}
