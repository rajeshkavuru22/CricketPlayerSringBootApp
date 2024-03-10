package com.example.player;

import java.util.ArrayList;

public interface PlayerRepository {
    ArrayList<Player> getPlayers();

    Player getPlayer(int id);

    Player addPlayer(Player player);

    Player updatePlayer(int playerId, Player player);

    void deletePlayer(int playerId);
}