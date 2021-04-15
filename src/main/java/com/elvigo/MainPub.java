package com.elvigo;

import java.io.IOException;

public class MainPub {
    public static void main(String[] args) throws IOException {
        MulticastPublisher mp = new MulticastPublisher();
        mp.multicast("end");
    }
}
