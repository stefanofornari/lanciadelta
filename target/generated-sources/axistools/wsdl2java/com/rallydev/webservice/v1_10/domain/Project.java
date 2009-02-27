/**
 * Project.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rallydev.webservice.v1_10.domain;

public class Project  extends com.rallydev.webservice.v1_10.domain.WorkspaceDomainObject  implements java.io.Serializable {
    private com.rallydev.webservice.v1_10.domain.BuildDefinition[] buildDefinitions;

    private com.rallydev.webservice.v1_10.domain.Project[] children;

    private java.lang.String description;

    private com.rallydev.webservice.v1_10.domain.Iteration[] iterations;

    private java.lang.String name;

    private java.lang.String notes;

    private java.lang.String owner;

    private com.rallydev.webservice.v1_10.domain.Project parent;

    private com.rallydev.webservice.v1_10.domain.Release[] releases;

    private java.lang.String state;

    private com.rallydev.webservice.v1_10.domain.User[] users;

    public Project() {
    }

    public Project(
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
           com.rallydev.webservice.v1_10.domain.BuildDefinition[] buildDefinitions,
           com.rallydev.webservice.v1_10.domain.Project[] children,
           java.lang.String description,
           com.rallydev.webservice.v1_10.domain.Iteration[] iterations,
           java.lang.String name,
           java.lang.String notes,
           java.lang.String owner,
           com.rallydev.webservice.v1_10.domain.Project parent,
           com.rallydev.webservice.v1_10.domain.Release[] releases,
           java.lang.String state,
           com.rallydev.webservice.v1_10.domain.User[] users) {
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
        this.buildDefinitions = buildDefinitions;
        this.children = children;
        this.description = description;
        this.iterations = iterations;
        this.name = name;
        this.notes = notes;
        this.owner = owner;
        this.parent = parent;
        this.releases = releases;
        this.state = state;
        this.users = users;
    }


    /**
     * Gets the buildDefinitions value for this Project.
     * 
     * @return buildDefinitions
     */
    public com.rallydev.webservice.v1_10.domain.BuildDefinition[] getBuildDefinitions() {
        return buildDefinitions;
    }


    /**
     * Sets the buildDefinitions value for this Project.
     * 
     * @param buildDefinitions
     */
    public void setBuildDefinitions(com.rallydev.webservice.v1_10.domain.BuildDefinition[] buildDefinitions) {
        this.buildDefinitions = buildDefinitions;
    }


    /**
     * Gets the children value for this Project.
     * 
     * @return children
     */
    public com.rallydev.webservice.v1_10.domain.Project[] getChildren() {
        return children;
    }


    /**
     * Sets the children value for this Project.
     * 
     * @param children
     */
    public void setChildren(com.rallydev.webservice.v1_10.domain.Project[] children) {
        this.children = children;
    }


    /**
     * Gets the description value for this Project.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Project.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the iterations value for this Project.
     * 
     * @return iterations
     */
    public com.rallydev.webservice.v1_10.domain.Iteration[] getIterations() {
        return iterations;
    }


    /**
     * Sets the iterations value for this Project.
     * 
     * @param iterations
     */
    public void setIterations(com.rallydev.webservice.v1_10.domain.Iteration[] iterations) {
        this.iterations = iterations;
    }


    /**
     * Gets the name value for this Project.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Project.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Project.
     * 
     * @return notes
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Project.
     * 
     * @param notes
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the owner value for this Project.
     * 
     * @return owner
     */
    public java.lang.String getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Project.
     * 
     * @param owner
     */
    public void setOwner(java.lang.String owner) {
        this.owner = owner;
    }


    /**
     * Gets the parent value for this Project.
     * 
     * @return parent
     */
    public com.rallydev.webservice.v1_10.domain.Project getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this Project.
     * 
     * @param parent
     */
    public void setParent(com.rallydev.webservice.v1_10.domain.Project parent) {
        this.parent = parent;
    }


    /**
     * Gets the releases value for this Project.
     * 
     * @return releases
     */
    public com.rallydev.webservice.v1_10.domain.Release[] getReleases() {
        return releases;
    }


    /**
     * Sets the releases value for this Project.
     * 
     * @param releases
     */
    public void setReleases(com.rallydev.webservice.v1_10.domain.Release[] releases) {
        this.releases = releases;
    }


    /**
     * Gets the state value for this Project.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Project.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the users value for this Project.
     * 
     * @return users
     */
    public com.rallydev.webservice.v1_10.domain.User[] getUsers() {
        return users;
    }


    /**
     * Sets the users value for this Project.
     * 
     * @param users
     */
    public void setUsers(com.rallydev.webservice.v1_10.domain.User[] users) {
        this.users = users;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Project)) return false;
        Project other = (Project) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.buildDefinitions==null && other.getBuildDefinitions()==null) || 
             (this.buildDefinitions!=null &&
              java.util.Arrays.equals(this.buildDefinitions, other.getBuildDefinitions()))) &&
            ((this.children==null && other.getChildren()==null) || 
             (this.children!=null &&
              java.util.Arrays.equals(this.children, other.getChildren()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.iterations==null && other.getIterations()==null) || 
             (this.iterations!=null &&
              java.util.Arrays.equals(this.iterations, other.getIterations()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
            ((this.releases==null && other.getReleases()==null) || 
             (this.releases!=null &&
              java.util.Arrays.equals(this.releases, other.getReleases()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.users==null && other.getUsers()==null) || 
             (this.users!=null &&
              java.util.Arrays.equals(this.users, other.getUsers())));
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
        if (getBuildDefinitions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBuildDefinitions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBuildDefinitions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getIterations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIterations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIterations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        if (getReleases() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReleases());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReleases(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getUsers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUsers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUsers(), i);
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
        new org.apache.axis.description.TypeDesc(Project.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Project"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildDefinitions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BuildDefinitions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "BuildDefinition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "BuildDefinition"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("children");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Children"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Project"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Project"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iterations");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Iterations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Iteration"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Iteration"));
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
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Project"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("releases");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Releases"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Release"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Release"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("users");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Users"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "User"));
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
