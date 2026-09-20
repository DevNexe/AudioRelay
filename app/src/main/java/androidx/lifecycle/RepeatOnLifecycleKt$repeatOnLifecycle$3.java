package androidx.lifecycle;

import defpackage.C0239D;
import defpackage.bj2;
import defpackage.d32;
import defpackage.fp1;
import defpackage.if0;
import defpackage.j72;
import defpackage.jl3;
import defpackage.ms1;
import defpackage.n72;
import defpackage.ps0;
import defpackage.px4;
import defpackage.qh0;
import defpackage.rl0;
import defpackage.sd5;
import defpackage.ua0;
import defpackage.va0;
import defpackage.x81;
import defpackage.xm;
import defpackage.z80;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", l = {84}, m = "invokeSuspend")
public final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ YKK C;
    public final /* synthetic */ YKK.F1 D;
    public final /* synthetic */ x81<ua0, z80<? super sd5>, Object> E;

    /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1, reason: invalid class name */
    @if0(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", l = {166}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
        public jl3 A;
        public jl3 B;
        public ua0 C;
        public x81 D;
        public int E;
        public final /* synthetic */ YKK F;
        public final /* synthetic */ YKK.F1 G;
        public final /* synthetic */ ua0 H;
        public final /* synthetic */ x81<ua0, z80<? super sd5>, Object> I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(YKK ykk, YKK.F1 f1, ua0 ua0Var, x81<? super ua0, ? super z80<? super sd5>, ? extends Object> x81Var, z80<? super AnonymousClass1> z80Var) {
            super(2, z80Var);
            this.F = ykk;
            this.G = f1;
            this.H = ua0Var;
            this.I = x81Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            return new AnonymousClass1(this.F, this.G, this.H, this.I, z80Var);
        }

        /* JADX WARN: Code duplicated, block: B:39:0x00a6  */
        /* JADX WARN: Code duplicated, block: B:42:0x00b0  */
        /* JADX WARN: Code duplicated, block: B:49:0x00bf  */
        /* JADX WARN: Code duplicated, block: B:52:0x00c9  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r15v0, types: [T, androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1, c32] */
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
        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            jl3 jl3Var;
            jl3 jl3Var2;
            YKK.CQf cQf;
            YKK.CQf cQf2;
            ms1 ms1Var;
            auxFixed auxVar;
            ms1 ms1Var2;
            auxFixed auxVar2;
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.E;
            YKK ykk = this.F;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jl3Var2 = this.B;
                jl3Var = this.A;
                try {
                    C0239D.H(obj);
                    ms1Var2 = (ms1) jl3Var.w;
                    if (ms1Var2 != null) {
                        ms1Var2.m(null);
                    }
                    auxVar2 = (auxFixed) jl3Var2.w;
                    if (auxVar2 != null) {
                        ykk.c(auxVar2);
                    }
                    return sd5.a;
                } catch (Throwable th) {
                    th = th;
                    ms1Var = (ms1) jl3Var.w;
                    if (ms1Var != null) {
                        ms1Var.m(null);
                    }
                    auxVar = (auxFixed) jl3Var2.w;
                    if (auxVar != null) {
                        ykk.c(auxVar);
                    }
                    throw th;
                }
            }
            C0239D.H(obj);
            if (ykk.b() == YKK.F1.DESTROYED) {
                return sd5.a;
            }
            final jl3 jl3Var3 = new jl3();
            jl3 jl3Var4 = new jl3();
            try {
                YKK.F1 f1 = this.G;
                final ua0 ua0Var = this.H;
                final x81<ua0, z80<? super sd5>, Object> x81Var = this.I;
                this.A = jl3Var3;
                this.B = jl3Var4;
                this.C = ua0Var;
                this.D = x81Var;
                this.E = 1;
                final xm xmVar = new xm(1, ps0.L(this));
                xmVar.r();
                int iOrdinal = f1.ordinal();
                if (iOrdinal == 2) {
                    cQf = YKK.CQf.ON_CREATE;
                } else if (iOrdinal != 3) {
                    cQf = iOrdinal != 4 ? null : YKK.CQf.ON_RESUME;
                } else {
                    cQf = YKK.CQf.ON_START;
                }
                final YKK.CQf cQf3 = cQf;
                int iOrdinal2 = f1.ordinal();
                if (iOrdinal2 == 2) {
                    cQf2 = YKK.CQf.ON_DESTROY;
                } else if (iOrdinal2 != 3) {
                    cQf2 = iOrdinal2 != 4 ? null : YKK.CQf.ON_PAUSE;
                } else {
                    cQf2 = YKK.CQf.ON_STOP;
                }
                final YKK.CQf cQf4 = cQf2;
                final kotlinx.coroutines.sync.QnHx qnHx = new kotlinx.coroutines.sync.QnHx(false);
                ?? r15 = new auxFixed() { // from class: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1

                    @if0(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {171, 110}, m = "invokeSuspend")
                    public static final class QnHx extends px4 implements x81<ua0, z80<? super sd5>, Object> {
                        public bj2 A;
                        public x81 B;
                        public int C;
                        public final /* synthetic */ bj2 D;
                        public final /* synthetic */ x81<ua0, z80<? super sd5>, Object> E;

                        /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$QnHx$QnHx, reason: collision with other inner class name */
                        @if0(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {111}, m = "invokeSuspend")
                        public static final class C0026QnHx extends px4 implements x81<ua0, z80<? super sd5>, Object> {
                            public int A;
                            public /* synthetic */ Object B;
                            public final /* synthetic */ x81<ua0, z80<? super sd5>, Object> C;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            public C0026QnHx(x81<? super ua0, ? super z80<? super sd5>, ? extends Object> x81Var, z80<? super C0026QnHx> z80Var) {
                                super(2, z80Var);
                                this.C = x81Var;
                            }

                            @Override // defpackage.m8
                            public final z80<sd5> a(Object obj, z80<?> z80Var) {
                                C0026QnHx c0026QnHx = new C0026QnHx(this.C, z80Var);
                                c0026QnHx.B = obj;
                                return c0026QnHx;
                            }

                            @Override // defpackage.m8
                            public final Object i(Object obj) throws Throwable {
                                va0 va0Var = va0.COROUTINE_SUSPENDED;
                                int i = this.A;
                                if (i == 0) {
                                    C0239D.H(obj);
                                    ua0 ua0Var = (ua0) this.B;
                                    this.A = 1;
                                    if (this.C.invoke(ua0Var, this) == va0Var) {
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
                            public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
                                return ((C0026QnHx) a(ua0Var, z80Var)).i(sd5.a);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public QnHx(bj2 bj2Var, x81<? super ua0, ? super z80<? super sd5>, ? extends Object> x81Var, z80<? super QnHx> z80Var) {
                            super(2, z80Var);
                            this.D = bj2Var;
                            this.E = x81Var;
                        }

                        @Override // defpackage.m8
                        public final z80<sd5> a(Object obj, z80<?> z80Var) {
                            return new QnHx(this.D, this.E, z80Var);
                        }

                        @Override // defpackage.m8
                        public final Object i(Object obj) throws Throwable {
                            x81<ua0, z80<? super sd5>, Object> x81Var;
                            bj2 bj2Var;
                            bj2 bj2Var2;
                            va0 va0Var = va0.COROUTINE_SUSPENDED;
                            int i = this.C;
                            try {
                                if (i == 0) {
                                    C0239D.H(obj);
                                    bj2 bj2Var3 = this.D;
                                    this.A = bj2Var3;
                                    x81Var = this.E;
                                    this.B = x81Var;
                                    this.C = 1;
                                    if (bj2Var3.b(null, this) == va0Var) {
                                        return va0Var;
                                    }
                                    bj2Var = bj2Var3;
                                } else {
                                    if (i != 1) {
                                        if (i != 2) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        bj2Var2 = this.A;
                                        try {
                                            C0239D.H(obj);
                                            sd5 sd5Var = sd5.a;
                                            bj2Var2.a(null);
                                            return sd5.a;
                                        } catch (Throwable th) {
                                            th = th;
                                            bj2Var = bj2Var2;
                                            bj2Var.a(null);
                                            throw th;
                                        }
                                    }
                                    x81Var = this.B;
                                    bj2Var = this.A;
                                    C0239D.H(obj);
                                }
                                C0026QnHx c0026QnHx = new C0026QnHx(x81Var, null);
                                this.A = bj2Var;
                                this.B = null;
                                this.C = 2;
                                if (fp1.R(c0026QnHx, this) == va0Var) {
                                    return va0Var;
                                }
                                bj2Var2 = bj2Var;
                                sd5 sd5Var2 = sd5.a;
                                bj2Var2.a(null);
                                return sd5.a;
                            } catch (Throwable th2) {
                                th = th2;
                                bj2Var.a(null);
                                throw th;
                            }
                        }

                        @Override // defpackage.x81
                        public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
                            return ((QnHx) a(ua0Var, z80Var)).i(sd5.a);
                        }
                    }

                    /* JADX WARN: Type inference failed for: r5v8, types: [T, qr4] */
                    @Override // androidx.lifecycle.auxFixed
                    public final void h(d32 d32Var, YKK.CQf cQf5) {
                        YKK.CQf cQf6 = cQf3;
                        jl3<ms1> jl3Var5 = jl3Var3;
                        if (cQf5 == cQf6) {
                            jl3Var5.w = fp1.k0(ua0Var, null, 0, new QnHx(qnHx, x81Var, null), 3);
                            return;
                        }
                        if (cQf5 == cQf4) {
                            ms1 ms1Var3 = jl3Var5.w;
                            if (ms1Var3 != null) {
                                ms1Var3.m(null);
                            }
                            jl3Var5.w = null;
                        }
                        if (cQf5 == YKK.CQf.ON_DESTROY) {
                            xmVar.x(sd5.a);
                        }
                    }
                };
                jl3Var4.w = r15;
                ykk.a(r15);
                if (xmVar.p() == va0Var) {
                    return va0Var;
                }
                jl3Var = jl3Var3;
                jl3Var2 = jl3Var4;
                ms1Var2 = (ms1) jl3Var.w;
                if (ms1Var2 != null) {
                    ms1Var2.m(null);
                }
                auxVar2 = (auxFixed) jl3Var2.w;
                if (auxVar2 != null) {
                    ykk.c(auxVar2);
                }
                return sd5.a;
            } catch (Throwable th2) {
                th = th2;
                jl3Var = jl3Var3;
                jl3Var2 = jl3Var4;
                ms1Var = (ms1) jl3Var.w;
                if (ms1Var != null) {
                    ms1Var.m(null);
                }
                auxVar = (auxFixed) jl3Var2.w;
                if (auxVar != null) {
                    ykk.c(auxVar);
                }
                throw th;
            }
        }

        @Override // defpackage.x81
        public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
            return ((AnonymousClass1) a(ua0Var, z80Var)).i(sd5.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3(YKK ykk, YKK.F1 f1, x81<? super ua0, ? super z80<? super sd5>, ? extends Object> x81Var, z80<? super RepeatOnLifecycleKt$repeatOnLifecycle$3> z80Var) {
        super(2, z80Var);
        this.C = ykk;
        this.D = f1;
        this.E = x81Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.C, this.D, this.E, z80Var);
        repeatOnLifecycleKt$repeatOnLifecycle$3.B = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            ua0 ua0Var = (ua0) this.B;
            qh0 qh0Var = rl0.a;
            j72 j72VarI = n72.a.I();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.C, this.D, ua0Var, this.E, null);
            this.A = 1;
            if (fp1.D0(j72VarI, anonymousClass1, this) == va0Var) {
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
    public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3) a(ua0Var, z80Var)).i(sd5.a);
    }
}
