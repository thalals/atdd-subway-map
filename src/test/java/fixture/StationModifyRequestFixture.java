package fixture;

import java.util.HashMap;
import java.util.Map;

public class StationModifyRequestFixture {

    public static final String 지하철역이름 = "지하철역이름";
    public static final String 새로운지하철역이름 = "새로운지하철역이름";
    public static final String 또다른지하철역이 = "또다른지하철역이";
    public static final String 강남역 = "강남역";

    public static Map<String, Object> 노선수정요청_데이터_생성(String name, String color) {

        Map<String, Object> params = new HashMap<>();

        params.put("name", name);
        params.put("color", color);

        return params;
    }}