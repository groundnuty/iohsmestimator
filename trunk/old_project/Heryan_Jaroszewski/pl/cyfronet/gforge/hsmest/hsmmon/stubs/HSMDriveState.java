/**
 * HSMDriveState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Mar 03, 2006 (12:17:06 EST) WSDL2Java emitter.
 */

package pl.cyfronet.gforge.hsmest.hsmmon.stubs;

public class HSMDriveState  implements java.io.Serializable {
    private int id;
    private java.lang.String mediaType;
    private int currentPosition;
    private int usage;
    private java.lang.String tapeID;

    public HSMDriveState() {
    }

    public HSMDriveState(
           int currentPosition,
           int id,
           java.lang.String mediaType,
           java.lang.String tapeID,
           int usage) {
           this.id = id;
           this.mediaType = mediaType;
           this.currentPosition = currentPosition;
           this.usage = usage;
           this.tapeID = tapeID;
    }


    /**
     * Gets the id value for this HSMDriveState.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this HSMDriveState.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the mediaType value for this HSMDriveState.
     * 
     * @return mediaType
     */
    public java.lang.String getMediaType() {
        return mediaType;
    }


    /**
     * Sets the mediaType value for this HSMDriveState.
     * 
     * @param mediaType
     */
    public void setMediaType(java.lang.String mediaType) {
        this.mediaType = mediaType;
    }


    /**
     * Gets the currentPosition value for this HSMDriveState.
     * 
     * @return currentPosition
     */
    public int getCurrentPosition() {
        return currentPosition;
    }


    /**
     * Sets the currentPosition value for this HSMDriveState.
     * 
     * @param currentPosition
     */
    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }


    /**
     * Gets the usage value for this HSMDriveState.
     * 
     * @return usage
     */
    public int getUsage() {
        return usage;
    }


    /**
     * Sets the usage value for this HSMDriveState.
     * 
     * @param usage
     */
    public void setUsage(int usage) {
        this.usage = usage;
    }


    /**
     * Gets the tapeID value for this HSMDriveState.
     * 
     * @return tapeID
     */
    public java.lang.String getTapeID() {
        return tapeID;
    }


    /**
     * Sets the tapeID value for this HSMDriveState.
     * 
     * @param tapeID
     */
    public void setTapeID(java.lang.String tapeID) {
        this.tapeID = tapeID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HSMDriveState)) return false;
        HSMDriveState other = (HSMDriveState) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            ((this.mediaType==null && other.getMediaType()==null) || 
             (this.mediaType!=null &&
              this.mediaType.equals(other.getMediaType()))) &&
            this.currentPosition == other.getCurrentPosition() &&
            this.usage == other.getUsage() &&
            ((this.tapeID==null && other.getTapeID()==null) || 
             (this.tapeID!=null &&
              this.tapeID.equals(other.getTapeID())));
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
        _hashCode += getId();
        if (getMediaType() != null) {
            _hashCode += getMediaType().hashCode();
        }
        _hashCode += getCurrentPosition();
        _hashCode += getUsage();
        if (getTapeID() != null) {
            _hashCode += getTapeID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HSMDriveState.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gforge.cyfronet.pl/namespaces/hsmest/hsmmon", ">HSMDriveState"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mediaType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mediaType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currentPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tapeID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tapeID"));
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
