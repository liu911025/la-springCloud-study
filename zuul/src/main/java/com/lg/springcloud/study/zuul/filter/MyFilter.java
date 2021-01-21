package com.lg.springcloud.study.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

/**
 * 过滤器的使用方式是采取责任链的方式进行处理，过滤器之间通过 RequestContext 来传递上下文;
 * RequestContext context = RequestContext.getCurrentContext();
 */
@Component
public class MyFilter extends ZuulFilter {

    /**
     * filterType 方法是要返回过滤器的类型，
     * 可选值有 pre、route、post、error 四种类型
     * pre > route > post 期间出现异常则走error
     * 可查看ZuulServlet.service()方法;
     * @return
     */
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    /**
     * filterOrder 来指定过滤器的执行顺序，数字越小，优先级越高
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * shouldFilter 方法决定了是否执行该过滤器，true 为执行，false 为不执行
     *  利用配置中心来做，达到动态的开启或关闭过滤器
     * @return
     */
    @Override
    public boolean shouldFilter() {
        System.err.println("MyFilter.shouldFilter...");
        return true;
    }

    /**
     * 具体业务逻辑
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        System.err.println("MyFilter run ...");
        RequestContext context = RequestContext.getCurrentContext();

        return null;
    }
}
