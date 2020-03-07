package com.mall.meongnyang.client.member.vo;

public class GoogleCustomerVO
{
    private String id;
    private String email;
    private boolean verified_email;
    private String name;
    private String given_name;
    private String picture;
    private String locale;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public boolean isVerified_email()
    {
        return verified_email;
    }

    public void setVerified_email(boolean verified_email)
    {
        this.verified_email = verified_email;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getGiven_name()
    {
        return given_name;
    }

    public void setGiven_name(String given_name)
    {
        this.given_name = given_name;
    }

    public String getPicture()
    {
        return picture;
    }

    public void setPicture(String picture)
    {
        this.picture = picture;
    }

    public String getLocale()
    {
        return locale;
    }

    public void setLocale(String locale)
    {
        this.locale = locale;
    }

    @Override
    public String toString()
    {
        return "GoogleCustomerVO{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", verified_email=" + verified_email +
                ", name='" + name + '\'' +
                ", given_name='" + given_name + '\'' +
                ", picture='" + picture + '\'' +
                ", locale='" + locale + '\'' +
                '}';
    }
}
