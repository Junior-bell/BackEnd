package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("Hotel")
@Data
public class Hotel {

    @Value("12345")
    private Integer HotelId;

    @Value("${Hotel.name}")
    private String HotelName;

    @Value("${Hotel.addrs}")
    private String HotelAddrs;

    @Value("${Hotel.ContactNo}")
    private Long HotelMobNo;

    @Value("${Customer.Name}")
    private String CustName;

    @Value("#{MenuP.dosarate + MenuP.Idlyrate}") // SPEL for arithmetic operation
    private Float billAmount;

    @Value("${os.name}")
    private String osName;

    @Value("${user.name}")
    private String userName;

    @Value("${Path}")
    private String pathdate;

    @Override
    public String toString() {
        return "Hotel [HotelId=" + HotelId + ", HotelName=" + HotelName + ", HotelAddrs=" + HotelAddrs + ", HotelMobNo="
                + HotelMobNo + ", CustName=" + CustName + ", billAmount=" + billAmount + ", osName=" + osName
                + ", userName=" + userName + ", pathdate=" + pathdate + "]";
    }
}
