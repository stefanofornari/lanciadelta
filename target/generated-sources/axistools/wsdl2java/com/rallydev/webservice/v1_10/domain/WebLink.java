/**
 * WebLink.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rallydev.webservice.v1_10.domain;

public class WebLink  implements java.io.Serializable {
    private java.lang.String linkID;

    private java.lang.String displayString;

    public WebLink() {
    }

    public WebLink(
           java.lang.String linkID,
           java.lang.String displayString) {
           this.linkID = linkID;
           this.displayString = displayString;
    }


    /**
     * Gets the linkID value for this WebLink.
     * 
     * @return linkID
     */
    public java.lang.String getLinkID() {
        return linkID;
    }


    /**
     * Sets the linkID value for this WebLink.
     * 
     * @param linkID
     */
    public void setLinkID(java.lang.String linkID) {
        this.linkID = linkID;
    }


    /**
     * Gets the displayString value for this WebLink.
     * 
     * @return displayString
     */
    public java.lang.String getDisplayString() {
        return displayString;
    }


    /**
     * Sets the displayString value for this WebLink.
     * 
     * @param displayString
     */
    public void setDisplayString(java.lang.String displayString) {
        this.displayString = displayString;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WebLink)) return false;
        WebLink other = (WebLink) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.linkID==null && other.getLinkID()==null) || 
             (this.linkID!=null &&
              this.linkID.equals(other.getLinkID()))) &&
            ((this.displayString==null && other.getDisplayString()==null) || 
             (this.displayString!=null &&
              this.displayString.equals(other.getDisplayString())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getLinkID() != null) {
            _hashCode += getLinkID().hashCode();
        }
        if (getDisplayString() != null) {
            _hashCode += getDisplayString().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WebLink.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "WebLink"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LinkID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayString");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DisplayString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
