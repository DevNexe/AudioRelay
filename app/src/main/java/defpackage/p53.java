package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class p53 extends ls3 {
    public p53() {
        throw null;
    }

    public p53(boolean z, float f, ri2 ri2Var) {
        super(z, f, ri2Var);
    }

    @Override // defpackage.ls3
    public final us3 b(wp1 wp1Var, boolean z, float f, ri2 ri2Var, ri2 ri2Var2, g30 g30Var) {
        View rs3Var;
        g30Var.e(331259447);
        g30Var.e(-1737891121);
        Object objE = g30Var.E(Ll.f);
        while (!(objE instanceof ViewGroup)) {
            Object parent = ((View) objE).getParent();
            if (!(parent instanceof View)) {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + objE + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
            objE = parent;
        }
        ViewGroup viewGroup = (ViewGroup) objE;
        g30Var.G();
        g30Var.e(1643267286);
        boolean zIsInEditMode = viewGroup.isInEditMode();
        Object obj = g30.QnHx.a;
        if (zIsInEditMode) {
            g30Var.e(-3686552);
            boolean zI = g30Var.I(wp1Var) | g30Var.I(this);
            Object objF = g30Var.f();
            if (zI || objF == obj) {
                objF = new iw(z, f, ri2Var, ri2Var2);
                g30Var.B(objF);
            }
            g30Var.G();
            iw iwVar = (iw) objF;
            g30Var.G();
            g30Var.G();
            return iwVar;
        }
        g30Var.G();
        int childCount = viewGroup.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                rs3Var = null;
                break;
            }
            rs3Var = viewGroup.getChildAt(i);
            if (rs3Var instanceof rs3) {
                break;
            }
            i++;
        }
        if (rs3Var == null) {
            rs3Var = new rs3(viewGroup.getContext());
            viewGroup.addView(rs3Var);
        }
        g30Var.e(-3686095);
        boolean zI2 = g30Var.I(wp1Var) | g30Var.I(this) | g30Var.I(rs3Var);
        Object objF2 = g30Var.f();
        if (zI2 || objF2 == obj) {
            objF2 = new C.k(z, f, ri2Var, ri2Var2, (rs3) rs3Var);
            g30Var.B(objF2);
        }
        g30Var.G();
        C.k kVar = (C.k) objF2;
        g30Var.G();
        return kVar;
    }
}
