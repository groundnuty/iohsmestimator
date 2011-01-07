/**
 * TapeArray.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Mar 03, 2006 (12:17:06 EST) WSDL2Java emitter.
 */

package pl.cyfronet.gforge.hsmest.hsmmon.stubs;

public class TapeArray  implements java.io.Serializable {
    private int size;
    private pl.cyfronet.gforge.hsmest.hsmmon.stubs.Tape[] tapeMap;

    public TapeArray() {
    }

    public TapeArray(
           int size,
           pl.cyfronet.gforge.hsmest.hsmmon.stubs.Tape[] tapeMap) {
           this.size = size;
           this.tapeMap = tapeMap;
    }


    /**
     * Gets the size value for this TapeArray.
     * 
     * @return size
     */
    public int getSize() {
        return size;
    }


    /**
     * Sets the size value for this TapeArray.
     * 
     * @param size
     */
    public void setSize(int size) {
        this.size = size;
    }


    /**
     * Gets the tapeMap value for this TapeArray.
     * 
     * @return tapeMap
     */
    public pl.cyfronet.gforge.hsmest.hsmmon.stubs.Tape[] getTapeMap() {
        return tapeMap;
    }


    /**
     * Sets the tapeMap value for this TapeArray.
     * 
     * @param tapeMap
     */
    public void setTapeMap(pl.cyfronet.gforge.hsmest.hsmmon.stubs.Tape[] tapeMap) {
        this.tapeMap = tapeMap;
    }

    public pl.cyfronet.gforge.hsmest.hsmmon.stubs.Tape getTapeMap(int i) {
        return this.tapeMap[i];
    }

    public void setTapeMap(int i, pl.cyfronet.gforge.hsmest.hsmmon.stubs.Tape _value) {
        this.tapeMap[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TapeArray)) return false;
        TapeArray other = (TapeArray) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.size == other.getSize() &&
            ((this.tapeMap==null && other.getTapeMap()==null) || 
             (this.tapeMap!=null &&
              java.util.Arrays.equals(this.tapeMap, other.getTapeMap())));
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
        _hashCode += getSize();
        if (getTapeMap() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTapeMap());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTapeMap(), i);
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
        new org.apache.axis.description.TypeDesc(TapeArray.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gforge.cyfronet.pl/namespaces/hsmest/hsmmon", ">TapeArray"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("", "size"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tapeMap");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gforge.cyfronet.pl/namespaces/hsmest/hsmmon", "tapeMap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gforge.cyfronet.pl/namespaces/hsmest/hsmmon", ">Tape"));
        elemField.setMinOccurs(0);
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
