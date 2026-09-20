package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.network.info.AndroidNetworkInfoService$getRegularQueryStream$1", f = "AndroidNetworkInfoService.kt", l = {63, 64}, m = "invokeSuspend")
public final class aN extends px4 implements x81<nz0<? super hn2>, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ qd C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aN(qd qdVar, z80<? super aN> z80Var) {
        super(2, z80Var);
        this.C = qdVar;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        aN aNVar = new aN(this.C, z80Var);
        aNVar.B = obj;
        return aNVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:0x0054 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0052 -> B:12:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:4:0x0008
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.m8
    public final java.lang.Object i(java.lang.Object r7) {
        /*
            r6 = this;
            va0 r0 = defpackage.va0.COROUTINE_SUSPENDED
            int r1 = r6.A
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L27
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            java.lang.Object r1 = r6.B
            nz0 r1 = (defpackage.nz0) r1
            defpackage.C0239D.H(r7)
            r7 = r1
            goto L2e
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            java.lang.Object r1 = r6.B
            nz0 r1 = (defpackage.nz0) r1
            defpackage.C0239D.H(r7)
            r7 = r1
            r1 = r6
            goto L40
        L27:
            defpackage.C0239D.H(r7)
            java.lang.Object r7 = r6.B
            nz0 r7 = (defpackage.nz0) r7
        L2e:
            r1 = r6
        L2f:
            qd r4 = r1.C
            hn2 r4 = defpackage.qd.a(r4)
            r1.B = r7
            r1.A = r3
            java.lang.Object r4 = r7.f(r4, r1)
            if (r4 != r0) goto L40
            return r0
        L40:
            gq0$QnHx r4 = defpackage.gq0.x
            r4 = 10
            kq0 r5 = defpackage.kq0.SECONDS
            long r4 = defpackage.ps0.o0(r4, r5)
            r1.B = r7
            r1.A = r2
            java.lang.Object r4 = defpackage.S12N.f(r4, r1)
            if (r4 != r0) goto L2f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aN.i(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.x81
    public final Object invoke(nz0<? super hn2> nz0Var, z80<? super sd5> z80Var) {
        return ((aN) a(nz0Var, z80Var)).i(sd5.a);
    }
}
