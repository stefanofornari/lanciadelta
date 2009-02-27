/**
 * IterationCumulativeFlowData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rallydev.webservice.v1_10.domain;

public class IterationCumulativeFlowData  extends com.rallydev.webservice.v1_10.domain.CumulativeFlowData  implements java.io.Serializable {
    private java.lang.Long iterationObjectID;

    public IterationCumulativeFlowData() {
    }

    public IterationCumulativeFlowData(
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
           java.lang.Long cardCount,
           java.lang.Double cardEstimateTotal,
           java.lang.String cardState,
           java.lang.Double cardToDoTotal,
           java.lang.Double taskEstimateTotal,
           java.lang.Long iterationObjectID) {
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
            workspace,
            cardCount,
            cardEstimateTotal,
            cardState,
            cardToDoTotal,
            taskEstimateTotal);
        this.iterationObjectID = iterationObjectID;
    }


    /**
     * Gets the iterationObjectID value for this IterationCumulativeFlowData.
     * 
     * @return iterationObjectID
     */
    public java.lang.Long getIterationObjectID() {
        return iterationObjectID;
    }


    /**
     * Sets the iterationObjectID value for this IterationCumulativeFlowData.
     * 
     * @param iterationObjectID
     */
    public void setIterationObjectID(java.lang.Long iterationObjectID) {
        this.iterationObjectID = iterationObjectID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IterationCumulativeFlowData)) return false;
        IterationCumulativeFlowData other = (IterationCumulativeFlowData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.iterationObjectID==null && other.getIterationObjectID()==null) || 
             (this.iterationObjectID!=null &&
              this.iterationObjectID.equals(other.getIterationObjectID())));
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
        if (getIterationObjectID() != null) {
            _hashCode += getIterationObjectID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IterationCumulativeFlowData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "IterationCumulativeFlowData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iterationObjectID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IterationObjectID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
