package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class o07 {
    public final Object a;
    public final int b;

    public o07(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o07)) {
            return false;
        }
        o07 o07Var = (o07) obj;
        return this.a == o07Var.a && this.b == o07Var.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
