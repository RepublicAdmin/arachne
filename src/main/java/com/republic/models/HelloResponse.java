package com.republic.models;


public class HelloResponse {
    private String status;
    private String name;

    public HelloResponse() {
        this.status = "Wszystko ok!";
        this.name="HelloWorldController";
    }
    //http://localhost:8080/arachne-0.0.1-SNAPSHOT/sample/HelloWorld
//<version>0.0.1-SNAPSHOT</version>
    //<version>1.4.0.RELEASE</version>
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "HelloResponse{" +
                "status='" + status + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}
