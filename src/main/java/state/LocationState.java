package state;

import core.Item;
import core.MessageType;
import java.util.HashSet;
import java.util.Set;

public class LocationState {
    private Set<Player> players;
    private Set<Foe> foes;
    private Set<Item> items;

    public LocationState() {
        Set<Player> players = new HashSet<>();
        Set<Foe> foes = new HashSet<>();
        Set<Item> items = new HashSet<>();
    }

    public void add(Player player) {
        players.add(player);
        for (Player p : players) {
            p.notify(player + " has entered the room.",
                MessageType.Notification);
        }
    }

    public void add(Foe foe) {
        foes.add(foe);
        for (Player p : players) {
            p.notify("A " + foe + " has appeared!", MessageType.Notification);
        }
    }

    public void add(Item item) {
        items.add(item);
        for (Player p : players) {
            p.notify("A " + item + " has appeared!", MessageType.Notification);
        }
    }

    public void remove(Player player) {
        players.remove(player);
    }

    public void remove(Foe foe) {
        foes.remove(foe);
    }

    public void remove(Item item) {
        items.remove(item);
    }

    public boolean contains(Player player) {
        return players.contains(player);
    }

    public boolean contains(Foe foe) {
        return foes.contains(foe);
    }

    public boolean contains(Item item) {
        return items.contains(item);
    }
}
