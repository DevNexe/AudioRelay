package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b51 {

    @if0(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", l = {41, 44, 49}, m = "forEachGesture")
    public static final class CQf extends b90 {
        public x81 A;
        public la0 B;
        public /* synthetic */ Object C;
        public int D;
        public l93 z;

        public CQf(z80<? super CQf> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.C = obj;
            this.D |= Integer.MIN_VALUE;
            return b51.b(null, null, this);
        }
    }

    @if0(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", l = {79}, m = "awaitAllPointersUp")
    public static final class QnHx extends b90 {
        public /* synthetic */ Object A;
        public int B;
        public a5 z;

        public QnHx(z80<? super QnHx> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.A = obj;
            this.B |= Integer.MIN_VALUE;
            return b51.a(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0079 A[LOOP:0: B:27:0x006b->B:31:0x0079, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x007c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005f -> B:26:0x0062). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(defpackage.a5 r7, defpackage.z80<? super defpackage.sd5> r8) {
        /*
            boolean r0 = r8 instanceof b51.QnHx
            if (r0 == 0) goto L13
            r0 = r8
            b51$QnHx r0 = (b51.QnHx) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            b51$QnHx r0 = new b51$QnHx
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.A
            va0 r1 = defpackage.va0.COROUTINE_SUSPENDED
            int r2 = r0.B
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            a5 r7 = r0.z
            defpackage.C0239D.H(r8)
            goto L62
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            defpackage.C0239D.H(r8)
            y83 r8 = r7.s()
            java.util.List<d93> r8 = r8.a
            int r2 = r8.size()
            r5 = 0
        L40:
            if (r5 >= r2) goto L51
            java.lang.Object r6 = r8.get(r5)
            d93 r6 = (defpackage.d93) r6
            boolean r6 = r6.d
            if (r6 == 0) goto L4e
            r8 = 1
            goto L52
        L4e:
            int r5 = r5 + 1
            goto L40
        L51:
            r8 = 0
        L52:
            r8 = r8 ^ r4
            if (r8 != 0) goto L7f
        L55:
            z83 r8 = defpackage.z83.Final
            r0.z = r7
            r0.B = r4
            java.lang.Object r8 = r7.n0(r8, r0)
            if (r8 != r1) goto L62
            return r1
        L62:
            y83 r8 = (defpackage.y83) r8
            java.util.List<d93> r8 = r8.a
            int r2 = r8.size()
            r5 = 0
        L6b:
            if (r5 >= r2) goto L7c
            java.lang.Object r6 = r8.get(r5)
            d93 r6 = (defpackage.d93) r6
            boolean r6 = r6.d
            if (r6 == 0) goto L79
            r8 = 1
            goto L7d
        L79:
            int r5 = r5 + 1
            goto L6b
        L7c:
            r8 = 0
        L7d:
            if (r8 != 0) goto L55
        L7f:
            sd5 r7 = defpackage.sd5.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b51.a(a5, z80):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0070 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x0071  */
    /* JADX WARN: Code duplicated, block: B:34:0x0088  */
    /* JADX WARN: Code duplicated, block: B:35:0x0089 A[Catch: CancellationException -> 0x0093, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0093, blocks: (B:32:0x0075, B:35:0x0089), top: B:58:0x0075 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x008d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x008e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, l93] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v7, types: [la0] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [la0] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14, types: [la0] */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v5, types: [l93] */
    /* JADX WARN: Type inference failed for: r2v7, types: [l93] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x008e -> B:26:0x005c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00bd -> B:26:0x005c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(defpackage.l93 r10, defpackage.x81<? super defpackage.l93, ? super defpackage.z80<? super defpackage.sd5>, ? extends java.lang.Object> r11, defpackage.z80<? super defpackage.sd5> r12) throws java.lang.Throwable {
        /*
            boolean r0 = r12 instanceof b51.CQf
            if (r0 == 0) goto L13
            r0 = r12
            b51$CQf r0 = (b51.CQf) r0
            int r1 = r0.D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.D = r1
            goto L18
        L13:
            b51$CQf r0 = new b51$CQf
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.C
            va0 r1 = defpackage.va0.COROUTINE_SUSPENDED
            int r2 = r0.D
            r3 = 0
            r4 = 1
            r5 = 2
            r6 = 3
            if (r2 == 0) goto L56
            if (r2 == r4) goto L48
            if (r2 == r5) goto L3c
            if (r2 != r6) goto L34
            la0 r10 = r0.B
            x81 r11 = r0.A
            l93 r2 = r0.z
            defpackage.C0239D.H(r12)
            goto L45
        L34:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3c:
            la0 r10 = r0.B
            x81 r11 = r0.A
            l93 r2 = r0.z
            defpackage.C0239D.H(r12)     // Catch: java.util.concurrent.CancellationException -> L53
        L45:
            r12 = r10
            r10 = r2
            goto L5b
        L48:
            la0 r10 = r0.B
            x81 r11 = r0.A
            l93 r2 = r0.z
            defpackage.C0239D.H(r12)     // Catch: java.util.concurrent.CancellationException -> L53
            r12 = r1
            goto L75
        L53:
            r12 = move-exception
            r7 = r1
            goto L9e
        L56:
            defpackage.C0239D.H(r12)
            la0 r12 = r0.x
        L5b:
            r2 = r1
        L5c:
            boolean r7 = defpackage.AY.F(r12)
            if (r7 == 0) goto Lc2
            r0.z = r10     // Catch: java.util.concurrent.CancellationException -> L98
            r0.A = r11     // Catch: java.util.concurrent.CancellationException -> L98
            r0.B = r12     // Catch: java.util.concurrent.CancellationException -> L98
            r0.D = r4     // Catch: java.util.concurrent.CancellationException -> L98
            java.lang.Object r7 = r11.invoke(r10, r0)     // Catch: java.util.concurrent.CancellationException -> L98
            if (r7 != r2) goto L71
            return r2
        L71:
            r9 = r2
            r2 = r10
            r10 = r12
            r12 = r9
        L75:
            r0.z = r2     // Catch: java.util.concurrent.CancellationException -> L93
            r0.A = r11     // Catch: java.util.concurrent.CancellationException -> L93
            r0.B = r10     // Catch: java.util.concurrent.CancellationException -> L93
            r0.D = r5     // Catch: java.util.concurrent.CancellationException -> L93
            a51 r7 = new a51     // Catch: java.util.concurrent.CancellationException -> L93
            r7.<init>(r3)     // Catch: java.util.concurrent.CancellationException -> L93
            java.lang.Object r7 = r2.i0(r7, r0)     // Catch: java.util.concurrent.CancellationException -> L93
            if (r7 != r1) goto L89
            goto L8b
        L89:
            sd5 r7 = defpackage.sd5.a     // Catch: java.util.concurrent.CancellationException -> L93
        L8b:
            if (r7 != r12) goto L8e
            return r12
        L8e:
            r9 = r12
            r12 = r10
            r10 = r2
            r2 = r9
            goto L5c
        L93:
            r7 = move-exception
            r9 = r7
            r7 = r12
            r12 = r9
            goto L9e
        L98:
            r7 = move-exception
            r9 = r2
            r2 = r10
            r10 = r12
            r12 = r7
            r7 = r9
        L9e:
            boolean r8 = defpackage.AY.F(r10)
            if (r8 == 0) goto Lc1
            r0.z = r2
            r0.A = r11
            r0.B = r10
            r0.D = r6
            a51 r12 = new a51
            r12.<init>(r3)
            java.lang.Object r12 = r2.i0(r12, r0)
            if (r12 != r1) goto Lb8
            goto Lba
        Lb8:
            sd5 r12 = defpackage.sd5.a
        Lba:
            if (r12 != r7) goto Lbd
            return r7
        Lbd:
            r12 = r10
            r10 = r2
            r2 = r7
            goto L5c
        Lc1:
            throw r12
        Lc2:
            sd5 r10 = defpackage.sd5.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b51.b(l93, x81, z80):java.lang.Object");
    }
}
