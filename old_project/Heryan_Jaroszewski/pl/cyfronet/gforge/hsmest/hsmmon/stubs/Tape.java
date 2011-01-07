/**
 * Tape.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Mar 03, 2006 (12:17:06 EST) WSDL2Java emitter.
 */

package pl.cyfronet.gforge.hsmest.hsmmon.stubs;

public class Tape  implements java.io.Serializable {
    private java.lang.String tapeID;
    private java.lang.String mediaType;
    private int usage;
    private java.util.Calendar lastMountTime;
    private int blockSize;
    private int capacity;
    private float capacityUsage;
    private int copyNumber;

    public Tape() {
    }

    public Tape(
           int blockSize,
           int capacity,
           float capacityUsage,
           int copyNumber,
           java.util.Calendar lastMountTime,
           java.lang.String mediaType,
           java.lang.String tapeID,
           int usage) {
           this.tapeID = tapeID;
           this.mediaType = mediaType;
           this.usage = usage;
           this.lastMountTime = lastMountTime;
           this.blockSize = blockSize;
           this.capacity = capacity;
           this.capacityUsage = capacityUsage;
           this.copyNumber = copyNumber;
    }


    /**
     * Gets the tapeID value for this Tape.
     * 
     * @return tapeID
     */
    public java.lang.String getTapeID() {
        return tapeID;
    }


    /**
     * Sets the tapeID value for this Tape.
     * 
     * @param tapeID
     */
    public void setTapeID(java.lang.String tapeID) {
        this.tapeID = tapeID;
    }


    /**
     * Gets the mediaType value for this Tape.
     * 
     * @return mediaType
     */
    public java.lang.String getMediaType() {
        return mediaType;
    }


    /**
     * Sets the mediaType value for this Tape.
     * 
     * @param mediaType
     */
    public void setMediaType(java.lang.String mediaType) {
        this.mediaType = mediaType;
    }


    /**
     * Gets the usage value for this Tape.
     * 
     * @return usage
     */
    public int getUsage() {
        return usage;
    }


    /**
     * Sets the usage value for this Tape.
     * 
     * @param usage
     */
    public void setUsage(int usage) {
        this.usage = usage;
    }


    /**
     * Gets the lastMountTime value for this Tape.
     * 
     * @return lastMountTime
     */
    public java.util.Calendar getLastMountTime() {
        return lastMountTime;
    }


    /**
     * Sets the lastMountTime value for this Tape.
     * 
     * @param lastMountTime
     */
    public void setLastMountTime(java.util.Calendar lastMountTime) {
        this.lastMountTime = lastMountTime;
    }


    /**
     * Gets the blockSize value for this Tape.
     * 
     * @return blockSize
     */
    public int getBlockSize() {
        return blockSize;
    }


    /**
     * Sets the blockSize value for this Tape.
     * 
     * @param blockSize
     */
    public void setBlockSize(int blockSize) {
        this.blockSize = blockSize;
    }


    /**
     * Gets the capacity value for this Tape.
     * 
     * @return capacity
     */
    public int getCapacity() {
        return capacity;
    }


    /**
     * Sets the capacity value for this Tape.
     * 
     * @param capacity
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    /**
     * Gets the capacityUsage value for this Tape.
     * 
     * @return capacityUsage
     */
    public float getCapacityUsage() {
        return capacityUsage;
    }


    /**
     * Sets the capacityUsage value for this Tape.
     * 
     * @param capacityUsage
     */
    public void setCapacityUsage(float capacityUsage) {
        this.capacityUsage = capacityUsage;
    }


    /**
     * Gets the copyNumber value for this Tape.
     * 
     * @return copyNumber
     */
    public int getCopyNumber() {
        return copyNumber;
    }


    /**
     * Sets the copyNumber value for this Tape.
     * 
     * @param copyNumber
     */
    public void setCopyNumber(int copyNumber) {
        this.copyNumber = copyNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Tape)) return false;
        Tape other = (Tape) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tapeID==null && other.getTapeID()==null) || 
             (this.tapeID!=null &&
              this.tapeID.equals(other.getTapeID()))) &&
            ((this.mediaType==null && other.getMediaType()==null) || 
             (this.mediaType!=null &&
              this.mediaType.equals(other.getMediaType()))) &&
            this.usage == other.getUsage() &&
            ((this.lastMountTime==null && other.getLastMountTime()==null) || 
             (this.lastMountTime!=null &&
              this.lastMountTime.equals(other.getLastMountTime()))) &&
            this.blockSize == other.getBlockSize() &&
            this.capacity == other.getCapacity() &&
            this.capacityUsage == other.getCapacityUsage() &&
            this.copyNumber == other.getCopyNumber();
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
        if (getTapeID() != null) {
            _hashCode += getTapeID().hashCode();
        }
        if (getMediaType() != null) {
            _hashCode += getMediaType().hashCode();
        }
        _hashCode += getUsage();
        if (getLastMountTime() != null) {
            _hashCode += getLastMountTime().hashCode();
        }
        _hashCode += getBlockSize();
        _hashCode += getCapacity();
        _hashCode += new Float(getCapacityUsage()).hashCode();
        _hashCode += getCopyNumber();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Tape.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gforge.cyfronet.pl/namespaces/hsmest/hsmmon", ">Tape"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tapeID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tapeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mediaType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mediaType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastMountTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastMountTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "blockSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capacity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "capacity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capacityUsage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "capacityUsage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("copyNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "copyNumber"));
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
