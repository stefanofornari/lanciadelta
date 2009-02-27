/**
 * DefectSuite.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rallydev.webservice.v1_10.domain;

public class DefectSuite  extends com.rallydev.webservice.v1_10.domain.Artifact  implements java.io.Serializable {
    private java.util.Calendar acceptedDate;

    private com.rallydev.webservice.v1_10.domain.Attachment[] attachments;

    private java.lang.Boolean blocked;

    private com.rallydev.webservice.v1_10.domain.Defect[] defects;

    private com.rallydev.webservice.v1_10.domain.Iteration iteration;

    private java.lang.String _package;

    private java.lang.Double planEstimate;

    private java.lang.Double rank;

    private com.rallydev.webservice.v1_10.domain.Release release;

    private java.lang.String scheduleState;

    private java.lang.Double taskActualTotal;

    private java.lang.Double taskEstimateTotal;

    private java.lang.Double taskRemainingTotal;

    private com.rallydev.webservice.v1_10.domain.Task[] tasks;

    public DefectSuite() {
    }

    public DefectSuite(
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
           java.util.Calendar acceptedDate,
           com.rallydev.webservice.v1_10.domain.Attachment[] attachments,
           java.lang.Boolean blocked,
           com.rallydev.webservice.v1_10.domain.Defect[] defects,
           com.rallydev.webservice.v1_10.domain.Iteration iteration,
           java.lang.String _package,
           java.lang.Double planEstimate,
           java.lang.Double rank,
           com.rallydev.webservice.v1_10.domain.Release release,
           java.lang.String scheduleState,
           java.lang.Double taskActualTotal,
           java.lang.Double taskEstimateTotal,
           java.lang.Double taskRemainingTotal,
           com.rallydev.webservice.v1_10.domain.Task[] tasks) {
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
        this.acceptedDate = acceptedDate;
        this.attachments = attachments;
        this.blocked = blocked;
        this.defects = defects;
        this.iteration = iteration;
        this._package = _package;
        this.planEstimate = planEstimate;
        this.rank = rank;
        this.release = release;
        this.scheduleState = scheduleState;
        this.taskActualTotal = taskActualTotal;
        this.taskEstimateTotal = taskEstimateTotal;
        this.taskRemainingTotal = taskRemainingTotal;
        this.tasks = tasks;
    }


    /**
     * Gets the acceptedDate value for this DefectSuite.
     * 
     * @return acceptedDate
     */
    public java.util.Calendar getAcceptedDate() {
        return acceptedDate;
    }


    /**
     * Sets the acceptedDate value for this DefectSuite.
     * 
     * @param acceptedDate
     */
    public void setAcceptedDate(java.util.Calendar acceptedDate) {
        this.acceptedDate = acceptedDate;
    }


    /**
     * Gets the attachments value for this DefectSuite.
     * 
     * @return attachments
     */
    public com.rallydev.webservice.v1_10.domain.Attachment[] getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this DefectSuite.
     * 
     * @param attachments
     */
    public void setAttachments(com.rallydev.webservice.v1_10.domain.Attachment[] attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the blocked value for this DefectSuite.
     * 
     * @return blocked
     */
    public java.lang.Boolean getBlocked() {
        return blocked;
    }


    /**
     * Sets the blocked value for this DefectSuite.
     * 
     * @param blocked
     */
    public void setBlocked(java.lang.Boolean blocked) {
        this.blocked = blocked;
    }


    /**
     * Gets the defects value for this DefectSuite.
     * 
     * @return defects
     */
    public com.rallydev.webservice.v1_10.domain.Defect[] getDefects() {
        return defects;
    }


    /**
     * Sets the defects value for this DefectSuite.
     * 
     * @param defects
     */
    public void setDefects(com.rallydev.webservice.v1_10.domain.Defect[] defects) {
        this.defects = defects;
    }


    /**
     * Gets the iteration value for this DefectSuite.
     * 
     * @return iteration
     */
    public com.rallydev.webservice.v1_10.domain.Iteration getIteration() {
        return iteration;
    }


    /**
     * Sets the iteration value for this DefectSuite.
     * 
     * @param iteration
     */
    public void setIteration(com.rallydev.webservice.v1_10.domain.Iteration iteration) {
        this.iteration = iteration;
    }


    /**
     * Gets the _package value for this DefectSuite.
     * 
     * @return _package
     */
    public java.lang.String get_package() {
        return _package;
    }


    /**
     * Sets the _package value for this DefectSuite.
     * 
     * @param _package
     */
    public void set_package(java.lang.String _package) {
        this._package = _package;
    }


    /**
     * Gets the planEstimate value for this DefectSuite.
     * 
     * @return planEstimate
     */
    public java.lang.Double getPlanEstimate() {
        return planEstimate;
    }


    /**
     * Sets the planEstimate value for this DefectSuite.
     * 
     * @param planEstimate
     */
    public void setPlanEstimate(java.lang.Double planEstimate) {
        this.planEstimate = planEstimate;
    }


    /**
     * Gets the rank value for this DefectSuite.
     * 
     * @return rank
     */
    public java.lang.Double getRank() {
        return rank;
    }


    /**
     * Sets the rank value for this DefectSuite.
     * 
     * @param rank
     */
    public void setRank(java.lang.Double rank) {
        this.rank = rank;
    }


    /**
     * Gets the release value for this DefectSuite.
     * 
     * @return release
     */
    public com.rallydev.webservice.v1_10.domain.Release getRelease() {
        return release;
    }


    /**
     * Sets the release value for this DefectSuite.
     * 
     * @param release
     */
    public void setRelease(com.rallydev.webservice.v1_10.domain.Release release) {
        this.release = release;
    }


    /**
     * Gets the scheduleState value for this DefectSuite.
     * 
     * @return scheduleState
     */
    public java.lang.String getScheduleState() {
        return scheduleState;
    }


    /**
     * Sets the scheduleState value for this DefectSuite.
     * 
     * @param scheduleState
     */
    public void setScheduleState(java.lang.String scheduleState) {
        this.scheduleState = scheduleState;
    }


    /**
     * Gets the taskActualTotal value for this DefectSuite.
     * 
     * @return taskActualTotal
     */
    public java.lang.Double getTaskActualTotal() {
        return taskActualTotal;
    }


    /**
     * Sets the taskActualTotal value for this DefectSuite.
     * 
     * @param taskActualTotal
     */
    public void setTaskActualTotal(java.lang.Double taskActualTotal) {
        this.taskActualTotal = taskActualTotal;
    }


    /**
     * Gets the taskEstimateTotal value for this DefectSuite.
     * 
     * @return taskEstimateTotal
     */
    public java.lang.Double getTaskEstimateTotal() {
        return taskEstimateTotal;
    }


    /**
     * Sets the taskEstimateTotal value for this DefectSuite.
     * 
     * @param taskEstimateTotal
     */
    public void setTaskEstimateTotal(java.lang.Double taskEstimateTotal) {
        this.taskEstimateTotal = taskEstimateTotal;
    }


    /**
     * Gets the taskRemainingTotal value for this DefectSuite.
     * 
     * @return taskRemainingTotal
     */
    public java.lang.Double getTaskRemainingTotal() {
        return taskRemainingTotal;
    }


    /**
     * Sets the taskRemainingTotal value for this DefectSuite.
     * 
     * @param taskRemainingTotal
     */
    public void setTaskRemainingTotal(java.lang.Double taskRemainingTotal) {
        this.taskRemainingTotal = taskRemainingTotal;
    }


    /**
     * Gets the tasks value for this DefectSuite.
     * 
     * @return tasks
     */
    public com.rallydev.webservice.v1_10.domain.Task[] getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this DefectSuite.
     * 
     * @param tasks
     */
    public void setTasks(com.rallydev.webservice.v1_10.domain.Task[] tasks) {
        this.tasks = tasks;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DefectSuite)) return false;
        DefectSuite other = (DefectSuite) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.acceptedDate==null && other.getAcceptedDate()==null) || 
             (this.acceptedDate!=null &&
              this.acceptedDate.equals(other.getAcceptedDate()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              java.util.Arrays.equals(this.attachments, other.getAttachments()))) &&
            ((this.blocked==null && other.getBlocked()==null) || 
             (this.blocked!=null &&
              this.blocked.equals(other.getBlocked()))) &&
            ((this.defects==null && other.getDefects()==null) || 
             (this.defects!=null &&
              java.util.Arrays.equals(this.defects, other.getDefects()))) &&
            ((this.iteration==null && other.getIteration()==null) || 
             (this.iteration!=null &&
              this.iteration.equals(other.getIteration()))) &&
            ((this._package==null && other.get_package()==null) || 
             (this._package!=null &&
              this._package.equals(other.get_package()))) &&
            ((this.planEstimate==null && other.getPlanEstimate()==null) || 
             (this.planEstimate!=null &&
              this.planEstimate.equals(other.getPlanEstimate()))) &&
            ((this.rank==null && other.getRank()==null) || 
             (this.rank!=null &&
              this.rank.equals(other.getRank()))) &&
            ((this.release==null && other.getRelease()==null) || 
             (this.release!=null &&
              this.release.equals(other.getRelease()))) &&
            ((this.scheduleState==null && other.getScheduleState()==null) || 
             (this.scheduleState!=null &&
              this.scheduleState.equals(other.getScheduleState()))) &&
            ((this.taskActualTotal==null && other.getTaskActualTotal()==null) || 
             (this.taskActualTotal!=null &&
              this.taskActualTotal.equals(other.getTaskActualTotal()))) &&
            ((this.taskEstimateTotal==null && other.getTaskEstimateTotal()==null) || 
             (this.taskEstimateTotal!=null &&
              this.taskEstimateTotal.equals(other.getTaskEstimateTotal()))) &&
            ((this.taskRemainingTotal==null && other.getTaskRemainingTotal()==null) || 
             (this.taskRemainingTotal!=null &&
              this.taskRemainingTotal.equals(other.getTaskRemainingTotal()))) &&
            ((this.tasks==null && other.getTasks()==null) || 
             (this.tasks!=null &&
              java.util.Arrays.equals(this.tasks, other.getTasks())));
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
        if (getAcceptedDate() != null) {
            _hashCode += getAcceptedDate().hashCode();
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
        if (getDefects() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDefects());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDefects(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIteration() != null) {
            _hashCode += getIteration().hashCode();
        }
        if (get_package() != null) {
            _hashCode += get_package().hashCode();
        }
        if (getPlanEstimate() != null) {
            _hashCode += getPlanEstimate().hashCode();
        }
        if (getRank() != null) {
            _hashCode += getRank().hashCode();
        }
        if (getRelease() != null) {
            _hashCode += getRelease().hashCode();
        }
        if (getScheduleState() != null) {
            _hashCode += getScheduleState().hashCode();
        }
        if (getTaskActualTotal() != null) {
            _hashCode += getTaskActualTotal().hashCode();
        }
        if (getTaskEstimateTotal() != null) {
            _hashCode += getTaskEstimateTotal().hashCode();
        }
        if (getTaskRemainingTotal() != null) {
            _hashCode += getTaskRemainingTotal().hashCode();
        }
        if (getTasks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTasks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTasks(), i);
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
        new org.apache.axis.description.TypeDesc(DefectSuite.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "DefectSuite"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acceptedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AcceptedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("defects");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Defects"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Defect"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Defect"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iteration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Iteration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Iteration"));
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
        elemField.setFieldName("planEstimate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PlanEstimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("scheduleState");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ScheduleState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskActualTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TaskActualTotal"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskRemainingTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TaskRemainingTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tasks");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Tasks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Task"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Task"));
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
