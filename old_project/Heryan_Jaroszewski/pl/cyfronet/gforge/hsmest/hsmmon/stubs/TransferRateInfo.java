/**
 * TransferRateInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Mar 03, 2006 (12:17:06 EST) WSDL2Java emitter.
 */

package pl.cyfronet.gforge.hsmest.hsmmon.stubs;

public class TransferRateInfo  implements java.io.Serializable {
    private java.lang.String accessMethod;
    private float maxTransferRate;
    private float measuredTransferRate;

    public TransferRateInfo() {
    }

    public TransferRateInfo(
           java.lang.String accessMethod,
           float maxTransferRate,
           float measuredTransferRate) {
           this.accessMethod = accessMethod;
           this.maxTransferRate = maxTransferRate;
           this.measuredTransferRate = measuredTransferRate;
    }


    /**
     * Gets the accessMethod value for this TransferRateInfo.
     * 
     * @return accessMethod
     */
    public java.lang.String getAccessMethod() {
        return accessMethod;
    }


    /**
     * Sets the accessMethod value for this TransferRateInfo.
     * 
     * @param accessMethod
     */
    public void setAccessMethod(java.lang.String accessMethod) {
        this.accessMethod = accessMethod;
    }


    /**
     * Gets the maxTransferRate value for this TransferRateInfo.
     * 
     * @return maxTransferRate
     */
    public float getMaxTransferRate() {
        return maxTransferRate;
    }


    /**
     * Sets the maxTransferRate value for this TransferRateInfo.
     * 
     * @param maxTransferRate
     */
    public void setMaxTransferRate(float maxTransferRate) {
        this.maxTransferRate = maxTransferRate;
    }


    /**
     * Gets the measuredTransferRate value for this TransferRateInfo.
     * 
     * @return measuredTransferRate
     */
    public float getMeasuredTransferRate() {
        return measuredTransferRate;
    }


    /**
     * Sets the measuredTransferRate value for this TransferRateInfo.
     * 
     * @param measuredTransferRate
     */
    public void setMeasuredTransferRate(float measuredTransferRate) {
        this.measuredTransferRate = measuredTransferRate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransferRateInfo)) return false;
        TransferRateInfo other = (TransferRateInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accessMethod==null && other.getAccessMethod()==null) || 
             (this.accessMethod!=null &&
              this.accessMethod.equals(other.getAccessMethod()))) &&
            this.maxTransferRate == other.getMaxTransferRate() &&
            this.measuredTransferRate == other.getMeasuredTransferRate();
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
        if (getAccessMethod() != null) {
            _hashCode += getAccessMethod().hashCode();
        }
        _hashCode += new Float(getMaxTransferRate()).hashCode();
        _hashCode += new Float(getMeasuredTransferRate()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransferRateInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gforge.cyfronet.pl/namespaces/hsmest/hsmmon", ">TransferRateInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accessMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxTransferRate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxTransferRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("measuredTransferRate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "measuredTransferRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
