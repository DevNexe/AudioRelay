package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xa1 extends cg5 {
    public float[] b;
    public final ArrayList c = new ArrayList();
    public List<? extends uz2> d;
    public boolean e;
    public TQ2_ f;
    public vz2 g;
    public h81<sd5> h;
    public String i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public boolean q;

    public xa1() {
        int i = sg5.a;
        this.d = cs0.w;
        this.e = true;
        this.i = "";
        this.m = 1.0f;
        this.n = 1.0f;
        this.q = true;
    }

    @Override // defpackage.cg5
    public final void a(ro0 ro0Var) {
        if (this.q) {
            float[] fArrC = this.b;
            if (fArrC == null) {
                fArrC = eu.c();
                this.b = fArrC;
            } else {
                eu.i(fArrC);
            }
            eu.k(fArrC, this.k + this.o, this.l + this.p);
            double d = (((double) this.j) * 3.141592653589793d) / 180.0d;
            float fCos = (float) Math.cos(d);
            float fSin = (float) Math.sin(d);
            float f = fArrC[0];
            float f2 = fArrC[4];
            float f3 = (fSin * f2) + (fCos * f);
            float f4 = -fSin;
            float f5 = (f2 * fCos) + (f * f4);
            float f6 = fArrC[1];
            float f7 = fArrC[5];
            float f8 = (fSin * f7) + (fCos * f6);
            float f9 = (f7 * fCos) + (f6 * f4);
            float f10 = fArrC[2];
            float f11 = fArrC[6];
            float f12 = (fSin * f11) + (fCos * f10);
            float f13 = (f11 * fCos) + (f10 * f4);
            float f14 = fArrC[3];
            float f15 = fArrC[7];
            float f16 = (fSin * f15) + (fCos * f14);
            float f17 = (fCos * f15) + (f4 * f14);
            fArrC[0] = f3;
            fArrC[1] = f8;
            fArrC[2] = f12;
            fArrC[3] = f16;
            fArrC[4] = f5;
            fArrC[5] = f9;
            fArrC[6] = f13;
            fArrC[7] = f17;
            float f18 = this.m;
            float f19 = this.n;
            fArrC[0] = f3 * f18;
            fArrC[1] = f8 * f18;
            fArrC[2] = f12 * f18;
            fArrC[3] = f16 * f18;
            fArrC[4] = f5 * f19;
            fArrC[5] = f9 * f19;
            fArrC[6] = f13 * f19;
            fArrC[7] = f17 * f19;
            fArrC[8] = fArrC[8] * 1.0f;
            fArrC[9] = fArrC[9] * 1.0f;
            fArrC[10] = fArrC[10] * 1.0f;
            fArrC[11] = fArrC[11] * 1.0f;
            eu.k(fArrC, -this.k, -this.l);
            this.q = false;
        }
        if (this.e) {
            if (!this.d.isEmpty()) {
                vz2 vz2Var = this.g;
                if (vz2Var == null) {
                    vz2Var = new vz2();
                    this.g = vz2Var;
                } else {
                    vz2Var.a.clear();
                }
                TQ2_ tq2_G = this.f;
                if (tq2_G == null) {
                    tq2_G = hH.g();
                    this.f = tq2_G;
                } else {
                    tq2_G.reset();
                }
                vz2Var.a.addAll(this.d);
                vz2Var.c(tq2_G);
            }
            this.e = false;
        }
        en.CQf cQfE0 = ro0Var.e0();
        long jD = cQfE0.d();
        cQfE0.b().e();
        float[] fArr = this.b;
        fn fnVar = cQfE0.a;
        if (fArr != null) {
            fnVar.f(fArr);
        }
        TQ2_ tq2_ = this.f;
        if ((!this.d.isEmpty()) && tq2_ != null) {
            fnVar.a(tq2_, 1);
        }
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((cg5) arrayList.get(i)).a(ro0Var);
        }
        cQfE0.b().r();
        cQfE0.a(jD);
    }

    @Override // defpackage.cg5
    public final h81<sd5> b() {
        return this.h;
    }

    @Override // defpackage.cg5
    public final void d(h81<sd5> h81Var) {
        this.h = h81Var;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((cg5) arrayList.get(i)).d(h81Var);
        }
    }

    public final void e(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            ArrayList arrayList = this.c;
            if (i < arrayList.size()) {
                ((cg5) arrayList.get(i)).d(null);
                arrayList.remove(i);
            }
        }
        c();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.i);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            cg5 cg5Var = (cg5) arrayList.get(i);
            sb.append("\t");
            sb.append(cg5Var.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
