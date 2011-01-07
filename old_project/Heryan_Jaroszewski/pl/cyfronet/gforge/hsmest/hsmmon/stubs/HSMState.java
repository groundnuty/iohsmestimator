/**
 * HSMState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Mar 03, 2006 (12:17:06 EST) WSDL2Java emitter.
 */

package pl.cyfronet.gforge.hsmest.hsmmon.stubs;

public class HSMState  implements java.io.Serializable {
    private pl.cyfronet.gforge.hsmest.hsmmon.stubs.HSMFileInfo[] fileQueue;
    private pl.cyfronet.gforge.hsmest.hsmmon.stubs.HSMDriveState[] drive;

    public HSMState() {
    }

    public HSMState(
           pl.cyfronet.gforge.hsmest.hsmmon.stubs.HSMDriveState[] drive,
           pl.cyfronet.gforge.hsmest.hsmmon.stubs.HSMFileInfo[] fileQueue) {
           this.fileQueue = fileQueue;
           this.drive = drive;
    }


    /**
     * Gets the fileQueue value for this HSMState.
     * 
     * @return fileQueue
     */
    public pl.cyfronet.gforge.hsmest.hsmmon.stubs.HSMFileInfo[] getFileQueue() {
        return fileQueue;
    }


    /**
     * Sets the fileQueue value for this HSMState.
     * 
     * @param fileQueue
     */
    public void setFileQueue(pl.cyfronet.gforge.hsmest.hsmmon.stubs.HSMFileInfo[] fileQueue) {
        this.fileQueue = fileQueue;
    }

    public pl.cyfronet.gforge.hsmest.hsmmon.stubs.HSMFileInfo getFileQueue(int i) {
        return this.fileQueue[i];
    }

    public void setFileQueue(int i, pl.cyfronet.gforge.hsmest.hsmmon.stubs.HSMFileInfo _value) {
        this.fileQueue[i] = _value;
    }


    /**
     * Gets the drive value for this HSMState.
     * 
     * @return drive
     */
    public pl.cyfronet.gforge.hsmest.hsmmon.stubs.HSMDriveState[] getDrive() {
        return drive;
    }


    /**
     * Sets the drive value for this HSMState.
     * 
     * @param drive
     */
    public void setDrive(pl.cyfronet.gforge.hsmest.hsmmon.stubs.HSMDriveState[] drive) {
        this.drive = drive;
    }

    public pl.cyfronet.gforge.hsmest.hsmmon.stubs.HSMDriveState getDrive(int i) {
        return this.drive[i];
    }

    public void setDrive(int i, pl.cyfronet.gforge.hsmest.hsmmon.stubs.HSMDriveState _value) {
        this.drive[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HSMState)) return false;
        HSMState other = (HSMState) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fileQueue==null && other.getFileQueue()==null) || 
             (this.fileQueue!=null &&
              java.util.Arrays.equals(this.fileQueue, other.getFileQueue()))) &&
            ((this.drive==null && other.getDrive()==null) || 
             (this.drive!=null &&
              java.util.Arrays.equals(this.drive, other.getDrive())));
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
        if (getFileQueue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFileQueue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFileQueue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDrive() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDrive());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDrive(), i);
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
        new org.apache.axis.description.TypeDesc(HSMState.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gforge.cyfronet.pl/namespaces/hsmest/hsmmon", ">HSMState"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileQueue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gforge.cyfronet.pl/namespaces/hsmest/hsmmon", "fileQueue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gforge.cyfronet.pl/namespaces/hsmest/hsmmon", ">HSMFileInfo"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("drive");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gforge.cyfronet.pl/namespaces/hsmest/hsmmon", "drive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gforge.cyfronet.pl/namespaces/hsmest/hsmmon", ">HSMDriveState"));
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
