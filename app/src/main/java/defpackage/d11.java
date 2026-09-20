package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class d11<T, R> extends MZ<T, R> {
    public final int A;
    public final i91<? super T, ? extends sg3<? extends R>> y;
    public final int z;

    public static final class CQf<T, R> extends QnHx<T, R> {
        public final gw4<? super R> I;
        public final boolean J;

        public CQf(gw4<? super R> gw4Var, i91<? super T, ? extends sg3<? extends R>> i91Var, int i, boolean z) {
            super(i91Var, i);
            this.I = gw4Var;
            this.J = z;
        }

        @Override // defpackage.mw4
        public final void a(long j) {
            this.w.a(j);
        }

        @Override // d11.NUlFixed
        public final void c(R r) {
            this.I.g(r);
        }

        @Override // defpackage.mw4
        public final void cancel() {
            if (this.E) {
                return;
            }
            this.E = true;
            this.w.cancel();
            this.A.cancel();
        }

        @Override // d11.NUlFixed
        public final void e(Throwable th) {
            s sVar = this.F;
            sVar.getClass();
            if (!uu0.a(sVar, th)) {
                m14.b(th);
                return;
            }
            if (!this.J) {
                this.A.cancel();
                this.D = true;
            }
            this.G = false;
            f();
        }

        @Override // d11.QnHx
        public final void f() {
            Object objCall;
            if (getAndIncrement() == 0) {
                while (!this.E) {
                    if (!this.G) {
                        boolean z = this.D;
                        if (z && !this.J && this.F.get() != null) {
                            gw4<? super R> gw4Var = this.I;
                            s sVar = this.F;
                            sVar.getClass();
                            gw4Var.onError(uu0.b(sVar));
                            return;
                        }
                        try {
                            T tPoll = this.C.poll();
                            boolean z2 = tPoll == null;
                            if (z && z2) {
                                s sVar2 = this.F;
                                sVar2.getClass();
                                Throwable thB = uu0.b(sVar2);
                                if (thB != null) {
                                    this.I.onError(thB);
                                    return;
                                } else {
                                    this.I.b();
                                    return;
                                }
                            }
                            if (!z2) {
                                try {
                                    sg3<? extends R> sg3VarApply = this.x.apply(tPoll);
                                    mq2.b(sg3VarApply, "The mapper returned a null Publisher");
                                    sg3<? extends R> sg3Var = sg3VarApply;
                                    if (this.H != 1) {
                                        int i = this.B + 1;
                                        if (i == this.z) {
                                            this.B = 0;
                                            this.A.a(i);
                                        } else {
                                            this.B = i;
                                        }
                                    }
                                    if (sg3Var instanceof Callable) {
                                        try {
                                            objCall = ((Callable) sg3Var).call();
                                        } catch (Throwable th) {
                                            XTd3.w(th);
                                            s sVar3 = this.F;
                                            sVar3.getClass();
                                            uu0.a(sVar3, th);
                                            if (!this.J) {
                                                this.A.cancel();
                                                gw4<? super R> gw4Var2 = this.I;
                                                s sVar4 = this.F;
                                                sVar4.getClass();
                                                gw4Var2.onError(uu0.b(sVar4));
                                                return;
                                            }
                                            objCall = null;
                                        }
                                        if (objCall == null) {
                                            continue;
                                        } else if (this.w.D) {
                                            this.I.g(objCall);
                                        } else {
                                            this.G = true;
                                            this.w.h(new YKK(objCall, this.w));
                                        }
                                    } else {
                                        this.G = true;
                                        sg3Var.a(this.w);
                                    }
                                } catch (Throwable th2) {
                                    XTd3.w(th2);
                                    this.A.cancel();
                                    s sVar5 = this.F;
                                    sVar5.getClass();
                                    uu0.a(sVar5, th2);
                                    gw4<? super R> gw4Var3 = this.I;
                                    s sVar6 = this.F;
                                    sVar6.getClass();
                                    gw4Var3.onError(uu0.b(sVar6));
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            XTd3.w(th3);
                            this.A.cancel();
                            s sVar7 = this.F;
                            sVar7.getClass();
                            uu0.a(sVar7, th3);
                            gw4<? super R> gw4Var4 = this.I;
                            s sVar8 = this.F;
                            sVar8.getClass();
                            gw4Var4.onError(uu0.b(sVar8));
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // d11.QnHx
        public final void h() {
            this.I.d(this);
        }

        @Override // defpackage.gw4
        public final void onError(Throwable th) {
            s sVar = this.F;
            sVar.getClass();
            if (!uu0.a(sVar, th)) {
                m14.b(th);
            } else {
                this.D = true;
                f();
            }
        }
    }

    public static final class F1<T, R> extends QnHx<T, R> {
        public final gw4<? super R> I;
        public final AtomicInteger J;

        public F1(gw4<? super R> gw4Var, i91<? super T, ? extends sg3<? extends R>> i91Var, int i) {
            super(i91Var, i);
            this.I = gw4Var;
            this.J = new AtomicInteger();
        }

        @Override // defpackage.mw4
        public final void a(long j) {
            this.w.a(j);
        }

        @Override // d11.NUlFixed
        public final void c(R r) {
            if (get() == 0 && compareAndSet(0, 1)) {
                gw4<? super R> gw4Var = this.I;
                gw4Var.g(r);
                if (compareAndSet(1, 0)) {
                    return;
                }
                s sVar = this.F;
                sVar.getClass();
                gw4Var.onError(uu0.b(sVar));
            }
        }

        @Override // defpackage.mw4
        public final void cancel() {
            if (this.E) {
                return;
            }
            this.E = true;
            this.w.cancel();
            this.A.cancel();
        }

        @Override // d11.NUlFixed
        public final void e(Throwable th) {
            s sVar = this.F;
            sVar.getClass();
            if (!uu0.a(sVar, th)) {
                m14.b(th);
                return;
            }
            this.A.cancel();
            if (getAndIncrement() == 0) {
                sVar.getClass();
                this.I.onError(uu0.b(sVar));
            }
        }

        @Override // d11.QnHx
        public final void f() {
            if (this.J.getAndIncrement() == 0) {
                while (!this.E) {
                    if (!this.G) {
                        boolean z = this.D;
                        try {
                            T tPoll = this.C.poll();
                            boolean z2 = tPoll == null;
                            if (z && z2) {
                                this.I.b();
                                return;
                            }
                            if (!z2) {
                                try {
                                    sg3<? extends R> sg3VarApply = this.x.apply(tPoll);
                                    mq2.b(sg3VarApply, "The mapper returned a null Publisher");
                                    sg3<? extends R> sg3Var = sg3VarApply;
                                    if (this.H != 1) {
                                        int i = this.B + 1;
                                        if (i == this.z) {
                                            this.B = 0;
                                            this.A.a(i);
                                        } else {
                                            this.B = i;
                                        }
                                    }
                                    if (sg3Var instanceof Callable) {
                                        try {
                                            Object objCall = ((Callable) sg3Var).call();
                                            if (objCall == null) {
                                                continue;
                                            } else if (!this.w.D) {
                                                this.G = true;
                                                this.w.h(new YKK(objCall, this.w));
                                            } else if (get() == 0 && compareAndSet(0, 1)) {
                                                this.I.g(objCall);
                                                if (!compareAndSet(1, 0)) {
                                                    gw4<? super R> gw4Var = this.I;
                                                    s sVar = this.F;
                                                    sVar.getClass();
                                                    gw4Var.onError(uu0.b(sVar));
                                                    return;
                                                }
                                            }
                                        } catch (Throwable th) {
                                            XTd3.w(th);
                                            this.A.cancel();
                                            s sVar2 = this.F;
                                            sVar2.getClass();
                                            uu0.a(sVar2, th);
                                            gw4<? super R> gw4Var2 = this.I;
                                            s sVar3 = this.F;
                                            sVar3.getClass();
                                            gw4Var2.onError(uu0.b(sVar3));
                                            return;
                                        }
                                    } else {
                                        this.G = true;
                                        sg3Var.a(this.w);
                                    }
                                } catch (Throwable th2) {
                                    XTd3.w(th2);
                                    this.A.cancel();
                                    s sVar4 = this.F;
                                    sVar4.getClass();
                                    uu0.a(sVar4, th2);
                                    gw4<? super R> gw4Var3 = this.I;
                                    s sVar5 = this.F;
                                    sVar5.getClass();
                                    gw4Var3.onError(uu0.b(sVar5));
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            XTd3.w(th3);
                            this.A.cancel();
                            s sVar6 = this.F;
                            sVar6.getClass();
                            uu0.a(sVar6, th3);
                            gw4<? super R> gw4Var4 = this.I;
                            s sVar7 = this.F;
                            sVar7.getClass();
                            gw4Var4.onError(uu0.b(sVar7));
                            return;
                        }
                    }
                    if (this.J.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // d11.QnHx
        public final void h() {
            this.I.d(this);
        }

        @Override // defpackage.gw4
        public final void onError(Throwable th) {
            s sVar = this.F;
            sVar.getClass();
            if (!uu0.a(sVar, th)) {
                m14.b(th);
                return;
            }
            this.w.cancel();
            if (getAndIncrement() == 0) {
                sVar.getClass();
                this.I.onError(uu0.b(sVar));
            }
        }
    }

    public static final class LPt8Fixed<R> extends nw4 implements v11<R> {
        public final NUlFixed<R> E;
        public long F;

        public LPt8Fixed(NUlFixed<R> nUl) {
            this.E = nUl;
        }

        @Override // defpackage.gw4
        public final void b() {
            long j = this.F;
            if (j != 0) {
                this.F = 0L;
                f(j);
            }
            QnHx qnHx = (QnHx) this.E;
            qnHx.G = false;
            qnHx.f();
        }

        @Override // defpackage.v11, defpackage.gw4
        public final void d(mw4 mw4Var) {
            h(mw4Var);
        }

        @Override // defpackage.gw4
        public final void g(R r) {
            this.F++;
            this.E.c(r);
        }

        @Override // defpackage.gw4
        public final void onError(Throwable th) {
            long j = this.F;
            if (j != 0) {
                this.F = 0L;
                f(j);
            }
            this.E.e(th);
        }
    }

    public interface NUlFixed<T> {
        void c(T t);

        void e(Throwable th);
    }

    public static abstract class QnHx<T, R> extends AtomicInteger implements v11<T>, NUlFixed<R>, mw4 {
        public mw4 A;
        public int B;
        public uk4<T> C;
        public volatile boolean D;
        public volatile boolean E;
        public volatile boolean G;
        public int H;
        public final i91<? super T, ? extends sg3<? extends R>> x;
        public final int y;
        public final int z;
        public final LPt8Fixed<R> w = new LPt8Fixed<>(this);
        public final s F = new s();

        public QnHx(i91<? super T, ? extends sg3<? extends R>> i91Var, int i) {
            this.x = i91Var;
            this.y = i;
            this.z = i - (i >> 2);
        }

        @Override // defpackage.gw4
        public final void b() {
            this.D = true;
            f();
        }

        @Override // defpackage.v11, defpackage.gw4
        public final void d(mw4 mw4Var) {
            if (qw4.m(this.A, mw4Var)) {
                this.A = mw4Var;
                if (mw4Var instanceof oh3) {
                    oh3 oh3Var = (oh3) mw4Var;
                    int iL = oh3Var.l(7);
                    if (iL == 1) {
                        this.H = iL;
                        this.C = oh3Var;
                        this.D = true;
                        h();
                        f();
                        return;
                    }
                    if (iL == 2) {
                        this.H = iL;
                        this.C = oh3Var;
                        h();
                        mw4Var.a(this.y);
                        return;
                    }
                }
                this.C = new ir4(this.y);
                h();
                mw4Var.a(this.y);
            }
        }

        public abstract void f();

        @Override // defpackage.gw4
        public final void g(T t) {
            if (this.H == 2 || this.C.offer(t)) {
                f();
            } else {
                this.A.cancel();
                onError(new IllegalStateException("Queue full?!"));
            }
        }

        public abstract void h();
    }

    public static final class YKK<T> extends AtomicBoolean implements mw4 {
        public final gw4<? super T> w;
        public final T x;

        /* JADX WARN: Multi-variable type inference failed */
        public YKK(Object obj, LPt8Fixed lPt8) {
            this.x = obj;
            this.w = lPt8;
        }

        @Override // defpackage.mw4
        public final void a(long j) {
            if (j <= 0 || !compareAndSet(false, true)) {
                return;
            }
            T t = this.x;
            gw4<? super T> gw4Var = this.w;
            gw4Var.g(t);
            gw4Var.b();
        }

        @Override // defpackage.mw4
        public final void cancel() {
        }
    }

    public d11(a11 a11Var, i91 i91Var) {
        super(a11Var);
        this.y = i91Var;
        this.z = 2;
        this.A = 1;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.a11
    public final void f(gw4<? super R> gw4Var) {
        boolean z;
        gw4<? super T> cQf;
        js0 js0Var = js0.INSTANCE;
        a11<T> a11Var = this.x;
        boolean z2 = a11Var instanceof Callable;
        i91<? super T, ? extends sg3<? extends R>> i91Var = this.y;
        if (z2) {
            try {
                A$Y4 a$y4 = (Object) ((Callable) a11Var).call();
                if (a$y4 == null) {
                    gw4Var.d(js0Var);
                    gw4Var.b();
                } else {
                    try {
                        sg3<? extends R> sg3VarApply = i91Var.apply(a$y4);
                        mq2.b(sg3VarApply, "The mapper returned a null Publisher");
                        sg3<? extends R> sg3Var = sg3VarApply;
                        if (sg3Var instanceof Callable) {
                            try {
                                Object objCall = ((Callable) sg3Var).call();
                                if (objCall == null) {
                                    gw4Var.d(js0Var);
                                    gw4Var.b();
                                } else {
                                    gw4Var.d(new t34(objCall, gw4Var));
                                }
                            } catch (Throwable th) {
                                XTd3.w(th);
                                gw4Var.d(js0Var);
                                gw4Var.onError(th);
                            }
                        } else {
                            sg3Var.a(gw4Var);
                        }
                    } catch (Throwable th2) {
                        XTd3.w(th2);
                        gw4Var.d(js0Var);
                        gw4Var.onError(th2);
                    }
                }
            } catch (Throwable th3) {
                XTd3.w(th3);
                gw4Var.d(js0Var);
                gw4Var.onError(th3);
            }
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        int iH = O.h(this.A);
        int i = this.z;
        if (iH != 1) {
            cQf = iH != 2 ? new F1<>(gw4Var, i91Var, i) : new CQf<>(gw4Var, i91Var, i, true);
        } else {
            cQf = new CQf<>(gw4Var, i91Var, i, false);
        }
        a11Var.a(cQf);
    }
}
