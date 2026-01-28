package com.java17;

sealed class Device permits Mobile,Tab{

}
// subclass of a sealed class should be either final or non-sealed
non-sealed class Mobile extends Device{

}
// subclass of a sealed class should be either final or non-sealed
final class Tab extends Device{

}

sealed interface  Vehicle permits FourWheeler, TwoWheeler{

}

non-sealed class FourWheeler implements Vehicle{

}

non-sealed class TwoWheeler implements Vehicle{

}


public class MainAppJava17SealedClass {
    public static void main(String[] args) {

    }
}
