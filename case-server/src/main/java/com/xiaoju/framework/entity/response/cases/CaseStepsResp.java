package com.xiaoju.framework.entity.response.cases;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import lombok.Data;

@Data
public class CaseStepsResp {
    private Long caseId;
    private String caseName;
    private JSONArray caseSteps;
}
