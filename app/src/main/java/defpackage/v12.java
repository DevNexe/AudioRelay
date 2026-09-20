package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v12 {
    public final int a;
    public final b43[] b;
    public final boolean c;
    public final One.CQf d;
    public final One.F1 e;
    public final jy1 f;
    public final boolean g;
    public final int h;
    public final int i;
    public final m02 j;
    public final int k;
    public final long l;
    public final Object m;
    public final int n;
    public final int o;
    public final int p;

    public v12(int i, b43[] b43VarArr, boolean z, One.CQf cQf, One.F1 f1, jy1 jy1Var, boolean z2, int i2, int i3, m02 m02Var, int i4, long j, Object obj) {
        this.a = i;
        this.b = b43VarArr;
        this.c = z;
        this.d = cQf;
        this.e = f1;
        this.f = jy1Var;
        this.g = z2;
        this.h = i2;
        this.i = i3;
        this.j = m02Var;
        this.k = i4;
        this.l = j;
        this.m = obj;
        int i5 = 0;
        int iMax = 0;
        for (b43 b43Var : b43VarArr) {
            boolean z3 = this.c;
            i5 += z3 ? b43Var.x : b43Var.w;
            iMax = Math.max(iMax, !z3 ? b43Var.x : b43Var.w);
        }
        this.n = i5;
        this.o = i5 + this.k;
        this.p = iMax;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0043  */
    /* JADX WARN: Code duplicated, block: B:19:0x0046  */
    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    /* JADX WARN: Code duplicated, block: B:24:0x004f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0074  */
    /* JADX WARN: Code duplicated, block: B:35:0x0078  */
    /* JADX WARN: Code duplicated, block: B:38:0x0087  */
    /* JADX WARN: Code duplicated, block: B:39:0x008a  */
    /* JADX WARN: Code duplicated, block: B:44:0x00aa A[LOOP:0: B:14:0x003e->B:44:0x00aa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x006a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x009f A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x009f -> B:43:0x00a4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final defpackage.f12 a(int r23, int r24, int r25) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v12.a(int, int, int):f12");
    }
}
