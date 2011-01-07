/**
 * Estimation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Feb 27, 2008 (08:34:14 CST) WSDL2Java emitter.
 */

package pl.cyfronet.gforge.hsmest.ruleest.stubs;

public class Estimation  implements java.io.Serializable {
    private float latency;
    private float bandwidth;
    private int size;

    public Estimation() {
    }

    public Estimation(
           float bandwidth,
           float latency,
           int size) {
           this.latency = latency;
           this.bandwidth = bandwidth;
           this.size = size;
    }


    /**
     * Gets the latency value for this Estimation.
     * 
     * @return latency
     */
    public float getLatency() {
        return latency;
    }


    /**
     * Sets the latency value for this Estimation.
     * 
     * @param latency
     */
    public void setLatency(float latency) {
        this.latency = latency;
    }


    /**
     * Gets the bandwidth value for this Estimation.
     * 
     * @return bandwidth
     */
    public float getBandwidth() {
        return bandwidth;
    }


    /**
     * Sets the bandwidth value for this Estimation.
     * 
     * @param bandwidth
     */
    public void setBandwidth(float bandwidth) {
        this.bandwidth = bandwidth;
    }


    /**
     * Gets the size value for this Estimation.
     * 
     * @return size
     */
    public int getSize() {
        return size;
    }


    /**
     * Sets the size value for this Estimation.
     * 
     * @param size
     */
    public void setSize(int size) {
        this.size = size;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Estimation)) return false;
        Estimation other = (Estimation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.latency == other.getLatency() &&
            this.bandwidth == other.getBandwidth() &&
            this.size == other.getSize();
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
        _hashCode += new Float(getLatency()).hashCode();
        _hashCode += new Float(getBandwidth()).hashCode();
        _hashCode += getSize();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Estimation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gforge.cyfronet.pl/namespaces/hsmest/ruleest", ">Estimation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "latency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bandwidth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bandwidth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("", "size"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
