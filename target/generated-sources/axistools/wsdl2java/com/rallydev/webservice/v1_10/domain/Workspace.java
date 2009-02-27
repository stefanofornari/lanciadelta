/**
 * Workspace.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rallydev.webservice.v1_10.domain;

public class Workspace  extends com.rallydev.webservice.v1_10.domain.DomainObject  implements java.io.Serializable {
    private java.lang.String description;

    private java.lang.String name;

    private java.lang.String notes;

    private java.lang.String owner;

    private com.rallydev.webservice.v1_10.domain.Project[] projects;

    private com.rallydev.webservice.v1_10.domain.RevisionHistory revisionHistory;

    private java.lang.String state;

    private java.lang.String style;

    private com.rallydev.webservice.v1_10.domain.TypeDefinition[] typeDefinitions;

    private com.rallydev.webservice.v1_10.domain.WorkspaceConfiguration workspaceConfiguration;

    public Workspace() {
    }

    public Workspace(
           java.lang.String ref,
           long objectVersion,
           java.lang.String type,
           java.lang.String refObjectName,
           long rallyAPIMajor,
           long rallyAPIMinor,
           java.util.Calendar creationDate,
           java.lang.Long objectID,
           com.rallydev.webservice.v1_10.domain.Subscription subscription,
           java.lang.String description,
           java.lang.String name,
           java.lang.String notes,
           java.lang.String owner,
           com.rallydev.webservice.v1_10.domain.Project[] projects,
           com.rallydev.webservice.v1_10.domain.RevisionHistory revisionHistory,
           java.lang.String state,
           java.lang.String style,
           com.rallydev.webservice.v1_10.domain.TypeDefinition[] typeDefinitions,
           com.rallydev.webservice.v1_10.domain.WorkspaceConfiguration workspaceConfiguration) {
        super(
            ref,
            objectVersion,
            type,
            refObjectName,
            rallyAPIMajor,
            rallyAPIMinor,
            creationDate,
            objectID,
            subscription);
        this.description = description;
        this.name = name;
        this.notes = notes;
        this.owner = owner;
        this.projects = projects;
        this.revisionHistory = revisionHistory;
        this.state = state;
        this.style = style;
        this.typeDefinitions = typeDefinitions;
        this.workspaceConfiguration = workspaceConfiguration;
    }


    /**
     * Gets the description value for this Workspace.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Workspace.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the name value for this Workspace.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Workspace.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Workspace.
     * 
     * @return notes
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Workspace.
     * 
     * @param notes
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the owner value for this Workspace.
     * 
     * @return owner
     */
    public java.lang.String getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Workspace.
     * 
     * @param owner
     */
    public void setOwner(java.lang.String owner) {
        this.owner = owner;
    }


    /**
     * Gets the projects value for this Workspace.
     * 
     * @return projects
     */
    public com.rallydev.webservice.v1_10.domain.Project[] getProjects() {
        return projects;
    }


    /**
     * Sets the projects value for this Workspace.
     * 
     * @param projects
     */
    public void setProjects(com.rallydev.webservice.v1_10.domain.Project[] projects) {
        this.projects = projects;
    }


    /**
     * Gets the revisionHistory value for this Workspace.
     * 
     * @return revisionHistory
     */
    public com.rallydev.webservice.v1_10.domain.RevisionHistory getRevisionHistory() {
        return revisionHistory;
    }


    /**
     * Sets the revisionHistory value for this Workspace.
     * 
     * @param revisionHistory
     */
    public void setRevisionHistory(com.rallydev.webservice.v1_10.domain.RevisionHistory revisionHistory) {
        this.revisionHistory = revisionHistory;
    }


    /**
     * Gets the state value for this Workspace.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Workspace.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the style value for this Workspace.
     * 
     * @return style
     */
    public java.lang.String getStyle() {
        return style;
    }


    /**
     * Sets the style value for this Workspace.
     * 
     * @param style
     */
    public void setStyle(java.lang.String style) {
        this.style = style;
    }


    /**
     * Gets the typeDefinitions value for this Workspace.
     * 
     * @return typeDefinitions
     */
    public com.rallydev.webservice.v1_10.domain.TypeDefinition[] getTypeDefinitions() {
        return typeDefinitions;
    }


    /**
     * Sets the typeDefinitions value for this Workspace.
     * 
     * @param typeDefinitions
     */
    public void setTypeDefinitions(com.rallydev.webservice.v1_10.domain.TypeDefinition[] typeDefinitions) {
        this.typeDefinitions = typeDefinitions;
    }


    /**
     * Gets the workspaceConfiguration value for this Workspace.
     * 
     * @return workspaceConfiguration
     */
    public com.rallydev.webservice.v1_10.domain.WorkspaceConfiguration getWorkspaceConfiguration() {
        return workspaceConfiguration;
    }


    /**
     * Sets the workspaceConfiguration value for this Workspace.
     * 
     * @param workspaceConfiguration
     */
    public void setWorkspaceConfiguration(com.rallydev.webservice.v1_10.domain.WorkspaceConfiguration workspaceConfiguration) {
        this.workspaceConfiguration = workspaceConfiguration;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Workspace)) return false;
        Workspace other = (Workspace) obj;
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
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.projects==null && other.getProjects()==null) || 
             (this.projects!=null &&
              java.util.Arrays.equals(this.projects, other.getProjects()))) &&
            ((this.revisionHistory==null && other.getRevisionHistory()==null) || 
             (this.revisionHistory!=null &&
              this.revisionHistory.equals(other.getRevisionHistory()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.style==null && other.getStyle()==null) || 
             (this.style!=null &&
              this.style.equals(other.getStyle()))) &&
            ((this.typeDefinitions==null && other.getTypeDefinitions()==null) || 
             (this.typeDefinitions!=null &&
              java.util.Arrays.equals(this.typeDefinitions, other.getTypeDefinitions()))) &&
            ((this.workspaceConfiguration==null && other.getWorkspaceConfiguration()==null) || 
             (this.workspaceConfiguration!=null &&
              this.workspaceConfiguration.equals(other.getWorkspaceConfiguration())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getProjects() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProjects());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProjects(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRevisionHistory() != null) {
            _hashCode += getRevisionHistory().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getStyle() != null) {
            _hashCode += getStyle().hashCode();
        }
        if (getTypeDefinitions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTypeDefinitions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTypeDefinitions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWorkspaceConfiguration() != null) {
            _hashCode += getWorkspaceConfiguration().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Workspace.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Workspace"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("projects");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Projects"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Project"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Project"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revisionHistory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RevisionHistory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "RevisionHistory"));
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
        elemField.setFieldName("style");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Style"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeDefinitions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TypeDefinitions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "TypeDefinition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "TypeDefinition"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workspaceConfiguration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WorkspaceConfiguration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "WorkspaceConfiguration"));
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
