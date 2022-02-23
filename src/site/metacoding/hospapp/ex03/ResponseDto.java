package site.metacoding.hospapp.ex03;

import java.util.List;

import lombok.Data;

class Body {

    private Items items;
    private Integer numOfRows;
    private Integer pageNo;
    private Integer totalCount;
}

class Header {

    private String resultCode;
    private String resultMsg;
}

class Item {

    private String addr;
    private Integer mgtStaDd;
    private String pcrPsblYn;
    private String ratPsblYn;
    private Integer recuClCd;3
    private String rprtWorpClicFndtTgtYn;
    private String sgguCdNm;
    private String sidoCdNm;
    private String telno;
    private Integer xPos;
    private Double xPosWgs84;
    private Integer yPos;
    private Double yPosWgs84;
    private String yadmNm;
    private String ykihoEnc;

}

class Items {

    private List<Item> item;
}

class Response {

    private Header header;
    private Body body;

}

public class ResponseDto {

    private Response response;
}