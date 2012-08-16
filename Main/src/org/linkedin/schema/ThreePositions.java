package org.linkedin.schema;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class ThreePositions 
{
	@SerializedName("_total")
	public long total;
	public List<Position>values;

    /**
     * Gets the value of the positionList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the positionList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPositionList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Position }
     * 
     * 
     */
	public List<Position> getPositionList()
    {
    	return values;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
	public long getTotal()
    {
    	return total;
    }
}
