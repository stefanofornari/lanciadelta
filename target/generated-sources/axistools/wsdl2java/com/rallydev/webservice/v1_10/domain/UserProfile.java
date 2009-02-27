/**
 * UserProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rallydev.webservice.v1_10.domain;

public class UserProfile  extends com.rallydev.webservice.v1_10.domain.DomainObject  implements java.io.Serializable {
    private java.lang.String dateFormat;

    private java.lang.String dateTimeFormat;

    private com.rallydev.webservice.v1_10.domain.Project defaultProject;

    private com.rallydev.webservice.v1_10.domain.Workspace defaultWorkspace;

    private java.lang.Boolean emailNotificationEnabled;

    private java.lang.Long sessionTimeoutSeconds;

    private java.lang.Boolean sessionTimeoutWarning;

    private java.lang.String timeZone;

    private java.lang.Boolean welcomePageHidden;

    public UserProfile() {
    }

    public UserProfile(
           java.lang.String ref,
           long objectVersion,
           java.lang.String type,
           java.lang.String refObjectName,
           long rallyAPIMajor,
           long rallyAPIMinor,
           java.util.Calendar creationDate,
           java.lang.Long objectID,
           com.rallydev.webservice.v1_10.domain.Subscription subscription,
           java.lang.String dateFormat,
           java.lang.String dateTimeFormat,
           com.rallydev.webservice.v1_10.domain.Project defaultProject,
           com.rallydev.webservice.v1_10.domain.Workspace defaultWorkspace,
           java.lang.Boolean emailNotificationEnabled,
           java.lang.Long sessionTimeoutSeconds,
           java.lang.Boolean sessionTimeoutWarning,
           java.lang.String timeZone,
           java.lang.Boolean welcomePageHidden) {
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
        this.dateFormat = dateFormat;
        this.dateTimeFormat = dateTimeFormat;
        this.defaultProject = defaultProject;
        this.defaultWorkspace = defaultWorkspace;
        this.emailNotificationEnabled = emailNotificationEnabled;
        this.sessionTimeoutSeconds = sessionTimeoutSeconds;
        this.sessionTimeoutWarning = sessionTimeoutWarning;
        this.timeZone = timeZone;
        this.welcomePageHidden = welcomePageHidden;
    }


    /**
     * Gets the dateFormat value for this UserProfile.
     * 
     * @return dateFormat
     */
    public java.lang.String getDateFormat() {
        return dateFormat;
    }


    /**
     * Sets the dateFormat value for this UserProfile.
     * 
     * @param dateFormat
     */
    public void setDateFormat(java.lang.String dateFormat) {
        this.dateFormat = dateFormat;
    }


    /**
     * Gets the dateTimeFormat value for this UserProfile.
     * 
     * @return dateTimeFormat
     */
    public java.lang.String getDateTimeFormat() {
        return dateTimeFormat;
    }


    /**
     * Sets the dateTimeFormat value for this UserProfile.
     * 
     * @param dateTimeFormat
     */
    public void setDateTimeFormat(java.lang.String dateTimeFormat) {
        this.dateTimeFormat = dateTimeFormat;
    }


    /**
     * Gets the defaultProject value for this UserProfile.
     * 
     * @return defaultProject
     */
    public com.rallydev.webservice.v1_10.domain.Project getDefaultProject() {
        return defaultProject;
    }


    /**
     * Sets the defaultProject value for this UserProfile.
     * 
     * @param defaultProject
     */
    public void setDefaultProject(com.rallydev.webservice.v1_10.domain.Project defaultProject) {
        this.defaultProject = defaultProject;
    }


    /**
     * Gets the defaultWorkspace value for this UserProfile.
     * 
     * @return defaultWorkspace
     */
    public com.rallydev.webservice.v1_10.domain.Workspace getDefaultWorkspace() {
        return defaultWorkspace;
    }


    /**
     * Sets the defaultWorkspace value for this UserProfile.
     * 
     * @param defaultWorkspace
     */
    public void setDefaultWorkspace(com.rallydev.webservice.v1_10.domain.Workspace defaultWorkspace) {
        this.defaultWorkspace = defaultWorkspace;
    }


    /**
     * Gets the emailNotificationEnabled value for this UserProfile.
     * 
     * @return emailNotificationEnabled
     */
    public java.lang.Boolean getEmailNotificationEnabled() {
        return emailNotificationEnabled;
    }


    /**
     * Sets the emailNotificationEnabled value for this UserProfile.
     * 
     * @param emailNotificationEnabled
     */
    public void setEmailNotificationEnabled(java.lang.Boolean emailNotificationEnabled) {
        this.emailNotificationEnabled = emailNotificationEnabled;
    }


    /**
     * Gets the sessionTimeoutSeconds value for this UserProfile.
     * 
     * @return sessionTimeoutSeconds
     */
    public java.lang.Long getSessionTimeoutSeconds() {
        return sessionTimeoutSeconds;
    }


    /**
     * Sets the sessionTimeoutSeconds value for this UserProfile.
     * 
     * @param sessionTimeoutSeconds
     */
    public void setSessionTimeoutSeconds(java.lang.Long sessionTimeoutSeconds) {
        this.sessionTimeoutSeconds = sessionTimeoutSeconds;
    }


    /**
     * Gets the sessionTimeoutWarning value for this UserProfile.
     * 
     * @return sessionTimeoutWarning
     */
    public java.lang.Boolean getSessionTimeoutWarning() {
        return sessionTimeoutWarning;
    }


    /**
     * Sets the sessionTimeoutWarning value for this UserProfile.
     * 
     * @param sessionTimeoutWarning
     */
    public void setSessionTimeoutWarning(java.lang.Boolean sessionTimeoutWarning) {
        this.sessionTimeoutWarning = sessionTimeoutWarning;
    }


    /**
     * Gets the timeZone value for this UserProfile.
     * 
     * @return timeZone
     */
    public java.lang.String getTimeZone() {
        return timeZone;
    }


    /**
     * Sets the timeZone value for this UserProfile.
     * 
     * @param timeZone
     */
    public void setTimeZone(java.lang.String timeZone) {
        this.timeZone = timeZone;
    }


    /**
     * Gets the welcomePageHidden value for this UserProfile.
     * 
     * @return welcomePageHidden
     */
    public java.lang.Boolean getWelcomePageHidden() {
        return welcomePageHidden;
    }


    /**
     * Sets the welcomePageHidden value for this UserProfile.
     * 
     * @param welcomePageHidden
     */
    public void setWelcomePageHidden(java.lang.Boolean welcomePageHidden) {
        this.welcomePageHidden = welcomePageHidden;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserProfile)) return false;
        UserProfile other = (UserProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.dateFormat==null && other.getDateFormat()==null) || 
             (this.dateFormat!=null &&
              this.dateFormat.equals(other.getDateFormat()))) &&
            ((this.dateTimeFormat==null && other.getDateTimeFormat()==null) || 
             (this.dateTimeFormat!=null &&
              this.dateTimeFormat.equals(other.getDateTimeFormat()))) &&
            ((this.defaultProject==null && other.getDefaultProject()==null) || 
             (this.defaultProject!=null &&
              this.defaultProject.equals(other.getDefaultProject()))) &&
            ((this.defaultWorkspace==null && other.getDefaultWorkspace()==null) || 
             (this.defaultWorkspace!=null &&
              this.defaultWorkspace.equals(other.getDefaultWorkspace()))) &&
            ((this.emailNotificationEnabled==null && other.getEmailNotificationEnabled()==null) || 
             (this.emailNotificationEnabled!=null &&
              this.emailNotificationEnabled.equals(other.getEmailNotificationEnabled()))) &&
            ((this.sessionTimeoutSeconds==null && other.getSessionTimeoutSeconds()==null) || 
             (this.sessionTimeoutSeconds!=null &&
              this.sessionTimeoutSeconds.equals(other.getSessionTimeoutSeconds()))) &&
            ((this.sessionTimeoutWarning==null && other.getSessionTimeoutWarning()==null) || 
             (this.sessionTimeoutWarning!=null &&
              this.sessionTimeoutWarning.equals(other.getSessionTimeoutWarning()))) &&
            ((this.timeZone==null && other.getTimeZone()==null) || 
             (this.timeZone!=null &&
              this.timeZone.equals(other.getTimeZone()))) &&
            ((this.welcomePageHidden==null && other.getWelcomePageHidden()==null) || 
             (this.welcomePageHidden!=null &&
              this.welcomePageHidden.equals(other.getWelcomePageHidden())));
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
        if (getDateFormat() != null) {
            _hashCode += getDateFormat().hashCode();
        }
        if (getDateTimeFormat() != null) {
            _hashCode += getDateTimeFormat().hashCode();
        }
        if (getDefaultProject() != null) {
            _hashCode += getDefaultProject().hashCode();
        }
        if (getDefaultWorkspace() != null) {
            _hashCode += getDefaultWorkspace().hashCode();
        }
        if (getEmailNotificationEnabled() != null) {
            _hashCode += getEmailNotificationEnabled().hashCode();
        }
        if (getSessionTimeoutSeconds() != null) {
            _hashCode += getSessionTimeoutSeconds().hashCode();
        }
        if (getSessionTimeoutWarning() != null) {
            _hashCode += getSessionTimeoutWarning().hashCode();
        }
        if (getTimeZone() != null) {
            _hashCode += getTimeZone().hashCode();
        }
        if (getWelcomePageHidden() != null) {
            _hashCode += getWelcomePageHidden().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "UserProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DateFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateTimeFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DateTimeFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultProject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DefaultProject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Project"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultWorkspace");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DefaultWorkspace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Workspace"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailNotificationEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EmailNotificationEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionTimeoutSeconds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SessionTimeoutSeconds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionTimeoutWarning");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SessionTimeoutWarning"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TimeZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("welcomePageHidden");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WelcomePageHidden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
