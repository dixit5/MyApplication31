package com.example.a1893955.myapplication;

public class Products {
    String pimgurl,pproname;

    public Products(String pimgurl, String pproname) {
        this.pimgurl = pimgurl;
        this.pproname = pproname;
    }

    public String getPimgurl() {
        return pimgurl;
    }

    public void setPimgurl(String pimgurl) {
        this.pimgurl = pimgurl;
    }

    public String getPproname() {
        return pproname;
    }

    public void setPproname(String pproname) {
        this.pproname = pproname;
    }
}
