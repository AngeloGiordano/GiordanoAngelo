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
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import my.projectHospital.constants.ProjectHospitalConstants;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Figure}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedFigure extends GenericItem
{
	/** Qualifier of the <code>Figure.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>Figure.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Figure.surname</code> attribute **/
	public static final String SURNAME = "surname";
	/** Qualifier of the <code>Figure.CF</code> attribute **/
	public static final String CF = "CF";
	/** Qualifier of the <code>Figure.birthPlace</code> attribute **/
	public static final String BIRTHPLACE = "birthPlace";
	/** Qualifier of the <code>Figure.dateOfBirth</code> attribute **/
	public static final String DATEOFBIRTH = "dateOfBirth";
	/** Qualifier of the <code>Figure.gender</code> attribute **/
	public static final String GENDER = "gender";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ID, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(SURNAME, AttributeMode.INITIAL);
		tmp.put(CF, AttributeMode.INITIAL);
		tmp.put(BIRTHPLACE, AttributeMode.INITIAL);
		tmp.put(DATEOFBIRTH, AttributeMode.INITIAL);
		tmp.put(GENDER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Figure.birthPlace</code> attribute.
	 * @return the birthPlace
	 */
	public String getBirthPlace(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BIRTHPLACE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Figure.birthPlace</code> attribute.
	 * @return the birthPlace
	 */
	public String getBirthPlace()
	{
		return getBirthPlace( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Figure.birthPlace</code> attribute. 
	 * @param value the birthPlace
	 */
	public void setBirthPlace(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BIRTHPLACE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Figure.birthPlace</code> attribute. 
	 * @param value the birthPlace
	 */
	public void setBirthPlace(final String value)
	{
		setBirthPlace( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Figure.CF</code> attribute.
	 * @return the CF
	 */
	public String getCF(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CF);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Figure.CF</code> attribute.
	 * @return the CF
	 */
	public String getCF()
	{
		return getCF( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Figure.CF</code> attribute. 
	 * @param value the CF
	 */
	public void setCF(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CF,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Figure.CF</code> attribute. 
	 * @param value the CF
	 */
	public void setCF(final String value)
	{
		setCF( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Figure.dateOfBirth</code> attribute.
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DATEOFBIRTH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Figure.dateOfBirth</code> attribute.
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth()
	{
		return getDateOfBirth( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Figure.dateOfBirth</code> attribute. 
	 * @param value the dateOfBirth
	 */
	public void setDateOfBirth(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DATEOFBIRTH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Figure.dateOfBirth</code> attribute. 
	 * @param value the dateOfBirth
	 */
	public void setDateOfBirth(final Date value)
	{
		setDateOfBirth( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Figure.gender</code> attribute.
	 * @return the gender
	 */
	public EnumerationValue getGender(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, GENDER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Figure.gender</code> attribute.
	 * @return the gender
	 */
	public EnumerationValue getGender()
	{
		return getGender( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Figure.gender</code> attribute. 
	 * @param value the gender
	 */
	public void setGender(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, GENDER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Figure.gender</code> attribute. 
	 * @param value the gender
	 */
	public void setGender(final EnumerationValue value)
	{
		setGender( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Figure.id</code> attribute.
	 * @return the id
	 */
	public String getId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Figure.id</code> attribute.
	 * @return the id
	 */
	public String getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Figure.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Figure.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final String value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Figure.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Figure.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Figure.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Figure.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Figure.surname</code> attribute.
	 * @return the surname
	 */
	public String getSurname(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SURNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Figure.surname</code> attribute.
	 * @return the surname
	 */
	public String getSurname()
	{
		return getSurname( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Figure.surname</code> attribute. 
	 * @param value the surname
	 */
	public void setSurname(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SURNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Figure.surname</code> attribute. 
	 * @param value the surname
	 */
	public void setSurname(final String value)
	{
		setSurname( getSession().getSessionContext(), value );
	}
	
}
