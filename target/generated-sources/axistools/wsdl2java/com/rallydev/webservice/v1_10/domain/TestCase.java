/**
 * TestCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rallydev.webservice.v1_10.domain;

public class TestCase  extends com.rallydev.webservice.v1_10.domain.Artifact  implements java.io.Serializable {
    private com.rallydev.webservice.v1_10.domain.Attachment[] attachments;

    private java.lang.String lastBuild;

    private java.util.Calendar lastRun;

    private java.lang.String lastVerdict;

    private java.lang.String method;

    private java.lang.String objective;

    private java.lang.String _package;

    private java.lang.String postConditions;

    private java.lang.String preConditions;

    private java.lang.String priority;

    private com.rallydev.webservice.v1_10.domain.TestCaseResult[] results;

    private java.lang.String risk;

    private com.rallydev.webservice.v1_10.domain.TestCaseStep[] steps;

    private java.lang.String type;

    private java.lang.String validationExpectedResult;

    private java.lang.String validationInput;

    private com.rallydev.webservice.v1_10.domain.Artifact workProduct;

    public TestCase() {
    }

    public TestCase(
           java.lang.String ref,
           long objectVersion,
           java.lang.String _type,
           java.lang.String refObjectName,
           long rallyAPIMajor,
           long rallyAPIMinor,
           java.util.Calendar creationDate,
           java.lang.Long objectID,
           com.rallydev.webservice.v1_10.domain.Subscription subscription,
           com.rallydev.webservice.v1_10.domain.Workspace workspace,
           java.lang.String description,
           com.rallydev.webservice.v1_10.domain.ConversationPost[] discussion,
           java.lang.String formattedID,
           java.util.Calendar lastUpdateDate,
           java.lang.String name,
           java.lang.String notes,
           java.lang.String owner,
           com.rallydev.webservice.v1_10.domain.Project project,
           com.rallydev.webservice.v1_10.domain.RevisionHistory revisionHistory,
           com.rallydev.webservice.v1_10.domain.Attachment[] attachments,
           java.lang.String lastBuild,
           java.util.Calendar lastRun,
           java.lang.String lastVerdict,
           java.lang.String method,
           java.lang.String objective,
           java.lang.String _package,
           java.lang.String postConditions,
           java.lang.String preConditions,
           java.lang.String priority,
           com.rallydev.webservice.v1_10.domain.TestCaseResult[] results,
           java.lang.String risk,
           com.rallydev.webservice.v1_10.domain.TestCaseStep[] steps,
           java.lang.String type,
           java.lang.String validationExpectedResult,
           java.lang.String validationInput,
           com.rallydev.webservice.v1_10.domain.Artifact workProduct) {
        super(
            ref,
            objectVersion,
            _type,
            refObjectName,
            rallyAPIMajor,
            rallyAPIMinor,
            creationDate,
            objectID,
            subscription,
            workspace,
            description,
            discussion,
            formattedID,
            lastUpdateDate,
            name,
            notes,
            owner,
            project,
            revisionHistory);
        this.attachments = attachments;
        this.lastBuild = lastBuild;
        this.lastRun = lastRun;
        this.lastVerdict = lastVerdict;
        this.method = method;
        this.objective = objective;
        this._package = _package;
        this.postConditions = postConditions;
        this.preConditions = preConditions;
        this.priority = priority;
        this.results = results;
        this.risk = risk;
        this.steps = steps;
        this.type = type;
        this.validationExpectedResult = validationExpectedResult;
        this.validationInput = validationInput;
        this.workProduct = workProduct;
    }


    /**
     * Gets the attachments value for this TestCase.
     * 
     * @return attachments
     */
    public com.rallydev.webservice.v1_10.domain.Attachment[] getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this TestCase.
     * 
     * @param attachments
     */
    public void setAttachments(com.rallydev.webservice.v1_10.domain.Attachment[] attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the lastBuild value for this TestCase.
     * 
     * @return lastBuild
     */
    public java.lang.String getLastBuild() {
        return lastBuild;
    }


    /**
     * Sets the lastBuild value for this TestCase.
     * 
     * @param lastBuild
     */
    public void setLastBuild(java.lang.String lastBuild) {
        this.lastBuild = lastBuild;
    }


    /**
     * Gets the lastRun value for this TestCase.
     * 
     * @return lastRun
     */
    public java.util.Calendar getLastRun() {
        return lastRun;
    }


    /**
     * Sets the lastRun value for this TestCase.
     * 
     * @param lastRun
     */
    public void setLastRun(java.util.Calendar lastRun) {
        this.lastRun = lastRun;
    }


    /**
     * Gets the lastVerdict value for this TestCase.
     * 
     * @return lastVerdict
     */
    public java.lang.String getLastVerdict() {
        return lastVerdict;
    }


    /**
     * Sets the lastVerdict value for this TestCase.
     * 
     * @param lastVerdict
     */
    public void setLastVerdict(java.lang.String lastVerdict) {
        this.lastVerdict = lastVerdict;
    }


    /**
     * Gets the method value for this TestCase.
     * 
     * @return method
     */
    public java.lang.String getMethod() {
        return method;
    }


    /**
     * Sets the method value for this TestCase.
     * 
     * @param method
     */
    public void setMethod(java.lang.String method) {
        this.method = method;
    }


    /**
     * Gets the objective value for this TestCase.
     * 
     * @return objective
     */
    public java.lang.String getObjective() {
        return objective;
    }


    /**
     * Sets the objective value for this TestCase.
     * 
     * @param objective
     */
    public void setObjective(java.lang.String objective) {
        this.objective = objective;
    }


    /**
     * Gets the _package value for this TestCase.
     * 
     * @return _package
     */
    public java.lang.String get_package() {
        return _package;
    }


    /**
     * Sets the _package value for this TestCase.
     * 
     * @param _package
     */
    public void set_package(java.lang.String _package) {
        this._package = _package;
    }


    /**
     * Gets the postConditions value for this TestCase.
     * 
     * @return postConditions
     */
    public java.lang.String getPostConditions() {
        return postConditions;
    }


    /**
     * Sets the postConditions value for this TestCase.
     * 
     * @param postConditions
     */
    public void setPostConditions(java.lang.String postConditions) {
        this.postConditions = postConditions;
    }


    /**
     * Gets the preConditions value for this TestCase.
     * 
     * @return preConditions
     */
    public java.lang.String getPreConditions() {
        return preConditions;
    }


    /**
     * Sets the preConditions value for this TestCase.
     * 
     * @param preConditions
     */
    public void setPreConditions(java.lang.String preConditions) {
        this.preConditions = preConditions;
    }


    /**
     * Gets the priority value for this TestCase.
     * 
     * @return priority
     */
    public java.lang.String getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this TestCase.
     * 
     * @param priority
     */
    public void setPriority(java.lang.String priority) {
        this.priority = priority;
    }


    /**
     * Gets the results value for this TestCase.
     * 
     * @return results
     */
    public com.rallydev.webservice.v1_10.domain.TestCaseResult[] getResults() {
        return results;
    }


    /**
     * Sets the results value for this TestCase.
     * 
     * @param results
     */
    public void setResults(com.rallydev.webservice.v1_10.domain.TestCaseResult[] results) {
        this.results = results;
    }


    /**
     * Gets the risk value for this TestCase.
     * 
     * @return risk
     */
    public java.lang.String getRisk() {
        return risk;
    }


    /**
     * Sets the risk value for this TestCase.
     * 
     * @param risk
     */
    public void setRisk(java.lang.String risk) {
        this.risk = risk;
    }


    /**
     * Gets the steps value for this TestCase.
     * 
     * @return steps
     */
    public com.rallydev.webservice.v1_10.domain.TestCaseStep[] getSteps() {
        return steps;
    }


    /**
     * Sets the steps value for this TestCase.
     * 
     * @param steps
     */
    public void setSteps(com.rallydev.webservice.v1_10.domain.TestCaseStep[] steps) {
        this.steps = steps;
    }


    /**
     * Gets the type value for this TestCase.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this TestCase.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the validationExpectedResult value for this TestCase.
     * 
     * @return validationExpectedResult
     */
    public java.lang.String getValidationExpectedResult() {
        return validationExpectedResult;
    }


    /**
     * Sets the validationExpectedResult value for this TestCase.
     * 
     * @param validationExpectedResult
     */
    public void setValidationExpectedResult(java.lang.String validationExpectedResult) {
        this.validationExpectedResult = validationExpectedResult;
    }


    /**
     * Gets the validationInput value for this TestCase.
     * 
     * @return validationInput
     */
    public java.lang.String getValidationInput() {
        return validationInput;
    }


    /**
     * Sets the validationInput value for this TestCase.
     * 
     * @param validationInput
     */
    public void setValidationInput(java.lang.String validationInput) {
        this.validationInput = validationInput;
    }


    /**
     * Gets the workProduct value for this TestCase.
     * 
     * @return workProduct
     */
    public com.rallydev.webservice.v1_10.domain.Artifact getWorkProduct() {
        return workProduct;
    }


    /**
     * Sets the workProduct value for this TestCase.
     * 
     * @param workProduct
     */
    public void setWorkProduct(com.rallydev.webservice.v1_10.domain.Artifact workProduct) {
        this.workProduct = workProduct;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TestCase)) return false;
        TestCase other = (TestCase) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              java.util.Arrays.equals(this.attachments, other.getAttachments()))) &&
            ((this.lastBuild==null && other.getLastBuild()==null) || 
             (this.lastBuild!=null &&
              this.lastBuild.equals(other.getLastBuild()))) &&
            ((this.lastRun==null && other.getLastRun()==null) || 
             (this.lastRun!=null &&
              this.lastRun.equals(other.getLastRun()))) &&
            ((this.lastVerdict==null && other.getLastVerdict()==null) || 
             (this.lastVerdict!=null &&
              this.lastVerdict.equals(other.getLastVerdict()))) &&
            ((this.method==null && other.getMethod()==null) || 
             (this.method!=null &&
              this.method.equals(other.getMethod()))) &&
            ((this.objective==null && other.getObjective()==null) || 
             (this.objective!=null &&
              this.objective.equals(other.getObjective()))) &&
            ((this._package==null && other.get_package()==null) || 
             (this._package!=null &&
              this._package.equals(other.get_package()))) &&
            ((this.postConditions==null && other.getPostConditions()==null) || 
             (this.postConditions!=null &&
              this.postConditions.equals(other.getPostConditions()))) &&
            ((this.preConditions==null && other.getPreConditions()==null) || 
             (this.preConditions!=null &&
              this.preConditions.equals(other.getPreConditions()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.results==null && other.getResults()==null) || 
             (this.results!=null &&
              java.util.Arrays.equals(this.results, other.getResults()))) &&
            ((this.risk==null && other.getRisk()==null) || 
             (this.risk!=null &&
              this.risk.equals(other.getRisk()))) &&
            ((this.steps==null && other.getSteps()==null) || 
             (this.steps!=null &&
              java.util.Arrays.equals(this.steps, other.getSteps()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.validationExpectedResult==null && other.getValidationExpectedResult()==null) || 
             (this.validationExpectedResult!=null &&
              this.validationExpectedResult.equals(other.getValidationExpectedResult()))) &&
            ((this.validationInput==null && other.getValidationInput()==null) || 
             (this.validationInput!=null &&
              this.validationInput.equals(other.getValidationInput()))) &&
            ((this.workProduct==null && other.getWorkProduct()==null) || 
             (this.workProduct!=null &&
              this.workProduct.equals(other.getWorkProduct())));
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
        if (getAttachments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttachments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttachments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLastBuild() != null) {
            _hashCode += getLastBuild().hashCode();
        }
        if (getLastRun() != null) {
            _hashCode += getLastRun().hashCode();
        }
        if (getLastVerdict() != null) {
            _hashCode += getLastVerdict().hashCode();
        }
        if (getMethod() != null) {
            _hashCode += getMethod().hashCode();
        }
        if (getObjective() != null) {
            _hashCode += getObjective().hashCode();
        }
        if (get_package() != null) {
            _hashCode += get_package().hashCode();
        }
        if (getPostConditions() != null) {
            _hashCode += getPostConditions().hashCode();
        }
        if (getPreConditions() != null) {
            _hashCode += getPreConditions().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
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
        if (getRisk() != null) {
            _hashCode += getRisk().hashCode();
        }
        if (getSteps() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSteps());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSteps(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getValidationExpectedResult() != null) {
            _hashCode += getValidationExpectedResult().hashCode();
        }
        if (getValidationInput() != null) {
            _hashCode += getValidationInput().hashCode();
        }
        if (getWorkProduct() != null) {
            _hashCode += getWorkProduct().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TestCase.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "TestCase"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Attachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Attachment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Attachment"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastBuild");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LastBuild"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastRun");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LastRun"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastVerdict");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LastVerdict"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("method");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Method"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objective");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Objective"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_package");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Package"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postConditions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PostConditions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preConditions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PreConditions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("results");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Results"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "TestCaseResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "TestCaseResult"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("risk");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Risk"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("steps");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Steps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "TestCaseStep"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "TestCaseStep"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validationExpectedResult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ValidationExpectedResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validationInput");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ValidationInput"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workProduct");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WorkProduct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Artifact"));
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
