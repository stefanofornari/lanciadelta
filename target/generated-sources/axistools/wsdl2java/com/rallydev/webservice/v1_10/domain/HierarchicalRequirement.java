/**
 * HierarchicalRequirement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rallydev.webservice.v1_10.domain;

public class HierarchicalRequirement  extends com.rallydev.webservice.v1_10.domain.Requirement  implements java.io.Serializable {
    private java.util.Calendar acceptedDate;

    private java.lang.Boolean blocked;

    private com.rallydev.webservice.v1_10.domain.HierarchicalRequirement[] children;

    private com.rallydev.webservice.v1_10.domain.Iteration iteration;

    private com.rallydev.webservice.v1_10.domain.HierarchicalRequirement parent;

    private java.lang.Double planEstimate;

    private com.rallydev.webservice.v1_10.domain.HierarchicalRequirement[] predecessors;

    private java.lang.Double rank;

    private com.rallydev.webservice.v1_10.domain.Release release;

    private java.lang.String scheduleState;

    private com.rallydev.webservice.v1_10.domain.HierarchicalRequirement[] successors;

    private java.lang.Double taskActualTotal;

    private java.lang.Double taskEstimateTotal;

    private java.lang.Double taskRemainingTotal;

    private com.rallydev.webservice.v1_10.domain.Task[] tasks;

    private java.lang.Long businessValue;

    private java.lang.String BV;

    private java.lang.String countachPRD;

    private java.lang.String devDone;

    private java.lang.String estimated;

    private java.lang.String funambolist;

    private java.lang.String requirement;

    private java.lang.String specialCode;

    private java.lang.String team;

    public HierarchicalRequirement() {
    }

    public HierarchicalRequirement(
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
           com.rallydev.webservice.v1_10.domain.Attachment[] attachments,
           java.lang.String _package,
           java.util.Calendar acceptedDate,
           java.lang.Boolean blocked,
           com.rallydev.webservice.v1_10.domain.HierarchicalRequirement[] children,
           com.rallydev.webservice.v1_10.domain.Iteration iteration,
           com.rallydev.webservice.v1_10.domain.HierarchicalRequirement parent,
           java.lang.Double planEstimate,
           com.rallydev.webservice.v1_10.domain.HierarchicalRequirement[] predecessors,
           java.lang.Double rank,
           com.rallydev.webservice.v1_10.domain.Release release,
           java.lang.String scheduleState,
           com.rallydev.webservice.v1_10.domain.HierarchicalRequirement[] successors,
           java.lang.Double taskActualTotal,
           java.lang.Double taskEstimateTotal,
           java.lang.Double taskRemainingTotal,
           com.rallydev.webservice.v1_10.domain.Task[] tasks,
           java.lang.Long businessValue,
           java.lang.String BV,
           java.lang.String countachPRD,
           java.lang.String devDone,
           java.lang.String estimated,
           java.lang.String funambolist,
           java.lang.String requirement,
           java.lang.String specialCode,
           java.lang.String team) {
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
            revisionHistory,
            attachments,
            _package);
        this.acceptedDate = acceptedDate;
        this.blocked = blocked;
        this.children = children;
        this.iteration = iteration;
        this.parent = parent;
        this.planEstimate = planEstimate;
        this.predecessors = predecessors;
        this.rank = rank;
        this.release = release;
        this.scheduleState = scheduleState;
        this.successors = successors;
        this.taskActualTotal = taskActualTotal;
        this.taskEstimateTotal = taskEstimateTotal;
        this.taskRemainingTotal = taskRemainingTotal;
        this.tasks = tasks;
        this.businessValue = businessValue;
        this.BV = BV;
        this.countachPRD = countachPRD;
        this.devDone = devDone;
        this.estimated = estimated;
        this.funambolist = funambolist;
        this.requirement = requirement;
        this.specialCode = specialCode;
        this.team = team;
    }


    /**
     * Gets the acceptedDate value for this HierarchicalRequirement.
     * 
     * @return acceptedDate
     */
    public java.util.Calendar getAcceptedDate() {
        return acceptedDate;
    }


    /**
     * Sets the acceptedDate value for this HierarchicalRequirement.
     * 
     * @param acceptedDate
     */
    public void setAcceptedDate(java.util.Calendar acceptedDate) {
        this.acceptedDate = acceptedDate;
    }


    /**
     * Gets the blocked value for this HierarchicalRequirement.
     * 
     * @return blocked
     */
    public java.lang.Boolean getBlocked() {
        return blocked;
    }


    /**
     * Sets the blocked value for this HierarchicalRequirement.
     * 
     * @param blocked
     */
    public void setBlocked(java.lang.Boolean blocked) {
        this.blocked = blocked;
    }


    /**
     * Gets the children value for this HierarchicalRequirement.
     * 
     * @return children
     */
    public com.rallydev.webservice.v1_10.domain.HierarchicalRequirement[] getChildren() {
        return children;
    }


    /**
     * Sets the children value for this HierarchicalRequirement.
     * 
     * @param children
     */
    public void setChildren(com.rallydev.webservice.v1_10.domain.HierarchicalRequirement[] children) {
        this.children = children;
    }


    /**
     * Gets the iteration value for this HierarchicalRequirement.
     * 
     * @return iteration
     */
    public com.rallydev.webservice.v1_10.domain.Iteration getIteration() {
        return iteration;
    }


    /**
     * Sets the iteration value for this HierarchicalRequirement.
     * 
     * @param iteration
     */
    public void setIteration(com.rallydev.webservice.v1_10.domain.Iteration iteration) {
        this.iteration = iteration;
    }


    /**
     * Gets the parent value for this HierarchicalRequirement.
     * 
     * @return parent
     */
    public com.rallydev.webservice.v1_10.domain.HierarchicalRequirement getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this HierarchicalRequirement.
     * 
     * @param parent
     */
    public void setParent(com.rallydev.webservice.v1_10.domain.HierarchicalRequirement parent) {
        this.parent = parent;
    }


    /**
     * Gets the planEstimate value for this HierarchicalRequirement.
     * 
     * @return planEstimate
     */
    public java.lang.Double getPlanEstimate() {
        return planEstimate;
    }


    /**
     * Sets the planEstimate value for this HierarchicalRequirement.
     * 
     * @param planEstimate
     */
    public void setPlanEstimate(java.lang.Double planEstimate) {
        this.planEstimate = planEstimate;
    }


    /**
     * Gets the predecessors value for this HierarchicalRequirement.
     * 
     * @return predecessors
     */
    public com.rallydev.webservice.v1_10.domain.HierarchicalRequirement[] getPredecessors() {
        return predecessors;
    }


    /**
     * Sets the predecessors value for this HierarchicalRequirement.
     * 
     * @param predecessors
     */
    public void setPredecessors(com.rallydev.webservice.v1_10.domain.HierarchicalRequirement[] predecessors) {
        this.predecessors = predecessors;
    }


    /**
     * Gets the rank value for this HierarchicalRequirement.
     * 
     * @return rank
     */
    public java.lang.Double getRank() {
        return rank;
    }


    /**
     * Sets the rank value for this HierarchicalRequirement.
     * 
     * @param rank
     */
    public void setRank(java.lang.Double rank) {
        this.rank = rank;
    }


    /**
     * Gets the release value for this HierarchicalRequirement.
     * 
     * @return release
     */
    public com.rallydev.webservice.v1_10.domain.Release getRelease() {
        return release;
    }


    /**
     * Sets the release value for this HierarchicalRequirement.
     * 
     * @param release
     */
    public void setRelease(com.rallydev.webservice.v1_10.domain.Release release) {
        this.release = release;
    }


    /**
     * Gets the scheduleState value for this HierarchicalRequirement.
     * 
     * @return scheduleState
     */
    public java.lang.String getScheduleState() {
        return scheduleState;
    }


    /**
     * Sets the scheduleState value for this HierarchicalRequirement.
     * 
     * @param scheduleState
     */
    public void setScheduleState(java.lang.String scheduleState) {
        this.scheduleState = scheduleState;
    }


    /**
     * Gets the successors value for this HierarchicalRequirement.
     * 
     * @return successors
     */
    public com.rallydev.webservice.v1_10.domain.HierarchicalRequirement[] getSuccessors() {
        return successors;
    }


    /**
     * Sets the successors value for this HierarchicalRequirement.
     * 
     * @param successors
     */
    public void setSuccessors(com.rallydev.webservice.v1_10.domain.HierarchicalRequirement[] successors) {
        this.successors = successors;
    }


    /**
     * Gets the taskActualTotal value for this HierarchicalRequirement.
     * 
     * @return taskActualTotal
     */
    public java.lang.Double getTaskActualTotal() {
        return taskActualTotal;
    }


    /**
     * Sets the taskActualTotal value for this HierarchicalRequirement.
     * 
     * @param taskActualTotal
     */
    public void setTaskActualTotal(java.lang.Double taskActualTotal) {
        this.taskActualTotal = taskActualTotal;
    }


    /**
     * Gets the taskEstimateTotal value for this HierarchicalRequirement.
     * 
     * @return taskEstimateTotal
     */
    public java.lang.Double getTaskEstimateTotal() {
        return taskEstimateTotal;
    }


    /**
     * Sets the taskEstimateTotal value for this HierarchicalRequirement.
     * 
     * @param taskEstimateTotal
     */
    public void setTaskEstimateTotal(java.lang.Double taskEstimateTotal) {
        this.taskEstimateTotal = taskEstimateTotal;
    }


    /**
     * Gets the taskRemainingTotal value for this HierarchicalRequirement.
     * 
     * @return taskRemainingTotal
     */
    public java.lang.Double getTaskRemainingTotal() {
        return taskRemainingTotal;
    }


    /**
     * Sets the taskRemainingTotal value for this HierarchicalRequirement.
     * 
     * @param taskRemainingTotal
     */
    public void setTaskRemainingTotal(java.lang.Double taskRemainingTotal) {
        this.taskRemainingTotal = taskRemainingTotal;
    }


    /**
     * Gets the tasks value for this HierarchicalRequirement.
     * 
     * @return tasks
     */
    public com.rallydev.webservice.v1_10.domain.Task[] getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this HierarchicalRequirement.
     * 
     * @param tasks
     */
    public void setTasks(com.rallydev.webservice.v1_10.domain.Task[] tasks) {
        this.tasks = tasks;
    }


    /**
     * Gets the businessValue value for this HierarchicalRequirement.
     * 
     * @return businessValue
     */
    public java.lang.Long getBusinessValue() {
        return businessValue;
    }


    /**
     * Sets the businessValue value for this HierarchicalRequirement.
     * 
     * @param businessValue
     */
    public void setBusinessValue(java.lang.Long businessValue) {
        this.businessValue = businessValue;
    }


    /**
     * Gets the BV value for this HierarchicalRequirement.
     * 
     * @return BV
     */
    public java.lang.String getBV() {
        return BV;
    }


    /**
     * Sets the BV value for this HierarchicalRequirement.
     * 
     * @param BV
     */
    public void setBV(java.lang.String BV) {
        this.BV = BV;
    }


    /**
     * Gets the countachPRD value for this HierarchicalRequirement.
     * 
     * @return countachPRD
     */
    public java.lang.String getCountachPRD() {
        return countachPRD;
    }


    /**
     * Sets the countachPRD value for this HierarchicalRequirement.
     * 
     * @param countachPRD
     */
    public void setCountachPRD(java.lang.String countachPRD) {
        this.countachPRD = countachPRD;
    }


    /**
     * Gets the devDone value for this HierarchicalRequirement.
     * 
     * @return devDone
     */
    public java.lang.String getDevDone() {
        return devDone;
    }


    /**
     * Sets the devDone value for this HierarchicalRequirement.
     * 
     * @param devDone
     */
    public void setDevDone(java.lang.String devDone) {
        this.devDone = devDone;
    }


    /**
     * Gets the estimated value for this HierarchicalRequirement.
     * 
     * @return estimated
     */
    public java.lang.String getEstimated() {
        return estimated;
    }


    /**
     * Sets the estimated value for this HierarchicalRequirement.
     * 
     * @param estimated
     */
    public void setEstimated(java.lang.String estimated) {
        this.estimated = estimated;
    }


    /**
     * Gets the funambolist value for this HierarchicalRequirement.
     * 
     * @return funambolist
     */
    public java.lang.String getFunambolist() {
        return funambolist;
    }


    /**
     * Sets the funambolist value for this HierarchicalRequirement.
     * 
     * @param funambolist
     */
    public void setFunambolist(java.lang.String funambolist) {
        this.funambolist = funambolist;
    }


    /**
     * Gets the requirement value for this HierarchicalRequirement.
     * 
     * @return requirement
     */
    public java.lang.String getRequirement() {
        return requirement;
    }


    /**
     * Sets the requirement value for this HierarchicalRequirement.
     * 
     * @param requirement
     */
    public void setRequirement(java.lang.String requirement) {
        this.requirement = requirement;
    }


    /**
     * Gets the specialCode value for this HierarchicalRequirement.
     * 
     * @return specialCode
     */
    public java.lang.String getSpecialCode() {
        return specialCode;
    }


    /**
     * Sets the specialCode value for this HierarchicalRequirement.
     * 
     * @param specialCode
     */
    public void setSpecialCode(java.lang.String specialCode) {
        this.specialCode = specialCode;
    }


    /**
     * Gets the team value for this HierarchicalRequirement.
     * 
     * @return team
     */
    public java.lang.String getTeam() {
        return team;
    }


    /**
     * Sets the team value for this HierarchicalRequirement.
     * 
     * @param team
     */
    public void setTeam(java.lang.String team) {
        this.team = team;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HierarchicalRequirement)) return false;
        HierarchicalRequirement other = (HierarchicalRequirement) obj;
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
            ((this.blocked==null && other.getBlocked()==null) || 
             (this.blocked!=null &&
              this.blocked.equals(other.getBlocked()))) &&
            ((this.children==null && other.getChildren()==null) || 
             (this.children!=null &&
              java.util.Arrays.equals(this.children, other.getChildren()))) &&
            ((this.iteration==null && other.getIteration()==null) || 
             (this.iteration!=null &&
              this.iteration.equals(other.getIteration()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
            ((this.planEstimate==null && other.getPlanEstimate()==null) || 
             (this.planEstimate!=null &&
              this.planEstimate.equals(other.getPlanEstimate()))) &&
            ((this.predecessors==null && other.getPredecessors()==null) || 
             (this.predecessors!=null &&
              java.util.Arrays.equals(this.predecessors, other.getPredecessors()))) &&
            ((this.rank==null && other.getRank()==null) || 
             (this.rank!=null &&
              this.rank.equals(other.getRank()))) &&
            ((this.release==null && other.getRelease()==null) || 
             (this.release!=null &&
              this.release.equals(other.getRelease()))) &&
            ((this.scheduleState==null && other.getScheduleState()==null) || 
             (this.scheduleState!=null &&
              this.scheduleState.equals(other.getScheduleState()))) &&
            ((this.successors==null && other.getSuccessors()==null) || 
             (this.successors!=null &&
              java.util.Arrays.equals(this.successors, other.getSuccessors()))) &&
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
              java.util.Arrays.equals(this.tasks, other.getTasks()))) &&
            ((this.businessValue==null && other.getBusinessValue()==null) || 
             (this.businessValue!=null &&
              this.businessValue.equals(other.getBusinessValue()))) &&
            ((this.BV==null && other.getBV()==null) || 
             (this.BV!=null &&
              this.BV.equals(other.getBV()))) &&
            ((this.countachPRD==null && other.getCountachPRD()==null) || 
             (this.countachPRD!=null &&
              this.countachPRD.equals(other.getCountachPRD()))) &&
            ((this.devDone==null && other.getDevDone()==null) || 
             (this.devDone!=null &&
              this.devDone.equals(other.getDevDone()))) &&
            ((this.estimated==null && other.getEstimated()==null) || 
             (this.estimated!=null &&
              this.estimated.equals(other.getEstimated()))) &&
            ((this.funambolist==null && other.getFunambolist()==null) || 
             (this.funambolist!=null &&
              this.funambolist.equals(other.getFunambolist()))) &&
            ((this.requirement==null && other.getRequirement()==null) || 
             (this.requirement!=null &&
              this.requirement.equals(other.getRequirement()))) &&
            ((this.specialCode==null && other.getSpecialCode()==null) || 
             (this.specialCode!=null &&
              this.specialCode.equals(other.getSpecialCode()))) &&
            ((this.team==null && other.getTeam()==null) || 
             (this.team!=null &&
              this.team.equals(other.getTeam())));
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
        if (getBlocked() != null) {
            _hashCode += getBlocked().hashCode();
        }
        if (getChildren() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChildren());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChildren(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIteration() != null) {
            _hashCode += getIteration().hashCode();
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        if (getPlanEstimate() != null) {
            _hashCode += getPlanEstimate().hashCode();
        }
        if (getPredecessors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPredecessors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPredecessors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getSuccessors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSuccessors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSuccessors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getBusinessValue() != null) {
            _hashCode += getBusinessValue().hashCode();
        }
        if (getBV() != null) {
            _hashCode += getBV().hashCode();
        }
        if (getCountachPRD() != null) {
            _hashCode += getCountachPRD().hashCode();
        }
        if (getDevDone() != null) {
            _hashCode += getDevDone().hashCode();
        }
        if (getEstimated() != null) {
            _hashCode += getEstimated().hashCode();
        }
        if (getFunambolist() != null) {
            _hashCode += getFunambolist().hashCode();
        }
        if (getRequirement() != null) {
            _hashCode += getRequirement().hashCode();
        }
        if (getSpecialCode() != null) {
            _hashCode += getSpecialCode().hashCode();
        }
        if (getTeam() != null) {
            _hashCode += getTeam().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HierarchicalRequirement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "HierarchicalRequirement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acceptedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AcceptedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blocked");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Blocked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("children");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Children"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "HierarchicalRequirement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "HierarchicalRequirement"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iteration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Iteration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Iteration"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "HierarchicalRequirement"));
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
        elemField.setFieldName("predecessors");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Predecessors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "HierarchicalRequirement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "HierarchicalRequirement"));
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
        elemField.setFieldName("successors");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Successors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "HierarchicalRequirement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "HierarchicalRequirement"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BusinessValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BV");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BV"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countachPRD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CountachPRD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("devDone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DevDone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Estimated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("funambolist");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Funambolist"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requirement");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Requirement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SpecialCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("team");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Team"));
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
