package fr.wcs.rollingstone.game;

import java.util.Random;

public class Labyrinth {

    private String labyrinth;

    public Labyrinth() {
        labyrinth=initLabyrint();
    }

    public Labyrinth(String labyrinth) {
        this.labyrinth = labyrinth;
    }


    public String getLabyrinth() {
        return labyrinth;
    }

    public void setLabyrinth(String labyrinth) {
        this.labyrinth = labyrinth;
    }


    public String initLabyrint(){

        String[] demo ={ "########### ##B #  ##  ##    ##    #   ## #  #   ## ####   ##        ## #  ##  ##A#      ###########",
                "###########   ##   ## #    # ## # # ## ## #####B ## #   #####   # A######   #  ###  #   ############"};

        return demo[(int)Math.random()*demo.length -1];
    }

    public void previewLabyrinth(){
        for (int i=0; i<100; i=10+i){
            System.out.println(labyrinth.substring(i,10+i));
        }
    }
}
