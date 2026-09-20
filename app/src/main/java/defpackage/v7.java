package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class v7<Inputs, Events, State> implements s7<Inputs, Events, State>, u7<Inputs, Events, State> {
    public final u7<Inputs, Events, State> a;
    public ua0 b;
    public boolean c;
    public boolean d;
    public h81<? extends s7<Inputs, Events, State>> e;
    public final jo<ph3<Inputs, Events, State>> f;
    public final kotlinx.coroutines.flow.QnHx g = FWT.o(a());
    public final kotlinx.coroutines.flow.QnHx h = FWT.o(a());
    public final NUlFixed i;
    public final NUlFixed j;
    public final nj4 k;
    public final LinkedHashMap l;
    public final c8 m;

    public static final class CQf extends cx1 implements j81<Throwable, sd5> {
        public final /* synthetic */ v7<Inputs, Events, State> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(v7<Inputs, Events, State> v7Var) {
            super(1);
            this.w = v7Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(Throwable th) {
            v7<Inputs, Events, State> v7Var = this.w;
            nj4 nj4Var = v7Var.k;
            h81<? extends s7<Inputs, Events, State>> h81Var = v7Var.e;
            if (h81Var != null) {
                nj4Var.e(new n7.NUlFixed(h81Var.invoke()));
                return sd5.a;
            }
            ur1.e("host");
            throw null;
        }
    }

    @if0(c = "com.copperleaf.ballast.internal.BallastViewModelImpl$attachEventHandler$3", f = "BallastViewModelImpl.kt", l = {}, m = "invokeSuspend")
    public static final class F1 extends px4 implements x81<ua0, z80<? super ms1>, Object> {
        public /* synthetic */ Object A;
        public final /* synthetic */ v7<Inputs, Events, State> B;
        public final /* synthetic */ bu0<Inputs, Events, State> C;

        @if0(c = "com.copperleaf.ballast.internal.BallastViewModelImpl$attachEventHandler$3$1", f = "BallastViewModelImpl.kt", l = {123}, m = "invokeSuspend")
        public static final class QnHx extends px4 implements x81<Events, z80<? super sd5>, Object> {
            public int A;
            public /* synthetic */ Object B;
            public final /* synthetic */ v7<Inputs, Events, State> C;
            public final /* synthetic */ bu0<Inputs, Events, State> D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public QnHx(v7<Inputs, Events, State> v7Var, bu0<Inputs, Events, State> bu0Var, z80<? super QnHx> z80Var) {
                super(2, z80Var);
                this.C = v7Var;
                this.D = bu0Var;
            }

            @Override // defpackage.m8
            public final z80<sd5> a(Object obj, z80<?> z80Var) {
                QnHx qnHx = new QnHx(this.C, this.D, z80Var);
                qnHx.B = obj;
                return qnHx;
            }

            @Override // defpackage.m8
            public final Object i(Object obj) throws Throwable {
                va0 va0Var = va0.COROUTINE_SUSPENDED;
                int i = this.A;
                if (i == 0) {
                    C0239D.H(obj);
                    Object obj2 = this.B;
                    this.A = 1;
                    if (v7.k(this.D, this.C, obj2, this) == va0Var) {
                        return va0Var;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C0239D.H(obj);
                }
                return sd5.a;
            }

            @Override // defpackage.x81
            public final Object invoke(Object obj, z80<? super sd5> z80Var) {
                return ((QnHx) a(obj, z80Var)).i(sd5.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(v7<Inputs, Events, State> v7Var, bu0<Inputs, Events, State> bu0Var, z80<? super F1> z80Var) {
            super(2, z80Var);
            this.B = v7Var;
            this.C = bu0Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            F1 f1 = new F1(this.B, this.C, z80Var);
            f1.A = obj;
            return f1;
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            C0239D.H(obj);
            ua0 ua0Var = (ua0) this.A;
            v7<Inputs, Events, State> v7Var = this.B;
            return kd.r(kd.o(new r01(new QnHx(v7Var, this.C, null), kd.t(v7Var.i)), v7Var.g()), ua0Var);
        }

        @Override // defpackage.x81
        public final Object invoke(ua0 ua0Var, z80<? super ms1> z80Var) {
            return ((F1) a(ua0Var, z80Var)).i(sd5.a);
        }
    }

    public static final class LPt8Fixed extends cx1 implements j81<Throwable, sd5> {
        public final /* synthetic */ v7<Inputs, Events, State> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LPt8Fixed(v7<Inputs, Events, State> v7Var) {
            super(1);
            this.w = v7Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(Throwable th) {
            v7<Inputs, Events, State> v7Var = this.w;
            if (!(!v7Var.d)) {
                throw new IllegalStateException("VM is already cleared".toString());
            }
            if (!v7Var.c) {
                throw new IllegalStateException("VM is not started!".toString());
            }
            v7Var.c = false;
            v7Var.d = true;
            LinkedHashMap linkedHashMap = v7Var.l;
            for (g04 g04Var : linkedHashMap.values()) {
                ms1 ms1Var = g04Var.b;
                if (ms1Var != null) {
                    ms1Var.m(null);
                }
                g04Var.b = null;
            }
            linkedHashMap.clear();
            nj4 nj4Var = v7Var.k;
            h81<? extends s7<Inputs, Events, State>> h81Var = v7Var.e;
            if (h81Var == null) {
                ur1.e("host");
                throw null;
            }
            nj4Var.e(new n7.ck32(h81Var.invoke()));
            v7Var.f.a(null);
            v7Var.i.a(null);
            v7Var.j.a(null);
            return sd5.a;
        }
    }

    @if0(c = "com.copperleaf.ballast.internal.BallastViewModelImpl", f = "BallastViewModelImpl.kt", l = {114, 120}, m = "attachEventHandler")
    public static final class QnHx extends b90 {
        public bu0 A;
        public /* synthetic */ Object B;
        public final /* synthetic */ v7<Inputs, Events, State> C;
        public int D;
        public v7 z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(v7<Inputs, Events, State> v7Var, z80<? super QnHx> z80Var) {
            super(z80Var);
            this.C = v7Var;
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.B = obj;
            this.D |= Integer.MIN_VALUE;
            return this.C.m(null, this);
        }
    }

    public v7(gi0 gi0Var) {
        this.a = gi0Var;
        this.f = gi0Var.d.a();
        lg lgVar = lg.SUSPEND;
        this.i = AY.a(-2, lgVar, 4);
        this.j = AY.a(-2, lgVar, 4);
        this.k = OW8.c(0, Integer.MAX_VALUE, null, 5);
        this.l = new LinkedHashMap();
        this.m = new c8(this);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005d  */
    /* JADX WARN: Code duplicated, block: B:40:0x009d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object j(v7 v7Var, ph3 ph3Var, z80 z80Var) throws Throwable {
        w7 w7Var;
        do1.QnHx qnHxA;
        do1.QnHx qnHx;
        v7Var.getClass();
        if (z80Var instanceof w7) {
            w7Var = (w7) z80Var;
            int i = w7Var.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                w7Var.D = i - Integer.MIN_VALUE;
            } else {
                w7Var = new w7(v7Var, z80Var);
            }
        } else {
            w7Var = new w7(v7Var, z80Var);
        }
        Object obj = w7Var.B;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = w7Var.D;
        do1.QnHx qnHx2 = do1.QnHx.Accept;
        if (i2 == 0) {
            C0239D.H(obj);
            if (ph3Var instanceof ph3.CQf) {
                return Boolean.TRUE;
            }
            if (!(ph3Var instanceof ph3.QnHx)) {
                throw new NoWhenBranchMatchedException();
            }
            Object value = v7Var.g.getValue();
            do1<Inputs, Events, State> filter = v7Var.getFilter();
            if (filter != null) {
                Inputs inputs = ((ph3.QnHx) ph3Var).b;
                qnHxA = filter.a();
                if (qnHxA == null) {
                    qnHxA = qnHx2;
                }
            } else {
                qnHxA = qnHx2;
            }
            if (qnHxA == do1.QnHx.Reject) {
                nj4 nj4Var = v7Var.k;
                h81<? extends s7<Inputs, Events, State>> h81Var = v7Var.e;
                if (h81Var == null) {
                    ur1.e("host");
                    throw null;
                }
                n7.y yVar = new n7.y(h81Var.invoke(), value, ((ph3.QnHx) ph3Var).b);
                w7Var.z = ph3Var;
                w7Var.A = qnHxA;
                w7Var.D = 1;
                if (nj4Var.f(yVar, w7Var) == va0Var) {
                    return va0Var;
                }
                qnHx = qnHxA;
            }
            return Boolean.valueOf(qnHxA == qnHx2);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        qnHx = w7Var.A;
        ph3Var = w7Var.z;
        C0239D.H(obj);
        xw<sd5> xwVar = ((ph3.QnHx) ph3Var).a;
        if (xwVar != null) {
            xwVar.L(sd5.a);
        }
        qnHxA = qnHx;
        return Boolean.valueOf(qnHxA == qnHx2);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0094  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object k(bu0 bu0Var, v7 v7Var, Object obj, z80 z80Var) throws Throwable {
        x7 x7Var;
        Throwable th;
        Object obj2;
        nj4 nj4Var;
        n7.F1 f1;
        h81<? extends s7<Inputs, Events, State>> h81Var;
        v7Var.getClass();
        if (z80Var instanceof x7) {
            x7Var = (x7) z80Var;
            int i = x7Var.E;
            if ((i & Integer.MIN_VALUE) != 0) {
                x7Var.E = i - Integer.MIN_VALUE;
            } else {
                x7Var = new x7(v7Var, z80Var);
            }
        } else {
            x7Var = new x7(v7Var, z80Var);
        }
        Object obj3 = x7Var.C;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = x7Var.E;
        try {
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        bu0Var = x7Var.B;
                        obj = x7Var.A;
                        v7Var = x7Var.z;
                        C0239D.H(obj3);
                    } else if (i2 == 2) {
                        obj2 = x7Var.A;
                        v7Var = x7Var.z;
                        try {
                            C0239D.H(obj3);
                        } catch (Throwable th2) {
                            th = th2;
                            nj4Var = v7Var.k;
                            h81Var = v7Var.e;
                            if (h81Var != null) {
                                ur1.e("host");
                                throw null;
                            }
                            f1 = new n7.F1(h81Var.invoke(), obj2, th);
                            x7Var.z = null;
                            x7Var.A = null;
                            x7Var.B = null;
                            x7Var.E = 3;
                            if (nj4Var.f(f1, x7Var) == va0Var) {
                                return va0Var;
                            }
                        }
                    } else {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C0239D.H(obj3);
                    }
                    return sd5.a;
                }
                C0239D.H(obj3);
                nj4 nj4Var2 = v7Var.k;
                h81<? extends s7<Inputs, Events, State>> h81Var2 = v7Var.e;
                if (h81Var2 == null) {
                    ur1.e("host");
                    throw null;
                }
                n7.QnHx qnHx = new n7.QnHx(h81Var2.invoke(), obj);
                x7Var.z = v7Var;
                x7Var.A = obj;
                x7Var.B = bu0Var;
                x7Var.E = 1;
                if (nj4Var2.f(qnHx, x7Var) == va0Var) {
                    return va0Var;
                }
                y7 y7Var = new y7(bu0Var, v7Var, obj, null);
                x7Var.z = v7Var;
                x7Var.A = obj;
                x7Var.B = null;
                x7Var.E = 2;
                if (fp1.R(y7Var, x7Var) == va0Var) {
                    return va0Var;
                }
            } catch (Throwable th3) {
                Object obj4 = obj;
                th = th3;
                obj2 = obj4;
                nj4Var = v7Var.k;
                h81Var = v7Var.e;
                if (h81Var != null) {
                    ur1.e("host");
                    throw null;
                }
                f1 = new n7.F1(h81Var.invoke(), obj2, th);
                x7Var.z = null;
                x7Var.A = null;
                x7Var.B = null;
                x7Var.E = 3;
                if (nj4Var.f(f1, x7Var) == va0Var) {
                    return va0Var;
                }
            }
        } catch (CancellationException unused) {
        }
        return sd5.a;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:45:0x0103  */
    /* JADX WARN: Code duplicated, block: B:50:0x0113  */
    /* JADX WARN: Code duplicated, block: B:53:0x012d  */
    /* JADX WARN: Code duplicated, block: B:56:0x013a  */
    /* JADX WARN: Code duplicated, block: B:58:0x0141  */
    /* JADX WARN: Code duplicated, block: B:61:0x0149  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    public static final Object l(po1.QnHx qnHx, v7 v7Var, Object obj, z80 z80Var, xw xwVar) throws Throwable {
        z7 z7Var;
        po1.QnHx qnHx2;
        v7 v7Var2;
        xw xwVar2;
        Object value;
        Object obj2;
        xw xwVar3;
        v7 v7Var3;
        nj4 nj4Var;
        n7.FJCM fjcm;
        h81<? extends s7<Inputs, Events, State>> h81Var;
        xw xwVar4;
        nj4 nj4Var2;
        n7.T23 t23;
        h81<? extends s7<Inputs, Events, State>> h81Var2;
        v7 v7Var4;
        Object obj3 = obj;
        v7Var.getClass();
        if (z80Var instanceof z7) {
            z7Var = (z7) z80Var;
            int i = z7Var.F;
            if ((i & Integer.MIN_VALUE) != 0) {
                z7Var.F = i - Integer.MIN_VALUE;
            } else {
                z7Var = new z7(v7Var, z80Var);
            }
        } else {
            z7Var = new z7(v7Var, z80Var);
        }
        Object obj4 = z7Var.D;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = z7Var.F;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    po1.QnHx qnHx3 = (po1.QnHx) z7Var.C;
                    xw xwVar5 = (xw) z7Var.B;
                    Object obj5 = z7Var.A;
                    v7Var2 = (v7) z7Var.z;
                    C0239D.H(obj4);
                    qnHx2 = qnHx3;
                    xwVar2 = xwVar5;
                    obj3 = obj5;
                } else if (i2 == 2) {
                    value = z7Var.C;
                    xwVar3 = (xw) z7Var.B;
                    obj2 = z7Var.A;
                    v7Var3 = (v7) z7Var.z;
                    try {
                        C0239D.H(obj4);
                    } catch (CancellationException unused) {
                        nj4Var2 = v7Var3.k;
                        h81Var2 = v7Var3.e;
                        if (h81Var2 != null) {
                            ur1.e("host");
                            throw null;
                        }
                        t23 = new n7.T23(h81Var2.invoke(), obj2);
                        z7Var.z = v7Var3;
                        z7Var.A = xwVar3;
                        z7Var.B = value;
                        z7Var.C = null;
                        z7Var.F = 3;
                        if (nj4Var2.f(t23, z7Var) == va0Var) {
                            return va0Var;
                        }
                        v7Var4 = v7Var3;
                        if (v7Var4.a.h().c()) {
                            v7Var4.g.setValue(value);
                        }
                        if (xwVar3 != null) {
                            xwVar3.L(sd5.a);
                        }
                    } catch (Throwable th) {
                        th = th;
                        nj4Var = v7Var3.k;
                        h81Var = v7Var3.e;
                        if (h81Var != null) {
                            ur1.e("host");
                            throw null;
                        }
                        fjcm = new n7.FJCM(h81Var.invoke(), obj2, th);
                        z7Var.z = xwVar3;
                        z7Var.A = null;
                        z7Var.B = null;
                        z7Var.C = null;
                        z7Var.F = 4;
                        if (nj4Var.f(fjcm, z7Var) == va0Var) {
                            return va0Var;
                        }
                        xwVar4 = xwVar3;
                        if (xwVar4 != null) {
                            xwVar4.L(sd5.a);
                        }
                    }
                } else if (i2 == 3) {
                    value = z7Var.B;
                    xwVar3 = (xw) z7Var.A;
                    v7Var4 = (v7) z7Var.z;
                    C0239D.H(obj4);
                    if (v7Var4.a.h().c()) {
                        v7Var4.g.setValue(value);
                    }
                    if (xwVar3 != null) {
                        xwVar3.L(sd5.a);
                    }
                } else {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    xwVar4 = (xw) z7Var.z;
                    C0239D.H(obj4);
                    if (xwVar4 != null) {
                        xwVar4.L(sd5.a);
                    }
                }
                return sd5.a;
            }
            C0239D.H(obj4);
            nj4 nj4Var3 = v7Var.k;
            h81<? extends s7<Inputs, Events, State>> h81Var3 = v7Var.e;
            if (h81Var3 == null) {
                ur1.e("host");
                throw null;
            }
            n7.auxFixed auxVar = new n7.auxFixed(h81Var3.invoke(), obj3);
            z7Var.z = v7Var;
            z7Var.A = obj3;
            z7Var.B = xwVar;
            qnHx2 = qnHx;
            z7Var.C = qnHx2;
            z7Var.F = 1;
            if (nj4Var3.f(auxVar, z7Var) == va0Var) {
                return va0Var;
            }
            v7Var2 = v7Var;
            xwVar2 = xwVar;
            a8 a8Var = new a8(qnHx2, v7Var2, obj3, null, xwVar2);
            z7Var.z = v7Var2;
            z7Var.A = obj3;
            z7Var.B = xwVar2;
            z7Var.C = value;
            z7Var.F = 2;
            if (fp1.R(a8Var, z7Var) == va0Var) {
                return va0Var;
            }
        } catch (CancellationException unused2) {
            obj2 = obj3;
            xwVar3 = xwVar2;
            v7Var3 = v7Var2;
            nj4Var2 = v7Var3.k;
            h81Var2 = v7Var3.e;
            if (h81Var2 != null) {
                ur1.e("host");
                throw null;
            }
            t23 = new n7.T23(h81Var2.invoke(), obj2);
            z7Var.z = v7Var3;
            z7Var.A = xwVar3;
            z7Var.B = value;
            z7Var.C = null;
            z7Var.F = 3;
            if (nj4Var2.f(t23, z7Var) == va0Var) {
                return va0Var;
            }
            v7Var4 = v7Var3;
            if (v7Var4.a.h().c()) {
                v7Var4.g.setValue(value);
            }
            if (xwVar3 != null) {
                xwVar3.L(sd5.a);
            }
        } catch (Throwable th2) {
            th = th2;
            obj2 = obj3;
            xwVar3 = xwVar2;
            v7Var3 = v7Var2;
            nj4Var = v7Var3.k;
            h81Var = v7Var3.e;
            if (h81Var != null) {
                ur1.e("host");
                throw null;
            }
            fjcm = new n7.FJCM(h81Var.invoke(), obj2, th);
            z7Var.z = xwVar3;
            z7Var.A = null;
            z7Var.B = null;
            z7Var.C = null;
            z7Var.F = 4;
            if (nj4Var.f(fjcm, z7Var) == va0Var) {
                return va0Var;
            }
            xwVar4 = xwVar3;
            if (xwVar4 != null) {
                xwVar4.L(sd5.a);
            }
        }
        value = v7Var2.g.getValue();
        return sd5.a;
    }

    @Override // defpackage.u7
    public final State a() {
        return this.a.a();
    }

    @Override // defpackage.u7
    public final m7 b() {
        return this.a.b();
    }

    @Override // defpackage.u7
    public final oa0 c() {
        return this.a.c();
    }

    @Override // defpackage.u7
    public final List<j7<Inputs, Events, State>> d() {
        return this.a.d();
    }

    @Override // defpackage.u7
    public final oa0 e() {
        return this.a.e();
    }

    @Override // defpackage.u7
    public final oa0 f() {
        return this.a.f();
    }

    @Override // defpackage.u7
    public final oa0 g() {
        return this.a.g();
    }

    @Override // defpackage.u7
    public final do1<Inputs, Events, State> getFilter() {
        return this.a.getFilter();
    }

    @Override // defpackage.s7
    public final String getName() {
        return this.a.getName();
    }

    @Override // defpackage.s7
    public final String getType() {
        return "BallastViewModelImpl";
    }

    @Override // defpackage.u7
    public final po1<Inputs, Events, State> h() {
        return this.a.h();
    }

    @Override // defpackage.u7
    public final eo1<Inputs, Events, State> i() {
        return this.a.i();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(bu0<Inputs, Events, State> bu0Var, z80<? super sd5> z80Var) throws Throwable {
        QnHx qnHx;
        v7<Inputs, Events, State> v7Var;
        if (z80Var instanceof QnHx) {
            qnHx = (QnHx) z80Var;
            int i = qnHx.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                qnHx.D = i - Integer.MIN_VALUE;
            } else {
                qnHx = new QnHx(this, z80Var);
            }
        } else {
            qnHx = new QnHx(this, z80Var);
        }
        Object obj = qnHx.B;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = qnHx.D;
        if (i2 != 0) {
            if (i2 == 1) {
                bu0Var = qnHx.A;
                v7Var = qnHx.z;
                C0239D.H(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
            return sd5.a;
        }
        C0239D.H(obj);
        nj4 nj4Var = this.k;
        h81<? extends s7<Inputs, Events, State>> h81Var = this.e;
        if (h81Var == null) {
            ur1.e("host");
            throw null;
        }
        n7.LPt8Fixed lPt8 = new n7.LPt8Fixed(h81Var.invoke());
        qnHx.z = this;
        qnHx.A = bu0Var;
        qnHx.D = 1;
        if (nj4Var.f(lPt8, qnHx) == va0Var) {
            return va0Var;
        }
        v7Var = this;
        AY.B(qnHx.x).r0(new CQf(v7Var));
        c8 c8Var = v7Var.m;
        F1 f1 = new F1(v7Var, bu0Var, null);
        qnHx.z = null;
        qnHx.A = null;
        qnHx.D = 2;
        if (fp1.D0(c8Var, f1, qnHx) == va0Var) {
            return va0Var;
        }
        return sd5.a;
    }

    public final ua0 n() {
        ua0 ua0Var = this.b;
        if (ua0Var != null) {
            return ua0Var;
        }
        ur1.e("viewModelScope");
        throw null;
    }

    public final ii3 o() {
        if (!(!this.d)) {
            throw new IllegalStateException("VM is cleared!".toString());
        }
        if (this.c) {
            return new ii3(this.h, null);
        }
        throw new IllegalStateException("VM is not started!".toString());
    }

    public final void p(ua0 ua0Var, h81<? extends s7<Inputs, Events, State>> h81Var) {
        if (!(!this.d)) {
            throw new IllegalStateException("VM is cleared, it cannot be restarted".toString());
        }
        if (!(!this.c)) {
            throw new IllegalStateException("VM is already started".toString());
        }
        this.c = true;
        this.e = h81Var;
        c8 c8Var = this.m;
        this.b = fp1.q0(ua0Var, c8Var);
        fp1.k0(n(), null, 0, new d8(this, null), 3);
        fp1.k0(n(), null, 0, new f8(this, null), 3);
        fp1.k0(n(), null, 0, new g8(this, null), 3);
        Iterator<T> it = d().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            nj4 nj4Var = this.k;
            if (!zHasNext) {
                h81<? extends s7<Inputs, Events, State>> h81Var2 = this.e;
                if (h81Var2 == null) {
                    ur1.e("host");
                    throw null;
                }
                nj4Var.e(new n7.SjP(h81Var2.invoke()));
                AY.B(n().g()).r0(new LPt8Fixed(this));
                return;
            }
            j7 j7Var = (j7) it.next();
            d24 d24Var = new d24(new g01(new gi3(nj4Var), new i8(null), null));
            m7 m7VarB = b();
            h81<? extends s7<Inputs, Events, State>> h81Var3 = this.e;
            if (h81Var3 == null) {
                ur1.e("host");
                throw null;
            }
            j7Var.a(new l7(m7VarB, h81Var3.invoke().getName(), fp1.q0(fp1.q0(n(), c8Var), f()), new h8(this, null)), d24Var);
        }
    }

    public final Object q(Inputs inputs) {
        if (!this.c) {
            throw new IllegalStateException("VM is not started!".toString());
        }
        nj4 nj4Var = this.k;
        h81<? extends s7<Inputs, Events, State>> h81Var = this.e;
        if (h81Var == null) {
            ur1.e("host");
            throw null;
        }
        nj4Var.e(new n7.PRnFixed(h81Var.invoke(), inputs));
        Object objH = this.f.H(new ph3.QnHx(inputs));
        if ((objH instanceof ap.CQf) || (objH instanceof ap.QnHx)) {
            h81<? extends s7<Inputs, Events, State>> h81Var2 = this.e;
            if (h81Var2 == null) {
                ur1.e("host");
                throw null;
            }
            nj4Var.e(new n7.byN(h81Var2.invoke(), inputs));
        }
        return objH;
    }
}
