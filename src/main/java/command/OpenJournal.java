package command;

import classes.Journal;
import classes.Larry;

/**
 * allows the player to look at their progress
 * @author mari
 */
public class OpenJournal extends Command {

    Journal journal;
    Larry larry;

    public OpenJournal(Journal journal, Larry larry) {
        this.journal = journal;
        this.larry = larry;
    }

    /**
     * lists all fish collected and left to collect
     */
    @Override
    public String execute() {
        System.out.println("\nhere is the list of all the fishies you need to get\nI highlighted the ones you already have in green\n");
        return journal.fishJournal(larry);
    }

    @Override
    public boolean exit() {
        return false;
    }
}
