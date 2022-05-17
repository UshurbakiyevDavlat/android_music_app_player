package com.example.musicplayer.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.musicplayer.R;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.List;


public class SearchAdapter2 extends SelectableAdapter<RecyclerView.ViewHolder> {

    private static final int TYPE_SONG = 1;
    private static final int TYPE_ALBUM = 2;
    private static final int TYPE_ARTIST = 3;
    private static final int TYPE_HEADER = 4;
    private final List<JSONObject> songs;

    private final SearchSongClicked activitySong;

    public SearchAdapter2(Context context, List<JSONObject> songs, String query) throws IOException, JSONException {
        System.out.println("Start");
        System.out.println("Songs list -> " + songs.get(0));
        this.activitySong = (SearchSongClicked) context;
        this.songs = songs;
    }

    public static class HeaderViewHolder extends RecyclerView.ViewHolder {

        private final TextView headerText;

        public HeaderViewHolder(@NonNull View itemView) {
            super(itemView);

            headerText = itemView.findViewById(R.id.search_header);
        }
    }

    public class SongViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {

        private final TextView tv_song_name, tv_artist_name;
        private final ImageView iv_album_art, iv_popup_menu;

        SongViewHolder(@NonNull View itemView) {
            super(itemView);


            tv_song_name = itemView.findViewById(R.id.tv_song_name);
            tv_artist_name = itemView.findViewById(R.id.tv_artist_name);
            iv_album_art = itemView.findViewById(R.id.iv_album_art);
            iv_popup_menu = itemView.findViewById(R.id.iv_popup_menu);

            itemView.setOnClickListener(this);
            itemView.setOnLongClickListener(this);

        }


        @Override
        public void onClick(View v) {
        }

        @Override
        public boolean onLongClick(View v) {
            return true;
        }
    }

    public class AlbumViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {

        private final TextView albums_album_title;
        private final ImageView albums_album_art, albums_popup_menu;

        AlbumViewHolder(@NonNull View itemView) {
            super(itemView);

            albums_album_art = itemView.findViewById(R.id.albums_album_art);
            albums_album_title = itemView.findViewById(R.id.albums_album_title);
            albums_popup_menu = itemView.findViewById(R.id.albums_popup_menu);

            itemView.setOnClickListener(this);
            itemView.setOnLongClickListener(this);

        }

        @Override
        public void onClick(View v) {
        }

        @Override
        public boolean onLongClick(View v) {
            return true;
        }
    }

    public class ArtistViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {

        private final TextView artists_artist_name;
        private final ImageView artists_popup_menu;

        ArtistViewHolder(@NonNull View itemView) {
            super(itemView);

            artists_artist_name = itemView.findViewById(R.id.artists_artist_name);
            artists_popup_menu = itemView.findViewById(R.id.artists_popup_menu);

            itemView.setOnClickListener(this);
            itemView.setOnLongClickListener(this);

        }

        @Override
        public void onClick(View v) {
        }

        @Override
        public boolean onLongClick(View v) {
            return true;
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        switch (viewType) {

            case TYPE_SONG:
                View root0 = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_songs, parent, false);
                return new SearchAdapter2.SongViewHolder(root0);

            case TYPE_ALBUM:
                View root1 = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_albums, parent, false);
                return new SearchAdapter2.AlbumViewHolder(root1);

            case TYPE_ARTIST:
                View root2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_artists, parent, false);
                return new SearchAdapter2.ArtistViewHolder(root2);

            case TYPE_HEADER:
                View root3 = LayoutInflater.from(parent.getContext()).inflate(R.layout.search_header_text, parent, false);
                return new SearchAdapter2.HeaderViewHolder(root3);

        }

        return null;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        SearchAdapter2.SongViewHolder holder0 = (SearchAdapter2.SongViewHolder) holder;
        SearchAdapter2.AlbumViewHolder holder1 = (SearchAdapter2.AlbumViewHolder) holder;
        SearchAdapter2.ArtistViewHolder holder2 = (SearchAdapter2.ArtistViewHolder) holder;
        SearchAdapter2.HeaderViewHolder holder3 = (SearchAdapter2.HeaderViewHolder) holder;

        try {
            holder0.tv_song_name.setText((CharSequence) songs.get(1).get("title"));
            holder1.albums_album_title.setText((CharSequence) songs.get(1).getJSONObject("share").get("subject"));
            holder2.artists_artist_name.setText((CharSequence) songs.get(1).get("subtitle"));
            holder3.headerText.setText("Songs");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}

