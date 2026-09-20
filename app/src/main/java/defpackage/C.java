package defpackage;

import android.graphics.Canvas;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class C implements bu0<k82, j82, l82> {
    public final kw1 a;

    public final class k extends us3 implements yl3 {
        public final is4<ms3> A;
        public final rs3 B;
        public final kz2 C;
        public final kz2 D;
        public long E;
        public int F;
        public final eNa G;
        public final boolean x;
        public final float y;
        public final is4<yu> z;

        public k() {
            throw null;
        }

        public k(boolean z, float f, ri2 ri2Var, ri2 ri2Var2, rs3 rs3Var) {
            super(ri2Var2, z);
            this.x = z;
            this.y = f;
            this.z = ri2Var;
            this.A = ri2Var2;
            this.B = rs3Var;
            this.C = ps0.R(null);
            this.D = ps0.R(Boolean.TRUE);
            this.E = cm4.b;
            this.F = -1;
            this.G = new eNa(this);
        }

        @Override // defpackage.yl3
        public final void a() throws Throwable {
            h();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.vj1
        public final void b(ez1 ez1Var) {
            this.E = ez1Var.d();
            float f = this.y;
            this.F = Float.isNaN(f) ? sy4.c(qs3.a(ez1Var, this.x, ez1Var.d())) : ez1Var.p0(f);
            long j = this.z.getValue().a;
            float f2 = this.A.getValue().d;
            ez1Var.B0();
            f(f, j, ez1Var);
            dn dnVarB = ez1Var.w.x.b();
            ((Boolean) this.D.getValue()).booleanValue();
            ts3 ts3Var = (ts3) this.C.getValue();
            if (ts3Var != null) {
                ts3Var.e(f2, this.F, ez1Var.d(), j);
                Canvas canvas = F6mt.a;
                ts3Var.draw(((ZCR) dnVarB).a);
            }
        }

        @Override // defpackage.yl3
        public final void c() throws Throwable {
            h();
        }

        @Override // defpackage.yl3
        public final void d() {
        }

        @Override // defpackage.us3
        public final void e(qd3 qd3Var, ua0 ua0Var) throws Throwable {
            rs3 rs3Var = this.B;
            ss3 ss3Var = rs3Var.z;
            ts3 ts3Var = (ts3) ((Map) ss3Var.x).get(this);
            if (ts3Var == null) {
                ArrayList arrayList = rs3Var.y;
                ts3Var = (ts3) (arrayList.isEmpty() ? null : arrayList.remove(0));
                Object obj = ss3Var.y;
                if (ts3Var == null) {
                    int i = rs3Var.A;
                    ArrayList arrayList2 = rs3Var.x;
                    if (i > ps0.J(arrayList2)) {
                        ts3Var = new ts3(rs3Var.getContext());
                        rs3Var.addView(ts3Var);
                        arrayList2.add(ts3Var);
                    } else {
                        ts3Var = (ts3) arrayList2.get(rs3Var.A);
                        k kVar = (k) ((Map) obj).get(ts3Var);
                        if (kVar != null) {
                            kVar.C.setValue(null);
                            ss3Var.g(kVar);
                            ts3Var.c();
                        }
                    }
                    int i2 = rs3Var.A;
                    if (i2 < rs3Var.w - 1) {
                        rs3Var.A = i2 + 1;
                    } else {
                        rs3Var.A = 0;
                    }
                }
                ((Map) ss3Var.x).put(this, ts3Var);
                ((Map) obj).put(ts3Var, this);
            }
            ts3Var.b(qd3Var, this.x, this.E, this.F, this.z.getValue().a, this.A.getValue().d, this.G);
            this.C.setValue(ts3Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.us3
        public final void g(qd3 qd3Var) throws Throwable {
            ts3 ts3Var = (ts3) this.C.getValue();
            if (ts3Var != null) {
                ts3Var.d();
            }
        }

        public final void h() throws Throwable {
            rs3 rs3Var = this.B;
            rs3Var.getClass();
            this.C.setValue(null);
            ss3 ss3Var = rs3Var.z;
            ts3 ts3Var = (ts3) ((Map) ss3Var.x).get(this);
            if (ts3Var != null) {
                ts3Var.c();
                ss3Var.g(this);
                rs3Var.y.add(ts3Var);
            }
        }
    }

    public C(kw1 kw1Var) {
        this.a = kw1Var;
    }

    @Override // defpackage.bu0
    public final Object a(du0 du0Var, Object obj, z80 z80Var) {
        if (ur1.a((j82) obj, j82.QnHx.a)) {
            this.a.dismiss();
        }
        return sd5.a;
    }
}
