//package com.techelevator;
//
//import com.techelevator.view.Menu;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.DisplayName;
//
//
//import java.io.ByteArrayInputStream;
//import java.io.FileNotFoundException;
//import java.io.InputStream;
//
//import static org.graalvm.compiler.hotspot.debug.BenchmarkCounters.delta;
//
//public class VendingMachineMenusTest extends VendingMachineMenus {
//    VendingMachineMenus vendingMachineMenus;
//
//
//    public VendingMachineMenusTest(Menu menu) throws FileNotFoundException {
//        super(menu);
//    }
//
//
//    @BeforeEach
//    void setUp() throws FileNotFoundException {
//        vendingMachineMenus = new VendingMachineMenus();
//
//    }
//    @Before
//    vendingMachineMenus.run("Purchase");
//    @Test
//    @DisplayName("Feed Money accepts user cash $1/$5/$10")
//    void testFeedMoney() {
//        ByteArrayInputStream feedMoney = new ByteArrayInputStream(vendingMachineMenus.ONE_DOLLAR).getBytes());
//        System.setIn(feedMoney);
//        VendingMachineMenus.feedMoney();
//        Assert.assertEquals(feedMoney, VendingMachineMenus.feedMoney(), delta:0);
//    }
//
//    @org.junit.jupiter.api.Test
//    void testRun() {
//    }
//
//    @org.junit.jupiter.api.Test
//    void testFeedMoney1() {
//    }
//
//    @org.junit.jupiter.api.Test
//    void testDisplayPurchaseMenu() {
//    }
//


//

/*
ByteArrayInputStream variableName = new ByteArrayInputStream("The Input you are testing".getBytes();
[7:58 PM]
System.setIn(variableName);
[7:58 PM]
theClassYourTesting.theMethodYourTesting();
[8:00 PM]
Assert.assertEquals("The Input you are testing", theClassYouAreTesting.theMethodYouAreTesting());    <-- if its a number  put a comma after (), delta:0
 */











