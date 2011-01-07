/**
 * Drive.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Mar 03, 2006 (12:17:06 EST) WSDL2Java emitter.
 */

package pl.cyfronet.gforge.hsmest.hsmmon.stubs;

public class Drive  implements java.io.Serializable {
    private int id;
    private java.lang.String vendorString;
    private java.lang.String type;
    private java.lang.String[] mediaTypes;
    private int loadTime;
    private int unloadTime;
    private int averagePosTime;
    private float readTransferRate;
    private float writeTransferRate;
    private java.lang.String device;

    public Drive() {
    }

    public Drive(
           int averagePosTime,
           java.lang.String device,
           int id,
           int loadTime,
           java.lang.String[] mediaTypes,
           float readTransferRate,
           java.lang.String type,
           int unloadTime,
           java.lang.String vendorString,
           float writeTransferRate) {
           this.id = id;
           this.vendorString = vendorString;
           this.type = type;
           this.mediaTypes = mediaTypes;
           this.loadTime = loadTime;
           this.unloadTime = unloadTime;
           this.averagePosTime = averagePosTime;
           this.readTransferRate = readTransferRate;
           this.writeTransferRate = writeTransferRate;
           this.device = device;
    }


    /**
     * Gets the id value for this Drive.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Drive.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the vendorString value for this Drive.
     * 
     * @return vendorString
     */
    public java.lang.String getVendorString() {
        return vendorString;
    }


    /**
     * Sets the vendorString value for this Drive.
     * 
     * @param vendorString
     */
    public void setVendorString(java.lang.String vendorString) {
        this.vendorString = vendorString;
    }


    /**
     * Gets the type value for this Drive.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Drive.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the mediaTypes value for this Drive.
     * 
     * @return mediaTypes
     */
    public java.lang.String[] getMediaTypes() {
        return mediaTypes;
    }


    /**
     * Sets the mediaTypes value for this Drive.
     * 
     * @param mediaTypes
     */
    public void setMediaTypes(java.lang.String[] mediaTypes) {
        this.mediaTypes = mediaTypes;
    }

    public java.lang.String getMediaTypes(int i) {
        return this.mediaTypes[i];
    }

    public void setMediaTypes(int i, java.lang.String _value) {
        this.mediaTypes[i] = _value;
    }


    /**
     * Gets the loadTime value for this Drive.
     * 
     * @return loadTime
     */
    public int getLoadTime() {
        return loadTime;
    }


    /**
     * Sets the loadTime value for this Drive.
     * 
     * @param loadTime
     */
    public void setLoadTime(int loadTime) {
        this.loadTime = loadTime;
    }


    /**
     * Gets the unloadTime value for this Drive.
     * 
     * @return unloadTime
     */
    public int getUnloadTime() {
        return unloadTime;
    }


    /**
     * Sets the unloadTime value for this Drive.
     * 
     * @param unloadTime
     */
    public void setUnloadTime(int unloadTime) {
        this.unloadTime = unloadTime;
    }


    /**
     * Gets the averagePosTime value for this Drive.
     * 
     * @return averagePosTime
     */
    public int getAveragePosTime() {
        return averagePosTime;
    }


    /**
     * Sets the averagePosTime value for this Drive.
     * 
     * @param averagePosTime
     */
    public void setAveragePosTime(int averagePosTime) {
        this.averagePosTime = averagePosTime;
    }


    /**
     * Gets the readTransferRate value for this Drive.
     * 
     * @return readTransferRate
     */
    public float getReadTransferRate() {
        return readTransferRate;
    }


    /**
     * Sets the readTransferRate value for this Drive.
     * 
     * @param readTransferRate
     */
    public void setReadTransferRate(float readTransferRate) {
        this.readTransferRate = readTransferRate;
    }


    /**
     * Gets the writeTransferRate value for this Drive.
     * 
     * @return writeTransferRate
     */
    public float getWriteTransferRate() {
        return writeTransferRate;
    }


    /**
     * Sets the writeTransferRate value for this Drive.
     * 
     * @param writeTransferRate
     */
    public void setWriteTransferRate(float writeTransferRate) {
        this.writeTransferRate = writeTransferRate;
    }


    /**
     * Gets the device value for this Drive.
     * 
     * @return device
     */
    public java.lang.String getDevice() {
        return device;
    }


    /**
     * Sets the device value for this Drive.
     * 
     * @param device
     */
    public void setDevice(java.lang.String device) {
        this.device = device;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Drive)) return false;
        Drive other = (Drive) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            ((this.vendorString==null && other.getVendorString()==null) || 
             (this.vendorString!=null &&
              this.vendorString.equals(other.getVendorString()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.mediaTypes==null && other.getMediaTypes()==null) || 
             (this.mediaTypes!=null &&
              java.util.Arrays.equals(this.mediaTypes, other.getMediaTypes()))) &&
            this.loadTime == other.getLoadTime() &&
            this.unloadTime == other.getUnloadTime() &&
            this.averagePosTime == other.getAveragePosTime() &&
            this.readTransferRate == other.getReadTransferRate() &&
            this.writeTransferRate == other.getWriteTransferRate() &&
            ((this.device==null && other.getDevice()==null) || 
             (this.device!=null &&
              this.device.equals(other.getDevice())));
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
        if (getVendorString() != null) {
            _hashCode += getVendorString().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getMediaTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMediaTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMediaTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getLoadTime();
        _hashCode += getUnloadTime();
        _hashCode += getAveragePosTime();
        _hashCode += new Float(getReadTransferRate()).hashCode();
        _hashCode += new Float(getWriteTransferRate()).hashCode();
        if (getDevice() != null) {
            _hashCode += getDevice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Drive.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gforge.cyfronet.pl/namespaces/hsmest/hsmmon", ">Drive"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorString");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vendorString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mediaTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mediaTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loadTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loadTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unloadTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unloadTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("averagePosTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "averagePosTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readTransferRate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "readTransferRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("writeTransferRate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "writeTransferRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("device");
        elemField.setXmlName(new javax.xml.namespace.QName("", "device"));
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
