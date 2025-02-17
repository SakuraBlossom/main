package seedu.address.logic.commands.utils;

import static java.util.Objects.requireNonNull;

import java.util.ArrayList;

import seedu.address.model.ReadOnlyAddressBook;
import seedu.address.model.events.Event;
import seedu.address.model.person.AddressBook;

/**
 * A Model stub that always accept the person being added.
 */
public class ModelAcceptingEventAddedStub extends ModelStub {
    public final ArrayList<Event> eventsAdded = new ArrayList<>();

    @Override
    public boolean hasAppointment(Event event) {
        requireNonNull(event);
        return eventsAdded.stream().anyMatch(event::isSameAs);
    }

    @Override
    public void scheduleAppointment(Event event) {
        requireNonNull(event);
        eventsAdded.add(event);
    }

    @Override
    public ReadOnlyAddressBook getPatientAddressBook() {
        return new AddressBook();
    }
}
