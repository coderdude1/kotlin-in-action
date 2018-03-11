package ch06.ex1_8_1_LateinitializedProperties

import org.junit.Before
import org.junit.Test
import org.junit.Assert

/*
Note non-nullable properties need to be initialized on construction (default value or
mandatory), or it must be nullable
 */
class MyService {
    fun performAction(): String = "foo"
}

class MyTest {
    private var myService: MyService? = null //duh, myService is nullable

    @Before fun setUp() { //junit annotation
        myService = MyService() //init it in setup, allowed since it is nullable
    }

    @Test fun testAction() {
        //if myService is null a kotlin NPE is thrown.  Note this is dirty, there is a cleaner way
        Assert.assertEquals("foo",
            myService!!.performAction())//note !!, call performAction if myService is not null else throw NPE
    }
}
