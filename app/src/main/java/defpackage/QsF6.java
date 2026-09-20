package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class QsF6 {
    public final bLBI a;
    public final wv2 b;
    public final boolean c;
    public final Boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public QsF6() {
        this(0);
    }

    public /* synthetic */ QsF6(int i) {
        this(null, null, false, null);
    }

    public static QsF6 a(QsF6 qsF6, bLBI blbi, wv2 wv2Var, boolean z, Boolean bool, int i) {
        if ((i & 1) != 0) {
            blbi = qsF6.a;
        }
        if ((i & 2) != 0) {
            wv2Var = qsF6.b;
        }
        if ((i & 4) != 0) {
            z = qsF6.c;
        }
        if ((i & 8) != 0) {
            bool = qsF6.d;
        }
        qsF6.getClass();
        return new QsF6(blbi, wv2Var, z, bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QsF6)) {
            return false;
        }
        QsF6 qsF6 = (QsF6) obj;
        return this.a == qsF6.a && ur1.a(this.b, qsF6.b) && this.c == qsF6.c && ur1.a(this.d, qsF6.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final int hashCode() {
        bLBI blbi = this.a;
        int iHashCode = (blbi == null ? 0 : blbi.hashCode()) * 31;
        wv2 wv2Var = this.b;
        int iHashCode2 = (iHashCode + (wv2Var == null ? 0 : wv2Var.hashCode())) * 31;
        boolean z = this.c;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (iHashCode2 + r2) * 31;
        Boolean bool = this.d;
        return i + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "State(audioQuality=" + this.a + ", selectedBitrate=" + this.b + ", isRestartingPlayer=" + this.c + ", isPremium=" + this.d + ")";
    }

    public QsF6(bLBI blbi, wv2 wv2Var, boolean z, Boolean bool) {
        this.a = blbi;
        this.b = wv2Var;
        this.c = z;
        this.d = bool;
        this.e = (z || blbi == null || wv2Var == null || bool == null) ? false : true;
        this.f = (bool == null || bool.booleanValue()) ? false : true;
        this.g = blbi == bLBI.Compressed;
    }
}
