package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "io.ktor.client.engine.okhttp.OkHttpWebsocketSession$outgoing$1", f = "OkHttpWebsocketSession.kt", l = {62, 66}, m = "invokeSuspend")
public final class zt2 extends px4 implements x81<tST<p61>, z80<? super sd5>, Object> {
    public Object A;
    public Object B;
    public int C;
    public /* synthetic */ Object D;
    public final /* synthetic */ au2 E;
    public final /* synthetic */ cp3 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zt2(au2 au2Var, cp3 cp3Var, z80<? super zt2> z80Var) {
        super(2, z80Var);
        this.E = au2Var;
        this.F = cp3Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        zt2 zt2Var = new zt2(this.E, this.F, z80Var);
        zt2Var.D = obj;
        return zt2Var;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0082 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x008b A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:7:0x001a, B:23:0x0083, B:25:0x008b, B:27:0x0096, B:20:0x0074, B:28:0x00b1, B:30:0x00b5, B:32:0x00c4, B:34:0x00c8, B:36:0x00e2, B:43:0x00ed, B:49:0x00fc, B:50:0x0101), top: B:64:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0096 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:7:0x001a, B:23:0x0083, B:25:0x008b, B:27:0x0096, B:20:0x0074, B:28:0x00b1, B:30:0x00b5, B:32:0x00c4, B:34:0x00c8, B:36:0x00e2, B:43:0x00ed, B:49:0x00fc, B:50:0x0101), top: B:64:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:28:0x00b1 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:7:0x001a, B:23:0x0083, B:25:0x008b, B:27:0x0096, B:20:0x0074, B:28:0x00b1, B:30:0x00b5, B:32:0x00c4, B:34:0x00c8, B:36:0x00e2, B:43:0x00ed, B:49:0x00fc, B:50:0x0101), top: B:64:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b5 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:7:0x001a, B:23:0x0083, B:25:0x008b, B:27:0x0096, B:20:0x0074, B:28:0x00b1, B:30:0x00b5, B:32:0x00c4, B:34:0x00c8, B:36:0x00e2, B:43:0x00ed, B:49:0x00fc, B:50:0x0101), top: B:64:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00c4 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:7:0x001a, B:23:0x0083, B:25:0x008b, B:27:0x0096, B:20:0x0074, B:28:0x00b1, B:30:0x00b5, B:32:0x00c4, B:34:0x00c8, B:36:0x00e2, B:43:0x00ed, B:49:0x00fc, B:50:0x0101), top: B:64:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00c8 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:7:0x001a, B:23:0x0083, B:25:0x008b, B:27:0x0096, B:20:0x0074, B:28:0x00b1, B:30:0x00b5, B:32:0x00c4, B:34:0x00c8, B:36:0x00e2, B:43:0x00ed, B:49:0x00fc, B:50:0x0101), top: B:64:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00e2 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:7:0x001a, B:23:0x0083, B:25:0x008b, B:27:0x0096, B:20:0x0074, B:28:0x00b1, B:30:0x00b5, B:32:0x00c4, B:34:0x00c8, B:36:0x00e2, B:43:0x00ed, B:49:0x00fc, B:50:0x0101), top: B:64:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fc A[Catch: all -> 0x0021, TRY_ENTER, TryCatch #0 {all -> 0x0021, blocks: (B:7:0x001a, B:23:0x0083, B:25:0x008b, B:27:0x0096, B:20:0x0074, B:28:0x00b1, B:30:0x00b5, B:32:0x00c4, B:34:0x00c8, B:36:0x00e2, B:43:0x00ed, B:49:0x00fc, B:50:0x0101), top: B:64:0x001a }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0080 -> B:23:0x0083). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:22:0x0082
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.m8
    public final java.lang.Object i(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zt2.i(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.x81
    public final Object invoke(tST<p61> tst, z80<? super sd5> z80Var) {
        return ((zt2) a(tst, z80Var)).i(sd5.a);
    }
}
