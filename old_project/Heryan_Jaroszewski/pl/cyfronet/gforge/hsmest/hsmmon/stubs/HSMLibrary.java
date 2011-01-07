/**
 * HSMLibrary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Mar 03, 2006 (12:17:06 EST) WSDL2Java emitter.
 */

package pl.cyfronet.gforge.hsmest.hsmmon.stubs;

public class HSMLibrary  implements java.io.Serializable {
    private int id;
    private int numberOfSlots;
    private int numberOfDrives;
    private java.lang.String vendorString;
    private int mountTime;
    private int dismountTime;
    private pl.cyfronet.gforge.hsmest.hsmmon.stubs.Slot[] inventory;
    private pl.cyfronet.gforge.hsmest.hsmmon.stubs.Drive[] drive;
    private java.lang.String device;

    public HSMLibrary() {
    }

    public HSMLibrary(
           java.lang.String device,
           int dismountTime,
           pl.cyfronet.gforge.hsmest.hsmmon.stubs.Drive[] drive,
           int id,
           pl.cyfronet.gforge.hsmest.hsmmon.stubs.Slot[] inventory,
           int mountTime,
           int numberOfDrives,
           int numberOfSlots,
           java.lang.String vendorString) {
           this.id = id;
           this.numberOfSlots = numberOfSlots;
           this.numberOfDrives = numberOfDrives;
           this.vendorString = vendorString;
           this.mountTime = mountTime;
           this.dismountTime = dismountTime;
           this.inventory = inventory;
           this.drive = drive;
           this.device = device;
    }


    /**
     * Gets the id value for this HSMLibrary.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this HSMLibrary.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the numberOfSlots value for this HSMLibrary.
     * 
     * @return numberOfSlots
     */
    public int getNumberOfSlots() {
        return numberOfSlots;
    }


    /**
     * Sets the numberOfSlots value for this HSMLibrary.
     * 
     * @param numberOfSlots
     */
    public void setNumberOfSlots(int numberOfSlots) {
        this.numberOfSlots = numberOfSlots;
    }


    /**
     * Gets the numberOfDrives value for this HSMLibrary.
     * 
     * @return numberOfDrives
     */
    public int getNumberOfDrives() {
        return numberOfDrives;
    }


    /**
     * Sets the numberOfDrives value for this HSMLibrary.
     * 
     * @param numberOfDrives
     */
    public void setNumberOfDrives(int numberOfDrives) {
        this.numberOfDrives = numberOfDrives;
    }


    /**
     * Gets the vendorString value for this HSMLibrary.
     * 
     * @return vendorString
     */
    public java.lang.String getVendorString() {
        return vendorString;
    }


    /**
     * Sets the vendorString value for this HSMLibrary.
     * 
     * @param vendorString
     */
    public void setVendorString(java.lang.String vendorString) {
        this.vendorString = vendorString;
    }


    /**
     * Gets the mountTime value for this HSMLibrary.
     * 
     * @return mountTime
     */
    public int getMountTime() {
        return mountTime;
    }


    /**
     * Sets the mountTime value for this HSMLibrary.
     * 
     * @param mountTime
     */
    public void setMountTime(int mountTime) {
        this.mountTime = mountTime;
    }


    /**
     * Gets the dismountTime value for this HSMLibrary.
     * 
     * @return dismountTime
     */
    public int getDismountTime() {
        return dismountTime;
    }


    /**
     * Sets the dismountTime value for this HSMLibrary.
     * 
     * @param dismountTime
     */
    public void setDismountTime(int dismountTime) {
        this.dismountTime = dismountTime;
    }


    /**
     * Gets the inventory value for this HSMLibrary.
     * 
     * @return inventory
     */
    public pl.cyfronet.gforge.hsmest.hsmmon.stubs.Slot[] getInventory() {
        return inventory;
    }


    /**
     * Sets the inventory value for this HSMLibrary.
     * 
     * @param inventory
     */
    public void setInventory(pl.cyfronet.gforge.hsmest.hsmmon.stubs.Slot[] inventory) {
        this.inventory = inventory;
    }

    public pl.cyfronet.gforge.hsmest.hsmmon.stubs.Slot getInventory(int i) {
        return this.inventory[i];
    }

    public void setInventory(int i, pl.cyfronet.gforge.hsmest.hsmmon.stubs.Slot _value) {
        this.inventory[i] = _value;
    }


    /**
     * Gets the drive value for this HSMLibrary.
     * 
     * @return drive
     */
    public pl.cyfronet.gforge.hsmest.hsmmon.stubs.Drive[] getDrive() {
        return drive;
    }


    /**
     * Sets the drive value for this HSMLibrary.
     * 
     * @param drive
     */
    public void setDrive(pl.cyfronet.gforge.hsmest.hsmmon.stubs.Drive[] drive) {
        this.drive = drive;
    }

    public pl.cyfronet.gforge.hsmest.hsmmon.stubs.Drive getDrive(int i) {
        return this.drive[i];
    }

    public void setDrive(int i, pl.cyfronet.gforge.hsmest.hsmmon.stubs.Drive _value) {
        this.drive[i] = _value;
    }


    /**
     * Gets the device value for this HSMLibrary.
     * 
     * @return device
     */
    public java.lang.String getDevice() {
        return device;
    }


    /**
     * Sets the device value for this HSMLibrary.
     * 
     * @param device
     */
    public void setDevice(java.lang.String device) {
        this.device = device;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HSMLibrary)) return false;
        HSMLibrary other = (HSMLibrary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            this.numberOfSlots == other.getNumberOfSlots() &&
            this.numberOfDrives == other.getNumberOfDrives() &&
            ((this.vendorString==null && other.getVendorString()==null) || 
             (this.vendorString!=null &&
              this.vendorString.equals(other.getVendorString()))) &&
            this.mountTime == other.getMountTime() &&
            this.dismountTime == other.getDismountTime() &&
            ((this.inventory==null && other.getInventory()==null) || 
             (this.inventory!=null &&
              java.util.Arrays.equals(this.inventory, other.getInventory()))) &&
            ((this.drive==null && other.getDrive()==null) || 
             (this.drive!=null &&
              java.util.Arrays.equals(this.drive, other.getDrive()))) &&
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
        _hashCode += getNumberOfSlots();
        _hashCode += getNumberOfDrives();
        if (getVendorString() != null) {
            _hashCode += getVendorString().hashCode();
        }
        _hashCode += getMountTime();
        _hashCode += getDismountTime();
        if (getInventory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInventory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInventory(), i);
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
        if (getDevice() != null) {
            _hashCode += getDevice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HSMLibrary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.gforge.cyfronet.pl/namespaces/hsmest/hsmmon", ">HSMLibrary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfSlots");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberOfSlots"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfDrives");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberOfDrives"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorString");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vendorString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mountTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mountTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dismountTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dismountTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inventory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gforge.cyfronet.pl/namespaces/hsmest/hsmmon", "inventory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gforge.cyfronet.pl/namespaces/hsmest/hsmmon", ">Slot"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("drive");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.gforge.cyfronet.pl/namespaces/hsmest/hsmmon", "drive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.gforge.cyfronet.pl/namespaces/hsmest/hsmmon", ">Drive"));
        elemField.setMinOccurs(0);
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
