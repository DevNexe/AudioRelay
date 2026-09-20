package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ph5 extends lb5 {
    public final String a;

    public ph5(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ph5) {
            return ur1.a(this.a, ((ph5) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return bl2.c(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.a, ')');
    }
}
