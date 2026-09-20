package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public interface q91<T> extends mz0<T> {

    public static final class QnHx {
        public static /* synthetic */ mz0 a(q91 q91Var, oa0 oa0Var, int i, lg lgVar, int i2) {
            la0 la0Var = oa0Var;
            if ((i2 & 1) != 0) {
                la0Var = xr0.w;
            }
            if ((i2 & 2) != 0) {
                i = -3;
            }
            if ((i2 & 4) != 0) {
                lgVar = lg.SUSPEND;
            }
            return q91Var.c(la0Var, i, lgVar);
        }
    }

    mz0<T> c(la0 la0Var, int i, lg lgVar);
}
