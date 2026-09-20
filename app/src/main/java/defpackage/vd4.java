package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.player.ui.servers.ServerSearchInputHandler$startRegularSearch$2", f = "ServerSearchInputHandler.kt", l = {64, 65}, m = "invokeSuspend")
public final class vd4 extends px4 implements x81<gk4<qd4, od4, rd4>, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ ae4 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vd4(ae4 ae4Var, z80<? super vd4> z80Var) {
        super(2, z80Var);
        this.C = ae4Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        vd4 vd4Var = new vd4(this.C, z80Var);
        vd4Var.B = obj;
        return vd4Var;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0034  */
    /* JADX WARN: Code duplicated, block: B:16:0x0042 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0057 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0055 -> B:12:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:16:0x0042
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
            if (r1 == 0) goto L25
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            java.lang.Object r1 = r6.B
            gk4 r1 = (defpackage.gk4) r1
            defpackage.C0239D.H(r7)
            goto L2d
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            java.lang.Object r1 = r6.B
            gk4 r1 = (defpackage.gk4) r1
            defpackage.C0239D.H(r7)
            r7 = r6
            goto L43
        L25:
            defpackage.C0239D.H(r7)
            java.lang.Object r7 = r6.B
            r1 = r7
            gk4 r1 = (defpackage.gk4) r1
        L2d:
            r7 = r6
        L2e:
            boolean r4 = defpackage.fp1.e0(r1)
            if (r4 == 0) goto L58
            ae4 r4 = r7.C
            mc4 r4 = r4.a
            r7.B = r1
            r7.A = r3
            java.lang.Object r4 = r4.b(r7)
            if (r4 != r0) goto L43
            return r0
        L43:
            gq0$QnHx r4 = defpackage.gq0.x
            r4 = 10000(0x2710, float:1.4013E-41)
            kq0 r5 = defpackage.kq0.MILLISECONDS
            long r4 = defpackage.ps0.o0(r4, r5)
            r7.B = r1
            r7.A = r2
            java.lang.Object r4 = defpackage.S12N.f(r4, r7)
            if (r4 != r0) goto L2e
            return r0
        L58:
            sd5 r7 = defpackage.sd5.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vd4.i(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.x81
    public final Object invoke(gk4<qd4, od4, rd4> gk4Var, z80<? super sd5> z80Var) {
        return ((vd4) a(gk4Var, z80Var)).i(sd5.a);
    }
}
