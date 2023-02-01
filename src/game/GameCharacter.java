package game;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Range;

class GameCharacter {

    @NotNull
    private String login;

    @Range(from = 1,  to=100)
    private int level = 1;

    public GameCharacter(
            @NotNull String login,
            @Range(from = 1,  to = 100) int level) {
        this.login = login;
        this.level = level;
    }

    @NotNull
    public String getLogin() {
        return login;
    }

    @Range(from = 1, to = 100)
    public int getLevel() {
        return level;
    }

}
