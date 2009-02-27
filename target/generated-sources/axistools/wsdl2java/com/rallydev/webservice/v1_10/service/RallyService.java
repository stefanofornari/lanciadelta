/**
 * RallyService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rallydev.webservice.v1_10.service;

public interface RallyService extends java.rmi.Remote {
    public com.rallydev.webservice.v1_10.domain.CreateResult create(com.rallydev.webservice.v1_10.domain.PersistableObject artifact) throws java.rmi.RemoteException;
    public com.rallydev.webservice.v1_10.domain.OperationResult update(com.rallydev.webservice.v1_10.domain.PersistableObject artifact) throws java.rmi.RemoteException;
    public com.rallydev.webservice.v1_10.domain.WSObject read(com.rallydev.webservice.v1_10.domain.PersistableObject reference) throws java.rmi.RemoteException;
    public com.rallydev.webservice.v1_10.domain.WSObject read(com.rallydev.webservice.v1_10.domain.PersistableObject reference, com.rallydev.webservice.v1_10.domain.Workspace workspace) throws java.rmi.RemoteException;
    public com.rallydev.webservice.v1_10.domain.QueryResult query(com.rallydev.webservice.v1_10.domain.Workspace workspace, java.lang.String artifactType, java.lang.String query, java.lang.String order, boolean fetch, long start, long pagesize) throws java.rmi.RemoteException;
    public com.rallydev.webservice.v1_10.domain.QueryResult query(com.rallydev.webservice.v1_10.domain.Workspace workspace, com.rallydev.webservice.v1_10.domain.Project project, boolean projectScopeUp, boolean projectScopeDown, java.lang.String artifactType, java.lang.String query, java.lang.String order, boolean fetch, long start, long pagesize) throws java.rmi.RemoteException;
    public com.rallydev.webservice.v1_10.domain.OperationResult delete(com.rallydev.webservice.v1_10.domain.PersistableObject reference) throws java.rmi.RemoteException;
    public com.rallydev.webservice.v1_10.domain.WSObject getCurrentSubscription() throws java.rmi.RemoteException;
    public com.rallydev.webservice.v1_10.domain.WSObject getCurrentUser() throws java.rmi.RemoteException;
}
