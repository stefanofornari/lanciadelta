/**
 * CumulativeFlowData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rallydev.webservice.v1_10.domain;

public class CumulativeFlowData  extends com.rallydev.webservice.v1_10.domain.WorkspaceDomainObject  implements java.io.Serializable {
    private java.lang.Long cardCount;

    private java.lang.Double cardEstimateTotal;

    private java.lang.String cardState;

    private java.lang.Double cardToDoTotal;

    private java.lang.Double taskEstimateTotal;

    public CumulativeFlowData() {
    }

    public CumulativeFlowData(
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
           java.lang.Double taskEstimateTotal) {
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
        this.cardCount = cardCount;
        this.cardEstimateTotal = cardEstimateTotal;
        this.cardState = cardState;
        this.cardToDoTotal = cardToDoTotal;
        this.taskEstimateTotal = taskEstimateTotal;
    }


    /**
     * Gets the cardCount value for this CumulativeFlowData.
     * 
     * @return cardCount
     */
    public java.lang.Long getCardCount() {
        return cardCount;
    }


    /**
     * Sets the cardCount value for this CumulativeFlowData.
     * 
     * @param cardCount
     */
    public void setCardCount(java.lang.Long cardCount) {
        this.cardCount = cardCount;
    }


    /**
     * Gets the cardEstimateTotal value for this CumulativeFlowData.
     * 
     * @return cardEstimateTotal
     */
    public java.lang.Double getCardEstimateTotal() {
        return cardEstimateTotal;
    }


    /**
     * Sets the cardEstimateTotal value for this CumulativeFlowData.
     * 
     * @param cardEstimateTotal
     */
    public void setCardEstimateTotal(java.lang.Double cardEstimateTotal) {
        this.cardEstimateTotal = cardEstimateTotal;
    }


    /**
     * Gets the cardState value for this CumulativeFlowData.
     * 
     * @return cardState
     */
    public java.lang.String getCardState() {
        return cardState;
    }


    /**
     * Sets the cardState value for this CumulativeFlowData.
     * 
     * @param cardState
     */
    public void setCardState(java.lang.String cardState) {
        this.cardState = cardState;
    }


    /**
     * Gets the cardToDoTotal value for this CumulativeFlowData.
     * 
     * @return cardToDoTotal
     */
    public java.lang.Double getCardToDoTotal() {
        return cardToDoTotal;
    }


    /**
     * Sets the cardToDoTotal value for this CumulativeFlowData.
     * 
     * @param cardToDoTotal
     */
    public void setCardToDoTotal(java.lang.Double cardToDoTotal) {
        this.cardToDoTotal = cardToDoTotal;
    }


    /**
     * Gets the taskEstimateTotal value for this CumulativeFlowData.
     * 
     * @return taskEstimateTotal
     */
    public java.lang.Double getTaskEstimateTotal() {
        return taskEstimateTotal;
    }


    /**
     * Sets the taskEstimateTotal value for this CumulativeFlowData.
     * 
     * @param taskEstimateTotal
     */
    public void setTaskEstimateTotal(java.lang.Double taskEstimateTotal) {
        this.taskEstimateTotal = taskEstimateTotal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CumulativeFlowData)) return false;
        CumulativeFlowData other = (CumulativeFlowData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.cardCount==null && other.getCardCount()==null) || 
             (this.cardCount!=null &&
              this.cardCount.equals(other.getCardCount()))) &&
            ((this.cardEstimateTotal==null && other.getCardEstimateTotal()==null) || 
             (this.cardEstimateTotal!=null &&
              this.cardEstimateTotal.equals(other.getCardEstimateTotal()))) &&
            ((this.cardState==null && other.getCardState()==null) || 
             (this.cardState!=null &&
              this.cardState.equals(other.getCardState()))) &&
            ((this.cardToDoTotal==null && other.getCardToDoTotal()==null) || 
             (this.cardToDoTotal!=null &&
              this.cardToDoTotal.equals(other.getCardToDoTotal()))) &&
            ((this.taskEstimateTotal==null && other.getTaskEstimateTotal()==null) || 
             (this.taskEstimateTotal!=null &&
              this.taskEstimateTotal.equals(other.getTaskEstimateTotal())));
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
        if (getCardCount() != null) {
            _hashCode += getCardCount().hashCode();
        }
        if (getCardEstimateTotal() != null) {
            _hashCode += getCardEstimateTotal().hashCode();
        }
        if (getCardState() != null) {
            _hashCode += getCardState().hashCode();
        }
        if (getCardToDoTotal() != null) {
            _hashCode += getCardToDoTotal().hashCode();
        }
        if (getTaskEstimateTotal() != null) {
            _hashCode += getTaskEstimateTotal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CumulativeFlowData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "CumulativeFlowData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CardCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardEstimateTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CardEstimateTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardState");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CardState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardToDoTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CardToDoTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskEstimateTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TaskEstimateTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
