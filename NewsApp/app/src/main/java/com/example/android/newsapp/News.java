package com.example.android.newsapp;


import java.util.List;

public class News {

    /** Url of the news */
    String Url;

    /** section of the news */
    String section;

    /** title of the news */
    String title;

    /** date of the news */
    String date;

    /** contributors of the news */
    String contributorsList;
    /**
     * Constructs a new {@link News} object.
     *
     * @param section the section of the news
     * @param title is the title of the news
     * @param date is the time of publishing the news
     * @param url is the website URL to find more details about the news
     */
    public News(String url,String section,String title,String date,String contributorsList){
        this.Url = url;
        this.section = section;
        this.title = title;
        this.date = date;
        this.contributorsList = contributorsList;
    }
    public String getUrl(){
        return Url;
    }
    public String getSection(){
        return section;
    }
    public String getTitle(){
        return title;
    }
    public String getDate(){
        return date;
    }
    public String getContributors(){
        return contributorsList;
    }

}
