package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bd {
    public bj1 a;
    public dn b;
    public en c;
    public qz2 d;

    public bd() {
        this(0);
    }

    public bd(int i) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bd)) {
            return false;
        }
        bd bdVar = (bd) obj;
        return ur1.a(this.a, bdVar.a) && ur1.a(this.b, bdVar.b) && ur1.a(this.c, bdVar.c) && ur1.a(this.d, bdVar.d);
    }

    public final int hashCode() {
        bj1 bj1Var = this.a;
        int iHashCode = (bj1Var == null ? 0 : bj1Var.hashCode()) * 31;
        dn dnVar = this.b;
        int iHashCode2 = (iHashCode + (dnVar == null ? 0 : dnVar.hashCode())) * 31;
        en enVar = this.c;
        int iHashCode3 = (iHashCode2 + (enVar == null ? 0 : enVar.hashCode())) * 31;
        qz2 qz2Var = this.d;
        return iHashCode3 + (qz2Var != null ? qz2Var.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.a + ", canvas=" + this.b + ", canvasDrawScope=" + this.c + ", borderPath=" + this.d + ')';
    }
}
