package state;

import core.Item;
import core.MessageType;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LocationState {
    private final Set<Player> players = new HashSet<>();
    private final Set<Foe> foes = new HashSet<>();
    private final Set<Item> items = new HashSet<>();

    public String getDescription() {
        return describePlayers() + describeFoes() + describeItems();
    }

    private String describeItems() {
        if (items.size() >= 1) {
            return String.format("In the room lies %s. ",
                    String.join(", ", items.stream().map(Item::name).collect(Collectors.toList())));
        } else return "";
    }

    private String describePlayers() {
        if (players.size() >= 1) {
            return String.format("In the room, you see %s. ",
                    String.join(", ", players.stream().map(Player::name).collect(Collectors.toList())));
        } else return "";
    }

    private String describeFoes() {
        if (foes.size() == 1) {
            return String.format("Staring menacingly at you is %s. ",
                    String.join("", foes.stream().map(Foe::name).collect(Collectors.toList())));
        } else if (foes.size() > 1) {
            return String.format("Staring menacingly at you are %s. ",
                    String.join(", ", foes.stream().map(Foe::name).collect(Collectors.toList())));
        } else return "";
    }

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

    public Optional<Player> getPlayerWithName(String name) {
        for (Player player : players) {
            if (player.name().equalsIgnoreCase(name)) {
                return Optional.ofNullable(player);
            }
        }
        return Optional.ofNullable(null);
    }

    public Optional<Foe> getFoeWithName(String name) {
        for (Foe foe : foes) {
            if (foe.name().equalsIgnoreCase(name)) {
                return Optional.ofNullable(foe);
            }
        }
        return Optional.ofNullable(null);
    }

    public Optional<Item> getItemWithName(String name) {
        for (Item item : items) {
            if (item.name().equalsIgnoreCase(name)) {
                return Optional.ofNullable(item);
            }
        }
        return Optional.ofNullable(null);
    }
}
