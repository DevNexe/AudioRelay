package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xa extends sy2 {
    public final bj1 B;
    public final long C;
    public final long D;
    public int E;
    public final long F;
    public float G;
    public av H;

    public xa(bj1 bj1Var) {
        this(bj1Var, mp1.b, C0239D.e(bj1Var.getWidth(), bj1Var.getHeight()));
    }

    @Override // defpackage.sy2
    public final boolean b(float f) {
        this.G = f;
        return true;
    }

    @Override // defpackage.sy2
    public final boolean e(av avVar) {
        this.H = avVar;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xa)) {
            return false;
        }
        xa xaVar = (xa) obj;
        if (!ur1.a(this.B, xaVar.B)) {
            return false;
        }
        int i = mp1.c;
        if ((this.C == xaVar.C) && sp1.a(this.D, xaVar.D)) {
            return this.E == xaVar.E;
        }
        return false;
    }

    @Override // defpackage.sy2
    public final long g() {
        return C0239D.J(this.F);
    }

    @Override // defpackage.sy2
    public final void h(ro0 ro0Var) {
        qo0.c(ro0Var, this.B, this.C, this.D, C0239D.e(sy4.c(cm4.e(ro0Var.d())), sy4.c(cm4.c(ro0Var.d()))), this.G, this.H, this.E, 328);
    }

    public final int hashCode() {
        int iHashCode = this.B.hashCode() * 31;
        int i = mp1.c;
        long j = this.C;
        int i2 = (((int) (j ^ (j >>> 32))) + iHashCode) * 31;
        long j2 = this.D;
        return ((((int) (j2 ^ (j2 >>> 32))) + i2) * 31) + this.E;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.B);
        sb.append(", srcOffset=");
        sb.append((Object) mp1.b(this.C));
        sb.append(", srcSize=");
        sb.append((Object) sp1.c(this.D));
        sb.append(", filterQuality=");
        int i = this.E;
        if (i == 0) {
            str = "None";
        } else {
            if (i == 1) {
                str = "Low";
            } else {
                if (i == 2) {
                    str = "Medium";
                } else {
                    str = i == 3 ? "High" : "Unknown";
                }
            }
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }

    public xa(bj1 bj1Var, long j, long j2) {
        int i;
        this.B = bj1Var;
        this.C = j;
        this.D = j2;
        this.E = 1;
        int i2 = mp1.c;
        if (((int) (j >> 32)) >= 0 && mp1.a(j) >= 0 && (i = (int) (j2 >> 32)) >= 0 && sp1.b(j2) >= 0 && i <= bj1Var.getWidth() && sp1.b(j2) <= bj1Var.getHeight()) {
            this.F = j2;
            this.G = 1.0f;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
