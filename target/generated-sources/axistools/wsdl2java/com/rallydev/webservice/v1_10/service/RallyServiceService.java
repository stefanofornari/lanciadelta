/**
 * RallyServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rallydev.webservice.v1_10.service;

public interface RallyServiceService extends javax.xml.rpc.Service {
    public java.lang.String getRallyServiceAddress();

    public com.rallydev.webservice.v1_10.service.RallyService getRallyService() throws javax.xml.rpc.ServiceException;

    public com.rallydev.webservice.v1_10.service.RallyService getRallyService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
