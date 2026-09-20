package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class kx4 {

    public static final class CQf extends cx1 implements j81<Long, sd5> {
        public final /* synthetic */ AOdm<T, V> A;
        public final /* synthetic */ float B;
        public final /* synthetic */ j81<rjr<T, V>, sd5> C;
        public final /* synthetic */ jl3<rjr<T, V>> w;
        public final /* synthetic */ T x;
        public final /* synthetic */ HZD4<T, V> y;

        /* JADX INFO: Incorrect field signature: TV; */
        public final /* synthetic */ z_Mm z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (Ljl3<Lrjr<TT;TV;>;>;TT;LHZD4<TT;TV;>;TV;LAOdm<TT;TV;>;FLj81<-Lrjr<TT;TV;>;Lsd5;>;)V */
        /* JADX WARN: Multi-variable type inference failed */
        public CQf(jl3 jl3Var, Object obj, HZD4 hzd4, z_Mm z_mm, AOdm aOdm, float f, j81 j81Var) {
            super(1);
            this.w = jl3Var;
            this.x = obj;
            this.y = hzd4;
            this.z = z_mm;
            this.A = aOdm;
            this.B = f;
            this.C = j81Var;
        }

        /* JADX WARN: Type inference failed for: r13v2, types: [T, rjr] */
        @Override // defpackage.j81
        public final sd5 invoke(Long l) {
            long jLongValue = l.longValue();
            T t = this.x;
            HZD4<T, V> hzd4 = this.y;
            ?? rjrVar = new rjr(t, hzd4.c(), this.z, jLongValue, hzd4.g(), jLongValue, new lx4(this.A));
            kx4.d(rjrVar, jLongValue, this.B, this.y, this.A, this.C);
            this.w.w = rjrVar;
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements h81<sd5> {
        public final /* synthetic */ AOdm<T, V> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(AOdm<T, V> aOdm) {
            super(0);
            this.w = aOdm;
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            this.w.B = false;
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends cx1 implements j81<Long, sd5> {
        public final /* synthetic */ j81<rjr<T, V>, sd5> A;
        public final /* synthetic */ jl3<rjr<T, V>> w;
        public final /* synthetic */ float x;
        public final /* synthetic */ HZD4<T, V> y;
        public final /* synthetic */ AOdm<T, V> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public LPt8Fixed(jl3<rjr<T, V>> jl3Var, float f, HZD4<T, V> hzd4, AOdm<T, V> aOdm, j81<? super rjr<T, V>, sd5> j81Var) {
            super(1);
            this.w = jl3Var;
            this.x = f;
            this.y = hzd4;
            this.z = aOdm;
            this.A = j81Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.j81
        public final sd5 invoke(Long l) {
            kx4.d((rjr) this.w.w, l.longValue(), this.x, this.y, this.z, this.A);
            return sd5.a;
        }
    }

    @if0(c = "androidx.compose.animation.core.SuspendAnimationKt", f = "SuspendAnimation.kt", l = {233, 272}, m = "animate")
    public static final class QnHx<T, V extends z_Mm> extends b90 {
        public HZD4 A;
        public j81 B;
        public jl3 C;
        public /* synthetic */ Object D;
        public int E;
        public AOdm z;

        public QnHx(z80<? super QnHx> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.D = obj;
            this.E |= Integer.MIN_VALUE;
            return kx4.a(null, null, 0L, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x011e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0135  */
    /* JADX WARN: Code duplicated, block: B:61:0x0138  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r13v1, types: [T, rjr] */
    public static final <T, V extends z_Mm> Object a(AOdm<T, V> aOdm, HZD4<T, V> hzd4, long j, j81<? super rjr<T, V>, sd5> j81Var, z80<? super sd5> z80Var) throws Throwable {
        QnHx qnHx;
        jl3 jl3Var;
        AOdm<T, V> aOdm2;
        j81<? super rjr<T, V>, sd5> j81Var2;
        j81<? super rjr<T, V>, sd5> j81Var3;
        jl3 jl3Var2;
        rjr rjrVar;
        rjr rjrVar2;
        HZD4<T, V> hzd5 = hzd4;
        if (z80Var instanceof QnHx) {
            qnHx = (QnHx) z80Var;
            int i = qnHx.E;
            if ((i & Integer.MIN_VALUE) != 0) {
                qnHx.E = i - Integer.MIN_VALUE;
            } else {
                qnHx = new QnHx(z80Var);
            }
        } else {
            qnHx = new QnHx(z80Var);
        }
        QnHx qnHx2 = qnHx;
        Object obj = qnHx2.D;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = qnHx2.E;
        la0 la0Var = qnHx2.x;
        if (i2 == 0) {
            C0239D.H(obj);
            T tF = hzd5.f(0L);
            z_Mm z_mmD = hzd5.d(0L);
            jl3Var = new jl3();
            try {
                if (j == Long.MIN_VALUE) {
                    CQf cQf = new CQf(jl3Var, tF, hzd4, z_mmD, aOdm, e(la0Var), j81Var);
                    qnHx2.z = aOdm;
                    qnHx2.A = hzd5;
                    j81Var2 = j81Var;
                    qnHx2.B = j81Var2;
                    qnHx2.C = jl3Var;
                    qnHx2.E = 1;
                    if ((hzd4.a() ? bx0.h(cQf, qnHx2) : fp1.E0(new nx4(cQf), qnHx2)) == va0Var) {
                        return va0Var;
                    }
                } else {
                    j81Var2 = j81Var;
                    try {
                        ?? r13 = (T) new rjr(tF, hzd4.c(), z_mmD, j, hzd4.g(), j, new F1(aOdm));
                        jl3Var = jl3Var;
                        d(r13, j, e(la0Var), hzd4, aOdm, j81Var);
                        jl3Var.w = r13;
                    } catch (CancellationException e) {
                        e = e;
                        jl3Var = jl3Var;
                        aOdm2 = aOdm;
                        rjrVar = (rjr) jl3Var.w;
                        if (rjrVar != null) {
                            rjrVar.i.setValue(Boolean.FALSE);
                        }
                        rjrVar2 = (rjr) jl3Var.w;
                        if (rjrVar2 == null && rjrVar2.g == aOdm2.z) {
                            aOdm2.B = false;
                        }
                        throw e;
                    }
                }
                j81Var3 = j81Var2;
                aOdm2 = aOdm;
                jl3Var2 = jl3Var;
            } catch (CancellationException e2) {
                e = e2;
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jl3 jl3Var3 = qnHx2.C;
            j81Var3 = qnHx2.B;
            HZD4<T, V> hzd6 = qnHx2.A;
            aOdm2 = qnHx2.z;
            jl3Var2 = jl3Var3;
            try {
                C0239D.H(obj);
                hzd5 = hzd6;
            } catch (CancellationException e3) {
                e = e3;
                jl3Var = jl3Var2;
                rjrVar = (rjr) jl3Var.w;
                if (rjrVar != null) {
                    rjrVar.i.setValue(Boolean.FALSE);
                }
                rjrVar2 = (rjr) jl3Var.w;
                if (rjrVar2 == null && rjrVar2.g == aOdm2.z) {
                    aOdm2.B = false;
                }
                throw e;
            }
        }
        while (((rjr) jl3Var2.w).d()) {
            LPt8Fixed lPt8 = new LPt8Fixed(jl3Var2, e(la0Var), hzd5, aOdm2, j81Var3);
            qnHx2.z = aOdm2;
            qnHx2.A = hzd5;
            qnHx2.B = j81Var3;
            qnHx2.C = jl3Var2;
            qnHx2.E = 2;
            if ((hzd5.a() ? bx0.h(lPt8, qnHx2) : fp1.E0(new nx4(lPt8), qnHx2)) == va0Var) {
                return va0Var;
            }
        }
        return sd5.a;
    }

    public static Object b(AOdm aOdm, nf0 nf0Var, j81 j81Var, b90 b90Var) throws Throwable {
        Object objA = a(aOdm, new mf0(nf0Var, aOdm.w, aOdm.getValue(), aOdm.y), Long.MIN_VALUE, j81Var, b90Var);
        return objA == va0.COROUTINE_SUSPENDED ? objA : sd5.a;
    }

    public static Object c(AOdm aOdm, Float f, Ah ah, boolean z, j81 j81Var, b90 b90Var, int i) throws Throwable {
        if ((i & 2) != 0) {
            ah = hH.w(0.0f, null, 7);
        }
        Ah ah2 = ah;
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            j81Var = mx4.w;
        }
        Object objA = a(aOdm, new t05(ah2, aOdm.w, aOdm.getValue(), f, aOdm.y), z ? aOdm.z : Long.MIN_VALUE, j81Var, b90Var);
        return objA == va0.COROUTINE_SUSPENDED ? objA : sd5.a;
    }

    public static final <T, V extends z_Mm> void d(rjr<T, V> rjrVar, long j, float f, HZD4<T, V> hzd4, AOdm<T, V> aOdm, j81<? super rjr<T, V>, sd5> j81Var) {
        long jB = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) == 0 ? hzd4.b() : (long) ((j - rjrVar.c) / f);
        rjrVar.g = j;
        rjrVar.e.setValue(hzd4.f(jB));
        rjrVar.f = (V) hzd4.d(jB);
        if (hzd4.e(jB)) {
            rjrVar.h = rjrVar.g;
            rjrVar.i.setValue(Boolean.FALSE);
        }
        f(rjrVar, aOdm);
        j81Var.invoke(rjrVar);
    }

    public static final float e(la0 la0Var) {
        int i = ah2.l;
        ah2 ah2Var = (ah2) la0Var.j(ah2.QnHx.w);
        float fR = ah2Var != null ? ah2Var.R() : 1.0f;
        if (fR >= 0.0f) {
            return fR;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public static final <T, V extends z_Mm> void f(rjr<T, V> rjrVar, AOdm<T, V> aOdm) {
        aOdm.x.setValue(rjrVar.b());
        V v = aOdm.y;
        V v2 = rjrVar.f;
        int iB = v.b();
        for (int i = 0; i < iB; i++) {
            v.e(v2.a(i), i);
        }
        aOdm.A = rjrVar.h;
        aOdm.z = rjrVar.g;
        aOdm.B = rjrVar.d();
    }
}
