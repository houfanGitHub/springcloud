package com.example.zuulservice.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Component
public class QueryParamPreFilter extends ZuulFilter {

    @Override
    public int filterOrder() {
        return 0;
//        return PRE_DECORATION_FILTER_ORDER - 1; // run before PreDecoration
    }

    @Override
    public String filterType() {
        return "pre";
//        return PRE_TYPE;
    }

    @Override
    public boolean shouldFilter() {
//        RequestContext ctx = RequestContext.getCurrentContext();
//        return !ctx.containsKey(FORWARD_TO_KEY) // a filter has already forwarded
//                && !ctx.containsKey(SERVICE_ID_KEY); // a filter has already determined serviceId
        return true;
    }
    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        String message = ctx.getRequest().getParameter("message");
        if (message == null) {
            // 设置zuul过滤器不向下进行过滤
            ctx.setSendZuulResponse(false);
            // 设置返回的code
            ctx.setResponseStatusCode(401);
            PrintWriter printWriter = null;
            try {
                HttpServletResponse response = ctx.getResponse();
                response.setCharacterEncoding("utf-8");
                response.setContentType("text/html; charset=utf-8");
                printWriter =  response.getWriter();
               printWriter.write("参数message不能为空");
               printWriter.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                if(printWriter != null){
                    printWriter.close();
                }
            }
        }
        return null;
    }
}
