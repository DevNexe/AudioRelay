package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "kotlinx.coroutines.rx2.DispatcherScheduler$DispatcherWorker$1", f = "RxScheduler.kt", l = {189, 82}, m = "invokeSuspend")
public final class ml0 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public nk3 A;
    public wo B;
    public int C;
    public final /* synthetic */ ol0.QnHx D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ml0(ol0.QnHx qnHx, z80<? super ml0> z80Var) {
        super(2, z80Var);
        this.D = qnHx;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new ml0(this.D, z80Var);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0046 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0047  */
    /* JADX WARN: Code duplicated, block: B:25:0x0055 A[Catch: all -> 0x006d, TRY_LEAVE, TryCatch #2 {all -> 0x006d, blocks: (B:23:0x004d, B:25:0x0055), top: B:42:0x004d }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0067 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0068  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0068 -> B:19:0x003a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.m8
    public final java.lang.Object i(java.lang.Object r8) {
        /*
            r7 = this;
            va0 r0 = defpackage.va0.COROUTINE_SUSPENDED
            int r1 = r7.C
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2a
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            wo r1 = r7.B
            nk3 r4 = r7.A
            defpackage.C0239D.H(r8)     // Catch: java.lang.Throwable -> L28
            goto L39
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            wo r1 = r7.B
            nk3 r4 = r7.A
            defpackage.C0239D.H(r8)     // Catch: java.lang.Throwable -> L28
            r5 = r4
            r4 = r1
            r1 = r0
            r0 = r7
            goto L4d
        L28:
            r8 = move-exception
            goto L76
        L2a:
            defpackage.C0239D.H(r8)
            ol0$QnHx r8 = r7.D
            NUlFixed r4 = r8.A
            r4.getClass()     // Catch: java.lang.Throwable -> L28
            NUl$QnHx r1 = new NUl$QnHx     // Catch: java.lang.Throwable -> L28
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L28
        L39:
            r8 = r7
        L3a:
            r8.A = r4     // Catch: java.lang.Throwable -> L28
            r8.B = r1     // Catch: java.lang.Throwable -> L28
            r8.C = r3     // Catch: java.lang.Throwable -> L28
            java.lang.Object r5 = r1.a(r8)     // Catch: java.lang.Throwable -> L28
            if (r5 != r0) goto L47
            return r0
        L47:
            r6 = r0
            r0 = r8
            r8 = r5
            r5 = r4
            r4 = r1
            r1 = r6
        L4d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L6d
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L6d
            if (r8 == 0) goto L6f
            java.lang.Object r8 = r4.next()     // Catch: java.lang.Throwable -> L6d
            j81 r8 = (defpackage.j81) r8     // Catch: java.lang.Throwable -> L6d
            r0.A = r5     // Catch: java.lang.Throwable -> L6d
            r0.B = r4     // Catch: java.lang.Throwable -> L6d
            r0.C = r2     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r8 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L6d
            if (r8 != r1) goto L68
            return r1
        L68:
            r8 = r0
            r0 = r1
            r1 = r4
            r4 = r5
            goto L3a
        L6d:
            r8 = move-exception
            goto L77
        L6f:
            r8 = 0
            defpackage.fp1.I(r5, r8)
            sd5 r8 = defpackage.sd5.a
            return r8
        L76:
            r5 = r4
        L77:
            throw r8     // Catch: java.lang.Throwable -> L78
        L78:
            r0 = move-exception
            defpackage.fp1.I(r5, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ml0.i(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
        return ((ml0) a(ua0Var, z80Var)).i(sd5.a);
    }
}
