package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mm4<T> {
    public final g30 a;

    public /* synthetic */ mm4(g30 g30Var) {
        this.a = g30Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mm4) {
            return ur1.a(this.a, ((mm4) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SkippableUpdater(composer=" + this.a + ')';
    }
}
