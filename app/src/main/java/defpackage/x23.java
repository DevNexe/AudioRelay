package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "io.ktor.websocket.PingPongKt$pinger$1", f = "PingPong.kt", l = {61, 70, 86}, m = "invokeSuspend")
public final class x23 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public yh3 A;
    public byte[] B;
    public int C;
    public final /* synthetic */ long D;
    public final /* synthetic */ long E;
    public final /* synthetic */ q94<p61> F;
    public final /* synthetic */ jo<p61.NUlFixed> G;

    @if0(c = "io.ktor.websocket.PingPongKt$pinger$1$rc$1", f = "PingPong.kt", l = {71, 75}, m = "invokeSuspend")
    public static final class CQf extends px4 implements x81<ua0, z80<? super sd5>, Object> {
        public int A;
        public final /* synthetic */ q94<p61> B;
        public final /* synthetic */ String C;
        public final /* synthetic */ jo<p61.NUlFixed> D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CQf(q94<? super p61> q94Var, String str, jo<p61.NUlFixed> joVar, z80<? super CQf> z80Var) {
            super(2, z80Var);
            this.B = q94Var;
            this.C = str;
            this.D = joVar;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            return new CQf(this.B, this.C, this.D, z80Var);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0059 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:21:0x005a  */
        /* JADX WARN: Code duplicated, block: B:24:0x0073  */
        /* JADX WARN: Code duplicated, block: B:26:0x0076  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005a -> B:22:0x005e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.m8
        public final java.lang.Object i(java.lang.Object r9) {
            /*
                r8 = this;
                va0 r0 = defpackage.va0.COROUTINE_SUSPENDED
                int r1 = r8.A
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                defpackage.C0239D.H(r9)
                r1 = r0
                r0 = r8
                goto L5e
            L12:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1a:
                defpackage.C0239D.H(r9)
                goto L4e
            L1e:
                defpackage.C0239D.H(r9)
                p61$LPt8 r9 = new p61$LPt8
                java.nio.charset.Charset r1 = defpackage.up.b
                java.nio.charset.Charset r4 = defpackage.up.a
                boolean r5 = defpackage.ur1.a(r1, r4)
                java.lang.String r6 = r8.C
                if (r5 == 0) goto L34
                byte[] r1 = r6.getBytes(r4)
                goto L40
            L34:
                java.nio.charset.CharsetEncoder r1 = r1.newEncoder()
                int r4 = r6.length()
                byte[] r1 = defpackage.sp.c(r1, r6, r4)
            L40:
                r9.<init>(r1)
                r8.A = r3
                q94<p61> r1 = r8.B
                java.lang.Object r9 = r1.p(r9, r8)
                if (r9 != r0) goto L4e
                return r0
            L4e:
                r9 = r8
            L4f:
                r9.A = r2
                jo<p61$NUl> r1 = r9.D
                java.lang.Object r1 = r1.E(r9)
                if (r1 != r0) goto L5a
                return r0
            L5a:
                r7 = r0
                r0 = r9
                r9 = r1
                r1 = r7
            L5e:
                p61$NUl r9 = (p61.NUlFixed) r9
                byte[] r9 = r9.c
                java.nio.charset.Charset r3 = defpackage.up.b
                int r4 = r9.length
                java.lang.String r5 = new java.lang.String
                r6 = 0
                r5.<init>(r9, r6, r4, r3)
                java.lang.String r9 = r0.C
                boolean r9 = defpackage.ur1.a(r5, r9)
                if (r9 == 0) goto L76
                sd5 r9 = defpackage.sd5.a
                return r9
            L76:
                r9 = r0
                r0 = r1
                goto L4f
            */
            throw new UnsupportedOperationException("Method not decompiled: x23.CQf.i(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.x81
        public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
            return ((CQf) a(ua0Var, z80Var)).i(sd5.a);
        }
    }

    @if0(c = "io.ktor.websocket.PingPongKt$pinger$1$1", f = "PingPong.kt", l = {63}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<ua0, z80<? super sd5>, Object> {
        public int A;
        public final /* synthetic */ jo<p61.NUlFixed> B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(jo<p61.NUlFixed> joVar, z80<? super QnHx> z80Var) {
            super(2, z80Var);
            this.B = joVar;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            return new QnHx(this.B, z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i != 0 && i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0239D.H(obj);
            do {
                this.A = 1;
            } while (this.B.E(this) != va0Var);
            return va0Var;
        }

        @Override // defpackage.x81
        public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
            return ((QnHx) a(ua0Var, z80Var)).i(sd5.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x23(long j, long j2, q94<? super p61> q94Var, jo<p61.NUlFixed> joVar, z80<? super x23> z80Var) {
        super(2, z80Var);
        this.D = j;
        this.E = j2;
        this.F = q94Var;
        this.G = joVar;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new x23(this.D, this.E, this.F, this.G, z80Var);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0093 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0094  */
    /* JADX WARN: Code duplicated, block: B:28:0x009b A[Catch: CancellationException | ClosedReceiveChannelException | ClosedSendChannelException -> 0x00bb, CancellationException | ClosedReceiveChannelException | ClosedSendChannelException -> 0x00bb, CancellationException | ClosedReceiveChannelException | ClosedSendChannelException -> 0x00bb, TRY_LEAVE, TryCatch #0 {CancellationException | ClosedReceiveChannelException | ClosedSendChannelException -> 0x00bb, blocks: (B:7:0x0010, B:12:0x0021, B:12:0x0021, B:12:0x0021, B:26:0x0097, B:26:0x0097, B:26:0x0097, B:28:0x009b, B:28:0x009b, B:28:0x009b, B:18:0x0046, B:18:0x0046, B:18:0x0046, B:22:0x005f, B:22:0x005f, B:22:0x005f, B:15:0x002b, B:15:0x002b, B:15:0x002b), top: B:35:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x00b8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0094 -> B:26:0x0097). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.m8
    public final java.lang.Object i(java.lang.Object r15) {
        /*
            r14 = this;
            va0 r0 = defpackage.va0.COROUTINE_SUSPENDED
            int r1 = r14.C
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L30
            if (r1 == r5) goto L27
            if (r1 == r4) goto L1d
            if (r1 != r3) goto L15
            defpackage.C0239D.H(r15)     // Catch: java.lang.Throwable -> Lbb
            goto Lbb
        L15:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L1d:
            byte[] r1 = r14.B
            yh3 r6 = r14.A
            defpackage.C0239D.H(r15)     // Catch: java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb
            r7 = r14
            goto L97
        L27:
            byte[] r1 = r14.B
            yh3 r6 = r14.A
            defpackage.C0239D.H(r15)     // Catch: java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb
            r15 = r14
            goto L5f
        L30:
            defpackage.C0239D.H(r15)
            java.util.TimeZone r15 = defpackage.df0.a
            long r6 = java.lang.System.currentTimeMillis()
            vo5 r15 = new vo5
            int r1 = (int) r6
            r8 = 32
            long r6 = r6 >> r8
            int r7 = (int) r6
            r15.<init>(r1, r7)
            byte[] r1 = new byte[r8]
            r6 = r14
        L46:
            long r7 = r6.D     // Catch: java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb
            x23$QnHx r9 = new x23$QnHx     // Catch: java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb
            jo<p61$NUl> r10 = r6.G     // Catch: java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb
            r9.<init>(r10, r2)     // Catch: java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb
            r6.A = r15     // Catch: java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb
            r6.B = r1     // Catch: java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb
            r6.C = r5     // Catch: java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb
            java.lang.Object r7 = defpackage.b85.b(r7, r9, r6)     // Catch: java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb
            if (r7 != r0) goto L5c
            return r0
        L5c:
            r13 = r6
            r6 = r15
            r15 = r13
        L5f:
            r6.b(r1)     // Catch: java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb
            r7.<init>()     // Catch: java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb
            java.lang.String r8 = "[ping "
            r7.append(r8)     // Catch: java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb
            java.lang.String r8 = defpackage.XTd3.o(r1)     // Catch: java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb
            r7.append(r8)     // Catch: java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb
            java.lang.String r8 = " ping]"
            r7.append(r8)     // Catch: java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb
            long r8 = r15.E     // Catch: java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb
            x23$CQf r10 = new x23$CQf     // Catch: java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb
            q94<p61> r11 = r15.F     // Catch: java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb
            jo<p61$NUl> r12 = r15.G     // Catch: java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb
            r10.<init>(r11, r7, r12, r2)     // Catch: java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb
            r15.A = r6     // Catch: java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb
            r15.B = r1     // Catch: java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb
            r15.C = r4     // Catch: java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb
            java.lang.Object r7 = defpackage.b85.b(r8, r10, r15)     // Catch: java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb
            if (r7 != r0) goto L94
            return r0
        L94:
            r13 = r7
            r7 = r15
            r15 = r13
        L97:
            sd5 r15 = (defpackage.sd5) r15     // Catch: java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb
            if (r15 != 0) goto Lb8
            p61$CQf r15 = new p61$CQf     // Catch: java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb
            lt r1 = new lt     // Catch: java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb
            lt$QnHx r4 = lt.QnHx.INTERNAL_ERROR     // Catch: java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb
            java.lang.String r5 = "Ping timeout"
            r1.<init>(r4, r5)     // Catch: java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb
            r15.<init>(r1)     // Catch: java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb
            q94<p61> r1 = r7.F     // Catch: java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb
            r7.A = r2     // Catch: java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb
            r7.B = r2     // Catch: java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb
            r7.C = r3     // Catch: java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb
            java.lang.Object r15 = r1.p(r15, r7)     // Catch: java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb java.lang.Throwable -> Lbb
            if (r15 != r0) goto Lbb
            return r0
        Lb8:
            r15 = r6
            r6 = r7
            goto L46
        Lbb:
            sd5 r15 = defpackage.sd5.a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x23.i(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
        return ((x23) a(ua0Var, z80Var)).i(sd5.a);
    }
}
