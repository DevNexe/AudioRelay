package defpackage;

import kotlinx.coroutines.internal.UndeliveredElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class s94<E> extends r94<E> {
    public final j81<E, sd5> B;

    public s94(Object obj, xm xmVar, j81 j81Var) {
        super(obj, xmVar);
        this.B = j81Var;
    }

    @Override // kotlinx.coroutines.internal.QnHx
    public final boolean p() {
        if (!super.p()) {
            return false;
        }
        w();
        return true;
    }

    @Override // defpackage.p94
    public final void w() {
        la0 context = this.A.getContext();
        UndeliveredElementException undeliveredElementExceptionG = fp1.G(this.B, this.z, null);
        if (undeliveredElementExceptionG != null) {
            ps0.K(context, undeliveredElementExceptionG);
        }
    }
}
