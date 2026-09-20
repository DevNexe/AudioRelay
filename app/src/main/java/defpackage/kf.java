package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kf implements Cif {
    public final ui2<pf> a = new ui2<>(new pf[16]);

    @if0(c = "androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", f = "BringIntoViewRequester.kt", l = {121}, m = "bringIntoView")
    public static final class QnHx extends b90 {
        public Object[] A;
        public int B;
        public int C;
        public /* synthetic */ Object D;
        public int F;
        public dl3 z;

        public QnHx(z80<? super QnHx> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.D = obj;
            this.F |= Integer.MIN_VALUE;
            return kf.this.a(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008e, code lost:
    
        if (r11 >= r4) goto L39;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x008a -> B:37:0x008d). Please report as a decompilation issue!!! */
    @Override // defpackage.Cif
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.dl3 r11, defpackage.z80<? super defpackage.sd5> r12) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r12 instanceof kf.QnHx
            if (r0 == 0) goto L13
            r0 = r12
            kf$QnHx r0 = (kf.QnHx) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.F = r1
            goto L18
        L13:
            kf$QnHx r0 = new kf$QnHx
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.D
            va0 r1 = defpackage.va0.COROUTINE_SUSPENDED
            int r2 = r0.F
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            int r11 = r0.C
            int r2 = r0.B
            java.lang.Object[] r4 = r0.A
            dl3 r5 = r0.z
            defpackage.C0239D.H(r12)
            r12 = r5
            r5 = r4
            r4 = r2
            r2 = r1
            goto L8d
        L33:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3b:
            defpackage.C0239D.H(r12)
            ui2<pf> r12 = r10.a
            int r2 = r12.y
            if (r2 <= 0) goto L90
            T[] r12 = r12.w
            r4 = 0
            r5 = r12
            r4 = r2
            r12 = r11
            r2 = r1
            r11 = 0
        L4c:
            r6 = r5[r11]
            pf r6 = (defpackage.pf) r6
            r0.z = r12
            r0.A = r5
            r0.B = r4
            r0.C = r11
            r0.F = r3
            iy1 r7 = r6.y
            if (r7 == 0) goto L65
            boolean r8 = r7.q()
            if (r8 == 0) goto L65
            goto L66
        L65:
            r7 = 0
        L66:
            if (r7 != 0) goto L6b
            sd5 r6 = defpackage.sd5.a
            goto L8a
        L6b:
            if (r12 != 0) goto L7a
            long r8 = r7.a()
            long r8 = defpackage.C0239D.J(r8)
            dl3 r8 = defpackage.ps0.q0(r8)
            goto L7b
        L7a:
            r8 = r12
        L7b:
            ff r9 = r6.x
            if (r9 != 0) goto L81
            ff r9 = r6.w
        L81:
            java.lang.Object r6 = r9.a(r8, r7, r0)
            if (r6 != r1) goto L88
            goto L8a
        L88:
            sd5 r6 = defpackage.sd5.a
        L8a:
            if (r6 != r2) goto L8d
            return r2
        L8d:
            int r11 = r11 + r3
            if (r11 < r4) goto L4c
        L90:
            sd5 r11 = defpackage.sd5.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kf.a(dl3, z80):java.lang.Object");
    }
}
