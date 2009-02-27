/**
 * WSObject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rallydev.webservice.v1_10.domain;

public class WSObject  implements java.io.Serializable {
    private java.lang.String ref;  // attribute

    private long objectVersion;  // attribute

    private java.lang.String type;  // attribute

    private java.lang.String refObjectName;  // attribute

    private long rallyAPIMajor;  // attribute

    private long rallyAPIMinor;  // attribute

    public WSObject() {
    }

    public WSObject(
           java.lang.String ref,
           long objectVersion,
           java.lang.String type,
           java.lang.String refObjectName,
           long rallyAPIMajor,
           long rallyAPIMinor) {
           this.ref = ref;
           this.objectVersion = objectVersion;
           this.type = type;
           this.refObjectName = refObjectName;
           this.rallyAPIMajor = rallyAPIMajor;
           this.rallyAPIMinor = rallyAPIMinor;
    }


    /**
     * Gets the ref value for this WSObject.
     * 
     * @return ref
     */
    public java.lang.String getRef() {
        return ref;
    }


    /**
     * Sets the ref value for this WSObject.
     * 
     * @param ref
     */
    public void setRef(java.lang.String ref) {
        this.ref = ref;
    }


    /**
     * Gets the objectVersion value for this WSObject.
     * 
     * @return objectVersion
     */
    public long getObjectVersion() {
        return objectVersion;
    }


    /**
     * Sets the objectVersion value for this WSObject.
     * 
     * @param objectVersion
     */
    public void setObjectVersion(long objectVersion) {
        this.objectVersion = objectVersion;
    }


    /**
     * Gets the type value for this WSObject.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this WSObject.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the refObjectName value for this WSObject.
     * 
     * @return refObjectName
     */
    public java.lang.String getRefObjectName() {
        return refObjectName;
    }


    /**
     * Sets the refObjectName value for this WSObject.
     * 
     * @param refObjectName
     */
    public void setRefObjectName(java.lang.String refObjectName) {
        this.refObjectName = refObjectName;
    }


    /**
     * Gets the rallyAPIMajor value for this WSObject.
     * 
     * @return rallyAPIMajor
     */
    public long getRallyAPIMajor() {
        return rallyAPIMajor;
    }


    /**
     * Sets the rallyAPIMajor value for this WSObject.
     * 
     * @param rallyAPIMajor
     */
    public void setRallyAPIMajor(long rallyAPIMajor) {
        this.rallyAPIMajor = rallyAPIMajor;
    }


    /**
     * Gets the rallyAPIMinor value for this WSObject.
     * 
     * @return rallyAPIMinor
     */
    public long getRallyAPIMinor() {
        return rallyAPIMinor;
    }


    /**
     * Sets the rallyAPIMinor value for this WSObject.
     * 
     * @param rallyAPIMinor
     */
    public void setRallyAPIMinor(long rallyAPIMinor) {
        this.rallyAPIMinor = rallyAPIMinor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSObject)) return false;
        WSObject other = (WSObject) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ref==null && other.getRef()==null) || 
             (this.ref!=null &&
              this.ref.equals(other.getRef()))) &&
            this.objectVersion == other.getObjectVersion() &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.refObjectName==null && other.getRefObjectName()==null) || 
             (this.refObjectName!=null &&
              this.refObjectName.equals(other.getRefObjectName()))) &&
            this.rallyAPIMajor == other.getRallyAPIMajor() &&
            this.rallyAPIMinor == other.getRallyAPIMinor();
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
        if (getRef() != null) {
            _hashCode += getRef().hashCode();
        }
        _hashCode += new Long(getObjectVersion()).hashCode();
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getRefObjectName() != null) {
            _hashCode += getRefObjectName().hashCode();
        }
        _hashCode += new Long(getRallyAPIMajor()).hashCode();
        _hashCode += new Long(getRallyAPIMinor()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSObject.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "WSObject"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("ref");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ref"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("objectVersion");
        attrField.setXmlName(new javax.xml.namespace.QName("", "objectVersion"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("type");
        attrField.setXmlName(new javax.xml.namespace.QName("", "type"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("refObjectName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "refObjectName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("rallyAPIMajor");
        attrField.setXmlName(new javax.xml.namespace.QName("", "rallyAPIMajor"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("rallyAPIMinor");
        attrField.setXmlName(new javax.xml.namespace.QName("", "rallyAPIMinor"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
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
