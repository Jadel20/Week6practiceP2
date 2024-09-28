package com.example.trees.loader;

import com.example.trees.model.TreeEntity;
import com.example.trees.service.TreeService;
import com.example.trees.utils.LogLevel;
import com.example.trees.utils.MyLogger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import static com.example.trees.utils.MyLogger.log;

@Component
//@Slf4j
public class DataLoader implements CommandLineRunner {

    private final TreeService treeService;

    public DataLoader(TreeService treeService) {
        this.treeService = treeService;
    }

    @Override
    public void run(String... args) throws Exception {
        treeService.saveTree(new TreeEntity("Cedar", "Green", false));
        treeService.saveTree(new TreeEntity("Oak", "Green", false));
        treeService.saveTree(new TreeEntity("Birch", "Green", false));
        treeService.deleteTreeById(1);
        List<TreeEntity> treelist = treeService.findAllTree();
        //iterate on top of treelist and print all the items
        for ( int i = 0; i < treelist.size(); i++ ) {
            System.out.println( "Trees" + treelist.get(i));
        }
        var treeById = treeService.findTreeById(42);
        if (treeById.isPresent()) {
            System.out.println("Found tree with id :" + treeById.get());
        } else {
            System.out.println("Tree not found");
        }

    }

}
