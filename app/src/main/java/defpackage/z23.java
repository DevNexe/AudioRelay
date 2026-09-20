package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "io.ktor.websocket.PingPongKt$ponger$1", f = "PingPong.kt", l = {110, 31}, m = "invokeSuspend")
public final class z23 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public q94 A;
    public nk3 B;
    public wo C;
    public int D;
    public final /* synthetic */ jo<p61.LPt8Fixed> E;
    public final /* synthetic */ q94<p61.NUlFixed> F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z23(jo<p61.LPt8Fixed> joVar, q94<? super p61.NUlFixed> q94Var, z80<? super z23> z80Var) {
        super(2, z80Var);
        this.E = joVar;
        this.F = q94Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new z23(this.E, this.F, z80Var);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0047 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x0048  */
    /* JADX WARN: Code duplicated, block: B:24:0x0057 A[Catch: all -> 0x0080, TRY_LEAVE, TryCatch #0 {all -> 0x0080, blocks: (B:22:0x004f, B:24:0x0057), top: B:41:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0074 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x0075  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0075 -> B:18:0x0039). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.m8
    public final java.lang.Object i(java.lang.Object r11) {
        /*
            r10 = this;
            va0 r0 = defpackage.va0.COROUTINE_SUSPENDED
            int r1 = r10.D
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2d
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            wo r1 = r10.C
            nk3 r4 = r10.B
            q94 r5 = r10.A
            defpackage.C0239D.H(r11)     // Catch: java.lang.Throwable -> L83
            goto L38
        L16:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1e:
            wo r1 = r10.C
            nk3 r4 = r10.B
            q94 r5 = r10.A
            defpackage.C0239D.H(r11)     // Catch: java.lang.Throwable -> L83
            r6 = r5
            r5 = r4
            r4 = r1
            r1 = r0
            r0 = r10
            goto L4f
        L2d:
            defpackage.C0239D.H(r11)
            jo<p61$LPt8> r4 = r10.E     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L8a
            q94<p61$NUl> r5 = r10.F     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L8a
            wo r1 = r4.iterator()     // Catch: java.lang.Throwable -> L83
        L38:
            r11 = r10
        L39:
            r11.A = r5     // Catch: java.lang.Throwable -> L83
            r11.B = r4     // Catch: java.lang.Throwable -> L83
            r11.C = r1     // Catch: java.lang.Throwable -> L83
            r11.D = r3     // Catch: java.lang.Throwable -> L83
            java.lang.Object r6 = r1.a(r11)     // Catch: java.lang.Throwable -> L83
            if (r6 != r0) goto L48
            return r0
        L48:
            r9 = r0
            r0 = r11
            r11 = r6
            r6 = r5
            r5 = r4
            r4 = r1
            r1 = r9
        L4f:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L80
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L80
            if (r11 == 0) goto L7b
            java.lang.Object r11 = r4.next()     // Catch: java.lang.Throwable -> L80
            p61$LPt8 r11 = (p61.LPt8Fixed) r11     // Catch: java.lang.Throwable -> L80
            p61$NUl r7 = new p61$NUl     // Catch: java.lang.Throwable -> L80
            byte[] r11 = r11.c     // Catch: java.lang.Throwable -> L80
            dp2 r8 = defpackage.dp2.w     // Catch: java.lang.Throwable -> L80
            r7.<init>(r11, r8)     // Catch: java.lang.Throwable -> L80
            r0.A = r6     // Catch: java.lang.Throwable -> L80
            r0.B = r5     // Catch: java.lang.Throwable -> L80
            r0.C = r4     // Catch: java.lang.Throwable -> L80
            r0.D = r2     // Catch: java.lang.Throwable -> L80
            java.lang.Object r11 = r6.p(r7, r0)     // Catch: java.lang.Throwable -> L80
            if (r11 != r1) goto L75
            return r1
        L75:
            r11 = r0
            r0 = r1
            r1 = r4
            r4 = r5
            r5 = r6
            goto L39
        L7b:
            r11 = 0
            defpackage.fp1.I(r5, r11)     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L8a
            goto L8a
        L80:
            r11 = move-exception
            r4 = r5
            goto L84
        L83:
            r11 = move-exception
        L84:
            throw r11     // Catch: java.lang.Throwable -> L85
        L85:
            r0 = move-exception
            defpackage.fp1.I(r4, r11)     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L8a
            throw r0     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L8a
        L8a:
            sd5 r11 = defpackage.sd5.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z23.i(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
        return ((z23) a(ua0Var, z80Var)).i(sd5.a);
    }
}
