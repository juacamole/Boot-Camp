package org.example.PlayerCharacterTest;

import org.example.PlayerCharacter.PlayerCharacter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerCharacterTest
{
     @Test
    void consoleInput_If_A_put_minus1(){

         //Given
         char sig = 'A';
         //When
          int actual = PlayerCharacter.getX(sig);
          //Then
         assertEquals(-1, actual);
     }
    @Test
    void consoleInput_If_D_put_1() {

        //Given
        char sig = 'D';
        //When
        int actual = PlayerCharacter.getX(sig);
        //Then
        assertEquals(1, actual);
    }
    @Test
    void consoleInput_If_W_put_1() {

         //Given
        char sig = 'W';
        //When
        int actual = PlayerCharacter.getY(sig);
        //Then
        assertEquals(2, actual);
    }
    @Test
    void consoleInput_If_S_put_minus1() {

        //Given
        char sig = 'S';
        //When
        int actual = PlayerCharacter.getY(sig);
        //Then
        assertEquals(-2, actual);
    }
}
