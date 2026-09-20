package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a14 implements i91 {
    public final /* synthetic */ c54 A;
    public final /* synthetic */ int w;
    public final /* synthetic */ long x;
    public final /* synthetic */ long y;
    public final /* synthetic */ long z;

    public /* synthetic */ a14(long j, long j2, long j3, c54 c54Var, int i) {
        this.w = i;
        this.x = j;
        this.y = j2;
        this.z = j3;
        this.A = c54Var;
    }

    @Override // defpackage.i91
    public final Object apply(Object obj) {
        switch (this.w) {
            case 0:
                return Th.i(this.x, this.y, this.z, (vq2) obj, this.A);
            default:
                return Th.i(this.x, this.y, this.z, new wr2((a11) obj), this.A).F(3);
        }
    }
}
