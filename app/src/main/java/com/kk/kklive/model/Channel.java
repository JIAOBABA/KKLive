package com.kk.kklive.model;

import java.util.List;

/**
 * 频道模型
 * Created by fei on 2016/9/21.
 */
public class Channel {


    /**
     * plateList : [{"position":1,"type":6,"title":"棒直播","cdnState":1,"icon":"/kkopp/product/part/icon/81_1471417995553.png","roomTotal":3814,"liveTotal":16,"id":438,"result":[{"roomId":107560999,"userId":107560999,"screenType":2,"nickname":"咱村里最美的小花🎀","onlineCount":1506,"maxCount":0,"liveType":2,"livestarttime":1474420347829,"liveStream":"http://pull.kktv8.com/livekktv/107560999.flv","actorLevel":16,"richLevel":5,"icon":0,"roomTheme":"喜欢我的扣1 不喜欢的抠眼睛 ","roomMode":0,"roomGender":0,"gender":0,"roomType":10,"roomSource":10,"city":"美洲","starLevel":0,"portrait_path_original":"/portrait/20160914/12/107560999_815759.jpg","portrait_path_48":"/portrait/20160914/12/107560999_815759.jpg!48","portrait_path_128":"/portrait/20160914/12/107560999_815759.jpg!128","portrait_path_256":"/portrait/20160914/12/107560999_815759.jpg!256","portrait_path_272":"/portrait/20160914/12/107560999_815759.jpg!272","portrait_path_1280":"/portrait/20160914/12/107560999_815759.jpg!1280","portrait_path_400":"/portrait/20160914/12/107560999_815759.jpg!400","portrait_path_756":"/portrait/20160914/12/107560999_815759.jpg!756x567","poster_path_original":"/portrait/20160914/12/107560999_815759.jpg","poster_path_48":"/portrait/20160914/12/107560999_815759.jpg!48","poster_path_128":"/portrait/20160914/12/107560999_815759.jpg!128x96","poster_path_131":"/portrait/20160914/12/107560999_815759.jpg!131","poster_path_208":"/portrait/20160914/12/107560999_815759.jpg!208","poster_path_256":"/portrait/20160914/12/107560999_815759.jpg!256","poster_path_272":"/portrait/20160914/12/107560999_815759.jpg!272","poster_path_290":"/portrait/20160914/12/107560999_815759.jpg!290x164","poster_path_1280":"/portrait/20160914/12/107560999_815759.jpg!1280","poster_path_400":"/portrait/20160914/12/107560999_815759.jpg!400","poster_path_756":"/portrait/20160914/12/107560999_815759.jpg!756x567","poster_path_300":"/portrait/20160914/12/107560999_815759.jpg!300"},{"roomId":108093646,"userId":108093646,"screenType":2,"nickname":"XIN妹er🌺","onlineCount":2019,"maxCount":0,"liveType":2,"livestarttime":1474419023336,"liveStream":"http://pull.kktv8.com/livekktv/108093646.flv","actorLevel":18,"richLevel":1,"icon":0,"roomTheme":"蹦啥卡拉卡","roomMode":0,"roomGender":0,"gender":0,"roomType":10,"roomSource":10,"city":"哈尔滨","starLevel":0,"portrait_path_original":"/portrait/20160815/18/108093646_1532389.jpg","portrait_path_48":"/portrait/20160815/18/108093646_1532389.jpg!48","portrait_path_128":"/portrait/20160815/18/108093646_1532389.jpg!128","portrait_path_256":"/portrait/20160815/18/108093646_1532389.jpg!256","portrait_path_272":"/portrait/20160815/18/108093646_1532389.jpg!272","portrait_path_1280":"/portrait/20160815/18/108093646_1532389.jpg!1280","portrait_path_400":"/portrait/20160815/18/108093646_1532389.jpg!400","portrait_path_756":"/portrait/20160815/18/108093646_1532389.jpg!756x567","poster_path_original":"/portrait/20160815/18/108093646_1532389.jpg","poster_path_48":"/portrait/20160815/18/108093646_1532389.jpg!48","poster_path_128":"/portrait/20160815/18/108093646_1532389.jpg!128x96","poster_path_131":"/portrait/20160815/18/108093646_1532389.jpg!131","poster_path_208":"/portrait/20160815/18/108093646_1532389.jpg!208","poster_path_256":"/portrait/20160815/18/108093646_1532389.jpg!256","poster_path_272":"/portrait/20160815/18/108093646_1532389.jpg!272","poster_path_290":"/portrait/20160815/18/108093646_1532389.jpg!290x164","poster_path_1280":"/portrait/20160815/18/108093646_1532389.jpg!1280","poster_path_400":"/portrait/20160815/18/108093646_1532389.jpg!400","poster_path_756":"/portrait/20160815/18/108093646_1532389.jpg!756x567","poster_path_300":"/portrait/20160815/18/108093646_1532389.jpg!300"},{"roomId":112435628,"userId":112435628,"screenType":2,"nickname":"菠萝酱","onlineCount":1278,"maxCount":0,"liveType":2,"livestarttime":1474421571535,"liveStream":"http://pull.kktv8.com/livekktv/112435628.flv","actorLevel":2,"richLevel":0,"icon":0,"roomTheme":"摸摸鱼~","roomMode":0,"roomGender":0,"gender":0,"roomType":10,"roomSource":10,"city":"遂宁","starLevel":0,"portrait_path_original":"/portrait/20160918/12/112435628_926131.jpg","portrait_path_48":"/portrait/20160918/12/112435628_926131.jpg!48","portrait_path_128":"/portrait/20160918/12/112435628_926131.jpg!128","portrait_path_256":"/portrait/20160918/12/112435628_926131.jpg!256","portrait_path_272":"/portrait/20160918/12/112435628_926131.jpg!272","portrait_path_1280":"/portrait/20160918/12/112435628_926131.jpg!1280","portrait_path_400":"/portrait/20160918/12/112435628_926131.jpg!400","portrait_path_756":"/portrait/20160918/12/112435628_926131.jpg!756x567","poster_path_original":"/portrait/20160918/12/112435628_926131.jpg","poster_path_48":"/portrait/20160918/12/112435628_926131.jpg!48","poster_path_128":"/portrait/20160918/12/112435628_926131.jpg!128x96","poster_path_131":"/portrait/20160918/12/112435628_926131.jpg!131","poster_path_208":"/portrait/20160918/12/112435628_926131.jpg!208","poster_path_256":"/portrait/20160918/12/112435628_926131.jpg!256","poster_path_272":"/portrait/20160918/12/112435628_926131.jpg!272","poster_path_290":"/portrait/20160918/12/112435628_926131.jpg!290x164","poster_path_1280":"/portrait/20160918/12/112435628_926131.jpg!1280","poster_path_400":"/portrait/20160918/12/112435628_926131.jpg!400","poster_path_756":"/portrait/20160918/12/112435628_926131.jpg!756x567","poster_path_300":"/portrait/20160918/12/112435628_926131.jpg!300"},{"roomId":111808364,"userId":111808364,"screenType":2,"nickname":"觅觅老师","onlineCount":223,"maxCount":0,"liveType":2,"livestarttime":1474421567078,"liveStream":"http://pull.kktv8.com/livekktv/111808364.flv","actorLevel":5,"richLevel":0,"icon":0,"roomTheme":"电视台直播探秘","roomMode":0,"roomGender":0,"gender":0,"roomType":10,"roomSource":10,"city":"崇明","starLevel":0,"portrait_path_original":"/portrait/20160917/22/111808364_5239652.jpg","portrait_path_48":"/portrait/20160917/22/111808364_5239652.jpg!48","portrait_path_128":"/portrait/20160917/22/111808364_5239652.jpg!128","portrait_path_256":"/portrait/20160917/22/111808364_5239652.jpg!256","portrait_path_272":"/portrait/20160917/22/111808364_5239652.jpg!272","portrait_path_1280":"/portrait/20160917/22/111808364_5239652.jpg!1280","portrait_path_400":"/portrait/20160917/22/111808364_5239652.jpg!400","portrait_path_756":"/portrait/20160917/22/111808364_5239652.jpg!756x567","poster_path_original":"/portrait/20160917/22/111808364_5239652.jpg","poster_path_48":"/portrait/20160917/22/111808364_5239652.jpg!48","poster_path_128":"/portrait/20160917/22/111808364_5239652.jpg!128x96","poster_path_131":"/portrait/20160917/22/111808364_5239652.jpg!131","poster_path_208":"/portrait/20160917/22/111808364_5239652.jpg!208","poster_path_256":"/portrait/20160917/22/111808364_5239652.jpg!256","poster_path_272":"/portrait/20160917/22/111808364_5239652.jpg!272","poster_path_290":"/portrait/20160917/22/111808364_5239652.jpg!290x164","poster_path_1280":"/portrait/20160917/22/111808364_5239652.jpg!1280","poster_path_400":"/portrait/20160917/22/111808364_5239652.jpg!400","poster_path_756":"/portrait/20160917/22/111808364_5239652.jpg!756x567","poster_path_300":"/portrait/20160917/22/111808364_5239652.jpg!300"}]},{"position":5,"type":1,"title":"女神","cdnState":1,"icon":"/kkopp/product/part/icon/41_1471417218459.png","roomTotal":1193,"liveTotal":30,"id":421,"result":[{"roomId":105387192,"userId":105387192,"screenType":1,"nickname":"💟暴走萝莉","onlineCount":3472,"maxCount":0,"liveType":1,"livestarttime":1474419433650,"liveStream":"http://pull.kktv8.com/livekktv/105387192.flv","actorLevel":18,"richLevel":7,"icon":0,"roomMode":0,"roomGender":0,"gender":0,"roomType":1,"roomSource":1,"city":"成都","starLevel":0,"portrait_path_original":"/portrait/20160623/6/105387192_248.jpg","portrait_path_48":"/portrait/20160623/6/105387192_248.jpg!48","portrait_path_128":"/portrait/20160623/6/105387192_248.jpg!128","portrait_path_256":"/portrait/20160623/6/105387192_248.jpg!256","portrait_path_272":"/portrait/20160623/6/105387192_248.jpg!272","portrait_path_1280":"/portrait/20160623/6/105387192_248.jpg!1280","portrait_path_400":"/portrait/20160623/6/105387192_248.jpg!400","portrait_path_756":"/portrait/20160623/6/105387192_248.jpg!756x567","poster_path_original":"/picture/2016/06/29/14/105387192_03.jpg","poster_path_1280":"/picture/2016/06/29/14/105387192_03.jpg!1280","poster_path_290":"/picture/2016/06/29/14/105387192_03.jpg!290x164","poster_path_272":"/picture/2016/06/29/14/105387192_03.jpg!272","poster_path_256":"/picture/2016/06/29/14/105387192_03.jpg!256","poster_path_208":"/picture/2016/06/29/14/105387192_03.jpg!208","poster_path_131":"/picture/2016/06/29/14/105387192_03.jpg!131","poster_path_128":"/picture/2016/06/29/14/105387192_03.jpg!128x96","poster_path_400":"/picture/2016/06/29/14/105387192_03.jpg!400","poster_path_756":"/picture/2016/06/29/14/105387192_03.jpg!756x567","poster_path_300":"/picture/2016/06/29/14/105387192_03.jpg!300"},{"roomId":110765817,"userId":110765817,"screenType":1,"nickname":"橙子🍊求升1岁","onlineCount":1347,"maxCount":0,"liveType":1,"livestarttime":1474419677789,"liveStream":"http://pull.kktv8.com/livekktv/110765817.flv","actorLevel":11,"richLevel":4,"icon":0,"roomMode":0,"roomGender":0,"gender":0,"roomType":1,"roomSource":1,"city":"金华","starLevel":0,"portrait_path_original":"/portrait/20160830/17/110765817_2747205.jpg","portrait_path_48":"/portrait/20160830/17/110765817_2747205.jpg!48","portrait_path_128":"/portrait/20160830/17/110765817_2747205.jpg!128","portrait_path_256":"/portrait/20160830/17/110765817_2747205.jpg!256","portrait_path_272":"/portrait/20160830/17/110765817_2747205.jpg!272","portrait_path_1280":"/portrait/20160830/17/110765817_2747205.jpg!1280","portrait_path_400":"/portrait/20160830/17/110765817_2747205.jpg!400","portrait_path_756":"/portrait/20160830/17/110765817_2747205.jpg!756x567","poster_path_original":"/picture/2016/09/16/18/110765817_5744.jpg","poster_path_1280":"/picture/2016/09/16/18/110765817_5744.jpg!1280","poster_path_290":"/picture/2016/09/16/18/110765817_5744.jpg!290x164","poster_path_272":"/picture/2016/09/16/18/110765817_5744.jpg!272","poster_path_256":"/picture/2016/09/16/18/110765817_5744.jpg!256","poster_path_208":"/picture/2016/09/16/18/110765817_5744.jpg!208","poster_path_131":"/picture/2016/09/16/18/110765817_5744.jpg!131","poster_path_128":"/picture/2016/09/16/18/110765817_5744.jpg!128x96","poster_path_400":"/picture/2016/09/16/18/110765817_5744.jpg!400","poster_path_756":"/picture/2016/09/16/18/110765817_5744.jpg!756x567","poster_path_300":"/picture/2016/09/16/18/110765817_5744.jpg!300"},{"roomId":105784016,"userId":105784016,"screenType":1,"nickname":"以沫💋爱我可好🐰","onlineCount":2091,"maxCount":0,"liveType":1,"livestarttime":1474420871345,"liveStream":"http://pull.kktv8.com/livekktv/105784016.flv","actorLevel":16,"richLevel":3,"icon":0,"roomMode":0,"roomGender":0,"gender":0,"roomType":1,"roomSource":1,"city":"长沙","starLevel":0,"portrait_path_original":"/portrait/20160605/13/105784016_5652.jpg","portrait_path_48":"/portrait/20160605/13/105784016_5652.jpg!48","portrait_path_128":"/portrait/20160605/13/105784016_5652.jpg!128","portrait_path_256":"/portrait/20160605/13/105784016_5652.jpg!256","portrait_path_272":"/portrait/20160605/13/105784016_5652.jpg!272","portrait_path_1280":"/portrait/20160605/13/105784016_5652.jpg!1280","portrait_path_400":"/portrait/20160605/13/105784016_5652.jpg!400","portrait_path_756":"/portrait/20160605/13/105784016_5652.jpg!756x567","poster_path_original":"/poster/20160605/17/105784016_058.jpg","poster_path_1280":"/poster/20160605/17/105784016_058.jpg!1280","poster_path_290":"/poster/20160605/17/105784016_058.jpg!290x164","poster_path_272":"/poster/20160605/17/105784016_058.jpg!272","poster_path_256":"/poster/20160605/17/105784016_058.jpg!256","poster_path_208":"/poster/20160605/17/105784016_058.jpg!208","poster_path_131":"/poster/20160605/17/105784016_058.jpg!131","poster_path_128":"/poster/20160605/17/105784016_058.jpg!128x96","poster_path_400":"/poster/20160605/17/105784016_058.jpg!400","poster_path_756":"/poster/20160605/17/105784016_058.jpg!756x567","poster_path_300":"/poster/20160605/17/105784016_058.jpg!300"},{"roomId":108081700,"userId":108081700,"screenType":1,"nickname":"萝卜^_^柴","onlineCount":1845,"maxCount":0,"liveType":1,"livestarttime":1474416349929,"liveStream":"http://pull.kktv8.com/livekktv/108081700.flv","actorLevel":16,"richLevel":4,"icon":0,"roomMode":0,"roomGender":0,"gender":0,"roomType":1,"roomSource":1,"city":"衢州","starLevel":0,"luckyId":13591359,"validId":{"id":13591359,"idType":1,"isLight":1,"newIdType":1,"endTime":1476460799,"idState":1,"isEnable":2,"remainDays":0,"backIcon":"http://ures.kktv8.com/kktv/virtualid/liang_org.png","iconType":4},"portrait_path_original":"/portrait/20160906/18/108081700_1752786.jpg","portrait_path_48":"/portrait/20160906/18/108081700_1752786.jpg!48","portrait_path_128":"/portrait/20160906/18/108081700_1752786.jpg!128","portrait_path_256":"/portrait/20160906/18/108081700_1752786.jpg!256","portrait_path_272":"/portrait/20160906/18/108081700_1752786.jpg!272","portrait_path_1280":"/portrait/20160906/18/108081700_1752786.jpg!1280","portrait_path_400":"/portrait/20160906/18/108081700_1752786.jpg!400","portrait_path_756":"/portrait/20160906/18/108081700_1752786.jpg!756x567","poster_path_original":"/poster/20160912/16/108081700_23671.jpg","poster_path_1280":"/poster/20160912/16/108081700_23671.jpg!1280","poster_path_290":"/poster/20160912/16/108081700_23671.jpg!290x164","poster_path_272":"/poster/20160912/16/108081700_23671.jpg!272","poster_path_256":"/poster/20160912/16/108081700_23671.jpg!256","poster_path_208":"/poster/20160912/16/108081700_23671.jpg!208","poster_path_131":"/poster/20160912/16/108081700_23671.jpg!131","poster_path_128":"/poster/20160912/16/108081700_23671.jpg!128x96","poster_path_400":"/poster/20160912/16/108081700_23671.jpg!400","poster_path_756":"/poster/20160912/16/108081700_23671.jpg!756x567","poster_path_300":"/poster/20160912/16/108081700_23671.jpg!300"}]},{"position":6,"type":1,"title":"好声音","cdnState":1,"icon":"/kkopp/product/part/icon/41_1471417273750.png","roomTotal":1232,"liveTotal":43,"id":31,"result":[{"roomId":110325086,"userId":110325086,"screenType":1,"nickname":"筱晴，它的小情人","onlineCount":1483,"maxCount":0,"liveType":1,"livestarttime":1474418863642,"liveStream":"http://pull.kktv8.com/livekktv/110325086.flv","actorLevel":10,"richLevel":1,"icon":0,"roomMode":0,"roomGender":0,"gender":0,"roomType":1,"roomSource":1,"city":"南宁","starLevel":0,"portrait_path_original":"/portrait/20160918/1/110325086_4922372.jpg","portrait_path_48":"/portrait/20160918/1/110325086_4922372.jpg!48","portrait_path_128":"/portrait/20160918/1/110325086_4922372.jpg!128","portrait_path_256":"/portrait/20160918/1/110325086_4922372.jpg!256","portrait_path_272":"/portrait/20160918/1/110325086_4922372.jpg!272","portrait_path_1280":"/portrait/20160918/1/110325086_4922372.jpg!1280","portrait_path_400":"/portrait/20160918/1/110325086_4922372.jpg!400","portrait_path_756":"/portrait/20160918/1/110325086_4922372.jpg!756x567","poster_path_original":"/poster/20160909/18/110325086_2433752.jpg","poster_path_1280":"/poster/20160909/18/110325086_2433752.jpg!1280","poster_path_290":"/poster/20160909/18/110325086_2433752.jpg!290x164","poster_path_272":"/poster/20160909/18/110325086_2433752.jpg!272","poster_path_256":"/poster/20160909/18/110325086_2433752.jpg!256","poster_path_208":"/poster/20160909/18/110325086_2433752.jpg!208","poster_path_131":"/poster/20160909/18/110325086_2433752.jpg!131","poster_path_128":"/poster/20160909/18/110325086_2433752.jpg!128x96","poster_path_400":"/poster/20160909/18/110325086_2433752.jpg!400","poster_path_756":"/poster/20160909/18/110325086_2433752.jpg!756x567","poster_path_300":"/poster/20160909/18/110325086_2433752.jpg!300"},{"roomId":105229201,"userId":105229201,"screenType":1,"nickname":"彪子组合 战神哥冠名","onlineCount":1968,"maxCount":0,"liveType":1,"livestarttime":1474420845756,"liveStream":"http://pull.kktv8.com/livekktv/105229201.flv","actorLevel":11,"richLevel":4,"icon":0,"roomTheme":"手机播下试试感觉","roomMode":0,"roomGender":1,"gender":1,"roomType":1,"roomSource":1,"city":"聊城","starLevel":0,"portrait_path_original":"/portrait/20160407/19/105229201_3421.jpg","portrait_path_48":"/portrait/20160407/19/105229201_3421.jpg!48","portrait_path_128":"/portrait/20160407/19/105229201_3421.jpg!128","portrait_path_256":"/portrait/20160407/19/105229201_3421.jpg!256","portrait_path_272":"/portrait/20160407/19/105229201_3421.jpg!272","portrait_path_1280":"/portrait/20160407/19/105229201_3421.jpg!1280","portrait_path_400":"/portrait/20160407/19/105229201_3421.jpg!400","portrait_path_756":"/portrait/20160407/19/105229201_3421.jpg!756x567","poster_path_original":"/picture/2016/09/14/13/105229201_4336.jpg","poster_path_1280":"/picture/2016/09/14/13/105229201_4336.jpg!1280","poster_path_290":"/picture/2016/09/14/13/105229201_4336.jpg!290x164","poster_path_272":"/picture/2016/09/14/13/105229201_4336.jpg!272","poster_path_256":"/picture/2016/09/14/13/105229201_4336.jpg!256","poster_path_208":"/picture/2016/09/14/13/105229201_4336.jpg!208","poster_path_131":"/picture/2016/09/14/13/105229201_4336.jpg!131","poster_path_128":"/picture/2016/09/14/13/105229201_4336.jpg!128x96","poster_path_400":"/picture/2016/09/14/13/105229201_4336.jpg!400","poster_path_756":"/picture/2016/09/14/13/105229201_4336.jpg!756x567","poster_path_300":"/picture/2016/09/14/13/105229201_4336.jpg!300"},{"roomId":98883186,"userId":98883186,"screenType":1,"nickname":"蚁族wy小七★不将就","onlineCount":3557,"maxCount":0,"liveType":1,"livestarttime":1474413767441,"liveStream":"http://pull.kktv8.com/livekktv/98883186.flv","actorLevel":21,"richLevel":11,"icon":0,"roomMode":0,"roomGender":0,"gender":0,"roomType":1,"roomSource":1,"city":"成都","starLevel":0,"portrait_path_original":"/portrait/20160901/23/98883186_03974.jpg","portrait_path_48":"/portrait/20160901/23/98883186_03974.jpg!48","portrait_path_128":"/portrait/20160901/23/98883186_03974.jpg!128","portrait_path_256":"/portrait/20160901/23/98883186_03974.jpg!256","portrait_path_272":"/portrait/20160901/23/98883186_03974.jpg!272","portrait_path_1280":"/portrait/20160901/23/98883186_03974.jpg!1280","portrait_path_400":"/portrait/20160901/23/98883186_03974.jpg!400","portrait_path_756":"/portrait/20160901/23/98883186_03974.jpg!756x567","poster_path_original":"/poster/20160904/18/98883186_2616321.jpg","poster_path_1280":"/poster/20160904/18/98883186_2616321.jpg!1280","poster_path_290":"/poster/20160904/18/98883186_2616321.jpg!290x164","poster_path_272":"/poster/20160904/18/98883186_2616321.jpg!272","poster_path_256":"/poster/20160904/18/98883186_2616321.jpg!256","poster_path_208":"/poster/20160904/18/98883186_2616321.jpg!208","poster_path_131":"/poster/20160904/18/98883186_2616321.jpg!131","poster_path_128":"/poster/20160904/18/98883186_2616321.jpg!128x96","poster_path_400":"/poster/20160904/18/98883186_2616321.jpg!400","poster_path_756":"/poster/20160904/18/98883186_2616321.jpg!756x567","poster_path_300":"/poster/20160904/18/98883186_2616321.jpg!300"},{"roomId":106336022,"userId":106336022,"screenType":1,"nickname":"玲玲\u202b✪等你来约会","onlineCount":1968,"maxCount":0,"liveType":1,"livestarttime":1474414407304,"liveStream":"http://pull.kktv8.com/livekktv/106336022.flv","actorLevel":14,"richLevel":4,"icon":0,"roomMode":0,"roomGender":0,"gender":0,"roomType":1,"roomSource":1,"city":"亚洲","starLevel":0,"portrait_path_original":"/portrait/20160824/1/106336022_2914191.jpg","portrait_path_48":"/portrait/20160824/1/106336022_2914191.jpg!48","portrait_path_128":"/portrait/20160824/1/106336022_2914191.jpg!128","portrait_path_256":"/portrait/20160824/1/106336022_2914191.jpg!256","portrait_path_272":"/portrait/20160824/1/106336022_2914191.jpg!272","portrait_path_1280":"/portrait/20160824/1/106336022_2914191.jpg!1280","portrait_path_400":"/portrait/20160824/1/106336022_2914191.jpg!400","portrait_path_756":"/portrait/20160824/1/106336022_2914191.jpg!756x567","poster_path_original":"/picture/2016/08/27/18/106336022_1420.jpg","poster_path_1280":"/picture/2016/08/27/18/106336022_1420.jpg!1280","poster_path_290":"/picture/2016/08/27/18/106336022_1420.jpg!290x164","poster_path_272":"/picture/2016/08/27/18/106336022_1420.jpg!272","poster_path_256":"/picture/2016/08/27/18/106336022_1420.jpg!256","poster_path_208":"/picture/2016/08/27/18/106336022_1420.jpg!208","poster_path_131":"/picture/2016/08/27/18/106336022_1420.jpg!131","poster_path_128":"/picture/2016/08/27/18/106336022_1420.jpg!128x96","poster_path_400":"/picture/2016/08/27/18/106336022_1420.jpg!400","poster_path_756":"/picture/2016/08/27/18/106336022_1420.jpg!756x567","poster_path_300":"/picture/2016/08/27/18/106336022_1420.jpg!300"}]},{"position":7,"type":1,"title":"搞笑","cdnState":1,"icon":"/kkopp/product/part/icon/41_1471417289312.png","roomTotal":543,"liveTotal":16,"id":156,"result":[{"roomId":100644668,"userId":100644668,"screenType":1,"nickname":"涳城❤️套路得人心","onlineCount":1845,"maxCount":0,"liveType":1,"livestarttime":1474421209083,"liveStream":"http://pull.kktv8.com/livekktv/100644668.flv","actorLevel":15,"richLevel":6,"icon":0,"roomMode":0,"roomGender":1,"gender":1,"roomType":1,"roomSource":1,"city":"福州","starLevel":0,"portrait_path_original":"/portrait/20160427/13/100644668_647.jpg","portrait_path_48":"/portrait/20160427/13/100644668_647.jpg!48","portrait_path_128":"/portrait/20160427/13/100644668_647.jpg!128","portrait_path_256":"/portrait/20160427/13/100644668_647.jpg!256","portrait_path_272":"/portrait/20160427/13/100644668_647.jpg!272","portrait_path_1280":"/portrait/20160427/13/100644668_647.jpg!1280","portrait_path_400":"/portrait/20160427/13/100644668_647.jpg!400","portrait_path_756":"/portrait/20160427/13/100644668_647.jpg!756x567","poster_path_original":"/poster/20160401/10/100644668_1022.jpg","poster_path_1280":"/poster/20160401/10/100644668_1022.jpg!1280","poster_path_290":"/poster/20160401/10/100644668_1022.jpg!290x164","poster_path_272":"/poster/20160401/10/100644668_1022.jpg!272","poster_path_256":"/poster/20160401/10/100644668_1022.jpg!256","poster_path_208":"/poster/20160401/10/100644668_1022.jpg!208","poster_path_131":"/poster/20160401/10/100644668_1022.jpg!131","poster_path_128":"/poster/20160401/10/100644668_1022.jpg!128x96","poster_path_400":"/poster/20160401/10/100644668_1022.jpg!400","poster_path_756":"/poster/20160401/10/100644668_1022.jpg!756x567","poster_path_300":"/poster/20160401/10/100644668_1022.jpg!300"},{"roomId":108027119,"userId":108027119,"screenType":1,"nickname":"尕靖战为兰花","onlineCount":1347,"maxCount":0,"liveType":1,"livestarttime":1474410768366,"liveStream":"http://pull.kktv8.com/livekktv/108027119.flv","actorLevel":13,"richLevel":1,"icon":0,"roomMode":0,"roomGender":0,"gender":0,"roomType":1,"roomSource":2,"city":"乌鲁木齐","starLevel":0,"portrait_path_original":"/portrait/20160805/16/108027119_58343.png","portrait_path_48":"/portrait/20160805/16/108027119_58343.png!48","portrait_path_128":"/portrait/20160805/16/108027119_58343.png!128","portrait_path_256":"/portrait/20160805/16/108027119_58343.png!256","portrait_path_272":"/portrait/20160805/16/108027119_58343.png!272","portrait_path_1280":"/portrait/20160805/16/108027119_58343.png!1280","portrait_path_400":"/portrait/20160805/16/108027119_58343.png!400","portrait_path_756":"/portrait/20160805/16/108027119_58343.png!756x567","live_poster_original":"/poster/2016/09/21/09/108027119_355.jpg","live_poster_1280":"/poster/2016/09/21/09/108027119_355.jpg!1280","live_poster_290":"/poster/2016/09/21/09/108027119_355.jpg!290x164","live_poster_272":"/poster/2016/09/21/09/108027119_355.jpg!272","live_poster_256":"/poster/2016/09/21/09/108027119_355.jpg!256","live_poster_208":"/poster/2016/09/21/09/108027119_355.jpg!208","live_poster_131":"/poster/2016/09/21/09/108027119_355.jpg!131","live_poster_128":"/poster/2016/09/21/09/108027119_355.jpg!128x96","live_poster_400":"/poster/2016/09/21/09/108027119_355.jpg!400","live_poster_756":"/poster/2016/09/21/09/108027119_355.jpg!756x567","live_poster_300":"/poster/2016/09/21/09/108027119_355.jpg!300","poster_path_original":"/poster/2016/09/21/09/108027119_355.jpg","poster_path_1280":"/poster/2016/09/21/09/108027119_355.jpg!1280","poster_path_290":"/poster/2016/09/21/09/108027119_355.jpg!290x164","poster_path_272":"/poster/2016/09/21/09/108027119_355.jpg!272","poster_path_256":"/poster/2016/09/21/09/108027119_355.jpg!256","poster_path_208":"/poster/2016/09/21/09/108027119_355.jpg!208","poster_path_131":"/poster/2016/09/21/09/108027119_355.jpg!131","poster_path_128":"/poster/2016/09/21/09/108027119_355.jpg!128x96","poster_path_400":"/poster/2016/09/21/09/108027119_355.jpg!400","poster_path_756":"/poster/2016/09/21/09/108027119_355.jpg!756x567","poster_path_300":"/poster/2016/09/21/09/108027119_355.jpg!300"},{"roomId":104222002,"userId":104222002,"screenType":1,"nickname":"佩佩战为兰花","onlineCount":1968,"maxCount":0,"liveType":1,"livestarttime":1474416372712,"liveStream":"http://pull.kktv8.com/livekktv/104222002.flv","actorLevel":16,"richLevel":5,"icon":0,"roomMode":0,"roomGender":0,"gender":0,"roomType":1,"roomSource":1,"city":"西安","starLevel":0,"portrait_path_original":"/portrait/20160629/14/104222002_91.jpg","portrait_path_48":"/portrait/20160629/14/104222002_91.jpg!48","portrait_path_128":"/portrait/20160629/14/104222002_91.jpg!128","portrait_path_256":"/portrait/20160629/14/104222002_91.jpg!256","portrait_path_272":"/portrait/20160629/14/104222002_91.jpg!272","portrait_path_1280":"/portrait/20160629/14/104222002_91.jpg!1280","portrait_path_400":"/portrait/20160629/14/104222002_91.jpg!400","portrait_path_756":"/portrait/20160629/14/104222002_91.jpg!756x567","poster_path_original":"/poster/20160629/14/104222002_77.jpg","poster_path_1280":"/poster/20160629/14/104222002_77.jpg!1280","poster_path_290":"/poster/20160629/14/104222002_77.jpg!290x164","poster_path_272":"/poster/20160629/14/104222002_77.jpg!272","poster_path_256":"/poster/20160629/14/104222002_77.jpg!256","poster_path_208":"/poster/20160629/14/104222002_77.jpg!208","poster_path_131":"/poster/20160629/14/104222002_77.jpg!131","poster_path_128":"/poster/20160629/14/104222002_77.jpg!128x96","poster_path_400":"/poster/20160629/14/104222002_77.jpg!400","poster_path_756":"/poster/20160629/14/104222002_77.jpg!756x567","poster_path_300":"/poster/20160629/14/104222002_77.jpg!300"},{"roomId":100967529,"userId":100967529,"screenType":1,"nickname":"肥小肥肥啊肥爱打架","onlineCount":1845,"maxCount":0,"liveType":1,"livestarttime":1474421175548,"liveStream":"http://pull.kktv8.com/livekktv/100967529.flv","actorLevel":17,"richLevel":5,"icon":0,"roomMode":0,"roomGender":0,"gender":0,"roomType":1,"roomSource":1,"city":"长沙","starLevel":0,"portrait_path_original":"/portrait/20160221/18/100967529_4016.jpg","portrait_path_48":"/portrait/20160221/18/100967529_4016.jpg!48","portrait_path_128":"/portrait/20160221/18/100967529_4016.jpg!128","portrait_path_256":"/portrait/20160221/18/100967529_4016.jpg!256","portrait_path_272":"/portrait/20160221/18/100967529_4016.jpg!272","portrait_path_1280":"/portrait/20160221/18/100967529_4016.jpg!1280","portrait_path_400":"/portrait/20160221/18/100967529_4016.jpg!400","portrait_path_756":"/portrait/20160221/18/100967529_4016.jpg!756x567","poster_path_original":"/poster/20160911/15/100967529_1727703.JPG","poster_path_1280":"/poster/20160911/15/100967529_1727703.JPG!1280","poster_path_290":"/poster/20160911/15/100967529_1727703.JPG!290x164","poster_path_272":"/poster/20160911/15/100967529_1727703.JPG!272","poster_path_256":"/poster/20160911/15/100967529_1727703.JPG!256","poster_path_208":"/poster/20160911/15/100967529_1727703.JPG!208","poster_path_131":"/poster/20160911/15/100967529_1727703.JPG!131","poster_path_128":"/poster/20160911/15/100967529_1727703.JPG!128x96","poster_path_400":"/poster/20160911/15/100967529_1727703.JPG!400","poster_path_756":"/poster/20160911/15/100967529_1727703.JPG!756x567","poster_path_300":"/poster/20160911/15/100967529_1727703.JPG!300"}]},{"position":8,"type":1,"title":"劲爆","cdnState":1,"icon":"/kkopp/product/part/icon/41_1471417252753.png","roomTotal":465,"liveTotal":7,"id":22,"result":[{"roomId":107523335,"userId":107523335,"screenType":1,"nickname":"【WN】神一样的小五","onlineCount":1968,"maxCount":0,"liveType":1,"livestarttime":1474418624767,"liveStream":"http://pull.kktv8.com/livekktv/107523335.flv","actorLevel":13,"richLevel":7,"icon":0,"roomMode":0,"roomGender":1,"gender":1,"roomType":1,"roomSource":1,"city":"海口","starLevel":0,"portrait_path_original":"/portrait/20160817/6/107523335_2541250.jpg","portrait_path_48":"/portrait/20160817/6/107523335_2541250.jpg!48","portrait_path_128":"/portrait/20160817/6/107523335_2541250.jpg!128","portrait_path_256":"/portrait/20160817/6/107523335_2541250.jpg!256","portrait_path_272":"/portrait/20160817/6/107523335_2541250.jpg!272","portrait_path_1280":"/portrait/20160817/6/107523335_2541250.jpg!1280","portrait_path_400":"/portrait/20160817/6/107523335_2541250.jpg!400","portrait_path_756":"/portrait/20160817/6/107523335_2541250.jpg!756x567","poster_path_original":"/poster/20160904/9/107523335_41410.jpg","poster_path_1280":"/poster/20160904/9/107523335_41410.jpg!1280","poster_path_290":"/poster/20160904/9/107523335_41410.jpg!290x164","poster_path_272":"/poster/20160904/9/107523335_41410.jpg!272","poster_path_256":"/poster/20160904/9/107523335_41410.jpg!256","poster_path_208":"/poster/20160904/9/107523335_41410.jpg!208","poster_path_131":"/poster/20160904/9/107523335_41410.jpg!131","poster_path_128":"/poster/20160904/9/107523335_41410.jpg!128x96","poster_path_400":"/poster/20160904/9/107523335_41410.jpg!400","poster_path_756":"/poster/20160904/9/107523335_41410.jpg!756x567","poster_path_300":"/poster/20160904/9/107523335_41410.jpg!300"},{"roomId":89759650,"userId":89759650,"screenType":1,"nickname":"海涛σ俺想劫个色","onlineCount":2091,"maxCount":0,"liveType":1,"livestarttime":1474420073991,"liveStream":"http://pull.kktv8.com/livekktv/89759650.flv","actorLevel":17,"richLevel":7,"icon":0,"roomMode":0,"roomGender":1,"gender":1,"roomType":1,"roomSource":1,"city":"沈阳","starLevel":0,"portrait_path_original":"/portrait/20160320/22/89759650_2643.jpg","portrait_path_48":"/portrait/20160320/22/89759650_2643.jpg!48","portrait_path_128":"/portrait/20160320/22/89759650_2643.jpg!128","portrait_path_256":"/portrait/20160320/22/89759650_2643.jpg!256","portrait_path_272":"/portrait/20160320/22/89759650_2643.jpg!272","portrait_path_1280":"/portrait/20160320/22/89759650_2643.jpg!1280","portrait_path_400":"/portrait/20160320/22/89759650_2643.jpg!400","portrait_path_756":"/portrait/20160320/22/89759650_2643.jpg!756x567","poster_path_original":"/poster/20160203/16/89759650_2533.jpg","poster_path_1280":"/poster/20160203/16/89759650_2533.jpg!1280","poster_path_290":"/poster/20160203/16/89759650_2533.jpg!290x164","poster_path_272":"/poster/20160203/16/89759650_2533.jpg!272","poster_path_256":"/poster/20160203/16/89759650_2533.jpg!256","poster_path_208":"/poster/20160203/16/89759650_2533.jpg!208","poster_path_131":"/poster/20160203/16/89759650_2533.jpg!131","poster_path_128":"/poster/20160203/16/89759650_2533.jpg!128x96","poster_path_400":"/poster/20160203/16/89759650_2533.jpg!400","poster_path_756":"/poster/20160203/16/89759650_2533.jpg!756x567","poster_path_300":"/poster/20160203/16/89759650_2533.jpg!300"},{"roomId":80042238,"userId":80042238,"screenType":1,"nickname":"停留：找状态","onlineCount":1845,"maxCount":40000,"liveType":1,"livestarttime":1474420682447,"liveStream":"http://pull.kktv8.com/livekktv/80042238.flv","actorLevel":19,"richLevel":10,"icon":0,"roomTheme":"别打我。吃土呢 ","roomMode":0,"roomGender":1,"gender":1,"roomType":1,"roomSource":1,"city":"郑州","starLevel":0,"portrait_path_original":"/portrait/20150812/16/80042238_911.jpg","portrait_path_48":"/portrait/20150812/16/80042238_911.jpg!48","portrait_path_128":"/portrait/20150812/16/80042238_911.jpg!128","portrait_path_256":"/portrait/20150812/16/80042238_911.jpg!256","portrait_path_272":"/portrait/20150812/16/80042238_911.jpg!272","portrait_path_1280":"/portrait/20150812/16/80042238_911.jpg!1280","portrait_path_400":"/portrait/20150812/16/80042238_911.jpg!400","portrait_path_756":"/portrait/20150812/16/80042238_911.jpg!756x567","poster_path_original":"/poster/20160611/18/80042238_5743.jpg","poster_path_1280":"/poster/20160611/18/80042238_5743.jpg!1280","poster_path_290":"/poster/20160611/18/80042238_5743.jpg!290x164","poster_path_272":"/poster/20160611/18/80042238_5743.jpg!272","poster_path_256":"/poster/20160611/18/80042238_5743.jpg!256","poster_path_208":"/poster/20160611/18/80042238_5743.jpg!208","poster_path_131":"/poster/20160611/18/80042238_5743.jpg!131","poster_path_128":"/poster/20160611/18/80042238_5743.jpg!128x96","poster_path_400":"/poster/20160611/18/80042238_5743.jpg!400","poster_path_756":"/poster/20160611/18/80042238_5743.jpg!756x567","poster_path_300":"/poster/20160611/18/80042238_5743.jpg!300"},{"roomId":91280827,"userId":91280827,"screenType":1,"nickname":"✿女王军团ღ宠儿💫","onlineCount":2091,"maxCount":0,"liveType":1,"livestarttime":1474419456840,"liveStream":"http://pull.kktv8.com/livekktv/91280827.flv","actorLevel":16,"richLevel":10,"icon":0,"roomMode":0,"roomGender":0,"gender":0,"roomType":1,"roomSource":1,"city":"丰台","starLevel":0,"luckyId":757170,"validId":{"id":757170,"idType":1,"isLight":1,"newIdType":1,"endTime":1476115199,"idState":1,"isEnable":2,"remainDays":0,"backIcon":"http://ures.kktv8.com/kktv/virtualid/liang_org.png","iconType":4},"portrait_path_original":"/portrait/20160113/0/91280827_300.jpg","portrait_path_48":"/portrait/20160113/0/91280827_300.jpg!48","portrait_path_128":"/portrait/20160113/0/91280827_300.jpg!128","portrait_path_256":"/portrait/20160113/0/91280827_300.jpg!256","portrait_path_272":"/portrait/20160113/0/91280827_300.jpg!272","portrait_path_1280":"/portrait/20160113/0/91280827_300.jpg!1280","portrait_path_400":"/portrait/20160113/0/91280827_300.jpg!400","portrait_path_756":"/portrait/20160113/0/91280827_300.jpg!756x567","poster_path_original":"/picture/2016/07/29/17/91280827_543.jpg","poster_path_1280":"/picture/2016/07/29/17/91280827_543.jpg!1280","poster_path_290":"/picture/2016/07/29/17/91280827_543.jpg!290x164","poster_path_272":"/picture/2016/07/29/17/91280827_543.jpg!272","poster_path_256":"/picture/2016/07/29/17/91280827_543.jpg!256","poster_path_208":"/picture/2016/07/29/17/91280827_543.jpg!208","poster_path_131":"/picture/2016/07/29/17/91280827_543.jpg!131","poster_path_128":"/picture/2016/07/29/17/91280827_543.jpg!128x96","poster_path_400":"/picture/2016/07/29/17/91280827_543.jpg!400","poster_path_756":"/picture/2016/07/29/17/91280827_543.jpg!756x567","poster_path_300":"/picture/2016/07/29/17/91280827_543.jpg!300"}]},{"position":12,"type":6,"title":"游戏竞技","cdnState":1,"icon":"/kkopp/product/part/icon/41_1471487400911.png","roomTotal":4100,"liveTotal":4,"id":56,"result":[{"roomId":104558933,"userId":104558933,"screenType":1,"nickname":"XD、千面","onlineCount":2857,"maxCount":0,"liveType":1,"livestarttime":1474418412982,"liveStream":"http://pull.kktv8.com/livekktv/104558933.flv","actorLevel":11,"richLevel":2,"icon":0,"roomTheme":"LOL电一","roomMode":0,"roomGender":0,"gender":0,"roomType":1,"roomSource":2,"city":"福州","starLevel":0,"portrait_path_original":"/portrait/20160715/17/104558933_391.png","portrait_path_48":"/portrait/20160715/17/104558933_391.png!48","portrait_path_128":"/portrait/20160715/17/104558933_391.png!128","portrait_path_256":"/portrait/20160715/17/104558933_391.png!256","portrait_path_272":"/portrait/20160715/17/104558933_391.png!272","portrait_path_1280":"/portrait/20160715/17/104558933_391.png!1280","portrait_path_400":"/portrait/20160715/17/104558933_391.png!400","portrait_path_756":"/portrait/20160715/17/104558933_391.png!756x567","live_poster_original":"/poster/2016/09/21/09/104558933_353.jpg","live_poster_1280":"/poster/2016/09/21/09/104558933_353.jpg!1280","live_poster_290":"/poster/2016/09/21/09/104558933_353.jpg!290x164","live_poster_272":"/poster/2016/09/21/09/104558933_353.jpg!272","live_poster_256":"/poster/2016/09/21/09/104558933_353.jpg!256","live_poster_208":"/poster/2016/09/21/09/104558933_353.jpg!208","live_poster_131":"/poster/2016/09/21/09/104558933_353.jpg!131","live_poster_128":"/poster/2016/09/21/09/104558933_353.jpg!128x96","live_poster_400":"/poster/2016/09/21/09/104558933_353.jpg!400","live_poster_756":"/poster/2016/09/21/09/104558933_353.jpg!756x567","live_poster_300":"/poster/2016/09/21/09/104558933_353.jpg!300","poster_path_original":"/poster/2016/09/21/09/104558933_353.jpg","poster_path_1280":"/poster/2016/09/21/09/104558933_353.jpg!1280","poster_path_290":"/poster/2016/09/21/09/104558933_353.jpg!290x164","poster_path_272":"/poster/2016/09/21/09/104558933_353.jpg!272","poster_path_256":"/poster/2016/09/21/09/104558933_353.jpg!256","poster_path_208":"/poster/2016/09/21/09/104558933_353.jpg!208","poster_path_131":"/poster/2016/09/21/09/104558933_353.jpg!131","poster_path_128":"/poster/2016/09/21/09/104558933_353.jpg!128x96","poster_path_400":"/poster/2016/09/21/09/104558933_353.jpg!400","poster_path_756":"/poster/2016/09/21/09/104558933_353.jpg!756x567","poster_path_300":"/poster/2016/09/21/09/104558933_353.jpg!300"},{"roomId":107764705,"userId":107764705,"screenType":1,"nickname":"战神-瑞文是一种信念","onlineCount":729,"maxCount":0,"liveType":1,"livestarttime":1474421450376,"liveStream":"http://pull.kktv8.com/livekktv/107764705.flv","actorLevel":3,"richLevel":0,"icon":0,"roomTheme":"瑞雯是一种信念-是个才艺主播哦","roomMode":0,"roomGender":1,"gender":1,"roomType":1,"roomSource":2,"city":"江北","starLevel":0,"portrait_path_original":"/portrait/20160906/18/107764705_1921860.jpg","portrait_path_48":"/portrait/20160906/18/107764705_1921860.jpg!48","portrait_path_128":"/portrait/20160906/18/107764705_1921860.jpg!128","portrait_path_256":"/portrait/20160906/18/107764705_1921860.jpg!256","portrait_path_272":"/portrait/20160906/18/107764705_1921860.jpg!272","portrait_path_1280":"/portrait/20160906/18/107764705_1921860.jpg!1280","portrait_path_400":"/portrait/20160906/18/107764705_1921860.jpg!400","portrait_path_756":"/portrait/20160906/18/107764705_1921860.jpg!756x567","live_poster_original":"/poster/2016/09/21/09/107764705_355.jpg","live_poster_1280":"/poster/2016/09/21/09/107764705_355.jpg!1280","live_poster_290":"/poster/2016/09/21/09/107764705_355.jpg!290x164","live_poster_272":"/poster/2016/09/21/09/107764705_355.jpg!272","live_poster_256":"/poster/2016/09/21/09/107764705_355.jpg!256","live_poster_208":"/poster/2016/09/21/09/107764705_355.jpg!208","live_poster_131":"/poster/2016/09/21/09/107764705_355.jpg!131","live_poster_128":"/poster/2016/09/21/09/107764705_355.jpg!128x96","live_poster_400":"/poster/2016/09/21/09/107764705_355.jpg!400","live_poster_756":"/poster/2016/09/21/09/107764705_355.jpg!756x567","live_poster_300":"/poster/2016/09/21/09/107764705_355.jpg!300","poster_path_original":"/poster/2016/09/21/09/107764705_355.jpg","poster_path_1280":"/poster/2016/09/21/09/107764705_355.jpg!1280","poster_path_290":"/poster/2016/09/21/09/107764705_355.jpg!290x164","poster_path_272":"/poster/2016/09/21/09/107764705_355.jpg!272","poster_path_256":"/poster/2016/09/21/09/107764705_355.jpg!256","poster_path_208":"/poster/2016/09/21/09/107764705_355.jpg!208","poster_path_131":"/poster/2016/09/21/09/107764705_355.jpg!131","poster_path_128":"/poster/2016/09/21/09/107764705_355.jpg!128x96","poster_path_400":"/poster/2016/09/21/09/107764705_355.jpg!400","poster_path_756":"/poster/2016/09/21/09/107764705_355.jpg!756x567","poster_path_300":"/poster/2016/09/21/09/107764705_355.jpg!300"},{"roomId":104487013,"userId":104487013,"screenType":1,"nickname":"小强哒哒哒","onlineCount":58,"maxCount":0,"liveType":1,"livestarttime":1474421662121,"liveStream":"http://pull.kktv8.com/livekktv/104487013.flv","actorLevel":3,"richLevel":0,"icon":0,"roomTheme":"小强哒哒的直播间","roomMode":0,"roomGender":1,"gender":1,"roomType":2,"roomSource":2,"city":"三门峡","starLevel":0,"portrait_path_original":"/portrait/20160918/11/104487013_1354478.jpg","portrait_path_48":"/portrait/20160918/11/104487013_1354478.jpg!48","portrait_path_128":"/portrait/20160918/11/104487013_1354478.jpg!128","portrait_path_256":"/portrait/20160918/11/104487013_1354478.jpg!256","portrait_path_272":"/portrait/20160918/11/104487013_1354478.jpg!272","portrait_path_1280":"/portrait/20160918/11/104487013_1354478.jpg!1280","portrait_path_400":"/portrait/20160918/11/104487013_1354478.jpg!400","portrait_path_756":"/portrait/20160918/11/104487013_1354478.jpg!756x567","live_poster_original":"/poster/2016/09/21/09/104487013_355.jpg","live_poster_1280":"/poster/2016/09/21/09/104487013_355.jpg!1280","live_poster_290":"/poster/2016/09/21/09/104487013_355.jpg!290x164","live_poster_272":"/poster/2016/09/21/09/104487013_355.jpg!272","live_poster_256":"/poster/2016/09/21/09/104487013_355.jpg!256","live_poster_208":"/poster/2016/09/21/09/104487013_355.jpg!208","live_poster_131":"/poster/2016/09/21/09/104487013_355.jpg!131","live_poster_128":"/poster/2016/09/21/09/104487013_355.jpg!128x96","live_poster_400":"/poster/2016/09/21/09/104487013_355.jpg!400","live_poster_756":"/poster/2016/09/21/09/104487013_355.jpg!756x567","live_poster_300":"/poster/2016/09/21/09/104487013_355.jpg!300","poster_path_original":"/poster/2016/09/21/09/104487013_355.jpg","poster_path_1280":"/poster/2016/09/21/09/104487013_355.jpg!1280","poster_path_290":"/poster/2016/09/21/09/104487013_355.jpg!290x164","poster_path_272":"/poster/2016/09/21/09/104487013_355.jpg!272","poster_path_256":"/poster/2016/09/21/09/104487013_355.jpg!256","poster_path_208":"/poster/2016/09/21/09/104487013_355.jpg!208","poster_path_131":"/poster/2016/09/21/09/104487013_355.jpg!131","poster_path_128":"/poster/2016/09/21/09/104487013_355.jpg!128x96","poster_path_400":"/poster/2016/09/21/09/104487013_355.jpg!400","poster_path_756":"/poster/2016/09/21/09/104487013_355.jpg!756x567","poster_path_300":"/poster/2016/09/21/09/104487013_355.jpg!300"},{"roomId":43393069,"userId":43393069,"screenType":1,"nickname":"執小念","onlineCount":1,"maxCount":0,"liveType":1,"livestarttime":1474022430384,"liveStream":"http://pull.kktv8.com/livekktv/43393069.flv","actorLevel":3,"richLevel":3,"icon":0,"roomTheme":"你在我在就好","roomMode":0,"roomGender":1,"gender":1,"roomType":2,"roomSource":2,"city":"海淀","starLevel":0,"portrait_path_original":"/portrait/2014/07/21/3/43393069_3628.jpg","portrait_path_48":"/portrait/2014/07/21/3/43393069_3628.jpg!48","portrait_path_128":"/portrait/2014/07/21/3/43393069_3628.jpg!128","portrait_path_256":"/portrait/2014/07/21/3/43393069_3628.jpg!256","portrait_path_272":"/portrait/2014/07/21/3/43393069_3628.jpg!272","portrait_path_1280":"/portrait/2014/07/21/3/43393069_3628.jpg!1280","portrait_path_400":"/portrait/2014/07/21/3/43393069_3628.jpg!400","portrait_path_756":"/portrait/2014/07/21/3/43393069_3628.jpg!756x567","live_poster_original":"/poster/2016/09/16/18/43393069_4046.jpg","live_poster_1280":"/poster/2016/09/16/18/43393069_4046.jpg!1280","live_poster_290":"/poster/2016/09/16/18/43393069_4046.jpg!290x164","live_poster_272":"/poster/2016/09/16/18/43393069_4046.jpg!272","live_poster_256":"/poster/2016/09/16/18/43393069_4046.jpg!256","live_poster_208":"/poster/2016/09/16/18/43393069_4046.jpg!208","live_poster_131":"/poster/2016/09/16/18/43393069_4046.jpg!131","live_poster_128":"/poster/2016/09/16/18/43393069_4046.jpg!128x96","live_poster_400":"/poster/2016/09/16/18/43393069_4046.jpg!400","live_poster_756":"/poster/2016/09/16/18/43393069_4046.jpg!756x567","live_poster_300":"/poster/2016/09/16/18/43393069_4046.jpg!300","poster_path_original":"/poster/2016/09/16/18/43393069_4046.jpg","poster_path_1280":"/poster/2016/09/16/18/43393069_4046.jpg!1280","poster_path_290":"/poster/2016/09/16/18/43393069_4046.jpg!290x164","poster_path_272":"/poster/2016/09/16/18/43393069_4046.jpg!272","poster_path_256":"/poster/2016/09/16/18/43393069_4046.jpg!256","poster_path_208":"/poster/2016/09/16/18/43393069_4046.jpg!208","poster_path_131":"/poster/2016/09/16/18/43393069_4046.jpg!131","poster_path_128":"/poster/2016/09/16/18/43393069_4046.jpg!128x96","poster_path_400":"/poster/2016/09/16/18/43393069_4046.jpg!400","poster_path_756":"/poster/2016/09/16/18/43393069_4046.jpg!756x567","poster_path_300":"/poster/2016/09/16/18/43393069_4046.jpg!300"}]},{"position":13,"type":6,"title":"体育演出","cdnState":1,"icon":"/kkopp/product/part/icon/41_1471417603903.png","roomTotal":97,"liveTotal":0,"id":182,"result":[]},{"position":16,"type":6,"title":"影视","cdnState":1,"icon":"/kkopp/product/part/icon/41_1471417568507.png","roomTotal":20,"liveTotal":6,"id":336,"result":[{"roomId":80090197,"userId":80090197,"screenType":1,"nickname":"【老王影院】僵尸鬼片","onlineCount":15040,"maxCount":0,"liveType":1,"livestarttime":1474374774733,"liveStream":"http://pull.kktv8.com/livekktv/80090197.flv","actorLevel":16,"richLevel":8,"icon":0,"roomTheme":"老王影院正式兼并硬汉影院","roomMode":0,"roomGender":1,"gender":1,"roomType":2,"roomSource":2,"city":"宿迁","starLevel":0,"portrait_path_original":"/portrait/20160724/15/80090197_4339630.jpg","portrait_path_48":"/portrait/20160724/15/80090197_4339630.jpg!48","portrait_path_128":"/portrait/20160724/15/80090197_4339630.jpg!128","portrait_path_256":"/portrait/20160724/15/80090197_4339630.jpg!256","portrait_path_272":"/portrait/20160724/15/80090197_4339630.jpg!272","portrait_path_1280":"/portrait/20160724/15/80090197_4339630.jpg!1280","portrait_path_400":"/portrait/20160724/15/80090197_4339630.jpg!400","portrait_path_756":"/portrait/20160724/15/80090197_4339630.jpg!756x567","live_poster_original":"/poster/2016/09/21/09/80090197_351.jpg","live_poster_1280":"/poster/2016/09/21/09/80090197_351.jpg!1280","live_poster_290":"/poster/2016/09/21/09/80090197_351.jpg!290x164","live_poster_272":"/poster/2016/09/21/09/80090197_351.jpg!272","live_poster_256":"/poster/2016/09/21/09/80090197_351.jpg!256","live_poster_208":"/poster/2016/09/21/09/80090197_351.jpg!208","live_poster_131":"/poster/2016/09/21/09/80090197_351.jpg!131","live_poster_128":"/poster/2016/09/21/09/80090197_351.jpg!128x96","live_poster_400":"/poster/2016/09/21/09/80090197_351.jpg!400","live_poster_756":"/poster/2016/09/21/09/80090197_351.jpg!756x567","live_poster_300":"/poster/2016/09/21/09/80090197_351.jpg!300","poster_path_original":"/poster/2016/09/21/09/80090197_351.jpg","poster_path_1280":"/poster/2016/09/21/09/80090197_351.jpg!1280","poster_path_290":"/poster/2016/09/21/09/80090197_351.jpg!290x164","poster_path_272":"/poster/2016/09/21/09/80090197_351.jpg!272","poster_path_256":"/poster/2016/09/21/09/80090197_351.jpg!256","poster_path_208":"/poster/2016/09/21/09/80090197_351.jpg!208","poster_path_131":"/poster/2016/09/21/09/80090197_351.jpg!131","poster_path_128":"/poster/2016/09/21/09/80090197_351.jpg!128x96","poster_path_400":"/poster/2016/09/21/09/80090197_351.jpg!400","poster_path_756":"/poster/2016/09/21/09/80090197_351.jpg!756x567","poster_path_300":"/poster/2016/09/21/09/80090197_351.jpg!300"},{"roomId":99112343,"userId":99112343,"screenType":1,"nickname":"女神影院-点我进房间","onlineCount":13082,"maxCount":0,"liveType":1,"livestarttime":1474273511680,"liveStream":"http://pull.kktv8.com/livekktv/99112343.flv","actorLevel":14,"richLevel":5,"icon":0,"roomTheme":"【古惑仔系列】【周润发赌神】","roomMode":0,"roomGender":0,"gender":0,"roomType":2,"roomSource":2,"city":"长沙","starLevel":0,"portrait_path_original":"/portrait/20160124/17/99112343_738.png","portrait_path_48":"/portrait/20160124/17/99112343_738.png!48","portrait_path_128":"/portrait/20160124/17/99112343_738.png!128","portrait_path_256":"/portrait/20160124/17/99112343_738.png!256","portrait_path_272":"/portrait/20160124/17/99112343_738.png!272","portrait_path_1280":"/portrait/20160124/17/99112343_738.png!1280","portrait_path_400":"/portrait/20160124/17/99112343_738.png!400","portrait_path_756":"/portrait/20160124/17/99112343_738.png!756x567","live_poster_original":"/poster/2016/09/21/09/99112343_351.jpg","live_poster_1280":"/poster/2016/09/21/09/99112343_351.jpg!1280","live_poster_290":"/poster/2016/09/21/09/99112343_351.jpg!290x164","live_poster_272":"/poster/2016/09/21/09/99112343_351.jpg!272","live_poster_256":"/poster/2016/09/21/09/99112343_351.jpg!256","live_poster_208":"/poster/2016/09/21/09/99112343_351.jpg!208","live_poster_131":"/poster/2016/09/21/09/99112343_351.jpg!131","live_poster_128":"/poster/2016/09/21/09/99112343_351.jpg!128x96","live_poster_400":"/poster/2016/09/21/09/99112343_351.jpg!400","live_poster_756":"/poster/2016/09/21/09/99112343_351.jpg!756x567","live_poster_300":"/poster/2016/09/21/09/99112343_351.jpg!300","poster_path_original":"/poster/2016/09/21/09/99112343_351.jpg","poster_path_1280":"/poster/2016/09/21/09/99112343_351.jpg!1280","poster_path_290":"/poster/2016/09/21/09/99112343_351.jpg!290x164","poster_path_272":"/poster/2016/09/21/09/99112343_351.jpg!272","poster_path_256":"/poster/2016/09/21/09/99112343_351.jpg!256","poster_path_208":"/poster/2016/09/21/09/99112343_351.jpg!208","poster_path_131":"/poster/2016/09/21/09/99112343_351.jpg!131","poster_path_128":"/poster/2016/09/21/09/99112343_351.jpg!128x96","poster_path_400":"/poster/2016/09/21/09/99112343_351.jpg!400","poster_path_756":"/poster/2016/09/21/09/99112343_351.jpg!756x567","poster_path_300":"/poster/2016/09/21/09/99112343_351.jpg!300"},{"roomId":104621340,"userId":104621340,"screenType":1,"nickname":"宝来坞影院","onlineCount":11816,"maxCount":0,"liveType":1,"livestarttime":1474411672595,"liveStream":"http://pull.kktv8.com/livekktv/104621340.flv","actorLevel":12,"richLevel":3,"icon":0,"roomTheme":"高清 好看 有激情","roomMode":0,"roomGender":0,"gender":0,"roomType":2,"roomSource":2,"city":"非洲","starLevel":0,"portrait_path_original":"/portrait/20160824/12/104621340_460933.jpg","portrait_path_48":"/portrait/20160824/12/104621340_460933.jpg!48","portrait_path_128":"/portrait/20160824/12/104621340_460933.jpg!128","portrait_path_256":"/portrait/20160824/12/104621340_460933.jpg!256","portrait_path_272":"/portrait/20160824/12/104621340_460933.jpg!272","portrait_path_1280":"/portrait/20160824/12/104621340_460933.jpg!1280","portrait_path_400":"/portrait/20160824/12/104621340_460933.jpg!400","portrait_path_756":"/portrait/20160824/12/104621340_460933.jpg!756x567","live_poster_original":"/poster/2016/09/21/09/104621340_352.jpg","live_poster_1280":"/poster/2016/09/21/09/104621340_352.jpg!1280","live_poster_290":"/poster/2016/09/21/09/104621340_352.jpg!290x164","live_poster_272":"/poster/2016/09/21/09/104621340_352.jpg!272","live_poster_256":"/poster/2016/09/21/09/104621340_352.jpg!256","live_poster_208":"/poster/2016/09/21/09/104621340_352.jpg!208","live_poster_131":"/poster/2016/09/21/09/104621340_352.jpg!131","live_poster_128":"/poster/2016/09/21/09/104621340_352.jpg!128x96","live_poster_400":"/poster/2016/09/21/09/104621340_352.jpg!400","live_poster_756":"/poster/2016/09/21/09/104621340_352.jpg!756x567","live_poster_300":"/poster/2016/09/21/09/104621340_352.jpg!300","poster_path_original":"/poster/2016/09/21/09/104621340_352.jpg","poster_path_1280":"/poster/2016/09/21/09/104621340_352.jpg!1280","poster_path_290":"/poster/2016/09/21/09/104621340_352.jpg!290x164","poster_path_272":"/poster/2016/09/21/09/104621340_352.jpg!272","poster_path_256":"/poster/2016/09/21/09/104621340_352.jpg!256","poster_path_208":"/poster/2016/09/21/09/104621340_352.jpg!208","poster_path_131":"/poster/2016/09/21/09/104621340_352.jpg!131","poster_path_128":"/poster/2016/09/21/09/104621340_352.jpg!128x96","poster_path_400":"/poster/2016/09/21/09/104621340_352.jpg!400","poster_path_756":"/poster/2016/09/21/09/104621340_352.jpg!756x567","poster_path_300":"/poster/2016/09/21/09/104621340_352.jpg!300"},{"roomId":96694753,"userId":96694753,"screenType":1,"nickname":"僵尸鬼片惊悚剧情片","onlineCount":8651,"maxCount":0,"liveType":1,"livestarttime":1474415313370,"liveStream":"http://pull.kktv8.com/livekktv/96694753.flv","actorLevel":14,"richLevel":3,"icon":0,"roomTheme":"剧情片鬼片僵尸片","roomMode":0,"roomGender":0,"gender":0,"roomType":2,"roomSource":2,"city":"临沂","starLevel":0,"portrait_path_original":"/portrait/20160405/4/96694753_4534.jpg","portrait_path_48":"/portrait/20160405/4/96694753_4534.jpg!48","portrait_path_128":"/portrait/20160405/4/96694753_4534.jpg!128","portrait_path_256":"/portrait/20160405/4/96694753_4534.jpg!256","portrait_path_272":"/portrait/20160405/4/96694753_4534.jpg!272","portrait_path_1280":"/portrait/20160405/4/96694753_4534.jpg!1280","portrait_path_400":"/portrait/20160405/4/96694753_4534.jpg!400","portrait_path_756":"/portrait/20160405/4/96694753_4534.jpg!756x567","live_poster_original":"/poster/2016/09/21/09/96694753_353.jpg","live_poster_1280":"/poster/2016/09/21/09/96694753_353.jpg!1280","live_poster_290":"/poster/2016/09/21/09/96694753_353.jpg!290x164","live_poster_272":"/poster/2016/09/21/09/96694753_353.jpg!272","live_poster_256":"/poster/2016/09/21/09/96694753_353.jpg!256","live_poster_208":"/poster/2016/09/21/09/96694753_353.jpg!208","live_poster_131":"/poster/2016/09/21/09/96694753_353.jpg!131","live_poster_128":"/poster/2016/09/21/09/96694753_353.jpg!128x96","live_poster_400":"/poster/2016/09/21/09/96694753_353.jpg!400","live_poster_756":"/poster/2016/09/21/09/96694753_353.jpg!756x567","live_poster_300":"/poster/2016/09/21/09/96694753_353.jpg!300","poster_path_original":"/poster/2016/09/21/09/96694753_353.jpg","poster_path_1280":"/poster/2016/09/21/09/96694753_353.jpg!1280","poster_path_290":"/poster/2016/09/21/09/96694753_353.jpg!290x164","poster_path_272":"/poster/2016/09/21/09/96694753_353.jpg!272","poster_path_256":"/poster/2016/09/21/09/96694753_353.jpg!256","poster_path_208":"/poster/2016/09/21/09/96694753_353.jpg!208","poster_path_131":"/poster/2016/09/21/09/96694753_353.jpg!131","poster_path_128":"/poster/2016/09/21/09/96694753_353.jpg!128x96","poster_path_400":"/poster/2016/09/21/09/96694753_353.jpg!400","poster_path_756":"/poster/2016/09/21/09/96694753_353.jpg!756x567","poster_path_300":"/poster/2016/09/21/09/96694753_353.jpg!300"}]},{"position":18,"type":1,"title":"新秀","cdnState":1,"icon":"/kkopp/product/part/icon/41_1471417304178.png","roomTotal":1974,"liveTotal":40,"id":26,"result":[{"roomId":112680987,"userId":112680987,"screenType":1,"nickname":"后院灬四儿。","onlineCount":1845,"maxCount":0,"liveType":1,"livestarttime":1474416181072,"liveStream":"http://pull.kktv8.com/livekktv/112680987.flv","actorLevel":3,"richLevel":0,"icon":3,"isRookie":1,"roomMode":0,"roomGender":0,"gender":0,"roomType":1,"roomSource":1,"city":"成都","starLevel":0,"portrait_path_original":"/portrait/20160918/14/112680987_5949816.jpg","portrait_path_48":"/portrait/20160918/14/112680987_5949816.jpg!48","portrait_path_128":"/portrait/20160918/14/112680987_5949816.jpg!128","portrait_path_256":"/portrait/20160918/14/112680987_5949816.jpg!256","portrait_path_272":"/portrait/20160918/14/112680987_5949816.jpg!272","portrait_path_1280":"/portrait/20160918/14/112680987_5949816.jpg!1280","portrait_path_400":"/portrait/20160918/14/112680987_5949816.jpg!400","portrait_path_756":"/portrait/20160918/14/112680987_5949816.jpg!756x567","poster_path_original":"/picture/2016/09/17/17/112680987_3327.jpg","poster_path_1280":"/picture/2016/09/17/17/112680987_3327.jpg!1280","poster_path_290":"/picture/2016/09/17/17/112680987_3327.jpg!290x164","poster_path_272":"/picture/2016/09/17/17/112680987_3327.jpg!272","poster_path_256":"/picture/2016/09/17/17/112680987_3327.jpg!256","poster_path_208":"/picture/2016/09/17/17/112680987_3327.jpg!208","poster_path_131":"/picture/2016/09/17/17/112680987_3327.jpg!131","poster_path_128":"/picture/2016/09/17/17/112680987_3327.jpg!128x96","poster_path_400":"/picture/2016/09/17/17/112680987_3327.jpg!400","poster_path_756":"/picture/2016/09/17/17/112680987_3327.jpg!756x567","poster_path_300":"/picture/2016/09/17/17/112680987_3327.jpg!300"},{"roomId":112540737,"userId":112540737,"screenType":1,"nickname":"无意与你相识在网络里","onlineCount":1845,"maxCount":0,"liveType":1,"livestarttime":1474420521667,"liveStream":"http://pull.kktv8.com/livekktv/112540737.flv","actorLevel":1,"richLevel":0,"icon":3,"isRookie":1,"roomMode":0,"roomGender":1,"gender":1,"roomType":1,"roomSource":1,"city":"芜湖","starLevel":0,"portrait_path_original":"/portrait/20160918/18/112540737_5240944.jpg","portrait_path_48":"/portrait/20160918/18/112540737_5240944.jpg!48","portrait_path_128":"/portrait/20160918/18/112540737_5240944.jpg!128","portrait_path_256":"/portrait/20160918/18/112540737_5240944.jpg!256","portrait_path_272":"/portrait/20160918/18/112540737_5240944.jpg!272","portrait_path_1280":"/portrait/20160918/18/112540737_5240944.jpg!1280","portrait_path_400":"/portrait/20160918/18/112540737_5240944.jpg!400","portrait_path_756":"/portrait/20160918/18/112540737_5240944.jpg!756x567","poster_path_original":"/poster/20160918/6/112540737_2455604.jpg","poster_path_1280":"/poster/20160918/6/112540737_2455604.jpg!1280","poster_path_290":"/poster/20160918/6/112540737_2455604.jpg!290x164","poster_path_272":"/poster/20160918/6/112540737_2455604.jpg!272","poster_path_256":"/poster/20160918/6/112540737_2455604.jpg!256","poster_path_208":"/poster/20160918/6/112540737_2455604.jpg!208","poster_path_131":"/poster/20160918/6/112540737_2455604.jpg!131","poster_path_128":"/poster/20160918/6/112540737_2455604.jpg!128x96","poster_path_400":"/poster/20160918/6/112540737_2455604.jpg!400","poster_path_756":"/poster/20160918/6/112540737_2455604.jpg!756x567","poster_path_300":"/poster/20160918/6/112540737_2455604.jpg!300"},{"roomId":112763882,"userId":112763882,"screenType":1,"nickname":"静静▲女神","onlineCount":3566,"maxCount":0,"liveType":1,"livestarttime":1474420856258,"liveStream":"http://pull.kktv8.com/livekktv/112763882.flv","actorLevel":3,"richLevel":0,"icon":3,"isRookie":1,"roomMode":0,"roomGender":0,"gender":0,"roomType":1,"roomSource":1,"city":"杭州","starLevel":0,"portrait_path_original":"/portrait/20160920/12/112763882_285585.png","portrait_path_48":"/portrait/20160920/12/112763882_285585.png!48","portrait_path_128":"/portrait/20160920/12/112763882_285585.png!128","portrait_path_256":"/portrait/20160920/12/112763882_285585.png!256","portrait_path_272":"/portrait/20160920/12/112763882_285585.png!272","portrait_path_1280":"/portrait/20160920/12/112763882_285585.png!1280","portrait_path_400":"/portrait/20160920/12/112763882_285585.png!400","portrait_path_756":"/portrait/20160920/12/112763882_285585.png!756x567","poster_path_original":"/poster/20160920/13/112763882_1119222.jpg","poster_path_1280":"/poster/20160920/13/112763882_1119222.jpg!1280","poster_path_290":"/poster/20160920/13/112763882_1119222.jpg!290x164","poster_path_272":"/poster/20160920/13/112763882_1119222.jpg!272","poster_path_256":"/poster/20160920/13/112763882_1119222.jpg!256","poster_path_208":"/poster/20160920/13/112763882_1119222.jpg!208","poster_path_131":"/poster/20160920/13/112763882_1119222.jpg!131","poster_path_128":"/poster/20160920/13/112763882_1119222.jpg!128x96","poster_path_400":"/poster/20160920/13/112763882_1119222.jpg!400","poster_path_756":"/poster/20160920/13/112763882_1119222.jpg!756x567","poster_path_300":"/poster/20160920/13/112763882_1119222.jpg!300"},{"roomId":112678600,"userId":112678600,"screenType":1,"nickname":"漓江烟雨-新人","onlineCount":1421,"maxCount":0,"liveType":1,"livestarttime":1474417140787,"liveStream":"http://pull.kktv8.com/livekktv/112678600.flv","actorLevel":3,"richLevel":0,"icon":3,"isRookie":1,"roomMode":0,"roomGender":0,"gender":0,"roomType":1,"roomSource":1,"city":"西安","starLevel":0,"portrait_path_original":"/portrait/20160920/13/112678600_3923669.jpeg","portrait_path_48":"/portrait/20160920/13/112678600_3923669.jpeg!48","portrait_path_128":"/portrait/20160920/13/112678600_3923669.jpeg!128","portrait_path_256":"/portrait/20160920/13/112678600_3923669.jpeg!256","portrait_path_272":"/portrait/20160920/13/112678600_3923669.jpeg!272","portrait_path_1280":"/portrait/20160920/13/112678600_3923669.jpeg!1280","portrait_path_400":"/portrait/20160920/13/112678600_3923669.jpeg!400","portrait_path_756":"/portrait/20160920/13/112678600_3923669.jpeg!756x567","poster_path_original":"/picture/2016/09/20/13/112678600_413.jpg","poster_path_1280":"/picture/2016/09/20/13/112678600_413.jpg!1280","poster_path_290":"/picture/2016/09/20/13/112678600_413.jpg!290x164","poster_path_272":"/picture/2016/09/20/13/112678600_413.jpg!272","poster_path_256":"/picture/2016/09/20/13/112678600_413.jpg!256","poster_path_208":"/picture/2016/09/20/13/112678600_413.jpg!208","poster_path_131":"/picture/2016/09/20/13/112678600_413.jpg!131","poster_path_128":"/picture/2016/09/20/13/112678600_413.jpg!128x96","poster_path_400":"/picture/2016/09/20/13/112678600_413.jpg!400","poster_path_756":"/picture/2016/09/20/13/112678600_413.jpg!756x567","poster_path_300":"/picture/2016/09/20/13/112678600_413.jpg!300"}]},{"position":19,"type":1,"title":"梦想舞台","cdnState":1,"icon":"/kkopp/product/part/icon/41_1471417427948.png","roomTotal":55,"liveTotal":41,"id":397,"result":[{"roomId":104679442,"userId":104679442,"screenType":1,"nickname":"争奇斗艳第二季回顾","onlineCount":1,"maxCount":0,"liveType":1,"livestarttime":1458803060000,"liveStream":"http://pull.kktv8.com/livekktv/104679442.flv","actorLevel":3,"richLevel":0,"icon":0,"roomMode":0,"roomGender":0,"gender":0,"roomType":1,"roomSource":1,"partPosition":1,"city":"杭州","starLevel":0,"portrait_path_original":"/portrait/20160321/12/104679442_1149.jpg","portrait_path_48":"/portrait/20160321/12/104679442_1149.jpg!48","portrait_path_128":"/portrait/20160321/12/104679442_1149.jpg!128","portrait_path_256":"/portrait/20160321/12/104679442_1149.jpg!256","portrait_path_272":"/portrait/20160321/12/104679442_1149.jpg!272","portrait_path_1280":"/portrait/20160321/12/104679442_1149.jpg!1280","portrait_path_400":"/portrait/20160321/12/104679442_1149.jpg!400","portrait_path_756":"/portrait/20160321/12/104679442_1149.jpg!756x567","poster_path_original":"/poster/20160516/13/104679442_1159.jpg","poster_path_1280":"/poster/20160516/13/104679442_1159.jpg!1280","poster_path_290":"/poster/20160516/13/104679442_1159.jpg!290x164","poster_path_272":"/poster/20160516/13/104679442_1159.jpg!272","poster_path_256":"/poster/20160516/13/104679442_1159.jpg!256","poster_path_208":"/poster/20160516/13/104679442_1159.jpg!208","poster_path_131":"/poster/20160516/13/104679442_1159.jpg!131","poster_path_128":"/poster/20160516/13/104679442_1159.jpg!128x96","poster_path_400":"/poster/20160516/13/104679442_1159.jpg!400","poster_path_756":"/poster/20160516/13/104679442_1159.jpg!756x567","poster_path_300":"/poster/20160516/13/104679442_1159.jpg!300"},{"roomId":106097190,"userId":106097190,"screenType":1,"nickname":"获奖微电影颁奖典礼","onlineCount":0,"maxCount":0,"liveType":1,"livestarttime":1461940105726,"liveStream":"http://pull.kktv8.com/livekktv/106097190.flv","actorLevel":1,"richLevel":0,"icon":0,"roomMode":0,"roomGender":1,"gender":1,"roomType":1,"roomSource":1,"city":"杭州","starLevel":0,"portrait_path_original":"/portrait/default/user_head.jpg","portrait_path_48":"/portrait/default/user_head.jpg!48","portrait_path_128":"/portrait/default/user_head.jpg!128","portrait_path_256":"/portrait/default/user_head.jpg!256","portrait_path_272":"/portrait/default/user_head.jpg!272","portrait_path_1280":"/portrait/default/user_head.jpg!1280","portrait_path_400":"/portrait/default/user_head.jpg!400","portrait_path_756":"/portrait/default/user_head.jpg!756x567","poster_path_original":"/picture/2016/05/03/18/106097190_2532.jpg","poster_path_1280":"/picture/2016/05/03/18/106097190_2532.jpg!1280","poster_path_290":"/picture/2016/05/03/18/106097190_2532.jpg!290x164","poster_path_272":"/picture/2016/05/03/18/106097190_2532.jpg!272","poster_path_256":"/picture/2016/05/03/18/106097190_2532.jpg!256","poster_path_208":"/picture/2016/05/03/18/106097190_2532.jpg!208","poster_path_131":"/picture/2016/05/03/18/106097190_2532.jpg!131","poster_path_128":"/picture/2016/05/03/18/106097190_2532.jpg!128x96","poster_path_400":"/picture/2016/05/03/18/106097190_2532.jpg!400","poster_path_756":"/picture/2016/05/03/18/106097190_2532.jpg!756x567","poster_path_300":"/picture/2016/05/03/18/106097190_2532.jpg!300"},{"roomId":109571419,"userId":109571419,"screenType":1,"nickname":"微电影-星星的守护","onlineCount":0,"maxCount":0,"liveType":1,"livestarttime":1468836840562,"liveStream":"http://pull.kktv8.com/livekktv/109571419.flv","actorLevel":1,"richLevel":0,"icon":0,"roomMode":0,"roomGender":1,"gender":1,"roomType":1,"roomSource":2,"city":"杭州","starLevel":0,"portrait_path_original":"/portrait/default/user_head.jpg","portrait_path_48":"/portrait/default/user_head.jpg!48","portrait_path_128":"/portrait/default/user_head.jpg!128","portrait_path_256":"/portrait/default/user_head.jpg!256","portrait_path_272":"/portrait/default/user_head.jpg!272","portrait_path_1280":"/portrait/default/user_head.jpg!1280","portrait_path_400":"/portrait/default/user_head.jpg!400","portrait_path_756":"/portrait/default/user_head.jpg!756x567","live_poster_original":"/poster/2016/09/21/09/109571419_356.jpg","live_poster_1280":"/poster/2016/09/21/09/109571419_356.jpg!1280","live_poster_290":"/poster/2016/09/21/09/109571419_356.jpg!290x164","live_poster_272":"/poster/2016/09/21/09/109571419_356.jpg!272","live_poster_256":"/poster/2016/09/21/09/109571419_356.jpg!256","live_poster_208":"/poster/2016/09/21/09/109571419_356.jpg!208","live_poster_131":"/poster/2016/09/21/09/109571419_356.jpg!131","live_poster_128":"/poster/2016/09/21/09/109571419_356.jpg!128x96","live_poster_400":"/poster/2016/09/21/09/109571419_356.jpg!400","live_poster_756":"/poster/2016/09/21/09/109571419_356.jpg!756x567","live_poster_300":"/poster/2016/09/21/09/109571419_356.jpg!300","poster_path_original":"/poster/2016/09/21/09/109571419_356.jpg","poster_path_1280":"/poster/2016/09/21/09/109571419_356.jpg!1280","poster_path_290":"/poster/2016/09/21/09/109571419_356.jpg!290x164","poster_path_272":"/poster/2016/09/21/09/109571419_356.jpg!272","poster_path_256":"/poster/2016/09/21/09/109571419_356.jpg!256","poster_path_208":"/poster/2016/09/21/09/109571419_356.jpg!208","poster_path_131":"/poster/2016/09/21/09/109571419_356.jpg!131","poster_path_128":"/poster/2016/09/21/09/109571419_356.jpg!128x96","poster_path_400":"/poster/2016/09/21/09/109571419_356.jpg!400","poster_path_756":"/poster/2016/09/21/09/109571419_356.jpg!756x567","poster_path_300":"/poster/2016/09/21/09/109571419_356.jpg!300"},{"roomId":109570102,"userId":109570102,"screenType":1,"nickname":"微电影-带爱回家","onlineCount":0,"maxCount":0,"liveType":1,"livestarttime":1468836742099,"liveStream":"http://pull.kktv8.com/livekktv/109570102.flv","actorLevel":1,"richLevel":0,"icon":0,"roomMode":0,"roomGender":1,"gender":1,"roomType":1,"roomSource":2,"city":"杭州","starLevel":0,"portrait_path_original":"/portrait/default/user_head.jpg","portrait_path_48":"/portrait/default/user_head.jpg!48","portrait_path_128":"/portrait/default/user_head.jpg!128","portrait_path_256":"/portrait/default/user_head.jpg!256","portrait_path_272":"/portrait/default/user_head.jpg!272","portrait_path_1280":"/portrait/default/user_head.jpg!1280","portrait_path_400":"/portrait/default/user_head.jpg!400","portrait_path_756":"/portrait/default/user_head.jpg!756x567","live_poster_original":"/poster/2016/07/29/15/109570102_5614.jpg","live_poster_1280":"/poster/2016/07/29/15/109570102_5614.jpg!1280","live_poster_290":"/poster/2016/07/29/15/109570102_5614.jpg!290x164","live_poster_272":"/poster/2016/07/29/15/109570102_5614.jpg!272","live_poster_256":"/poster/2016/07/29/15/109570102_5614.jpg!256","live_poster_208":"/poster/2016/07/29/15/109570102_5614.jpg!208","live_poster_131":"/poster/2016/07/29/15/109570102_5614.jpg!131","live_poster_128":"/poster/2016/07/29/15/109570102_5614.jpg!128x96","live_poster_400":"/poster/2016/07/29/15/109570102_5614.jpg!400","live_poster_756":"/poster/2016/07/29/15/109570102_5614.jpg!756x567","live_poster_300":"/poster/2016/07/29/15/109570102_5614.jpg!300","poster_path_original":"/poster/2016/07/29/15/109570102_5614.jpg","poster_path_1280":"/poster/2016/07/29/15/109570102_5614.jpg!1280","poster_path_290":"/poster/2016/07/29/15/109570102_5614.jpg!290x164","poster_path_272":"/poster/2016/07/29/15/109570102_5614.jpg!272","poster_path_256":"/poster/2016/07/29/15/109570102_5614.jpg!256","poster_path_208":"/poster/2016/07/29/15/109570102_5614.jpg!208","poster_path_131":"/poster/2016/07/29/15/109570102_5614.jpg!131","poster_path_128":"/poster/2016/07/29/15/109570102_5614.jpg!128x96","poster_path_400":"/poster/2016/07/29/15/109570102_5614.jpg!400","poster_path_756":"/poster/2016/07/29/15/109570102_5614.jpg!756x567","poster_path_300":"/poster/2016/07/29/15/109570102_5614.jpg!300"}]}]
     * pathPrefix : http://ures.kktv8.com/kktv
     * TagCode : 00000000
     */

    private String pathPrefix;
    private String TagCode;
    /**
     * position : 1
     * type : 6
     * title : 棒直播
     * cdnState : 1
     * icon : /kkopp/product/part/icon/81_1471417995553.png
     * roomTotal : 3814
     * liveTotal : 16
     * id : 438
     * result : [{"roomId":107560999,"userId":107560999,"screenType":2,"nickname":"咱村里最美的小花🎀","onlineCount":1506,"maxCount":0,"liveType":2,"livestarttime":1474420347829,"liveStream":"http://pull.kktv8.com/livekktv/107560999.flv","actorLevel":16,"richLevel":5,"icon":0,"roomTheme":"喜欢我的扣1 不喜欢的抠眼睛 ","roomMode":0,"roomGender":0,"gender":0,"roomType":10,"roomSource":10,"city":"美洲","starLevel":0,"portrait_path_original":"/portrait/20160914/12/107560999_815759.jpg","portrait_path_48":"/portrait/20160914/12/107560999_815759.jpg!48","portrait_path_128":"/portrait/20160914/12/107560999_815759.jpg!128","portrait_path_256":"/portrait/20160914/12/107560999_815759.jpg!256","portrait_path_272":"/portrait/20160914/12/107560999_815759.jpg!272","portrait_path_1280":"/portrait/20160914/12/107560999_815759.jpg!1280","portrait_path_400":"/portrait/20160914/12/107560999_815759.jpg!400","portrait_path_756":"/portrait/20160914/12/107560999_815759.jpg!756x567","poster_path_original":"/portrait/20160914/12/107560999_815759.jpg","poster_path_48":"/portrait/20160914/12/107560999_815759.jpg!48","poster_path_128":"/portrait/20160914/12/107560999_815759.jpg!128x96","poster_path_131":"/portrait/20160914/12/107560999_815759.jpg!131","poster_path_208":"/portrait/20160914/12/107560999_815759.jpg!208","poster_path_256":"/portrait/20160914/12/107560999_815759.jpg!256","poster_path_272":"/portrait/20160914/12/107560999_815759.jpg!272","poster_path_290":"/portrait/20160914/12/107560999_815759.jpg!290x164","poster_path_1280":"/portrait/20160914/12/107560999_815759.jpg!1280","poster_path_400":"/portrait/20160914/12/107560999_815759.jpg!400","poster_path_756":"/portrait/20160914/12/107560999_815759.jpg!756x567","poster_path_300":"/portrait/20160914/12/107560999_815759.jpg!300"},{"roomId":108093646,"userId":108093646,"screenType":2,"nickname":"XIN妹er🌺","onlineCount":2019,"maxCount":0,"liveType":2,"livestarttime":1474419023336,"liveStream":"http://pull.kktv8.com/livekktv/108093646.flv","actorLevel":18,"richLevel":1,"icon":0,"roomTheme":"蹦啥卡拉卡","roomMode":0,"roomGender":0,"gender":0,"roomType":10,"roomSource":10,"city":"哈尔滨","starLevel":0,"portrait_path_original":"/portrait/20160815/18/108093646_1532389.jpg","portrait_path_48":"/portrait/20160815/18/108093646_1532389.jpg!48","portrait_path_128":"/portrait/20160815/18/108093646_1532389.jpg!128","portrait_path_256":"/portrait/20160815/18/108093646_1532389.jpg!256","portrait_path_272":"/portrait/20160815/18/108093646_1532389.jpg!272","portrait_path_1280":"/portrait/20160815/18/108093646_1532389.jpg!1280","portrait_path_400":"/portrait/20160815/18/108093646_1532389.jpg!400","portrait_path_756":"/portrait/20160815/18/108093646_1532389.jpg!756x567","poster_path_original":"/portrait/20160815/18/108093646_1532389.jpg","poster_path_48":"/portrait/20160815/18/108093646_1532389.jpg!48","poster_path_128":"/portrait/20160815/18/108093646_1532389.jpg!128x96","poster_path_131":"/portrait/20160815/18/108093646_1532389.jpg!131","poster_path_208":"/portrait/20160815/18/108093646_1532389.jpg!208","poster_path_256":"/portrait/20160815/18/108093646_1532389.jpg!256","poster_path_272":"/portrait/20160815/18/108093646_1532389.jpg!272","poster_path_290":"/portrait/20160815/18/108093646_1532389.jpg!290x164","poster_path_1280":"/portrait/20160815/18/108093646_1532389.jpg!1280","poster_path_400":"/portrait/20160815/18/108093646_1532389.jpg!400","poster_path_756":"/portrait/20160815/18/108093646_1532389.jpg!756x567","poster_path_300":"/portrait/20160815/18/108093646_1532389.jpg!300"},{"roomId":112435628,"userId":112435628,"screenType":2,"nickname":"菠萝酱","onlineCount":1278,"maxCount":0,"liveType":2,"livestarttime":1474421571535,"liveStream":"http://pull.kktv8.com/livekktv/112435628.flv","actorLevel":2,"richLevel":0,"icon":0,"roomTheme":"摸摸鱼~","roomMode":0,"roomGender":0,"gender":0,"roomType":10,"roomSource":10,"city":"遂宁","starLevel":0,"portrait_path_original":"/portrait/20160918/12/112435628_926131.jpg","portrait_path_48":"/portrait/20160918/12/112435628_926131.jpg!48","portrait_path_128":"/portrait/20160918/12/112435628_926131.jpg!128","portrait_path_256":"/portrait/20160918/12/112435628_926131.jpg!256","portrait_path_272":"/portrait/20160918/12/112435628_926131.jpg!272","portrait_path_1280":"/portrait/20160918/12/112435628_926131.jpg!1280","portrait_path_400":"/portrait/20160918/12/112435628_926131.jpg!400","portrait_path_756":"/portrait/20160918/12/112435628_926131.jpg!756x567","poster_path_original":"/portrait/20160918/12/112435628_926131.jpg","poster_path_48":"/portrait/20160918/12/112435628_926131.jpg!48","poster_path_128":"/portrait/20160918/12/112435628_926131.jpg!128x96","poster_path_131":"/portrait/20160918/12/112435628_926131.jpg!131","poster_path_208":"/portrait/20160918/12/112435628_926131.jpg!208","poster_path_256":"/portrait/20160918/12/112435628_926131.jpg!256","poster_path_272":"/portrait/20160918/12/112435628_926131.jpg!272","poster_path_290":"/portrait/20160918/12/112435628_926131.jpg!290x164","poster_path_1280":"/portrait/20160918/12/112435628_926131.jpg!1280","poster_path_400":"/portrait/20160918/12/112435628_926131.jpg!400","poster_path_756":"/portrait/20160918/12/112435628_926131.jpg!756x567","poster_path_300":"/portrait/20160918/12/112435628_926131.jpg!300"},{"roomId":111808364,"userId":111808364,"screenType":2,"nickname":"觅觅老师","onlineCount":223,"maxCount":0,"liveType":2,"livestarttime":1474421567078,"liveStream":"http://pull.kktv8.com/livekktv/111808364.flv","actorLevel":5,"richLevel":0,"icon":0,"roomTheme":"电视台直播探秘","roomMode":0,"roomGender":0,"gender":0,"roomType":10,"roomSource":10,"city":"崇明","starLevel":0,"portrait_path_original":"/portrait/20160917/22/111808364_5239652.jpg","portrait_path_48":"/portrait/20160917/22/111808364_5239652.jpg!48","portrait_path_128":"/portrait/20160917/22/111808364_5239652.jpg!128","portrait_path_256":"/portrait/20160917/22/111808364_5239652.jpg!256","portrait_path_272":"/portrait/20160917/22/111808364_5239652.jpg!272","portrait_path_1280":"/portrait/20160917/22/111808364_5239652.jpg!1280","portrait_path_400":"/portrait/20160917/22/111808364_5239652.jpg!400","portrait_path_756":"/portrait/20160917/22/111808364_5239652.jpg!756x567","poster_path_original":"/portrait/20160917/22/111808364_5239652.jpg","poster_path_48":"/portrait/20160917/22/111808364_5239652.jpg!48","poster_path_128":"/portrait/20160917/22/111808364_5239652.jpg!128x96","poster_path_131":"/portrait/20160917/22/111808364_5239652.jpg!131","poster_path_208":"/portrait/20160917/22/111808364_5239652.jpg!208","poster_path_256":"/portrait/20160917/22/111808364_5239652.jpg!256","poster_path_272":"/portrait/20160917/22/111808364_5239652.jpg!272","poster_path_290":"/portrait/20160917/22/111808364_5239652.jpg!290x164","poster_path_1280":"/portrait/20160917/22/111808364_5239652.jpg!1280","poster_path_400":"/portrait/20160917/22/111808364_5239652.jpg!400","poster_path_756":"/portrait/20160917/22/111808364_5239652.jpg!756x567","poster_path_300":"/portrait/20160917/22/111808364_5239652.jpg!300"}]
     */

    private List<PlateListBean> plateList;

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

    public List<PlateListBean> getPlateList() {
        return plateList;
    }

    public void setPlateList(List<PlateListBean> plateList) {
        this.plateList = plateList;
    }

    public static class PlateListBean {
        private int position;
        private int type;
        private String title;
        private int cdnState;
        private String icon;
        private int roomTotal;
        private int liveTotal;
        private int id;
        /**
         * roomId : 107560999
         * userId : 107560999
         * screenType : 2
         * nickname : 咱村里最美的小花🎀
         * onlineCount : 1506
         * maxCount : 0
         * liveType : 2
         * livestarttime : 1474420347829
         * liveStream : http://pull.kktv8.com/livekktv/107560999.flv
         * actorLevel : 16
         * richLevel : 5
         * icon : 0
         * roomTheme : 喜欢我的扣1 不喜欢的抠眼睛
         * roomMode : 0
         * roomGender : 0
         * gender : 0
         * roomType : 10
         * roomSource : 10
         * city : 美洲
         * starLevel : 0
         * portrait_path_original : /portrait/20160914/12/107560999_815759.jpg
         * portrait_path_48 : /portrait/20160914/12/107560999_815759.jpg!48
         * portrait_path_128 : /portrait/20160914/12/107560999_815759.jpg!128
         * portrait_path_256 : /portrait/20160914/12/107560999_815759.jpg!256
         * portrait_path_272 : /portrait/20160914/12/107560999_815759.jpg!272
         * portrait_path_1280 : /portrait/20160914/12/107560999_815759.jpg!1280
         * portrait_path_400 : /portrait/20160914/12/107560999_815759.jpg!400
         * portrait_path_756 : /portrait/20160914/12/107560999_815759.jpg!756x567
         * poster_path_original : /portrait/20160914/12/107560999_815759.jpg
         * poster_path_48 : /portrait/20160914/12/107560999_815759.jpg!48
         * poster_path_128 : /portrait/20160914/12/107560999_815759.jpg!128x96
         * poster_path_131 : /portrait/20160914/12/107560999_815759.jpg!131
         * poster_path_208 : /portrait/20160914/12/107560999_815759.jpg!208
         * poster_path_256 : /portrait/20160914/12/107560999_815759.jpg!256
         * poster_path_272 : /portrait/20160914/12/107560999_815759.jpg!272
         * poster_path_290 : /portrait/20160914/12/107560999_815759.jpg!290x164
         * poster_path_1280 : /portrait/20160914/12/107560999_815759.jpg!1280
         * poster_path_400 : /portrait/20160914/12/107560999_815759.jpg!400
         * poster_path_756 : /portrait/20160914/12/107560999_815759.jpg!756x567
         * poster_path_300 : /portrait/20160914/12/107560999_815759.jpg!300
         */

        private List<ResultBean> result;

        public int getPosition() {
            return position;
        }

        public void setPosition(int position) {
            this.position = position;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getCdnState() {
            return cdnState;
        }

        public void setCdnState(int cdnState) {
            this.cdnState = cdnState;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public int getRoomTotal() {
            return roomTotal;
        }

        public void setRoomTotal(int roomTotal) {
            this.roomTotal = roomTotal;
        }

        public int getLiveTotal() {
            return liveTotal;
        }

        public void setLiveTotal(int liveTotal) {
            this.liveTotal = liveTotal;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public List<ResultBean> getResult() {
            return result;
        }

        public void setResult(List<ResultBean> result) {
            this.result = result;
        }

        public static class ResultBean {
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
            private String poster_path_48;
            private String poster_path_128;
            private String poster_path_131;
            private String poster_path_208;
            private String poster_path_256;
            private String poster_path_272;
            private String poster_path_290;
            private String poster_path_1280;
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

            public String getPoster_path_48() {
                return poster_path_48;
            }

            public void setPoster_path_48(String poster_path_48) {
                this.poster_path_48 = poster_path_48;
            }

            public String getPoster_path_128() {
                return poster_path_128;
            }

            public void setPoster_path_128(String poster_path_128) {
                this.poster_path_128 = poster_path_128;
            }

            public String getPoster_path_131() {
                return poster_path_131;
            }

            public void setPoster_path_131(String poster_path_131) {
                this.poster_path_131 = poster_path_131;
            }

            public String getPoster_path_208() {
                return poster_path_208;
            }

            public void setPoster_path_208(String poster_path_208) {
                this.poster_path_208 = poster_path_208;
            }

            public String getPoster_path_256() {
                return poster_path_256;
            }

            public void setPoster_path_256(String poster_path_256) {
                this.poster_path_256 = poster_path_256;
            }

            public String getPoster_path_272() {
                return poster_path_272;
            }

            public void setPoster_path_272(String poster_path_272) {
                this.poster_path_272 = poster_path_272;
            }

            public String getPoster_path_290() {
                return poster_path_290;
            }

            public void setPoster_path_290(String poster_path_290) {
                this.poster_path_290 = poster_path_290;
            }

            public String getPoster_path_1280() {
                return poster_path_1280;
            }

            public void setPoster_path_1280(String poster_path_1280) {
                this.poster_path_1280 = poster_path_1280;
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
}
