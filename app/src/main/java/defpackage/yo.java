package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yo extends cx1 implements j81<b43.QnHx, sd5> {
    public final /* synthetic */ int A;
    public final /* synthetic */ b43 B;
    public final /* synthetic */ int C;
    public final /* synthetic */ IlK w;
    public final /* synthetic */ float x;
    public final /* synthetic */ int y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo(IlK ilK, float f, int i, int i2, int i3, b43 b43Var, int i4) {
        super(1);
        this.w = ilK;
        this.x = f;
        this.y = i;
        this.z = i2;
        this.A = i3;
        this.B = b43Var;
        this.C = i4;
    }

    @Override // defpackage.j81
    public final sd5 invoke(b43.QnHx qnHx) {
        int i;
        b43.QnHx qnHx2 = qnHx;
        boolean z = this.w instanceof ed1;
        int i2 = 0;
        int i3 = this.y;
        b43 b43Var = this.B;
        int i4 = this.A;
        float f = this.x;
        if (z) {
            i = 0;
        } else {
            i = !wm0.a(f, Float.NaN) ? i3 : (this.z - i4) - b43Var.w;
        }
        if (z) {
            i2 = !wm0.a(f, Float.NaN) ? i3 : (this.C - i4) - b43Var.x;
        }
        b43.QnHx.f(qnHx2, b43Var, i, i2);
        return sd5.a;
    }
}
