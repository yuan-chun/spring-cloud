package com.yuanchun.zuul.filter;


import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class PostFilter extends ZuulFilter {

    private static Logger log = LoggerFactory.getLogger(PostFilter.class);

    @Override
    public String filterType() {
        //后置过滤器
        return "post";
    }

    @Override
    public int filterOrder() {
        //优先级，数字越大，优先级越低
        return 1;
    }

    /**
     *请求参数带上 filterFlag 测试
     * @return
     */
    @Override
    public boolean shouldFilter() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        String flag = request.getParameter("post");
        boolean filter = "true".equals(flag)? true:false;
        return filter;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        log.info("进入post过滤器");
        System.out.println("postfilter getResponseBody = "+ctx.getResponseBody());//null
        ctx.setResponseBody("post后配置数据");//此值可以传到errorFilter
        //int i = 1 / 0;
        return null;

    }
}