package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class y4 {

    @if0(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", l = {54}, m = "joinAll")
    public static final class QnHx extends b90 {
        public int A;
        public int B;
        public /* synthetic */ Object C;
        public int D;
        public Object[] z;

        public QnHx(z80<? super QnHx> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.C = obj;
            this.D |= Integer.MIN_VALUE;
            return y4.a(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0042  */
    /* JADX WARN: Code duplicated, block: B:18:0x0052 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0050 -> B:19:0x0053). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(defpackage.ms1[] r6, defpackage.z80<? super defpackage.sd5> r7) {
        /*
            boolean r0 = r7 instanceof y4.QnHx
            if (r0 == 0) goto L13
            r0 = r7
            y4$QnHx r0 = (y4.QnHx) r0
            int r1 = r0.D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.D = r1
            goto L18
        L13:
            y4$QnHx r0 = new y4$QnHx
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.C
            va0 r1 = defpackage.va0.COROUTINE_SUSPENDED
            int r2 = r0.D
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            int r6 = r0.B
            int r2 = r0.A
            java.lang.Object[] r4 = r0.z
            ms1[] r4 = (defpackage.ms1[]) r4
            defpackage.C0239D.H(r7)
            r7 = r4
            goto L53
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            defpackage.C0239D.H(r7)
            int r7 = r6.length
            r2 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L40:
            if (r2 >= r6) goto L55
            r4 = r7[r2]
            r0.z = r7
            r0.A = r2
            r0.B = r6
            r0.D = r3
            java.lang.Object r4 = r4.K(r0)
            if (r4 != r1) goto L53
            return r1
        L53:
            int r2 = r2 + r3
            goto L40
        L55:
            sd5 r6 = defpackage.sd5.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y4.a(ms1[], z80):java.lang.Object");
    }
}
