/**
 * StorageSystemInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Mar 03, 2006 (12:17:06 EST) WSDL2Java emitter.
 */

package pl.cyfronet.gforge.hsmest.hsmmon.stubs;

public class StorageSystemInfo  implements java.io.Serializable {
    private int type;
    private java.lang.String vendorString;
    private java.lang.String mountDir;
    private float totalCapacity;
    private float cacheCapacity;
    private float usage;
    private pl.cyfronet.gforge.hsmest.hsmmon.stubs.TransferRateInfo[] transferRates;

    public StorageSystemInfo() {
    }

    public StorageSystemInfo(
           float cacheCapacity,
           java.lang.String mountDir,
           float totalCapacity,
           pl.cyfronet.gforge.hsmest.hsmmon.stubs.TransferRateInfo[] transferRates,
           int type,
           float usage,
           java.lang.String vendorString) {
           this.type = type;
           this.vendorString = vendorString;
           this.mountDir = mountDir;
           this.totalCapacity = totalCapacity;
           this.cacheCapacity = cacheCapacity;
           this.usage = usage;
           this.transferRates = transferRates;
    }


    /**
     * Gets the type value for this StorageSystemInfo.
     * 
     * @return type
     */
    public int getType() {
        return type;
    }


    /**
     * Sets the type value for this StorageSystemInfo.
     * 
     * @param type
     */
    public void setType(int type) {
        this.type = type;
    }


    /**
     * Gets the vendorString value for this StorageSystemInfo.
     * 
     * @return vendorString
     */
    public java.lang.String getVendorString() {
        return vendorString;
    }


    /**
     * Sets the vendorString value for this StorageSystemInfo.
     * 
     * @param vendorString
     */
    public void setVendorString(java.lang.String vendorString) {
        this.vendorString = vendorString;
    }


    /**
     * Gets the mountDir value for this StorageSystemInfo.
     * 
     * @return mountDir
     */
    public java.lang.String getMountDir() {
        return mountDir;
    }


    /**
     * Sets the mountDir value for this StorageSystemInfo.
     * 
     * @param mountDir
     */
    public void setMountDir(java.lang.String mountDir) {
        this.mountDir = mountDir;
    }


    /**
     * Gets the totalCapacity value for this StorageSystemInfo.
     * 
     * @return totalCapacity
     */
    public float getTotalCapacity() {
        return totalCapacity;
    }


    /**
     * Sets the totalCapacity value for this StorageSystemInfo.
     * 
     * @param totalCapacity
     */
    public void setTotalCapacity(float totalCapacity) {
        this.totalCapacity = totalCapacity;
    }


    /**
     * Gets the cacheCapacity value for this StorageSystemInfo.
     * 
     * @return cacheCapacity
     */
    public float getCacheCapacity() {
        return cacheCapacity;
    }


    /**
     * Sets the cacheCapacity value for this StorageSystemInfo.
     * 
     * @param cacheCapacity
     */
    public void setCacheCapacity(float cacheCapacity) {
        this.cacheCapacity = cacheCapacity;
    }


    /**
     * Gets the usage value for this StorageSystemInfo.
     * 
     * @return usage
     */
    public float getUsage() {
        return usage;
    }


    /**
     * Sets the usage value for this StorageSystemInfo.
     * 
     * @param usage
     */
    public void setUsage(float usage) {
        this.usage = usage;
    }


    /**
     * Gets the transferRates value for this StorageSystemInfo.
     * 
     * @return transferRates
     */
    public pl.cyfronet.gforge.hsmest.hsmmon.stubs.TransferRateInfo[] getTransferRates() {
        return transferRates;
    }


    /**
     * Sets the transferRates value for this StorageSystemInfo.
     * 
     * @param transferRates
     */
    public void setTransferRates(pl.cyfronet.gforge.hsmest.hsmmon.stubs.TransferRateInfo[] transferRates) {
        this.transferRates = transferRates;
    }

    public pl.cyfronet.gforge.hsmest.hsmmon.stubs.TransferRateInfo getTransferRates(int i) {
        return this.transferRates[i];
    }

    public void setTransferRates(int i, pl.cyfronet.gforge.hsmest.hsmmon.stubs.TransferRateInfo _value) {
        this.transferRates[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StorageSystemInfo)) return false;
        StorageSystemInfo other = (StorageSystemInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.type == other.getType() &&
            ((this.vendorString==null && other.getVendorString()==null) || 
             (this.vendorString!=null &&
              this.vendorString.equals(other.getVendorString()))) &&
            ((this.mountDir==null && other.getMountDir()==null) || 
             (this.mountDir!=null &&
              this.mountDir.equals(other.getMountDir()))) &&
            this.totalCapacity == other.getTotalCapacity() &&
            this.cacheCapacity == other.getCacheCapacity() &&
            this.usage == other.getUsage() &&
            ((this.transferRates==null && other.getTransferRates()==null) || 
             (this.transferRates!=null &&
              java.util.Arrays.equals(this.transferRates, other.getTransferRates())));
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
        _hashCode += getType();
        if (getVendorString() != null) {
            _hashCode += getVendorString().hashCode();
        }
        if (getMountDir() != null) {
            _hashCode += getMountDir().hashCode();
        }
        _hashCode += new Float(getTotalCapacity()).hashCode();
        _hashCode += new Float(getCacheCapacity()).hashCode();
        _hashCode += new Float(getUsage()).hashCode();
        if (getTransferRates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransferRates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransferRates(), i);
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
        new org.apache.axis.description.TypeDesc(StorageSystemInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gforge.cyfronet.pl/namespaces/hsmest/hsmmon", ">StorageSystemInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorString");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vendorString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mountDir");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mountDir"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCapacity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalCapacity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cacheCapacity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cacheCapacity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferRates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gforge.cyfronet.pl/namespaces/hsmest/hsmmon", "transferRates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gforge.cyfronet.pl/namespaces/hsmest/hsmmon", ">TransferRateInfo"));
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
