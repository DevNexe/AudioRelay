package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class uh1 {
    public int a;
    public Serializable b;
    public Serializable c;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Serializable, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int[], java.io.Serializable] */
    public uh1(int i) {
        if (i == 1) {
            this.a = 1;
        } else {
            this.b = new Object[4];
            this.c = new int[4];
        }
    }
}
