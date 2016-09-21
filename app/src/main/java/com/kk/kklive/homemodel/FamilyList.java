package com.kk.kklive.homemodel;

import java.util.List;

/**
 * Created by Administrator on 2016/9/21.
 */
public class FamilyList {

    private int familyId;


    private String familyName;

    private String familyLeader;

    private String actorCount;

    private String memberCount;

    private List<String> familyPoster;


    public int getFamilyId() {
        return familyId;
    }

    public void setFamilyId(int familyId) {
        this.familyId = familyId;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getFamilyLeader() {
        return familyLeader;
    }

    public void setFamilyLeader(String familyLeader) {
        this.familyLeader = familyLeader;
    }

    public String getActorCount() {
        return actorCount;
    }

    public void setActorCount(String actorCount) {
        this.actorCount = actorCount;
    }

    public String getMemberCount() {
        return memberCount;
    }

    public void setMemberCount(String memberCount) {
        this.memberCount = memberCount;
    }

    public List<String> getFamilyPoster() {
        return familyPoster;
    }

    public void setFamilyPoster(List<String> familyPoster) {
        this.familyPoster = familyPoster;
    }
}
