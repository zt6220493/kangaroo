package io.github.pactstart.rong360.push.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class RepaymentVerifyCodeBean {


    /**
     * order_no : 245132241561415
     * period_nos : 1
     * verify_code : 234563
     */

    private String order_no;
    private String period_nos;
    private String verify_code;
}
