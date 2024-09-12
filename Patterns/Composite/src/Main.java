public class Main {
    public static void main(String[] args) {
        UniqueFile file1 = new UniqueFile("documenti.txt");
        UniqueFile file2 = new UniqueFile("image.jpeg");
        UniqueFile file3 = new UniqueFile("musica.mp3");

        Folder folder1 = new Folder("Documenti");
        Folder folder2 = new Folder("Media");
        Folder rootFolder = new Folder("File di sistema");

        folder1.addFile(file1);
        folder2.addFile(file2);
        folder2.addFile(file3);

        rootFolder.addFile(folder1);
        rootFolder.addFile(folder2);

        rootFolder.details();

        folder2.details();



    }
}