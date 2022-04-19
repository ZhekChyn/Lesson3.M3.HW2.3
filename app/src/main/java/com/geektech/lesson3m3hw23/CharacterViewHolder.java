package com.geektech.lesson3m3hw23;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CharacterViewHolder extends RecyclerView.ViewHolder {
    private TextView characters;
    public CharacterViewHolder(@NonNull View itemView) {
        super(itemView);
        characters = itemView.findViewById(R.id.characters);
    }

    public void bind(String charactersValue){
        characters.setText(charactersValue);
    }
}
