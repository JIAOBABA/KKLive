package com.kk.kklive.constants;

/**
 * Created by fei on 2016/9/20.
 */
public class HttpConstant {
    //动态火热头布局接口
    public static final String  DYNAMIC_HOT_PATH ="http://api.kktv1.com:8080/meShow/entrance?parameter={\"platform\":2,\"c\":216,\"FuncTag\":20000402,\"userId\":111565757,\"a\":1}";
    //动态ListView接口
    public static final String  DYNAMIC_HOT_MAIN_PATH="http://api.kktv1.com:8080/meShow/entrance?parameter={\"platform\":2,\"offset\":10,\"start\":%d2,\"c\":216,\"FuncTag\":20006022,\"userId\":111565757,\"a\":1}";
    //图片拼接
    public static final String IMAGE_BASE_PATH ="http://ures.kktv8.com/kktv";
    //动态关注接口
    public static final String DYNAMIC_ATTENTION_PATH="http://api.kktv1.com:8080/meShow/entrance?parameter={\"userIds\":\"%s\",\"platform\":2,\"c\":216,\"FuncTag\":10002033,\"a\":1}";
    //广告接口
    public static final String ADVERTISEMENT_URL="http://www.kktv1.com/CDN/output/M/1440/I/10002006/P/a-1_c-70036_platform-2_isTop-1_version-79/json.js";
    //人气主播
    public static final String POPULAR_ANCHOR_URL="http://www.kktv1.com/CDN/output/M/1/I/55000003/P/a-1_c-70036_start-0_offset-20_platform-2_type-2/json.js";
    //明星等级
    public static final String STAR_RATING_URL="http://www.kktv1.com/CDN/output/M/1/I/55000003/P/a-1_c-70036_start-0_offset-20_platform-2_type-3/json.js";
    //最近开播
    public static final String RECENTLY_LAUNCHED_URL="http://www.kktv1.com/CDN/output/M/1/I/55000003/P/a-1_c-70036_start-0_offset-20_platform-2_type-4/json.js";
    //频道
    public static final String CHANNEL_URL="http://www.kktv1.com/CDN/output/M/1/I/55000004/P/a-1_c-70036_platform-2/json.js";
    //首页推荐
    public static final String HOME_PAGE_RECOMMEND_URL ="http://api.kktv1.com:8080/meShow/entrance?parameter={\"a\":1,\"c\":70036,\"FuncTag\":55000002,\"start\":0,\"offset\":14,\"platform\":2}";
    //周星争夺战
    public static final String STAR_WARS_URL = "http://api.kktv1.com:8080/meShow/entrance?parameter={\"a\":1,\"c\":70036,\"FuncTag\":10002011,\"platform\":2,\"userId\":112731886}";
    //同城主播
    public static final String CITY_ANCHOR_URL = "http://api.kktv1.com:8080/meShow/entrance?parameter={\"a\":2,\"c\":70036,\"FuncTag\":20010401,\"start\":0,\"offset\":4,\"gender\":-1,\"cityName\":\"%E6%B5%B7%E6%B7%80nbsp%E5%8C%97%E4%BA%ACnbsp%E5%8C%97%E4%BA%AC\",\"platform\":2}";
    //


}
