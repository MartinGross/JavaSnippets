package de.datazoo.spring;

public class ExampleObject {

    private long timeout;
    private String policy;

    private AnotherExampleObject anotherBean;

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public long getTimeout() {
        return timeout;
    }

    public void setTimeout(long timeout) {
        this.timeout = timeout;
    }

    public AnotherExampleObject getAnotherBean() {
        return anotherBean;
    }

    public void setAnotherBean(AnotherExampleObject anotherBean) {
        this.anotherBean = anotherBean;
    }
}
