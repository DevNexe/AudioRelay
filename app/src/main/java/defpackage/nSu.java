package defpackage;

import defpackage.z_Mm;

/* JADX INFO: loaded from: classes.dex */
public final class nSu<T, V extends z_Mm> {
    public final AOdm<T, V> a;
    public final int b;

    /* JADX WARN: Incorrect types in method signature: (LAOdm<TT;TV;>;Ljava/lang/Object;)V */
    public nSu(AOdm aOdm, int i) {
        this.a = aOdm;
        this.b = i;
    }

    public final String toString() {
        return "AnimationResult(endReason=" + F65.c(this.b) + ", endState=" + this.a + ')';
    }
}
