package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class km0 extends rs1 {
    public final /* synthetic */ int A;
    public final Object B;

    public /* synthetic */ km0(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    @Override // defpackage.j81
    public final /* bridge */ /* synthetic */ sd5 invoke(Throwable th) {
        switch (this.A) {
            case 0:
                s(th);
                break;
            case 1:
                s(th);
                break;
            default:
                s(th);
                break;
        }
        return sd5.a;
    }

    @Override // defpackage.ly
    public final void s(Throwable th) {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                ((am0) obj).a();
                break;
            case 1:
                ((j81) obj).invoke(th);
                break;
            default:
                ((z80) obj).x(sd5.a);
                break;
        }
    }
}
