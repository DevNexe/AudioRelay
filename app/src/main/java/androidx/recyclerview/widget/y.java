package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import defpackage.i95;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class y implements Runnable {
    public static final ThreadLocal<y> A = new ThreadLocal<>();
    public static final QnHx B = new QnHx();
    public long x;
    public long y;
    public final ArrayList<RecyclerView> w = new ArrayList<>();
    public final ArrayList<F1> z = new ArrayList<>();

    @SuppressLint({"VisibleForTests"})
    public static class CQf implements RecyclerView.PRnFixed.F1 {
        public int a;
        public int b;
        public int[] c;
        public int d;

        public final void a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i2 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i3 = this.d * 2;
            int[] iArr = this.c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i3 >= iArr.length) {
                int[] iArr3 = new int[i3 * 2];
                this.c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.c;
            iArr4[i3] = i;
            iArr4[i3 + 1] = i2;
            this.d++;
        }

        public final void b(RecyclerView recyclerView, boolean z) {
            this.d = 0;
            int[] iArr = this.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.PRnFixed pRn = recyclerView.H;
            if (recyclerView.G == null || pRn == null || !pRn.i) {
                return;
            }
            if (!z) {
                if (!(!recyclerView.N || recyclerView.U || recyclerView.z.g())) {
                    pRn.h(this.a, this.b, recyclerView.y0, this);
                }
            } else if (!recyclerView.z.g()) {
                pRn.i(recyclerView.G.a(), this);
            }
            int i = this.d;
            if (i > pRn.j) {
                pRn.j = i;
                pRn.k = z;
                recyclerView.x.k();
            }
        }
    }

    public static class F1 {
        public boolean a;
        public int b;
        public int c;
        public RecyclerView d;
        public int e;
    }

    public static class QnHx implements Comparator<F1> {
        /* JADX WARN: Code duplicated, block: B:17:0x0022  */
        @Override // java.util.Comparator
        public final int compare(F1 f1, F1 f2) {
            F1 f3 = f1;
            F1 f4 = f2;
            RecyclerView recyclerView = f3.d;
            int i = 1;
            if ((recyclerView == null) == (f4.d == null)) {
                boolean z = f3.a;
                if (z == f4.a) {
                    int i2 = f4.b - f3.b;
                    if (i2 != 0) {
                        return i2;
                    }
                    int i3 = f3.c - f4.c;
                    if (i3 != 0) {
                        return i3;
                    }
                    return 0;
                }
                if (z) {
                    i = -1;
                }
            } else if (recyclerView != null) {
                i = -1;
            }
            return i;
        }
    }

    public static RecyclerView.qc c(RecyclerView recyclerView, int i, long j) {
        boolean z;
        int iH = recyclerView.A.h();
        int i2 = 0;
        while (true) {
            if (i2 >= iH) {
                z = false;
                break;
            }
            RecyclerView.qc qcVarH = RecyclerView.H(recyclerView.A.g(i2));
            if (qcVarH.c == i && !qcVarH.g()) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            return null;
        }
        RecyclerView.ta taVar = recyclerView.x;
        try {
            recyclerView.N();
            RecyclerView.qc qcVarI = taVar.i(i, j);
            if (qcVarI != null) {
                if (!qcVarI.f() || qcVarI.g()) {
                    taVar.a(qcVarI, false);
                } else {
                    taVar.f(qcVarI.a);
                }
            }
            return qcVarI;
        } finally {
            recyclerView.O(false);
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.x == 0) {
            this.x = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        CQf cQf = recyclerView.x0;
        cQf.a = i;
        cQf.b = i2;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0137  */
    public final void b(long j) {
        F1 f1;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        F1 f2;
        ArrayList<RecyclerView> arrayList = this.w;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = arrayList.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                CQf cQf = recyclerView3.x0;
                cQf.b(recyclerView3, false);
                i += cQf.d;
            }
        }
        ArrayList<F1> arrayList2 = this.z;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = arrayList.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                CQf cQf2 = recyclerView4.x0;
                int iAbs = Math.abs(cQf2.b) + Math.abs(cQf2.a);
                for (int i5 = 0; i5 < cQf2.d * 2; i5 += 2) {
                    if (i3 >= arrayList2.size()) {
                        f2 = new F1();
                        arrayList2.add(f2);
                    } else {
                        f2 = arrayList2.get(i3);
                    }
                    int[] iArr = cQf2.c;
                    int i6 = iArr[i5 + 1];
                    f2.a = i6 <= iAbs;
                    f2.b = iAbs;
                    f2.c = i6;
                    f2.d = recyclerView4;
                    f2.e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList2, B);
        for (int i7 = 0; i7 < arrayList2.size() && (recyclerView = (f1 = arrayList2.get(i7)).d) != null; i7++) {
            RecyclerView.qc qcVarC = c(recyclerView, f1.e, f1.a ? Long.MAX_VALUE : j);
            if (qcVarC != null && qcVarC.b != null && qcVarC.f() && !qcVarC.g() && (recyclerView2 = qcVarC.b.get()) != null) {
                if (recyclerView2.U && recyclerView2.A.h() != 0) {
                    RecyclerView.byN byn = recyclerView2.g0;
                    if (byn != null) {
                        byn.e();
                    }
                    RecyclerView.PRnFixed pRn = recyclerView2.H;
                    RecyclerView.ta taVar = recyclerView2.x;
                    if (pRn != null) {
                        pRn.b0(taVar);
                        recyclerView2.H.c0(taVar);
                    }
                    taVar.a.clear();
                    taVar.d();
                }
                CQf cQf3 = recyclerView2.x0;
                cQf3.b(recyclerView2, true);
                if (cQf3.d != 0) {
                    try {
                        int i8 = i95.a;
                        i95.QnHx.a("RV Nested Prefetch");
                        RecyclerView.Aa aa = recyclerView2.y0;
                        RecyclerView.LPt8Fixed lPt8 = recyclerView2.G;
                        aa.d = 1;
                        aa.e = lPt8.a();
                        aa.g = false;
                        aa.h = false;
                        aa.i = false;
                        for (int i9 = 0; i9 < cQf3.d * 2; i9 += 2) {
                            c(recyclerView2, cQf3.c[i9], j);
                        }
                        i95.QnHx.b();
                    } catch (Throwable th) {
                        int i10 = i95.a;
                        i95.QnHx.b();
                        throw th;
                    }
                }
            }
            f1.a = false;
            f1.b = 0;
            f1.c = 0;
            f1.d = null;
            f1.e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = i95.a;
            i95.QnHx.a("RV Prefetch");
            ArrayList<RecyclerView> arrayList = this.w;
            if (arrayList.isEmpty()) {
                this.x = 0L;
                return;
            }
            int size = arrayList.size();
            long jMax = 0;
            for (int i2 = 0; i2 < size; i2++) {
                RecyclerView recyclerView = arrayList.get(i2);
                if (recyclerView.getWindowVisibility() == 0) {
                    jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                this.x = 0L;
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.y);
                this.x = 0L;
            }
        } finally {
            this.x = 0L;
            int i3 = i95.a;
            i95.QnHx.b();
        }
    }
}
