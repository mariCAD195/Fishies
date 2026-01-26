package classes.command;

import classes.Journal;

public class OpenJournal extends Command {

    Journal journal;

    public OpenJournal(Journal journal) {
        this.journal = journal;
    }

    @Override
    public String execute() {
        System.out.println("\nhere is the list of all the fishies you need to get, i highlighted the ones you already have in red\n");
        return journal.fishJournal();
    }

    @Override
    public boolean exit() {
        return false;
    }
}
