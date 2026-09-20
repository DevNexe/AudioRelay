package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ox2 implements zq {
    public final Class<?> a;

    public ox2(Class cls) {
        this.a = cls;
    }

    @Override // defpackage.zq
    public final Class<?> c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ox2) {
            if (ur1.a(this.a, ((ox2) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
