import java.util.ArrayList;
import java.util.List;

public class Folder implements  GenericFile{
    private String folderName;
    private List<GenericFile> listFolder = new ArrayList<>();

    public Folder(String fN){
        folderName = fN;
    }

    public void addFile(GenericFile file){
        listFolder.add(file);
    }

    public void deleteFile(GenericFile file){
        listFolder.remove(file);
    }

    @Override
    public void details() {
        System.out.println("La cartella " + folderName + " contiene: ");

        if (listFolder.isEmpty()){
            System.out.println("0 file");
        }else {
            for (GenericFile f : listFolder ){

                f.details();
            }
        }
    }
}