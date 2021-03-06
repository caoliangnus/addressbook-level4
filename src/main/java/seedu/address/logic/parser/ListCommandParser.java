package seedu.address.logic.parser;

import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import seedu.address.logic.commands.ListCommand;
import seedu.address.logic.parser.exceptions.ParseException;

//@@author junming403
/**
 * Parses input arguments and creates a new ListCommand object
 */
public class ListCommandParser implements Parser<ListCommand> {

    /**
     * Parses the given {@code String} of arguments in the context of the ListCommand
     * and returns an ListCommand object for execution.
     *
     * @throws ParseException if the user input does not conform the expected format
     */
    public ListCommand parse(String args) throws ParseException {
        String trimmedArgs = args.trim();

        if (isValidAttribute(trimmedArgs)) {
            return new ListCommand(trimmedArgs);
        } else {
            throw new ParseException(
                    String.format(MESSAGE_INVALID_COMMAND_FORMAT, ListCommand.MESSAGE_USAGE));
        }

    }

    private boolean isValidAttribute(String args) {
        return args.equals(ListCommand.LOCATION_KEYWORD) || args.equals(ListCommand.MODULE_KEYWORD)
                || args.equals(ListCommand.MARKED_LIST_KEYWORD);
    }

}
