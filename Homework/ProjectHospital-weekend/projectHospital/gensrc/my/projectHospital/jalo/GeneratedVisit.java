/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 5-nov-2017 18.44.28                         ---
 * ----------------------------------------------------------------
 */
package my.projectHospital.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import my.projectHospital.constants.ProjectHospitalConstants;
import my.projectHospital.jalo.Patient;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Visit}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedVisit extends GenericItem
{
	/** Qualifier of the <code>Visit.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>Visit.dataVisit</code> attribute **/
	public static final String DATAVISIT = "dataVisit";
	/** Qualifier of the <code>Visit.typeVisit</code> attribute **/
	public static final String TYPEVISIT = "typeVisit";
	/** Qualifier of the <code>Visit.outcome</code> attribute **/
	public static final String OUTCOME = "outcome";
	/** Qualifier of the <code>Visit.patients</code> attribute **/
	public static final String PATIENTS = "patients";
	/**
	* {@link OneToManyHandler} for handling 1:n PATIENTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Patient> PATIENTSHANDLER = new OneToManyHandler<Patient>(
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
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ID, AttributeMode.INITIAL);
		tmp.put(DATAVISIT, AttributeMode.INITIAL);
		tmp.put(TYPEVISIT, AttributeMode.INITIAL);
		tmp.put(OUTCOME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Visit.dataVisit</code> attribute.
	 * @return the dataVisit
	 */
	public Date getDataVisit(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DATAVISIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Visit.dataVisit</code> attribute.
	 * @return the dataVisit
	 */
	public Date getDataVisit()
	{
		return getDataVisit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Visit.dataVisit</code> attribute. 
	 * @param value the dataVisit
	 */
	public void setDataVisit(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DATAVISIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Visit.dataVisit</code> attribute. 
	 * @param value the dataVisit
	 */
	public void setDataVisit(final Date value)
	{
		setDataVisit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Visit.id</code> attribute.
	 * @return the id
	 */
	public String getId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Visit.id</code> attribute.
	 * @return the id
	 */
	public String getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Visit.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Visit.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final String value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Visit.outcome</code> attribute.
	 * @return the outcome
	 */
	public EnumerationValue getOutcome(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, OUTCOME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Visit.outcome</code> attribute.
	 * @return the outcome
	 */
	public EnumerationValue getOutcome()
	{
		return getOutcome( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Visit.outcome</code> attribute. 
	 * @param value the outcome
	 */
	public void setOutcome(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, OUTCOME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Visit.outcome</code> attribute. 
	 * @param value the outcome
	 */
	public void setOutcome(final EnumerationValue value)
	{
		setOutcome( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Visit.patients</code> attribute.
	 * @return the patients
	 */
	public Collection<Patient> getPatients(final SessionContext ctx)
	{
		return PATIENTSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Visit.patients</code> attribute.
	 * @return the patients
	 */
	public Collection<Patient> getPatients()
	{
		return getPatients( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Visit.patients</code> attribute. 
	 * @param value the patients
	 */
	public void setPatients(final SessionContext ctx, final Collection<Patient> value)
	{
		PATIENTSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Visit.patients</code> attribute. 
	 * @param value the patients
	 */
	public void setPatients(final Collection<Patient> value)
	{
		setPatients( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to patients. 
	 * @param value the item to add to patients
	 */
	public void addToPatients(final SessionContext ctx, final Patient value)
	{
		PATIENTSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to patients. 
	 * @param value the item to add to patients
	 */
	public void addToPatients(final Patient value)
	{
		addToPatients( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from patients. 
	 * @param value the item to remove from patients
	 */
	public void removeFromPatients(final SessionContext ctx, final Patient value)
	{
		PATIENTSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from patients. 
	 * @param value the item to remove from patients
	 */
	public void removeFromPatients(final Patient value)
	{
		removeFromPatients( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Visit.typeVisit</code> attribute.
	 * @return the typeVisit
	 */
	public String getTypeVisit(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TYPEVISIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Visit.typeVisit</code> attribute.
	 * @return the typeVisit
	 */
	public String getTypeVisit()
	{
		return getTypeVisit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Visit.typeVisit</code> attribute. 
	 * @param value the typeVisit
	 */
	public void setTypeVisit(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TYPEVISIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Visit.typeVisit</code> attribute. 
	 * @param value the typeVisit
	 */
	public void setTypeVisit(final String value)
	{
		setTypeVisit( getSession().getSessionContext(), value );
	}
	
}
