package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class Bs6V {
    public final int a;
    public final int b;

    public Bs6V(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Bs6V)) {
            return false;
        }
        Bs6V bs6V = (Bs6V) obj;
        return this.a == bs6V.a && this.b == bs6V.b;
    }

    public final int hashCode() {
        return O.h(this.b) + (O.h(this.a) * 31);
    }

    public final String toString() {
        return "AdConfig(mainBannerProvider=" + Ya.b(this.a) + ", interstitialProvider=" + Ya.b(this.b) + ")";
    }
}
