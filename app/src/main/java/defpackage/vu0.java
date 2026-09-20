package defpackage;

import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes3.dex */
public final class vu0 extends cx1 implements j81<Throwable, Throwable> {
    public final /* synthetic */ Constructor w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vu0(Constructor constructor) {
        super(1);
        this.w = constructor;
    }

    @Override // defpackage.j81
    public final Throwable invoke(Throwable th) {
        Object qnHx;
        Throwable th2 = th;
        try {
            Object objNewInstance = this.w.newInstance(th2.getMessage(), th2);
            if (objNewInstance == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            }
            qnHx = (Throwable) objNewInstance;
            if (qnHx instanceof fq3.QnHx) {
                qnHx = null;
            }
            return (Throwable) qnHx;
        } catch (Throwable th3) {
            qnHx = new fq3.QnHx(th3);
        }
    }
}
