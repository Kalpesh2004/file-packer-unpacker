package com.packerunpacker.gui;

import com.packerunpacker.service.PackerService;
import com.packerunpacker.service.UnpackerService;

import javax.swing.*;
import java.awt.*;

public class PackerUnpackerUI extends JFrame {

    private JButton packButton;
    private JButton unpackButton;
    private JTextArea logArea;

    public PackerUnpackerUI(){

        setTitle("File Packer & Unpacker");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        packButton = new JButton("Pack Files");
        unpackButton = new JButton("Unpack Files");

        JPanel topPanel = new JPanel();

        topPanel.add(packButton);
        topPanel.add(unpackButton);

        logArea = new JTextArea();
        logArea.setEditable(false);

        add(topPanel, BorderLayout.NORTH);
        add(new JScrollPane(logArea), BorderLayout.CENTER);

        packButton.addActionListener(e ->packFiles());

        unpackButton.addActionListener(e -> unpackFiles());

        setVisible(true);
    }


    private void packFiles() {
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);


        if(chooser.showOpenDialog(this)==JFileChooser.APPROVE_OPTION){
            String path = chooser.getSelectedFile().getAbsolutePath();

            new PackerService().pack(path);

            logArea.append("Files packed successfully from: "+path+"\n");
        }
    }

    private void unpackFiles() {
        JFileChooser chooser = new JFileChooser();

        if(chooser.showOpenDialog(this)==JFileChooser.APPROVE_OPTION){
            String path = chooser.getSelectedFile().getPath();
            new UnpackerService().unpack(path);
            logArea.append("Files unpacked successfully from: "+path+"\n");
        }
    }


}
