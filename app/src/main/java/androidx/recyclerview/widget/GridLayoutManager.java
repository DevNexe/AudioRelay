package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import defpackage.GM;
import defpackage.UT;
import defpackage.a42;
import defpackage.bi5;
import defpackage.bj0;
import defpackage.ex0;
import java.lang.reflect.Field;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean E;
    public int F;
    public int[] G;
    public View[] H;
    public final SparseIntArray I;
    public final SparseIntArray J;
    public final QnHx K;
    public final Rect L;

    public static abstract class F1 {
        public final SparseIntArray a = new SparseIntArray();
        public final SparseIntArray b = new SparseIntArray();

        public static int a(int i, int i2) {
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                i3++;
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                } else if (i3 > i2) {
                    i4++;
                    i3 = 1;
                }
            }
            return i3 + 1 > i2 ? i4 + 1 : i4;
        }

        public final void b() {
            this.a.clear();
        }
    }

    public static final class QnHx extends F1 {
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new QnHx();
        this.L = new Rect();
        g1(RecyclerView.PRnFixed.E(context, attributeSet, i, i2).b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final int F(RecyclerView.ta taVar, RecyclerView.Aa aa) {
        if (this.p == 0) {
            return this.F;
        }
        if (aa.b() < 1) {
            return 0;
        }
        return c1(aa.b() - 1, taVar, aa) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View J0(RecyclerView.ta taVar, RecyclerView.Aa aa, int i, int i2, int i3) {
        B0();
        int iK = this.r.k();
        int iG = this.r.g();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View viewU = u(i);
            int iD = RecyclerView.PRnFixed.D(viewU);
            if (iD >= 0 && iD < i3 && d1(iD, taVar, aa) == 0) {
                if (((RecyclerView.y) viewU.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = viewU;
                    }
                } else {
                    if (this.r.e(viewU) < iG && this.r.b(viewU) >= iK) {
                        return viewU;
                    }
                    if (view == null) {
                        view = viewU;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code duplicated, block: B:88:0x011b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0121  */
    /* JADX WARN: Code duplicated, block: B:91:0x0132  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final View N(View view, int i, RecyclerView.ta taVar, RecyclerView.Aa aa) {
        View viewZ;
        int iV;
        int iV2;
        int i2;
        View view2;
        View view3;
        int i3;
        boolean z;
        RecyclerView.ta taVar2 = taVar;
        RecyclerView.Aa aa2 = aa;
        RecyclerView recyclerView = this.b;
        View view4 = null;
        if (recyclerView == null || (viewZ = recyclerView.z(view)) == null || this.a.j(viewZ)) {
            viewZ = null;
        }
        if (viewZ == null) {
            return null;
        }
        CQf cQf = (CQf) viewZ.getLayoutParams();
        int i4 = cQf.e;
        int i5 = cQf.f + i4;
        if (super.N(view, i, taVar, aa) == null) {
            return null;
        }
        if ((A0(i) == 1) != this.u) {
            iV2 = v() - 1;
            iV = -1;
            i2 = -1;
        } else {
            iV = v();
            iV2 = 0;
            i2 = 1;
        }
        boolean z2 = this.p == 1 && O0();
        int iC1 = c1(iV2, taVar2, aa2);
        int i6 = iV2;
        int i7 = i2;
        int i8 = -1;
        int iMin = 0;
        int iMin2 = 0;
        int i9 = -1;
        View view5 = null;
        while (i6 != iV) {
            int i10 = iV;
            int iC2 = c1(i6, taVar2, aa2);
            View viewU = u(i6);
            if (viewU == viewZ) {
                break;
            }
            if (!viewU.hasFocusable() || iC2 == iC1) {
                CQf cQf2 = (CQf) viewU.getLayoutParams();
                int i11 = cQf2.e;
                view2 = viewZ;
                int i12 = cQf2.f + i11;
                if (viewU.hasFocusable() && i11 == i4 && i12 == i5) {
                    return viewU;
                }
                if (!(viewU.hasFocusable() && view4 == null) && (viewU.hasFocusable() || view5 != null)) {
                    view3 = view5;
                    int iMin3 = Math.min(i12, i5) - Math.max(i11, i4);
                    if (!viewU.hasFocusable()) {
                        if (view4 == null) {
                            i3 = iMin;
                            if (!(this.c.b(viewU) && this.d.b(viewU))) {
                                if (iMin3 <= iMin2) {
                                    if (iMin3 == iMin2) {
                                        if (z2 == (i11 > i8)) {
                                        }
                                    }
                                }
                                z = true;
                            }
                            if (z) {
                                if (viewU.hasFocusable()) {
                                    int i13 = cQf2.e;
                                    iMin = Math.min(i12, i5) - Math.max(i11, i4);
                                    i9 = i13;
                                    view5 = view3;
                                    view4 = viewU;
                                } else {
                                    int i14 = cQf2.e;
                                    iMin2 = Math.min(i12, i5) - Math.max(i11, i4);
                                    i8 = i14;
                                    iMin = i3;
                                    view5 = viewU;
                                }
                            }
                            i6 += i7;
                            taVar2 = taVar;
                            aa2 = aa;
                            iV = i10;
                            viewZ = view2;
                        }
                        z = false;
                        if (z) {
                            if (viewU.hasFocusable()) {
                                int i15 = cQf2.e;
                                iMin = Math.min(i12, i5) - Math.max(i11, i4);
                                i9 = i15;
                                view5 = view3;
                                view4 = viewU;
                            } else {
                                int i16 = cQf2.e;
                                iMin2 = Math.min(i12, i5) - Math.max(i11, i4);
                                i8 = i16;
                                iMin = i3;
                                view5 = viewU;
                            }
                        }
                        i6 += i7;
                        taVar2 = taVar;
                        aa2 = aa;
                        iV = i10;
                        viewZ = view2;
                    } else if (iMin3 <= iMin) {
                        if (iMin3 == iMin) {
                            if (z2 == (i11 > i9)) {
                            }
                            if (z) {
                                if (viewU.hasFocusable()) {
                                    int i17 = cQf2.e;
                                    iMin = Math.min(i12, i5) - Math.max(i11, i4);
                                    i9 = i17;
                                    view5 = view3;
                                    view4 = viewU;
                                } else {
                                    int i18 = cQf2.e;
                                    iMin2 = Math.min(i12, i5) - Math.max(i11, i4);
                                    i8 = i18;
                                    iMin = i3;
                                    view5 = viewU;
                                }
                            }
                            i6 += i7;
                            taVar2 = taVar;
                            aa2 = aa;
                            iV = i10;
                            viewZ = view2;
                        }
                    }
                    i3 = iMin;
                    z = false;
                    if (z) {
                        if (viewU.hasFocusable()) {
                            int i19 = cQf2.e;
                            iMin = Math.min(i12, i5) - Math.max(i11, i4);
                            i9 = i19;
                            view5 = view3;
                            view4 = viewU;
                        } else {
                            int i110 = cQf2.e;
                            iMin2 = Math.min(i12, i5) - Math.max(i11, i4);
                            i8 = i110;
                            iMin = i3;
                            view5 = viewU;
                        }
                    }
                    i6 += i7;
                    taVar2 = taVar;
                    aa2 = aa;
                    iV = i10;
                    viewZ = view2;
                } else {
                    view3 = view5;
                }
                i3 = iMin;
                z = true;
                if (z) {
                    if (viewU.hasFocusable()) {
                        int i111 = cQf2.e;
                        iMin = Math.min(i12, i5) - Math.max(i11, i4);
                        i9 = i111;
                        view5 = view3;
                        view4 = viewU;
                    } else {
                        int i112 = cQf2.e;
                        iMin2 = Math.min(i12, i5) - Math.max(i11, i4);
                        i8 = i112;
                        iMin = i3;
                        view5 = viewU;
                    }
                }
                i6 += i7;
                taVar2 = taVar;
                aa2 = aa;
                iV = i10;
                viewZ = view2;
            } else {
                if (view4 != null) {
                    break;
                }
                view2 = viewZ;
                view3 = view5;
                i3 = iMin;
            }
            iMin = i3;
            view5 = view3;
            i6 += i7;
            taVar2 = taVar;
            aa2 = aa;
            iV = i10;
            viewZ = view2;
        }
        return view4 != null ? view4 : view5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [boolean, int] */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void P0(RecyclerView.ta taVar, RecyclerView.Aa aa, LinearLayoutManager.F1 f1, LinearLayoutManager.CQf cQf) {
        int i;
        int i2;
        int i3;
        int i4;
        int iA;
        int iD;
        int i5;
        int iD2;
        int iW;
        int iW2;
        ?? r12;
        View viewB;
        int iJ = this.r.j();
        boolean z = iJ != 1073741824;
        int i6 = v() > 0 ? this.G[this.F] : 0;
        if (z) {
            h1();
        }
        boolean z2 = f1.e == 1;
        int iD1 = this.F;
        if (!z2) {
            iD1 = d1(f1.d, taVar, aa) + e1(f1.d, taVar, aa);
        }
        int i7 = 0;
        while (i7 < this.F) {
            int i8 = f1.d;
            if (!(i8 >= 0 && i8 < aa.b()) || iD1 <= 0) {
                break;
            }
            int i9 = f1.d;
            int iE1 = e1(i9, taVar, aa);
            if (iE1 > this.F) {
                throw new IllegalArgumentException(ex0.c(a42.a("Item at position ", i9, " requires ", iE1, " spans but GridLayoutManager has only "), this.F, " spans."));
            }
            iD1 -= iE1;
            if (iD1 < 0 || (viewB = f1.b(taVar)) == null) {
                break;
            }
            this.H[i7] = viewB;
            i7++;
        }
        if (i7 == 0) {
            cQf.b = true;
            return;
        }
        if (z2) {
            i = 0;
            i2 = i7;
            i3 = 0;
            i4 = 1;
        } else {
            i = i7 - 1;
            i2 = -1;
            i3 = 0;
            i4 = -1;
        }
        while (i != i2) {
            View view = this.H[i];
            CQf cQf2 = (CQf) view.getLayoutParams();
            int iE2 = e1(RecyclerView.PRnFixed.D(view), taVar, aa);
            cQf2.f = iE2;
            cQf2.e = i3;
            i3 += iE2;
            i += i4;
        }
        float f = 0.0f;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            View view2 = this.H[i11];
            if (f1.k != null) {
                r12 = 0;
                r12 = 0;
                if (z2) {
                    b(view2, -1, true);
                } else {
                    b(view2, 0, true);
                }
            } else if (z2) {
                r12 = 0;
                b(view2, -1, false);
            } else {
                r12 = 0;
                b(view2, 0, false);
            }
            RecyclerView recyclerView = this.b;
            Rect rect = this.L;
            if (recyclerView == null) {
                rect.set(r12, r12, r12, r12);
            } else {
                rect.set(recyclerView.I(view2));
            }
            f1(view2, iJ, r12);
            int iC = this.r.c(view2);
            if (iC > i10) {
                i10 = iC;
            }
            float fD = (this.r.d(view2) * 1.0f) / ((CQf) view2.getLayoutParams()).f;
            if (fD > f) {
                f = fD;
            }
        }
        if (z) {
            a1(Math.max(Math.round(f * this.F), i6));
            i10 = 0;
            for (int i12 = 0; i12 < i7; i12++) {
                View view3 = this.H[i12];
                f1(view3, 1073741824, true);
                int iC2 = this.r.c(view3);
                if (iC2 > i10) {
                    i10 = iC2;
                }
            }
        }
        for (int i13 = 0; i13 < i7; i13++) {
            View view4 = this.H[i13];
            if (this.r.c(view4) != i10) {
                CQf cQf3 = (CQf) view4.getLayoutParams();
                Rect rect2 = cQf3.b;
                int i14 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) cQf3).topMargin + ((ViewGroup.MarginLayoutParams) cQf3).bottomMargin;
                int i15 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) cQf3).leftMargin + ((ViewGroup.MarginLayoutParams) cQf3).rightMargin;
                int iB1 = b1(cQf3.e, cQf3.f);
                if (this.p == 1) {
                    iW2 = RecyclerView.PRnFixed.w(false, iB1, 1073741824, i15, ((ViewGroup.MarginLayoutParams) cQf3).width);
                    iW = View.MeasureSpec.makeMeasureSpec(i10 - i14, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10 - i15, 1073741824);
                    iW = RecyclerView.PRnFixed.w(false, iB1, 1073741824, i14, ((ViewGroup.MarginLayoutParams) cQf3).height);
                    iW2 = iMakeMeasureSpec;
                }
                if (r0(view4, iW2, iW, (RecyclerView.y) view4.getLayoutParams())) {
                    view4.measure(iW2, iW);
                }
            }
        }
        cQf.a = i10;
        if (this.p == 1) {
            if (f1.f == -1) {
                iD2 = f1.b;
                i5 = iD2 - i10;
            } else {
                i5 = f1.b;
                iD2 = i10 + i5;
            }
            iA = 0;
            iD = 0;
        } else {
            if (f1.f == -1) {
                int i16 = f1.b;
                iD = i16;
                iA = i16 - i10;
            } else {
                int i17 = f1.b;
                iA = i17;
                iD = i10 + i17;
            }
            i5 = 0;
            iD2 = 0;
        }
        for (int i18 = 0; i18 < i7; i18++) {
            View view5 = this.H[i18];
            CQf cQf4 = (CQf) view5.getLayoutParams();
            if (this.p != 1) {
                int iC3 = C() + this.G[cQf4.e];
                i5 = iC3;
                iD2 = this.r.d(view5) + iC3;
            } else if (O0()) {
                int iA2 = A() + this.G[this.F - cQf4.e];
                iD = iA2;
                iA = iA2 - this.r.d(view5);
            } else {
                iA = A() + this.G[cQf4.e];
                iD = this.r.d(view5) + iA;
            }
            RecyclerView.PRnFixed.J(view5, iA, i5, iD, iD2);
            if (cQf4.c() || cQf4.b()) {
                cQf.c = true;
            }
            cQf.d = view5.hasFocusable() | cQf.d;
        }
        Arrays.fill(this.H, (Object) null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final void Q(RecyclerView.ta taVar, RecyclerView.Aa aa, View view, UT ut) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof CQf)) {
            P(view, ut);
            return;
        }
        CQf cQf = (CQf) layoutParams;
        int iC1 = c1(cQf.a(), taVar, aa);
        if (this.p == 0) {
            ut.k(UT.F1.a(cQf.e, cQf.f, iC1, 1, false));
        } else {
            ut.k(UT.F1.a(iC1, 1, cQf.e, cQf.f, false));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void Q0(RecyclerView.ta taVar, RecyclerView.Aa aa, LinearLayoutManager.QnHx qnHx, int i) {
        h1();
        if (aa.b() > 0 && !aa.g) {
            boolean z = i == 1;
            int iD1 = d1(qnHx.b, taVar, aa);
            if (z) {
                while (iD1 > 0) {
                    int i2 = qnHx.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    qnHx.b = i3;
                    iD1 = d1(i3, taVar, aa);
                }
            } else {
                int iB = aa.b() - 1;
                int i4 = qnHx.b;
                while (i4 < iB) {
                    int i5 = i4 + 1;
                    int iD2 = d1(i5, taVar, aa);
                    if (iD2 <= iD1) {
                        break;
                    }
                    i4 = i5;
                    iD1 = iD2;
                }
                qnHx.b = i4;
            }
        }
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final void R(int i, int i2) {
        QnHx qnHx = this.K;
        qnHx.b();
        qnHx.b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final void S() {
        QnHx qnHx = this.K;
        qnHx.b();
        qnHx.b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final void T(int i, int i2) {
        QnHx qnHx = this.K;
        qnHx.b();
        qnHx.b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final void U(int i, int i2) {
        QnHx qnHx = this.K;
        qnHx.b();
        qnHx.b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final void V(int i, int i2) {
        QnHx qnHx = this.K;
        qnHx.b();
        qnHx.b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final void W(RecyclerView.ta taVar, RecyclerView.Aa aa) {
        boolean z = aa.g;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.I;
        if (z) {
            int iV = v();
            for (int i = 0; i < iV; i++) {
                CQf cQf = (CQf) u(i).getLayoutParams();
                int iA = cQf.a();
                sparseIntArray2.put(iA, cQf.f);
                sparseIntArray.put(iA, cQf.e);
            }
        }
        super.W(taVar, aa);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void W0(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.W0(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final void X(RecyclerView.Aa aa) {
        super.X(aa);
        this.E = false;
    }

    public final void a1(int i) {
        int i2;
        int[] iArr = this.G;
        int i3 = this.F;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.G = iArr;
    }

    public final int b1(int i, int i2) {
        if (this.p != 1 || !O0()) {
            int[] iArr = this.G;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.G;
        int i3 = this.F;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    public final int c1(int i, RecyclerView.ta taVar, RecyclerView.Aa aa) {
        boolean z = aa.g;
        QnHx qnHx = this.K;
        if (!z) {
            int i2 = this.F;
            qnHx.getClass();
            return F1.a(i, i2);
        }
        int iB = taVar.b(i);
        if (iB == -1) {
            bj0.b("Cannot find span size for pre layout position. ", i, "GridLayoutManager");
            return 0;
        }
        int i3 = this.F;
        qnHx.getClass();
        return F1.a(iB, i3);
    }

    public final int d1(int i, RecyclerView.ta taVar, RecyclerView.Aa aa) {
        boolean z = aa.g;
        QnHx qnHx = this.K;
        if (!z) {
            int i2 = this.F;
            qnHx.getClass();
            return i % i2;
        }
        int i3 = this.J.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int iB = taVar.b(i);
        if (iB == -1) {
            bj0.b("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:", i, "GridLayoutManager");
            return 0;
        }
        int i4 = this.F;
        qnHx.getClass();
        return iB % i4;
    }

    public final int e1(int i, RecyclerView.ta taVar, RecyclerView.Aa aa) {
        boolean z = aa.g;
        QnHx qnHx = this.K;
        if (!z) {
            qnHx.getClass();
            return 1;
        }
        int i2 = this.I.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (taVar.b(i) == -1) {
            bj0.b("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:", i, "GridLayoutManager");
            return 1;
        }
        qnHx.getClass();
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final boolean f(RecyclerView.y yVar) {
        return yVar instanceof CQf;
    }

    public final void f1(View view, int i, boolean z) {
        int iW;
        int iW2;
        CQf cQf = (CQf) view.getLayoutParams();
        Rect rect = cQf.b;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) cQf).topMargin + ((ViewGroup.MarginLayoutParams) cQf).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) cQf).leftMargin + ((ViewGroup.MarginLayoutParams) cQf).rightMargin;
        int iB1 = b1(cQf.e, cQf.f);
        if (this.p == 1) {
            iW2 = RecyclerView.PRnFixed.w(false, iB1, i, i3, ((ViewGroup.MarginLayoutParams) cQf).width);
            iW = RecyclerView.PRnFixed.w(true, this.r.l(), this.m, i2, ((ViewGroup.MarginLayoutParams) cQf).height);
        } else {
            int iW3 = RecyclerView.PRnFixed.w(false, iB1, i, i2, ((ViewGroup.MarginLayoutParams) cQf).height);
            int iW4 = RecyclerView.PRnFixed.w(true, this.r.l(), this.l, i3, ((ViewGroup.MarginLayoutParams) cQf).width);
            iW = iW3;
            iW2 = iW4;
        }
        RecyclerView.y yVar = (RecyclerView.y) view.getLayoutParams();
        if (z ? r0(view, iW2, iW, yVar) : p0(view, iW2, iW, yVar)) {
            view.measure(iW2, iW);
        }
    }

    public final void g1(int i) {
        if (i == this.F) {
            return;
        }
        this.E = true;
        if (i < 1) {
            throw new IllegalArgumentException(GM.a("Span count should be at least 1. Provided ", i));
        }
        this.F = i;
        this.K.b();
        g0();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final int h0(int i, RecyclerView.ta taVar, RecyclerView.Aa aa) {
        h1();
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
        return super.h0(i, taVar, aa);
    }

    public final void h1() {
        int iZ;
        int iC;
        if (this.p == 1) {
            iZ = this.n - B();
            iC = A();
        } else {
            iZ = this.o - z();
            iC = C();
        }
        a1(iZ - iC);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final int j0(int i, RecyclerView.ta taVar, RecyclerView.Aa aa) {
        h1();
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
        return super.j0(i, taVar, aa);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final int k(RecyclerView.Aa aa) {
        return y0(aa);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final int l(RecyclerView.Aa aa) {
        return z0(aa);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final void m0(Rect rect, int i, int i2) {
        int iG;
        int iG2;
        if (this.G == null) {
            super.m0(rect, i, i2);
        }
        int iB = B() + A();
        int iZ = z() + C();
        if (this.p == 1) {
            int iHeight = rect.height() + iZ;
            RecyclerView recyclerView = this.b;
            Field field = bi5.a;
            iG2 = RecyclerView.PRnFixed.g(i2, iHeight, bi5.LPt8Fixed.d(recyclerView));
            int[] iArr = this.G;
            iG = RecyclerView.PRnFixed.g(i, iArr[iArr.length - 1] + iB, bi5.LPt8Fixed.e(this.b));
        } else {
            int iWidth = rect.width() + iB;
            RecyclerView recyclerView2 = this.b;
            Field field2 = bi5.a;
            iG = RecyclerView.PRnFixed.g(i, iWidth, bi5.LPt8Fixed.e(recyclerView2));
            int[] iArr2 = this.G;
            iG2 = RecyclerView.PRnFixed.g(i2, iArr2[iArr2.length - 1] + iZ, bi5.LPt8Fixed.d(this.b));
        }
        this.b.setMeasuredDimension(iG, iG2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final int n(RecyclerView.Aa aa) {
        return y0(aa);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final int o(RecyclerView.Aa aa) {
        return z0(aa);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final RecyclerView.y r() {
        return this.p == 0 ? new CQf(-2, -1) : new CQf(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final RecyclerView.y s(Context context, AttributeSet attributeSet) {
        return new CQf(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final RecyclerView.y t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new CQf((ViewGroup.MarginLayoutParams) layoutParams) : new CQf(layoutParams);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final boolean u0() {
        return this.z == null && !this.E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void w0(RecyclerView.Aa aa, LinearLayoutManager.F1 f1, RecyclerView.PRnFixed.F1 f2) {
        int i = this.F;
        for (int i2 = 0; i2 < this.F; i2++) {
            int i3 = f1.d;
            if (!(i3 >= 0 && i3 < aa.b()) || i <= 0) {
                return;
            }
            ((y.CQf) f2).a(f1.d, Math.max(0, f1.g));
            this.K.getClass();
            i--;
            f1.d += f1.e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.PRnFixed
    public final int x(RecyclerView.ta taVar, RecyclerView.Aa aa) {
        if (this.p == 1) {
            return this.F;
        }
        if (aa.b() < 1) {
            return 0;
        }
        return c1(aa.b() - 1, taVar, aa) + 1;
    }

    public static class CQf extends RecyclerView.y {
        public int e;
        public int f;

        public CQf(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.e = -1;
            this.f = 0;
        }

        public CQf(int i, int i2) {
            super(i, i2);
            this.e = -1;
            this.f = 0;
        }

        public CQf(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.e = -1;
            this.f = 0;
        }

        public CQf(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.e = -1;
            this.f = 0;
        }
    }

    public GridLayoutManager(int i) {
        super(1);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new QnHx();
        this.L = new Rect();
        g1(i);
    }
}
