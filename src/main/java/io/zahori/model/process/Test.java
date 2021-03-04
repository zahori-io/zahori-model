package io.zahori.model.process;

import java.util.ArrayList;
import java.util.List;

public class Test {

    private String testName;
    private String testStatus;
    private String executionDate;
    private String platform;
    private String browserName;
    private String browserVersion;
    private String bits;
    private Integer durationSeconds = 0;
    private String executionNotes;
    private List<Step> steps = new ArrayList<>();

    public Test() {
        super();
    }

    @Override
    public String toString() {
        return "Test [testName=" + testName + ", testStatus=" + testStatus + ", executionDate=" + executionDate + ", platform=" + platform + ", browserName="
                + browserName + ", browserVersion=" + browserVersion + ", bits=" + bits + ", durationSeconds=" + durationSeconds + ", executionNotes="
                + executionNotes + ", steps=" + steps + "]";
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getTestStatus() {
        return testStatus;
    }

    public void setTestStatus(String testStatus) {
        this.testStatus = testStatus;
    }

    public String getExecutionDate() {
        return executionDate;
    }

    public void setExecutionDate(String executionDate) {
        this.executionDate = executionDate;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getBrowserName() {
        return browserName;
    }

    public void setBrowserName(String browserName) {
        this.browserName = browserName;
    }

    public String getBrowserVersion() {
        return browserVersion;
    }

    public void setBrowserVersion(String browserVersion) {
        this.browserVersion = browserVersion;
    }

    public String getBits() {
        return bits;
    }

    public void setBits(String bits) {
        this.bits = bits;
    }

    public Integer getDurationSeconds() {
        return durationSeconds;
    }

    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    public String getExecutionNotes() {
        return executionNotes;
    }

    public void setExecutionNotes(String executionNotes) {
        this.executionNotes = executionNotes;
    }

    public List<Step> getSteps() {
        return steps;
    }

    public void setSteps(List<Step> steps) {
        this.steps = steps;
    }

}
