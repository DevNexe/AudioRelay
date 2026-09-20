package androidx.recyclerview.widget;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class Aa implements QnHx.InterfaceC0029QnHx {
    public final /* synthetic */ RecyclerView a;

    public Aa(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void a(QnHx.CQf cQf) {
        int i = cQf.a;
        RecyclerView recyclerView = this.a;
        if (i == 1) {
            recyclerView.H.R(cQf.b, cQf.d);
            return;
        }
        if (i == 2) {
            recyclerView.H.U(cQf.b, cQf.d);
        } else if (i == 4) {
            recyclerView.H.V(cQf.b, cQf.d);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.H.T(cQf.b, cQf.d);
        }
    }

    public final RecyclerView.qc b(int i) {
        RecyclerView recyclerView = this.a;
        int iH = recyclerView.A.h();
        RecyclerView.qc qcVar = null;
        for (int i2 = 0; i2 < iH; i2++) {
            RecyclerView.qc qcVarH = RecyclerView.H(recyclerView.A.g(i2));
            if (qcVarH != null && !qcVarH.i() && qcVarH.c == i) {
                if (!recyclerView.A.j(qcVarH.a)) {
                    qcVar = qcVarH;
                    break;
                }
                qcVar = qcVarH;
            }
        }
        if (qcVar == null || recyclerView.A.j(qcVar.a)) {
            return null;
        }
        return qcVar;
    }

    public final void c(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.a;
        int iH = recyclerView.A.h();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < iH; i6++) {
            View viewG = recyclerView.A.g(i6);
            RecyclerView.qc qcVarH = RecyclerView.H(viewG);
            if (qcVarH != null && !qcVarH.o() && (i4 = qcVarH.c) >= i && i4 < i5) {
                qcVarH.b(2);
                qcVarH.a(obj);
                ((RecyclerView.y) viewG.getLayoutParams()).c = true;
            }
        }
        RecyclerView.ta taVar = recyclerView.x;
        ArrayList<RecyclerView.qc> arrayList = taVar.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                recyclerView.C0 = true;
                return;
            }
            RecyclerView.qc qcVar = arrayList.get(size);
            if (qcVar != null && (i3 = qcVar.c) >= i && i3 < i5) {
                qcVar.b(2);
                taVar.e(size);
            }
        }
    }

    public final void d(int i, int i2) {
        RecyclerView recyclerView = this.a;
        int iH = recyclerView.A.h();
        for (int i3 = 0; i3 < iH; i3++) {
            RecyclerView.qc qcVarH = RecyclerView.H(recyclerView.A.g(i3));
            if (qcVarH != null && !qcVarH.o() && qcVarH.c >= i) {
                qcVarH.l(i2, false);
                recyclerView.y0.f = true;
            }
        }
        ArrayList<RecyclerView.qc> arrayList = recyclerView.x.c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView.qc qcVar = arrayList.get(i4);
            if (qcVar != null && qcVar.c >= i) {
                qcVar.l(i2, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.B0 = true;
    }

    public final void e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.a;
        int iH = recyclerView.A.h();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < iH; i11++) {
            RecyclerView.qc qcVarH = RecyclerView.H(recyclerView.A.g(i11));
            if (qcVarH != null && (i9 = qcVarH.c) >= i4 && i9 <= i3) {
                if (i9 == i) {
                    qcVarH.l(i2 - i, false);
                } else {
                    qcVarH.l(i5, false);
                }
                recyclerView.y0.f = true;
            }
        }
        RecyclerView.ta taVar = recyclerView.x;
        taVar.getClass();
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        ArrayList<RecyclerView.qc> arrayList = taVar.c;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView.qc qcVar = arrayList.get(i12);
            if (qcVar != null && (i8 = qcVar.c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    qcVar.l(i2 - i, false);
                } else {
                    qcVar.l(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.B0 = true;
    }
}
