package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ta0 extends FJCM {
    public static final QnHx y = new QnHx();
    public final String x;

    public static final class QnHx implements la0.F1<ta0> {
    }

    public ta0(String str) {
        super(y);
        this.x = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ta0) && ur1.a(this.x, ((ta0) obj).x);
    }

    public final int hashCode() {
        return this.x.hashCode();
    }

    public final String toString() {
        return bl2.c(new StringBuilder("CoroutineName("), this.x, ')');
    }
}
