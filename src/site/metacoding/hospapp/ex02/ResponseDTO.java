package site.metacoding.hospapp.ex02;

import java.util.List;

class Body {

    private String items;
    private String numOfRows;
    private String pageNo;
    private String totalCount;
}

class Header {

    private String resultCode;
    private String resultMsg;
}

class Item {

    private String addr;
    private String mgtStaDd;
    private String pcrPsblYn;
    private String ratPsblYn;
    private String recuClCd;
    private String rprtWorpClicFndtTgtYn;
    private String sgguCdNm;
    private String sidoCdNm;
    private String telno;
    private String xPos;
    private String xPosWgs84;
    private String yPos;
    private String yPosWgs84;
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

public class ResponseDTO {

    private Response response;

}