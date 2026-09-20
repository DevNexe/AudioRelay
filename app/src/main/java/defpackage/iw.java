package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class iw extends us3 implements yl3 {
    public final is4<ms3> A;
    public final yp4<qd3, ns3> B;
    public final boolean x;
    public final float y;
    public final is4<yu> z;

    @if0(c = "androidx.compose.material.ripple.CommonRippleIndicationInstance$addRipple$2", f = "CommonRipple.kt", l = {87}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<ua0, z80<? super sd5>, Object> {
        public int A;
        public final /* synthetic */ ns3 B;
        public final /* synthetic */ iw C;
        public final /* synthetic */ qd3 D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(ns3 ns3Var, iw iwVar, qd3 qd3Var, z80<? super QnHx> z80Var) {
            super(2, z80Var);
            this.B = ns3Var;
            this.C = iwVar;
            this.D = qd3Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            return new QnHx(this.B, this.C, this.D, z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            qd3 qd3Var = this.D;
            iw iwVar = this.C;
            try {
                if (i == 0) {
                    C0239D.H(obj);
                    ns3 ns3Var = this.B;
                    this.A = 1;
                    if (ns3Var.a(this) == va0Var) {
                        return va0Var;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C0239D.H(obj);
                }
                iwVar.B.remove(qd3Var);
                return sd5.a;
            } catch (Throwable th) {
                iwVar.B.remove(qd3Var);
                throw th;
            }
        }

        @Override // defpackage.x81
        public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
            return ((QnHx) a(ua0Var, z80Var)).i(sd5.a);
        }
    }

    public iw() {
        throw null;
    }

    public iw(boolean z, float f, ri2 ri2Var, ri2 ri2Var2) {
        super(ri2Var2, z);
        this.x = z;
        this.y = f;
        this.z = ri2Var;
        this.A = ri2Var2;
        this.B = new yp4<>();
    }

    @Override // defpackage.yl3
    public final void a() {
        this.B.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vj1
    public final void b(ez1 ez1Var) {
        ez1Var = ez1Var;
        long j = this.z.getValue().a;
        ez1Var.B0();
        f(this.y, j, ez1Var);
        Object it = this.B.x.iterator();
        while (((ts4) it).hasNext()) {
            ns3 ns3Var = (ns3) ((Map.Entry) ((ss4) it).next()).getValue();
            float f = this.A.getValue().d;
            if (!(f == 0.0f)) {
                long jB = yu.b(j, f);
                if (ns3Var.d == null) {
                    long jD = ez1Var.d();
                    float f2 = qs3.a;
                    ns3Var.d = Float.valueOf(Math.max(cm4.e(jD), cm4.c(jD)) * 0.3f);
                }
                Float f3 = ns3Var.e;
                boolean z = ns3Var.c;
                if (f3 == null) {
                    float f4 = ns3Var.b;
                    ns3Var.e = Float.isNaN(f4) ? Float.valueOf(qs3.a(ez1Var, z, ez1Var.d())) : Float.valueOf(ez1Var.b0(f4));
                }
                if (ns3Var.a == null) {
                    ns3Var.a = new kt2(ez1Var.t0());
                }
                if (ns3Var.f == null) {
                    ns3Var.f = new kt2(X.a(cm4.e(ez1Var.d()) / 2.0f, cm4.c(ez1Var.d()) / 2.0f));
                }
                float fFloatValue = (!((Boolean) ns3Var.l.getValue()).booleanValue() || ((Boolean) ns3Var.k.getValue()).booleanValue()) ? ns3Var.g.d().floatValue() : 1.0f;
                float fY = C0239D.y(ns3Var.d.floatValue(), ns3Var.e.floatValue(), ns3Var.h.d().floatValue());
                float fC = kt2.c(ns3Var.a.a);
                float fC2 = kt2.c(ns3Var.f.a);
                OVbg<Float, JW> oVbg = ns3Var.i;
                long jA = X.a(C0239D.y(fC, fC2, oVbg.d().floatValue()), C0239D.y(kt2.d(ns3Var.a.a), kt2.d(ns3Var.f.a), oVbg.d().floatValue()));
                long jB2 = yu.b(jB, yu.d(jB) * fFloatValue);
                if (z) {
                    float fE = cm4.e(ez1Var.d());
                    float fC3 = cm4.c(ez1Var.d());
                    en.CQf cQf = ez1Var.w.x;
                    long jD2 = cQf.d();
                    cQf.b().e();
                    cQf.a.b(0.0f, 0.0f, fE, fC3, 1);
                    ez1Var.V(jB2, (124 & 2) != 0 ? cm4.d(ez1Var.d()) / 2.0f : fY, (124 & 4) != 0 ? ez1Var.t0() : jA, (124 & 8) != 0 ? 1.0f : 0.0f, (124 & 16) != 0 ? gx0.w : null, null, (124 & 64) != 0 ? 3 : 0);
                    cQf.b().r();
                    cQf.a(jD2);
                } else {
                    ez1Var.V(jB2, (124 & 2) != 0 ? cm4.d(ez1Var.d()) / 2.0f : fY, (124 & 4) != 0 ? ez1Var.t0() : jA, (124 & 8) != 0 ? 1.0f : 0.0f, (124 & 16) != 0 ? gx0.w : null, null, (124 & 64) != 0 ? 3 : 0);
                }
                j = j;
            }
        }
    }

    @Override // defpackage.yl3
    public final void c() {
        this.B.clear();
    }

    @Override // defpackage.yl3
    public final void d() {
    }

    @Override // defpackage.us3
    public final void e(qd3 qd3Var, ua0 ua0Var) {
        yp4<qd3, ns3> yp4Var = this.B;
        Iterator it = yp4Var.x.iterator();
        while (it.hasNext()) {
            ns3 ns3Var = (ns3) ((Map.Entry) it.next()).getValue();
            ns3Var.l.setValue(Boolean.TRUE);
            ns3Var.j.G0(sd5.a);
        }
        boolean z = this.x;
        ns3 ns3Var2 = new ns3(z ? new kt2(qd3Var.a) : null, this.y, z);
        yp4Var.put(qd3Var, ns3Var2);
        fp1.k0(ua0Var, null, 0, new QnHx(ns3Var2, this, qd3Var, null), 3);
    }

    @Override // defpackage.us3
    public final void g(qd3 qd3Var) {
        ns3 ns3Var = this.B.get(qd3Var);
        if (ns3Var != null) {
            ns3Var.l.setValue(Boolean.TRUE);
            ns3Var.j.G0(sd5.a);
        }
    }
}
