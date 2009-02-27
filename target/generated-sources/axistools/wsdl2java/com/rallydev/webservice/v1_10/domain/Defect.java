/**
 * Defect.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rallydev.webservice.v1_10.domain;

public class Defect  extends com.rallydev.webservice.v1_10.domain.Artifact  implements java.io.Serializable {
    private java.util.Calendar acceptedDate;

    private java.lang.Boolean affectsDoc;

    private com.rallydev.webservice.v1_10.domain.Attachment[] attachments;

    private java.lang.Boolean blocked;

    private java.util.Calendar closedDate;

    private com.rallydev.webservice.v1_10.domain.Defect[] duplicates;

    private java.lang.String environment;

    private java.lang.String fixedInBuild;

    private java.lang.String foundInBuild;

    private com.rallydev.webservice.v1_10.domain.Iteration iteration;

    private java.util.Calendar openedDate;

    private java.lang.String _package;

    private java.lang.Double planEstimate;

    private java.lang.String priority;

    private java.lang.Double rank;

    private com.rallydev.webservice.v1_10.domain.Release release;

    private java.lang.Boolean releaseNote;

    private com.rallydev.webservice.v1_10.domain.Requirement requirement;

    private java.lang.String resolution;

    private java.lang.String salesforceCaseID;

    private java.lang.String salesforceCaseNumber;

    private java.lang.String scheduleState;

    private java.lang.String severity;

    private java.lang.String state;

    private java.lang.String submittedBy;

    private java.lang.String targetBuild;

    private java.util.Calendar targetDate;

    private java.lang.Double taskActualTotal;

    private java.lang.Double taskEstimateTotal;

    private java.lang.Double taskRemainingTotal;

    private com.rallydev.webservice.v1_10.domain.Task[] tasks;

    private com.rallydev.webservice.v1_10.domain.TestCase testCase;

    private com.rallydev.webservice.v1_10.domain.TestCaseResult testCaseResult;

    private java.lang.String verifiedInBuild;

    private com.rallydev.webservice.v1_10.domain.WebLink bugzilla;

    private java.lang.Long businessValue;

    private java.lang.String BV;

    private java.lang.String estimated;

    public Defect() {
    }

    public Defect(
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
           java.lang.Boolean affectsDoc,
           com.rallydev.webservice.v1_10.domain.Attachment[] attachments,
           java.lang.Boolean blocked,
           java.util.Calendar closedDate,
           com.rallydev.webservice.v1_10.domain.Defect[] duplicates,
           java.lang.String environment,
           java.lang.String fixedInBuild,
           java.lang.String foundInBuild,
           com.rallydev.webservice.v1_10.domain.Iteration iteration,
           java.util.Calendar openedDate,
           java.lang.String _package,
           java.lang.Double planEstimate,
           java.lang.String priority,
           java.lang.Double rank,
           com.rallydev.webservice.v1_10.domain.Release release,
           java.lang.Boolean releaseNote,
           com.rallydev.webservice.v1_10.domain.Requirement requirement,
           java.lang.String resolution,
           java.lang.String salesforceCaseID,
           java.lang.String salesforceCaseNumber,
           java.lang.String scheduleState,
           java.lang.String severity,
           java.lang.String state,
           java.lang.String submittedBy,
           java.lang.String targetBuild,
           java.util.Calendar targetDate,
           java.lang.Double taskActualTotal,
           java.lang.Double taskEstimateTotal,
           java.lang.Double taskRemainingTotal,
           com.rallydev.webservice.v1_10.domain.Task[] tasks,
           com.rallydev.webservice.v1_10.domain.TestCase testCase,
           com.rallydev.webservice.v1_10.domain.TestCaseResult testCaseResult,
           java.lang.String verifiedInBuild,
           com.rallydev.webservice.v1_10.domain.WebLink bugzilla,
           java.lang.Long businessValue,
           java.lang.String BV,
           java.lang.String estimated) {
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
        this.affectsDoc = affectsDoc;
        this.attachments = attachments;
        this.blocked = blocked;
        this.closedDate = closedDate;
        this.duplicates = duplicates;
        this.environment = environment;
        this.fixedInBuild = fixedInBuild;
        this.foundInBuild = foundInBuild;
        this.iteration = iteration;
        this.openedDate = openedDate;
        this._package = _package;
        this.planEstimate = planEstimate;
        this.priority = priority;
        this.rank = rank;
        this.release = release;
        this.releaseNote = releaseNote;
        this.requirement = requirement;
        this.resolution = resolution;
        this.salesforceCaseID = salesforceCaseID;
        this.salesforceCaseNumber = salesforceCaseNumber;
        this.scheduleState = scheduleState;
        this.severity = severity;
        this.state = state;
        this.submittedBy = submittedBy;
        this.targetBuild = targetBuild;
        this.targetDate = targetDate;
        this.taskActualTotal = taskActualTotal;
        this.taskEstimateTotal = taskEstimateTotal;
        this.taskRemainingTotal = taskRemainingTotal;
        this.tasks = tasks;
        this.testCase = testCase;
        this.testCaseResult = testCaseResult;
        this.verifiedInBuild = verifiedInBuild;
        this.bugzilla = bugzilla;
        this.businessValue = businessValue;
        this.BV = BV;
        this.estimated = estimated;
    }


    /**
     * Gets the acceptedDate value for this Defect.
     * 
     * @return acceptedDate
     */
    public java.util.Calendar getAcceptedDate() {
        return acceptedDate;
    }


    /**
     * Sets the acceptedDate value for this Defect.
     * 
     * @param acceptedDate
     */
    public void setAcceptedDate(java.util.Calendar acceptedDate) {
        this.acceptedDate = acceptedDate;
    }


    /**
     * Gets the affectsDoc value for this Defect.
     * 
     * @return affectsDoc
     */
    public java.lang.Boolean getAffectsDoc() {
        return affectsDoc;
    }


    /**
     * Sets the affectsDoc value for this Defect.
     * 
     * @param affectsDoc
     */
    public void setAffectsDoc(java.lang.Boolean affectsDoc) {
        this.affectsDoc = affectsDoc;
    }


    /**
     * Gets the attachments value for this Defect.
     * 
     * @return attachments
     */
    public com.rallydev.webservice.v1_10.domain.Attachment[] getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Defect.
     * 
     * @param attachments
     */
    public void setAttachments(com.rallydev.webservice.v1_10.domain.Attachment[] attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the blocked value for this Defect.
     * 
     * @return blocked
     */
    public java.lang.Boolean getBlocked() {
        return blocked;
    }


    /**
     * Sets the blocked value for this Defect.
     * 
     * @param blocked
     */
    public void setBlocked(java.lang.Boolean blocked) {
        this.blocked = blocked;
    }


    /**
     * Gets the closedDate value for this Defect.
     * 
     * @return closedDate
     */
    public java.util.Calendar getClosedDate() {
        return closedDate;
    }


    /**
     * Sets the closedDate value for this Defect.
     * 
     * @param closedDate
     */
    public void setClosedDate(java.util.Calendar closedDate) {
        this.closedDate = closedDate;
    }


    /**
     * Gets the duplicates value for this Defect.
     * 
     * @return duplicates
     */
    public com.rallydev.webservice.v1_10.domain.Defect[] getDuplicates() {
        return duplicates;
    }


    /**
     * Sets the duplicates value for this Defect.
     * 
     * @param duplicates
     */
    public void setDuplicates(com.rallydev.webservice.v1_10.domain.Defect[] duplicates) {
        this.duplicates = duplicates;
    }


    /**
     * Gets the environment value for this Defect.
     * 
     * @return environment
     */
    public java.lang.String getEnvironment() {
        return environment;
    }


    /**
     * Sets the environment value for this Defect.
     * 
     * @param environment
     */
    public void setEnvironment(java.lang.String environment) {
        this.environment = environment;
    }


    /**
     * Gets the fixedInBuild value for this Defect.
     * 
     * @return fixedInBuild
     */
    public java.lang.String getFixedInBuild() {
        return fixedInBuild;
    }


    /**
     * Sets the fixedInBuild value for this Defect.
     * 
     * @param fixedInBuild
     */
    public void setFixedInBuild(java.lang.String fixedInBuild) {
        this.fixedInBuild = fixedInBuild;
    }


    /**
     * Gets the foundInBuild value for this Defect.
     * 
     * @return foundInBuild
     */
    public java.lang.String getFoundInBuild() {
        return foundInBuild;
    }


    /**
     * Sets the foundInBuild value for this Defect.
     * 
     * @param foundInBuild
     */
    public void setFoundInBuild(java.lang.String foundInBuild) {
        this.foundInBuild = foundInBuild;
    }


    /**
     * Gets the iteration value for this Defect.
     * 
     * @return iteration
     */
    public com.rallydev.webservice.v1_10.domain.Iteration getIteration() {
        return iteration;
    }


    /**
     * Sets the iteration value for this Defect.
     * 
     * @param iteration
     */
    public void setIteration(com.rallydev.webservice.v1_10.domain.Iteration iteration) {
        this.iteration = iteration;
    }


    /**
     * Gets the openedDate value for this Defect.
     * 
     * @return openedDate
     */
    public java.util.Calendar getOpenedDate() {
        return openedDate;
    }


    /**
     * Sets the openedDate value for this Defect.
     * 
     * @param openedDate
     */
    public void setOpenedDate(java.util.Calendar openedDate) {
        this.openedDate = openedDate;
    }


    /**
     * Gets the _package value for this Defect.
     * 
     * @return _package
     */
    public java.lang.String get_package() {
        return _package;
    }


    /**
     * Sets the _package value for this Defect.
     * 
     * @param _package
     */
    public void set_package(java.lang.String _package) {
        this._package = _package;
    }


    /**
     * Gets the planEstimate value for this Defect.
     * 
     * @return planEstimate
     */
    public java.lang.Double getPlanEstimate() {
        return planEstimate;
    }


    /**
     * Sets the planEstimate value for this Defect.
     * 
     * @param planEstimate
     */
    public void setPlanEstimate(java.lang.Double planEstimate) {
        this.planEstimate = planEstimate;
    }


    /**
     * Gets the priority value for this Defect.
     * 
     * @return priority
     */
    public java.lang.String getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Defect.
     * 
     * @param priority
     */
    public void setPriority(java.lang.String priority) {
        this.priority = priority;
    }


    /**
     * Gets the rank value for this Defect.
     * 
     * @return rank
     */
    public java.lang.Double getRank() {
        return rank;
    }


    /**
     * Sets the rank value for this Defect.
     * 
     * @param rank
     */
    public void setRank(java.lang.Double rank) {
        this.rank = rank;
    }


    /**
     * Gets the release value for this Defect.
     * 
     * @return release
     */
    public com.rallydev.webservice.v1_10.domain.Release getRelease() {
        return release;
    }


    /**
     * Sets the release value for this Defect.
     * 
     * @param release
     */
    public void setRelease(com.rallydev.webservice.v1_10.domain.Release release) {
        this.release = release;
    }


    /**
     * Gets the releaseNote value for this Defect.
     * 
     * @return releaseNote
     */
    public java.lang.Boolean getReleaseNote() {
        return releaseNote;
    }


    /**
     * Sets the releaseNote value for this Defect.
     * 
     * @param releaseNote
     */
    public void setReleaseNote(java.lang.Boolean releaseNote) {
        this.releaseNote = releaseNote;
    }


    /**
     * Gets the requirement value for this Defect.
     * 
     * @return requirement
     */
    public com.rallydev.webservice.v1_10.domain.Requirement getRequirement() {
        return requirement;
    }


    /**
     * Sets the requirement value for this Defect.
     * 
     * @param requirement
     */
    public void setRequirement(com.rallydev.webservice.v1_10.domain.Requirement requirement) {
        this.requirement = requirement;
    }


    /**
     * Gets the resolution value for this Defect.
     * 
     * @return resolution
     */
    public java.lang.String getResolution() {
        return resolution;
    }


    /**
     * Sets the resolution value for this Defect.
     * 
     * @param resolution
     */
    public void setResolution(java.lang.String resolution) {
        this.resolution = resolution;
    }


    /**
     * Gets the salesforceCaseID value for this Defect.
     * 
     * @return salesforceCaseID
     */
    public java.lang.String getSalesforceCaseID() {
        return salesforceCaseID;
    }


    /**
     * Sets the salesforceCaseID value for this Defect.
     * 
     * @param salesforceCaseID
     */
    public void setSalesforceCaseID(java.lang.String salesforceCaseID) {
        this.salesforceCaseID = salesforceCaseID;
    }


    /**
     * Gets the salesforceCaseNumber value for this Defect.
     * 
     * @return salesforceCaseNumber
     */
    public java.lang.String getSalesforceCaseNumber() {
        return salesforceCaseNumber;
    }


    /**
     * Sets the salesforceCaseNumber value for this Defect.
     * 
     * @param salesforceCaseNumber
     */
    public void setSalesforceCaseNumber(java.lang.String salesforceCaseNumber) {
        this.salesforceCaseNumber = salesforceCaseNumber;
    }


    /**
     * Gets the scheduleState value for this Defect.
     * 
     * @return scheduleState
     */
    public java.lang.String getScheduleState() {
        return scheduleState;
    }


    /**
     * Sets the scheduleState value for this Defect.
     * 
     * @param scheduleState
     */
    public void setScheduleState(java.lang.String scheduleState) {
        this.scheduleState = scheduleState;
    }


    /**
     * Gets the severity value for this Defect.
     * 
     * @return severity
     */
    public java.lang.String getSeverity() {
        return severity;
    }


    /**
     * Sets the severity value for this Defect.
     * 
     * @param severity
     */
    public void setSeverity(java.lang.String severity) {
        this.severity = severity;
    }


    /**
     * Gets the state value for this Defect.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Defect.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the submittedBy value for this Defect.
     * 
     * @return submittedBy
     */
    public java.lang.String getSubmittedBy() {
        return submittedBy;
    }


    /**
     * Sets the submittedBy value for this Defect.
     * 
     * @param submittedBy
     */
    public void setSubmittedBy(java.lang.String submittedBy) {
        this.submittedBy = submittedBy;
    }


    /**
     * Gets the targetBuild value for this Defect.
     * 
     * @return targetBuild
     */
    public java.lang.String getTargetBuild() {
        return targetBuild;
    }


    /**
     * Sets the targetBuild value for this Defect.
     * 
     * @param targetBuild
     */
    public void setTargetBuild(java.lang.String targetBuild) {
        this.targetBuild = targetBuild;
    }


    /**
     * Gets the targetDate value for this Defect.
     * 
     * @return targetDate
     */
    public java.util.Calendar getTargetDate() {
        return targetDate;
    }


    /**
     * Sets the targetDate value for this Defect.
     * 
     * @param targetDate
     */
    public void setTargetDate(java.util.Calendar targetDate) {
        this.targetDate = targetDate;
    }


    /**
     * Gets the taskActualTotal value for this Defect.
     * 
     * @return taskActualTotal
     */
    public java.lang.Double getTaskActualTotal() {
        return taskActualTotal;
    }


    /**
     * Sets the taskActualTotal value for this Defect.
     * 
     * @param taskActualTotal
     */
    public void setTaskActualTotal(java.lang.Double taskActualTotal) {
        this.taskActualTotal = taskActualTotal;
    }


    /**
     * Gets the taskEstimateTotal value for this Defect.
     * 
     * @return taskEstimateTotal
     */
    public java.lang.Double getTaskEstimateTotal() {
        return taskEstimateTotal;
    }


    /**
     * Sets the taskEstimateTotal value for this Defect.
     * 
     * @param taskEstimateTotal
     */
    public void setTaskEstimateTotal(java.lang.Double taskEstimateTotal) {
        this.taskEstimateTotal = taskEstimateTotal;
    }


    /**
     * Gets the taskRemainingTotal value for this Defect.
     * 
     * @return taskRemainingTotal
     */
    public java.lang.Double getTaskRemainingTotal() {
        return taskRemainingTotal;
    }


    /**
     * Sets the taskRemainingTotal value for this Defect.
     * 
     * @param taskRemainingTotal
     */
    public void setTaskRemainingTotal(java.lang.Double taskRemainingTotal) {
        this.taskRemainingTotal = taskRemainingTotal;
    }


    /**
     * Gets the tasks value for this Defect.
     * 
     * @return tasks
     */
    public com.rallydev.webservice.v1_10.domain.Task[] getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this Defect.
     * 
     * @param tasks
     */
    public void setTasks(com.rallydev.webservice.v1_10.domain.Task[] tasks) {
        this.tasks = tasks;
    }


    /**
     * Gets the testCase value for this Defect.
     * 
     * @return testCase
     */
    public com.rallydev.webservice.v1_10.domain.TestCase getTestCase() {
        return testCase;
    }


    /**
     * Sets the testCase value for this Defect.
     * 
     * @param testCase
     */
    public void setTestCase(com.rallydev.webservice.v1_10.domain.TestCase testCase) {
        this.testCase = testCase;
    }


    /**
     * Gets the testCaseResult value for this Defect.
     * 
     * @return testCaseResult
     */
    public com.rallydev.webservice.v1_10.domain.TestCaseResult getTestCaseResult() {
        return testCaseResult;
    }


    /**
     * Sets the testCaseResult value for this Defect.
     * 
     * @param testCaseResult
     */
    public void setTestCaseResult(com.rallydev.webservice.v1_10.domain.TestCaseResult testCaseResult) {
        this.testCaseResult = testCaseResult;
    }


    /**
     * Gets the verifiedInBuild value for this Defect.
     * 
     * @return verifiedInBuild
     */
    public java.lang.String getVerifiedInBuild() {
        return verifiedInBuild;
    }


    /**
     * Sets the verifiedInBuild value for this Defect.
     * 
     * @param verifiedInBuild
     */
    public void setVerifiedInBuild(java.lang.String verifiedInBuild) {
        this.verifiedInBuild = verifiedInBuild;
    }


    /**
     * Gets the bugzilla value for this Defect.
     * 
     * @return bugzilla
     */
    public com.rallydev.webservice.v1_10.domain.WebLink getBugzilla() {
        return bugzilla;
    }


    /**
     * Sets the bugzilla value for this Defect.
     * 
     * @param bugzilla
     */
    public void setBugzilla(com.rallydev.webservice.v1_10.domain.WebLink bugzilla) {
        this.bugzilla = bugzilla;
    }


    /**
     * Gets the businessValue value for this Defect.
     * 
     * @return businessValue
     */
    public java.lang.Long getBusinessValue() {
        return businessValue;
    }


    /**
     * Sets the businessValue value for this Defect.
     * 
     * @param businessValue
     */
    public void setBusinessValue(java.lang.Long businessValue) {
        this.businessValue = businessValue;
    }


    /**
     * Gets the BV value for this Defect.
     * 
     * @return BV
     */
    public java.lang.String getBV() {
        return BV;
    }


    /**
     * Sets the BV value for this Defect.
     * 
     * @param BV
     */
    public void setBV(java.lang.String BV) {
        this.BV = BV;
    }


    /**
     * Gets the estimated value for this Defect.
     * 
     * @return estimated
     */
    public java.lang.String getEstimated() {
        return estimated;
    }


    /**
     * Sets the estimated value for this Defect.
     * 
     * @param estimated
     */
    public void setEstimated(java.lang.String estimated) {
        this.estimated = estimated;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Defect)) return false;
        Defect other = (Defect) obj;
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
            ((this.affectsDoc==null && other.getAffectsDoc()==null) || 
             (this.affectsDoc!=null &&
              this.affectsDoc.equals(other.getAffectsDoc()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              java.util.Arrays.equals(this.attachments, other.getAttachments()))) &&
            ((this.blocked==null && other.getBlocked()==null) || 
             (this.blocked!=null &&
              this.blocked.equals(other.getBlocked()))) &&
            ((this.closedDate==null && other.getClosedDate()==null) || 
             (this.closedDate!=null &&
              this.closedDate.equals(other.getClosedDate()))) &&
            ((this.duplicates==null && other.getDuplicates()==null) || 
             (this.duplicates!=null &&
              java.util.Arrays.equals(this.duplicates, other.getDuplicates()))) &&
            ((this.environment==null && other.getEnvironment()==null) || 
             (this.environment!=null &&
              this.environment.equals(other.getEnvironment()))) &&
            ((this.fixedInBuild==null && other.getFixedInBuild()==null) || 
             (this.fixedInBuild!=null &&
              this.fixedInBuild.equals(other.getFixedInBuild()))) &&
            ((this.foundInBuild==null && other.getFoundInBuild()==null) || 
             (this.foundInBuild!=null &&
              this.foundInBuild.equals(other.getFoundInBuild()))) &&
            ((this.iteration==null && other.getIteration()==null) || 
             (this.iteration!=null &&
              this.iteration.equals(other.getIteration()))) &&
            ((this.openedDate==null && other.getOpenedDate()==null) || 
             (this.openedDate!=null &&
              this.openedDate.equals(other.getOpenedDate()))) &&
            ((this._package==null && other.get_package()==null) || 
             (this._package!=null &&
              this._package.equals(other.get_package()))) &&
            ((this.planEstimate==null && other.getPlanEstimate()==null) || 
             (this.planEstimate!=null &&
              this.planEstimate.equals(other.getPlanEstimate()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.rank==null && other.getRank()==null) || 
             (this.rank!=null &&
              this.rank.equals(other.getRank()))) &&
            ((this.release==null && other.getRelease()==null) || 
             (this.release!=null &&
              this.release.equals(other.getRelease()))) &&
            ((this.releaseNote==null && other.getReleaseNote()==null) || 
             (this.releaseNote!=null &&
              this.releaseNote.equals(other.getReleaseNote()))) &&
            ((this.requirement==null && other.getRequirement()==null) || 
             (this.requirement!=null &&
              this.requirement.equals(other.getRequirement()))) &&
            ((this.resolution==null && other.getResolution()==null) || 
             (this.resolution!=null &&
              this.resolution.equals(other.getResolution()))) &&
            ((this.salesforceCaseID==null && other.getSalesforceCaseID()==null) || 
             (this.salesforceCaseID!=null &&
              this.salesforceCaseID.equals(other.getSalesforceCaseID()))) &&
            ((this.salesforceCaseNumber==null && other.getSalesforceCaseNumber()==null) || 
             (this.salesforceCaseNumber!=null &&
              this.salesforceCaseNumber.equals(other.getSalesforceCaseNumber()))) &&
            ((this.scheduleState==null && other.getScheduleState()==null) || 
             (this.scheduleState!=null &&
              this.scheduleState.equals(other.getScheduleState()))) &&
            ((this.severity==null && other.getSeverity()==null) || 
             (this.severity!=null &&
              this.severity.equals(other.getSeverity()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.submittedBy==null && other.getSubmittedBy()==null) || 
             (this.submittedBy!=null &&
              this.submittedBy.equals(other.getSubmittedBy()))) &&
            ((this.targetBuild==null && other.getTargetBuild()==null) || 
             (this.targetBuild!=null &&
              this.targetBuild.equals(other.getTargetBuild()))) &&
            ((this.targetDate==null && other.getTargetDate()==null) || 
             (this.targetDate!=null &&
              this.targetDate.equals(other.getTargetDate()))) &&
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
            ((this.testCase==null && other.getTestCase()==null) || 
             (this.testCase!=null &&
              this.testCase.equals(other.getTestCase()))) &&
            ((this.testCaseResult==null && other.getTestCaseResult()==null) || 
             (this.testCaseResult!=null &&
              this.testCaseResult.equals(other.getTestCaseResult()))) &&
            ((this.verifiedInBuild==null && other.getVerifiedInBuild()==null) || 
             (this.verifiedInBuild!=null &&
              this.verifiedInBuild.equals(other.getVerifiedInBuild()))) &&
            ((this.bugzilla==null && other.getBugzilla()==null) || 
             (this.bugzilla!=null &&
              this.bugzilla.equals(other.getBugzilla()))) &&
            ((this.businessValue==null && other.getBusinessValue()==null) || 
             (this.businessValue!=null &&
              this.businessValue.equals(other.getBusinessValue()))) &&
            ((this.BV==null && other.getBV()==null) || 
             (this.BV!=null &&
              this.BV.equals(other.getBV()))) &&
            ((this.estimated==null && other.getEstimated()==null) || 
             (this.estimated!=null &&
              this.estimated.equals(other.getEstimated())));
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
        if (getAffectsDoc() != null) {
            _hashCode += getAffectsDoc().hashCode();
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
        if (getClosedDate() != null) {
            _hashCode += getClosedDate().hashCode();
        }
        if (getDuplicates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDuplicates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDuplicates(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEnvironment() != null) {
            _hashCode += getEnvironment().hashCode();
        }
        if (getFixedInBuild() != null) {
            _hashCode += getFixedInBuild().hashCode();
        }
        if (getFoundInBuild() != null) {
            _hashCode += getFoundInBuild().hashCode();
        }
        if (getIteration() != null) {
            _hashCode += getIteration().hashCode();
        }
        if (getOpenedDate() != null) {
            _hashCode += getOpenedDate().hashCode();
        }
        if (get_package() != null) {
            _hashCode += get_package().hashCode();
        }
        if (getPlanEstimate() != null) {
            _hashCode += getPlanEstimate().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getRank() != null) {
            _hashCode += getRank().hashCode();
        }
        if (getRelease() != null) {
            _hashCode += getRelease().hashCode();
        }
        if (getReleaseNote() != null) {
            _hashCode += getReleaseNote().hashCode();
        }
        if (getRequirement() != null) {
            _hashCode += getRequirement().hashCode();
        }
        if (getResolution() != null) {
            _hashCode += getResolution().hashCode();
        }
        if (getSalesforceCaseID() != null) {
            _hashCode += getSalesforceCaseID().hashCode();
        }
        if (getSalesforceCaseNumber() != null) {
            _hashCode += getSalesforceCaseNumber().hashCode();
        }
        if (getScheduleState() != null) {
            _hashCode += getScheduleState().hashCode();
        }
        if (getSeverity() != null) {
            _hashCode += getSeverity().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getSubmittedBy() != null) {
            _hashCode += getSubmittedBy().hashCode();
        }
        if (getTargetBuild() != null) {
            _hashCode += getTargetBuild().hashCode();
        }
        if (getTargetDate() != null) {
            _hashCode += getTargetDate().hashCode();
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
        if (getTestCase() != null) {
            _hashCode += getTestCase().hashCode();
        }
        if (getTestCaseResult() != null) {
            _hashCode += getTestCaseResult().hashCode();
        }
        if (getVerifiedInBuild() != null) {
            _hashCode += getVerifiedInBuild().hashCode();
        }
        if (getBugzilla() != null) {
            _hashCode += getBugzilla().hashCode();
        }
        if (getBusinessValue() != null) {
            _hashCode += getBusinessValue().hashCode();
        }
        if (getBV() != null) {
            _hashCode += getBV().hashCode();
        }
        if (getEstimated() != null) {
            _hashCode += getEstimated().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Defect.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Defect"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acceptedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AcceptedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("affectsDoc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AffectsDoc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("closedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ClosedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duplicates");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Duplicates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Defect"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Defect"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("environment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Environment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fixedInBuild");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FixedInBuild"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foundInBuild");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FoundInBuild"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("openedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OpenedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("releaseNote");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ReleaseNote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requirement");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Requirement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Requirement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resolution");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Resolution"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesforceCaseID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SalesforceCaseID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesforceCaseNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SalesforceCaseNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("severity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Severity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("submittedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SubmittedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetBuild");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TargetBuild"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TargetDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testCase");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TestCase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "TestCase"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testCaseResult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TestCaseResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "TestCaseResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verifiedInBuild");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VerifiedInBuild"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bugzilla");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Bugzilla"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "WebLink"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
        elemField.setFieldName("estimated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Estimated"));
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
