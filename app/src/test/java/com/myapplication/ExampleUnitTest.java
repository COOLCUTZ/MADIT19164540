package com.myapplication;

import android.content.Context;
import android.widget.EditText;

import androidx.annotation.Nullable;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.manipulation.Ordering;

import static org.junit.Assert.*;


public class ExampleUnitTest {
    private DbHandler dbHandler;
    private Context context;

    @Before
    public void setUp() throws Exception {
        dbHandler = new DbHandler(context);
    }
    @Test
    public void add_isCorrect() {
        ToDo toDo = new ToDo("Hair", "Hair2", (long) 16.8643, 0);
        boolean rs = dbHandler.addToDo(toDo);
        assertSame(true,rs);
    }

    @Test
    public void delete_isCorrect() {
        boolean r1 = dbHandler.deleteToDo(1);
        assertEquals(false,r1);
    }

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
}