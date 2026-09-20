package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.copperleaf.ballast.debugger.BallastDebuggerClientConnection$connect$job$1", f = "BallastDebuggerClientConnection.kt", l = {117}, m = "invokeSuspend")
public final class s6 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public final /* synthetic */ hl3 B;
    public final /* synthetic */ k6<hf1> C;
    public final /* synthetic */ m7 D;

    @if0(c = "com.copperleaf.ballast.debugger.BallastDebuggerClientConnection$connect$job$1$1", f = "BallastDebuggerClientConnection.kt", l = {118}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<ua0, z80<? super sd5>, Object> {
        public int A;
        public final /* synthetic */ k6<hf1> B;
        public final /* synthetic */ long C;
        public final /* synthetic */ m7 D;
        public final /* synthetic */ hl3 E;

        /* JADX INFO: renamed from: s6$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0192QnHx extends cx1 implements h81<sd5> {
            public final /* synthetic */ m7 w;
            public final /* synthetic */ k6<hf1> x;
            public final /* synthetic */ hl3 y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0192QnHx(m7 m7Var, k6<hf1> k6Var, hl3 hl3Var) {
                super(0);
                this.w = m7Var;
                this.x = k6Var;
                this.y = hl3Var;
            }

            @Override // defpackage.h81
            public final sd5 invoke() {
                m7 m7Var = this.w;
                if (m7Var != null) {
                    String str = this.x.e;
                    m7Var.a();
                }
                this.y.w = 0;
                return sd5.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(k6<hf1> k6Var, long j, m7 m7Var, hl3 hl3Var, z80<? super QnHx> z80Var) {
            super(2, z80Var);
            this.B = k6Var;
            this.C = j;
            this.D = m7Var;
            this.E = hl3Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            return new QnHx(this.B, this.C, this.D, this.E, z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i == 0) {
                C0239D.H(obj);
                m7 m7Var = this.D;
                k6<hf1> k6Var = this.B;
                C0192QnHx c0192QnHx = new C0192QnHx(m7Var, k6Var, this.E);
                this.A = 1;
                if (k6.a(k6Var, this.C, c0192QnHx, this) == va0Var) {
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
            return ((QnHx) a(ua0Var, z80Var)).i(sd5.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(hl3 hl3Var, k6<hf1> k6Var, m7 m7Var, z80<? super s6> z80Var) {
        super(2, z80Var);
        this.B = hl3Var;
        this.C = k6Var;
        this.D = m7Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new s6(this.B, this.C, this.D, z80Var);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:7:0x000d
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // defpackage.m8
    public final java.lang.Object i(java.lang.Object r13) {
        /*
            r12 = this;
            va0 r0 = defpackage.va0.COROUTINE_SUSPENDED
            int r1 = r12.A
            r2 = 1
            if (r1 == 0) goto L1a
            if (r1 != r2) goto L12
            defpackage.C0239D.H(r13)     // Catch: java.lang.Throwable -> Ld java.util.concurrent.CancellationException -> Lf
            goto L1d
        Ld:
            goto L1d
        Lf:
            r13 = move-exception
            goto L94
        L12:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1a:
            defpackage.C0239D.H(r13)
        L1d:
            hl3 r13 = r12.B
            int r1 = r13.w
            if (r1 != 0) goto L29
            gq0$QnHx r1 = defpackage.gq0.x
            r3 = 0
        L27:
            r7 = r3
            goto L73
        L29:
            r3 = 0
            r4 = 11
            if (r1 < 0) goto L32
            if (r1 >= r4) goto L32
            r5 = 1
            goto L33
        L32:
            r5 = 0
        L33:
            if (r5 == 0) goto L3e
            gq0$QnHx r1 = defpackage.gq0.x
            kq0 r1 = defpackage.kq0.SECONDS
            long r3 = defpackage.ps0.o0(r2, r1)
            goto L27
        L3e:
            r5 = 21
            if (r4 > r1) goto L46
            if (r1 >= r5) goto L46
            r4 = 1
            goto L47
        L46:
            r4 = 0
        L47:
            if (r4 == 0) goto L53
            gq0$QnHx r1 = defpackage.gq0.x
            r1 = 5
            kq0 r3 = defpackage.kq0.SECONDS
            long r3 = defpackage.ps0.o0(r1, r3)
            goto L27
        L53:
            if (r5 > r1) goto L5a
            r4 = 31
            if (r1 >= r4) goto L5a
            r3 = 1
        L5a:
            if (r3 == 0) goto L67
            gq0$QnHx r1 = defpackage.gq0.x
            r1 = 30
            kq0 r3 = defpackage.kq0.SECONDS
            long r3 = defpackage.ps0.o0(r1, r3)
            goto L27
        L67:
            gq0$QnHx r1 = defpackage.gq0.x
            r1 = 2147483647(0x7fffffff, float:NaN)
            kq0 r3 = defpackage.kq0.SECONDS
            long r3 = defpackage.ps0.o0(r1, r3)
            goto L27
        L73:
            int r1 = r13.w
            int r1 = r1 + r2
            r13.w = r1
            yw r13 = defpackage.ddf.c()
            k6<hf1> r6 = r12.C
            r6.i = r13
            s6$QnHx r13 = new s6$QnHx     // Catch: java.lang.Throwable -> Ld java.util.concurrent.CancellationException -> Lf
            m7 r9 = r12.D     // Catch: java.lang.Throwable -> Ld java.util.concurrent.CancellationException -> Lf
            hl3 r10 = r12.B     // Catch: java.lang.Throwable -> Ld java.util.concurrent.CancellationException -> Lf
            r11 = 0
            r5 = r13
            r5.<init>(r6, r7, r9, r10, r11)     // Catch: java.lang.Throwable -> Ld java.util.concurrent.CancellationException -> Lf
            r12.A = r2     // Catch: java.lang.Throwable -> Ld java.util.concurrent.CancellationException -> Lf
            java.lang.Object r13 = defpackage.fp1.R(r13, r12)     // Catch: java.lang.Throwable -> Ld java.util.concurrent.CancellationException -> Lf
            if (r13 != r0) goto L1d
            return r0
        L94:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s6.i(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
        return ((s6) a(ua0Var, z80Var)).i(sd5.a);
    }
}
