/**
 *
 */
package co.net.parking.enums;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * <b>Descripcion:</b> Clase que <br/>
 * <b>Módulo:</b> Parking SIP- <br/>
 *
 * @author jbedoya <jbedoya@heinsohn.com.co>
 */
@XmlRootElement
public enum RolEnum implements Serializable{
    SIP,
    SIP_OPERARIO,
    SIP_SISTEMAS,
    SIP_COORDINADOR,
    APP_MOVIL_USER,
    APP_MOVIL,
    MASS,
    PARKING_WEB,
    PARKING_WEB_ADMIN,
    CARGA_STICKER,
    INTEGRACION_SKIDATA,
    
}
