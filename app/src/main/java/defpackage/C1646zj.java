package defpackage;

/* JADX INFO: renamed from: zj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@if0(c = "io.ktor.client.utils.ByteChannelUtilsKt$observable$1", f = "ByteChannelUtils.kt", l = {23, 24, 26, 31}, m = "invokeSuspend")
public final class C1646zj extends px4 implements x81<uo5, z80<? super sd5>, Object> {
    public Object A;
    public fk B;
    public y81 C;
    public Object D;
    public byte[] E;
    public long F;
    public long G;
    public int H;
    public int I;
    public /* synthetic */ Object J;
    public final /* synthetic */ Long K;
    public final /* synthetic */ fk L;
    public final /* synthetic */ y81<Long, Long, z80<? super sd5>, Object> M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1646zj(Long l, fk fkVar, y81<? super Long, ? super Long, ? super z80<? super sd5>, ? extends Object> y81Var, z80<? super C1646zj> z80Var) {
        super(2, z80Var);
        this.K = l;
        this.L = fkVar;
        this.M = y81Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        C1646zj c1646zj = new C1646zj(this.K, this.L, this.M, z80Var);
        c1646zj.J = obj;
        return c1646zj;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00d2 A[Catch: all -> 0x0151, TryCatch #1 {all -> 0x0151, blocks: (B:37:0x00cc, B:39:0x00d2, B:42:0x00ed, B:46:0x011e, B:53:0x0154, B:57:0x0167, B:26:0x0093), top: B:71:0x0093 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ec A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x0112 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x0113  */
    /* JADX WARN: Code duplicated, block: B:48:0x0143 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x0144  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0144 -> B:50:0x014c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.m8
    public final java.lang.Object i(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1646zj.i(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.x81
    public final Object invoke(uo5 uo5Var, z80<? super sd5> z80Var) {
        return ((C1646zj) a(uo5Var, z80Var)).i(sd5.a);
    }
}
