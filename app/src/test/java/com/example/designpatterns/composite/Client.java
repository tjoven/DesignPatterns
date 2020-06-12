package com.example.designpatterns.composite;

/**
 * 组合模式
 * 树形结构
 */
public class Client {
    public static void main(String[] args) {
        Folder folder = new Folder("root文件夹");
        File text = new FileText();
        File video = new FileVideo();


        Folder folderSub = new Folder("子文件夹");
        File image = new FileImage();
        folderSub.addFile(image);

        folder.addFile(text);
        folder.addFile(video);
        folder.addFile(folderSub);

        folder.operate();

    }
}
