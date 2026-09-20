package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", f = "TapGestureDetector.kt", l = {191}, m = "invokeSuspend")
public final class q05 extends eq3 implements x81<a5, z80<? super d93>, Object> {
    public /* synthetic */ Object A;
    public final /* synthetic */ d93 B;
    public long y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q05(d93 d93Var, z80<? super q05> z80Var) {
        super(2, z80Var);
        this.B = d93Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        q05 q05Var = new q05(this.B, z80Var);
        q05Var.A = obj;
        return q05Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0045 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0046  */
    /* JADX WARN: Code duplicated, block: B:15:0x0054 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x0055  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0046 -> B:13:0x004c). Please report as a decompilation issue!!! */
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
            int r1 = r10.z
            r2 = 1
            if (r1 == 0) goto L1f
            if (r1 != r2) goto L17
            long r3 = r10.y
            java.lang.Object r1 = r10.A
            a5 r1 = (defpackage.a5) r1
            defpackage.C0239D.H(r11)
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            goto L4c
        L17:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1f:
            defpackage.C0239D.H(r11)
            java.lang.Object r11 = r10.A
            a5 r11 = (defpackage.a5) r11
            d93 r1 = r10.B
            long r3 = r1.b
            ti5 r1 = r11.getViewConfiguration()
            r1.b()
            r5 = 40
            long r5 = r5 + r3
            r1 = r11
            r3 = r5
            r11 = r10
        L37:
            r11.A = r1
            r11.y = r3
            r11.z = r2
            z83 r5 = defpackage.z83.Main
            java.lang.Object r5 = defpackage.p05.b(r1, r5, r2, r11)
            if (r5 != r0) goto L46
            return r0
        L46:
            r9 = r0
            r0 = r11
            r11 = r5
            r4 = r3
            r3 = r1
            r1 = r9
        L4c:
            d93 r11 = (defpackage.d93) r11
            long r6 = r11.b
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 < 0) goto L55
            return r11
        L55:
            r11 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q05.i(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.x81
    public final Object invoke(a5 a5Var, z80<? super d93> z80Var) {
        return ((q05) a(a5Var, z80Var)).i(sd5.a);
    }
}
