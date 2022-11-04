/**
 */
package data_Description.impl;

import data_Description.Data_DescriptionPackage;
import data_Description.NumericalStat;
import data_Description.freqTable;
import java.util.ArrayList;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Numerical Stat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link data_Description.impl.NumericalStatImpl#getColumnId <em>Column Id</em>}</li>
 *   <li>{@link data_Description.impl.NumericalStatImpl#getMin <em>Min</em>}</li>
 *   <li>{@link data_Description.impl.NumericalStatImpl#getMax <em>Max</em>}</li>
 *   <li>{@link data_Description.impl.NumericalStatImpl#getMean <em>Mean</em>}</li>
 *   <li>{@link data_Description.impl.NumericalStatImpl#getStd <em>Std</em>}</li>
 *   <li>{@link data_Description.impl.NumericalStatImpl#getFreqencyTable <em>Freqency Table</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NumericalStatImpl extends MinimalEObjectImpl.Container implements NumericalStat {
	/**
	 * The default value of the '{@link #getColumnId() <em>Column Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnId()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnId() <em>Column Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnId()
	 * @generated
	 * @ordered
	 */
	protected String columnId = COLUMN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected float min = MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected float max = MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getMean() <em>Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMean()
	 * @generated
	 * @ordered
	 */
	protected static final float MEAN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMean() <em>Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMean()
	 * @generated
	 * @ordered
	 */
	protected float mean = MEAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getStd() <em>Std</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStd()
	 * @generated
	 * @ordered
	 */
	protected static final float STD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getStd() <em>Std</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStd()
	 * @generated
	 * @ordered
	 */
	protected float std = STD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFreqencyTable() <em>Freqency Table</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreqencyTable()
	 * @generated
	 * @ordered
	 */
	protected ArrayList<freqTable> freqencyTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumericalStatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Data_DescriptionPackage.Literals.NUMERICAL_STAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumnId() {
		return columnId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnId(String newColumnId) {
		String oldColumnId = columnId;
		columnId = newColumnId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data_DescriptionPackage.NUMERICAL_STAT__COLUMN_ID,
					oldColumnId, columnId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(float newMin) {
		float oldMin = min;
		min = newMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data_DescriptionPackage.NUMERICAL_STAT__MIN, oldMin,
					min));
	}

	//EDITED
	
		//EDITED
		public void setMin(ArrayList<Float> data){
			
			data.sort(null);	
			this.setMin(data.get(0));
		}
		//EDITED
		
		//EDITED
		public void setMax(ArrayList<Float> data){
			
			data.sort(null);
			this.setMax(data.get(data.size()-1));
		}
		//EDITED
		
		//EDITED
			public void setMean(ArrayList<Float> data){
				
				float sum = 0;
				for(float i : data) {
					sum+=i;
				}
				
				this.setMean((sum/data.size()));
			}
		//EDITED
		
		//EDITED
			public void setStd(ArrayList<Float> data){			
				
				this.setMean(data);
				float mean = this.getMean();
				float variance = 0;
				
				for(float i : data) {
					variance+=((i - mean)*(i - mean));	
				}
				float std = (float) Math.sqrt(variance/data.size());	
				
				this.setStd(std);
			}
		//EDITED

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(float newMax) {
		float oldMax = max;
		max = newMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data_DescriptionPackage.NUMERICAL_STAT__MAX, oldMax,
					max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMean() {
		return mean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMean(float newMean) {
		float oldMean = mean;
		mean = newMean;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data_DescriptionPackage.NUMERICAL_STAT__MEAN, oldMean,
					mean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getStd() {
		return std;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStd(float newStd) {
		float oldStd = std;
		std = newStd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data_DescriptionPackage.NUMERICAL_STAT__STD, oldStd,
					std));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList<freqTable> getFreqencyTable() {
//		if (freqencyTable == null) {
//			freqencyTable = new EObjectResolvingEList<freqTable>(freqTable.class, this,
//					Data_DescriptionPackage.NUMERICAL_STAT__FREQENCY_TABLE);
//		}
		return freqencyTable;
	}
	
	
	//EDITED
	public void SetFreqencyTable(ArrayList<Float>data){
		data.sort(null);
		this.setMin(data);
		this.setMax(data);
		this.setStd(data);
		float std = this.getStd();
		float mean = this.getMean();
		float min = this.getMin();
		float max = this.getMax();
		float uppLim = 0;
		float lowLim = 0;
		float count = mean;
		int lstEnd = 0;
		ArrayList<freqTable> freqTable = new ArrayList<freqTable>();
		String label = "";
		
		while(count<max) {
			
			
			
			freqTable fTable = new freqTableImpl();
			
			count+=std;
			uppLim = count;
			lowLim = count-std;
			int freq = 0;
			for(float i : data) {
				
				if(i>=lowLim&&i<=uppLim) {
					freq++;
				}
				
			}
			
			label = Float.toString(lowLim) + " - " + Float.toString(uppLim);
			if(count>=max) {
				label = "<"+Float.toString(count-std);
			}
			
			fTable.setLabel(label);
			fTable.setValue(freq);
			
			freqTable.add(lstEnd,fTable);
		}
		
		count = mean;
		
		while(count>min) {
				
				freqTable fTable = new freqTableImpl();
				
				count-=std;
				
				uppLim = count+std-1;
				lowLim = count;
				int freq = 0;
				for(float i : data) {
					
					if(i>=lowLim&&i<=uppLim) {
						freq++;
					}
				}	
				float r = 1;
				if(count<=min) {
					r = 0;
				}
				
				label = Float.toString(lowLim*r) + " - " + Float.toString(uppLim);
				
				fTable.setLabel(label);

				fTable.setValue(freq);
				
				freqTable.add(fTable);
			}
		
			if(min==max) {
				freqTable fTable = new freqTableImpl();
				fTable.setLabel(Float.toString(mean));
				fTable.setValue(1);				
				freqTable.add(0,fTable);
			}
			
			 this.freqencyTable = freqTable;
	}
	//EDITED

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Data_DescriptionPackage.NUMERICAL_STAT__COLUMN_ID:
			return getColumnId();
		case Data_DescriptionPackage.NUMERICAL_STAT__MIN:
			return getMin();
		case Data_DescriptionPackage.NUMERICAL_STAT__MAX:
			return getMax();
		case Data_DescriptionPackage.NUMERICAL_STAT__MEAN:
			return getMean();
		case Data_DescriptionPackage.NUMERICAL_STAT__STD:
			return getStd();
		case Data_DescriptionPackage.NUMERICAL_STAT__FREQENCY_TABLE:
			return getFreqencyTable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Data_DescriptionPackage.NUMERICAL_STAT__COLUMN_ID:
			setColumnId((String) newValue);
			return;
		case Data_DescriptionPackage.NUMERICAL_STAT__MIN:
			setMin((Float) newValue);
			return;
		case Data_DescriptionPackage.NUMERICAL_STAT__MAX:
			setMax((Float) newValue);
			return;
		case Data_DescriptionPackage.NUMERICAL_STAT__MEAN:
			setMean((Float) newValue);
			return;
		case Data_DescriptionPackage.NUMERICAL_STAT__STD:
			setStd((Float) newValue);
			return;
		case Data_DescriptionPackage.NUMERICAL_STAT__FREQENCY_TABLE:
			getFreqencyTable().clear();
			getFreqencyTable().addAll((Collection<? extends freqTable>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Data_DescriptionPackage.NUMERICAL_STAT__COLUMN_ID:
			setColumnId(COLUMN_ID_EDEFAULT);
			return;
		case Data_DescriptionPackage.NUMERICAL_STAT__MIN:
			setMin(MIN_EDEFAULT);
			return;
		case Data_DescriptionPackage.NUMERICAL_STAT__MAX:
			setMax(MAX_EDEFAULT);
			return;
		case Data_DescriptionPackage.NUMERICAL_STAT__MEAN:
			setMean(MEAN_EDEFAULT);
			return;
		case Data_DescriptionPackage.NUMERICAL_STAT__STD:
			setStd(STD_EDEFAULT);
			return;
		case Data_DescriptionPackage.NUMERICAL_STAT__FREQENCY_TABLE:
			getFreqencyTable().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Data_DescriptionPackage.NUMERICAL_STAT__COLUMN_ID:
			return COLUMN_ID_EDEFAULT == null ? columnId != null : !COLUMN_ID_EDEFAULT.equals(columnId);
		case Data_DescriptionPackage.NUMERICAL_STAT__MIN:
			return min != MIN_EDEFAULT;
		case Data_DescriptionPackage.NUMERICAL_STAT__MAX:
			return max != MAX_EDEFAULT;
		case Data_DescriptionPackage.NUMERICAL_STAT__MEAN:
			return mean != MEAN_EDEFAULT;
		case Data_DescriptionPackage.NUMERICAL_STAT__STD:
			return std != STD_EDEFAULT;
		case Data_DescriptionPackage.NUMERICAL_STAT__FREQENCY_TABLE:
			return freqencyTable != null && !freqencyTable.isEmpty();
		}
		return super.eIsSet(featureID);
	}

//
//	//EDITED
//	public HashMap<String, Float> computeStat(ArrayList<String> data) {
//
//		HashMap<String, Float> stat = new HashMap<String, Float>();
//		ArrayList<Float> numData = new ArrayList<Float>();
//
//		for (String i : data) {
//
//			numData.add(Float.parseFloat(i));
//
//		}
//
//		return stat;
//
//	}
//	//EDITED

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (columnId: ");
		result.append(columnId);
		result.append(", min: ");
		result.append(min);
		result.append(", max: ");
		result.append(max);
		result.append(", mean: ");
		result.append(mean);
		result.append(", std: ");
		result.append(std);
		result.append(')');
		return result.toString();
	}

} //NumericalStatImpl
