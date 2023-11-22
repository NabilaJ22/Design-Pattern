
import java.util.ArrayList;
import java.util.List;

interface FileSystemComponent {
    public void displayDetails();
}

class File implements FileSystemComponent {

    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void displayDetails() {
        System.out.println("File : " + name);
    }
}

class Directory implements FileSystemComponent {

    private String name;
    private List<FileSystemComponent> children;

    public Directory(String name) {
        this.name = name;
        children = new ArrayList<>();
    }

    public void addComponent(FileSystemComponent component) {
        children.add(component);
    }

    public void removeComponent(FileSystemComponent component) {
        children.remove(component);
    }

    @Override
    public void displayDetails() {
        System.out.println("Directory: " + name);
        System.out.println("Contents:");
        for (FileSystemComponent component : children) {
            component.displayDetails();
        }
    }

}

public class CompositePatternDemo {
    public static void main(String[] args) {
        File file1 = new File("Document.txt");
        File file2 = new File("Image.jpg");
        File file3 = new File("Spreadsheet.xlsx");

        Directory directory1 = new Directory("Documents");
        directory1.addComponent(file1);
        directory1.addComponent(file3);

        Directory directory2 = new Directory("Pictures");
        directory2.addComponent(file2);

        Directory rootDirectory = new Directory("Root");
        rootDirectory.addComponent(directory1);
        rootDirectory.addComponent(directory2);

        rootDirectory.displayDetails();
    }
}