/**
 * HSMFileInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Mar 03, 2006 (12:17:06 EST) WSDL2Java emitter.
 */

package pl.cyfronet.gforge.hsmest.hsmmon.stubs;

public class HSMFileInfo  implements java.io.Serializable {
    private int startBlock;
    private int endBlock;
    private java.lang.String tapeID;
    private boolean isCached;
    private java.lang.String name;

    public HSMFileInfo() {
    }

    public HSMFileInfo(
           int endBlock,
           boolean isCached,
           java.lang.String name,
           int startBlock,
           java.lang.String tapeID) {
           this.startBlock = startBlock;
           this.endBlock = endBlock;
           this.tapeID = tapeID;
           this.isCached = isCached;
           this.name = name;
    }


    /**
     * Gets the startBlock value for this HSMFileInfo.
     * 
     * @return startBlock
     */
    public int getStartBlock() {
        return startBlock;
    }


    /**
     * Sets the startBlock value for this HSMFileInfo.
     * 
     * @param startBlock
     */
    public void setStartBlock(int startBlock) {
        this.startBlock = startBlock;
    }


    /**
     * Gets the endBlock value for this HSMFileInfo.
     * 
     * @return endBlock
     */
    public int getEndBlock() {
        return endBlock;
    }


    /**
     * Sets the endBlock value for this HSMFileInfo.
     * 
     * @param endBlock
     */
    public void setEndBlock(int endBlock) {
        this.endBlock = endBlock;
    }


    /**
     * Gets the tapeID value for this HSMFileInfo.
     * 
     * @return tapeID
     */
    public java.lang.String getTapeID() {
        return tapeID;
    }


    /**
     * Sets the tapeID value for this HSMFileInfo.
     * 
     * @param tapeID
     */
    public void setTapeID(java.lang.String tapeID) {
        this.tapeID = tapeID;
    }


    /**
     * Gets the isCached value for this HSMFileInfo.
     * 
     * @return isCached
     */
    public boolean isIsCached() {
        return isCached;
    }


    /**
     * Sets the isCached value for this HSMFileInfo.
     * 
     * @param isCached
     */
    public void setIsCached(boolean isCached) {
        this.isCached = isCached;
    }


    /**
     * Gets the name value for this HSMFileInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this HSMFileInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HSMFileInfo)) return false;
        HSMFileInfo other = (HSMFileInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.startBlock == other.getStartBlock() &&
            this.endBlock == other.getEndBlock() &&
            ((this.tapeID==null && other.getTapeID()==null) || 
             (this.tapeID!=null &&
              this.tapeID.equals(other.getTapeID()))) &&
            this.isCached == other.isIsCached() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getStartBlock();
        _hashCode += getEndBlock();
        if (getTapeID() != null) {
            _hashCode += getTapeID().hashCode();
        }
        _hashCode += (isIsCached() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HSMFileInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gforge.cyfronet.pl/namespaces/hsmest/hsmmon", ">HSMFileInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startBlock");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startBlock"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endBlock");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endBlock"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tapeID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tapeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCached");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isCached"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
