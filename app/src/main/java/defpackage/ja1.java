package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", l = {63}, m = "invokeSuspend")
public final class ja1 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public nk3 A;
    public wo B;
    public int C;
    public final /* synthetic */ jo<sd5> D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja1(jo<sd5> joVar, z80<? super ja1> z80Var) {
        super(2, z80Var);
        this.D = joVar;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new ja1(this.D, z80Var);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0034 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x0035  */
    /* JADX WARN: Code duplicated, block: B:18:0x0043 A[Catch: all -> 0x0079, TryCatch #0 {all -> 0x0079, blocks: (B:16:0x003b, B:18:0x0043, B:19:0x004b, B:27:0x0064, B:29:0x0067, B:32:0x0070, B:33:0x0071, B:20:0x004c, B:22:0x0058), top: B:44:0x003b, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0058 A[Catch: all -> 0x006f, TRY_LEAVE, TryCatch #3 {, blocks: (B:20:0x004c, B:22:0x0058), top: B:50:0x004c, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0067 A[Catch: all -> 0x0079, TryCatch #0 {all -> 0x0079, blocks: (B:16:0x003b, B:18:0x0043, B:19:0x004b, B:27:0x0064, B:29:0x0067, B:32:0x0070, B:33:0x0071, B:20:0x004c, B:22:0x0058), top: B:44:0x003b, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x004c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Path cross not found for [B:22:0x0058, B:26:0x0063], limit reached: 51 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0035 -> B:44:0x003b). Please report as a decompilation issue!!! */
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
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 != r2) goto L15
            wo r1 = r7.B
            nk3 r3 = r7.A
            defpackage.C0239D.H(r8)     // Catch: java.lang.Throwable -> L7b
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r7
            goto L3b
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            defpackage.C0239D.H(r8)
            jo<sd5> r3 = r7.D
            wo r8 = r3.iterator()     // Catch: java.lang.Throwable -> L7b
            r1 = r8
            r8 = r7
        L28:
            r8.A = r3     // Catch: java.lang.Throwable -> L7b
            r8.B = r1     // Catch: java.lang.Throwable -> L7b
            r8.C = r2     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r4 = r1.a(r8)     // Catch: java.lang.Throwable -> L7b
            if (r4 != r0) goto L35
            return r0
        L35:
            r6 = r0
            r0 = r8
            r8 = r4
            r4 = r3
            r3 = r1
            r1 = r6
        L3b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L79
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L79
            if (r8 == 0) goto L72
            java.lang.Object r8 = r3.next()     // Catch: java.lang.Throwable -> L79
            sd5 r8 = (defpackage.sd5) r8     // Catch: java.lang.Throwable -> L79
            java.lang.Object r8 = defpackage.ip4.c     // Catch: java.lang.Throwable -> L79
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L79
            java.util.concurrent.atomic.AtomicReference<ia1> r5 = defpackage.ip4.i     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L6f
            ia1 r5 = (defpackage.ia1) r5     // Catch: java.lang.Throwable -> L6f
            java.util.Set<ws4> r5 = r5.g     // Catch: java.lang.Throwable -> L6f
            if (r5 == 0) goto L63
            java.util.Collection r5 = (java.util.Collection) r5     // Catch: java.lang.Throwable -> L6f
            boolean r5 = r5.isEmpty()     // Catch: java.lang.Throwable -> L6f
            r5 = r5 ^ r2
            if (r5 != r2) goto L63
            r5 = 1
            goto L64
        L63:
            r5 = 0
        L64:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L79
            if (r5 == 0) goto L6a
            defpackage.ip4.a()     // Catch: java.lang.Throwable -> L79
        L6a:
            r8 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L28
        L6f:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L79
            throw r0     // Catch: java.lang.Throwable -> L79
        L72:
            r8 = 0
            defpackage.fp1.I(r4, r8)
            sd5 r8 = defpackage.sd5.a
            return r8
        L79:
            r8 = move-exception
            goto L7d
        L7b:
            r8 = move-exception
            r4 = r3
        L7d:
            throw r8     // Catch: java.lang.Throwable -> L7e
        L7e:
            r0 = move-exception
            defpackage.fp1.I(r4, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ja1.i(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
        return ((ja1) a(ua0Var, z80Var)).i(sd5.a);
    }
}
