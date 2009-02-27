/**
 * RallyServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rallydev.webservice.v1_10.service;

public class RallyServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.rallydev.webservice.v1_10.service.RallyService {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[9];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("create");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "artifact"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "PersistableObject"), com.rallydev.webservice.v1_10.domain.PersistableObject.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "CreateResult"));
        oper.setReturnClass(com.rallydev.webservice.v1_10.domain.CreateResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "createReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("update");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "artifact"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "PersistableObject"), com.rallydev.webservice.v1_10.domain.PersistableObject.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "OperationResult"));
        oper.setReturnClass(com.rallydev.webservice.v1_10.domain.OperationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "updateReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("read");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reference"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "PersistableObject"), com.rallydev.webservice.v1_10.domain.PersistableObject.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "WSObject"));
        oper.setReturnClass(com.rallydev.webservice.v1_10.domain.WSObject.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "readOriginalReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("read");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reference"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "PersistableObject"), com.rallydev.webservice.v1_10.domain.PersistableObject.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "workspace"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Workspace"), com.rallydev.webservice.v1_10.domain.Workspace.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "WSObject"));
        oper.setReturnClass(com.rallydev.webservice.v1_10.domain.WSObject.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "readWorkspaceScopedReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("query");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "workspace"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Workspace"), com.rallydev.webservice.v1_10.domain.Workspace.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "artifactType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "order"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fetch"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "start"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pagesize"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "QueryResult"));
        oper.setReturnClass(com.rallydev.webservice.v1_10.domain.QueryResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "queryOriginalReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("query");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "workspace"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Workspace"), com.rallydev.webservice.v1_10.domain.Workspace.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "project"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Project"), com.rallydev.webservice.v1_10.domain.Project.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "projectScopeUp"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "projectScopeDown"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "artifactType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "order"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fetch"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "start"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pagesize"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "QueryResult"));
        oper.setReturnClass(com.rallydev.webservice.v1_10.domain.QueryResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "queryProjectScopedReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("delete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reference"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "PersistableObject"), com.rallydev.webservice.v1_10.domain.PersistableObject.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "OperationResult"));
        oper.setReturnClass(com.rallydev.webservice.v1_10.domain.OperationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "deleteReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCurrentSubscription");
        oper.setReturnType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "WSObject"));
        oper.setReturnClass(com.rallydev.webservice.v1_10.domain.WSObject.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getCurrentSubscriptionReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCurrentUser");
        oper.setReturnType(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "WSObject"));
        oper.setReturnClass(com.rallydev.webservice.v1_10.domain.WSObject.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getCurrentUserReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

    }

    public RallyServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public RallyServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public RallyServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "AllowedAttributeValue");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.AllowedAttributeValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "AllowedQueryOperator");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.AllowedQueryOperator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Artifact");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.Artifact.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "ArtifactDiscussionType");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.ConversationPost[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "ConversationPost");
            qName2 = new javax.xml.namespace.QName("", "ConversationPost");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Attachment");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.Attachment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "AttachmentContent");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.AttachmentContent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "AttributeDefinition");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.AttributeDefinition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "AttributeDefinitionAllowedQueryOperatorsType");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.AllowedQueryOperator[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "AllowedQueryOperator");
            qName2 = new javax.xml.namespace.QName("", "AllowedQueryOperator");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "AttributeDefinitionAllowedValuesType");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.AllowedAttributeValue[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "AllowedAttributeValue");
            qName2 = new javax.xml.namespace.QName("", "AllowedAttributeValue");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Build");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.Build.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "BuildDefinition");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.BuildDefinition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "BuildDefinitionBuildsType");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.Build[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Build");
            qName2 = new javax.xml.namespace.QName("", "Build");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "BuildMetric");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.BuildMetric.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "BuildMetricDefinition");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.BuildMetricDefinition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "ConversationPost");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.ConversationPost.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "CreateResult");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.CreateResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "CumulativeFlowData");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.CumulativeFlowData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Defect");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.Defect.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "DefectAttachmentsType");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.Attachment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Attachment");
            qName2 = new javax.xml.namespace.QName("", "Attachment");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "DefectDuplicatesType");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.Defect[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Defect");
            qName2 = new javax.xml.namespace.QName("", "Defect");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "DefectSuite");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.DefectSuite.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "DefectSuiteAttachmentsType");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.Attachment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Attachment");
            qName2 = new javax.xml.namespace.QName("", "Attachment");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "DefectSuiteDefectsType");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.Defect[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Defect");
            qName2 = new javax.xml.namespace.QName("", "Defect");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "DefectSuiteTasksType");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.Task[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Task");
            qName2 = new javax.xml.namespace.QName("", "Task");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "DefectTasksType");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.Task[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Task");
            qName2 = new javax.xml.namespace.QName("", "Task");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "DomainObject");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.DomainObject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "HierarchicalRequirement");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.HierarchicalRequirement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "HierarchicalRequirementChildrenType");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.HierarchicalRequirement[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "HierarchicalRequirement");
            qName2 = new javax.xml.namespace.QName("", "HierarchicalRequirement");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "HierarchicalRequirementPredecessorsType");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.HierarchicalRequirement[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "HierarchicalRequirement");
            qName2 = new javax.xml.namespace.QName("", "HierarchicalRequirement");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "HierarchicalRequirementSuccessorsType");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.HierarchicalRequirement[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "HierarchicalRequirement");
            qName2 = new javax.xml.namespace.QName("", "HierarchicalRequirement");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "HierarchicalRequirementTasksType");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.Task[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Task");
            qName2 = new javax.xml.namespace.QName("", "Task");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Iteration");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.Iteration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "IterationCumulativeFlowData");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.IterationCumulativeFlowData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "IterationUserIterationCapacitiesType");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.UserIterationCapacity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "UserIterationCapacity");
            qName2 = new javax.xml.namespace.QName("", "UserIterationCapacity");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "OperationResult");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.OperationResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "OperationResultErrorsType");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "OperationResultError");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "OperationResultWarningsType");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "OperationResultWarning");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "PersistableObject");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.PersistableObject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Project");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.Project.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "ProjectBuildDefinitionsType");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.BuildDefinition[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "BuildDefinition");
            qName2 = new javax.xml.namespace.QName("", "BuildDefinition");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "ProjectChildrenType");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.Project[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Project");
            qName2 = new javax.xml.namespace.QName("", "Project");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "ProjectIterationsType");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.Iteration[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Iteration");
            qName2 = new javax.xml.namespace.QName("", "Iteration");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "ProjectPermission");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.ProjectPermission.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "ProjectReleasesType");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.Release[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Release");
            qName2 = new javax.xml.namespace.QName("", "Release");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "ProjectUsersType");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.User[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "User");
            qName2 = new javax.xml.namespace.QName("", "User");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "QueryResult");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.QueryResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "QueryResultResultsType");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.DomainObject[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "DomainObject");
            qName2 = new javax.xml.namespace.QName("", "Object");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Release");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.Release.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "ReleaseCumulativeFlowData");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.ReleaseCumulativeFlowData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Requirement");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.Requirement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "RequirementAttachmentsType");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.Attachment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Attachment");
            qName2 = new javax.xml.namespace.QName("", "Attachment");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Revision");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.Revision.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "RevisionHistory");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.RevisionHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "RevisionHistoryRevisionsType");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.Revision[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Revision");
            qName2 = new javax.xml.namespace.QName("", "Revision");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Subscription");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.Subscription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "SubscriptionWorkspacesType");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.Workspace[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Workspace");
            qName2 = new javax.xml.namespace.QName("", "Workspace");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Task");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.Task.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "TaskAttachmentsType");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.Attachment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Attachment");
            qName2 = new javax.xml.namespace.QName("", "Attachment");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "TestCase");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.TestCase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "TestCaseAttachmentsType");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.Attachment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Attachment");
            qName2 = new javax.xml.namespace.QName("", "Attachment");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "TestCaseResult");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.TestCaseResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "TestCaseResultAttachmentsType");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.Attachment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Attachment");
            qName2 = new javax.xml.namespace.QName("", "Attachment");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "TestCaseResultsType");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.TestCaseResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "TestCaseResult");
            qName2 = new javax.xml.namespace.QName("", "TestCaseResult");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "TestCaseStep");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.TestCaseStep.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "TestCaseStepsType");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.TestCaseStep[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "TestCaseStep");
            qName2 = new javax.xml.namespace.QName("", "TestCaseStep");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "TypeDefinition");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.TypeDefinition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "TypeDefinitionAttributesType");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.AttributeDefinition[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "AttributeDefinition");
            qName2 = new javax.xml.namespace.QName("", "AttributeDefinition");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "User");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.User.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "UserIterationCapacity");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.UserIterationCapacity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "UserPermission");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.UserPermission.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "UserProfile");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.UserProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "UserProjectsType");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.Project[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Project");
            qName2 = new javax.xml.namespace.QName("", "Project");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "UserUserPermissionsType");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.UserPermission[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "UserPermission");
            qName2 = new javax.xml.namespace.QName("", "UserPermission");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "WebLink");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.WebLink.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "WebLinkDefinition");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.WebLinkDefinition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Workspace");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.Workspace.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "WorkspaceConfiguration");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.WorkspaceConfiguration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "WorkspaceDomainObject");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.WorkspaceDomainObject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "WorkspacePermission");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.WorkspacePermission.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "WorkspaceProjectsType");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.Project[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "Project");
            qName2 = new javax.xml.namespace.QName("", "Project");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "WorkspaceTypeDefinitionsType");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.TypeDefinition[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "TypeDefinition");
            qName2 = new javax.xml.namespace.QName("", "TypeDefinition");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/domain", "WSObject");
            cachedSerQNames.add(qName);
            cls = com.rallydev.webservice.v1_10.domain.WSObject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.rallydev.webservice.v1_10.domain.CreateResult create(com.rallydev.webservice.v1_10.domain.PersistableObject artifact) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/service", "create"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {artifact});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.rallydev.webservice.v1_10.domain.CreateResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.rallydev.webservice.v1_10.domain.CreateResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.rallydev.webservice.v1_10.domain.CreateResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.rallydev.webservice.v1_10.domain.OperationResult update(com.rallydev.webservice.v1_10.domain.PersistableObject artifact) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/service", "update"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {artifact});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.rallydev.webservice.v1_10.domain.OperationResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.rallydev.webservice.v1_10.domain.OperationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.rallydev.webservice.v1_10.domain.OperationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.rallydev.webservice.v1_10.domain.WSObject read(com.rallydev.webservice.v1_10.domain.PersistableObject reference) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/service", "read"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {reference});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.rallydev.webservice.v1_10.domain.WSObject) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.rallydev.webservice.v1_10.domain.WSObject) org.apache.axis.utils.JavaUtils.convert(_resp, com.rallydev.webservice.v1_10.domain.WSObject.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.rallydev.webservice.v1_10.domain.WSObject read(com.rallydev.webservice.v1_10.domain.PersistableObject reference, com.rallydev.webservice.v1_10.domain.Workspace workspace) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/service", "read"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {reference, workspace});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.rallydev.webservice.v1_10.domain.WSObject) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.rallydev.webservice.v1_10.domain.WSObject) org.apache.axis.utils.JavaUtils.convert(_resp, com.rallydev.webservice.v1_10.domain.WSObject.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.rallydev.webservice.v1_10.domain.QueryResult query(com.rallydev.webservice.v1_10.domain.Workspace workspace, java.lang.String artifactType, java.lang.String query, java.lang.String order, boolean fetch, long start, long pagesize) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/service", "query"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workspace, artifactType, query, order, new java.lang.Boolean(fetch), new java.lang.Long(start), new java.lang.Long(pagesize)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.rallydev.webservice.v1_10.domain.QueryResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.rallydev.webservice.v1_10.domain.QueryResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.rallydev.webservice.v1_10.domain.QueryResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.rallydev.webservice.v1_10.domain.QueryResult query(com.rallydev.webservice.v1_10.domain.Workspace workspace, com.rallydev.webservice.v1_10.domain.Project project, boolean projectScopeUp, boolean projectScopeDown, java.lang.String artifactType, java.lang.String query, java.lang.String order, boolean fetch, long start, long pagesize) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/service", "query"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {workspace, project, new java.lang.Boolean(projectScopeUp), new java.lang.Boolean(projectScopeDown), artifactType, query, order, new java.lang.Boolean(fetch), new java.lang.Long(start), new java.lang.Long(pagesize)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.rallydev.webservice.v1_10.domain.QueryResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.rallydev.webservice.v1_10.domain.QueryResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.rallydev.webservice.v1_10.domain.QueryResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.rallydev.webservice.v1_10.domain.OperationResult delete(com.rallydev.webservice.v1_10.domain.PersistableObject reference) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/service", "delete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {reference});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.rallydev.webservice.v1_10.domain.OperationResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.rallydev.webservice.v1_10.domain.OperationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.rallydev.webservice.v1_10.domain.OperationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.rallydev.webservice.v1_10.domain.WSObject getCurrentSubscription() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/service", "getCurrentSubscription"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.rallydev.webservice.v1_10.domain.WSObject) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.rallydev.webservice.v1_10.domain.WSObject) org.apache.axis.utils.JavaUtils.convert(_resp, com.rallydev.webservice.v1_10.domain.WSObject.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.rallydev.webservice.v1_10.domain.WSObject getCurrentUser() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://rallydev.com/webservice/v1_10/service", "getCurrentUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.rallydev.webservice.v1_10.domain.WSObject) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.rallydev.webservice.v1_10.domain.WSObject) org.apache.axis.utils.JavaUtils.convert(_resp, com.rallydev.webservice.v1_10.domain.WSObject.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
