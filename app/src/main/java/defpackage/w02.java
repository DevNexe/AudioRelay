package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w02 implements xb2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ c02 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ One.CQf e;
    public final /* synthetic */ One.F1 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ m02 j;
    public final /* synthetic */ long k;

    public w02(int i, int i2, c02 c02Var, boolean z, One.CQf cQf, One.F1 f1, boolean z2, int i3, int i4, m02 m02Var, long j) {
        this.a = i;
        this.b = i2;
        this.c = c02Var;
        this.d = z;
        this.e = cQf;
        this.f = f1;
        this.g = z2;
        this.h = i3;
        this.i = i4;
        this.j = m02Var;
        this.k = j;
    }

    @Override // defpackage.xb2
    public final v12 a(int i, Object obj, b43[] b43VarArr) {
        return new v12(i, b43VarArr, this.d, this.e, this.f, this.c.getLayoutDirection(), this.g, this.h, this.i, this.j, i == this.a + (-1) ? 0 : this.b, this.k, obj);
    }
}
