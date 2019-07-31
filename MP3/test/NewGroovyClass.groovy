
import jaco.mp3.player.MP3Player
import spock.lang.*

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GoD
 */
class NewGroovyClass extends Specification {
    MP3Player player

    public "Add file to PlayList"(){
        player = new MP3Player();
        when:
        File file = new File("src\\mp3\\2.mp3");
        player.addToPlayList(file);
        then:
        assert file.length()!=0;
        assert player.getPlayList()!=null;
    }
    public "Player is paused"(){
        player = new MP3Player();
        when:
        File file = new File("src\\mp3\\2.mp3");
        player.addToPlayList(file);
        player.play();
        player.pause();
        then:
        assert player.isPaused()==true
    }

    
    
}

