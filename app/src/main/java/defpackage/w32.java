package defpackage;

import java.util.ArrayList;
import kotlinx.coroutines.internal.QnHx;
import kotlinx.coroutines.internal.UndeliveredElementException;

/* JADX INFO: loaded from: classes3.dex */
public class w32<E> extends NUlFixed<E> {
    public w32(j81<? super E, sd5> j81Var) {
        super(j81Var);
    }

    @Override // defpackage.NUlFixed
    public final void A(Object obj, nt<?> ntVar) {
        UndeliveredElementException undeliveredElementExceptionG = null;
        if (obj != null) {
            boolean z = obj instanceof ArrayList;
            j81<E, sd5> j81Var = this.w;
            if (z) {
                ArrayList arrayList = (ArrayList) obj;
                UndeliveredElementException undeliveredElementExceptionG2 = null;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    p94 p94Var = (p94) arrayList.get(size);
                    if (p94Var instanceof mw0t.QnHx) {
                        undeliveredElementExceptionG2 = j81Var != null ? fp1.G(j81Var, ((mw0t.QnHx) p94Var).z, undeliveredElementExceptionG2) : null;
                    } else {
                        p94Var.u(ntVar);
                    }
                }
                undeliveredElementExceptionG = undeliveredElementExceptionG2;
            } else {
                p94 p94Var2 = (p94) obj;
                if (!(p94Var2 instanceof mw0t.QnHx)) {
                    p94Var2.u(ntVar);
                } else if (j81Var != null) {
                    undeliveredElementExceptionG = fp1.G(j81Var, ((mw0t.QnHx) p94Var2).z, null);
                }
            }
        }
        if (undeliveredElementExceptionG != null) {
            throw undeliveredElementExceptionG;
        }
    }

    @Override // defpackage.mw0t
    public final boolean l() {
        return false;
    }

    @Override // defpackage.mw0t
    public final boolean n() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mw0t
    public final Object o(E e) {
        ok3 ok3Var;
        do {
            Object objO = super.o(e);
            py4 py4Var = YKK.x;
            if (objO == py4Var) {
                return py4Var;
            }
            if (objO != YKK.y) {
                if (objO instanceof nt) {
                    return objO;
                }
                throw new IllegalStateException(("Invalid offerInternal result " + objO).toString());
            }
            h52 h52Var = this.x;
            mw0t.QnHx qnHx = new mw0t.QnHx(e);
            while (true) {
                QnHx qnHxM = h52Var.m();
                if (qnHxM instanceof ok3) {
                    ok3Var = (ok3) qnHxM;
                    break;
                }
                if (qnHxM.h(qnHx, h52Var)) {
                    ok3Var = null;
                    break;
                }
            }
            if (ok3Var == null) {
                return py4Var;
            }
        } while (!(ok3Var instanceof nt));
        return ok3Var;
    }

    @Override // defpackage.NUlFixed
    public final boolean w() {
        return true;
    }

    @Override // defpackage.NUlFixed
    public final boolean x() {
        return true;
    }
}
