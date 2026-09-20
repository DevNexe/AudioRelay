package com.google.protobuf;

import defpackage.lk;
import defpackage.vv0;

/* JADX INFO: loaded from: classes3.dex */
public class WE {
    public lk a;
    public final vv0 b;
    public volatile DzVS c;
    public volatile lk d;

    static {
        vv0.a();
    }

    public WE() {
    }

    public WE(lk lkVar, vv0 vv0Var) {
        if (vv0Var == null) {
            throw new NullPointerException("found null ExtensionRegistry");
        }
        if (lkVar == null) {
            throw new NullPointerException("found null ByteString");
        }
        this.b = vv0Var;
        this.a = lkVar;
    }

    public final DzVS a(DzVS dzVS) {
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    try {
                        if (this.a != null) {
                            this.c = dzVS.p().a(this.a, this.b);
                            this.d = this.a;
                        } else {
                            this.c = dzVS;
                            this.d = lk.x;
                        }
                    } catch (InvalidProtocolBufferException unused) {
                        this.c = dzVS;
                        this.d = lk.x;
                    }
                }
            }
        }
        return this.c;
    }

    public final lk b() {
        if (this.d != null) {
            return this.d;
        }
        lk lkVar = this.a;
        if (lkVar != null) {
            return lkVar;
        }
        synchronized (this) {
            if (this.d != null) {
                return this.d;
            }
            if (this.c == null) {
                this.d = lk.x;
            } else {
                this.d = this.c.i();
            }
            return this.d;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WE)) {
            return false;
        }
        WE we = (WE) obj;
        DzVS dzVS = this.c;
        DzVS dzVS2 = we.c;
        if (dzVS == null && dzVS2 == null) {
            return b().equals(we.b());
        }
        if (dzVS == null || dzVS2 == null) {
            return dzVS != null ? dzVS.equals(we.a(dzVS.a())) : a(dzVS2.a()).equals(dzVS2);
        }
        return dzVS.equals(dzVS2);
    }

    public int hashCode() {
        return 1;
    }
}
