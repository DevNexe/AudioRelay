package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uy3 {
    public final ty3 a;
    public final vy3 b;
    public final vp c;
    public final kj1<mp2> d;
    public final nj1<vz4.QnHx> e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final vy3 i;
    public final vp j;

    public uy3() {
        this((ty3) null, (vy3) null, (vp) null, (kj1) null, (nj1) null, false, 127);
    }

    public uy3(ty3 ty3Var, vy3 vy3Var, vp vpVar, kj1<mp2> kj1Var, nj1<vz4.QnHx> nj1Var, boolean z, boolean z2) {
        this.a = ty3Var;
        this.b = vy3Var;
        this.c = vpVar;
        this.d = kj1Var;
        this.e = nj1Var;
        this.f = z;
        this.g = z2;
        this.h = vy3Var != null ? vy3Var.a : null;
        if (vy3Var == null) {
            vy3 vy3Var2 = vy3.g;
            vy3Var = vy3.g;
        }
        this.i = vy3Var;
        if (vpVar == null) {
            vp vpVar2 = vp.d;
            vpVar = vp.d;
        }
        this.j = vpVar;
    }

    public static uy3 a(uy3 uy3Var, ty3 ty3Var, vy3 vy3Var, vp vpVar, kj1 kj1Var, nj1 nj1Var, boolean z, boolean z2, int i) {
        ty3 ty3Var2 = (i & 1) != 0 ? uy3Var.a : ty3Var;
        vy3 vy3Var2 = (i & 2) != 0 ? uy3Var.b : vy3Var;
        vp vpVar2 = (i & 4) != 0 ? uy3Var.c : vpVar;
        kj1 kj1Var2 = (i & 8) != 0 ? uy3Var.d : kj1Var;
        nj1 nj1Var2 = (i & 16) != 0 ? uy3Var.e : nj1Var;
        boolean z3 = (i & 32) != 0 ? uy3Var.f : z;
        boolean z4 = (i & 64) != 0 ? uy3Var.g : z2;
        uy3Var.getClass();
        return new uy3(ty3Var2, vy3Var2, vpVar2, (kj1<mp2>) kj1Var2, (nj1<vz4.QnHx>) nj1Var2, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uy3)) {
            return false;
        }
        uy3 uy3Var = (uy3) obj;
        return ur1.a(this.a, uy3Var.a) && ur1.a(this.b, uy3Var.b) && ur1.a(this.c, uy3Var.c) && ur1.a(this.d, uy3Var.d) && ur1.a(this.e, uy3Var.e) && this.f == uy3Var.f && this.g == uy3Var.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r1v12, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final int hashCode() {
        ty3 ty3Var = this.a;
        int iHashCode = (ty3Var == null ? 0 : ty3Var.hashCode()) * 31;
        vy3 vy3Var = this.b;
        int iHashCode2 = (iHashCode + (vy3Var == null ? 0 : vy3Var.hashCode())) * 31;
        vp vpVar = this.c;
        int iHashCode3 = (this.e.hashCode() + ((this.d.hashCode() + ((iHashCode2 + (vpVar != null ? vpVar.hashCode() : 0)) * 31)) * 31)) * 31;
        boolean z = this.f;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (iHashCode3 + r2) * 31;
        boolean z2 = this.g;
        return i + (z2 ? 1 : z2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(server=");
        sb.append(this.a);
        sb.append(", stats=");
        sb.append(this.b);
        sb.append(", chartData=");
        sb.append(this.c);
        sb.append(", notices=");
        sb.append(this.d);
        sb.append(", audioPlayerError=");
        sb.append(this.e);
        sb.append(", showShortCutToAudioOutputSettings=");
        sb.append(this.f);
        sb.append(", showPlaceholderWhenNoStats=");
        return Md5A.f(sb, this.g, ")");
    }

    public uy3(ty3 ty3Var, vy3 vy3Var, vp vpVar, kj1 kj1Var, nj1 nj1Var, boolean z, int i) {
        this((i & 1) != 0 ? null : ty3Var, (i & 2) != 0 ? null : vy3Var, (i & 4) != 0 ? null : vpVar, (kj1<mp2>) ((i & 8) != 0 ? new kj1(cs0.w) : kj1Var), (nj1<vz4.QnHx>) ((i & 16) != 0 ? new nj1(null) : nj1Var), (i & 32) != 0 ? false : z, (i & 64) != 0);
    }
}
