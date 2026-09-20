package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class iy4<T> {
    public final Ah<Float> a;
    public final j81<T, Boolean> b;
    public final kz2 c;
    public final kz2 d = ps0.R(Boolean.FALSE);
    public final kz2 e;
    public final kz2 f;
    public final kz2 g;
    public final kz2 h;
    public final kz2 i;
    public final e01 j;
    public float k;
    public float l;
    public final kz2 m;
    public final kz2 n;
    public final kz2 o;
    public final mg0 p;

    public static final class CQf extends cx1 implements j81<Float, sd5> {
        public final /* synthetic */ iy4<T> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(iy4<T> iy4Var) {
            super(1);
            this.w = iy4Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(Float f) {
            float fFloatValue = f.floatValue();
            iy4<T> iy4Var = this.w;
            float fFloatValue2 = ((Number) iy4Var.g.getValue()).floatValue() + fFloatValue;
            float fN = AY.n(fFloatValue2, iy4Var.k, iy4Var.l);
            float f2 = fFloatValue2 - fN;
            lp3 lp3Var = (lp3) iy4Var.o.getValue();
            float fSin = 0.0f;
            if (lp3Var != null) {
                float f3 = f2 < 0.0f ? lp3Var.b : lp3Var.c;
                if (!(f3 == 0.0f)) {
                    float f4 = lp3Var.a;
                    fSin = ((float) Math.sin((AY.n(f2 / f4, -1.0f, 1.0f) * 3.1415927f) / 2)) * (f4 / f3);
                }
            }
            iy4Var.e.setValue(Float.valueOf(fN + fSin));
            iy4Var.f.setValue(Float.valueOf(f2));
            iy4Var.g.setValue(Float.valueOf(fFloatValue2));
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements h81<Map<Float, ? extends T>> {
        public final /* synthetic */ iy4<T> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(iy4<T> iy4Var) {
            super(0);
            this.w = iy4Var;
        }

        @Override // defpackage.h81
        public final Object invoke() {
            return (Map) this.w.i.getValue();
        }
    }

    @if0(c = "androidx.compose.material.SwipeableState", f = "Swipeable.kt", l = {159, 183, 186}, m = "processNewAnchors$material_release")
    public static final class LPt8Fixed extends b90 {
        public Map A;
        public float B;
        public /* synthetic */ Object C;
        public final /* synthetic */ iy4<T> D;
        public int E;
        public iy4 z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LPt8Fixed(iy4<T> iy4Var, z80<? super LPt8Fixed> z80Var) {
            super(z80Var);
            this.D = iy4Var;
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.C = obj;
            this.E |= Integer.MIN_VALUE;
            return this.D.c(null, null, this);
        }
    }

    public static final class NUlFixed implements mz0<Map<Float, ? extends T>> {
        public final /* synthetic */ mz0 w;

        public static final class QnHx<T> implements nz0 {
            public final /* synthetic */ nz0 w;

            /* JADX INFO: renamed from: iy4$NUl$QnHx$QnHx, reason: collision with other inner class name */
            @if0(c = "androidx.compose.material.SwipeableState$special$$inlined$filter$1$2", f = "Swipeable.kt", l = {224}, m = "emit")
            public static final class C0149QnHx extends b90 {
                public int A;
                public /* synthetic */ Object z;

                public C0149QnHx(z80 z80Var) {
                    super(z80Var);
                }

                @Override // defpackage.m8
                public final Object i(Object obj) {
                    this.z = obj;
                    this.A |= Integer.MIN_VALUE;
                    return QnHx.this.f(null, this);
                }
            }

            public QnHx(nz0 nz0Var) {
                this.w = nz0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.nz0
            public final Object f(Object obj, z80 z80Var) throws Throwable {
                C0149QnHx c0149QnHx;
                if (z80Var instanceof C0149QnHx) {
                    c0149QnHx = (C0149QnHx) z80Var;
                    int i = c0149QnHx.A;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0149QnHx.A = i - Integer.MIN_VALUE;
                    } else {
                        c0149QnHx = new C0149QnHx(z80Var);
                    }
                } else {
                    c0149QnHx = new C0149QnHx(z80Var);
                }
                Object obj2 = c0149QnHx.z;
                va0 va0Var = va0.COROUTINE_SUSPENDED;
                int i2 = c0149QnHx.A;
                if (i2 == 0) {
                    C0239D.H(obj2);
                    if (!((Map) obj).isEmpty()) {
                        c0149QnHx.A = 1;
                        if (this.w.f(obj, c0149QnHx) == va0Var) {
                            return va0Var;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C0239D.H(obj2);
                }
                return sd5.a;
            }
        }

        public NUlFixed(d24 d24Var) {
            this.w = d24Var;
        }

        @Override // defpackage.mz0
        public final Object a(nz0 nz0Var, z80 z80Var) {
            Object objA = this.w.a(new QnHx(nz0Var), z80Var);
            return objA == va0.COROUTINE_SUSPENDED ? objA : sd5.a;
        }
    }

    @if0(c = "androidx.compose.material.SwipeableState$animateInternalToOffset$2", f = "Swipeable.kt", l = {223}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<qn0, z80<? super sd5>, Object> {
        public int A;
        public /* synthetic */ Object B;
        public final /* synthetic */ iy4<T> C;
        public final /* synthetic */ float D;
        public final /* synthetic */ Ah<Float> E;

        /* JADX INFO: renamed from: iy4$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0150QnHx extends cx1 implements j81<OVbg<Float, JW>, sd5> {
            public final /* synthetic */ qn0 w;
            public final /* synthetic */ gl3 x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0150QnHx(qn0 qn0Var, gl3 gl3Var) {
                super(1);
                this.w = qn0Var;
                this.x = gl3Var;
            }

            @Override // defpackage.j81
            public final sd5 invoke(OVbg<Float, JW> oVbg) {
                OVbg<Float, JW> oVbg2 = oVbg;
                float fFloatValue = oVbg2.d().floatValue();
                gl3 gl3Var = this.x;
                this.w.a(fFloatValue - gl3Var.w);
                gl3Var.w = oVbg2.d().floatValue();
                return sd5.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(iy4<T> iy4Var, float f, Ah<Float> ah, z80<? super QnHx> z80Var) {
            super(2, z80Var);
            this.C = iy4Var;
            this.D = f;
            this.E = ah;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            QnHx qnHx = new QnHx(this.C, this.D, this.E, z80Var);
            qnHx.B = obj;
            return qnHx;
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            iy4<T> iy4Var = this.C;
            try {
                if (i == 0) {
                    C0239D.H(obj);
                    qn0 qn0Var = (qn0) this.B;
                    gl3 gl3Var = new gl3();
                    gl3Var.w = ((Number) iy4Var.g.getValue()).floatValue();
                    float f = this.D;
                    iy4Var.h.setValue(new Float(f));
                    iy4Var.d.setValue(Boolean.TRUE);
                    OVbg oVbgA = ps0.a(gl3Var.w);
                    Float f2 = new Float(f);
                    Ah<Float> ah = this.E;
                    C0150QnHx c0150QnHx = new C0150QnHx(qn0Var, gl3Var);
                    this.A = 1;
                    if (OVbg.c(oVbgA, f2, ah, c0150QnHx, this, 4) == va0Var) {
                        return va0Var;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C0239D.H(obj);
                }
                iy4Var.h.setValue(null);
                iy4Var.d.setValue(Boolean.FALSE);
                return sd5.a;
            } catch (Throwable th) {
                iy4Var.h.setValue(null);
                iy4Var.d.setValue(Boolean.FALSE);
                throw th;
            }
        }

        @Override // defpackage.x81
        public final Object invoke(qn0 qn0Var, z80<? super sd5> z80Var) {
            return ((QnHx) a(qn0Var, z80Var)).i(sd5.a);
        }
    }

    public static final class YKK extends cx1 implements x81<Float, Float, Float> {
        public static final YKK w = new YKK();

        public YKK() {
            super(2);
        }

        @Override // defpackage.x81
        public final Float invoke(Float f, Float f2) {
            f.floatValue();
            f2.floatValue();
            return Float.valueOf(0.0f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public iy4(T t, Ah<Float> ah, j81<? super T, Boolean> j81Var) {
        this.a = ah;
        this.b = j81Var;
        this.c = ps0.R(t);
        Float fValueOf = Float.valueOf(0.0f);
        this.e = ps0.R(fValueOf);
        this.f = ps0.R(fValueOf);
        this.g = ps0.R(fValueOf);
        this.h = ps0.R(null);
        this.i = ps0.R(ds0.w);
        this.j = new e01(new NUlFixed(ps0.h0(new F1(this))));
        this.k = Float.NEGATIVE_INFINITY;
        this.l = Float.POSITIVE_INFINITY;
        this.m = ps0.R(YKK.w);
        this.n = ps0.R(fValueOf);
        this.o = ps0.R(null);
        this.p = new mg0(new CQf(this));
    }

    public final Object a(float f, Ah<Float> ah, z80<? super sd5> z80Var) {
        Object objA = this.p.a(vi2.Default, new QnHx(this, f, ah, null), z80Var);
        return objA == va0.COROUTINE_SUSPENDED ? objA : sd5.a;
    }

    public final T b() {
        return this.c.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:89:0x0217  */
    /* JADX WARN: Code duplicated, block: B:90:0x0218 A[Catch: all -> 0x004f, TRY_LEAVE, TryCatch #4 {all -> 0x004f, blocks: (B:21:0x004a, B:87:0x01fc, B:90:0x0218), top: B:100:0x004a }] */
    /* JADX WARN: Code duplicated, block: B:92:0x021c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:93:0x021d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [iy4] */
    /* JADX WARN: Type inference failed for: r0v7, types: [iy4] */
    /* JADX WARN: Type inference failed for: r0v8, types: [iy4] */
    /* JADX WARN: Type inference failed for: r10v0, types: [iy4, iy4<T>] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [iy4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v19, types: [iy4] */
    /* JADX WARN: Type inference failed for: r2v20, types: [iy4] */
    /* JADX WARN: Type inference failed for: r2v24 */
    public final Object c(Map<Float, ? extends T> map, Map<Float, ? extends T> map2, z80<? super sd5> z80Var) throws Throwable {
        LPt8Fixed lPt8;
        T next;
        float fFloatValue;
        ?? r0;
        ?? r2;
        ?? r3;
        T next2;
        Object objA;
        ?? r1;
        if (z80Var instanceof LPt8Fixed) {
            lPt8 = (LPt8Fixed) z80Var;
            int i = lPt8.E;
            if ((i & Integer.MIN_VALUE) != 0) {
                lPt8.E = i - Integer.MIN_VALUE;
            } else {
                lPt8 = new LPt8Fixed(this, z80Var);
            }
        } else {
            lPt8 = new LPt8Fixed(this, z80Var);
        }
        Object obj = lPt8.C;
        Object obj2 = va0.COROUTINE_SUSPENDED;
        int i2 = lPt8.E;
        if (i2 == 0) {
            C0239D.H(obj);
            if (map.isEmpty()) {
                this.k = wu.R0(map2.keySet()).floatValue();
                this.l = wu.Q0(map2.keySet()).floatValue();
                Float fC = fXUx.c(b(), map2);
                if (fC == null) {
                    throw new IllegalArgumentException("The initial value must have an associated anchor.".toString());
                }
                float fFloatValue2 = fC.floatValue();
                lPt8.E = 1;
                Object objA2 = this.p.a(vi2.Default, new ly4(fFloatValue2, this, null), lPt8);
                if (objA2 != obj2) {
                    objA2 = sd5.a;
                }
                if (objA2 == obj2) {
                    return obj2;
                }
                return sd5.a;
            }
            if (!ur1.a(map2, map)) {
                this.k = Float.NEGATIVE_INFINITY;
                this.l = Float.POSITIVE_INFINITY;
                Float f = (Float) this.h.getValue();
                if (f != null) {
                    Float fC2 = fXUx.c(map.get(f), map2);
                    if (fC2 != null) {
                        fFloatValue = fC2.floatValue();
                    } else {
                        Iterator<T> it = map2.keySet().iterator();
                        if (it.hasNext()) {
                            next2 = it.next();
                            if (it.hasNext()) {
                                float fAbs = Math.abs(((Number) next2).floatValue() - f.floatValue());
                                do {
                                    T next3 = it.next();
                                    float fAbs2 = Math.abs(((Number) next3).floatValue() - f.floatValue());
                                    if (Float.compare(fAbs, fAbs2) > 0) {
                                        next2 = next3;
                                        fAbs = fAbs2;
                                    }
                                } while (it.hasNext());
                            }
                        } else {
                            next2 = (T) null;
                        }
                        fFloatValue = next2.floatValue();
                    }
                } else {
                    kz2 kz2Var = this.e;
                    Object objB = map.get(kz2Var.getValue());
                    if (ur1.a(objB, b())) {
                        objB = b();
                    }
                    Float fC3 = fXUx.c(objB, map2);
                    if (fC3 != null) {
                        fFloatValue = fC3.floatValue();
                    } else {
                        Iterator<T> it2 = map2.keySet().iterator();
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (it2.hasNext()) {
                                float fAbs3 = Math.abs(((Number) next).floatValue() - ((Number) kz2Var.getValue()).floatValue());
                                do {
                                    T next4 = it2.next();
                                    float fAbs4 = Math.abs(((Number) next4).floatValue() - ((Number) kz2Var.getValue()).floatValue());
                                    if (Float.compare(fAbs3, fAbs4) > 0) {
                                        next = next4;
                                        fAbs3 = fAbs4;
                                    }
                                } while (it2.hasNext());
                            }
                        } else {
                            next = (T) null;
                        }
                        fFloatValue = next.floatValue();
                    }
                }
                try {
                    Ah<Float> ah = this.a;
                    lPt8.z = this;
                    lPt8.A = map2;
                    lPt8.B = fFloatValue;
                    lPt8.E = 2;
                    if (a(fFloatValue, ah, lPt8) == obj2) {
                        return obj2;
                    }
                    r3 = this;
                    r3.d(t92.P(new Float(fFloatValue), map2));
                    r3.k = wu.R0(map2.keySet()).floatValue();
                    r3.l = wu.Q0(map2.keySet()).floatValue();
                } catch (CancellationException unused) {
                    r2 = this;
                    lPt8.z = r2;
                    lPt8.A = map2;
                    lPt8.B = fFloatValue;
                    lPt8.E = 3;
                    r2.getClass();
                    objA = r2.p.a(vi2.Default, new ly4(fFloatValue, r2, null), lPt8);
                    if (objA == obj2) {
                        objA = sd5.a;
                    }
                    if (objA == obj2) {
                        return obj2;
                    }
                    r1 = r2;
                    r1.d(t92.P(new Float(fFloatValue), map2));
                    r1.k = wu.R0(map2.keySet()).floatValue();
                    r1.l = wu.Q0(map2.keySet()).floatValue();
                } catch (Throwable th) {
                    th = th;
                    r0 = this;
                    r0.d(t92.P(new Float(fFloatValue), map2));
                    r0.k = wu.R0(map2.keySet()).floatValue();
                    r0.l = wu.Q0(map2.keySet()).floatValue();
                    throw th;
                }
            }
        } else {
            if (i2 == 1) {
                C0239D.H(obj);
                return sd5.a;
            }
            if (i2 == 2) {
                fFloatValue = lPt8.B;
                map2 = lPt8.A;
                r2 = lPt8.z;
                try {
                    try {
                        C0239D.H(obj);
                        r3 = r2;
                        r3.d(t92.P(new Float(fFloatValue), map2));
                        r3.k = wu.R0(map2.keySet()).floatValue();
                        r3.l = wu.Q0(map2.keySet()).floatValue();
                    } catch (Throwable th2) {
                        th = th2;
                        r0 = r2;
                        r0.d(t92.P(new Float(fFloatValue), map2));
                        r0.k = wu.R0(map2.keySet()).floatValue();
                        r0.l = wu.Q0(map2.keySet()).floatValue();
                        throw th;
                    }
                } catch (CancellationException unused2) {
                    lPt8.z = r2;
                    lPt8.A = map2;
                    lPt8.B = fFloatValue;
                    lPt8.E = 3;
                    r2.getClass();
                    objA = r2.p.a(vi2.Default, new ly4(fFloatValue, r2, null), lPt8);
                    if (objA == obj2) {
                        objA = sd5.a;
                    }
                    if (objA == obj2) {
                        return obj2;
                    }
                    r1 = r2;
                    r1.d(t92.P(new Float(fFloatValue), map2));
                    r1.k = wu.R0(map2.keySet()).floatValue();
                    r1.l = wu.Q0(map2.keySet()).floatValue();
                    return sd5.a;
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fFloatValue = lPt8.B;
                map2 = lPt8.A;
                r0 = lPt8.z;
                try {
                    C0239D.H(obj);
                    r1 = r0;
                    r1.d(t92.P(new Float(fFloatValue), map2));
                    r1.k = wu.R0(map2.keySet()).floatValue();
                    r1.l = wu.Q0(map2.keySet()).floatValue();
                } catch (Throwable th3) {
                    th = th3;
                    r0.d(t92.P(new Float(fFloatValue), map2));
                    r0.k = wu.R0(map2.keySet()).floatValue();
                    r0.l = wu.Q0(map2.keySet()).floatValue();
                    throw th;
                }
            }
        }
        return sd5.a;
    }

    public final void d(T t) {
        this.c.setValue(t);
    }
}
