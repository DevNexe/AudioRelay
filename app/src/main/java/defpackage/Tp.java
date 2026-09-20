package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.player.audio.audiofocus.AudioFocusHandler$listenToPhoneState$2", f = "AudioFocusHandler.kt", l = {157}, m = "invokeSuspend")
public final class Tp extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public Rh A;
    public nk3 B;
    public wo C;
    public int D;
    public final /* synthetic */ E97 E;
    public final /* synthetic */ Rh F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tp(E97 e97, Rh rh, z80<? super Tp> z80Var) {
        super(2, z80Var);
        this.E = e97;
        this.F = rh;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new Tp(this.E, this.F, z80Var);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0055 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x0056  */
    /* JADX WARN: Code duplicated, block: B:19:0x0065 A[Catch: all -> 0x007d, TRY_LEAVE, TryCatch #1 {all -> 0x007d, blocks: (B:17:0x005d, B:19:0x0065), top: B:33:0x005d }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0056 -> B:33:0x005d). Please report as a decompilation issue!!! */
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
            int r1 = r7.D
            r2 = 1
            if (r1 == 0) goto L20
            if (r1 != r2) goto L18
            wo r1 = r7.C
            nk3 r3 = r7.B
            Rh r4 = r7.A
            defpackage.C0239D.H(r8)     // Catch: java.lang.Throwable -> L7f
            r5 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r7
            goto L5d
        L18:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L20:
            defpackage.C0239D.H(r8)
            E97 r8 = r7.E
            o23 r8 = r8.c
            r8.getClass()
            vK0u r1 = new vK0u
            r3 = 2
            r1.<init>(r8, r3)
            dr2 r8 = new dr2
            r8.<init>(r1)
            ow4 r3 = new ow4
            r3.<init>()
            r8.a(r3)
            NUl$QnHx r8 = new NUl$QnHx     // Catch: java.lang.Throwable -> L7f
            r8.<init>(r3)     // Catch: java.lang.Throwable -> L7f
            Rh r1 = r7.F
            r4 = r1
            r1 = r8
            r8 = r7
        L47:
            r8.A = r4     // Catch: java.lang.Throwable -> L7f
            r8.B = r3     // Catch: java.lang.Throwable -> L7f
            r8.C = r1     // Catch: java.lang.Throwable -> L7f
            r8.D = r2     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r5 = r1.a(r8)     // Catch: java.lang.Throwable -> L7f
            if (r5 != r0) goto L56
            return r0
        L56:
            r6 = r0
            r0 = r8
            r8 = r5
            r5 = r4
            r4 = r3
            r3 = r1
            r1 = r6
        L5d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L7d
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L7d
            if (r8 == 0) goto L76
            java.lang.Object r8 = r3.next()     // Catch: java.lang.Throwable -> L7d
            f23 r8 = (defpackage.f23) r8     // Catch: java.lang.Throwable -> L7d
            int r8 = r8.a     // Catch: java.lang.Throwable -> L7d
            r5.c(r8)     // Catch: java.lang.Throwable -> L7d
            r8 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r4 = r5
            goto L47
        L76:
            r8 = 0
            defpackage.fp1.I(r4, r8)
            sd5 r8 = defpackage.sd5.a
            return r8
        L7d:
            r8 = move-exception
            goto L81
        L7f:
            r8 = move-exception
            r4 = r3
        L81:
            throw r8     // Catch: java.lang.Throwable -> L82
        L82:
            r0 = move-exception
            defpackage.fp1.I(r4, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Tp.i(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
        return ((Tp) a(ua0Var, z80Var)).i(sd5.a);
    }
}
