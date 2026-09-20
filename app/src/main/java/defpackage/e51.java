package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e51 {
    public final ig a;

    public e51(ig igVar) {
        this.a = igVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e51) && ur1.a(this.a, ((e51) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ForcedOptions(buffer=" + this.a + ")";
    }
}
