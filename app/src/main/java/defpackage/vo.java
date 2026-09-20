package defpackage;

import kotlinx.coroutines.flow.internal.ChildCancelledException;

/* JADX INFO: loaded from: classes3.dex */
public final class vo<T, R> extends so<T, R> {
    public final y81<nz0<? super R>, T, z80<? super sd5>, Object> A;

    @if0(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", l = {27}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<ua0, z80<? super sd5>, Object> {
        public int A;
        public /* synthetic */ Object B;
        public final /* synthetic */ vo<T, R> C;
        public final /* synthetic */ nz0<R> D;

        /* JADX INFO: renamed from: vo$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0213QnHx<T> implements nz0 {
            public final /* synthetic */ jl3<ms1> w;
            public final /* synthetic */ ua0 x;
            public final /* synthetic */ vo<T, R> y;
            public final /* synthetic */ nz0<R> z;

            /* JADX INFO: renamed from: vo$QnHx$QnHx$CQf */
            @if0(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", f = "Merge.kt", l = {30}, m = "emit")
            public static final class CQf extends b90 {
                public Object A;
                public ms1 B;
                public /* synthetic */ Object C;
                public final /* synthetic */ C0213QnHx<T> D;
                public int E;
                public C0213QnHx z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public CQf(C0213QnHx<? super T> c0213QnHx, z80<? super CQf> z80Var) {
                    super(z80Var);
                    this.D = c0213QnHx;
                }

                @Override // defpackage.m8
                public final Object i(Object obj) {
                    this.C = obj;
                    this.E |= Integer.MIN_VALUE;
                    return this.D.f(null, this);
                }
            }

            /* JADX INFO: renamed from: vo$QnHx$QnHx$QnHx, reason: collision with other inner class name */
            @if0(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", l = {34}, m = "invokeSuspend")
            public static final class C0214QnHx extends px4 implements x81<ua0, z80<? super sd5>, Object> {
                public int A;
                public final /* synthetic */ vo<T, R> B;
                public final /* synthetic */ nz0<R> C;
                public final /* synthetic */ T D;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0214QnHx(vo<T, R> voVar, nz0<? super R> nz0Var, T t, z80<? super C0214QnHx> z80Var) {
                    super(2, z80Var);
                    this.B = voVar;
                    this.C = nz0Var;
                    this.D = t;
                }

                @Override // defpackage.m8
                public final z80<sd5> a(Object obj, z80<?> z80Var) {
                    return new C0214QnHx(this.B, this.C, this.D, z80Var);
                }

                /* JADX WARN: Type inference incomplete: some casts might be missing */
                /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                    jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to vo$QnHx$QnHx$QnHx for r3v1 'this'  java.lang.Object
                    	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                    	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                    	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                    	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                    	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                    */
                @Override // defpackage.m8
                public final java.lang.Object i(java.lang.Object r4) {
                    /*
                        r3 = this;
                        va0 r0 = defpackage.va0.COROUTINE_SUSPENDED
                        int r1 = r3.A
                        r2 = 1
                        if (r1 == 0) goto L15
                        if (r1 != r2) goto Ld
                        defpackage.C0239D.H(r4)
                        goto L29
                    Ld:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r0)
                        throw r4
                    L15:
                        defpackage.C0239D.H(r4)
                        vo<T, R> r4 = r3.B
                        y81<nz0<? super R>, T, z80<? super sd5>, java.lang.Object> r4 = r4.A
                        r3.A = r2
                        nz0<R> r1 = r3.C
                        T r2 = r3.D
                        java.lang.Object r4 = r4.invoke(r1, r2, r3)
                        if (r4 != r0) goto L29
                        return r0
                    L29:
                        sd5 r4 = defpackage.sd5.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: vo.QnHx.C0213QnHx.C0214QnHx.i(java.lang.Object):java.lang.Object");
                }

                @Override // defpackage.x81
                public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
                    return ((C0214QnHx) a(ua0Var, z80Var)).i(sd5.a);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0213QnHx(jl3<ms1> jl3Var, ua0 ua0Var, vo<T, R> voVar, nz0<? super R> nz0Var) {
                this.w = jl3Var;
                this.x = ua0Var;
                this.y = voVar;
                this.z = nz0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.nz0
            public final Object f(T t, z80<? super sd5> z80Var) throws Throwable {
                CQf cQf;
                C0213QnHx<T> c0213QnHx;
                if (z80Var instanceof CQf) {
                    cQf = (CQf) z80Var;
                    int i = cQf.E;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        cQf.E = i - Integer.MIN_VALUE;
                    } else {
                        cQf = new CQf(this, z80Var);
                    }
                } else {
                    cQf = new CQf(this, z80Var);
                }
                Object obj = cQf.C;
                va0 va0Var = va0.COROUTINE_SUSPENDED;
                int i2 = cQf.E;
                if (i2 == 0) {
                    C0239D.H(obj);
                    ms1 ms1Var = this.w.w;
                    if (ms1Var != null) {
                        ms1Var.m(new ChildCancelledException());
                        cQf.z = this;
                        cQf.A = t;
                        cQf.B = ms1Var;
                        cQf.E = 1;
                        if (ms1Var.K(cQf) == va0Var) {
                            return va0Var;
                        }
                    }
                    c0213QnHx = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t = (T) cQf.A;
                    c0213QnHx = cQf.z;
                    C0239D.H(obj);
                }
                c0213QnHx.w.w = (T) fp1.k0(c0213QnHx.x, null, 4, new C0214QnHx(c0213QnHx.y, c0213QnHx.z, t, null), 1);
                return sd5.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(vo<T, R> voVar, nz0<? super R> nz0Var, z80<? super QnHx> z80Var) {
            super(2, z80Var);
            this.C = voVar;
            this.D = nz0Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            QnHx qnHx = new QnHx(this.C, this.D, z80Var);
            qnHx.B = obj;
            return qnHx;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type z80 to vo$QnHx for r7v1 'this'  z80
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // defpackage.m8
        public final java.lang.Object i(java.lang.Object r8) {
            /*
                r7 = this;
                va0 r0 = defpackage.va0.COROUTINE_SUSPENDED
                int r1 = r7.A
                r2 = 1
                if (r1 == 0) goto L15
                if (r1 != r2) goto Ld
                defpackage.C0239D.H(r8)
                goto L35
            Ld:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L15:
                defpackage.C0239D.H(r8)
                java.lang.Object r8 = r7.B
                ua0 r8 = (defpackage.ua0) r8
                jl3 r1 = new jl3
                r1.<init>()
                vo<T, R> r3 = r7.C
                mz0<S> r4 = r3.z
                vo$QnHx$QnHx r5 = new vo$QnHx$QnHx
                nz0<R> r6 = r7.D
                r5.<init>(r1, r8, r3, r6)
                r7.A = r2
                java.lang.Object r8 = r4.a(r5, r7)
                if (r8 != r0) goto L35
                return r0
            L35:
                sd5 r8 = defpackage.sd5.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: vo.QnHx.i(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.x81
        public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
            return ((QnHx) a(ua0Var, z80Var)).i(sd5.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public vo(y81<? super nz0<? super R>, ? super T, ? super z80<? super sd5>, ? extends Object> y81Var, mz0<? extends T> mz0Var, la0 la0Var, int i, lg lgVar) {
        super(i, la0Var, lgVar, mz0Var);
        this.A = y81Var;
    }

    @Override // defpackage.oo
    public final oo<R> i(la0 la0Var, int i, lg lgVar) {
        return new vo(this.A, this.z, la0Var, i, lgVar);
    }

    @Override // defpackage.so
    public final Object l(nz0<? super R> nz0Var, z80<? super sd5> z80Var) {
        Object objR = fp1.R(new QnHx(this, nz0Var, null), z80Var);
        return objR == va0.COROUTINE_SUSPENDED ? objR : sd5.a;
    }
}
