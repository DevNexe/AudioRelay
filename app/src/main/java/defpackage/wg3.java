package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wg3<T> extends oo<T> {
    public final sg3<T> z;

    public wg3(sg3<T> sg3Var, la0 la0Var, int i, lg lgVar) {
        super(la0Var, i, lgVar);
        this.z = sg3Var;
    }

    @Override // defpackage.oo, defpackage.mz0
    public final Object a(nz0<? super T> nz0Var, z80<? super sd5> z80Var) throws Throwable {
        la0 context = z80Var.getContext();
        int i = c90.f;
        c90.QnHx qnHx = c90.QnHx.w;
        la0 la0Var = this.w;
        c90 c90Var = (c90) la0Var.j(qnHx);
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        if (c90Var == null || ur1.a(c90Var, context.j(qnHx))) {
            Object objL = l(z80Var, context.g0(la0Var), nz0Var);
            return objL == va0Var ? objL : sd5.a;
        }
        Object objR = fp1.R(new vg3(nz0Var, this, null), z80Var);
        if (objR != va0Var) {
            objR = sd5.a;
        }
        return objR == va0Var ? objR : sd5.a;
    }

    @Override // defpackage.oo
    public final Object h(te3<? super T> te3Var, z80<? super sd5> z80Var) throws Throwable {
        Object objL = l(z80Var, te3Var.g(), new v94(te3Var.f()));
        return objL == va0.COROUTINE_SUSPENDED ? objL : sd5.a;
    }

    @Override // defpackage.oo
    public final oo<T> i(la0 la0Var, int i, lg lgVar) {
        return new wg3(this.z, la0Var, i, lgVar);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x008b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0094  */
    /* JADX WARN: Code duplicated, block: B:31:0x0098  */
    /* JADX WARN: Code duplicated, block: B:33:0x009e  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a2 A[Catch: all -> 0x00ce, TRY_ENTER, TryCatch #0 {all -> 0x00ce, blocks: (B:13:0x0037, B:38:0x00b8, B:40:0x00c3, B:42:0x00c7, B:24:0x007a, B:35:0x00a2, B:45:0x00d0, B:46:0x00d3, B:18:0x004d), top: B:55:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c3 A[Catch: all -> 0x00ce, TryCatch #0 {all -> 0x00ce, blocks: (B:13:0x0037, B:38:0x00b8, B:40:0x00c3, B:42:0x00c7, B:24:0x007a, B:35:0x00a2, B:45:0x00d0, B:46:0x00d3, B:18:0x004d), top: B:55:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c7 A[Catch: all -> 0x00ce, TryCatch #0 {all -> 0x00ce, blocks: (B:13:0x0037, B:38:0x00b8, B:40:0x00c3, B:42:0x00c7, B:24:0x007a, B:35:0x00a2, B:45:0x00d0, B:46:0x00d3, B:18:0x004d), top: B:55:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d0 A[Catch: all -> 0x00ce, TryCatch #0 {all -> 0x00ce, blocks: (B:13:0x0037, B:38:0x00b8, B:40:0x00c3, B:42:0x00c7, B:24:0x007a, B:35:0x00a2, B:45:0x00d0, B:46:0x00d3, B:18:0x004d), top: B:55:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v9, types: [nz0] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v4, types: [nz0] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [ci3] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [ci3] */
    /* JADX WARN: Type inference failed for: r4v6, types: [ci3] */
    /* JADX WARN: Type inference failed for: r4v7, types: [ci3] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00b5 -> B:14:0x003a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object l(defpackage.z80 r20, defpackage.la0 r21, defpackage.nz0 r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wg3.l(z80, la0, nz0):java.lang.Object");
    }

    public final long m() {
        if (this.y != lg.SUSPEND) {
            return Long.MAX_VALUE;
        }
        int i = this.x;
        if (i == -2) {
            jo.c.getClass();
            return jo.QnHx.b;
        }
        if (i == 0) {
            return 1L;
        }
        if (i == Integer.MAX_VALUE) {
            return Long.MAX_VALUE;
        }
        long j = i;
        if (j >= 1) {
            return j;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
