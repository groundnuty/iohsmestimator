/**
 * LibrariesInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Mar 03, 2006 (12:17:06 EST) WSDL2Java emitter.
 */

package pl.cyfronet.gforge.hsmest.hsmmon.stubs;

public class LibrariesInfo  implements java.io.Serializable {
    private int size;
    private pl.cyfronet.gforge.hsmest.hsmmon.stubs.HSMLibrary[] libraries;

    public LibrariesInfo() {
    }

    public LibrariesInfo(
           pl.cyfronet.gforge.hsmest.hsmmon.stubs.HSMLibrary[] libraries,
           int size) {
           this.size = size;
           this.libraries = libraries;
    }


    /**
     * Gets the size value for this LibrariesInfo.
     * 
     * @return size
     */
    public int getSize() {
        return size;
    }


    /**
     * Sets the size value for this LibrariesInfo.
     * 
     * @param size
     */
    public void setSize(int size) {
        this.size = size;
    }


    /**
     * Gets the libraries value for this LibrariesInfo.
     * 
     * @return libraries
     */
    public pl.cyfronet.gforge.hsmest.hsmmon.stubs.HSMLibrary[] getLibraries() {
        return libraries;
    }


    /**
     * Sets the libraries value for this LibrariesInfo.
     * 
     * @param libraries
     */
    public void setLibraries(pl.cyfronet.gforge.hsmest.hsmmon.stubs.HSMLibrary[] libraries) {
        this.libraries = libraries;
    }

    public pl.cyfronet.gforge.hsmest.hsmmon.stubs.HSMLibrary getLibraries(int i) {
        return this.libraries[i];
    }

    public void setLibraries(int i, pl.cyfronet.gforge.hsmest.hsmmon.stubs.HSMLibrary _value) {
        this.libraries[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LibrariesInfo)) return false;
        LibrariesInfo other = (LibrariesInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.size == other.getSize() &&
            ((this.libraries==null && other.getLibraries()==null) || 
             (this.libraries!=null &&
              java.util.Arrays.equals(this.libraries, other.getLibraries())));
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
        if (getLibraries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLibraries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLibraries(), i);
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
        new org.apache.axis.description.TypeDesc(LibrariesInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gforge.cyfronet.pl/namespaces/hsmest/hsmmon", ">LibrariesInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("", "size"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("libraries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gforge.cyfronet.pl/namespaces/hsmest/hsmmon", "libraries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gforge.cyfronet.pl/namespaces/hsmest/hsmmon", ">HSMLibrary"));
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
