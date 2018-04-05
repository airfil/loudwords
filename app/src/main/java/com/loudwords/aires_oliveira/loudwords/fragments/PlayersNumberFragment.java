package com.loudwords.aires_oliveira.loudwords.fragments;

import android.app.LoaderManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.loudwords.aires_oliveira.loudwords.R;

import org.w3c.dom.Text;

public class PlayersNumberFragment extends Fragment {

    private View rootView;
    private int playersNumber;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_players_number, container, false);

        init();

        return rootView;
    }

    private void init() {

        buttons();
        playersNumber();
    }

    private void playersNumber() {
        TextView tvPlayersNumber = (TextView) rootView.findViewById(R.id.players_number);
        tvPlayersNumber.setText(playersNumber+"");
    }

    private void buttons() {
        Button beginButton = (Button) rootView.findViewById(R.id.begin_game_button);
        Button plusPlayer = (Button) rootView.findViewById(R.id.plus_player);
        Button minusPlayer = (Button) rootView.findViewById(R.id.minus_player);

        incrementPlayer(plusPlayer);
        decrementPlayer(minusPlayer);
    }

    private void decrementPlayer(Button minusPlayer) {
        minusPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playersNumber--;
                playersNumber();
            }
        });
    }

    private void incrementPlayer(Button plusPlayer) {
        plusPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playersNumber++;
                playersNumber();
            }
        });

    }

}
