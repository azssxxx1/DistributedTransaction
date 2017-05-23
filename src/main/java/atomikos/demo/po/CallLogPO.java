package atomikos.demo.po;

/**
 * @author InJavaWeTrust
 * @version 1.0.0.0  
 */
public class CallLogPO {
	
    /**
     * 测试
     */
    private String callLogId;
    
    /**
     * 测试
     */
    private String callLogName;
    
    /**
     * 测试
     */
    private java.util.Date callSTime;
    
    /**
     * 测试
     */
    private java.util.Date callETime;
    
    /**
     * 测试
     */
    private String callResult;
    
    /**
     * 测试
     */
    private String callNbr;

    public String getCallLogId() {
        return callLogId;
    }

    public void setCallLogId(String callLogId) {
        this.callLogId = callLogId;
    }

    public String getCallLogName() {
        return callLogName;
    }

    public void setCallLogName(String callLogName) {
        this.callLogName = callLogName;
    }

    public java.util.Date getCallSTime() {
        return callSTime;
    }

    public void setCallSTime(java.util.Date callSTime) {
        this.callSTime = callSTime;
    }

    public java.util.Date getCallETime() {
        return callETime;
    }

    public void setCallETime(java.util.Date callETime) {
        this.callETime = callETime;
    }

    public String getCallResult() {
        return callResult;
    }

    public void setCallResult(String callResult) {
        this.callResult = callResult;
    }

    public String getCallNbr() {
        return callNbr;
    }

    public void setCallNbr(String callNbr) {
        this.callNbr = callNbr;
    }
    
}
