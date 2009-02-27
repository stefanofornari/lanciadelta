/**
 * AttributeDefinition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rallydev.webservice.v1_10.domain;

public class AttributeDefinition  extends com.rallydev.webservice.v1_10.domain.WorkspaceDomainObject  implements java.io.Serializable {
    private com.rallydev.webservice.v1_10.domain.AllowedQueryOperator[] allowedQueryOperators;

    private com.rallydev.webservice.v1_10.domain.TypeDefinition allowedValueType;

    private com.rallydev.webservice.v1_10.domain.AllowedAttributeValue[] allowedValues;

    private java.lang.String attributeType;

    private java.lang.Boolean constrained;

    private java.lang.Boolean custom;

    private java.lang.String elementName;

    private java.lang.Boolean filterable;

    private java.lang.Boolean hidden;

    private java.lang.Long maxFractionalDigits;

    private java.lang.Long maxLength;

    private java.lang.String name;

    private java.lang.String note;

    private java.lang.Boolean owned;

    private java.lang.Boolean readOnly;

    private java.lang.String schemaType;

    public AttributeDefinition() {
    }

    public AttributeDefinition(
           java.lang.String ref,
           long objectVersion,
           java.lang.String type,
           java.lang.String refObjectName,
           long rallyAPIMajor,
           long rallyAPIMinor,
           java.util.Calendar creationDate,
           java.lang.Long objectID,
           com.rallydev.webservice.v1_10.domain.Subscription subscription,
           com.rallydev.webservice.v1_10.domain.Workspace workspace,
           com.rallydev.webservice.v1_10.domain.AllowedQueryOperator[] allowedQueryOperators,
           com.rallydev.webservice.v1_10.domain.TypeDefinition allowedValueType,
           com.rallydev.webservice.v1_10.domain.AllowedAttributeValue[] allowedValues,
           java.lang.String attributeType,
           java.lang.Boolean constrained,
           java.lang.Boolean custom,
           java.lang.String elementName,
           java.lang.Boolean filterable,
           java.lang.Boolean hidden,
           java.lang.Long maxFractionalDigits,
           java.lang.Long maxLength,
           java.lang.String name,
           java.lang.String note,
           java.lang.Boolean owned,
           java.lang.Boolean readOnly,
           java.lang.String schemaType) {
        super(
            ref,
            objectVersion,
            type,
            refObjectName,
            rallyAPIMajor,
            rallyAPIMinor,
            creationDate,
            objectID,
            subscription,
            workspace);
        this.allowedQueryOperators = allowedQueryOperators;
        this.allowedValueType = allowedValueType;
        this.allowedValues = allowedValues;
        this.attributeType = attributeType;
        this.constrained = constrained;
        this.custom = custom;
        this.elementName = elementName;
        this.filterable = filterable;
        this.hidden = hidden;
        this.maxFractionalDigits = maxFractionalDigits;
        this.maxLength = maxLength;
        this.name = name;
        this.note = note;
        this.owned = owned;
        this.readOnly = readOnly;
        this.schemaType = schemaType;
    }


    /**
     * Gets the allowedQueryOperators value for this AttributeDefinition.
     * 
     * @return allowedQueryOperators
     */
    public com.rallydev.webservice.v1_10.domain.AllowedQueryOperator[] getAllowedQueryOperators() {
        return allowedQueryOperators;
    }


    /**
     * Sets the allowedQueryOperators value for this AttributeDefinition.
     * 
     * @param allowedQueryOperators
     */
    public void setAllowedQueryOperators(com.rallydev.webservice.v1_10.domain.AllowedQueryOperator[] allowedQueryOperators) {
        this.allowedQueryOperators = allowedQueryOperators;
    }


    /**
     * Gets the allowedValueType value for this AttributeDefinition.
     * 
     * @return allowedValueType
     */
    public com.rallydev.webservice.v1_10.domain.TypeDefinition getAllowedValueType() {
        return allowedValueType;
    }


    /**
     * Sets the allowedValueType value for this AttributeDefinition.
     * 
     * @param allowedValueType
     */
    public void setAllowedValueType(com.rallydev.webservice.v1_10.domain.TypeDefinition allowedValueType) {
        this.allowedValueType = allowedValueType;
    }


    /**
     * Gets the allowedValues value for this AttributeDefinition.
     * 
     * @return allowedValues
     */
    public com.rallydev.webservice.v1_10.domain.AllowedAttributeValue[] getAllowedValues() {
        return allowedValues;
    }


    /**
     * Sets the allowedValues value for this AttributeDefinition.
     * 
     * @param allowedValues
     */
    public void setAllowedValues(com.rallydev.webservice.v1_10.domain.AllowedAttributeValue[] allowedValues) {
        this.allowedValues = allowedValues;
    }


    /**
     * Gets the attributeType value for this AttributeDefinition.
     * 
     * @return attributeType
     */
    public java.lang.String getAttributeType() {
        return attributeType;
    }


    /**
     * Sets the attributeType value for this AttributeDefinition.
     * 
     * @param attributeType
     */
    public void setAttributeType(java.lang.String attributeType) {
        this.attributeType = attributeType;
    }


    /**
     * Gets the constrained value for this AttributeDefinition.
     * 
     * @return constrained
     */
    public java.lang.Boolean getConstrained() {
        return constrained;
    }


    /**
     * Sets the constrained value for this AttributeDefinition.
     * 
     * @param constrained
     */
    public void setConstrained(java.lang.Boolean constrained) {
        this.constrained = constrained;
    }


    /**
     * Gets the custom value for this AttributeDefinition.
     * 
     * @return custom
     */
    public java.lang.Boolean getCustom() {
        return custom;
    }


    /**
     * Sets the custom value for this AttributeDefinition.
     * 
     * @param custom
     */
    public void setCustom(java.lang.Boolean custom) {
        this.custom = custom;
    }


    /**
     * Gets the elementName value for this AttributeDefinition.
     * 
     * @return elementName
     */
    public java.lang.String getElementName() {
        return elementName;
    }


    /**
     * Sets the elementName value for this AttributeDefinition.
     * 
     * @param elementName
     */
    public void setElementName(java.lang.String elementName) {
        this.elementName = elementName;
    }


    /**
     * Gets the filterable value for this AttributeDefinition.
     * 
     * @return filterable
     */
    public java.lang.Boolean getFilterable() {
        return filterable;
    }


    /**
     * Sets the filterable value for this AttributeDefinition.
     * 
     * @param filterable
     */
    public void setFilterable(java.lang.Boolean filterable) {
        this.filterable = filterable;
    }


    /**
     * Gets the hidden value for this AttributeDefinition.
     * 
     * @return hidden
     */
    public java.lang.Boolean getHidden() {
        return hidden;
    }


    /**
     * Sets the hidden value for this AttributeDefinition.
     * 
     * @param hidden
     */
    public void setHidden(java.lang.Boolean hidden) {
        this.hidden = hidden;
    }


    /**
     * Gets the maxFractionalDigits value for this AttributeDefinition.
     * 
     * @return maxFractionalDigits
     */
    public java.lang.Long getMaxFractionalDigits() {
        return maxFractionalDigits;
    }


    /**
     * Sets the maxFractionalDigits value for this AttributeDefinition.
     * 
     * @param maxFractionalDigits
     */
    public void setMaxFractionalDigits(java.lang.Long maxFractionalDigits) {
        this.maxFractionalDigits = maxFractionalDigits;
    }


    /**
     * Gets the maxLength value for this AttributeDefinition.
     * 
     * @return maxLength
     */
    public java.lang.Long getMaxLength() {
        return maxLength;
    }


    /**
     * Sets the maxLength value for this AttributeDefinition.
     * 
     * @param maxLength
     */
    public void setMaxLength(java.lang.Long maxLength) {
        this.maxLength = maxLength;
    }


    /**
     * Gets the name value for this AttributeDefinition.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this AttributeDefinition.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the note value for this AttributeDefinition.
     * 
     * @return note
     */
    public java.lang.String getNote() {
        return note;
    }


    /**
     * Sets the note value for this AttributeDefinition.
     * 
     * @param note
     */
    public void setNote(java.lang.String note) {
        this.note = note;
    }


    /**
     * Gets the owned value for this AttributeDefinition.
     * 
     * @return owned
     */
    public java.lang.Boolean getOwned() {
        return owned;
    }


    /**
     * Sets the owned value for this AttributeDefinition.
     * 
     * @param owned
     */
    public void setOwned(java.lang.Boolean owned) {
        this.owned = owned;
    }


    /**
     * Gets the readOnly value for this AttributeDefinition.
     * 
     * @return readOnly
     */
    public java.lang.Boolean getReadOnly() {
        return readOnly;
    }


    /**
     * Sets the readOnly value for this AttributeDefinition.
     * 
     * @param readOnly
     */
    public void setReadOnly(java.lang.Boolean readOnly) {
        this.readOnly = readOnly;
    }


    /**
     * Gets the schemaType value for this AttributeDefinition.
     * 
     * @return schemaType
     */
    public java.lang.String getSchemaType() {
        return schemaType;
    }


    /**
     * Sets the schemaType value for this AttributeDefinition.
     * 
     * @param schemaType
     */
    public void setSchemaType(java.lang.String schemaType) {
        this.schemaType = schemaType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AttributeDefinition)) return false;
        AttributeDefinition other = (AttributeDefinition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.allowedQueryOperators==null && other.getAllowedQueryOperators()==null) || 
             (this.allowedQueryOperators!=null &&
              java.util.Arrays.equals(this.allowedQueryOperators, other.getAllowedQueryOperators()))) &&
            ((this.allowedValueType==null && other.getAllowedValueType()==null) || 
             (this.allowedValueType!=null &&
              this.allowedValueType.equals(other.getAllowedValueType()))) &&
            ((this.allowedValues==null && other.getAllowedValues()==null) || 
             (this.allowedValues!=null &&
              java.util.Arrays.equals(this.allowedValues, other.getAllowedValues()))) &&
            ((this.attributeType==null && other.getAttributeType()==null) || 
             (this.attributeType!=null &&
              this.attributeType.equals(other.getAttributeType()))) &&
            ((this.constrained==null && other.getConstrained()==null) || 
             (this.constrained!=null &&
              this.constrained.equals(other.getConstrained()))) &&
            ((this.custom==null && other.getCustom()==null) || 
             (this.custom!=null &&
              this.custom.equals(other.getCustom()))) &&
            ((this.elementName==null && other.getElementName()==null) || 
             (this.elementName!=null &&
              this.elementName.equals(other.getElementName()))) &&
            ((this.filterable==null && other.getFilterable()==null) || 
             (this.filterable!=null &&
              this.filterable.equals(other.getFilterable()))) &&
            ((this.hidden==null && other.getHidden()==null) || 
             (this.hidden!=null &&
              this.hidden.equals(other.getHidden()))) &&
            ((this.maxFractionalDigits==null && other.getMaxFractionalDigits()==null) || 
             (this.maxFractionalDigits!=null &&
              this.maxFractionalDigits.equals(other.getMaxFractionalDigits()))) &&
            ((this.maxLength==null && other.getMaxLength()==null) || 
             (this.maxLength!=null &&
              this.maxLength.equals(other.getMaxLength()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.note==null && other.getNote()==null) || 
             (this.note!=null &&
              this.note.equals(other.getNote()))) &&
            ((this.owned==null && other.getOwned()==null) || 
             (this.owned!=null &&
              this.owned.equals(other.getOwned()))) &&
            ((this.readOnly==null && other.getReadOnly()==null) || 
             (this.readOnly!=null &&
              this.readOnly.equals(other.getReadOnly()))) &&
            ((this.schemaType==null && other.getSchemaType()==null) || 
             (this.schemaType!=null &&
              this.schemaType.equals(other.getSchemaType())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAllowedQueryOperators() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAllowedQueryOperators());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAllowedQueryOperators(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAllowedValueType() != null) {
            _hashCode += getAllowedValueType().hashCode();
        }
        if (getAllowedValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAllowedValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAllowedValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAttributeType() != null) {
            _hashCode += getAttributeType().hashCode();
        }
        if (getConstrained() != null) {
            _hashCode += getConstrained().hashCode();
        }
        if (getCustom() != null) {
            _hashCode += getCustom().hashCode();
        }
        if (getElementName() != null) {
            _hashCode += getElementName().hashCode();
        }
        if (getFilterable() != null) {
            _hashCode += getFilterable().hashCode();
        }
        if (getHidden() != null) {
            _hashCode += getHidden().hashCode();
        }
        if (getMaxFractionalDigits() != null) {
            _hashCode += getMaxFractionalDigits().hashCode();
        }
        if (getMaxLength() != null) {
            _hashCode += getMaxLength().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNote() != null) {
            _hashCode += getNote().hashCode();
        }
        if (getOwned() != null) {
            _hashCode += getOwned().hashCode();
        }
        if (getReadOnly() != null) {
            _hashCode += getReadOnly().hashCode();
        }
        if (getSchemaType() != null) {
            _hashCode += getSchemaType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AttributeDefinition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "AttributeDefinition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowedQueryOperators");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AllowedQueryOperators"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "AllowedQueryOperator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "AllowedQueryOperator"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowedValueType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AllowedValueType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "TypeDefinition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowedValues");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AllowedValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "AllowedAttributeValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "AllowedAttributeValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AttributeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("constrained");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Constrained"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Custom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elementName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ElementName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Filterable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hidden");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Hidden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxFractionalDigits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MaxFractionalDigits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxLength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MaxLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("note");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Note"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owned");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Owned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ReadOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schemaType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SchemaType"));
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
