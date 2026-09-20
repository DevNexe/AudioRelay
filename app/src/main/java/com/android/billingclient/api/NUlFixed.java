package com.android.billingclient.api;

import defpackage.a36;
import defpackage.bv5;
import defpackage.yr5;

/* JADX INFO: loaded from: classes.dex */
public final class NUlFixed {
    public int a;
    public String b;

    public static class QnHx {
        public int a;
        public String b = "";

        public final NUlFixed a() {
            NUlFixed nUl = new NUlFixed();
            nUl.a = this.a;
            nUl.b = this.b;
            return nUl;
        }
    }

    public static QnHx a() {
        return new QnHx();
    }

    public final String toString() {
        int i = this.a;
        int i2 = a36.a;
        bv5 bv5Var = yr5.y;
        Integer numValueOf = Integer.valueOf(i);
        String string = (!bv5Var.containsKey(numValueOf) ? yr5.x : (yr5) bv5Var.get(numValueOf)).toString();
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 32 + String.valueOf(str).length());
        sb.append("Response Code: ");
        sb.append(string);
        sb.append(", Debug Message: ");
        sb.append(str);
        return sb.toString();
    }
}
