package com.example.android.newsapp;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * An {@link NewsAdapter} knows how to create a list item layout for each news
 * in the data source (a list of {@link News} objects).
 *
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */
public class NewsAdapter extends ArrayAdapter<News> {

    /**
     * Constructs a new {@link NewsAdapter}.
     *
     * @param context of the app
     * @param news is the list of news, which is the data source of the adapter
     */
    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    /**
     * Returns a list item view that displays information about the news at the given position
     * in the list of news.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }

        // Find the news at the given position in the list of news
        News currentNews = getItem(position);

        // Find the TextView with view ID title
        TextView titleView = (TextView) listItemView.findViewById(R.id.title);
        // get the title from the news object
        String newsTitle = currentNews.getTitle();
        // Display the title of the current news in that TextView
        titleView.setText(newsTitle);
        // Get the section string from the news object,
        String newsSection = currentNews.getSection();

        // Find the TextView with view ID section
        TextView sectionView = (TextView) listItemView.findViewById(R.id.section);
        // Display the section of the current news in that TextView
        sectionView.setText(newsSection);
        // Get date from the current item
        String dateObject = currentNews.getDate();
        // Find the TextView with view ID date
        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        // Display the date of the current news in that TextView
        dateView.setText(dateObject);

        // Get contributors from the current item
        String contributors = currentNews.getContributors();
        // Find the TextView with view ID contributors
        TextView contributorsView = (TextView) listItemView.findViewById(R.id.contributors);
        // Display the contributors of the current news in that TextView
        contributorsView.setText(contributors);

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }
}

