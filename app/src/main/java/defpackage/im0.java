package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class im0 extends lm {
    public final /* synthetic */ int w;
    public final Object x;

    public /* synthetic */ im0(Object obj, int i) {
        this.w = i;
        this.x = obj;
    }

    @Override // defpackage.mm
    public final void a(Throwable th) {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case 0:
                ((am0) obj).a();
                break;
            default:
                ((j81) obj).invoke(th);
                break;
        }
    }

    @Override // defpackage.j81
    public final /* bridge */ /* synthetic */ sd5 invoke(Throwable th) {
        switch (this.w) {
            case 0:
                a(th);
                break;
            default:
                a(th);
                break;
        }
        return sd5.a;
    }

    public final String toString() {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case 0:
                return "DisposeOnCancel[" + ((am0) obj) + ']';
            default:
                return "InvokeOnCancel[" + ((j81) obj).getClass().getSimpleName() + '@' + lf0.a(this) + ']';
        }
    }
}
