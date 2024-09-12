public class UniqueFile implements  GenericFile{
    private String fileName;

    public UniqueFile(String fN){
        fileName = fN;
    }

    @Override
    public void details() {
        System.out.println("File: " + fileName);
    }

}