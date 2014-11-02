package state;

import core.Item;
import core.MessageType;
import java.util.HashSet;
import java.util.Set;

public class LocationState {
    private final Set<Player> players = new HashSet<>();
    private final Set<Foe> foes = new HashSet<>();
    private final Set<Item> items = new HashSet<>();

    public void add(Player player) {
        for (Player p : players) {
            p.notify(player + " has entered the room.",
                MessageType.Notification);
        }
        players.add(player);
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
