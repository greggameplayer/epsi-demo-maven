package fr.epsi.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloworldTest {

    @Test
    public void should_say_hello(){
        //test  avec Assertions (junit)
        Assertions.assertEquals( "Hello Nicolas!", Helloworld.sayHello("Nicolas"));

        org.assertj.core.api.Assertions.assertThat(Helloworld.sayHello("Nicolas")).isEqualTo("Hello Nicolas!");
    }
}
