package com.yuanchun.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class ErrorFilter extends ZuulFilter {

    private static Logger log = LoggerFactory.getLogger(PreFilter.class);
    /**
     * pre：可以在请求被路由之前调用
     * routing： 路由请求时被调用
     * post：在routing和error过滤器之后被调用
     * error 处理请求时发生错误时被调用
     * @return
     */
    @Override
    public String filterType() {
        return "error";
    }

    /**
     * int值来定义过滤器的执行顺序，数值越小优先级越高
     * @return
     */
    @Override
    public int filterOrder() {
        return 2;
    }

    /**
     * 返回一个boolean值来判断该过滤器是否要执行。
     * 我们可以通过此方法来指定过滤器的有效范围
     * 请求参数带上 filterFlag 测试
     * @return
     */
    @Override
    public boolean shouldFilter() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        String flag = request.getParameter("error");
        boolean filter = "true".equals(flag)? true:false;
        return filter;
    }

    /**
     * 过滤器的具体逻辑。
     * @return
     */
    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        log.info("进入异常过滤器");
        System.out.println("errorfilter getResponseBody = "+ctx.getResponseBody());
        ctx.setResponseBody("error后配置数据");
        return null;
    }
}
