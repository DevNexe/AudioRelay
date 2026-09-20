package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p5 {
    public final List<i6> a;

    public p5() {
        this(0);
    }

    public p5(List<i6> list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p5) && ur1.a(this.a, ((p5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BallastApplicationState(connections=" + this.a + ')';
    }

    public /* synthetic */ p5(int i) {
        this(cs0.w);
    }
}
