package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ci {
    public final int a = 26100;
    public final String b = "0.26.1";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ci)) {
            return false;
        }
        ci ciVar = (ci) obj;
        return this.a == ciVar.a && ur1.a(this.b, ciVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a * 31);
    }

    public final String toString() {
        return "BuildVersion(versionCode=" + this.a + ", versionName=" + this.b + ")";
    }
}
