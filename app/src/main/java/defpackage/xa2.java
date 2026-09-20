package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xa2<T> implements jb2<T> {
    @Override // defpackage.jb2
    public final void a(gb2<? super T> gb2Var) {
        if (gb2Var == null) {
            throw new NullPointerException("observer is null");
        }
        try {
            b(gb2Var);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            XTd3.w(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void b(gb2<? super T> gb2Var);
}
