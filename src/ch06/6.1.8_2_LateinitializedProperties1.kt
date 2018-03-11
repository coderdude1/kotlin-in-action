package ch06.ex1_8_2_LateinitializedProperties1

import org.junit.Before
import org.junit.Test
import org.junit.Assert

class MyService {
    fun performAction(): String = "foo"
}

class MyTest {
    //common usecase of lateinit is when using DI, and it gets set externally after construction
    private lateinit var myService: MyService //note non-null declaration with lateinit

    @Before fun setUp() {
        myService = MyService() //now init it
    }

    @Test fun testAction() {
        Assert.assertEquals("foo",
            myService.performAction()) //note no !!
    }
}
