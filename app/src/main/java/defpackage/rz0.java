package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rz0 {

    @if0(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", l = {51, 62}, m = "emitAllImpl$FlowKt__ChannelsKt")
    public static final class QnHx<T> extends b90 {
        public nk3 A;
        public boolean B;
        public /* synthetic */ Object C;
        public int D;
        public nz0 z;

        public QnHx(z80<? super QnHx> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.C = obj;
            this.D |= Integer.MIN_VALUE;
            return rz0.a(null, null, false, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x005f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0066 A[Catch: all -> 0x0089, TRY_LEAVE, TryCatch #1 {all -> 0x0089, blocks: (B:13:0x002c, B:26:0x0062, B:28:0x0066, B:34:0x0075, B:35:0x0076, B:37:0x007a, B:42:0x008b, B:44:0x008f, B:46:0x0096, B:47:0x0097, B:48:0x00ae, B:18:0x0041), top: B:60:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x006e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0075 A[Catch: all -> 0x0089, TRY_ENTER, TryCatch #1 {all -> 0x0089, blocks: (B:13:0x002c, B:26:0x0062, B:28:0x0066, B:34:0x0075, B:35:0x0076, B:37:0x007a, B:42:0x008b, B:44:0x008f, B:46:0x0096, B:47:0x0097, B:48:0x00ae, B:18:0x0041), top: B:60:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0076 A[Catch: all -> 0x0089, TryCatch #1 {all -> 0x0089, blocks: (B:13:0x002c, B:26:0x0062, B:28:0x0066, B:34:0x0075, B:35:0x0076, B:37:0x007a, B:42:0x008b, B:44:0x008f, B:46:0x0096, B:47:0x0097, B:48:0x00ae, B:18:0x0041), top: B:60:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x007a A[Catch: all -> 0x0089, TryCatch #1 {all -> 0x0089, blocks: (B:13:0x002c, B:26:0x0062, B:28:0x0066, B:34:0x0075, B:35:0x0076, B:37:0x007a, B:42:0x008b, B:44:0x008f, B:46:0x0096, B:47:0x0097, B:48:0x00ae, B:18:0x0041), top: B:60:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0088 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x008b A[Catch: all -> 0x0089, TryCatch #1 {all -> 0x0089, blocks: (B:13:0x002c, B:26:0x0062, B:28:0x0066, B:34:0x0075, B:35:0x0076, B:37:0x007a, B:42:0x008b, B:44:0x008f, B:46:0x0096, B:47:0x0097, B:48:0x00ae, B:18:0x0041), top: B:60:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0086 -> B:14:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final <T> java.lang.Object a(defpackage.nz0<? super T> r6, defpackage.nk3<? extends T> r7, boolean r8, defpackage.z80<? super defpackage.sd5> r9) {
        /*
            boolean r0 = r9 instanceof rz0.QnHx
            if (r0 == 0) goto L13
            r0 = r9
            rz0$QnHx r0 = (rz0.QnHx) r0
            int r1 = r0.D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.D = r1
            goto L18
        L13:
            rz0$QnHx r0 = new rz0$QnHx
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.C
            va0 r1 = defpackage.va0.COROUTINE_SUSPENDED
            int r2 = r0.D
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L49
            if (r2 == r3) goto L3b
            if (r2 != r4) goto L33
            boolean r6 = r0.B
            nk3 r7 = r0.A
            nz0 r8 = r0.z
            defpackage.C0239D.H(r9)     // Catch: java.lang.Throwable -> L89
        L2f:
            r5 = r8
            r8 = r6
            r6 = r5
            goto L50
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            boolean r6 = r0.B
            nk3 r7 = r0.A
            nz0 r8 = r0.z
            defpackage.C0239D.H(r9)     // Catch: java.lang.Throwable -> L89
            ap r9 = (defpackage.ap) r9     // Catch: java.lang.Throwable -> L89
            java.lang.Object r9 = r9.a     // Catch: java.lang.Throwable -> L89
            goto L62
        L49:
            defpackage.C0239D.H(r9)
            boolean r9 = r6 instanceof defpackage.o75
            if (r9 != 0) goto Lbb
        L50:
            r0.z = r6     // Catch: java.lang.Throwable -> Laf
            r0.A = r7     // Catch: java.lang.Throwable -> Laf
            r0.B = r8     // Catch: java.lang.Throwable -> Laf
            r0.D = r3     // Catch: java.lang.Throwable -> Laf
            java.lang.Object r9 = r7.d(r0)     // Catch: java.lang.Throwable -> Laf
            if (r9 != r1) goto L5f
            return r1
        L5f:
            r5 = r8
            r8 = r6
            r6 = r5
        L62:
            boolean r2 = r9 instanceof ap.QnHx     // Catch: java.lang.Throwable -> L89
            if (r2 == 0) goto L76
            java.lang.Throwable r8 = defpackage.ap.a(r9)     // Catch: java.lang.Throwable -> L89
            if (r8 != 0) goto L75
            if (r6 == 0) goto L72
            r6 = 0
            defpackage.fp1.I(r7, r6)
        L72:
            sd5 r6 = defpackage.sd5.a
            return r6
        L75:
            throw r8     // Catch: java.lang.Throwable -> L89
        L76:
            boolean r2 = r9 instanceof ap.CQf     // Catch: java.lang.Throwable -> L89
            if (r2 != 0) goto L8b
            r0.z = r8     // Catch: java.lang.Throwable -> L89
            r0.A = r7     // Catch: java.lang.Throwable -> L89
            r0.B = r6     // Catch: java.lang.Throwable -> L89
            r0.D = r4     // Catch: java.lang.Throwable -> L89
            java.lang.Object r9 = r8.f(r9, r0)     // Catch: java.lang.Throwable -> L89
            if (r9 != r1) goto L2f
            return r1
        L89:
            r8 = move-exception
            goto Lb3
        L8b:
            boolean r8 = r9 instanceof ap.QnHx     // Catch: java.lang.Throwable -> L89
            if (r8 == 0) goto L97
            r8 = r9
            ap$QnHx r8 = (ap.QnHx) r8     // Catch: java.lang.Throwable -> L89
            java.lang.Throwable r8 = r8.a     // Catch: java.lang.Throwable -> L89
            if (r8 == 0) goto L97
            throw r8     // Catch: java.lang.Throwable -> L89
        L97:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L89
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L89
            java.lang.String r1 = "Trying to call 'getOrThrow' on a failed channel result: "
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L89
            r0.append(r9)     // Catch: java.lang.Throwable -> L89
            java.lang.String r9 = r0.toString()     // Catch: java.lang.Throwable -> L89
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L89
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L89
            throw r8     // Catch: java.lang.Throwable -> L89
        Laf:
            r6 = move-exception
            r5 = r8
            r8 = r6
            r6 = r5
        Lb3:
            throw r8     // Catch: java.lang.Throwable -> Lb4
        Lb4:
            r9 = move-exception
            if (r6 == 0) goto Lba
            defpackage.fp1.I(r7, r8)
        Lba:
            throw r9
        Lbb:
            o75 r6 = (defpackage.o75) r6
            java.lang.Throwable r6 = r6.w
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rz0.a(nz0, nk3, boolean, z80):java.lang.Object");
    }
}
