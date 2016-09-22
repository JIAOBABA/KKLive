package com.kk.kklive.model;

import java.util.List;

/**
 * 首页模型
 * Created by fei on 2016/9/20.
 */
public class Recommend {


    /**
     * roomList : [{"roomId":10015,"userId":10015,"screenType":1,"nickname":"【狭路相逢】","onlineCount":2091,"maxCount":40000,"liveType":1,"livestarttime":1474530887000,"liveStream":"http://pull.kktv8.com/livekktv/10015.flv","actorLevel":14,"richLevel":6,"icon":0,"roomTheme":"狭路相逢勇者胜","roomMode":0,"roomGender":1,"gender":1,"roomType":1,"roomSource":1,"partPosition":1,"city":"沧州","starLevel":0,"portrait_path_original":"/portrait/20160913/16/10015_1326164.png","portrait_path_48":"/portrait/20160913/16/10015_1326164.png!48","portrait_path_128":"/portrait/20160913/16/10015_1326164.png!128","portrait_path_256":"/portrait/20160913/16/10015_1326164.png!256","portrait_path_272":"/portrait/20160913/16/10015_1326164.png!272","portrait_path_1280":"/portrait/20160913/16/10015_1326164.png!1280","portrait_path_400":"/portrait/20160913/16/10015_1326164.png!400","portrait_path_756":"/portrait/20160913/16/10015_1326164.png!756x567","poster_path_original":"/picture/2016/09/12/17/10015_1624.jpg","poster_path_1280":"/picture/2016/09/12/17/10015_1624.jpg!1280","poster_path_290":"/picture/2016/09/12/17/10015_1624.jpg!290x164","poster_path_272":"/picture/2016/09/12/17/10015_1624.jpg!272","poster_path_256":"/picture/2016/09/12/17/10015_1624.jpg!256","poster_path_208":"/picture/2016/09/12/17/10015_1624.jpg!208","poster_path_131":"/picture/2016/09/12/17/10015_1624.jpg!131","poster_path_128":"/picture/2016/09/12/17/10015_1624.jpg!128x96","poster_path_400":"/picture/2016/09/12/17/10015_1624.jpg!400","poster_path_756":"/picture/2016/09/12/17/10015_1624.jpg!756x567","poster_path_300":"/picture/2016/09/12/17/10015_1624.jpg!300"},{"roomId":104357526,"userId":104357526,"screenType":1,"nickname":"娜儿好累","onlineCount":4220,"maxCount":0,"liveType":1,"livestarttime":1474524116000,"liveStream":"http://pull.kktv8.com/livekktv/104357526.flv","actorLevel":20,"richLevel":10,"icon":0,"roomTheme":"我今天要吃传说中的 怪味豆·","roomMode":0,"roomGender":0,"gender":0,"roomType":1,"roomSource":1,"city":"成都","starLevel":3,"luckyId":616161,"validId":{"id":616161,"idType":1,"isLight":1,"newIdType":1,"endTime":1476806399,"idState":1,"isEnable":2,"remainDays":0,"backIcon":"http://ures.kktv8.com/kktv/virtualid/liang_org.png","iconType":4},"portrait_path_original":"/portrait/20160918/2/104357526_255414.jpg","portrait_path_48":"/portrait/20160918/2/104357526_255414.jpg!48","portrait_path_128":"/portrait/20160918/2/104357526_255414.jpg!128","portrait_path_256":"/portrait/20160918/2/104357526_255414.jpg!256","portrait_path_272":"/portrait/20160918/2/104357526_255414.jpg!272","portrait_path_1280":"/portrait/20160918/2/104357526_255414.jpg!1280","portrait_path_400":"/portrait/20160918/2/104357526_255414.jpg!400","portrait_path_756":"/portrait/20160918/2/104357526_255414.jpg!756x567","poster_path_original":"/picture/2016/09/17/12/104357526_4659.jpg","poster_path_1280":"/picture/2016/09/17/12/104357526_4659.jpg!1280","poster_path_290":"/picture/2016/09/17/12/104357526_4659.jpg!290x164","poster_path_272":"/picture/2016/09/17/12/104357526_4659.jpg!272","poster_path_256":"/picture/2016/09/17/12/104357526_4659.jpg!256","poster_path_208":"/picture/2016/09/17/12/104357526_4659.jpg!208","poster_path_131":"/picture/2016/09/17/12/104357526_4659.jpg!131","poster_path_128":"/picture/2016/09/17/12/104357526_4659.jpg!128x96","poster_path_400":"/picture/2016/09/17/12/104357526_4659.jpg!400","poster_path_756":"/picture/2016/09/17/12/104357526_4659.jpg!756x567","poster_path_300":"/picture/2016/09/17/12/104357526_4659.jpg!300"},{"roomId":112785330,"userId":112785330,"screenType":1,"nickname":"DD'静香","onlineCount":6541,"maxCount":0,"liveType":1,"livestarttime":1474530516000,"liveStream":"http://pull.kktv8.com/livekktv/112785330.flv","actorLevel":5,"richLevel":0,"icon":3,"isRookie":1,"roomTheme":"好个不断","roomMode":0,"roomGender":0,"gender":0,"roomType":1,"roomSource":1,"partPosition":3,"city":"成都","starLevel":0,"portrait_path_original":"/portrait/20160921/2/112785330_467584.png","portrait_path_48":"/portrait/20160921/2/112785330_467584.png!48","portrait_path_128":"/portrait/20160921/2/112785330_467584.png!128","portrait_path_256":"/portrait/20160921/2/112785330_467584.png!256","portrait_path_272":"/portrait/20160921/2/112785330_467584.png!272","portrait_path_1280":"/portrait/20160921/2/112785330_467584.png!1280","portrait_path_400":"/portrait/20160921/2/112785330_467584.png!400","portrait_path_756":"/portrait/20160921/2/112785330_467584.png!756x567","poster_path_original":"/picture/2016/09/22/0/112785330_5516.jpg","poster_path_1280":"/picture/2016/09/22/0/112785330_5516.jpg!1280","poster_path_290":"/picture/2016/09/22/0/112785330_5516.jpg!290x164","poster_path_272":"/picture/2016/09/22/0/112785330_5516.jpg!272","poster_path_256":"/picture/2016/09/22/0/112785330_5516.jpg!256","poster_path_208":"/picture/2016/09/22/0/112785330_5516.jpg!208","poster_path_131":"/picture/2016/09/22/0/112785330_5516.jpg!131","poster_path_128":"/picture/2016/09/22/0/112785330_5516.jpg!128x96","poster_path_400":"/picture/2016/09/22/0/112785330_5516.jpg!400","poster_path_756":"/picture/2016/09/22/0/112785330_5516.jpg!756x567","poster_path_300":"/picture/2016/09/22/0/112785330_5516.jpg!300"},{"roomId":101508038,"userId":101508038,"screenType":1,"nickname":"Mc北斗","onlineCount":9284,"maxCount":0,"liveType":1,"livestarttime":1474531658000,"liveStream":"http://pull.kktv8.com/livekktv/101508038.flv","actorLevel":18,"richLevel":9,"icon":0,"roomTheme":"友情千万丈！","roomMode":0,"roomGender":1,"gender":1,"roomType":1,"roomSource":1,"partPosition":4,"city":"辽阳","starLevel":2,"portrait_path_original":"/portrait/20160825/15/101508038_1524312.jpg","portrait_path_48":"/portrait/20160825/15/101508038_1524312.jpg!48","portrait_path_128":"/portrait/20160825/15/101508038_1524312.jpg!128","portrait_path_256":"/portrait/20160825/15/101508038_1524312.jpg!256","portrait_path_272":"/portrait/20160825/15/101508038_1524312.jpg!272","portrait_path_1280":"/portrait/20160825/15/101508038_1524312.jpg!1280","portrait_path_400":"/portrait/20160825/15/101508038_1524312.jpg!400","portrait_path_756":"/portrait/20160825/15/101508038_1524312.jpg!756x567","poster_path_original":"/poster/20160714/13/101508038_4344668.jpg","poster_path_1280":"/poster/20160714/13/101508038_4344668.jpg!1280","poster_path_290":"/poster/20160714/13/101508038_4344668.jpg!290x164","poster_path_272":"/poster/20160714/13/101508038_4344668.jpg!272","poster_path_256":"/poster/20160714/13/101508038_4344668.jpg!256","poster_path_208":"/poster/20160714/13/101508038_4344668.jpg!208","poster_path_131":"/poster/20160714/13/101508038_4344668.jpg!131","poster_path_128":"/poster/20160714/13/101508038_4344668.jpg!128x96","poster_path_400":"/poster/20160714/13/101508038_4344668.jpg!400","poster_path_756":"/poster/20160714/13/101508038_4344668.jpg!756x567","poster_path_300":"/poster/20160714/13/101508038_4344668.jpg!300"},{"roomId":111900335,"userId":111900335,"screenType":1,"nickname":"慧敏小宝贝","onlineCount":4482,"maxCount":0,"liveType":1,"livestarttime":1474525224000,"liveStream":"http://pull.kktv8.com/livekktv/111900335.flv","actorLevel":12,"richLevel":1,"icon":0,"roomTheme":"小宝贝","roomMode":0,"roomGender":0,"gender":0,"roomType":1,"roomSource":1,"partPosition":5,"city":"厦门","starLevel":0,"portrait_path_original":"/portrait/20160907/10/111900335_236559.jpg","portrait_path_48":"/portrait/20160907/10/111900335_236559.jpg!48","portrait_path_128":"/portrait/20160907/10/111900335_236559.jpg!128","portrait_path_256":"/portrait/20160907/10/111900335_236559.jpg!256","portrait_path_272":"/portrait/20160907/10/111900335_236559.jpg!272","portrait_path_1280":"/portrait/20160907/10/111900335_236559.jpg!1280","portrait_path_400":"/portrait/20160907/10/111900335_236559.jpg!400","portrait_path_756":"/portrait/20160907/10/111900335_236559.jpg!756x567","poster_path_original":"/picture/2016/09/05/19/111900335_849.png","poster_path_1280":"/picture/2016/09/05/19/111900335_849.png!1280","poster_path_290":"/picture/2016/09/05/19/111900335_849.png!290x164","poster_path_272":"/picture/2016/09/05/19/111900335_849.png!272","poster_path_256":"/picture/2016/09/05/19/111900335_849.png!256","poster_path_208":"/picture/2016/09/05/19/111900335_849.png!208","poster_path_131":"/picture/2016/09/05/19/111900335_849.png!131","poster_path_128":"/picture/2016/09/05/19/111900335_849.png!128x96","poster_path_400":"/picture/2016/09/05/19/111900335_849.png!400","poster_path_756":"/picture/2016/09/05/19/111900335_849.png!756x567","poster_path_300":"/picture/2016/09/05/19/111900335_849.png!300"},{"roomId":96945259,"userId":96945259,"screenType":1,"nickname":"夜❀柚子","onlineCount":3221,"maxCount":0,"liveType":1,"livestarttime":1474529200000,"liveStream":"http://pull.kktv8.com/livekktv/96945259.flv","actorLevel":17,"richLevel":6,"icon":0,"roomTheme":"刚","roomMode":0,"roomGender":0,"gender":0,"roomType":1,"roomSource":1,"partPosition":6,"city":"北京","starLevel":0,"portrait_path_original":"/portrait/20160515/23/96945259_5334.jpg","portrait_path_48":"/portrait/20160515/23/96945259_5334.jpg!48","portrait_path_128":"/portrait/20160515/23/96945259_5334.jpg!128","portrait_path_256":"/portrait/20160515/23/96945259_5334.jpg!256","portrait_path_272":"/portrait/20160515/23/96945259_5334.jpg!272","portrait_path_1280":"/portrait/20160515/23/96945259_5334.jpg!1280","portrait_path_400":"/portrait/20160515/23/96945259_5334.jpg!400","portrait_path_756":"/portrait/20160515/23/96945259_5334.jpg!756x567","poster_path_original":"/picture/2016/09/21/15/96945259_396.jpg","poster_path_1280":"/picture/2016/09/21/15/96945259_396.jpg!1280","poster_path_290":"/picture/2016/09/21/15/96945259_396.jpg!290x164","poster_path_272":"/picture/2016/09/21/15/96945259_396.jpg!272","poster_path_256":"/picture/2016/09/21/15/96945259_396.jpg!256","poster_path_208":"/picture/2016/09/21/15/96945259_396.jpg!208","poster_path_131":"/picture/2016/09/21/15/96945259_396.jpg!131","poster_path_128":"/picture/2016/09/21/15/96945259_396.jpg!128x96","poster_path_400":"/picture/2016/09/21/15/96945259_396.jpg!400","poster_path_756":"/picture/2016/09/21/15/96945259_396.jpg!756x567","poster_path_300":"/picture/2016/09/21/15/96945259_396.jpg!300"},{"roomId":112375580,"userId":112375580,"screenType":2,"nickname":"于熳Beata","onlineCount":1273,"maxCount":0,"liveType":2,"livestarttime":1474529090000,"liveStream":"http://pull.kktv8.com/livekktv/112375580.flv","actorLevel":8,"richLevel":0,"icon":0,"roomTheme":"陪我说话","roomMode":0,"roomGender":0,"gender":0,"roomType":10,"roomSource":10,"city":"郑州","starLevel":0,"portrait_path_original":"/portrait/20160908/17/112375580_349453.jpg","portrait_path_48":"/portrait/20160908/17/112375580_349453.jpg!48","portrait_path_128":"/portrait/20160908/17/112375580_349453.jpg!128","portrait_path_256":"/portrait/20160908/17/112375580_349453.jpg!256","portrait_path_272":"/portrait/20160908/17/112375580_349453.jpg!272","portrait_path_1280":"/portrait/20160908/17/112375580_349453.jpg!1280","portrait_path_400":"/portrait/20160908/17/112375580_349453.jpg!400","portrait_path_756":"/portrait/20160908/17/112375580_349453.jpg!756x567","poster_path_original":"/portrait/20160908/17/112375580_349453.jpg","poster_path_48":"/portrait/20160908/17/112375580_349453.jpg!48","poster_path_128":"/portrait/20160908/17/112375580_349453.jpg!128x96","poster_path_131":"/portrait/20160908/17/112375580_349453.jpg!131","poster_path_208":"/portrait/20160908/17/112375580_349453.jpg!208","poster_path_256":"/portrait/20160908/17/112375580_349453.jpg!256","poster_path_272":"/portrait/20160908/17/112375580_349453.jpg!272","poster_path_290":"/portrait/20160908/17/112375580_349453.jpg!290x164","poster_path_1280":"/portrait/20160908/17/112375580_349453.jpg!1280","poster_path_400":"/portrait/20160908/17/112375580_349453.jpg!400","poster_path_756":"/portrait/20160908/17/112375580_349453.jpg!756x567","poster_path_300":"/portrait/20160908/17/112375580_349453.jpg!300"},{"roomId":109224854,"userId":109224854,"screenType":2,"nickname":"小小瓶盖喔","onlineCount":1410,"maxCount":0,"liveType":2,"livestarttime":1474530188000,"liveStream":"http://pull.kktv8.com/livekktv/109224854.flv","actorLevel":8,"richLevel":2,"icon":0,"roomTheme":"小瓶盖的下午","roomMode":0,"roomGender":0,"gender":0,"roomType":10,"roomSource":10,"city":"武汉","starLevel":0,"portrait_path_original":"/portrait/20160909/18/109224854_1931288.jpg","portrait_path_48":"/portrait/20160909/18/109224854_1931288.jpg!48","portrait_path_128":"/portrait/20160909/18/109224854_1931288.jpg!128","portrait_path_256":"/portrait/20160909/18/109224854_1931288.jpg!256","portrait_path_272":"/portrait/20160909/18/109224854_1931288.jpg!272","portrait_path_1280":"/portrait/20160909/18/109224854_1931288.jpg!1280","portrait_path_400":"/portrait/20160909/18/109224854_1931288.jpg!400","portrait_path_756":"/portrait/20160909/18/109224854_1931288.jpg!756x567","poster_path_original":"/portrait/20160909/18/109224854_1931288.jpg","poster_path_48":"/portrait/20160909/18/109224854_1931288.jpg!48","poster_path_128":"/portrait/20160909/18/109224854_1931288.jpg!128x96","poster_path_131":"/portrait/20160909/18/109224854_1931288.jpg!131","poster_path_208":"/portrait/20160909/18/109224854_1931288.jpg!208","poster_path_256":"/portrait/20160909/18/109224854_1931288.jpg!256","poster_path_272":"/portrait/20160909/18/109224854_1931288.jpg!272","poster_path_290":"/portrait/20160909/18/109224854_1931288.jpg!290x164","poster_path_1280":"/portrait/20160909/18/109224854_1931288.jpg!1280","poster_path_400":"/portrait/20160909/18/109224854_1931288.jpg!400","poster_path_756":"/portrait/20160909/18/109224854_1931288.jpg!756x567","poster_path_300":"/portrait/20160909/18/109224854_1931288.jpg!300"},{"roomId":55592491,"userId":55592491,"screenType":1,"nickname":"秀灵儿","onlineCount":6541,"maxCount":40000,"liveType":1,"livestarttime":1474523878000,"liveStream":"http://pull.kktv8.com/livekktv/55592491.flv","actorLevel":33,"richLevel":8,"icon":0,"roomMode":0,"roomGender":0,"gender":0,"roomType":1,"roomSource":1,"city":"长沙","starLevel":0,"luckyId":52000,"validId":{"id":52000,"idType":1,"isLight":1,"newIdType":1,"endTime":1498492799,"idState":1,"isEnable":2,"remainDays":0,"backIcon":"http://ures.kktv8.com/kktv/virtualid/liang_black.png","iconType":1},"portrait_path_original":"/portrait/20160922/14/55592491_183745.jpg","portrait_path_48":"/portrait/20160922/14/55592491_183745.jpg!48","portrait_path_128":"/portrait/20160922/14/55592491_183745.jpg!128","portrait_path_256":"/portrait/20160922/14/55592491_183745.jpg!256","portrait_path_272":"/portrait/20160922/14/55592491_183745.jpg!272","portrait_path_1280":"/portrait/20160922/14/55592491_183745.jpg!1280","portrait_path_400":"/portrait/20160922/14/55592491_183745.jpg!400","portrait_path_756":"/portrait/20160922/14/55592491_183745.jpg!756x567","poster_path_original":"/poster/20160822/15/55592491_3013536.jpg","poster_path_1280":"/poster/20160822/15/55592491_3013536.jpg!1280","poster_path_290":"/poster/20160822/15/55592491_3013536.jpg!290x164","poster_path_272":"/poster/20160822/15/55592491_3013536.jpg!272","poster_path_256":"/poster/20160822/15/55592491_3013536.jpg!256","poster_path_208":"/poster/20160822/15/55592491_3013536.jpg!208","poster_path_131":"/poster/20160822/15/55592491_3013536.jpg!131","poster_path_128":"/poster/20160822/15/55592491_3013536.jpg!128x96","poster_path_400":"/poster/20160822/15/55592491_3013536.jpg!400","poster_path_756":"/poster/20160822/15/55592491_3013536.jpg!756x567","poster_path_300":"/poster/20160822/15/55592491_3013536.jpg!300"},{"roomId":106611041,"userId":106611041,"screenType":1,"nickname":"38°6 默默","onlineCount":10339,"maxCount":0,"liveType":1,"livestarttime":1474531474000,"liveStream":"http://pull.kktv8.com/livekktv/106611041.flv","actorLevel":17,"richLevel":6,"icon":0,"roomMode":0,"roomGender":0,"gender":0,"roomType":1,"roomSource":1,"city":"徐州","starLevel":0,"portrait_path_original":"/portrait/20160713/21/106611041_4310.png","portrait_path_48":"/portrait/20160713/21/106611041_4310.png!48","portrait_path_128":"/portrait/20160713/21/106611041_4310.png!128","portrait_path_256":"/portrait/20160713/21/106611041_4310.png!256","portrait_path_272":"/portrait/20160713/21/106611041_4310.png!272","portrait_path_1280":"/portrait/20160713/21/106611041_4310.png!1280","portrait_path_400":"/portrait/20160713/21/106611041_4310.png!400","portrait_path_756":"/portrait/20160713/21/106611041_4310.png!756x567","poster_path_original":"/poster/20160731/13/106611041_2110176.jpeg","poster_path_1280":"/poster/20160731/13/106611041_2110176.jpeg!1280","poster_path_290":"/poster/20160731/13/106611041_2110176.jpeg!290x164","poster_path_272":"/poster/20160731/13/106611041_2110176.jpeg!272","poster_path_256":"/poster/20160731/13/106611041_2110176.jpeg!256","poster_path_208":"/poster/20160731/13/106611041_2110176.jpeg!208","poster_path_131":"/poster/20160731/13/106611041_2110176.jpeg!131","poster_path_128":"/poster/20160731/13/106611041_2110176.jpeg!128x96","poster_path_400":"/poster/20160731/13/106611041_2110176.jpeg!400","poster_path_756":"/poster/20160731/13/106611041_2110176.jpeg!756x567","poster_path_300":"/poster/20160731/13/106611041_2110176.jpeg!300"},{"roomId":69257104,"userId":69257104,"screenType":1,"nickname":"最美ღ 小西西💕","onlineCount":2091,"maxCount":40000,"liveType":1,"livestarttime":1474529693000,"liveStream":"http://pull.kktv8.com/livekktv/69257104.flv","actorLevel":23,"richLevel":6,"icon":0,"roomTheme":"小仙女 笑嘻嘻直播啦啦~","roomMode":0,"roomGender":0,"gender":0,"roomType":1,"roomSource":1,"city":"杭州","starLevel":0,"luckyId":169169,"validId":{"id":169169,"idType":1,"isLight":1,"newIdType":1,"endTime":1479484799,"idState":1,"isEnable":2,"remainDays":0,"backIcon":"http://ures.kktv8.com/kktv/virtualid/liang_org.png","iconType":4},"portrait_path_original":"/portrait/20160917/11/69257104_4030735.jpg","portrait_path_48":"/portrait/20160917/11/69257104_4030735.jpg!48","portrait_path_128":"/portrait/20160917/11/69257104_4030735.jpg!128","portrait_path_256":"/portrait/20160917/11/69257104_4030735.jpg!256","portrait_path_272":"/portrait/20160917/11/69257104_4030735.jpg!272","portrait_path_1280":"/portrait/20160917/11/69257104_4030735.jpg!1280","portrait_path_400":"/portrait/20160917/11/69257104_4030735.jpg!400","portrait_path_756":"/portrait/20160917/11/69257104_4030735.jpg!756x567","poster_path_original":"/picture/2015/12/01/12/69257104_4534.jpg","poster_path_1280":"/picture/2015/12/01/12/69257104_4534.jpg!1280","poster_path_290":"/picture/2015/12/01/12/69257104_4534.jpg!290x164","poster_path_272":"/picture/2015/12/01/12/69257104_4534.jpg!272","poster_path_256":"/picture/2015/12/01/12/69257104_4534.jpg!256","poster_path_208":"/picture/2015/12/01/12/69257104_4534.jpg!208","poster_path_131":"/picture/2015/12/01/12/69257104_4534.jpg!131","poster_path_128":"/picture/2015/12/01/12/69257104_4534.jpg!128x96","poster_path_400":"/picture/2015/12/01/12/69257104_4534.jpg!400","poster_path_756":"/picture/2015/12/01/12/69257104_4534.jpg!756x567","poster_path_300":"/picture/2015/12/01/12/69257104_4534.jpg!300"},{"roomId":100348080,"userId":100348080,"screenType":1,"nickname":"七妹🎀干嘛呢儿","onlineCount":1845,"maxCount":0,"liveType":1,"livestarttime":1474532407000,"liveStream":"http://pull.kktv8.com/livekktv/100348080.flv","actorLevel":17,"richLevel":5,"icon":0,"roomTheme":"哈哈","roomMode":0,"roomGender":0,"gender":0,"roomType":1,"roomSource":1,"city":"朝阳","starLevel":0,"portrait_path_original":"/portrait/20160330/18/100348080_4652.jpg","portrait_path_48":"/portrait/20160330/18/100348080_4652.jpg!48","portrait_path_128":"/portrait/20160330/18/100348080_4652.jpg!128","portrait_path_256":"/portrait/20160330/18/100348080_4652.jpg!256","portrait_path_272":"/portrait/20160330/18/100348080_4652.jpg!272","portrait_path_1280":"/portrait/20160330/18/100348080_4652.jpg!1280","portrait_path_400":"/portrait/20160330/18/100348080_4652.jpg!400","portrait_path_756":"/portrait/20160330/18/100348080_4652.jpg!756x567","poster_path_original":"/poster/20160912/18/100348080_5457618.jpg","poster_path_1280":"/poster/20160912/18/100348080_5457618.jpg!1280","poster_path_290":"/poster/20160912/18/100348080_5457618.jpg!290x164","poster_path_272":"/poster/20160912/18/100348080_5457618.jpg!272","poster_path_256":"/poster/20160912/18/100348080_5457618.jpg!256","poster_path_208":"/poster/20160912/18/100348080_5457618.jpg!208","poster_path_131":"/poster/20160912/18/100348080_5457618.jpg!131","poster_path_128":"/poster/20160912/18/100348080_5457618.jpg!128x96","poster_path_400":"/poster/20160912/18/100348080_5457618.jpg!400","poster_path_756":"/poster/20160912/18/100348080_5457618.jpg!756x567","poster_path_300":"/poster/20160912/18/100348080_5457618.jpg!300"},{"roomId":108678720,"userId":108678720,"screenType":1,"nickname":"谜.轩轩.不想被遗忘","onlineCount":3169,"maxCount":0,"liveType":1,"livestarttime":1474530386000,"liveStream":"http://pull.kktv8.com/livekktv/108678720.flv","actorLevel":12,"richLevel":2,"icon":0,"roomTheme":"🎶🎶🎶","roomMode":0,"roomGender":0,"gender":0,"roomType":1,"roomSource":1,"city":"宜昌","starLevel":0,"portrait_path_original":"/portrait/20160817/6/108678720_2342151.jpg","portrait_path_48":"/portrait/20160817/6/108678720_2342151.jpg!48","portrait_path_128":"/portrait/20160817/6/108678720_2342151.jpg!128","portrait_path_256":"/portrait/20160817/6/108678720_2342151.jpg!256","portrait_path_272":"/portrait/20160817/6/108678720_2342151.jpg!272","portrait_path_1280":"/portrait/20160817/6/108678720_2342151.jpg!1280","portrait_path_400":"/portrait/20160817/6/108678720_2342151.jpg!400","portrait_path_756":"/portrait/20160817/6/108678720_2342151.jpg!756x567","poster_path_original":"/poster/20160704/11/108678720_429.jpg","poster_path_1280":"/poster/20160704/11/108678720_429.jpg!1280","poster_path_290":"/poster/20160704/11/108678720_429.jpg!290x164","poster_path_272":"/poster/20160704/11/108678720_429.jpg!272","poster_path_256":"/poster/20160704/11/108678720_429.jpg!256","poster_path_208":"/poster/20160704/11/108678720_429.jpg!208","poster_path_131":"/poster/20160704/11/108678720_429.jpg!131","poster_path_128":"/poster/20160704/11/108678720_429.jpg!128x96","poster_path_400":"/poster/20160704/11/108678720_429.jpg!400","poster_path_756":"/poster/20160704/11/108678720_429.jpg!756x567","poster_path_300":"/poster/20160704/11/108678720_429.jpg!300"},{"roomId":83135021,"userId":83135021,"screenType":1,"nickname":"夏七七④气质少女","onlineCount":6646,"maxCount":40000,"liveType":1,"livestarttime":1474516658000,"liveStream":"http://pull.kktv8.com/livekktv/83135021.flv","actorLevel":17,"richLevel":3,"icon":0,"roomMode":0,"roomGender":0,"gender":0,"roomType":1,"roomSource":1,"city":"深圳","starLevel":0,"portrait_path_original":"/portrait/20160905/16/83135021_154962.png","portrait_path_48":"/portrait/20160905/16/83135021_154962.png!48","portrait_path_128":"/portrait/20160905/16/83135021_154962.png!128","portrait_path_256":"/portrait/20160905/16/83135021_154962.png!256","portrait_path_272":"/portrait/20160905/16/83135021_154962.png!272","portrait_path_1280":"/portrait/20160905/16/83135021_154962.png!1280","portrait_path_400":"/portrait/20160905/16/83135021_154962.png!400","portrait_path_756":"/portrait/20160905/16/83135021_154962.png!756x567","poster_path_original":"/poster/20160628/10/83135021_138.jpg","poster_path_1280":"/poster/20160628/10/83135021_138.jpg!1280","poster_path_290":"/poster/20160628/10/83135021_138.jpg!290x164","poster_path_272":"/poster/20160628/10/83135021_138.jpg!272","poster_path_256":"/poster/20160628/10/83135021_138.jpg!256","poster_path_208":"/poster/20160628/10/83135021_138.jpg!208","poster_path_131":"/poster/20160628/10/83135021_138.jpg!131","poster_path_128":"/poster/20160628/10/83135021_138.jpg!128x96","poster_path_400":"/poster/20160628/10/83135021_138.jpg!400","poster_path_756":"/poster/20160628/10/83135021_138.jpg!756x567","poster_path_300":"/poster/20160628/10/83135021_138.jpg!300"}]
     * roomTotal : 168
     * pathPrefix : http://ures.kktv8.com/kktv
     * TagCode : 00000000
     */

    private int roomTotal;
    private String pathPrefix;
    private String TagCode;
    /**
     * roomId : 10015
     * userId : 10015
     * screenType : 1
     * nickname : 【狭路相逢】
     * onlineCount : 2091
     * maxCount : 40000
     * liveType : 1
     * livestarttime : 1474530887000
     * liveStream : http://pull.kktv8.com/livekktv/10015.flv
     * actorLevel : 14
     * richLevel : 6
     * icon : 0
     * roomTheme : 狭路相逢勇者胜
     * roomMode : 0
     * roomGender : 1
     * gender : 1
     * roomType : 1
     * roomSource : 1
     * partPosition : 1
     * city : 沧州
     * starLevel : 0
     * portrait_path_original : /portrait/20160913/16/10015_1326164.png
     * portrait_path_48 : /portrait/20160913/16/10015_1326164.png!48
     * portrait_path_128 : /portrait/20160913/16/10015_1326164.png!128
     * portrait_path_256 : /portrait/20160913/16/10015_1326164.png!256
     * portrait_path_272 : /portrait/20160913/16/10015_1326164.png!272
     * portrait_path_1280 : /portrait/20160913/16/10015_1326164.png!1280
     * portrait_path_400 : /portrait/20160913/16/10015_1326164.png!400
     * portrait_path_756 : /portrait/20160913/16/10015_1326164.png!756x567
     * poster_path_original : /picture/2016/09/12/17/10015_1624.jpg
     * poster_path_1280 : /picture/2016/09/12/17/10015_1624.jpg!1280
     * poster_path_290 : /picture/2016/09/12/17/10015_1624.jpg!290x164
     * poster_path_272 : /picture/2016/09/12/17/10015_1624.jpg!272
     * poster_path_256 : /picture/2016/09/12/17/10015_1624.jpg!256
     * poster_path_208 : /picture/2016/09/12/17/10015_1624.jpg!208
     * poster_path_131 : /picture/2016/09/12/17/10015_1624.jpg!131
     * poster_path_128 : /picture/2016/09/12/17/10015_1624.jpg!128x96
     * poster_path_400 : /picture/2016/09/12/17/10015_1624.jpg!400
     * poster_path_756 : /picture/2016/09/12/17/10015_1624.jpg!756x567
     * poster_path_300 : /picture/2016/09/12/17/10015_1624.jpg!300
     */

    private List<RoomListBean> roomList;

    public int getRoomTotal() {
        return roomTotal;
    }

    public void setRoomTotal(int roomTotal) {
        this.roomTotal = roomTotal;
    }

    public String getPathPrefix() {
        return pathPrefix;
    }

    public void setPathPrefix(String pathPrefix) {
        this.pathPrefix = pathPrefix;
    }

    public String getTagCode() {
        return TagCode;
    }

    public void setTagCode(String TagCode) {
        this.TagCode = TagCode;
    }

    public List<RoomListBean> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<RoomListBean> roomList) {
        this.roomList = roomList;
    }

    public static class RoomListBean {
        private int roomId;
        private int userId;
        private int screenType;
        private String nickname;
        private int onlineCount;
        private int maxCount;
        private int liveType;
        private long livestarttime;
        private String liveStream;
        private int actorLevel;
        private int richLevel;
        private int icon;
        private String roomTheme;
        private int roomMode;
        private int roomGender;
        private int gender;
        private int roomType;
        private int roomSource;
        private int partPosition;
        private String city;
        private int starLevel;
        private String portrait_path_original;
        private String portrait_path_48;
        private String portrait_path_128;
        private String portrait_path_256;
        private String portrait_path_272;
        private String portrait_path_1280;
        private String portrait_path_400;
        private String portrait_path_756;
        private String poster_path_original;
        private String poster_path_1280;
        private String poster_path_290;
        private String poster_path_272;
        private String poster_path_256;
        private String poster_path_208;
        private String poster_path_131;
        private String poster_path_128;
        private String poster_path_400;
        private String poster_path_756;
        private String poster_path_300;

        public int getRoomId() {
            return roomId;
        }

        public void setRoomId(int roomId) {
            this.roomId = roomId;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public int getScreenType() {
            return screenType;
        }

        public void setScreenType(int screenType) {
            this.screenType = screenType;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public int getOnlineCount() {
            return onlineCount;
        }

        public void setOnlineCount(int onlineCount) {
            this.onlineCount = onlineCount;
        }

        public int getMaxCount() {
            return maxCount;
        }

        public void setMaxCount(int maxCount) {
            this.maxCount = maxCount;
        }

        public int getLiveType() {
            return liveType;
        }

        public void setLiveType(int liveType) {
            this.liveType = liveType;
        }

        public long getLivestarttime() {
            return livestarttime;
        }

        public void setLivestarttime(long livestarttime) {
            this.livestarttime = livestarttime;
        }

        public String getLiveStream() {
            return liveStream;
        }

        public void setLiveStream(String liveStream) {
            this.liveStream = liveStream;
        }

        public int getActorLevel() {
            return actorLevel;
        }

        public void setActorLevel(int actorLevel) {
            this.actorLevel = actorLevel;
        }

        public int getRichLevel() {
            return richLevel;
        }

        public void setRichLevel(int richLevel) {
            this.richLevel = richLevel;
        }

        public int getIcon() {
            return icon;
        }

        public void setIcon(int icon) {
            this.icon = icon;
        }

        public String getRoomTheme() {
            return roomTheme;
        }

        public void setRoomTheme(String roomTheme) {
            this.roomTheme = roomTheme;
        }

        public int getRoomMode() {
            return roomMode;
        }

        public void setRoomMode(int roomMode) {
            this.roomMode = roomMode;
        }

        public int getRoomGender() {
            return roomGender;
        }

        public void setRoomGender(int roomGender) {
            this.roomGender = roomGender;
        }

        public int getGender() {
            return gender;
        }

        public void setGender(int gender) {
            this.gender = gender;
        }

        public int getRoomType() {
            return roomType;
        }

        public void setRoomType(int roomType) {
            this.roomType = roomType;
        }

        public int getRoomSource() {
            return roomSource;
        }

        public void setRoomSource(int roomSource) {
            this.roomSource = roomSource;
        }

        public int getPartPosition() {
            return partPosition;
        }

        public void setPartPosition(int partPosition) {
            this.partPosition = partPosition;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public int getStarLevel() {
            return starLevel;
        }

        public void setStarLevel(int starLevel) {
            this.starLevel = starLevel;
        }

        public String getPortrait_path_original() {
            return portrait_path_original;
        }

        public void setPortrait_path_original(String portrait_path_original) {
            this.portrait_path_original = portrait_path_original;
        }

        public String getPortrait_path_48() {
            return portrait_path_48;
        }

        public void setPortrait_path_48(String portrait_path_48) {
            this.portrait_path_48 = portrait_path_48;
        }

        public String getPortrait_path_128() {
            return portrait_path_128;
        }

        public void setPortrait_path_128(String portrait_path_128) {
            this.portrait_path_128 = portrait_path_128;
        }

        public String getPortrait_path_256() {
            return portrait_path_256;
        }

        public void setPortrait_path_256(String portrait_path_256) {
            this.portrait_path_256 = portrait_path_256;
        }

        public String getPortrait_path_272() {
            return portrait_path_272;
        }

        public void setPortrait_path_272(String portrait_path_272) {
            this.portrait_path_272 = portrait_path_272;
        }

        public String getPortrait_path_1280() {
            return portrait_path_1280;
        }

        public void setPortrait_path_1280(String portrait_path_1280) {
            this.portrait_path_1280 = portrait_path_1280;
        }

        public String getPortrait_path_400() {
            return portrait_path_400;
        }

        public void setPortrait_path_400(String portrait_path_400) {
            this.portrait_path_400 = portrait_path_400;
        }

        public String getPortrait_path_756() {
            return portrait_path_756;
        }

        public void setPortrait_path_756(String portrait_path_756) {
            this.portrait_path_756 = portrait_path_756;
        }

        public String getPoster_path_original() {
            return poster_path_original;
        }

        public void setPoster_path_original(String poster_path_original) {
            this.poster_path_original = poster_path_original;
        }

        public String getPoster_path_1280() {
            return poster_path_1280;
        }

        public void setPoster_path_1280(String poster_path_1280) {
            this.poster_path_1280 = poster_path_1280;
        }

        public String getPoster_path_290() {
            return poster_path_290;
        }

        public void setPoster_path_290(String poster_path_290) {
            this.poster_path_290 = poster_path_290;
        }

        public String getPoster_path_272() {
            return poster_path_272;
        }

        public void setPoster_path_272(String poster_path_272) {
            this.poster_path_272 = poster_path_272;
        }

        public String getPoster_path_256() {
            return poster_path_256;
        }

        public void setPoster_path_256(String poster_path_256) {
            this.poster_path_256 = poster_path_256;
        }

        public String getPoster_path_208() {
            return poster_path_208;
        }

        public void setPoster_path_208(String poster_path_208) {
            this.poster_path_208 = poster_path_208;
        }

        public String getPoster_path_131() {
            return poster_path_131;
        }

        public void setPoster_path_131(String poster_path_131) {
            this.poster_path_131 = poster_path_131;
        }

        public String getPoster_path_128() {
            return poster_path_128;
        }

        public void setPoster_path_128(String poster_path_128) {
            this.poster_path_128 = poster_path_128;
        }

        public String getPoster_path_400() {
            return poster_path_400;
        }

        public void setPoster_path_400(String poster_path_400) {
            this.poster_path_400 = poster_path_400;
        }

        public String getPoster_path_756() {
            return poster_path_756;
        }

        public void setPoster_path_756(String poster_path_756) {
            this.poster_path_756 = poster_path_756;
        }

        public String getPoster_path_300() {
            return poster_path_300;
        }

        public void setPoster_path_300(String poster_path_300) {
            this.poster_path_300 = poster_path_300;
        }
    }
}
