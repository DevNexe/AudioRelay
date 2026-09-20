package defpackage;

import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes3.dex */
public final class yu0 extends cx1 implements j81<Throwable, Throwable> {
    public final /* synthetic */ Constructor w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yu0(Constructor constructor) {
        super(1);
        this.w = constructor;
    }

    @Override // defpackage.j81
    public final Throwable invoke(Throwable th) {
        Object qnHx;
        Throwable th2 = th;
        try {
            Object objNewInstance = this.w.newInstance(new Object[0]);
            if (objNewInstance == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            }
            Throwable th3 = (Throwable) objNewInstance;
            th3.initCause(th2);
            qnHx = th3;
            boolean z = qnHx instanceof fq3.QnHx;
            Object obj = qnHx;
            if (z) {
                obj = null;
            }
            return (Throwable) obj;
        } catch (Throwable th4) {
            qnHx = new fq3.QnHx(th4);
        }
    }
}
