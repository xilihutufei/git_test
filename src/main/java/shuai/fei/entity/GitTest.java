package shuai.fei.entity;

import java.util.List;

/**
 * @Auth puhongfei
 * @Date 2021/10/31
 * @Desc TODO
 */
public class GitTest {

    private String gitName;
    private int gitNum;
    private Double getPrise;
    private List<Integer> gits;

    private String change3;

    public GitTest() {
    }

    public GitTest(String gitName, int gitNum, Double getPrise, List<Integer> gits) {
        this.gitName = gitName;
        this.gitNum = gitNum;
        this.getPrise = getPrise;
        this.gits = gits;
    }

    public String getGitName() {
        return gitName;
    }

    public void setGitName(String gitName) {
        this.gitName = gitName;
    }

    public int getGitNum() {
        return gitNum;
    }

    public void setGitNum(int gitNum) {
        this.gitNum = gitNum;
    }

    public Double getGetPrise() {
        return getPrise;
    }

    public void setGetPrise(Double getPrise) {
        this.getPrise = getPrise;
    }

    public List<Integer> getGits() {
        return gits;
    }

    public void setGits(List<Integer> gits) {
        this.gits = gits;
    }
}
