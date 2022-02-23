package site.metacoding.hospapp.ex01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

//1. 다운로드

public class DownloadTest {

    public static void main(String[] args) {
        StringBuffer sburlUrl = new StringBuffer();
        sburlUrl.append("http://apis.data.go.kr/B551182/rprtHospService/getRprtHospService");
        sburlUrl.append("?serviceKey=");// 서비스키
        sburlUrl.append("wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D");
        sburlUrl.append("&pageNo=");// 몇번째 페이지
        sburlUrl.append("1");
        sburlUrl.append("&numOfRows=");
        sburlUrl.append("10");// 한페이지당 몇개씩 가져올지
        sburlUrl.append("&_type=");
        sburlUrl.append("json");// 데이터 포맷은 json

        try {
            URL url = new URL(sburlUrl.toString());
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));

            StringBuffer sbDownload = new StringBuffer(); // 통신결과모아두기

            while (true) {
                String input = br.readLine();
                // sbDownload.append(input); append에 null을 넣으면 안됨!!
                if (input == null) {
                    break;
                }
                sbDownload.append(input);

            }
            System.out.println(sbDownload.toString());
        } catch (Exception e) {

        }

    }

}
