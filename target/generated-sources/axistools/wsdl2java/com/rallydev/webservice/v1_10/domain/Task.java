/**
 * Task.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rallydev.webservice.v1_10.domain;

public class Task  extends com.rallydev.webservice.v1_10.domain.Artifact  implements java.io.Serializable {
    private java.lang.Double actuals;

    private com.rallydev.webservice.v1_10.domain.Attachment[] attachments;

    private java.lang.Boolean blocked;

    private java.lang.Double estimate;

    private com.rallydev.webservice.v1_10.domain.Iteration iteration;

    private java.lang.Double rank;

    private com.rallydev.webservice.v1_10.domain.Release release;

    private java.lang.String state;

    private java.lang.Long taskIndex;

    private java.lang.Double toDo;

    private com.rallydev.webservice.v1_10.domain.Artifact workProduct;

    private java.lang.Double BV;

    public Task() {
    }

    public Task(
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
           java.lang.String description,
           com.rallydev.webservice.v1_10.domain.ConversationPost[] discussion,
           java.lang.String formattedID,
           java.util.Calendar lastUpdateDate,
           java.lang.String name,
           java.lang.String notes,
           java.lang.String owner,
           com.rallydev.webservice.v1_10.domain.Project project,
           com.rallydev.webservice.v1_10.domain.RevisionHistory revisionHistory,
           java.lang.Double actuals,
           com.rallydev.webservice.v1_10.domain.Attachment[] attachments,
           java.lang.Boolean blocked,
           java.lang.Double estimate,
           com.rallydev.webservice.v1_10.domain.Iteration iteration,
           java.lang.Double rank,
           com.rallydev.webservice.v1_10.domain.Release release,
           java.lang.String state,
           java.lang.Long taskIndex,
           java.lang.Double toDo,
           com.rallydev.webservice.v1_10.domain.Artifact workProduct,
           java.lang.Double BV) {
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
            description,
            discussion,
            formattedID,
            lastUpdateDate,
            name,
            notes,
            owner,
            project,
            revisionHistory);
        this.actuals = actuals;
        this.attachments = attachments;
        this.blocked = blocked;
        this.estimate = estimate;
        this.iteration = iteration;
        this.rank = rank;
        this.release = release;
        this.state = state;
        this.taskIndex = taskIndex;
        this.toDo = toDo;
        this.workProduct = workProduct;
        this.BV = BV;
    }


    /**
     * Gets the actuals value for this Task.
     * 
     * @return actuals
     */
    public java.lang.Double getActuals() {
        return actuals;
    }


    /**
     * Sets the actuals value for this Task.
     * 
     * @param actuals
     */
    public void setActuals(java.lang.Double actuals) {
        this.actuals = actuals;
    }


    /**
     * Gets the attachments value for this Task.
     * 
     * @return attachments
     */
    public com.rallydev.webservice.v1_10.domain.Attachment[] getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Task.
     * 
     * @param attachments
     */
    public void setAttachments(com.rallydev.webservice.v1_10.domain.Attachment[] attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the blocked value for this Task.
     * 
     * @return blocked
     */
    public java.lang.Boolean getBlocked() {
        return blocked;
    }


    /**
     * Sets the blocked value for this Task.
     * 
     * @param blocked
     */
    public void setBlocked(java.lang.Boolean blocked) {
        this.blocked = blocked;
    }


    /**
     * Gets the estimate value for this Task.
     * 
     * @return estimate
     */
    public java.lang.Double getEstimate() {
        return estimate;
    }


    /**
     * Sets the estimate value for this Task.
     * 
     * @param estimate
     */
    public void setEstimate(java.lang.Double estimate) {
        this.estimate = estimate;
    }


    /**
     * Gets the iteration value for this Task.
     * 
     * @return iteration
     */
    public com.rallydev.webservice.v1_10.domain.Iteration getIteration() {
        return iteration;
    }


    /**
     * Sets the iteration value for this Task.
     * 
     * @param iteration
     */
    public void setIteration(com.rallydev.webservice.v1_10.domain.Iteration iteration) {
        this.iteration = iteration;
    }


    /**
     * Gets the rank value for this Task.
     * 
     * @return rank
     */
    public java.lang.Double getRank() {
        return rank;
    }


    /**
     * Sets the rank value for this Task.
     * 
     * @param rank
     */
    public void setRank(java.lang.Double rank) {
        this.rank = rank;
    }


    /**
     * Gets the release value for this Task.
     * 
     * @return release
     */
    public com.rallydev.webservice.v1_10.domain.Release getRelease() {
        return release;
    }


    /**
     * Sets the release value for this Task.
     * 
     * @param release
     */
    public void setRelease(com.rallydev.webservice.v1_10.domain.Release release) {
        this.release = release;
    }


    /**
     * Gets the state value for this Task.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Task.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the taskIndex value for this Task.
     * 
     * @return taskIndex
     */
    public java.lang.Long getTaskIndex() {
        return taskIndex;
    }


    /**
     * Sets the taskIndex value for this Task.
     * 
     * @param taskIndex
     */
    public void setTaskIndex(java.lang.Long taskIndex) {
        this.taskIndex = taskIndex;
    }


    /**
     * Gets the toDo value for this Task.
     * 
     * @return toDo
     */
    public java.lang.Double getToDo() {
        return toDo;
    }


    /**
     * Sets the toDo value for this Task.
     * 
     * @param toDo
     */
    public void setToDo(java.lang.Double toDo) {
        this.toDo = toDo;
    }


    /**
     * Gets the workProduct value for this Task.
     * 
     * @return workProduct
     */
    public com.rallydev.webservice.v1_10.domain.Artifact getWorkProduct() {
        return workProduct;
    }


    /**
     * Sets the workProduct value for this Task.
     * 
     * @param workProduct
     */
    public void setWorkProduct(com.rallydev.webservice.v1_10.domain.Artifact workProduct) {
        this.workProduct = workProduct;
    }


    /**
     * Gets the BV value for this Task.
     * 
     * @return BV
     */
    public java.lang.Double getBV() {
        return BV;
    }


    /**
     * Sets the BV value for this Task.
     * 
     * @param BV
     */
    public void setBV(java.lang.Double BV) {
        this.BV = BV;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Task)) return false;
        Task other = (Task) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.actuals==null && other.getActuals()==null) || 
             (this.actuals!=null &&
              this.actuals.equals(other.getActuals()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              java.util.Arrays.equals(this.attachments, other.getAttachments()))) &&
            ((this.blocked==null && other.getBlocked()==null) || 
             (this.blocked!=null &&
              this.blocked.equals(other.getBlocked()))) &&
            ((this.estimate==null && other.getEstimate()==null) || 
             (this.estimate!=null &&
              this.estimate.equals(other.getEstimate()))) &&
            ((this.iteration==null && other.getIteration()==null) || 
             (this.iteration!=null &&
              this.iteration.equals(other.getIteration()))) &&
            ((this.rank==null && other.getRank()==null) || 
             (this.rank!=null &&
              this.rank.equals(other.getRank()))) &&
            ((this.release==null && other.getRelease()==null) || 
             (this.release!=null &&
              this.release.equals(other.getRelease()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.taskIndex==null && other.getTaskIndex()==null) || 
             (this.taskIndex!=null &&
              this.taskIndex.equals(other.getTaskIndex()))) &&
            ((this.toDo==null && other.getToDo()==null) || 
             (this.toDo!=null &&
              this.toDo.equals(other.getToDo()))) &&
            ((this.workProduct==null && other.getWorkProduct()==null) || 
             (this.workProduct!=null &&
              this.workProduct.equals(other.getWorkProduct()))) &&
            ((this.BV==null && other.getBV()==null) || 
             (this.BV!=null &&
              this.BV.equals(other.getBV())));
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
        if (getActuals() != null) {
            _hashCode += getActuals().hashCode();
        }
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
        if (getBlocked() != null) {
            _hashCode += getBlocked().hashCode();
        }
        if (getEstimate() != null) {
            _hashCode += getEstimate().hashCode();
        }
        if (getIteration() != null) {
            _hashCode += getIteration().hashCode();
        }
        if (getRank() != null) {
            _hashCode += getRank().hashCode();
        }
        if (getRelease() != null) {
            _hashCode += getRelease().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getTaskIndex() != null) {
            _hashCode += getTaskIndex().hashCode();
        }
        if (getToDo() != null) {
            _hashCode += getToDo().hashCode();
        }
        if (getWorkProduct() != null) {
            _hashCode += getWorkProduct().hashCode();
        }
        if (getBV() != null) {
            _hashCode += getBV().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Task.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Task"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actuals");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Actuals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Attachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Attachment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Attachment"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blocked");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Blocked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Estimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iteration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Iteration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Iteration"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rank");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Rank"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("release");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Release"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Release"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TaskIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toDo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ToDo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BV");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BV"));
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
