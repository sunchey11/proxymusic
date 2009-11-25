
package proxymusic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fan.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="fan">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="accel"/>
 *     &lt;enumeration value="rit"/>
 *     &lt;enumeration value="none"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "fan")
@XmlEnum
public enum Fan {

    @XmlEnumValue("accel")
    ACCEL("accel"),
    @XmlEnumValue("rit")
    RIT("rit"),
    @XmlEnumValue("none")
    NONE("none");
    private final java.lang.String value;

    Fan(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static Fan fromValue(java.lang.String v) {
        for (Fan c: Fan.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
