package com.kk.kklive.model;

import java.util.List;

/**
 * 首页模型
 * Created by fei on 2016/9/20.
 */
public class Recommend {

    /**
     * roomList : [{"roomId":10032,"userId":10032,"screenType":1,"nickname":"家族擂台赛","onlineCount":20889,"maxCount":40000,"liveType":1,"livestarttime":1474371587000,"liveStream":"http://pull.kktv8.com/livekktv/10032.flv","actorLevel":17,"richLevel":10,"icon":0,"roomMode":0,"roomGender":0,"gender":0,"roomType":1,"roomSource":1,"partPosition":1,"city":"大同","starLevel":0,"portrait_path_original":"/portrait/2013/12/19/1387440256726.png","portrait_path_48":"/portrait/2013/12/19/1387440256726.png!48","portrait_path_128":"/portrait/2013/12/19/1387440256726.png!128","portrait_path_256":"/portrait/2013/12/19/1387440256726.png!256","portrait_path_272":"/portrait/2013/12/19/1387440256726.png!272","portrait_path_1280":"/portrait/2013/12/19/1387440256726.png!1280","portrait_path_400":"/portrait/2013/12/19/1387440256726.png!400","portrait_path_756":"/portrait/2013/12/19/1387440256726.png!756x567","poster_path_original":"/picture/2013/11/27/1385530010874.png","poster_path_1280":"/picture/2013/11/27/1385530010874.png!1280","poster_path_290":"/picture/2013/11/27/1385530010874.png!290x164","poster_path_272":"/picture/2013/11/27/1385530010874.png!272","poster_path_256":"/picture/2013/11/27/1385530010874.png!256","poster_path_208":"/picture/2013/11/27/1385530010874.png!208","poster_path_131":"/picture/2013/11/27/1385530010874.png!131","poster_path_128":"/picture/2013/11/27/1385530010874.png!128x96","poster_path_400":"/picture/2013/11/27/1385530010874.png!400","poster_path_756":"/picture/2013/11/27/1385530010874.png!756x567","poster_path_300":"/picture/2013/11/27/1385530010874.png!300"},{"roomId":108318536,"userId":108318536,"screenType":2,"nickname":"甜辣妮🌸🌸","onlineCount":279,"maxCount":0,"liveType":2,"livestarttime":1474373425000,"liveStream":"http://pull.kktv8.com/livekktv/108318536.flv","actorLevel":15,"richLevel":2,"icon":0,"roomTheme":"❤️❤️❤️❤️❤️❤️❤️","roomMode":0,"roomGender":0,"gender":0,"roomType":10,"roomSource":10,"city":"东城","starLevel":0,"portrait_path_original":"/portrait/20160915/22/108318536_120575.jpg","portrait_path_48":"/portrait/20160915/22/108318536_120575.jpg!48","portrait_path_128":"/portrait/20160915/22/108318536_120575.jpg!128","portrait_path_256":"/portrait/20160915/22/108318536_120575.jpg!256","portrait_path_272":"/portrait/20160915/22/108318536_120575.jpg!272","portrait_path_1280":"/portrait/20160915/22/108318536_120575.jpg!1280","portrait_path_400":"/portrait/20160915/22/108318536_120575.jpg!400","portrait_path_756":"/portrait/20160915/22/108318536_120575.jpg!756x567","poster_path_original":"/portrait/20160915/22/108318536_120575.jpg","poster_path_48":"/portrait/20160915/22/108318536_120575.jpg!48","poster_path_128":"/portrait/20160915/22/108318536_120575.jpg!128x96","poster_path_131":"/portrait/20160915/22/108318536_120575.jpg!131","poster_path_208":"/portrait/20160915/22/108318536_120575.jpg!208","poster_path_256":"/portrait/20160915/22/108318536_120575.jpg!256","poster_path_272":"/portrait/20160915/22/108318536_120575.jpg!272","poster_path_290":"/portrait/20160915/22/108318536_120575.jpg!290x164","poster_path_1280":"/portrait/20160915/22/108318536_120575.jpg!1280","poster_path_400":"/portrait/20160915/22/108318536_120575.jpg!400","poster_path_756":"/portrait/20160915/22/108318536_120575.jpg!756x567","poster_path_300":"/portrait/20160915/22/108318536_120575.jpg!300"},{"roomId":95060872,"userId":95060872,"screenType":1,"nickname":"月月✻傻白甜","onlineCount":4184,"maxCount":0,"liveType":1,"livestarttime":1474371438000,"liveStream":"http://pull.kktv8.com/livekktv/95060872.flv","actorLevel":17,"richLevel":7,"icon":0,"roomMode":0,"roomGender":0,"gender":0,"roomType":1,"roomSource":1,"partPosition":3,"city":"哈尔滨","starLevel":0,"portrait_path_original":"/portrait/20160907/17/95060872_123938.jpg","portrait_path_48":"/portrait/20160907/17/95060872_123938.jpg!48","portrait_path_128":"/portrait/20160907/17/95060872_123938.jpg!128","portrait_path_256":"/portrait/20160907/17/95060872_123938.jpg!256","portrait_path_272":"/portrait/20160907/17/95060872_123938.jpg!272","portrait_path_1280":"/portrait/20160907/17/95060872_123938.jpg!1280","portrait_path_400":"/portrait/20160907/17/95060872_123938.jpg!400","portrait_path_756":"/portrait/20160907/17/95060872_123938.jpg!756x567","poster_path_original":"/poster/20160916/14/95060872_5558562.jpg","poster_path_1280":"/poster/20160916/14/95060872_5558562.jpg!1280","poster_path_290":"/poster/20160916/14/95060872_5558562.jpg!290x164","poster_path_272":"/poster/20160916/14/95060872_5558562.jpg!272","poster_path_256":"/poster/20160916/14/95060872_5558562.jpg!256","poster_path_208":"/poster/20160916/14/95060872_5558562.jpg!208","poster_path_131":"/poster/20160916/14/95060872_5558562.jpg!131","poster_path_128":"/poster/20160916/14/95060872_5558562.jpg!128x96","poster_path_400":"/poster/20160916/14/95060872_5558562.jpg!400","poster_path_756":"/poster/20160916/14/95060872_5558562.jpg!756x567","poster_path_300":"/poster/20160916/14/95060872_5558562.jpg!300"},{"roomId":80053742,"userId":80053742,"screenType":1,"nickname":"妮可1117🍃","onlineCount":7174,"maxCount":40000,"liveType":1,"livestarttime":1474361961000,"liveStream":"http://pull.kktv8.com/livekktv/80053742.flv","actorLevel":34,"richLevel":12,"icon":6,"isWeekly":1,"roomMode":0,"roomGender":0,"gender":0,"roomType":1,"roomSource":1,"partPosition":4,"city":"澳门","starLevel":0,"luckyId":777888,"validId":{"id":777888,"idType":1,"isLight":1,"newIdType":1,"endTime":1493913599,"idState":1,"isEnable":2,"remainDays":0,"backIcon":"http://ures.kktv8.com/kktv/virtualid/liang_red.png","iconType":3},"portrait_path_original":"/portrait/20160914/2/80053742_4324440.jpg","portrait_path_48":"/portrait/20160914/2/80053742_4324440.jpg!48","portrait_path_128":"/portrait/20160914/2/80053742_4324440.jpg!128","portrait_path_256":"/portrait/20160914/2/80053742_4324440.jpg!256","portrait_path_272":"/portrait/20160914/2/80053742_4324440.jpg!272","portrait_path_1280":"/portrait/20160914/2/80053742_4324440.jpg!1280","portrait_path_400":"/portrait/20160914/2/80053742_4324440.jpg!400","portrait_path_756":"/portrait/20160914/2/80053742_4324440.jpg!756x567","poster_path_original":"/picture/2015/11/05/19/80053742_347.jpg","poster_path_1280":"/picture/2015/11/05/19/80053742_347.jpg!1280","poster_path_290":"/picture/2015/11/05/19/80053742_347.jpg!290x164","poster_path_272":"/picture/2015/11/05/19/80053742_347.jpg!272","poster_path_256":"/picture/2015/11/05/19/80053742_347.jpg!256","poster_path_208":"/picture/2015/11/05/19/80053742_347.jpg!208","poster_path_131":"/picture/2015/11/05/19/80053742_347.jpg!131","poster_path_128":"/picture/2015/11/05/19/80053742_347.jpg!128x96","poster_path_400":"/picture/2015/11/05/19/80053742_347.jpg!400","poster_path_756":"/picture/2015/11/05/19/80053742_347.jpg!756x567","poster_path_300":"/picture/2015/11/05/19/80053742_347.jpg!300"},{"roomId":60292806,"userId":60292806,"screenType":1,"nickname":"唇儿求守护","onlineCount":4555,"maxCount":40000,"liveType":1,"livestarttime":1474371728000,"liveStream":"http://pull.kktv8.com/livekktv/60292806.flv","actorLevel":30,"richLevel":9,"icon":0,"roomMode":0,"roomGender":0,"gender":0,"roomType":1,"roomSource":1,"partPosition":5,"city":"济南","starLevel":0,"luckyId":9182929,"validId":{"id":9182929,"idType":1,"isLight":1,"newIdType":1,"endTime":1488815999,"idState":1,"isEnable":2,"remainDays":0,"backIcon":"http://ures.kktv8.com/kktv/virtualid/liang_org.png","iconType":4},"portrait_path_original":"/portrait/20160602/14/60292806_5416.jpg","portrait_path_48":"/portrait/20160602/14/60292806_5416.jpg!48","portrait_path_128":"/portrait/20160602/14/60292806_5416.jpg!128","portrait_path_256":"/portrait/20160602/14/60292806_5416.jpg!256","portrait_path_272":"/portrait/20160602/14/60292806_5416.jpg!272","portrait_path_1280":"/portrait/20160602/14/60292806_5416.jpg!1280","portrait_path_400":"/portrait/20160602/14/60292806_5416.jpg!400","portrait_path_756":"/portrait/20160602/14/60292806_5416.jpg!756x567","poster_path_original":"/poster/20160917/19/60292806_307888.jpg","poster_path_1280":"/poster/20160917/19/60292806_307888.jpg!1280","poster_path_290":"/poster/20160917/19/60292806_307888.jpg!290x164","poster_path_272":"/poster/20160917/19/60292806_307888.jpg!272","poster_path_256":"/poster/20160917/19/60292806_307888.jpg!256","poster_path_208":"/poster/20160917/19/60292806_307888.jpg!208","poster_path_131":"/poster/20160917/19/60292806_307888.jpg!131","poster_path_128":"/poster/20160917/19/60292806_307888.jpg!128x96","poster_path_400":"/poster/20160917/19/60292806_307888.jpg!400","poster_path_756":"/poster/20160917/19/60292806_307888.jpg!756x567","poster_path_300":"/poster/20160917/19/60292806_307888.jpg!300"},{"roomId":61183658,"userId":61183658,"screenType":1,"nickname":"安儿！磊磊升囖！","onlineCount":1845,"maxCount":40000,"liveType":1,"livestarttime":1474373201000,"liveStream":"http://pull.kktv8.com/livekktv/61183658.flv","actorLevel":21,"richLevel":10,"icon":0,"roomMode":0,"roomGender":0,"gender":0,"roomType":1,"roomSource":1,"partPosition":6,"city":"台北","starLevel":0,"luckyId":2999991,"validId":{"id":2999991,"idType":1,"isLight":1,"newIdType":1,"endTime":1476547199,"idState":1,"isEnable":2,"remainDays":0,"backIcon":"http://ures.kktv8.com/kktv/virtualid/liang_pur.png","iconType":2},"portrait_path_original":"/portrait/20160915/17/61183658_56951.jpg","portrait_path_48":"/portrait/20160915/17/61183658_56951.jpg!48","portrait_path_128":"/portrait/20160915/17/61183658_56951.jpg!128","portrait_path_256":"/portrait/20160915/17/61183658_56951.jpg!256","portrait_path_272":"/portrait/20160915/17/61183658_56951.jpg!272","portrait_path_1280":"/portrait/20160915/17/61183658_56951.jpg!1280","portrait_path_400":"/portrait/20160915/17/61183658_56951.jpg!400","portrait_path_756":"/portrait/20160915/17/61183658_56951.jpg!756x567","poster_path_original":"/poster/20160918/15/61183658_2843621.JPG","poster_path_1280":"/poster/20160918/15/61183658_2843621.JPG!1280","poster_path_290":"/poster/20160918/15/61183658_2843621.JPG!290x164","poster_path_272":"/poster/20160918/15/61183658_2843621.JPG!272","poster_path_256":"/poster/20160918/15/61183658_2843621.JPG!256","poster_path_208":"/poster/20160918/15/61183658_2843621.JPG!208","poster_path_131":"/poster/20160918/15/61183658_2843621.JPG!131","poster_path_128":"/poster/20160918/15/61183658_2843621.JPG!128x96","poster_path_400":"/poster/20160918/15/61183658_2843621.JPG!400","poster_path_756":"/poster/20160918/15/61183658_2843621.JPG!756x567","poster_path_300":"/poster/20160918/15/61183658_2843621.JPG!300"},{"roomId":109880348,"userId":109880348,"screenType":2,"nickname":"DC-周十亿","onlineCount":370,"maxCount":0,"liveType":2,"livestarttime":1474373248000,"liveStream":"http://pull.kktv8.com/livekktv/109880348.flv","actorLevel":11,"richLevel":1,"icon":0,"roomTheme":"😳","roomMode":0,"roomGender":0,"gender":0,"roomType":10,"roomSource":10,"city":"郑州","starLevel":0,"portrait_path_original":"/portrait/20160911/16/109880348_5724470.jpg","portrait_path_48":"/portrait/20160911/16/109880348_5724470.jpg!48","portrait_path_128":"/portrait/20160911/16/109880348_5724470.jpg!128","portrait_path_256":"/portrait/20160911/16/109880348_5724470.jpg!256","portrait_path_272":"/portrait/20160911/16/109880348_5724470.jpg!272","portrait_path_1280":"/portrait/20160911/16/109880348_5724470.jpg!1280","portrait_path_400":"/portrait/20160911/16/109880348_5724470.jpg!400","portrait_path_756":"/portrait/20160911/16/109880348_5724470.jpg!756x567","poster_path_original":"/portrait/20160911/16/109880348_5724470.jpg","poster_path_48":"/portrait/20160911/16/109880348_5724470.jpg!48","poster_path_128":"/portrait/20160911/16/109880348_5724470.jpg!128x96","poster_path_131":"/portrait/20160911/16/109880348_5724470.jpg!131","poster_path_208":"/portrait/20160911/16/109880348_5724470.jpg!208","poster_path_256":"/portrait/20160911/16/109880348_5724470.jpg!256","poster_path_272":"/portrait/20160911/16/109880348_5724470.jpg!272","poster_path_290":"/portrait/20160911/16/109880348_5724470.jpg!290x164","poster_path_1280":"/portrait/20160911/16/109880348_5724470.jpg!1280","poster_path_400":"/portrait/20160911/16/109880348_5724470.jpg!400","poster_path_756":"/portrait/20160911/16/109880348_5724470.jpg!756x567","poster_path_300":"/portrait/20160911/16/109880348_5724470.jpg!300"},{"roomId":106412403,"userId":106412403,"screenType":2,"nickname":"✨Nunu萌肉肉","onlineCount":1334,"maxCount":0,"liveType":2,"livestarttime":1474371311000,"liveStream":"http://pull.kktv8.com/livekktv/106412403.flv","actorLevel":13,"richLevel":3,"icon":0,"roomTheme":"吃饱饱继续播 ","roomMode":0,"roomGender":0,"gender":0,"roomType":10,"roomSource":10,"city":"嘉兴","starLevel":0,"portrait_path_original":"/portrait/20160810/11/106412403_846779.jpg","portrait_path_48":"/portrait/20160810/11/106412403_846779.jpg!48","portrait_path_128":"/portrait/20160810/11/106412403_846779.jpg!128","portrait_path_256":"/portrait/20160810/11/106412403_846779.jpg!256","portrait_path_272":"/portrait/20160810/11/106412403_846779.jpg!272","portrait_path_1280":"/portrait/20160810/11/106412403_846779.jpg!1280","portrait_path_400":"/portrait/20160810/11/106412403_846779.jpg!400","portrait_path_756":"/portrait/20160810/11/106412403_846779.jpg!756x567","poster_path_original":"/portrait/20160810/11/106412403_846779.jpg","poster_path_48":"/portrait/20160810/11/106412403_846779.jpg!48","poster_path_128":"/portrait/20160810/11/106412403_846779.jpg!128x96","poster_path_131":"/portrait/20160810/11/106412403_846779.jpg!131","poster_path_208":"/portrait/20160810/11/106412403_846779.jpg!208","poster_path_256":"/portrait/20160810/11/106412403_846779.jpg!256","poster_path_272":"/portrait/20160810/11/106412403_846779.jpg!272","poster_path_290":"/portrait/20160810/11/106412403_846779.jpg!290x164","poster_path_1280":"/portrait/20160810/11/106412403_846779.jpg!1280","poster_path_400":"/portrait/20160810/11/106412403_846779.jpg!400","poster_path_756":"/portrait/20160810/11/106412403_846779.jpg!756x567","poster_path_300":"/portrait/20160810/11/106412403_846779.jpg!300"},{"roomId":106499159,"userId":106499159,"screenType":1,"nickname":"ෆ◟uu悠悠","onlineCount":1968,"maxCount":0,"liveType":1,"livestarttime":1474373368000,"liveStream":"http://pull.kktv8.com/livekktv/106499159.flv","actorLevel":17,"richLevel":7,"icon":0,"roomMode":0,"roomGender":0,"gender":0,"roomType":1,"roomSource":1,"city":"成都","starLevel":0,"portrait_path_original":"/portrait/20160812/2/106499159_107643.jpg","portrait_path_48":"/portrait/20160812/2/106499159_107643.jpg!48","portrait_path_128":"/portrait/20160812/2/106499159_107643.jpg!128","portrait_path_256":"/portrait/20160812/2/106499159_107643.jpg!256","portrait_path_272":"/portrait/20160812/2/106499159_107643.jpg!272","portrait_path_1280":"/portrait/20160812/2/106499159_107643.jpg!1280","portrait_path_400":"/portrait/20160812/2/106499159_107643.jpg!400","portrait_path_756":"/portrait/20160812/2/106499159_107643.jpg!756x567","poster_path_original":"/picture/2016/08/07/22/106499159_656.jpg","poster_path_1280":"/picture/2016/08/07/22/106499159_656.jpg!1280","poster_path_290":"/picture/2016/08/07/22/106499159_656.jpg!290x164","poster_path_272":"/picture/2016/08/07/22/106499159_656.jpg!272","poster_path_256":"/picture/2016/08/07/22/106499159_656.jpg!256","poster_path_208":"/picture/2016/08/07/22/106499159_656.jpg!208","poster_path_131":"/picture/2016/08/07/22/106499159_656.jpg!131","poster_path_128":"/picture/2016/08/07/22/106499159_656.jpg!128x96","poster_path_400":"/picture/2016/08/07/22/106499159_656.jpg!400","poster_path_756":"/picture/2016/08/07/22/106499159_656.jpg!756x567","poster_path_300":"/picture/2016/08/07/22/106499159_656.jpg!300"},{"roomId":110156115,"userId":110156115,"screenType":1,"nickname":"婉昕★不会套路","onlineCount":1968,"maxCount":0,"liveType":1,"livestarttime":1474369909000,"liveStream":"http://pull.kktv8.com/livekktv/110156115.flv","actorLevel":11,"richLevel":1,"icon":0,"roomMode":0,"roomGender":0,"gender":0,"roomType":1,"roomSource":1,"city":"金华","starLevel":0,"portrait_path_original":"/portrait/20160912/16/110156115_3951668.jpg","portrait_path_48":"/portrait/20160912/16/110156115_3951668.jpg!48","portrait_path_128":"/portrait/20160912/16/110156115_3951668.jpg!128","portrait_path_256":"/portrait/20160912/16/110156115_3951668.jpg!256","portrait_path_272":"/portrait/20160912/16/110156115_3951668.jpg!272","portrait_path_1280":"/portrait/20160912/16/110156115_3951668.jpg!1280","portrait_path_400":"/portrait/20160912/16/110156115_3951668.jpg!400","portrait_path_756":"/portrait/20160912/16/110156115_3951668.jpg!756x567","poster_path_original":"/picture/2016/09/14/13/110156115_438.jpg","poster_path_1280":"/picture/2016/09/14/13/110156115_438.jpg!1280","poster_path_290":"/picture/2016/09/14/13/110156115_438.jpg!290x164","poster_path_272":"/picture/2016/09/14/13/110156115_438.jpg!272","poster_path_256":"/picture/2016/09/14/13/110156115_438.jpg!256","poster_path_208":"/picture/2016/09/14/13/110156115_438.jpg!208","poster_path_131":"/picture/2016/09/14/13/110156115_438.jpg!131","poster_path_128":"/picture/2016/09/14/13/110156115_438.jpg!128x96","poster_path_400":"/picture/2016/09/14/13/110156115_438.jpg!400","poster_path_756":"/picture/2016/09/14/13/110156115_438.jpg!756x567","poster_path_300":"/picture/2016/09/14/13/110156115_438.jpg!300"},{"roomId":112382644,"userId":112382644,"screenType":1,"nickname":"ES红太狼","onlineCount":2091,"maxCount":0,"liveType":1,"livestarttime":1474373065000,"liveStream":"http://pull.kktv8.com/livekktv/112382644.flv","actorLevel":7,"richLevel":1,"icon":0,"roomMode":0,"roomGender":0,"gender":0,"roomType":1,"roomSource":1,"city":"哈尔滨","starLevel":0,"portrait_path_original":"/portrait/20160908/21/112382644_754748.png","portrait_path_48":"/portrait/20160908/21/112382644_754748.png!48","portrait_path_128":"/portrait/20160908/21/112382644_754748.png!128","portrait_path_256":"/portrait/20160908/21/112382644_754748.png!256","portrait_path_272":"/portrait/20160908/21/112382644_754748.png!272","portrait_path_1280":"/portrait/20160908/21/112382644_754748.png!1280","portrait_path_400":"/portrait/20160908/21/112382644_754748.png!400","portrait_path_756":"/portrait/20160908/21/112382644_754748.png!756x567","poster_path_original":"/poster/20160919/11/112382644_523224.jpg","poster_path_1280":"/poster/20160919/11/112382644_523224.jpg!1280","poster_path_290":"/poster/20160919/11/112382644_523224.jpg!290x164","poster_path_272":"/poster/20160919/11/112382644_523224.jpg!272","poster_path_256":"/poster/20160919/11/112382644_523224.jpg!256","poster_path_208":"/poster/20160919/11/112382644_523224.jpg!208","poster_path_131":"/poster/20160919/11/112382644_523224.jpg!131","poster_path_128":"/poster/20160919/11/112382644_523224.jpg!128x96","poster_path_400":"/poster/20160919/11/112382644_523224.jpg!400","poster_path_756":"/poster/20160919/11/112382644_523224.jpg!756x567","poster_path_300":"/poster/20160919/11/112382644_523224.jpg!300"},{"roomId":106735030,"userId":106735030,"screenType":1,"nickname":"蜜糖💕愿的一人心","onlineCount":1968,"maxCount":0,"liveType":1,"livestarttime":1474360842000,"liveStream":"http://pull.kktv8.com/livekktv/106735030.flv","actorLevel":15,"richLevel":5,"icon":0,"roomMode":0,"roomGender":0,"gender":0,"roomType":1,"roomSource":1,"city":"长沙","starLevel":0,"luckyId":29202920,"validId":{"id":29202920,"idType":1,"isLight":1,"newIdType":1,"endTime":1476374399,"idState":1,"isEnable":2,"remainDays":0,"backIcon":"http://ures.kktv8.com/kktv/virtualid/liang_org.png","iconType":4},"portrait_path_original":"/portrait/20160914/11/106735030_4155196.jpg","portrait_path_48":"/portrait/20160914/11/106735030_4155196.jpg!48","portrait_path_128":"/portrait/20160914/11/106735030_4155196.jpg!128","portrait_path_256":"/portrait/20160914/11/106735030_4155196.jpg!256","portrait_path_272":"/portrait/20160914/11/106735030_4155196.jpg!272","portrait_path_1280":"/portrait/20160914/11/106735030_4155196.jpg!1280","portrait_path_400":"/portrait/20160914/11/106735030_4155196.jpg!400","portrait_path_756":"/portrait/20160914/11/106735030_4155196.jpg!756x567","poster_path_original":"/poster/20160706/13/106735030_206.jpg","poster_path_1280":"/poster/20160706/13/106735030_206.jpg!1280","poster_path_290":"/poster/20160706/13/106735030_206.jpg!290x164","poster_path_272":"/poster/20160706/13/106735030_206.jpg!272","poster_path_256":"/poster/20160706/13/106735030_206.jpg!256","poster_path_208":"/poster/20160706/13/106735030_206.jpg!208","poster_path_131":"/poster/20160706/13/106735030_206.jpg!131","poster_path_128":"/poster/20160706/13/106735030_206.jpg!128x96","poster_path_400":"/poster/20160706/13/106735030_206.jpg!400","poster_path_756":"/poster/20160706/13/106735030_206.jpg!756x567","poster_path_300":"/poster/20160706/13/106735030_206.jpg!300"},{"roomId":107715937,"userId":107715937,"screenType":1,"nickname":"谜♤蘇晴安静唱歌","onlineCount":2091,"maxCount":0,"liveType":1,"livestarttime":1474372585000,"liveStream":"http://pull.kktv8.com/livekktv/107715937.flv","actorLevel":15,"richLevel":5,"icon":0,"roomMode":0,"roomGender":0,"gender":0,"roomType":1,"roomSource":1,"city":"宜昌","starLevel":0,"portrait_path_original":"/portrait/20160705/1/107715937_928.jpg","portrait_path_48":"/portrait/20160705/1/107715937_928.jpg!48","portrait_path_128":"/portrait/20160705/1/107715937_928.jpg!128","portrait_path_256":"/portrait/20160705/1/107715937_928.jpg!256","portrait_path_272":"/portrait/20160705/1/107715937_928.jpg!272","portrait_path_1280":"/portrait/20160705/1/107715937_928.jpg!1280","portrait_path_400":"/portrait/20160705/1/107715937_928.jpg!400","portrait_path_756":"/portrait/20160705/1/107715937_928.jpg!756x567","poster_path_original":"/poster/20160606/22/107715937_4111.jpg","poster_path_1280":"/poster/20160606/22/107715937_4111.jpg!1280","poster_path_290":"/poster/20160606/22/107715937_4111.jpg!290x164","poster_path_272":"/poster/20160606/22/107715937_4111.jpg!272","poster_path_256":"/poster/20160606/22/107715937_4111.jpg!256","poster_path_208":"/poster/20160606/22/107715937_4111.jpg!208","poster_path_131":"/poster/20160606/22/107715937_4111.jpg!131","poster_path_128":"/poster/20160606/22/107715937_4111.jpg!128x96","poster_path_400":"/poster/20160606/22/107715937_4111.jpg!400","poster_path_756":"/poster/20160606/22/107715937_4111.jpg!756x567","poster_path_300":"/poster/20160606/22/107715937_4111.jpg!300"},{"roomId":100967529,"userId":100967529,"screenType":1,"nickname":"肥小肥肥啊肥爱打架","onlineCount":1444,"maxCount":0,"liveType":1,"livestarttime":1474369215000,"liveStream":"http://pull.kktv8.com/livekktv/100967529.flv","actorLevel":17,"richLevel":5,"icon":0,"roomMode":0,"roomGender":0,"gender":0,"roomType":1,"roomSource":1,"city":"长沙","starLevel":0,"portrait_path_original":"/portrait/20160221/18/100967529_4016.jpg","portrait_path_48":"/portrait/20160221/18/100967529_4016.jpg!48","portrait_path_128":"/portrait/20160221/18/100967529_4016.jpg!128","portrait_path_256":"/portrait/20160221/18/100967529_4016.jpg!256","portrait_path_272":"/portrait/20160221/18/100967529_4016.jpg!272","portrait_path_1280":"/portrait/20160221/18/100967529_4016.jpg!1280","portrait_path_400":"/portrait/20160221/18/100967529_4016.jpg!400","portrait_path_756":"/portrait/20160221/18/100967529_4016.jpg!756x567","poster_path_original":"/poster/20160911/15/100967529_1727703.JPG","poster_path_1280":"/poster/20160911/15/100967529_1727703.JPG!1280","poster_path_290":"/poster/20160911/15/100967529_1727703.JPG!290x164","poster_path_272":"/poster/20160911/15/100967529_1727703.JPG!272","poster_path_256":"/poster/20160911/15/100967529_1727703.JPG!256","poster_path_208":"/poster/20160911/15/100967529_1727703.JPG!208","poster_path_131":"/poster/20160911/15/100967529_1727703.JPG!131","poster_path_128":"/poster/20160911/15/100967529_1727703.JPG!128x96","poster_path_400":"/poster/20160911/15/100967529_1727703.JPG!400","poster_path_756":"/poster/20160911/15/100967529_1727703.JPG!756x567","poster_path_300":"/poster/20160911/15/100967529_1727703.JPG!300"}]
     * roomTotal : 233
     * pathPrefix : http://ures.kktv8.com/kktv
     * TagCode : 00000000
     */

    private int roomTotal;
    private String pathPrefix;
    private String TagCode;
    /**
     * roomId : 10032
     * userId : 10032
     * screenType : 1
     * nickname : 家族擂台赛
     * onlineCount : 20889
     * maxCount : 40000
     * liveType : 1
     * livestarttime : 1474371587000
     * liveStream : http://pull.kktv8.com/livekktv/10032.flv
     * actorLevel : 17
     * richLevel : 10
     * icon : 0
     * roomMode : 0
     * roomGender : 0
     * gender : 0
     * roomType : 1
     * roomSource : 1
     * partPosition : 1
     * city : 大同
     * starLevel : 0
     * portrait_path_original : /portrait/2013/12/19/1387440256726.png
     * portrait_path_48 : /portrait/2013/12/19/1387440256726.png!48
     * portrait_path_128 : /portrait/2013/12/19/1387440256726.png!128
     * portrait_path_256 : /portrait/2013/12/19/1387440256726.png!256
     * portrait_path_272 : /portrait/2013/12/19/1387440256726.png!272
     * portrait_path_1280 : /portrait/2013/12/19/1387440256726.png!1280
     * portrait_path_400 : /portrait/2013/12/19/1387440256726.png!400
     * portrait_path_756 : /portrait/2013/12/19/1387440256726.png!756x567
     * poster_path_original : /picture/2013/11/27/1385530010874.png
     * poster_path_1280 : /picture/2013/11/27/1385530010874.png!1280
     * poster_path_290 : /picture/2013/11/27/1385530010874.png!290x164
     * poster_path_272 : /picture/2013/11/27/1385530010874.png!272
     * poster_path_256 : /picture/2013/11/27/1385530010874.png!256
     * poster_path_208 : /picture/2013/11/27/1385530010874.png!208
     * poster_path_131 : /picture/2013/11/27/1385530010874.png!131
     * poster_path_128 : /picture/2013/11/27/1385530010874.png!128x96
     * poster_path_400 : /picture/2013/11/27/1385530010874.png!400
     * poster_path_756 : /picture/2013/11/27/1385530010874.png!756x567
     * poster_path_300 : /picture/2013/11/27/1385530010874.png!300
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
