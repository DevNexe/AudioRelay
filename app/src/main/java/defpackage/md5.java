package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class md5 extends oa0 {
    public static final md5 y = new md5();

    @Override // defpackage.oa0
    public final void g(la0 la0Var, Runnable runnable) {
        zo5 zo5Var = (zo5) la0Var.j(zo5.y);
        if (zo5Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        zo5Var.x = true;
    }

    @Override // defpackage.oa0
    public final String toString() {
        return "Dispatchers.Unconfined";
    }

    @Override // defpackage.oa0
    public final oa0 v(int i) {
        throw null;
    }
}
