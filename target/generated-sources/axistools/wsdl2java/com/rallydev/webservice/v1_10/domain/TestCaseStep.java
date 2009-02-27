/**
 * TestCaseStep.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rallydev.webservice.v1_10.domain;

public class TestCaseStep  extends com.rallydev.webservice.v1_10.domain.WorkspaceDomainObject  implements java.io.Serializable {
    private java.lang.String expectedResult;

    private java.lang.String input;

    private java.lang.Long stepIndex;

    private com.rallydev.webservice.v1_10.domain.TestCase testCase;

    public TestCaseStep() {
    }

    public TestCaseStep(
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
           java.lang.String expectedResult,
           java.lang.String input,
           java.lang.Long stepIndex,
           com.rallydev.webservice.v1_10.domain.TestCase testCase) {
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
        this.expectedResult = expectedResult;
        this.input = input;
        this.stepIndex = stepIndex;
        this.testCase = testCase;
    }


    /**
     * Gets the expectedResult value for this TestCaseStep.
     * 
     * @return expectedResult
     */
    public java.lang.String getExpectedResult() {
        return expectedResult;
    }


    /**
     * Sets the expectedResult value for this TestCaseStep.
     * 
     * @param expectedResult
     */
    public void setExpectedResult(java.lang.String expectedResult) {
        this.expectedResult = expectedResult;
    }


    /**
     * Gets the input value for this TestCaseStep.
     * 
     * @return input
     */
    public java.lang.String getInput() {
        return input;
    }


    /**
     * Sets the input value for this TestCaseStep.
     * 
     * @param input
     */
    public void setInput(java.lang.String input) {
        this.input = input;
    }


    /**
     * Gets the stepIndex value for this TestCaseStep.
     * 
     * @return stepIndex
     */
    public java.lang.Long getStepIndex() {
        return stepIndex;
    }


    /**
     * Sets the stepIndex value for this TestCaseStep.
     * 
     * @param stepIndex
     */
    public void setStepIndex(java.lang.Long stepIndex) {
        this.stepIndex = stepIndex;
    }


    /**
     * Gets the testCase value for this TestCaseStep.
     * 
     * @return testCase
     */
    public com.rallydev.webservice.v1_10.domain.TestCase getTestCase() {
        return testCase;
    }


    /**
     * Sets the testCase value for this TestCaseStep.
     * 
     * @param testCase
     */
    public void setTestCase(com.rallydev.webservice.v1_10.domain.TestCase testCase) {
        this.testCase = testCase;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TestCaseStep)) return false;
        TestCaseStep other = (TestCaseStep) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.expectedResult==null && other.getExpectedResult()==null) || 
             (this.expectedResult!=null &&
              this.expectedResult.equals(other.getExpectedResult()))) &&
            ((this.input==null && other.getInput()==null) || 
             (this.input!=null &&
              this.input.equals(other.getInput()))) &&
            ((this.stepIndex==null && other.getStepIndex()==null) || 
             (this.stepIndex!=null &&
              this.stepIndex.equals(other.getStepIndex()))) &&
            ((this.testCase==null && other.getTestCase()==null) || 
             (this.testCase!=null &&
              this.testCase.equals(other.getTestCase())));
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
        if (getExpectedResult() != null) {
            _hashCode += getExpectedResult().hashCode();
        }
        if (getInput() != null) {
            _hashCode += getInput().hashCode();
        }
        if (getStepIndex() != null) {
            _hashCode += getStepIndex().hashCode();
        }
        if (getTestCase() != null) {
            _hashCode += getTestCase().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TestCaseStep.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "TestCaseStep"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedResult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ExpectedResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("input");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Input"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stepIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StepIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testCase");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TestCase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "TestCase"));
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
