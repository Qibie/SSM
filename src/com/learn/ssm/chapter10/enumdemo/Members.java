package com.learn.ssm.chapter10.enumdemo;

public enum Members {
    JERRY, BOBBY, PHIL;
    public Members selectedBandMember;

    public static void main(String[] args) {
        Members s = Members.BOBBY;
        if (s.equals(Members.JERRY)) {
            System.out.println("Jerrrry!");
        }
        if (s == Members.BOBBY) {
            System.out.println("Rat Dog");
        }

        Members ifName = Members.PHIL;
        switch (ifName) {
            case JERRY:
                System.out.println("make it sing");
            case PHIL:
                System.out.println("go deep");
            case BOBBY:
                System.out.println("Cassidy");
        }
    }
}