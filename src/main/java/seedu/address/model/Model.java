package seedu.address.model;

import java.util.HashSet;
import java.util.List;
import java.util.function.Predicate;

import javafx.collections.ObservableList;
<<<<<<< HEAD
import seedu.address.model.module.Code;
import seedu.address.model.module.Location;
import seedu.address.model.module.ReadOnlyLesson;
import seedu.address.model.module.exceptions.DuplicateLessonException;
import seedu.address.model.module.exceptions.LessonNotFoundException;
import seedu.address.model.module.predicates.FavouriteListPredicate;
=======
import seedu.address.model.person.Address;
import seedu.address.model.person.Email;
import seedu.address.model.person.Phone;
import seedu.address.model.person.ReadOnlyPerson;
import seedu.address.model.person.exceptions.DuplicatePersonException;
import seedu.address.model.person.exceptions.PersonNotFoundException;
import seedu.address.model.person.predicates.FavourListPredicate;
>>>>>>> master


/**
 * The API of the Model component.
 */
public interface Model {
    /** {@code Predicate} that always evaluate to true */
    Predicate<ReadOnlyLesson> PREDICATE_SHOW_ALL_LESSONS = unused -> true;

    /** Get a hash set of all the distinct locations */
    HashSet<Location> getUniqueLocationSet();

    /** Get a hash set of all the distinct module codes */
    HashSet<Code> getUniqueCodeSet();

    /** Get a predicate for filtering favourList */
    FavouriteListPredicate getFavouriteListPredicate();

    /** Get a predicate for filtering favourList */
    FavourListPredicate getFavourListPredicate();

    /** Clears existing backing model and replaces with the provided new data. */
    void resetData(ReadOnlyAddressBook newData);

    /** Returns the AddressBook */
    ReadOnlyAddressBook getAddressBook();

    /** Deletes the given lesson. */
    void deleteLesson(ReadOnlyLesson target) throws LessonNotFoundException;

<<<<<<< HEAD
    /** Deletes the given list of lessons. */
    void deleteLessonSet(List<ReadOnlyLesson> lessonList) throws LessonNotFoundException;
=======
    /** Collects the given person. */
    void collectPerson(ReadOnlyPerson target) throws DuplicatePersonException;

    /** Deletes the given list of person. */
    void deletePersonSet(List<ReadOnlyPerson> personList) throws PersonNotFoundException;
>>>>>>> master

    /** Adds the given lesson */
    void addLesson(ReadOnlyLesson lesson) throws DuplicateLessonException;

    /** Bookmarks the given lesson into favourite list */
    void bookmarkLesson(ReadOnlyLesson lesson) throws DuplicateLessonException;

    /**
     * Replaces the given lesson {@code target} with {@code editedLesson}.
     *
     * @throws DuplicateLessonException if updating the lesson's details causes the lesson to be equivalent to
     *      another existing lesson in the list.
     * @throws LessonNotFoundException if {@code target} could not be found in the list.
     */
    void updateLesson(ReadOnlyLesson target, ReadOnlyLesson editedLesson)
            throws DuplicateLessonException, LessonNotFoundException;

    /** Returns an unmodifiable view of the filtered lesson list */
    ObservableList<ReadOnlyLesson> getFilteredLessonList();

    /**
     * Updates the filter of the filtered lesson list to filter by the given {@code predicate}.
     * @throws NullPointerException if {@code predicate} is null.
     */
    void updateFilteredLessonList(Predicate<ReadOnlyLesson> predicate);

    /**
     * handle different ListingUnit after redo and undo
     */
    void handleListingUnit();




}
