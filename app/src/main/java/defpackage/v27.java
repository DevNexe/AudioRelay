package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class v27 implements u86<m17> {
    public final y96<gy5> w;
    public final y96<yb7> x;
    public final y96<d36> y;

    public v27(y96 y96Var, gc7 gc7Var, y96 y96Var2) {
        this.w = y96Var;
        this.x = gc7Var;
        this.y = y96Var2;
    }

    @Override // defpackage.y96
    public final /* bridge */ /* synthetic */ Object zzb() {
        gy5 gy5VarZzb = this.w.zzb();
        yb7 yb7VarZzb = ((gc7) this.x).zzb();
        this.y.zzb();
        return new m17(gy5VarZzb, yb7VarZzb);
    }
}
