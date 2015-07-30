package model;

import enumation.Level;

import static org.junit.Assert.*;

/**
 * Created by janiu on 2015-07-22.
 */
public class SelectLevelTest {

    @org.junit.Test
    public void testSelectLevel() throws Exception {
            SelectLevel s = new SelectLevel();
            assertEquals(s.selectLevel("POORLY"), Level.POORLY);
            assertEquals(s.selectLevel("MIDDING"), Level.MIDDING);
            assertEquals(s.selectLevel("WELL"), Level.WELL);
            assertEquals(s.selectLevel("POORLY"), Level.POORLY);
    }
}