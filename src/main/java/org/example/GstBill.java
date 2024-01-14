package org.example;

public class GstBill {
    final int gst=18;
    void bill()
    {
        int pay=400;
        pay+=gst;
        System.out.println(pay);
    }
    void bill(int x)
    {
        x+=gst;
        System.out.println(x);
    }

    public static void main(String[] args) {
        GstBill gst=new GstBill();
        gst.bill(32);
    }
}
