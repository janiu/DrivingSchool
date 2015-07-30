package model;

import enumation.Level;

/**
 * Created by janiu on 2015-07-22.
 */
public class SelectLevel {

    public enumation.Level selectLevel(String level)    {

        enumation.Level selectLevel= enumation.Level.POORLY;
        if(level=="POORLY"){
            selectLevel= enumation.Level.POORLY;
        }
        else if(level=="MIDDING"){
            selectLevel= enumation.Level.MIDDING;
        }
       else if(level=="WELL"){
            selectLevel= enumation.Level.WELL;
        }
        else if(level=="GREAT"){
            selectLevel= enumation.Level.GREAT;
        }
        return selectLevel;

    }
}
