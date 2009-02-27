/**
 * Artifact.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rallydev.webservice.v1_10.domain;

public class Artifact  extends com.rallydev.webservice.v1_10.domain.WorkspaceDomainObject  implements java.io.Serializable {
    private java.lang.String description;

    private com.rallydev.webservice.v1_10.domain.ConversationPost[] discussion;

    private java.lang.String formattedID;

    private java.util.Calendar lastUpdateDate;

    private java.lang.String name;

    private java.lang.String notes;

    private java.lang.String owner;

    private com.rallydev.webservice.v1_10.domain.Project project;

    private com.rallydev.webservice.v1_10.domain.RevisionHistory revisionHistory;

    public Artifact() {
    }

    public Artifact(
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
           com.rallydev.webservice.v1_10.domain.RevisionHistory revisionHistory) {
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
        this.description = description;
        this.discussion = discussion;
        this.formattedID = formattedID;
        this.lastUpdateDate = lastUpdateDate;
        this.name = name;
        this.notes = notes;
        this.owner = owner;
        this.project = project;
        this.revisionHistory = revisionHistory;
    }


    /**
     * Gets the description value for this Artifact.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Artifact.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the discussion value for this Artifact.
     * 
     * @return discussion
     */
    public com.rallydev.webservice.v1_10.domain.ConversationPost[] getDiscussion() {
        return discussion;
    }


    /**
     * Sets the discussion value for this Artifact.
     * 
     * @param discussion
     */
    public void setDiscussion(com.rallydev.webservice.v1_10.domain.ConversationPost[] discussion) {
        this.discussion = discussion;
    }


    /**
     * Gets the formattedID value for this Artifact.
     * 
     * @return formattedID
     */
    public java.lang.String getFormattedID() {
        return formattedID;
    }


    /**
     * Sets the formattedID value for this Artifact.
     * 
     * @param formattedID
     */
    public void setFormattedID(java.lang.String formattedID) {
        this.formattedID = formattedID;
    }


    /**
     * Gets the lastUpdateDate value for this Artifact.
     * 
     * @return lastUpdateDate
     */
    public java.util.Calendar getLastUpdateDate() {
        return lastUpdateDate;
    }


    /**
     * Sets the lastUpdateDate value for this Artifact.
     * 
     * @param lastUpdateDate
     */
    public void setLastUpdateDate(java.util.Calendar lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }


    /**
     * Gets the name value for this Artifact.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Artifact.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Artifact.
     * 
     * @return notes
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Artifact.
     * 
     * @param notes
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the owner value for this Artifact.
     * 
     * @return owner
     */
    public java.lang.String getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Artifact.
     * 
     * @param owner
     */
    public void setOwner(java.lang.String owner) {
        this.owner = owner;
    }


    /**
     * Gets the project value for this Artifact.
     * 
     * @return project
     */
    public com.rallydev.webservice.v1_10.domain.Project getProject() {
        return project;
    }


    /**
     * Sets the project value for this Artifact.
     * 
     * @param project
     */
    public void setProject(com.rallydev.webservice.v1_10.domain.Project project) {
        this.project = project;
    }


    /**
     * Gets the revisionHistory value for this Artifact.
     * 
     * @return revisionHistory
     */
    public com.rallydev.webservice.v1_10.domain.RevisionHistory getRevisionHistory() {
        return revisionHistory;
    }


    /**
     * Sets the revisionHistory value for this Artifact.
     * 
     * @param revisionHistory
     */
    public void setRevisionHistory(com.rallydev.webservice.v1_10.domain.RevisionHistory revisionHistory) {
        this.revisionHistory = revisionHistory;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Artifact)) return false;
        Artifact other = (Artifact) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.discussion==null && other.getDiscussion()==null) || 
             (this.discussion!=null &&
              java.util.Arrays.equals(this.discussion, other.getDiscussion()))) &&
            ((this.formattedID==null && other.getFormattedID()==null) || 
             (this.formattedID!=null &&
              this.formattedID.equals(other.getFormattedID()))) &&
            ((this.lastUpdateDate==null && other.getLastUpdateDate()==null) || 
             (this.lastUpdateDate!=null &&
              this.lastUpdateDate.equals(other.getLastUpdateDate()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.project==null && other.getProject()==null) || 
             (this.project!=null &&
              this.project.equals(other.getProject()))) &&
            ((this.revisionHistory==null && other.getRevisionHistory()==null) || 
             (this.revisionHistory!=null &&
              this.revisionHistory.equals(other.getRevisionHistory())));
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDiscussion() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDiscussion());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDiscussion(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFormattedID() != null) {
            _hashCode += getFormattedID().hashCode();
        }
        if (getLastUpdateDate() != null) {
            _hashCode += getLastUpdateDate().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getProject() != null) {
            _hashCode += getProject().hashCode();
        }
        if (getRevisionHistory() != null) {
            _hashCode += getRevisionHistory().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Artifact.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Artifact"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discussion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Discussion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "ConversationPost"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "ConversationPost"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formattedID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FormattedID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastUpdateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LastUpdateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("project");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Project"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Project"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revisionHistory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RevisionHistory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "RevisionHistory"));
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
