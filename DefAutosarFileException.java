

import java.io.File;

public class DefAutosarFileException extends Exception {

  /**
   * Constructor for DefAutosarFileException
   * @param file The file that is defected
   */
  public DefAutosarFileException(File file) {
    // Call the superclass constructor with a custom error message
    super(
      "Defected autosar file: " +
      file.getAbsolutePath() +
      "\nFile isn't readable."
    );
  }
}
