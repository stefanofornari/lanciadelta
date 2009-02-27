/**
 * QueryResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rallydev.webservice.v1_10.domain;

public class QueryResult  extends com.rallydev.webservice.v1_10.domain.OperationResult  implements java.io.Serializable {
    private java.lang.Long totalResultCount;

    private java.lang.Long startIndex;

    private java.lang.Long pageSize;

    private com.rallydev.webservice.v1_10.domain.DomainObject[] results;

    public QueryResult() {
    }

    public QueryResult(
           java.lang.String ref,
           long objectVersion,
           java.lang.String type,
           java.lang.String refObjectName,
           long rallyAPIMajor,
           long rallyAPIMinor,
           java.lang.String[] errors,
           java.lang.String[] warnings,
           java.lang.Long totalResultCount,
           java.lang.Long startIndex,
           java.lang.Long pageSize,
           com.rallydev.webservice.v1_10.domain.DomainObject[] results) {
        super(
            ref,
            objectVersion,
            type,
            refObjectName,
            rallyAPIMajor,
            rallyAPIMinor,
            errors,
            warnings);
        this.totalResultCount = totalResultCount;
        this.startIndex = startIndex;
        this.pageSize = pageSize;
        this.results = results;
    }


    /**
     * Gets the totalResultCount value for this QueryResult.
     * 
     * @return totalResultCount
     */
    public java.lang.Long getTotalResultCount() {
        return totalResultCount;
    }


    /**
     * Sets the totalResultCount value for this QueryResult.
     * 
     * @param totalResultCount
     */
    public void setTotalResultCount(java.lang.Long totalResultCount) {
        this.totalResultCount = totalResultCount;
    }


    /**
     * Gets the startIndex value for this QueryResult.
     * 
     * @return startIndex
     */
    public java.lang.Long getStartIndex() {
        return startIndex;
    }


    /**
     * Sets the startIndex value for this QueryResult.
     * 
     * @param startIndex
     */
    public void setStartIndex(java.lang.Long startIndex) {
        this.startIndex = startIndex;
    }


    /**
     * Gets the pageSize value for this QueryResult.
     * 
     * @return pageSize
     */
    public java.lang.Long getPageSize() {
        return pageSize;
    }


    /**
     * Sets the pageSize value for this QueryResult.
     * 
     * @param pageSize
     */
    public void setPageSize(java.lang.Long pageSize) {
        this.pageSize = pageSize;
    }


    /**
     * Gets the results value for this QueryResult.
     * 
     * @return results
     */
    public com.rallydev.webservice.v1_10.domain.DomainObject[] getResults() {
        return results;
    }


    /**
     * Sets the results value for this QueryResult.
     * 
     * @param results
     */
    public void setResults(com.rallydev.webservice.v1_10.domain.DomainObject[] results) {
        this.results = results;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryResult)) return false;
        QueryResult other = (QueryResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.totalResultCount==null && other.getTotalResultCount()==null) || 
             (this.totalResultCount!=null &&
              this.totalResultCount.equals(other.getTotalResultCount()))) &&
            ((this.startIndex==null && other.getStartIndex()==null) || 
             (this.startIndex!=null &&
              this.startIndex.equals(other.getStartIndex()))) &&
            ((this.pageSize==null && other.getPageSize()==null) || 
             (this.pageSize!=null &&
              this.pageSize.equals(other.getPageSize()))) &&
            ((this.results==null && other.getResults()==null) || 
             (this.results!=null &&
              java.util.Arrays.equals(this.results, other.getResults())));
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
        if (getTotalResultCount() != null) {
            _hashCode += getTotalResultCount().hashCode();
        }
        if (getStartIndex() != null) {
            _hashCode += getStartIndex().hashCode();
        }
        if (getPageSize() != null) {
            _hashCode += getPageSize().hashCode();
        }
        if (getResults() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResults());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResults(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "QueryResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalResultCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TotalResultCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StartIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PageSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("results");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Results"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "DomainObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Object"));
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
