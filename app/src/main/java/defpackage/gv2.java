package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gv2 {
    public final String a;

    public gv2(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gv2) && ur1.a(this.a, ((gv2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return bl2.c(new StringBuilder("OpaqueKey(key="), this.a, ')');
    }
}
