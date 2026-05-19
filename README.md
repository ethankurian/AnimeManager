# Anime Manager

A Java program that:
- Reads a list of anime while ignoring header and footer lines
- Converts input to lowercase and trims extra spaces
- Removes duplicates while printing which entries are deleted
- Displays the list and counts before and after processing

## Anime Class
- Represents an Anime object containing a name
- `getName()` returns a cleaned version of the name (removes trailing status symbols if present and handles short strings safely)
- `toString()` returns the formatted anime name for output

## Future Goals
- Add a menu system
- Automatically update the text file after changes

Built using Java (AP Computer Science A level concepts)
