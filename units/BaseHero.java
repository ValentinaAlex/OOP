package seminar01.units;

import seminar01.teams.Team;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public abstract class BaseHero implements GameInterface {

    protected String className;

    protected boolean team;

    protected String name;

    protected int hp;

    public int getHp() {
        return hp;
    }

    protected int maxHp;

    protected int armor;
    protected int armorBuff;
    protected int[] damage;

    protected Coords position;

    protected int initiative;

    protected int initiativeBuff;
