package io.github.pactstart.weixin.mp.request.kfaccount;

import io.github.pactstart.weixin.common.response.DefaultJsonResponse;

/**
 * Created by Di.Lei on 2017/8/2.
 */
public class KfAccountDeleteRequest extends KfAccountRequest<DefaultJsonResponse> {

    @Override
    public String getRequestPath() {
        return "/customservice/kfaccount/del?access_token=" + getAccessToken();
    }

}
