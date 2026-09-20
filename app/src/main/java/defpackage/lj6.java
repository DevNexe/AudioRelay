package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class lj6 implements yu2, nu2, ju2, q97 {
    public final /* synthetic */ int w;
    public final Executor x;
    public final kc7 y;
    public final Object z;

    public /* synthetic */ lj6(Executor executor, Object obj, kc7 kc7Var, int i) {
        this.w = i;
        this.x = executor;
        this.z = obj;
        this.y = kc7Var;
    }

    @Override // defpackage.q97
    public final void a(w05 w05Var) {
        int i = this.w;
        Executor executor = this.x;
        switch (i) {
            case 0:
                executor.execute(new iq5(13, this, w05Var));
                break;
            default:
                executor.execute(new iq5(15, this, w05Var));
                break;
        }
    }

    @Override // defpackage.ju2
    public final void c() {
        int i = this.w;
        kc7 kc7Var = this.y;
        switch (i) {
            case 0:
                kc7Var.t();
                break;
            default:
                kc7Var.t();
                break;
        }
    }

    @Override // defpackage.nu2
    public final void onFailure(Exception exc) {
        int i = this.w;
        kc7 kc7Var = this.y;
        switch (i) {
            case 0:
                kc7Var.r(exc);
                break;
            default:
                kc7Var.r(exc);
                break;
        }
    }

    @Override // defpackage.yu2
    public final void onSuccess(Object obj) {
        int i = this.w;
        kc7 kc7Var = this.y;
        switch (i) {
            case 0:
                kc7Var.s(obj);
                break;
            default:
                kc7Var.s(obj);
                break;
        }
    }
}
