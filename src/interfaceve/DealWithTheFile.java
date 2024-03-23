package interfaceve;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface DealWithTheFile {
    public void openMyFile() throws IOException;
    public void closeMyFile() throws IOException;
    public void saveMyFile() throws IOException;
    public void saveMyFileAs() throws IOException;
    public void getLinesTable() throws IOException;
}
