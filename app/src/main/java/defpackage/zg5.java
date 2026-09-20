package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zg5 extends tg5 {
    public final float A;
    public final cg B;
    public final float C;
    public final float D;
    public final int E;
    public final int F;
    public final float G;
    public final float H;
    public final float I;
    public final float J;
    public final String w;
    public final List<uz2> x;
    public final int y;
    public final cg z;

    public zg5(String str, List list, int i, cg cgVar, float f, cg cgVar2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        this.w = str;
        this.x = list;
        this.y = i;
        this.z = cgVar;
        this.A = f;
        this.B = cgVar2;
        this.C = f2;
        this.D = f3;
        this.E = i2;
        this.F = i3;
        this.G = f4;
        this.H = f5;
        this.I = f6;
        this.J = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !ur1.a(nl3.a(zg5.class), nl3.a(obj.getClass()))) {
            return false;
        }
        zg5 zg5Var = (zg5) obj;
        if (!ur1.a(this.w, zg5Var.w) || !ur1.a(this.z, zg5Var.z)) {
            return false;
        }
        if (!(this.A == zg5Var.A) || !ur1.a(this.B, zg5Var.B)) {
            return false;
        }
        if (!(this.C == zg5Var.C)) {
            return false;
        }
        if (!(this.D == zg5Var.D)) {
            return false;
        }
        if (!(this.E == zg5Var.E)) {
            return false;
        }
        if (!(this.F == zg5Var.F)) {
            return false;
        }
        if (!(this.G == zg5Var.G)) {
            return false;
        }
        if (!(this.H == zg5Var.H)) {
            return false;
        }
        if (!(this.I == zg5Var.I)) {
            return false;
        }
        if (this.J == zg5Var.J) {
            return (this.y == zg5Var.y) && ur1.a(this.x, zg5Var.x);
        }
        return false;
    }

    public final int hashCode() {
        int iA = qg5.a(this.x, this.w.hashCode() * 31, 31);
        cg cgVar = this.z;
        int iB = ry0.b(this.A, (iA + (cgVar != null ? cgVar.hashCode() : 0)) * 31, 31);
        cg cgVar2 = this.B;
        return ry0.b(this.J, ry0.b(this.I, ry0.b(this.H, ry0.b(this.G, (((ry0.b(this.D, ry0.b(this.C, (iB + (cgVar2 != null ? cgVar2.hashCode() : 0)) * 31, 31), 31) + this.E) * 31) + this.F) * 31, 31), 31), 31), 31) + this.y;
    }
}
