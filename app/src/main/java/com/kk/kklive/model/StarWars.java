package com.kk.kklive.model;

import java.util.List;

/**
 * Created by fei on 2016/9/22.
 */
public class StarWars {


    /**
     * rankList : [{"userId":80053742,"giftName":"吃货","giftCount":1462808,"giftId":40000092,"giftWorth":146280800,"nickName":"妮可1117🍃","giftPic":"http://rescdn.kktv8.com/kktv/icon/web/gift/png/40000092.png","liveType":1,"livestarttime":1474532451521,"liveStream":"http://pull.kktv8.com/livekktv/80053742.flv","onlineCount":3805,"actorLevel":34,"portrait_path_original":"http://ures.kktv8.com/kktv/portrait/20160914/2/80053742_4324440.jpg","portrait_path_48":"http://ures.kktv8.com/kktv/portrait/20160914/2/80053742_4324440.jpg!48","portrait_path_128":"http://ures.kktv8.com/kktv/portrait/20160914/2/80053742_4324440.jpg!128","portrait_path_256":"http://ures.kktv8.com/kktv/portrait/20160914/2/80053742_4324440.jpg!256","portrait_path_1280":"http://ures.kktv8.com/kktv/portrait/20160914/2/80053742_4324440.jpg!1280","poster_path_original":"http://ures.kktv8.com/kktv/picture/2015/11/05/19/80053742_347.jpg","poster_path_1280":"http://ures.kktv8.com/kktv/picture/2015/11/05/19/80053742_347.jpg!1280","poster_path_290":"http://ures.kktv8.com/kktv/picture/2015/11/05/19/80053742_347.jpg!290x164","poster_path_272":"http://ures.kktv8.com/kktv/picture/2015/11/05/19/80053742_347.jpg!272","poster_path_128":"http://ures.kktv8.com/kktv/picture/2015/11/05/19/80053742_347.jpg!128x96","poster_path_300":"http://ures.kktv8.com/kktv/picture/2015/11/05/19/80053742_347.jpg!300","roomSource":1,"roomType":1,"screenType":1},{"userId":81627215,"giftName":"水晶球","giftCount":450139,"giftId":40000216,"giftWorth":36011120,"nickName":"微微❤我是夏夜二乃","giftPic":"http://rescdn.kktv8.com/kktv/icon/web/gift/png/40000216.png","liveType":1,"livestarttime":1474525479943,"liveStream":"http://pull.kktv8.com/livekktv/81627215.flv","onlineCount":11183,"actorLevel":34,"portrait_path_original":"http://ures.kktv8.com/kktv/portrait/20160601/20/81627215_4541.png","portrait_path_48":"http://ures.kktv8.com/kktv/portrait/20160601/20/81627215_4541.png!48","portrait_path_128":"http://ures.kktv8.com/kktv/portrait/20160601/20/81627215_4541.png!128","portrait_path_256":"http://ures.kktv8.com/kktv/portrait/20160601/20/81627215_4541.png!256","portrait_path_1280":"http://ures.kktv8.com/kktv/portrait/20160601/20/81627215_4541.png!1280","poster_path_original":"http://ures.kktv8.com/kktv/poster/20160601/17/81627215_485.JPG","poster_path_1280":"http://ures.kktv8.com/kktv/poster/20160601/17/81627215_485.JPG!1280","poster_path_290":"http://ures.kktv8.com/kktv/poster/20160601/17/81627215_485.JPG!290x164","poster_path_272":"http://ures.kktv8.com/kktv/poster/20160601/17/81627215_485.JPG!272","poster_path_128":"http://ures.kktv8.com/kktv/poster/20160601/17/81627215_485.JPG!128x96","poster_path_300":"http://ures.kktv8.com/kktv/poster/20160601/17/81627215_485.JPG!300","roomSource":1,"roomType":1,"screenType":1},{"userId":104330655,"giftName":"萌货","giftCount":338466,"giftId":40000095,"giftWorth":33846600,"nickName":"神龙大軍老板娘、语寒","giftPic":"http://rescdn.kktv8.com/kktv/icon/web/gift/png/40000095.png","liveType":1,"livestarttime":1474526686651,"liveStream":"http://pull.kktv8.com/livekktv/104330655.flv","onlineCount":8477,"actorLevel":33,"portrait_path_original":"http://ures.kktv8.com/kktv/portrait/20160918/3/104330655_1625184.jpg","portrait_path_48":"http://ures.kktv8.com/kktv/portrait/20160918/3/104330655_1625184.jpg!48","portrait_path_128":"http://ures.kktv8.com/kktv/portrait/20160918/3/104330655_1625184.jpg!128","portrait_path_256":"http://ures.kktv8.com/kktv/portrait/20160918/3/104330655_1625184.jpg!256","portrait_path_1280":"http://ures.kktv8.com/kktv/portrait/20160918/3/104330655_1625184.jpg!1280","poster_path_original":"http://ures.kktv8.com/kktv/picture/2016/08/03/17/104330655_4230.jpg","poster_path_1280":"http://ures.kktv8.com/kktv/picture/2016/08/03/17/104330655_4230.jpg!1280","poster_path_290":"http://ures.kktv8.com/kktv/picture/2016/08/03/17/104330655_4230.jpg!290x164","poster_path_272":"http://ures.kktv8.com/kktv/picture/2016/08/03/17/104330655_4230.jpg!272","poster_path_128":"http://ures.kktv8.com/kktv/picture/2016/08/03/17/104330655_4230.jpg!128x96","poster_path_300":"http://ures.kktv8.com/kktv/picture/2016/08/03/17/104330655_4230.jpg!300","roomSource":1,"roomType":1,"screenType":1}]
     * position : 2
     * TagCode : 00000000
     */

    private int position;
    private String TagCode;
    /**
     * userId : 80053742
     * giftName : 吃货
     * giftCount : 1462808
     * giftId : 40000092
     * giftWorth : 146280800
     * nickName : 妮可1117🍃
     * giftPic : http://rescdn.kktv8.com/kktv/icon/web/gift/png/40000092.png
     * liveType : 1
     * livestarttime : 1474532451521
     * liveStream : http://pull.kktv8.com/livekktv/80053742.flv
     * onlineCount : 3805
     * actorLevel : 34
     * portrait_path_original : http://ures.kktv8.com/kktv/portrait/20160914/2/80053742_4324440.jpg
     * portrait_path_48 : http://ures.kktv8.com/kktv/portrait/20160914/2/80053742_4324440.jpg!48
     * portrait_path_128 : http://ures.kktv8.com/kktv/portrait/20160914/2/80053742_4324440.jpg!128
     * portrait_path_256 : http://ures.kktv8.com/kktv/portrait/20160914/2/80053742_4324440.jpg!256
     * portrait_path_1280 : http://ures.kktv8.com/kktv/portrait/20160914/2/80053742_4324440.jpg!1280
     * poster_path_original : http://ures.kktv8.com/kktv/picture/2015/11/05/19/80053742_347.jpg
     * poster_path_1280 : http://ures.kktv8.com/kktv/picture/2015/11/05/19/80053742_347.jpg!1280
     * poster_path_290 : http://ures.kktv8.com/kktv/picture/2015/11/05/19/80053742_347.jpg!290x164
     * poster_path_272 : http://ures.kktv8.com/kktv/picture/2015/11/05/19/80053742_347.jpg!272
     * poster_path_128 : http://ures.kktv8.com/kktv/picture/2015/11/05/19/80053742_347.jpg!128x96
     * poster_path_300 : http://ures.kktv8.com/kktv/picture/2015/11/05/19/80053742_347.jpg!300
     * roomSource : 1
     * roomType : 1
     * screenType : 1
     */

    private List<RankListBean> rankList;

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getTagCode() {
        return TagCode;
    }

    public void setTagCode(String TagCode) {
        this.TagCode = TagCode;
    }

    public List<RankListBean> getRankList() {
        return rankList;
    }

    public void setRankList(List<RankListBean> rankList) {
        this.rankList = rankList;
    }

    public static class RankListBean {
        private int userId;
        private String giftName;
        private int giftCount;
        private int giftId;
        private int giftWorth;
        private String nickName;
        private String giftPic;
        private int liveType;
        private long livestarttime;
        private String liveStream;
        private int onlineCount;
        private int actorLevel;
        private String portrait_path_original;
        private String portrait_path_48;
        private String portrait_path_128;
        private String portrait_path_256;
        private String portrait_path_1280;
        private String poster_path_original;
        private String poster_path_1280;
        private String poster_path_290;
        private String poster_path_272;
        private String poster_path_128;
        private String poster_path_300;
        private int roomSource;
        private int roomType;
        private int screenType;

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public String getGiftName() {
            return giftName;
        }

        public void setGiftName(String giftName) {
            this.giftName = giftName;
        }

        public int getGiftCount() {
            return giftCount;
        }

        public void setGiftCount(int giftCount) {
            this.giftCount = giftCount;
        }

        public int getGiftId() {
            return giftId;
        }

        public void setGiftId(int giftId) {
            this.giftId = giftId;
        }

        public int getGiftWorth() {
            return giftWorth;
        }

        public void setGiftWorth(int giftWorth) {
            this.giftWorth = giftWorth;
        }

        public String getNickName() {
            return nickName;
        }

        public void setNickName(String nickName) {
            this.nickName = nickName;
        }

        public String getGiftPic() {
            return giftPic;
        }

        public void setGiftPic(String giftPic) {
            this.giftPic = giftPic;
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

        public int getOnlineCount() {
            return onlineCount;
        }

        public void setOnlineCount(int onlineCount) {
            this.onlineCount = onlineCount;
        }

        public int getActorLevel() {
            return actorLevel;
        }

        public void setActorLevel(int actorLevel) {
            this.actorLevel = actorLevel;
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

        public String getPortrait_path_1280() {
            return portrait_path_1280;
        }

        public void setPortrait_path_1280(String portrait_path_1280) {
            this.portrait_path_1280 = portrait_path_1280;
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

        public String getPoster_path_128() {
            return poster_path_128;
        }

        public void setPoster_path_128(String poster_path_128) {
            this.poster_path_128 = poster_path_128;
        }

        public String getPoster_path_300() {
            return poster_path_300;
        }

        public void setPoster_path_300(String poster_path_300) {
            this.poster_path_300 = poster_path_300;
        }

        public int getRoomSource() {
            return roomSource;
        }

        public void setRoomSource(int roomSource) {
            this.roomSource = roomSource;
        }

        public int getRoomType() {
            return roomType;
        }

        public void setRoomType(int roomType) {
            this.roomType = roomType;
        }

        public int getScreenType() {
            return screenType;
        }

        public void setScreenType(int screenType) {
            this.screenType = screenType;
        }
    }
}
