package vshp.Shaitanov.Block_7;

public static void deleteDir(String dirPath){

    File walkDir = new File(dirPath); //Удаляемая папка

    String[] dirList = walkDir.list(); // список элементов в папке

        for (int i =0; i < dirList.length; i++) {

            File f - new File(dirList[i]);
            if (f.getDirectory()) {
                //если текущий элемент - папка
                deleteDir(f.getPath());
            }
            //Текущий элемент - файл или уже пустая папка
            f.delete();
        }
        walkDir.delete();
    }


