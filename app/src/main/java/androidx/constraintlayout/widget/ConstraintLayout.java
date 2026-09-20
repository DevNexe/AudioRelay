package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import defpackage.O;
import defpackage.bb1;
import defpackage.bm5;
import defpackage.cb1;
import defpackage.cm5;
import defpackage.e70;
import defpackage.f70;
import defpackage.f9;
import defpackage.fk5;
import defpackage.g7;
import defpackage.gd1;
import defpackage.gk5;
import defpackage.i70;
import defpackage.k8;
import defpackage.o32;
import defpackage.oj0;
import defpackage.w60;
import defpackage.wc1;
import defpackage.wh5;
import defpackage.z60;
import defpackage.zk0;
import defpackage.zn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static final /* synthetic */ int L = 0;
    public int A;
    public int B;
    public int C;
    public boolean D;
    public int E;
    public androidx.constraintlayout.widget.CQf F;
    public z60 G;
    public int H;
    public HashMap<String, Integer> I;
    public final SparseArray<e70> J;
    public final CQf K;
    public final SparseArray<View> w;
    public final ArrayList<androidx.constraintlayout.widget.QnHx> x;
    public final f70 y;
    public int z;

    public class CQf implements f9.CQf {
        public final ConstraintLayout a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;

        public CQf(ConstraintLayout constraintLayout) {
            this.a = constraintLayout;
        }

        /* JADX WARN: Code duplicated, block: B:105:0x0165  */
        /* JADX WARN: Code duplicated, block: B:110:0x0170  */
        /* JADX WARN: Code duplicated, block: B:121:0x0190  */
        /* JADX WARN: Code duplicated, block: B:123:0x0194  */
        /* JADX WARN: Code duplicated, block: B:126:0x019f  */
        /* JADX WARN: Code duplicated, block: B:129:0x01b0  */
        /* JADX WARN: Code duplicated, block: B:130:0x01b8  */
        /* JADX WARN: Code duplicated, block: B:132:0x01c1  */
        /* JADX WARN: Code duplicated, block: B:133:0x01c8  */
        /* JADX WARN: Code duplicated, block: B:136:0x01d2  */
        /* JADX WARN: Code duplicated, block: B:137:0x01d7  */
        /* JADX WARN: Code duplicated, block: B:140:0x01dc  */
        /* JADX WARN: Code duplicated, block: B:143:0x01e4  */
        /* JADX WARN: Code duplicated, block: B:144:0x01e9  */
        /* JADX WARN: Code duplicated, block: B:147:0x01ee  */
        /* JADX WARN: Code duplicated, block: B:150:0x01f6 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:152:0x0201 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:153:0x0203 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:156:0x020e A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:160:0x0216 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:161:0x0218  */
        /* JADX WARN: Code duplicated, block: B:162:0x021f  */
        /* JADX WARN: Code duplicated, block: B:164:0x0223  */
        /* JADX WARN: Code duplicated, block: B:167:0x0239  */
        /* JADX WARN: Code duplicated, block: B:168:0x023b  */
        /* JADX WARN: Code duplicated, block: B:175:0x0247  */
        /* JADX WARN: Code duplicated, block: B:178:0x024e  */
        /* JADX WARN: Code duplicated, block: B:179:0x0250  */
        /* JADX WARN: Code duplicated, block: B:47:0x00b8  */
        /* JADX WARN: Code duplicated, block: B:49:0x00bb A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:50:0x00bd  */
        /* JADX WARN: Code duplicated, block: B:52:0x00c0  */
        /* JADX WARN: Code duplicated, block: B:54:0x00c5  */
        /* JADX WARN: Code duplicated, block: B:56:0x00c9  */
        /* JADX WARN: Code duplicated, block: B:57:0x00d0  */
        /* JADX WARN: Code duplicated, block: B:59:0x00d3  */
        /* JADX WARN: Code duplicated, block: B:62:0x00e3  */
        /* JADX WARN: Code duplicated, block: B:64:0x00f0  */
        /* JADX WARN: Code duplicated, block: B:65:0x00f2  */
        /* JADX WARN: Code duplicated, block: B:68:0x00fa  */
        /* JADX WARN: Code duplicated, block: B:81:0x0124  */
        /* JADX WARN: Code duplicated, block: B:82:0x0133  */
        /* JADX WARN: Code duplicated, block: B:84:0x0140  */
        /* JADX WARN: Code duplicated, block: B:85:0x0142  */
        /* JADX WARN: Code duplicated, block: B:87:0x0145  */
        /* JADX WARN: Code duplicated, block: B:88:0x0147  */
        /* JADX WARN: Code duplicated, block: B:94:0x0151  */
        /* JADX WARN: Code duplicated, block: B:99:0x0159  */
        @SuppressLint({"WrongCall"})
        public final void a(e70 e70Var, f9.QnHx qnHx) {
            int iMakeMeasureSpec;
            boolean z;
            int iH;
            int i;
            int iMakeMeasureSpec2;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            QnHx qnHx2;
            int measuredWidth;
            int measuredHeight;
            int i2;
            int i3;
            int iMin;
            int i4;
            int i5;
            int iMin2;
            int i6;
            int i7;
            int measuredWidth2;
            int measuredHeight2;
            int baseline;
            int i8;
            boolean z9;
            boolean z10;
            boolean z11;
            boolean z12;
            int i9;
            if (e70Var.X == 8 && !e70Var.x) {
                qnHx.e = 0;
                qnHx.f = 0;
                qnHx.g = 0;
                return;
            }
            int i10 = qnHx.a;
            int i11 = qnHx.b;
            int i12 = qnHx.c;
            int i13 = qnHx.d;
            int i14 = this.b + this.c;
            int i15 = this.d;
            View view = (View) e70Var.W;
            int iH2 = O.h(i10);
            w60 w60Var = e70Var.A;
            w60 w60Var2 = e70Var.y;
            int[] iArr = e70Var.g;
            if (iH2 != 0) {
                if (iH2 == 1) {
                    iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i15, -2);
                    iArr[2] = -2;
                } else if (iH2 == 2) {
                    iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i15, -2);
                    boolean z13 = e70Var.j == 1;
                    iArr[2] = 0;
                    if (qnHx.j) {
                        boolean z14 = !(!z13 || iArr[3] == 0 || iArr[0] == e70Var.j()) || (view instanceof LPt8Fixed);
                        if (!z13 || z14) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(e70Var.j(), 1073741824);
                        }
                    }
                } else if (iH2 != 3) {
                    iMakeMeasureSpec = 0;
                } else {
                    int i16 = this.f;
                    int i17 = w60Var2 != null ? w60Var2.e + 0 : 0;
                    if (w60Var != null) {
                        i17 += w60Var.e;
                    }
                    iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i16, i15 + i17, -1);
                    iArr[2] = -1;
                }
                z = true;
                iH = O.h(i11);
                if (iH != 0) {
                    i = 3;
                    int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
                    iArr[3] = i13;
                    iMakeMeasureSpec2 = iMakeMeasureSpec3;
                    z2 = false;
                } else if (iH != 1) {
                    if (iH != 2) {
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(this.g, i14, -2);
                        if (e70Var.k == 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        iArr[3] = 0;
                        if (qnHx.j) {
                            boolean z15 = !(z12 || iArr[2] == 0 || iArr[1] == e70Var.g()) || (view instanceof LPt8Fixed);
                            if (z12 || z15) {
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(e70Var.g(), 1073741824);
                                z2 = false;
                            }
                        }
                        iMakeMeasureSpec2 = childMeasureSpec;
                        z2 = true;
                    } else if (iH != 3) {
                        z2 = false;
                        iMakeMeasureSpec2 = 0;
                    } else {
                        int i18 = this.g;
                        if (w60Var2 != null) {
                            i9 = e70Var.z.e + 0;
                        } else {
                            i9 = 0;
                        }
                        if (w60Var != null) {
                            i9 += e70Var.B.e;
                        }
                        iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i18, i14 + i9, -1);
                        iArr[3] = -1;
                        z2 = false;
                    }
                    i = 3;
                } else {
                    int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i14, -2);
                    i = 3;
                    iArr[3] = -2;
                    iMakeMeasureSpec2 = childMeasureSpec2;
                    z2 = true;
                }
                if (i10 == i) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (i11 == i) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (i11 != 4 || i11 == 1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (i10 != 4 || i10 == 1) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z3 || e70Var.N <= 0.0f) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                if (z4 || e70Var.N <= 0.0f) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                qnHx2 = (QnHx) view.getLayoutParams();
                if (qnHx.j && z3 && e70Var.j == 0 && z4 && e70Var.k == 0) {
                    measuredWidth2 = 0;
                    measuredHeight2 = 0;
                    baseline = 0;
                    i8 = -1;
                } else {
                    if ((view instanceof fk5) || !(e70Var instanceof gk5)) {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    }
                    measuredWidth = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    int baseline2 = view.getBaseline();
                    if (z) {
                        i2 = 0;
                        iArr[0] = measuredWidth;
                        iArr[2] = measuredHeight;
                    } else {
                        i2 = 0;
                        iArr[0] = 0;
                        iArr[2] = 0;
                    }
                    if (z2) {
                        iArr[1] = measuredHeight;
                        iArr[3] = measuredWidth;
                    } else {
                        iArr[1] = i2;
                        iArr[3] = i2;
                    }
                    i3 = e70Var.m;
                    if (i3 > 0) {
                        iMin = Math.max(i3, measuredWidth);
                    } else {
                        iMin = measuredWidth;
                    }
                    i4 = e70Var.n;
                    if (i4 > 0) {
                        iMin = Math.min(i4, iMin);
                    }
                    i5 = e70Var.p;
                    if (i5 > 0) {
                        iMin2 = Math.max(i5, measuredHeight);
                    } else {
                        iMin2 = measuredHeight;
                    }
                    i6 = e70Var.q;
                    if (i6 > 0) {
                        iMin2 = Math.min(i6, iMin2);
                    }
                    if (!z7 && z5) {
                        iMin = (int) ((iMin2 * e70Var.N) + 0.5f);
                    } else if (z8 && z6) {
                        iMin2 = (int) ((iMin / e70Var.N) + 0.5f);
                    }
                    if (measuredWidth == iMin || measuredHeight != iMin2) {
                        if (measuredWidth != iMin) {
                            i7 = 1073741824;
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                        } else {
                            i7 = 1073741824;
                        }
                        if (measuredHeight != iMin2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin2, i7);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    } else {
                        measuredWidth2 = iMin;
                        measuredHeight2 = iMin2;
                        baseline = baseline2;
                    }
                    i8 = -1;
                }
                if (baseline != i8) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (measuredWidth2 == qnHx.c || measuredHeight2 != qnHx.d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                qnHx.i = z10;
                if (qnHx2.X) {
                    z11 = true;
                } else {
                    z11 = z9;
                }
                if (z11 && baseline != -1 && e70Var.R != baseline) {
                    qnHx.i = true;
                }
                qnHx.e = measuredWidth2;
                qnHx.f = measuredHeight2;
                qnHx.h = z11;
                qnHx.g = baseline;
            }
            int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            iArr[2] = i12;
            iMakeMeasureSpec = iMakeMeasureSpec4;
            z = false;
            iH = O.h(i11);
            if (iH != 0) {
                i = 3;
                int iMakeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
                iArr[3] = i13;
                iMakeMeasureSpec2 = iMakeMeasureSpec5;
                z2 = false;
            } else if (iH != 1) {
                if (iH != 2) {
                    int childMeasureSpec3 = ViewGroup.getChildMeasureSpec(this.g, i14, -2);
                    if (e70Var.k == 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    iArr[3] = 0;
                    if (qnHx.j) {
                        if (z12) {
                        }
                        if (z12) {
                        }
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(e70Var.g(), 1073741824);
                        z2 = false;
                    }
                    iMakeMeasureSpec2 = childMeasureSpec3;
                    z2 = true;
                } else if (iH != 3) {
                    z2 = false;
                    iMakeMeasureSpec2 = 0;
                } else {
                    int i19 = this.g;
                    if (w60Var2 != null) {
                        i9 = e70Var.z.e + 0;
                    } else {
                        i9 = 0;
                    }
                    if (w60Var != null) {
                        i9 += e70Var.B.e;
                    }
                    iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i19, i14 + i9, -1);
                    iArr[3] = -1;
                    z2 = false;
                }
                i = 3;
            } else {
                int childMeasureSpec4 = ViewGroup.getChildMeasureSpec(this.g, i14, -2);
                i = 3;
                iArr[3] = -2;
                iMakeMeasureSpec2 = childMeasureSpec4;
                z2 = true;
            }
            if (i10 == i) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (i11 == i) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (i11 != 4) {
                z5 = true;
            } else {
                z5 = true;
            }
            if (i10 != 4) {
                z6 = true;
            } else {
                z6 = true;
            }
            if (z3) {
                z7 = false;
            } else {
                z7 = false;
            }
            if (z4) {
                z8 = false;
            } else {
                z8 = false;
            }
            qnHx2 = (QnHx) view.getLayoutParams();
            if (qnHx.j) {
                if (view instanceof fk5) {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                measuredWidth = view.getMeasuredWidth();
                measuredHeight = view.getMeasuredHeight();
                int baseline3 = view.getBaseline();
                if (z) {
                    i2 = 0;
                    iArr[0] = measuredWidth;
                    iArr[2] = measuredHeight;
                } else {
                    i2 = 0;
                    iArr[0] = 0;
                    iArr[2] = 0;
                }
                if (z2) {
                    iArr[1] = measuredHeight;
                    iArr[3] = measuredWidth;
                } else {
                    iArr[1] = i2;
                    iArr[3] = i2;
                }
                i3 = e70Var.m;
                if (i3 > 0) {
                    iMin = Math.max(i3, measuredWidth);
                } else {
                    iMin = measuredWidth;
                }
                i4 = e70Var.n;
                if (i4 > 0) {
                    iMin = Math.min(i4, iMin);
                }
                i5 = e70Var.p;
                if (i5 > 0) {
                    iMin2 = Math.max(i5, measuredHeight);
                } else {
                    iMin2 = measuredHeight;
                }
                i6 = e70Var.q;
                if (i6 > 0) {
                    iMin2 = Math.min(i6, iMin2);
                }
                if (!z7) {
                    if (z8) {
                        iMin2 = (int) ((iMin / e70Var.N) + 0.5f);
                    }
                } else if (z8) {
                    iMin2 = (int) ((iMin / e70Var.N) + 0.5f);
                }
                if (measuredWidth == iMin) {
                    if (measuredWidth != iMin) {
                        i7 = 1073741824;
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                    } else {
                        i7 = 1073741824;
                    }
                    if (measuredHeight != iMin2) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin2, i7);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                } else {
                    if (measuredWidth != iMin) {
                        i7 = 1073741824;
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                    } else {
                        i7 = 1073741824;
                    }
                    if (measuredHeight != iMin2) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin2, i7);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i8 = -1;
            } else {
                if (view instanceof fk5) {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                measuredWidth = view.getMeasuredWidth();
                measuredHeight = view.getMeasuredHeight();
                int baseline4 = view.getBaseline();
                if (z) {
                    i2 = 0;
                    iArr[0] = measuredWidth;
                    iArr[2] = measuredHeight;
                } else {
                    i2 = 0;
                    iArr[0] = 0;
                    iArr[2] = 0;
                }
                if (z2) {
                    iArr[1] = measuredHeight;
                    iArr[3] = measuredWidth;
                } else {
                    iArr[1] = i2;
                    iArr[3] = i2;
                }
                i3 = e70Var.m;
                if (i3 > 0) {
                    iMin = Math.max(i3, measuredWidth);
                } else {
                    iMin = measuredWidth;
                }
                i4 = e70Var.n;
                if (i4 > 0) {
                    iMin = Math.min(i4, iMin);
                }
                i5 = e70Var.p;
                if (i5 > 0) {
                    iMin2 = Math.max(i5, measuredHeight);
                } else {
                    iMin2 = measuredHeight;
                }
                i6 = e70Var.q;
                if (i6 > 0) {
                    iMin2 = Math.min(i6, iMin2);
                }
                if (!z7) {
                    if (z8) {
                        iMin2 = (int) ((iMin / e70Var.N) + 0.5f);
                    }
                } else if (z8) {
                    iMin2 = (int) ((iMin / e70Var.N) + 0.5f);
                }
                if (measuredWidth == iMin) {
                    if (measuredWidth != iMin) {
                        i7 = 1073741824;
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                    } else {
                        i7 = 1073741824;
                    }
                    if (measuredHeight != iMin2) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin2, i7);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                } else {
                    if (measuredWidth != iMin) {
                        i7 = 1073741824;
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                    } else {
                        i7 = 1073741824;
                    }
                    if (measuredHeight != iMin2) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin2, i7);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i8 = -1;
            }
            if (baseline != i8) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (measuredWidth2 == qnHx.c) {
                z10 = true;
            } else {
                z10 = true;
            }
            qnHx.i = z10;
            if (qnHx2.X) {
                z11 = true;
            } else {
                z11 = z9;
            }
            if (z11) {
                qnHx.i = true;
            }
            qnHx.e = measuredWidth2;
            qnHx.f = measuredHeight2;
            qnHx.h = z11;
            qnHx.g = baseline;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.w = new SparseArray<>();
        this.x = new ArrayList<>(4);
        this.y = new f70();
        this.z = 0;
        this.A = 0;
        this.B = Integer.MAX_VALUE;
        this.C = Integer.MAX_VALUE;
        this.D = true;
        this.E = 263;
        this.F = null;
        this.G = null;
        this.H = -1;
        this.I = new HashMap<>();
        this.J = new SparseArray<>();
        this.K = new CQf(this);
        c(attributeSet, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
    }

    public final e70 b(View view) {
        if (view == this) {
            return this.y;
        }
        if (view == null) {
            return null;
        }
        return ((QnHx) view.getLayoutParams()).l0;
    }

    public final void c(AttributeSet attributeSet, int i) {
        f70 f70Var = this.y;
        f70Var.W = this;
        CQf cQf = this.K;
        f70Var.h0 = cQf;
        f70Var.g0.f = cQf;
        this.w.put(getId(), this);
        this.F = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g7.y, i, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 9) {
                    this.z = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.z);
                } else if (index == 10) {
                    this.A = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.A);
                } else if (index == 7) {
                    this.B = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.B);
                } else if (index == 8) {
                    this.C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.C);
                } else if (index == 89) {
                    this.E = typedArrayObtainStyledAttributes.getInt(index, this.E);
                } else if (index == 38) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            this.G = new z60(getContext(), resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.G = null;
                        }
                    }
                } else if (index == 18) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        androidx.constraintlayout.widget.CQf cQf2 = new androidx.constraintlayout.widget.CQf();
                        this.F = cQf2;
                        cQf2.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.F = null;
                    }
                    this.H = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        int i3 = this.E;
        f70Var.q0 = i3;
        o32.p = (i3 & 256) == 256;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof QnHx;
    }

    public final boolean d() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<androidx.constraintlayout.widget.QnHx> arrayList = this.x;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                arrayList.get(i).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        int i8 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i6;
                        float f2 = i7;
                        float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i7 + i8;
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    public final void e(String str, Integer num) {
        if ((str instanceof String) && (num instanceof Integer)) {
            if (this.I == null) {
                this.I = new HashMap<>();
            }
            int iIndexOf = str.indexOf("/");
            if (iIndexOf != -1) {
                str = str.substring(iIndexOf + 1);
            }
            this.I.put(str, Integer.valueOf(num.intValue()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:269:0x04f9  */
    public final boolean f() {
        int i;
        boolean z;
        int i2;
        f70 f70Var;
        boolean z2;
        int i3;
        boolean z3;
        SparseArray<View> sparseArray;
        int i4;
        int i5;
        e70 e70Var;
        e70 e70Var2;
        e70 e70Var3;
        e70 e70Var4;
        SparseArray<View> sparseArray2;
        int i6;
        int i7;
        float fAbs;
        int i8;
        e70 e70Var5;
        ConstraintLayout constraintLayout = this;
        int childCount = getChildCount();
        int i9 = 0;
        int i10 = 0;
        while (true) {
            i = 1;
            if (i10 >= childCount) {
                z = false;
                break;
            }
            if (constraintLayout.getChildAt(i10).isLayoutRequested()) {
                z = true;
                break;
            }
            i10++;
        }
        if (z) {
            boolean zIsInEditMode = isInEditMode();
            int childCount2 = getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                e70 e70VarB = constraintLayout.b(constraintLayout.getChildAt(i11));
                if (e70VarB != null) {
                    e70VarB.q();
                }
            }
            SparseArray<View> sparseArray3 = constraintLayout.w;
            Object obj = null;
            f70 f70Var2 = constraintLayout.y;
            if (zIsInEditMode) {
                for (int i12 = 0; i12 < childCount2; i12++) {
                    View childAt = constraintLayout.getChildAt(i12);
                    try {
                        String resourceName = getResources().getResourceName(childAt.getId());
                        constraintLayout.e(resourceName, Integer.valueOf(childAt.getId()));
                        int iIndexOf = resourceName.indexOf(47);
                        if (iIndexOf != -1) {
                            resourceName = resourceName.substring(iIndexOf + 1);
                        }
                        int id = childAt.getId();
                        if (id != 0) {
                            View viewFindViewById = sparseArray3.get(id);
                            if (viewFindViewById == null && (viewFindViewById = constraintLayout.findViewById(id)) != null && viewFindViewById != constraintLayout && viewFindViewById.getParent() == constraintLayout) {
                                constraintLayout.onViewAdded(viewFindViewById);
                            }
                            if (viewFindViewById != constraintLayout) {
                                e70Var5 = viewFindViewById == null ? null : ((QnHx) viewFindViewById.getLayoutParams()).l0;
                            }
                            e70Var5.Y = resourceName;
                        }
                        e70Var5 = f70Var2;
                        e70Var5.Y = resourceName;
                    } catch (Resources.NotFoundException unused) {
                    }
                }
            }
            if (constraintLayout.H != -1) {
                for (int i13 = 0; i13 < childCount2; i13++) {
                    View childAt2 = constraintLayout.getChildAt(i13);
                    if (childAt2.getId() == constraintLayout.H && (childAt2 instanceof F1)) {
                        constraintLayout.F = ((F1) childAt2).getConstraintSet();
                    }
                }
            }
            androidx.constraintlayout.widget.CQf cQf = constraintLayout.F;
            if (cQf != null) {
                cQf.a(constraintLayout);
            }
            f70Var2.e0.clear();
            ArrayList<androidx.constraintlayout.widget.QnHx> arrayList = constraintLayout.x;
            int size = arrayList.size();
            if (size > 0) {
                int i14 = 0;
                while (i14 < size) {
                    androidx.constraintlayout.widget.QnHx qnHx = arrayList.get(i14);
                    if (qnHx.isInEditMode()) {
                        qnHx.setIds(qnHx.A);
                    }
                    k8 k8Var = qnHx.z;
                    if (k8Var != null) {
                        k8Var.f0 = i9;
                        Arrays.fill(k8Var.e0, obj);
                        int i15 = 0;
                        while (i15 < qnHx.x) {
                            int i16 = qnHx.w[i15];
                            View view = sparseArray3.get(i16);
                            if (view == null) {
                                Integer numValueOf = Integer.valueOf(i16);
                                HashMap<Integer, String> map = qnHx.B;
                                String str = map.get(numValueOf);
                                int iD = qnHx.d(constraintLayout, str);
                                if (iD != 0) {
                                    qnHx.w[i15] = iD;
                                    map.put(Integer.valueOf(iD), str);
                                    view = sparseArray3.get(iD);
                                }
                            }
                            View view2 = view;
                            if (view2 != null) {
                                k8 k8Var2 = qnHx.z;
                                e70 e70VarB2 = constraintLayout.b(view2);
                                k8Var2.getClass();
                                if (e70VarB2 != k8Var2 && e70VarB2 != null) {
                                    int i17 = k8Var2.f0 + i;
                                    e70[] e70VarArr = k8Var2.e0;
                                    if (i17 > e70VarArr.length) {
                                        k8Var2.e0 = (e70[]) Arrays.copyOf(e70VarArr, e70VarArr.length * 2);
                                    }
                                    e70[] e70VarArr2 = k8Var2.e0;
                                    int i18 = k8Var2.f0;
                                    e70VarArr2[i18] = e70VarB2;
                                    k8Var2.f0 = i18 + 1;
                                }
                            }
                            i15++;
                            i = 1;
                        }
                        qnHx.z.getClass();
                    }
                    i14++;
                    i9 = 0;
                    i = 1;
                    obj = null;
                }
            }
            for (int i19 = 0; i19 < childCount2; i19++) {
                View childAt3 = constraintLayout.getChildAt(i19);
                if (childAt3 instanceof LPt8Fixed) {
                    LPt8Fixed lPt8 = (LPt8Fixed) childAt3;
                    if (lPt8.w == -1 && !lPt8.isInEditMode()) {
                        lPt8.setVisibility(lPt8.y);
                    }
                    View viewFindViewById2 = constraintLayout.findViewById(lPt8.w);
                    lPt8.x = viewFindViewById2;
                    if (viewFindViewById2 != null) {
                        ((QnHx) viewFindViewById2.getLayoutParams()).a0 = true;
                        lPt8.x.setVisibility(0);
                        lPt8.setVisibility(0);
                    }
                }
            }
            SparseArray<e70> sparseArray4 = constraintLayout.J;
            sparseArray4.clear();
            sparseArray4.put(0, f70Var2);
            sparseArray4.put(getId(), f70Var2);
            for (int i20 = 0; i20 < childCount2; i20++) {
                View childAt4 = constraintLayout.getChildAt(i20);
                sparseArray4.put(childAt4.getId(), constraintLayout.b(childAt4));
            }
            int i21 = 0;
            while (i21 < childCount2) {
                View childAt5 = constraintLayout.getChildAt(i21);
                e70 e70VarB3 = constraintLayout.b(childAt5);
                if (e70VarB3 != null) {
                    QnHx qnHx2 = (QnHx) childAt5.getLayoutParams();
                    f70Var2.e0.add(e70VarB3);
                    e70 e70Var6 = e70VarB3.K;
                    if (e70Var6 != null) {
                        ((bm5) e70Var6).e0.remove(e70VarB3);
                        e70VarB3.K = null;
                    }
                    e70VarB3.K = f70Var2;
                    qnHx2.a();
                    e70VarB3.X = childAt5.getVisibility();
                    if (qnHx2.a0) {
                        e70VarB3.x = true;
                        e70VarB3.X = 8;
                    }
                    e70VarB3.W = childAt5;
                    if (childAt5 instanceof androidx.constraintlayout.widget.QnHx) {
                        ((androidx.constraintlayout.widget.QnHx) childAt5).f(e70VarB3, f70Var2.i0);
                    }
                    if (qnHx2.Y) {
                        bb1 bb1Var = (bb1) e70VarB3;
                        int i22 = qnHx2.i0;
                        int i23 = qnHx2.j0;
                        float f = qnHx2.k0;
                        if (f != -1.0f) {
                            if (f > -1.0f) {
                                bb1Var.e0 = f;
                                bb1Var.f0 = -1;
                                bb1Var.g0 = -1;
                            }
                        } else if (i22 != -1) {
                            if (i22 > -1) {
                                bb1Var.e0 = -1.0f;
                                bb1Var.f0 = i22;
                                bb1Var.g0 = -1;
                            }
                        } else if (i23 != -1 && i23 > -1) {
                            bb1Var.e0 = -1.0f;
                            bb1Var.f0 = -1;
                            bb1Var.g0 = i23;
                        }
                    } else {
                        int i24 = qnHx2.b0;
                        int i25 = qnHx2.c0;
                        int i26 = qnHx2.d0;
                        int i27 = qnHx2.e0;
                        int i28 = qnHx2.f0;
                        int i29 = qnHx2.g0;
                        i2 = childCount2;
                        float f2 = qnHx2.h0;
                        int i30 = qnHx2.m;
                        f70Var = f70Var2;
                        w60.QnHx qnHx3 = w60.QnHx.RIGHT;
                        z2 = z;
                        w60.QnHx qnHx4 = w60.QnHx.LEFT;
                        i3 = i21;
                        w60.QnHx qnHx5 = w60.QnHx.BOTTOM;
                        z3 = zIsInEditMode;
                        w60.QnHx qnHx6 = w60.QnHx.TOP;
                        if (i30 != -1) {
                            e70 e70Var7 = sparseArray4.get(i30);
                            if (e70Var7 != null) {
                                float f3 = qnHx2.o;
                                int i31 = qnHx2.n;
                                w60.QnHx qnHx7 = w60.QnHx.CENTER;
                                e70VarB3.m(qnHx7, e70Var7, qnHx7, i31, 0);
                                e70VarB3.v = f3;
                            }
                            sparseArray2 = sparseArray3;
                        } else {
                            qnHx2 = qnHx2;
                            if (i24 != -1) {
                                e70 e70Var8 = sparseArray4.get(i24);
                                if (e70Var8 != null) {
                                    sparseArray = sparseArray3;
                                    i4 = i27;
                                    i5 = i26;
                                    e70VarB3.m(qnHx4, e70Var8, qnHx4, ((ViewGroup.MarginLayoutParams) qnHx2).leftMargin, i28);
                                } else {
                                    sparseArray = sparseArray3;
                                    i4 = i27;
                                    i5 = i26;
                                }
                            } else {
                                sparseArray = sparseArray3;
                                i4 = i27;
                                i5 = i26;
                                if (i25 != -1 && (e70Var = sparseArray4.get(i25)) != null) {
                                    e70VarB3.m(qnHx4, e70Var, qnHx3, ((ViewGroup.MarginLayoutParams) qnHx2).leftMargin, i28);
                                }
                            }
                            if (i5 != -1) {
                                e70 e70Var9 = sparseArray4.get(i5);
                                if (e70Var9 != null) {
                                    e70VarB3.m(qnHx3, e70Var9, qnHx4, ((ViewGroup.MarginLayoutParams) qnHx2).rightMargin, i29);
                                }
                            } else if (i4 != -1 && (e70Var2 = sparseArray4.get(i4)) != null) {
                                e70VarB3.m(qnHx3, e70Var2, qnHx3, ((ViewGroup.MarginLayoutParams) qnHx2).rightMargin, i29);
                            }
                            int i32 = qnHx2.h;
                            if (i32 != -1) {
                                e70 e70Var10 = sparseArray4.get(i32);
                                if (e70Var10 != null) {
                                    e70VarB3.m(qnHx6, e70Var10, qnHx6, ((ViewGroup.MarginLayoutParams) qnHx2).topMargin, qnHx2.u);
                                }
                            } else {
                                int i33 = qnHx2.i;
                                if (i33 != -1 && (e70Var3 = sparseArray4.get(i33)) != null) {
                                    e70VarB3.m(qnHx6, e70Var3, qnHx5, ((ViewGroup.MarginLayoutParams) qnHx2).topMargin, qnHx2.u);
                                }
                            }
                            int i34 = qnHx2.j;
                            if (i34 != -1) {
                                e70 e70Var11 = sparseArray4.get(i34);
                                if (e70Var11 != null) {
                                    e70VarB3.m(qnHx5, e70Var11, qnHx6, ((ViewGroup.MarginLayoutParams) qnHx2).bottomMargin, qnHx2.w);
                                }
                            } else {
                                int i35 = qnHx2.k;
                                if (i35 != -1 && (e70Var4 = sparseArray4.get(i35)) != null) {
                                    e70VarB3.m(qnHx5, e70Var4, qnHx5, ((ViewGroup.MarginLayoutParams) qnHx2).bottomMargin, qnHx2.w);
                                }
                            }
                            int i36 = qnHx2.l;
                            if (i36 != -1) {
                                sparseArray2 = sparseArray;
                                View view3 = sparseArray2.get(i36);
                                e70 e70Var12 = sparseArray4.get(qnHx2.l);
                                if (e70Var12 != null && view3 != null && (view3.getLayoutParams() instanceof QnHx)) {
                                    QnHx qnHx8 = (QnHx) view3.getLayoutParams();
                                    qnHx2.X = true;
                                    qnHx8.X = true;
                                    w60.QnHx qnHx9 = w60.QnHx.BASELINE;
                                    e70VarB3.e(qnHx9).a(e70Var12.e(qnHx9), 0, -1);
                                    e70VarB3.w = true;
                                    qnHx8.l0.w = true;
                                    e70VarB3.e(qnHx6).e();
                                    e70VarB3.e(qnHx5).e();
                                }
                            } else {
                                sparseArray2 = sparseArray;
                            }
                            if (f2 >= 0.0f) {
                                e70VarB3.U = f2;
                            }
                            float f4 = qnHx2.A;
                            if (f4 >= 0.0f) {
                                e70VarB3.V = f4;
                            }
                        }
                        if (z3 && ((i8 = qnHx2.P) != -1 || qnHx2.Q != -1)) {
                            int i37 = qnHx2.Q;
                            e70VarB3.P = i8;
                            e70VarB3.Q = i37;
                        }
                        if (qnHx2.V) {
                            e70VarB3.t(1);
                            e70VarB3.v(((ViewGroup.MarginLayoutParams) qnHx2).width);
                            if (((ViewGroup.MarginLayoutParams) qnHx2).width == -2) {
                                e70VarB3.t(2);
                            }
                        } else if (((ViewGroup.MarginLayoutParams) qnHx2).width == -1) {
                            if (qnHx2.S) {
                                e70VarB3.t(3);
                            } else {
                                e70VarB3.t(4);
                            }
                            e70VarB3.e(qnHx4).e = ((ViewGroup.MarginLayoutParams) qnHx2).leftMargin;
                            e70VarB3.e(qnHx3).e = ((ViewGroup.MarginLayoutParams) qnHx2).rightMargin;
                        } else {
                            e70VarB3.t(3);
                            e70VarB3.v(0);
                        }
                        if (qnHx2.W) {
                            e70VarB3.u(1);
                            e70VarB3.s(((ViewGroup.MarginLayoutParams) qnHx2).height);
                            if (((ViewGroup.MarginLayoutParams) qnHx2).height == -2) {
                                e70VarB3.u(2);
                            }
                        } else if (((ViewGroup.MarginLayoutParams) qnHx2).height == -1) {
                            if (qnHx2.T) {
                                e70VarB3.u(3);
                            } else {
                                e70VarB3.u(4);
                            }
                            e70VarB3.e(qnHx6).e = ((ViewGroup.MarginLayoutParams) qnHx2).topMargin;
                            e70VarB3.e(qnHx5).e = ((ViewGroup.MarginLayoutParams) qnHx2).bottomMargin;
                        } else {
                            e70VarB3.u(3);
                            e70VarB3.s(0);
                        }
                        String str2 = qnHx2.B;
                        if (str2 == null || str2.length() == 0) {
                            e70VarB3.N = 0.0f;
                        } else {
                            int length = str2.length();
                            int iIndexOf2 = str2.indexOf(44);
                            if (iIndexOf2 <= 0 || iIndexOf2 >= length - 1) {
                                i6 = -1;
                                i7 = 0;
                            } else {
                                String strSubstring = str2.substring(0, iIndexOf2);
                                int i38 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                                i7 = iIndexOf2 + 1;
                                i6 = i38;
                            }
                            int iIndexOf3 = str2.indexOf(58);
                            if (iIndexOf3 < 0 || iIndexOf3 >= length - 1) {
                                String strSubstring2 = str2.substring(i7);
                                if (strSubstring2.length() > 0) {
                                    fAbs = Float.parseFloat(strSubstring2);
                                } else {
                                    fAbs = 0.0f;
                                }
                            } else {
                                String strSubstring3 = str2.substring(i7, iIndexOf3);
                                String strSubstring4 = str2.substring(iIndexOf3 + 1);
                                if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                                    fAbs = 0.0f;
                                } else {
                                    try {
                                        float f5 = Float.parseFloat(strSubstring3);
                                        float f6 = Float.parseFloat(strSubstring4);
                                        if (f5 <= 0.0f || f6 <= 0.0f) {
                                            fAbs = 0.0f;
                                        } else {
                                            fAbs = i6 == 1 ? Math.abs(f6 / f5) : Math.abs(f5 / f6);
                                        }
                                    } catch (NumberFormatException unused2) {
                                    }
                                }
                            }
                            if (fAbs > 0.0f) {
                                e70VarB3.N = fAbs;
                                e70VarB3.O = i6;
                            }
                        }
                        float f7 = qnHx2.D;
                        float[] fArr = e70VarB3.b0;
                        fArr[0] = f7;
                        fArr[1] = qnHx2.E;
                        e70VarB3.Z = qnHx2.F;
                        e70VarB3.a0 = qnHx2.G;
                        int i39 = qnHx2.H;
                        int i40 = qnHx2.J;
                        int i41 = qnHx2.L;
                        float f8 = qnHx2.N;
                        e70VarB3.j = i39;
                        e70VarB3.m = i40;
                        if (i41 == Integer.MAX_VALUE) {
                            i41 = 0;
                        }
                        e70VarB3.n = i41;
                        e70VarB3.o = f8;
                        if (f8 > 0.0f && f8 < 1.0f && i39 == 0) {
                            e70VarB3.j = 2;
                        }
                        int i42 = qnHx2.I;
                        int i43 = qnHx2.K;
                        int i44 = qnHx2.M;
                        float f9 = qnHx2.O;
                        e70VarB3.k = i42;
                        e70VarB3.p = i43;
                        if (i44 == Integer.MAX_VALUE) {
                            i44 = 0;
                        }
                        e70VarB3.q = i44;
                        e70VarB3.r = f9;
                        if (f9 > 0.0f && f9 < 1.0f && i42 == 0) {
                            e70VarB3.k = 2;
                        }
                    }
                    constraintLayout = this;
                    i21 = i3 + 1;
                    sparseArray3 = sparseArray2;
                    childCount2 = i2;
                    f70Var2 = f70Var;
                    z = z2;
                    zIsInEditMode = z3;
                }
                z2 = z;
                z3 = zIsInEditMode;
                i2 = childCount2;
                sparseArray2 = sparseArray3;
                i3 = i21;
                f70Var = f70Var2;
                constraintLayout = this;
                i21 = i3 + 1;
                sparseArray3 = sparseArray2;
                childCount2 = i2;
                f70Var2 = f70Var;
                z = z2;
                zIsInEditMode = z3;
            }
        }
        return z;
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.D = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new QnHx();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new QnHx(getContext(), attributeSet);
    }

    public int getMaxHeight() {
        return this.C;
    }

    public int getMaxWidth() {
        return this.B;
    }

    public int getMinHeight() {
        return this.A;
    }

    public int getMinWidth() {
        return this.z;
    }

    public int getOptimizationLevel() {
        return this.y.q0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            QnHx qnHx = (QnHx) childAt.getLayoutParams();
            e70 e70Var = qnHx.l0;
            if ((childAt.getVisibility() != 8 || qnHx.Y || qnHx.Z || zIsInEditMode) && !qnHx.a0) {
                int iK = e70Var.k();
                int iL = e70Var.l();
                int iJ = e70Var.j() + iK;
                int iG = e70Var.g() + iL;
                childAt.layout(iK, iL, iJ, iG);
                if ((childAt instanceof LPt8Fixed) && (content = ((LPt8Fixed) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iK, iL, iJ, iG);
                }
            }
        }
        ArrayList<androidx.constraintlayout.widget.QnHx> arrayList = this.x;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                arrayList.get(i6).getClass();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01da A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:104:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:120:0x0202 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:121:0x0204 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:126:0x020c  */
    /* JADX WARN: Code duplicated, block: B:128:0x0222  */
    /* JADX WARN: Code duplicated, block: B:131:0x0230  */
    /* JADX WARN: Code duplicated, block: B:133:0x0234  */
    /* JADX WARN: Code duplicated, block: B:137:0x0241 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:180:0x0329  */
    /* JADX WARN: Code duplicated, block: B:182:0x033f  */
    /* JADX WARN: Code duplicated, block: B:184:0x0342  */
    /* JADX WARN: Code duplicated, block: B:189:0x035e  */
    /* JADX WARN: Code duplicated, block: B:198:0x037b  */
    /* JADX WARN: Code duplicated, block: B:220:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:222:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:225:0x03db A[LOOP:12: B:223:0x03d5->B:225:0x03db, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:227:0x0418  */
    /* JADX WARN: Code duplicated, block: B:230:0x0434  */
    /* JADX WARN: Code duplicated, block: B:231:0x0443  */
    /* JADX WARN: Code duplicated, block: B:233:0x044c  */
    /* JADX WARN: Code duplicated, block: B:235:0x0455 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:236:0x0457  */
    /* JADX WARN: Code duplicated, block: B:237:0x0459  */
    /* JADX WARN: Code duplicated, block: B:239:0x045c  */
    /* JADX WARN: Code duplicated, block: B:240:0x045e  */
    /* JADX WARN: Code duplicated, block: B:242:0x0463  */
    /* JADX WARN: Code duplicated, block: B:244:0x0472  */
    /* JADX WARN: Code duplicated, block: B:248:0x0479  */
    /* JADX WARN: Code duplicated, block: B:250:0x047d  */
    /* JADX WARN: Code duplicated, block: B:252:0x0488  */
    /* JADX WARN: Code duplicated, block: B:255:0x0495  */
    /* JADX WARN: Code duplicated, block: B:259:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:262:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:268:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:270:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:271:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:275:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:277:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:280:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:282:0x050b  */
    /* JADX WARN: Code duplicated, block: B:285:0x051a  */
    /* JADX WARN: Code duplicated, block: B:290:0x0532  */
    /* JADX WARN: Code duplicated, block: B:292:0x0535 A[LOOP:6: B:291:0x0533->B:292:0x0535, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:293:0x0541  */
    /* JADX WARN: Code duplicated, block: B:296:0x054d  */
    /* JADX WARN: Code duplicated, block: B:297:0x0555  */
    /* JADX WARN: Code duplicated, block: B:299:0x055b  */
    /* JADX WARN: Code duplicated, block: B:301:0x0563  */
    /* JADX WARN: Code duplicated, block: B:302:0x0565  */
    /* JADX WARN: Code duplicated, block: B:305:0x056b  */
    /* JADX WARN: Code duplicated, block: B:306:0x056d  */
    /* JADX WARN: Code duplicated, block: B:310:0x058e  */
    /* JADX WARN: Code duplicated, block: B:312:0x059c  */
    /* JADX WARN: Code duplicated, block: B:313:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:315:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:317:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:322:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:324:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:328:0x0614  */
    /* JADX WARN: Code duplicated, block: B:333:0x063a  */
    /* JADX WARN: Code duplicated, block: B:335:0x063d  */
    /* JADX WARN: Code duplicated, block: B:337:0x0647  */
    /* JADX WARN: Code duplicated, block: B:339:0x064b  */
    /* JADX WARN: Code duplicated, block: B:345:0x0659  */
    /* JADX WARN: Code duplicated, block: B:352:0x066e  */
    /* JADX WARN: Code duplicated, block: B:355:0x0697  */
    /* JADX WARN: Code duplicated, block: B:357:0x069c  */
    /* JADX WARN: Code duplicated, block: B:362:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:364:0x06c1  */
    /* JADX WARN: Code duplicated, block: B:370:0x06e4  */
    /* JADX WARN: Code duplicated, block: B:376:0x06fc  */
    /* JADX WARN: Code duplicated, block: B:377:0x0707  */
    /* JADX WARN: Code duplicated, block: B:381:0x0726  */
    /* JADX WARN: Code duplicated, block: B:383:0x072f  */
    /* JADX WARN: Code duplicated, block: B:384:0x0734  */
    /* JADX WARN: Code duplicated, block: B:387:0x073b  */
    /* JADX WARN: Code duplicated, block: B:388:0x0740  */
    /* JADX WARN: Code duplicated, block: B:390:0x0743  */
    /* JADX WARN: Code duplicated, block: B:391:0x0747  */
    /* JADX WARN: Code duplicated, block: B:394:0x0753  */
    /* JADX WARN: Code duplicated, block: B:395:0x0755  */
    /* JADX WARN: Code duplicated, block: B:399:0x0790  */
    /* JADX WARN: Code duplicated, block: B:401:0x0793  */
    /* JADX WARN: Code duplicated, block: B:419:0x03aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:438:0x0527 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:439:0x0527 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:441:0x062c A[EDGE_INSN: B:441:0x062c->B:331:0x062c BREAK  A[LOOP:7: B:308:0x0588->B:330:0x061c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:450:0x06e9 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:48:0x010a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x010c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0114  */
    /* JADX WARN: Code duplicated, block: B:52:0x0119  */
    /* JADX WARN: Code duplicated, block: B:54:0x011c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0123  */
    /* JADX WARN: Code duplicated, block: B:59:0x012e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0134  */
    /* JADX WARN: Code duplicated, block: B:64:0x0164  */
    /* JADX WARN: Code duplicated, block: B:65:0x0168  */
    /* JADX WARN: Code duplicated, block: B:68:0x0170  */
    /* JADX WARN: Code duplicated, block: B:69:0x0173  */
    /* JADX WARN: Code duplicated, block: B:72:0x0192  */
    /* JADX WARN: Code duplicated, block: B:73:0x0194  */
    /* JADX WARN: Code duplicated, block: B:75:0x0197  */
    /* JADX WARN: Code duplicated, block: B:77:0x019c  */
    /* JADX WARN: Code duplicated, block: B:78:0x019e  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:86:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:89:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:92:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:95:0x01c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:99:0x01d3  */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int iMax;
        int i3;
        int iMax2;
        int iMin;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        f9.CQf cQf;
        int size;
        int iJ;
        int iG;
        boolean z;
        boolean z2;
        int i8;
        f9.CQf cQf2;
        int i9;
        f70 f70Var;
        f9 f9Var;
        int i10;
        int i11;
        boolean zB;
        int i12;
        f9 f9Var2;
        int i13;
        ArrayList<e70> arrayList;
        int size2;
        int i14;
        int i15;
        f70 f70Var2;
        int i16;
        int i17;
        boolean z3;
        int[] iArr2;
        boolean z4;
        boolean z5;
        int iMax3;
        int iMax4;
        int i18;
        boolean zA;
        w60.QnHx qnHx;
        w60.QnHx qnHx2;
        f70 f70Var3;
        int i19;
        int i20;
        f9.CQf cQf3;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean z6;
        boolean z7;
        int i25;
        int i26;
        int i27;
        f70 f70Var4;
        e70 e70Var;
        int iJ2;
        int iG2;
        ArrayList<e70> arrayList2;
        int i28;
        int iJ3;
        f9.CQf cQf4;
        int iG3;
        e70 e70Var2;
        int iJ4;
        int iG4;
        f9.CQf cQf5;
        int iJ5;
        boolean z8;
        int iG5;
        boolean z9;
        int size3;
        f9.CQf cQf6;
        int i29;
        ConstraintLayout constraintLayout;
        int childCount;
        int i30;
        ArrayList<androidx.constraintlayout.widget.QnHx> arrayList3;
        int size4;
        int i31;
        View childAt;
        LPt8Fixed lPt8;
        QnHx qnHx3;
        e70 e70Var3;
        e70 e70Var4;
        e70 e70Var5;
        e70 e70Var6;
        f9 f9Var3;
        int iF;
        boolean z10;
        boolean z11;
        boolean z12;
        int iMin2;
        int iMin3;
        int iMin4;
        oj0 oj0Var;
        int i32;
        boolean z13;
        f70 f70Var5;
        int i33;
        int i34;
        int i35;
        boolean z14;
        boolean z15;
        int i36;
        int i37;
        int[] iArr3;
        int i38;
        int i39;
        boolean z16;
        Iterator<cm5> it;
        boolean z17;
        cm5 next;
        int i40;
        e70 e70Var7;
        int[] iArr4;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        int i41;
        int iMin5;
        int i42;
        boolean zD = d();
        f70 f70Var6 = this.y;
        f70Var6.i0 = zD;
        boolean z22 = this.D;
        f9 f9Var4 = f70Var6.f0;
        oj0 oj0Var2 = f70Var6.g0;
        if (z22) {
            this.D = false;
            if (f()) {
                ArrayList<e70> arrayList4 = f9Var4.a;
                arrayList4.clear();
                int size5 = f70Var6.e0.size();
                for (int i43 = 0; i43 < size5; i43++) {
                    e70 e70Var8 = f70Var6.e0.get(i43);
                    int[] iArr5 = e70Var8.J;
                    int i44 = iArr5[0];
                    if (i44 == 3 || i44 == 4 || (i42 = iArr5[1]) == 3 || i42 == 4) {
                        arrayList4.add(e70Var8);
                    }
                }
                oj0Var2.b = true;
            }
        }
        int i45 = this.E;
        int mode = View.MeasureSpec.getMode(i);
        int size6 = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size7 = View.MeasureSpec.getSize(i2);
        int iMax5 = Math.max(0, getPaddingTop());
        int iMax6 = Math.max(0, getPaddingBottom());
        int i46 = iMax5 + iMax6;
        int paddingWidth = getPaddingWidth();
        CQf cQf7 = this.K;
        cQf7.b = iMax5;
        cQf7.c = iMax6;
        cQf7.d = paddingWidth;
        cQf7.e = i46;
        cQf7.f = i;
        cQf7.g = i2;
        int iMax7 = Math.max(0, getPaddingStart());
        int iMax8 = Math.max(0, getPaddingEnd());
        if (iMax7 <= 0 && iMax8 <= 0) {
            iMax7 = Math.max(0, getPaddingLeft());
        } else if (d()) {
            iMax7 = iMax8;
        }
        int i47 = size6 - paddingWidth;
        int i48 = size7 - i46;
        int i49 = cQf7.e;
        int i50 = cQf7.d;
        int childCount2 = getChildCount();
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    i41 = 1;
                } else {
                    iMin5 = Math.min(this.B - i50, i47);
                    i41 = 1;
                }
                i3 = i41;
                iMax = iMin5;
                if (mode2 != Integer.MIN_VALUE) {
                    if (mode2 != 0) {
                        if (mode2 != 1073741824) {
                            i4 = 1;
                            iMin = 0;
                        } else {
                            iMin = Math.min(this.C - i49, i48);
                            i4 = 1;
                        }
                        if (iMax == f70Var6.j() || iMin != f70Var6.g()) {
                            oj0Var2.c = true;
                        }
                        f70Var6.P = 0;
                        f70Var6.Q = 0;
                        int i51 = this.B - i50;
                        iArr = f70Var6.u;
                        iArr[0] = i51;
                        iArr[1] = this.C - i49;
                        f70Var6.S = 0;
                        f70Var6.T = 0;
                        f70Var6.t(i3);
                        f70Var6.v(iMax);
                        f70Var6.u(i4);
                        f70Var6.s(iMin);
                        i5 = this.z - i50;
                        if (i5 < 0) {
                            i6 = 0;
                            f70Var6.S = 0;
                        } else {
                            i6 = 0;
                            f70Var6.S = i5;
                        }
                        i7 = this.A - i49;
                        if (i7 < 0) {
                            f70Var6.T = i6;
                        } else {
                            f70Var6.T = i7;
                        }
                        f70Var6.k0 = iMax7;
                        f70Var6.l0 = iMax5;
                        f9Var4.getClass();
                        cQf = f70Var6.h0;
                        size = f70Var6.e0.size();
                        iJ = f70Var6.j();
                        iG = f70Var6.g();
                        if ((i45 & 128) == 128) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            z2 = true;
                        } else {
                            if ((i45 & 64) == 64) {
                                z21 = true;
                            } else {
                                z21 = false;
                            }
                            if (z21) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        }
                        if (z2) {
                            i40 = 0;
                            while (i40 < size) {
                                e70Var7 = f70Var6.e0.get(i40);
                                iArr4 = e70Var7.J;
                                if (iArr4[0] == 3) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                if (iArr4[1] == 3) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                if (z18 || !z19 || e70Var7.N <= 0.0f) {
                                    z20 = false;
                                } else {
                                    z20 = true;
                                }
                                if ((!e70Var7.o() && z20) || ((e70Var7.p() && z20) || (e70Var7 instanceof gk5) || e70Var7.o() || e70Var7.p())) {
                                    z2 = false;
                                    break;
                                }
                            }
                        }
                        i8 = mode2;
                        if (z2 && ((mode != 1073741824 && i8 == 1073741824) || z)) {
                            int iMin6 = Math.min(iArr[0], i47);
                            iMin4 = Math.min(iArr[1], i48);
                            if (mode == 1073741824 || f70Var6.j() == iMin6) {
                                oj0Var = oj0Var2;
                            } else {
                                f70Var6.v(iMin6);
                                oj0Var = oj0Var2;
                                oj0Var.b = true;
                            }
                            if (i8 == 1073741824 && f70Var6.g() != iMin4) {
                                f70Var6.s(iMin4);
                                oj0Var.b = true;
                            }
                            if (mode == 1073741824 || i8 != 1073741824) {
                                cQf2 = cQf;
                                i9 = size;
                                f9Var = f9Var4;
                                i10 = iJ;
                                i11 = iG;
                                i32 = i8;
                                z13 = oj0Var.b;
                                f70Var5 = oj0Var.a;
                                if (z13) {
                                    for (e70 e70Var9 : f70Var5.e0) {
                                        e70Var9.a = false;
                                        gd1 gd1Var = e70Var9.d;
                                        gd1Var.e.j = false;
                                        gd1Var.g = false;
                                        gd1Var.n();
                                        wh5 wh5Var = e70Var9.e;
                                        wh5Var.e.j = false;
                                        wh5Var.g = false;
                                        wh5Var.m();
                                    }
                                    i33 = 0;
                                    f70Var5.a = false;
                                    gd1 gd1Var2 = f70Var5.d;
                                    gd1Var2.e.j = false;
                                    gd1Var2.g = false;
                                    gd1Var2.n();
                                    wh5 wh5Var2 = f70Var5.e;
                                    wh5Var2.e.j = false;
                                    wh5Var2.g = false;
                                    wh5Var2.m();
                                    oj0Var.c();
                                } else {
                                    i33 = 0;
                                }
                                oj0Var.b(oj0Var.d);
                                f70Var5.P = i33;
                                f70Var5.Q = i33;
                                f70Var5.d.h.d(i33);
                                f70Var5.e.h.d(i33);
                                i34 = 1073741824;
                                if (mode == 1073741824) {
                                    f70Var = f70Var6;
                                    i35 = 1;
                                    zB = f70Var.B(i33, z) & true;
                                    i12 = 1;
                                } else {
                                    f70Var = f70Var6;
                                    i35 = 1;
                                    zB = true;
                                    i12 = 0;
                                }
                                if (i32 == 1073741824) {
                                    zB &= f70Var.B(i35, z);
                                    i12++;
                                }
                            } else {
                                boolean z23 = z & true;
                                boolean z24 = oj0Var.b;
                                f70 f70Var7 = oj0Var.a;
                                if (z24 || oj0Var.c) {
                                    for (e70 e70Var10 : f70Var7.e0) {
                                        e70Var10.a = false;
                                        e70Var10.d.n();
                                        e70Var10.e.m();
                                    }
                                    i36 = 0;
                                    f70Var7.a = false;
                                    f70Var7.d.n();
                                    f70Var7.e.m();
                                    oj0Var.c = false;
                                } else {
                                    i36 = 0;
                                }
                                oj0Var.b(oj0Var.d);
                                f70Var7.P = i36;
                                f70Var7.Q = i36;
                                int iF2 = f70Var7.f(i36);
                                int iF3 = f70Var7.f(1);
                                if (oj0Var.b) {
                                    oj0Var.c();
                                }
                                int iK = f70Var7.k();
                                int iL = f70Var7.l();
                                gd1 gd1Var3 = f70Var7.d;
                                cQf2 = cQf;
                                gd1Var3.h.d(iK);
                                wh5 wh5Var3 = f70Var7.e;
                                i10 = iJ;
                                wh5Var3.h.d(iL);
                                oj0Var.g();
                                ArrayList<cm5> arrayList5 = oj0Var.e;
                                i11 = iG;
                                zk0 zk0Var = gd1Var3.e;
                                f9Var = f9Var4;
                                zk0 zk0Var2 = wh5Var3.e;
                                i9 = size;
                                if (iF2 == 2 || iF3 == 2) {
                                    if (z23) {
                                        Iterator<cm5> it2 = arrayList5.iterator();
                                        while (it2.hasNext()) {
                                            if (!it2.next().k()) {
                                                z23 = false;
                                                break;
                                            }
                                        }
                                    }
                                    if (z23 && iF2 == 2) {
                                        f70Var7.t(1);
                                        f70Var7.v(oj0Var.d(f70Var7, 0));
                                        zk0Var.d(f70Var7.j());
                                    }
                                    if (z23 && iF3 == 2) {
                                        i37 = 1;
                                        f70Var7.u(1);
                                        f70Var7.s(oj0Var.d(f70Var7, 1));
                                        zk0Var2.d(f70Var7.g());
                                    }
                                    iArr3 = f70Var7.J;
                                    i38 = iArr3[0];
                                    if (i38 != i37 || i38 == 4) {
                                        int iJ6 = f70Var7.j() + iK;
                                        gd1Var3.i.d(iJ6);
                                        zk0Var.d(iJ6 - iK);
                                        oj0Var.g();
                                        i39 = iArr3[1];
                                        if (i39 != 1 || i39 == 4) {
                                            int iG6 = f70Var7.g() + iL;
                                            wh5Var3.i.d(iG6);
                                            zk0Var2.d(iG6 - iL);
                                        }
                                        oj0Var.g();
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    for (cm5 cm5Var : arrayList5) {
                                        if (cm5Var.b == f70Var7 || cm5Var.g) {
                                            cm5Var.e();
                                        }
                                    }
                                    it = arrayList5.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            z17 = true;
                                            break;
                                        }
                                        next = it.next();
                                        if (!z16 || next.b != f70Var7) {
                                            if (next.h.j || ((!next.i.j && !(next instanceof cb1)) || (!next.e.j && !(next instanceof zn) && !(next instanceof cb1)))) {
                                                z17 = false;
                                                break;
                                            }
                                        }
                                    }
                                    f70Var7.t(iF2);
                                    f70Var7.u(iF3);
                                    zB = z17;
                                    i32 = i8;
                                    f70Var = f70Var6;
                                    i34 = 1073741824;
                                    i12 = 2;
                                } else {
                                    i8 = i8;
                                }
                                i37 = 1;
                                iArr3 = f70Var7.J;
                                i38 = iArr3[0];
                                if (i38 != i37) {
                                    int iJ7 = f70Var7.j() + iK;
                                    gd1Var3.i.d(iJ7);
                                    zk0Var.d(iJ7 - iK);
                                    oj0Var.g();
                                    i39 = iArr3[1];
                                    if (i39 != 1) {
                                        int iG7 = f70Var7.g() + iL;
                                        wh5Var3.i.d(iG7);
                                        zk0Var2.d(iG7 - iL);
                                    } else {
                                        int iG8 = f70Var7.g() + iL;
                                        wh5Var3.i.d(iG8);
                                        zk0Var2.d(iG8 - iL);
                                    }
                                    oj0Var.g();
                                    z16 = true;
                                } else {
                                    int iJ8 = f70Var7.j() + iK;
                                    gd1Var3.i.d(iJ8);
                                    zk0Var.d(iJ8 - iK);
                                    oj0Var.g();
                                    i39 = iArr3[1];
                                    if (i39 != 1) {
                                        int iG9 = f70Var7.g() + iL;
                                        wh5Var3.i.d(iG9);
                                        zk0Var2.d(iG9 - iL);
                                    } else {
                                        int iG10 = f70Var7.g() + iL;
                                        wh5Var3.i.d(iG10);
                                        zk0Var2.d(iG10 - iL);
                                    }
                                    oj0Var.g();
                                    z16 = true;
                                }
                                while (r1.hasNext()) {
                                    if (cm5Var.b == f70Var7) {
                                    }
                                    cm5Var.e();
                                }
                                it = arrayList5.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        z17 = true;
                                        break;
                                    }
                                    next = it.next();
                                    if (!z16) {
                                    }
                                    if (next.h.j) {
                                    }
                                    z17 = false;
                                    break;
                                }
                                f70Var7.t(iF2);
                                f70Var7.u(iF3);
                                zB = z17;
                                i32 = i8;
                                f70Var = f70Var6;
                                i34 = 1073741824;
                                i12 = 2;
                            }
                            if (zB) {
                                if (mode == i34) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (i32 == i34) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                f70Var.w(z14, z15);
                            }
                        } else {
                            cQf2 = cQf;
                            i9 = size;
                            f70Var = f70Var6;
                            f9Var = f9Var4;
                            i10 = iJ;
                            i11 = iG;
                            zB = false;
                            i12 = 0;
                        }
                        if (zB || i12 != 2) {
                            if (i9 > 0) {
                                size3 = f70Var.e0.size();
                                cQf6 = f70Var.h0;
                                i29 = 0;
                                while (i29 < size3) {
                                    e70Var6 = f70Var.e0.get(i29);
                                    if ((e70Var6 instanceof bb1) && !(e70Var6.d.e.j && e70Var6.e.e.j)) {
                                        iF = e70Var6.f(0);
                                        int iF4 = e70Var6.f(1);
                                        if (iF == 3 || e70Var6.j == 1 || iF4 != 3 || e70Var6.k == 1) {
                                            z10 = false;
                                        } else {
                                            z10 = true;
                                        }
                                        if (z10) {
                                            f9Var3 = f9Var;
                                        } else {
                                            f9Var3 = f9Var;
                                            f9Var3.a(cQf6, e70Var6, false);
                                        }
                                    } else {
                                        f9Var3 = f9Var;
                                    }
                                    i29++;
                                    f9Var = f9Var3;
                                }
                                f9Var2 = f9Var;
                                constraintLayout = ((CQf) cQf6).a;
                                childCount = constraintLayout.getChildCount();
                                for (i30 = 0; i30 < childCount; i30++) {
                                    childAt = constraintLayout.getChildAt(i30);
                                    if (childAt instanceof LPt8Fixed) {
                                        lPt8 = (LPt8Fixed) childAt;
                                        if (lPt8.x != null) {
                                            QnHx qnHx4 = (QnHx) lPt8.getLayoutParams();
                                            qnHx3 = (QnHx) lPt8.x.getLayoutParams();
                                            e70Var3 = qnHx3.l0;
                                            e70Var3.X = 0;
                                            e70Var4 = qnHx4.l0;
                                            if (e70Var4.J[0] != 1) {
                                                e70Var4.v(e70Var3.j());
                                            }
                                            e70Var5 = qnHx4.l0;
                                            if (e70Var5.J[1] != 1) {
                                                e70Var5.s(qnHx3.l0.g());
                                            }
                                            qnHx3.l0.X = 8;
                                        }
                                    }
                                }
                                arrayList3 = constraintLayout.x;
                                size4 = arrayList3.size();
                                if (size4 > 0) {
                                    for (i31 = 0; i31 < size4; i31++) {
                                        arrayList3.get(i31).getClass();
                                    }
                                }
                            } else {
                                f9Var2 = f9Var;
                            }
                            i13 = f70Var.q0;
                            arrayList = f9Var2.a;
                            size2 = arrayList.size();
                            if (i9 > 0) {
                                i14 = i10;
                                i15 = i11;
                                f9Var2.b(f70Var, i14, i15);
                            } else {
                                i14 = i10;
                                i15 = i11;
                            }
                            if (size2 > 0) {
                                iArr2 = f70Var.J;
                                if (iArr2[0] == 2) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (iArr2[1] == 2) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                int iJ9 = f70Var.j();
                                f70 f70Var8 = f9Var2.c;
                                iMax3 = Math.max(iJ9, f70Var8.S);
                                iMax4 = Math.max(f70Var.g(), f70Var8.T);
                                i18 = 0;
                                zA = false;
                                while (true) {
                                    qnHx = w60.QnHx.BOTTOM;
                                    qnHx2 = w60.QnHx.RIGHT;
                                    if (i18 >= size2) {
                                        break;
                                    }
                                    e70Var2 = arrayList.get(i18);
                                    int i52 = i13;
                                    if (e70Var2 instanceof gk5) {
                                        iJ4 = e70Var2.j();
                                        iG4 = e70Var2.g();
                                        cQf5 = cQf2;
                                        boolean zA2 = zA | f9Var2.a(cQf5, e70Var2, true);
                                        iJ5 = e70Var2.j();
                                        z8 = zA2;
                                        iG5 = e70Var2.g();
                                        if (iJ5 != iJ4) {
                                            e70Var2.v(iJ5);
                                            if (z4 && e70Var2.k() + e70Var2.L > iMax3) {
                                                iMax3 = Math.max(iMax3, e70Var2.e(qnHx2).b() + e70Var2.k() + e70Var2.L);
                                            }
                                            z8 = true;
                                        }
                                        if (iG5 != iG4) {
                                            e70Var2.s(iG5);
                                            if (z5 && e70Var2.l() + e70Var2.M > iMax4) {
                                                iMax4 = Math.max(iMax4, e70Var2.e(qnHx).b() + e70Var2.l() + e70Var2.M);
                                            }
                                            z9 = true;
                                        } else {
                                            z9 = z8;
                                        }
                                        zA = z9 | false;
                                    } else {
                                        cQf5 = cQf2;
                                    }
                                    i18++;
                                    cQf2 = cQf5;
                                    i13 = i52;
                                    i14 = i14;
                                    i15 = i15;
                                    f70Var = f70Var;
                                }
                                f70Var3 = f70Var;
                                i16 = i13;
                                i19 = i14;
                                i20 = i15;
                                cQf3 = cQf2;
                                i22 = 0;
                                for (i21 = 2; i22 < i21; i21 = 2) {
                                    i25 = 0;
                                    while (i25 < size2) {
                                        e70Var = arrayList.get(i25);
                                        if (((e70Var instanceof wc1) || (e70Var instanceof gk5)) && !(e70Var instanceof bb1)) {
                                            if (e70Var.X == 8 && ((!e70Var.d.e.j || !e70Var.e.e.j) && !(e70Var instanceof gk5))) {
                                                iJ2 = e70Var.j();
                                                iG2 = e70Var.g();
                                                arrayList2 = arrayList;
                                                int i53 = e70Var.R;
                                                i28 = size2;
                                                zA |= f9Var2.a(cQf3, e70Var, true);
                                                iJ3 = e70Var.j();
                                                cQf4 = cQf3;
                                                iG3 = e70Var.g();
                                                if (iJ3 != iJ2) {
                                                    e70Var.v(iJ3);
                                                    if (z4 && e70Var.k() + e70Var.L > iMax3) {
                                                        iMax3 = Math.max(iMax3, e70Var.e(qnHx2).b() + e70Var.k() + e70Var.L);
                                                    }
                                                    zA = true;
                                                }
                                                if (iG3 != iG2) {
                                                    e70Var.s(iG3);
                                                    if (z5 && e70Var.l() + e70Var.M > iMax4) {
                                                        iMax4 = Math.max(iMax4, e70Var.e(qnHx).b() + e70Var.l() + e70Var.M);
                                                    }
                                                    zA = true;
                                                }
                                                if (!e70Var.w && i53 != e70Var.R) {
                                                    zA = true;
                                                }
                                            }
                                            i25++;
                                            arrayList = arrayList2;
                                            size2 = i28;
                                            cQf3 = cQf4;
                                        }
                                        arrayList2 = arrayList;
                                        i28 = size2;
                                        cQf4 = cQf3;
                                        i25++;
                                        arrayList = arrayList2;
                                        size2 = i28;
                                        cQf3 = cQf4;
                                    }
                                    ArrayList<e70> arrayList6 = arrayList;
                                    int i54 = size2;
                                    f9.CQf cQf8 = cQf3;
                                    if (zA) {
                                        i26 = i19;
                                        i27 = i20;
                                        f70Var4 = f70Var3;
                                        f9Var2.b(f70Var4, i26, i27);
                                        zA = false;
                                    } else {
                                        i26 = i19;
                                        i27 = i20;
                                        f70Var4 = f70Var3;
                                    }
                                    i22++;
                                    i19 = i26;
                                    i20 = i27;
                                    f70Var3 = f70Var4;
                                    arrayList = arrayList6;
                                    size2 = i54;
                                    cQf3 = cQf8;
                                }
                                i23 = i19;
                                i24 = i20;
                                f70Var2 = f70Var3;
                                if (zA) {
                                    f9Var2.b(f70Var2, i23, i24);
                                    if (f70Var2.j() < iMax3) {
                                        f70Var2.v(iMax3);
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (f70Var2.g() < iMax4) {
                                        f70Var2.s(iMax4);
                                        z7 = true;
                                    } else {
                                        z7 = z6;
                                    }
                                    if (z7) {
                                        f9Var2.b(f70Var2, i23, i24);
                                    }
                                }
                            } else {
                                f70Var2 = f70Var;
                                i16 = i13;
                            }
                            i17 = i16;
                            f70Var2.q0 = i17;
                            if ((i17 & 256) == 256) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            o32.p = z3;
                        } else {
                            f70Var2 = f70Var;
                        }
                        int iJ10 = f70Var2.j();
                        int iG11 = f70Var2.g();
                        z11 = f70Var2.r0;
                        z12 = f70Var2.s0;
                        int i55 = cQf7.e;
                        int iResolveSizeAndState = View.resolveSizeAndState(iJ10 + cQf7.d, i, 0);
                        int iResolveSizeAndState2 = View.resolveSizeAndState(iG11 + i55, i2, 0) & 16777215;
                        iMin2 = Math.min(this.B, iResolveSizeAndState & 16777215);
                        iMin3 = Math.min(this.C, iResolveSizeAndState2);
                        if (z11) {
                            iMin2 |= 16777216;
                        }
                        if (z12) {
                            iMin3 |= 16777216;
                        }
                        setMeasuredDimension(iMin2, iMin3);
                    }
                    if (childCount2 == 0) {
                        iMax2 = Math.max(0, this.A);
                    } else {
                        iMin = 0;
                        i4 = 2;
                    }
                    if (iMax == f70Var6.j()) {
                        oj0Var2.c = true;
                    } else {
                        oj0Var2.c = true;
                    }
                    f70Var6.P = 0;
                    f70Var6.Q = 0;
                    int i56 = this.B - i50;
                    iArr = f70Var6.u;
                    iArr[0] = i56;
                    iArr[1] = this.C - i49;
                    f70Var6.S = 0;
                    f70Var6.T = 0;
                    f70Var6.t(i3);
                    f70Var6.v(iMax);
                    f70Var6.u(i4);
                    f70Var6.s(iMin);
                    i5 = this.z - i50;
                    if (i5 < 0) {
                        i6 = 0;
                        f70Var6.S = 0;
                    } else {
                        i6 = 0;
                        f70Var6.S = i5;
                    }
                    i7 = this.A - i49;
                    if (i7 < 0) {
                        f70Var6.T = i6;
                    } else {
                        f70Var6.T = i7;
                    }
                    f70Var6.k0 = iMax7;
                    f70Var6.l0 = iMax5;
                    f9Var4.getClass();
                    cQf = f70Var6.h0;
                    size = f70Var6.e0.size();
                    iJ = f70Var6.j();
                    iG = f70Var6.g();
                    if ((i45 & 128) == 128) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        z2 = true;
                    } else {
                        if ((i45 & 64) == 64) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        if (z21) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                    if (z2) {
                        i40 = 0;
                        while (i40 < size) {
                            e70Var7 = f70Var6.e0.get(i40);
                            iArr4 = e70Var7.J;
                            if (iArr4[0] == 3) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            if (iArr4[1] == 3) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            if (z18) {
                                z20 = false;
                            } else {
                                z20 = false;
                            }
                            i40 = !e70Var7.o() ? i40 + 1 : i40 + 1;
                            z2 = false;
                            break;
                        }
                    }
                    i8 = mode2;
                    if (z2 && ((mode != 1073741824 && i8 == 1073741824) || z)) {
                        int iMin7 = Math.min(iArr[0], i47);
                        iMin4 = Math.min(iArr[1], i48);
                        if (mode == 1073741824) {
                            oj0Var = oj0Var2;
                        } else {
                            oj0Var = oj0Var2;
                        }
                        if (i8 == 1073741824) {
                            f70Var6.s(iMin4);
                            oj0Var.b = true;
                        }
                        if (mode == 1073741824) {
                            cQf2 = cQf;
                            i9 = size;
                            f9Var = f9Var4;
                            i10 = iJ;
                            i11 = iG;
                            i32 = i8;
                            z13 = oj0Var.b;
                            f70Var5 = oj0Var.a;
                            if (z13) {
                                while (r0.hasNext()) {
                                    e70Var9.a = false;
                                    gd1 gd1Var4 = e70Var9.d;
                                    gd1Var4.e.j = false;
                                    gd1Var4.g = false;
                                    gd1Var4.n();
                                    wh5 wh5Var4 = e70Var9.e;
                                    wh5Var4.e.j = false;
                                    wh5Var4.g = false;
                                    wh5Var4.m();
                                }
                                i33 = 0;
                                f70Var5.a = false;
                                gd1 gd1Var5 = f70Var5.d;
                                gd1Var5.e.j = false;
                                gd1Var5.g = false;
                                gd1Var5.n();
                                wh5 wh5Var5 = f70Var5.e;
                                wh5Var5.e.j = false;
                                wh5Var5.g = false;
                                wh5Var5.m();
                                oj0Var.c();
                            } else {
                                i33 = 0;
                            }
                            oj0Var.b(oj0Var.d);
                            f70Var5.P = i33;
                            f70Var5.Q = i33;
                            f70Var5.d.h.d(i33);
                            f70Var5.e.h.d(i33);
                            i34 = 1073741824;
                            if (mode == 1073741824) {
                                f70Var = f70Var6;
                                i35 = 1;
                                zB = f70Var.B(i33, z) & true;
                                i12 = 1;
                            } else {
                                f70Var = f70Var6;
                                i35 = 1;
                                zB = true;
                                i12 = 0;
                            }
                            if (i32 == 1073741824) {
                                zB &= f70Var.B(i35, z);
                                i12++;
                            }
                        } else {
                            cQf2 = cQf;
                            i9 = size;
                            f9Var = f9Var4;
                            i10 = iJ;
                            i11 = iG;
                            i32 = i8;
                            z13 = oj0Var.b;
                            f70Var5 = oj0Var.a;
                            if (z13) {
                                while (r0.hasNext()) {
                                    e70Var9.a = false;
                                    gd1 gd1Var6 = e70Var9.d;
                                    gd1Var6.e.j = false;
                                    gd1Var6.g = false;
                                    gd1Var6.n();
                                    wh5 wh5Var6 = e70Var9.e;
                                    wh5Var6.e.j = false;
                                    wh5Var6.g = false;
                                    wh5Var6.m();
                                }
                                i33 = 0;
                                f70Var5.a = false;
                                gd1 gd1Var7 = f70Var5.d;
                                gd1Var7.e.j = false;
                                gd1Var7.g = false;
                                gd1Var7.n();
                                wh5 wh5Var7 = f70Var5.e;
                                wh5Var7.e.j = false;
                                wh5Var7.g = false;
                                wh5Var7.m();
                                oj0Var.c();
                            } else {
                                i33 = 0;
                            }
                            oj0Var.b(oj0Var.d);
                            f70Var5.P = i33;
                            f70Var5.Q = i33;
                            f70Var5.d.h.d(i33);
                            f70Var5.e.h.d(i33);
                            i34 = 1073741824;
                            if (mode == 1073741824) {
                                f70Var = f70Var6;
                                i35 = 1;
                                zB = f70Var.B(i33, z) & true;
                                i12 = 1;
                            } else {
                                f70Var = f70Var6;
                                i35 = 1;
                                zB = true;
                                i12 = 0;
                            }
                            if (i32 == 1073741824) {
                                zB &= f70Var.B(i35, z);
                                i12++;
                            }
                        }
                        if (zB) {
                            if (mode == i34) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (i32 == i34) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            f70Var.w(z14, z15);
                        }
                    } else {
                        cQf2 = cQf;
                        i9 = size;
                        f70Var = f70Var6;
                        f9Var = f9Var4;
                        i10 = iJ;
                        i11 = iG;
                        zB = false;
                        i12 = 0;
                    }
                    if (zB) {
                        if (i9 > 0) {
                            size3 = f70Var.e0.size();
                            cQf6 = f70Var.h0;
                            i29 = 0;
                            while (i29 < size3) {
                                e70Var6 = f70Var.e0.get(i29);
                                if (e70Var6 instanceof bb1) {
                                    f9Var3 = f9Var;
                                } else {
                                    iF = e70Var6.f(0);
                                    int iF5 = e70Var6.f(1);
                                    if (iF == 3) {
                                        z10 = false;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        f9Var3 = f9Var;
                                    } else {
                                        f9Var3 = f9Var;
                                        f9Var3.a(cQf6, e70Var6, false);
                                    }
                                }
                                i29++;
                                f9Var = f9Var3;
                            }
                            f9Var2 = f9Var;
                            constraintLayout = ((CQf) cQf6).a;
                            childCount = constraintLayout.getChildCount();
                            while (i30 < childCount) {
                                childAt = constraintLayout.getChildAt(i30);
                                if (childAt instanceof LPt8Fixed) {
                                    lPt8 = (LPt8Fixed) childAt;
                                    if (lPt8.x != null) {
                                        QnHx qnHx5 = (QnHx) lPt8.getLayoutParams();
                                        qnHx3 = (QnHx) lPt8.x.getLayoutParams();
                                        e70Var3 = qnHx3.l0;
                                        e70Var3.X = 0;
                                        e70Var4 = qnHx5.l0;
                                        if (e70Var4.J[0] != 1) {
                                            e70Var4.v(e70Var3.j());
                                        }
                                        e70Var5 = qnHx5.l0;
                                        if (e70Var5.J[1] != 1) {
                                            e70Var5.s(qnHx3.l0.g());
                                        }
                                        qnHx3.l0.X = 8;
                                    }
                                }
                            }
                            arrayList3 = constraintLayout.x;
                            size4 = arrayList3.size();
                            if (size4 > 0) {
                                while (i31 < size4) {
                                    arrayList3.get(i31).getClass();
                                }
                            }
                        } else {
                            f9Var2 = f9Var;
                        }
                        i13 = f70Var.q0;
                        arrayList = f9Var2.a;
                        size2 = arrayList.size();
                        if (i9 > 0) {
                            i14 = i10;
                            i15 = i11;
                            f9Var2.b(f70Var, i14, i15);
                        } else {
                            i14 = i10;
                            i15 = i11;
                        }
                        if (size2 > 0) {
                            iArr2 = f70Var.J;
                            if (iArr2[0] == 2) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (iArr2[1] == 2) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            int iJ11 = f70Var.j();
                            f70 f70Var9 = f9Var2.c;
                            iMax3 = Math.max(iJ11, f70Var9.S);
                            iMax4 = Math.max(f70Var.g(), f70Var9.T);
                            i18 = 0;
                            zA = false;
                            while (true) {
                                qnHx = w60.QnHx.BOTTOM;
                                qnHx2 = w60.QnHx.RIGHT;
                                if (i18 >= size2) {
                                    break;
                                    break;
                                }
                                e70Var2 = arrayList.get(i18);
                                int i57 = i13;
                                if (e70Var2 instanceof gk5) {
                                    cQf5 = cQf2;
                                } else {
                                    iJ4 = e70Var2.j();
                                    iG4 = e70Var2.g();
                                    cQf5 = cQf2;
                                    boolean zA3 = zA | f9Var2.a(cQf5, e70Var2, true);
                                    iJ5 = e70Var2.j();
                                    z8 = zA3;
                                    iG5 = e70Var2.g();
                                    if (iJ5 != iJ4) {
                                        e70Var2.v(iJ5);
                                        if (z4) {
                                            iMax3 = Math.max(iMax3, e70Var2.e(qnHx2).b() + e70Var2.k() + e70Var2.L);
                                        }
                                        z8 = true;
                                    }
                                    if (iG5 != iG4) {
                                        e70Var2.s(iG5);
                                        if (z5) {
                                            iMax4 = Math.max(iMax4, e70Var2.e(qnHx).b() + e70Var2.l() + e70Var2.M);
                                        }
                                        z9 = true;
                                    } else {
                                        z9 = z8;
                                    }
                                    zA = z9 | false;
                                }
                                i18++;
                                cQf2 = cQf5;
                                i13 = i57;
                                i14 = i14;
                                i15 = i15;
                                f70Var = f70Var;
                            }
                            f70Var3 = f70Var;
                            i16 = i13;
                            i19 = i14;
                            i20 = i15;
                            cQf3 = cQf2;
                            i22 = 0;
                            while (i22 < i21) {
                                i25 = 0;
                                while (i25 < size2) {
                                    e70Var = arrayList.get(i25);
                                    if (e70Var instanceof wc1) {
                                        if (e70Var.X == 8) {
                                            arrayList2 = arrayList;
                                            i28 = size2;
                                            cQf4 = cQf3;
                                        } else {
                                            iJ2 = e70Var.j();
                                            iG2 = e70Var.g();
                                            arrayList2 = arrayList;
                                            int i58 = e70Var.R;
                                            i28 = size2;
                                            zA |= f9Var2.a(cQf3, e70Var, true);
                                            iJ3 = e70Var.j();
                                            cQf4 = cQf3;
                                            iG3 = e70Var.g();
                                            if (iJ3 != iJ2) {
                                                e70Var.v(iJ3);
                                                if (z4) {
                                                    iMax3 = Math.max(iMax3, e70Var.e(qnHx2).b() + e70Var.k() + e70Var.L);
                                                }
                                                zA = true;
                                            }
                                            if (iG3 != iG2) {
                                                e70Var.s(iG3);
                                                if (z5) {
                                                    iMax4 = Math.max(iMax4, e70Var.e(qnHx).b() + e70Var.l() + e70Var.M);
                                                }
                                                zA = true;
                                            }
                                            if (!e70Var.w) {
                                            }
                                        }
                                    } else if (e70Var.X == 8) {
                                        arrayList2 = arrayList;
                                        i28 = size2;
                                        cQf4 = cQf3;
                                    } else {
                                        iJ2 = e70Var.j();
                                        iG2 = e70Var.g();
                                        arrayList2 = arrayList;
                                        int i59 = e70Var.R;
                                        i28 = size2;
                                        zA |= f9Var2.a(cQf3, e70Var, true);
                                        iJ3 = e70Var.j();
                                        cQf4 = cQf3;
                                        iG3 = e70Var.g();
                                        if (iJ3 != iJ2) {
                                            e70Var.v(iJ3);
                                            if (z4) {
                                                iMax3 = Math.max(iMax3, e70Var.e(qnHx2).b() + e70Var.k() + e70Var.L);
                                            }
                                            zA = true;
                                        }
                                        if (iG3 != iG2) {
                                            e70Var.s(iG3);
                                            if (z5) {
                                                iMax4 = Math.max(iMax4, e70Var.e(qnHx).b() + e70Var.l() + e70Var.M);
                                            }
                                            zA = true;
                                        }
                                        if (!e70Var.w) {
                                        }
                                    }
                                    i25++;
                                    arrayList = arrayList2;
                                    size2 = i28;
                                    cQf3 = cQf4;
                                }
                                ArrayList<e70> arrayList7 = arrayList;
                                int i510 = size2;
                                f9.CQf cQf9 = cQf3;
                                if (zA) {
                                    i26 = i19;
                                    i27 = i20;
                                    f70Var4 = f70Var3;
                                    f9Var2.b(f70Var4, i26, i27);
                                    zA = false;
                                } else {
                                    i26 = i19;
                                    i27 = i20;
                                    f70Var4 = f70Var3;
                                }
                                i22++;
                                i19 = i26;
                                i20 = i27;
                                f70Var3 = f70Var4;
                                arrayList = arrayList7;
                                size2 = i510;
                                cQf3 = cQf9;
                            }
                            i23 = i19;
                            i24 = i20;
                            f70Var2 = f70Var3;
                            if (zA) {
                                f9Var2.b(f70Var2, i23, i24);
                                if (f70Var2.j() < iMax3) {
                                    f70Var2.v(iMax3);
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (f70Var2.g() < iMax4) {
                                    f70Var2.s(iMax4);
                                    z7 = true;
                                } else {
                                    z7 = z6;
                                }
                                if (z7) {
                                    f9Var2.b(f70Var2, i23, i24);
                                }
                            }
                        } else {
                            f70Var2 = f70Var;
                            i16 = i13;
                        }
                        i17 = i16;
                        f70Var2.q0 = i17;
                        if ((i17 & 256) == 256) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        o32.p = z3;
                    } else {
                        if (i9 > 0) {
                            size3 = f70Var.e0.size();
                            cQf6 = f70Var.h0;
                            i29 = 0;
                            while (i29 < size3) {
                                e70Var6 = f70Var.e0.get(i29);
                                if (e70Var6 instanceof bb1) {
                                    f9Var3 = f9Var;
                                } else {
                                    iF = e70Var6.f(0);
                                    int iF6 = e70Var6.f(1);
                                    if (iF == 3) {
                                        z10 = false;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        f9Var3 = f9Var;
                                    } else {
                                        f9Var3 = f9Var;
                                        f9Var3.a(cQf6, e70Var6, false);
                                    }
                                }
                                i29++;
                                f9Var = f9Var3;
                            }
                            f9Var2 = f9Var;
                            constraintLayout = ((CQf) cQf6).a;
                            childCount = constraintLayout.getChildCount();
                            while (i30 < childCount) {
                                childAt = constraintLayout.getChildAt(i30);
                                if (childAt instanceof LPt8Fixed) {
                                    lPt8 = (LPt8Fixed) childAt;
                                    if (lPt8.x != null) {
                                        QnHx qnHx6 = (QnHx) lPt8.getLayoutParams();
                                        qnHx3 = (QnHx) lPt8.x.getLayoutParams();
                                        e70Var3 = qnHx3.l0;
                                        e70Var3.X = 0;
                                        e70Var4 = qnHx6.l0;
                                        if (e70Var4.J[0] != 1) {
                                            e70Var4.v(e70Var3.j());
                                        }
                                        e70Var5 = qnHx6.l0;
                                        if (e70Var5.J[1] != 1) {
                                            e70Var5.s(qnHx3.l0.g());
                                        }
                                        qnHx3.l0.X = 8;
                                    }
                                }
                            }
                            arrayList3 = constraintLayout.x;
                            size4 = arrayList3.size();
                            if (size4 > 0) {
                                while (i31 < size4) {
                                    arrayList3.get(i31).getClass();
                                }
                            }
                        } else {
                            f9Var2 = f9Var;
                        }
                        i13 = f70Var.q0;
                        arrayList = f9Var2.a;
                        size2 = arrayList.size();
                        if (i9 > 0) {
                            i14 = i10;
                            i15 = i11;
                            f9Var2.b(f70Var, i14, i15);
                        } else {
                            i14 = i10;
                            i15 = i11;
                        }
                        if (size2 > 0) {
                            iArr2 = f70Var.J;
                            if (iArr2[0] == 2) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (iArr2[1] == 2) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            int iJ12 = f70Var.j();
                            f70 f70Var10 = f9Var2.c;
                            iMax3 = Math.max(iJ12, f70Var10.S);
                            iMax4 = Math.max(f70Var.g(), f70Var10.T);
                            i18 = 0;
                            zA = false;
                            while (true) {
                                qnHx = w60.QnHx.BOTTOM;
                                qnHx2 = w60.QnHx.RIGHT;
                                if (i18 >= size2) {
                                    break;
                                    break;
                                }
                                e70Var2 = arrayList.get(i18);
                                int i511 = i13;
                                if (e70Var2 instanceof gk5) {
                                    cQf5 = cQf2;
                                } else {
                                    iJ4 = e70Var2.j();
                                    iG4 = e70Var2.g();
                                    cQf5 = cQf2;
                                    boolean zA4 = zA | f9Var2.a(cQf5, e70Var2, true);
                                    iJ5 = e70Var2.j();
                                    z8 = zA4;
                                    iG5 = e70Var2.g();
                                    if (iJ5 != iJ4) {
                                        e70Var2.v(iJ5);
                                        if (z4) {
                                            iMax3 = Math.max(iMax3, e70Var2.e(qnHx2).b() + e70Var2.k() + e70Var2.L);
                                        }
                                        z8 = true;
                                    }
                                    if (iG5 != iG4) {
                                        e70Var2.s(iG5);
                                        if (z5) {
                                            iMax4 = Math.max(iMax4, e70Var2.e(qnHx).b() + e70Var2.l() + e70Var2.M);
                                        }
                                        z9 = true;
                                    } else {
                                        z9 = z8;
                                    }
                                    zA = z9 | false;
                                }
                                i18++;
                                cQf2 = cQf5;
                                i13 = i511;
                                i14 = i14;
                                i15 = i15;
                                f70Var = f70Var;
                            }
                            f70Var3 = f70Var;
                            i16 = i13;
                            i19 = i14;
                            i20 = i15;
                            cQf3 = cQf2;
                            i22 = 0;
                            while (i22 < i21) {
                                i25 = 0;
                                while (i25 < size2) {
                                    e70Var = arrayList.get(i25);
                                    if (e70Var instanceof wc1) {
                                        if (e70Var.X == 8) {
                                            arrayList2 = arrayList;
                                            i28 = size2;
                                            cQf4 = cQf3;
                                        } else {
                                            iJ2 = e70Var.j();
                                            iG2 = e70Var.g();
                                            arrayList2 = arrayList;
                                            int i512 = e70Var.R;
                                            i28 = size2;
                                            zA |= f9Var2.a(cQf3, e70Var, true);
                                            iJ3 = e70Var.j();
                                            cQf4 = cQf3;
                                            iG3 = e70Var.g();
                                            if (iJ3 != iJ2) {
                                                e70Var.v(iJ3);
                                                if (z4) {
                                                    iMax3 = Math.max(iMax3, e70Var.e(qnHx2).b() + e70Var.k() + e70Var.L);
                                                }
                                                zA = true;
                                            }
                                            if (iG3 != iG2) {
                                                e70Var.s(iG3);
                                                if (z5) {
                                                    iMax4 = Math.max(iMax4, e70Var.e(qnHx).b() + e70Var.l() + e70Var.M);
                                                }
                                                zA = true;
                                            }
                                            if (!e70Var.w) {
                                            }
                                        }
                                    } else if (e70Var.X == 8) {
                                        arrayList2 = arrayList;
                                        i28 = size2;
                                        cQf4 = cQf3;
                                    } else {
                                        iJ2 = e70Var.j();
                                        iG2 = e70Var.g();
                                        arrayList2 = arrayList;
                                        int i513 = e70Var.R;
                                        i28 = size2;
                                        zA |= f9Var2.a(cQf3, e70Var, true);
                                        iJ3 = e70Var.j();
                                        cQf4 = cQf3;
                                        iG3 = e70Var.g();
                                        if (iJ3 != iJ2) {
                                            e70Var.v(iJ3);
                                            if (z4) {
                                                iMax3 = Math.max(iMax3, e70Var.e(qnHx2).b() + e70Var.k() + e70Var.L);
                                            }
                                            zA = true;
                                        }
                                        if (iG3 != iG2) {
                                            e70Var.s(iG3);
                                            if (z5) {
                                                iMax4 = Math.max(iMax4, e70Var.e(qnHx).b() + e70Var.l() + e70Var.M);
                                            }
                                            zA = true;
                                        }
                                        if (!e70Var.w) {
                                        }
                                    }
                                    i25++;
                                    arrayList = arrayList2;
                                    size2 = i28;
                                    cQf3 = cQf4;
                                }
                                ArrayList<e70> arrayList8 = arrayList;
                                int i514 = size2;
                                f9.CQf cQf10 = cQf3;
                                if (zA) {
                                    i26 = i19;
                                    i27 = i20;
                                    f70Var4 = f70Var3;
                                    f9Var2.b(f70Var4, i26, i27);
                                    zA = false;
                                } else {
                                    i26 = i19;
                                    i27 = i20;
                                    f70Var4 = f70Var3;
                                }
                                i22++;
                                i19 = i26;
                                i20 = i27;
                                f70Var3 = f70Var4;
                                arrayList = arrayList8;
                                size2 = i514;
                                cQf3 = cQf10;
                            }
                            i23 = i19;
                            i24 = i20;
                            f70Var2 = f70Var3;
                            if (zA) {
                                f9Var2.b(f70Var2, i23, i24);
                                if (f70Var2.j() < iMax3) {
                                    f70Var2.v(iMax3);
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (f70Var2.g() < iMax4) {
                                    f70Var2.s(iMax4);
                                    z7 = true;
                                } else {
                                    z7 = z6;
                                }
                                if (z7) {
                                    f9Var2.b(f70Var2, i23, i24);
                                }
                            }
                        } else {
                            f70Var2 = f70Var;
                            i16 = i13;
                        }
                        i17 = i16;
                        f70Var2.q0 = i17;
                        if ((i17 & 256) == 256) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        o32.p = z3;
                    }
                    int iJ13 = f70Var2.j();
                    int iG12 = f70Var2.g();
                    z11 = f70Var2.r0;
                    z12 = f70Var2.s0;
                    int i515 = cQf7.e;
                    int iResolveSizeAndState3 = View.resolveSizeAndState(iJ13 + cQf7.d, i, 0);
                    int iResolveSizeAndState4 = View.resolveSizeAndState(iG12 + i515, i2, 0) & 16777215;
                    iMin2 = Math.min(this.B, iResolveSizeAndState3 & 16777215);
                    iMin3 = Math.min(this.C, iResolveSizeAndState4);
                    if (z11) {
                        iMin2 |= 16777216;
                    }
                    if (z12) {
                        iMin3 |= 16777216;
                    }
                    setMeasuredDimension(iMin2, iMin3);
                }
                if (childCount2 == 0) {
                    iMax2 = Math.max(0, this.A);
                } else {
                    iMax2 = i48;
                }
                iMin = iMax2;
                i4 = 2;
                if (iMax == f70Var6.j()) {
                    oj0Var2.c = true;
                } else {
                    oj0Var2.c = true;
                }
                f70Var6.P = 0;
                f70Var6.Q = 0;
                int i516 = this.B - i50;
                iArr = f70Var6.u;
                iArr[0] = i516;
                iArr[1] = this.C - i49;
                f70Var6.S = 0;
                f70Var6.T = 0;
                f70Var6.t(i3);
                f70Var6.v(iMax);
                f70Var6.u(i4);
                f70Var6.s(iMin);
                i5 = this.z - i50;
                if (i5 < 0) {
                    i6 = 0;
                    f70Var6.S = 0;
                } else {
                    i6 = 0;
                    f70Var6.S = i5;
                }
                i7 = this.A - i49;
                if (i7 < 0) {
                    f70Var6.T = i6;
                } else {
                    f70Var6.T = i7;
                }
                f70Var6.k0 = iMax7;
                f70Var6.l0 = iMax5;
                f9Var4.getClass();
                cQf = f70Var6.h0;
                size = f70Var6.e0.size();
                iJ = f70Var6.j();
                iG = f70Var6.g();
                if ((i45 & 128) == 128) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    z2 = true;
                } else {
                    if ((i45 & 64) == 64) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    if (z21) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    i40 = 0;
                    while (i40 < size) {
                        e70Var7 = f70Var6.e0.get(i40);
                        iArr4 = e70Var7.J;
                        if (iArr4[0] == 3) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (iArr4[1] == 3) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        if (z18) {
                            z20 = false;
                        } else {
                            z20 = false;
                        }
                        if (!e70Var7.o()) {
                        }
                        z2 = false;
                        break;
                    }
                }
                i8 = mode2;
                if (z2 && ((mode != 1073741824 && i8 == 1073741824) || z)) {
                    int iMin8 = Math.min(iArr[0], i47);
                    iMin4 = Math.min(iArr[1], i48);
                    if (mode == 1073741824) {
                        oj0Var = oj0Var2;
                    } else {
                        oj0Var = oj0Var2;
                    }
                    if (i8 == 1073741824) {
                        f70Var6.s(iMin4);
                        oj0Var.b = true;
                    }
                    if (mode == 1073741824) {
                        cQf2 = cQf;
                        i9 = size;
                        f9Var = f9Var4;
                        i10 = iJ;
                        i11 = iG;
                        i32 = i8;
                        z13 = oj0Var.b;
                        f70Var5 = oj0Var.a;
                        if (z13) {
                            while (r0.hasNext()) {
                                e70Var9.a = false;
                                gd1 gd1Var8 = e70Var9.d;
                                gd1Var8.e.j = false;
                                gd1Var8.g = false;
                                gd1Var8.n();
                                wh5 wh5Var8 = e70Var9.e;
                                wh5Var8.e.j = false;
                                wh5Var8.g = false;
                                wh5Var8.m();
                            }
                            i33 = 0;
                            f70Var5.a = false;
                            gd1 gd1Var9 = f70Var5.d;
                            gd1Var9.e.j = false;
                            gd1Var9.g = false;
                            gd1Var9.n();
                            wh5 wh5Var9 = f70Var5.e;
                            wh5Var9.e.j = false;
                            wh5Var9.g = false;
                            wh5Var9.m();
                            oj0Var.c();
                        } else {
                            i33 = 0;
                        }
                        oj0Var.b(oj0Var.d);
                        f70Var5.P = i33;
                        f70Var5.Q = i33;
                        f70Var5.d.h.d(i33);
                        f70Var5.e.h.d(i33);
                        i34 = 1073741824;
                        if (mode == 1073741824) {
                            f70Var = f70Var6;
                            i35 = 1;
                            zB = f70Var.B(i33, z) & true;
                            i12 = 1;
                        } else {
                            f70Var = f70Var6;
                            i35 = 1;
                            zB = true;
                            i12 = 0;
                        }
                        if (i32 == 1073741824) {
                            zB &= f70Var.B(i35, z);
                            i12++;
                        }
                    } else {
                        cQf2 = cQf;
                        i9 = size;
                        f9Var = f9Var4;
                        i10 = iJ;
                        i11 = iG;
                        i32 = i8;
                        z13 = oj0Var.b;
                        f70Var5 = oj0Var.a;
                        if (z13) {
                            while (r0.hasNext()) {
                                e70Var9.a = false;
                                gd1 gd1Var10 = e70Var9.d;
                                gd1Var10.e.j = false;
                                gd1Var10.g = false;
                                gd1Var10.n();
                                wh5 wh5Var10 = e70Var9.e;
                                wh5Var10.e.j = false;
                                wh5Var10.g = false;
                                wh5Var10.m();
                            }
                            i33 = 0;
                            f70Var5.a = false;
                            gd1 gd1Var11 = f70Var5.d;
                            gd1Var11.e.j = false;
                            gd1Var11.g = false;
                            gd1Var11.n();
                            wh5 wh5Var11 = f70Var5.e;
                            wh5Var11.e.j = false;
                            wh5Var11.g = false;
                            wh5Var11.m();
                            oj0Var.c();
                        } else {
                            i33 = 0;
                        }
                        oj0Var.b(oj0Var.d);
                        f70Var5.P = i33;
                        f70Var5.Q = i33;
                        f70Var5.d.h.d(i33);
                        f70Var5.e.h.d(i33);
                        i34 = 1073741824;
                        if (mode == 1073741824) {
                            f70Var = f70Var6;
                            i35 = 1;
                            zB = f70Var.B(i33, z) & true;
                            i12 = 1;
                        } else {
                            f70Var = f70Var6;
                            i35 = 1;
                            zB = true;
                            i12 = 0;
                        }
                        if (i32 == 1073741824) {
                            zB &= f70Var.B(i35, z);
                            i12++;
                        }
                    }
                    if (zB) {
                        if (mode == i34) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (i32 == i34) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        f70Var.w(z14, z15);
                    }
                } else {
                    cQf2 = cQf;
                    i9 = size;
                    f70Var = f70Var6;
                    f9Var = f9Var4;
                    i10 = iJ;
                    i11 = iG;
                    zB = false;
                    i12 = 0;
                }
                if (zB) {
                    if (i9 > 0) {
                        size3 = f70Var.e0.size();
                        cQf6 = f70Var.h0;
                        i29 = 0;
                        while (i29 < size3) {
                            e70Var6 = f70Var.e0.get(i29);
                            if (e70Var6 instanceof bb1) {
                                f9Var3 = f9Var;
                            } else {
                                iF = e70Var6.f(0);
                                int iF7 = e70Var6.f(1);
                                if (iF == 3) {
                                    z10 = false;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    f9Var3 = f9Var;
                                } else {
                                    f9Var3 = f9Var;
                                    f9Var3.a(cQf6, e70Var6, false);
                                }
                            }
                            i29++;
                            f9Var = f9Var3;
                        }
                        f9Var2 = f9Var;
                        constraintLayout = ((CQf) cQf6).a;
                        childCount = constraintLayout.getChildCount();
                        while (i30 < childCount) {
                            childAt = constraintLayout.getChildAt(i30);
                            if (childAt instanceof LPt8Fixed) {
                                lPt8 = (LPt8Fixed) childAt;
                                if (lPt8.x != null) {
                                    QnHx qnHx7 = (QnHx) lPt8.getLayoutParams();
                                    qnHx3 = (QnHx) lPt8.x.getLayoutParams();
                                    e70Var3 = qnHx3.l0;
                                    e70Var3.X = 0;
                                    e70Var4 = qnHx7.l0;
                                    if (e70Var4.J[0] != 1) {
                                        e70Var4.v(e70Var3.j());
                                    }
                                    e70Var5 = qnHx7.l0;
                                    if (e70Var5.J[1] != 1) {
                                        e70Var5.s(qnHx3.l0.g());
                                    }
                                    qnHx3.l0.X = 8;
                                }
                            }
                        }
                        arrayList3 = constraintLayout.x;
                        size4 = arrayList3.size();
                        if (size4 > 0) {
                            while (i31 < size4) {
                                arrayList3.get(i31).getClass();
                            }
                        }
                    } else {
                        f9Var2 = f9Var;
                    }
                    i13 = f70Var.q0;
                    arrayList = f9Var2.a;
                    size2 = arrayList.size();
                    if (i9 > 0) {
                        i14 = i10;
                        i15 = i11;
                        f9Var2.b(f70Var, i14, i15);
                    } else {
                        i14 = i10;
                        i15 = i11;
                    }
                    if (size2 > 0) {
                        iArr2 = f70Var.J;
                        if (iArr2[0] == 2) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (iArr2[1] == 2) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        int iJ14 = f70Var.j();
                        f70 f70Var11 = f9Var2.c;
                        iMax3 = Math.max(iJ14, f70Var11.S);
                        iMax4 = Math.max(f70Var.g(), f70Var11.T);
                        i18 = 0;
                        zA = false;
                        while (true) {
                            qnHx = w60.QnHx.BOTTOM;
                            qnHx2 = w60.QnHx.RIGHT;
                            if (i18 >= size2) {
                                break;
                                break;
                            }
                            e70Var2 = arrayList.get(i18);
                            int i517 = i13;
                            if (e70Var2 instanceof gk5) {
                                cQf5 = cQf2;
                            } else {
                                iJ4 = e70Var2.j();
                                iG4 = e70Var2.g();
                                cQf5 = cQf2;
                                boolean zA5 = zA | f9Var2.a(cQf5, e70Var2, true);
                                iJ5 = e70Var2.j();
                                z8 = zA5;
                                iG5 = e70Var2.g();
                                if (iJ5 != iJ4) {
                                    e70Var2.v(iJ5);
                                    if (z4) {
                                        iMax3 = Math.max(iMax3, e70Var2.e(qnHx2).b() + e70Var2.k() + e70Var2.L);
                                    }
                                    z8 = true;
                                }
                                if (iG5 != iG4) {
                                    e70Var2.s(iG5);
                                    if (z5) {
                                        iMax4 = Math.max(iMax4, e70Var2.e(qnHx).b() + e70Var2.l() + e70Var2.M);
                                    }
                                    z9 = true;
                                } else {
                                    z9 = z8;
                                }
                                zA = z9 | false;
                            }
                            i18++;
                            cQf2 = cQf5;
                            i13 = i517;
                            i14 = i14;
                            i15 = i15;
                            f70Var = f70Var;
                        }
                        f70Var3 = f70Var;
                        i16 = i13;
                        i19 = i14;
                        i20 = i15;
                        cQf3 = cQf2;
                        i22 = 0;
                        while (i22 < i21) {
                            i25 = 0;
                            while (i25 < size2) {
                                e70Var = arrayList.get(i25);
                                if (e70Var instanceof wc1) {
                                    if (e70Var.X == 8) {
                                        arrayList2 = arrayList;
                                        i28 = size2;
                                        cQf4 = cQf3;
                                    } else {
                                        iJ2 = e70Var.j();
                                        iG2 = e70Var.g();
                                        arrayList2 = arrayList;
                                        int i518 = e70Var.R;
                                        i28 = size2;
                                        zA |= f9Var2.a(cQf3, e70Var, true);
                                        iJ3 = e70Var.j();
                                        cQf4 = cQf3;
                                        iG3 = e70Var.g();
                                        if (iJ3 != iJ2) {
                                            e70Var.v(iJ3);
                                            if (z4) {
                                                iMax3 = Math.max(iMax3, e70Var.e(qnHx2).b() + e70Var.k() + e70Var.L);
                                            }
                                            zA = true;
                                        }
                                        if (iG3 != iG2) {
                                            e70Var.s(iG3);
                                            if (z5) {
                                                iMax4 = Math.max(iMax4, e70Var.e(qnHx).b() + e70Var.l() + e70Var.M);
                                            }
                                            zA = true;
                                        }
                                        if (!e70Var.w) {
                                        }
                                    }
                                } else if (e70Var.X == 8) {
                                    arrayList2 = arrayList;
                                    i28 = size2;
                                    cQf4 = cQf3;
                                } else {
                                    iJ2 = e70Var.j();
                                    iG2 = e70Var.g();
                                    arrayList2 = arrayList;
                                    int i519 = e70Var.R;
                                    i28 = size2;
                                    zA |= f9Var2.a(cQf3, e70Var, true);
                                    iJ3 = e70Var.j();
                                    cQf4 = cQf3;
                                    iG3 = e70Var.g();
                                    if (iJ3 != iJ2) {
                                        e70Var.v(iJ3);
                                        if (z4) {
                                            iMax3 = Math.max(iMax3, e70Var.e(qnHx2).b() + e70Var.k() + e70Var.L);
                                        }
                                        zA = true;
                                    }
                                    if (iG3 != iG2) {
                                        e70Var.s(iG3);
                                        if (z5) {
                                            iMax4 = Math.max(iMax4, e70Var.e(qnHx).b() + e70Var.l() + e70Var.M);
                                        }
                                        zA = true;
                                    }
                                    if (!e70Var.w) {
                                    }
                                }
                                i25++;
                                arrayList = arrayList2;
                                size2 = i28;
                                cQf3 = cQf4;
                            }
                            ArrayList<e70> arrayList9 = arrayList;
                            int i5110 = size2;
                            f9.CQf cQf11 = cQf3;
                            if (zA) {
                                i26 = i19;
                                i27 = i20;
                                f70Var4 = f70Var3;
                                f9Var2.b(f70Var4, i26, i27);
                                zA = false;
                            } else {
                                i26 = i19;
                                i27 = i20;
                                f70Var4 = f70Var3;
                            }
                            i22++;
                            i19 = i26;
                            i20 = i27;
                            f70Var3 = f70Var4;
                            arrayList = arrayList9;
                            size2 = i5110;
                            cQf3 = cQf11;
                        }
                        i23 = i19;
                        i24 = i20;
                        f70Var2 = f70Var3;
                        if (zA) {
                            f9Var2.b(f70Var2, i23, i24);
                            if (f70Var2.j() < iMax3) {
                                f70Var2.v(iMax3);
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (f70Var2.g() < iMax4) {
                                f70Var2.s(iMax4);
                                z7 = true;
                            } else {
                                z7 = z6;
                            }
                            if (z7) {
                                f9Var2.b(f70Var2, i23, i24);
                            }
                        }
                    } else {
                        f70Var2 = f70Var;
                        i16 = i13;
                    }
                    i17 = i16;
                    f70Var2.q0 = i17;
                    if ((i17 & 256) == 256) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    o32.p = z3;
                } else {
                    if (i9 > 0) {
                        size3 = f70Var.e0.size();
                        cQf6 = f70Var.h0;
                        i29 = 0;
                        while (i29 < size3) {
                            e70Var6 = f70Var.e0.get(i29);
                            if (e70Var6 instanceof bb1) {
                                f9Var3 = f9Var;
                            } else {
                                iF = e70Var6.f(0);
                                int iF8 = e70Var6.f(1);
                                if (iF == 3) {
                                    z10 = false;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    f9Var3 = f9Var;
                                } else {
                                    f9Var3 = f9Var;
                                    f9Var3.a(cQf6, e70Var6, false);
                                }
                            }
                            i29++;
                            f9Var = f9Var3;
                        }
                        f9Var2 = f9Var;
                        constraintLayout = ((CQf) cQf6).a;
                        childCount = constraintLayout.getChildCount();
                        while (i30 < childCount) {
                            childAt = constraintLayout.getChildAt(i30);
                            if (childAt instanceof LPt8Fixed) {
                                lPt8 = (LPt8Fixed) childAt;
                                if (lPt8.x != null) {
                                    QnHx qnHx8 = (QnHx) lPt8.getLayoutParams();
                                    qnHx3 = (QnHx) lPt8.x.getLayoutParams();
                                    e70Var3 = qnHx3.l0;
                                    e70Var3.X = 0;
                                    e70Var4 = qnHx8.l0;
                                    if (e70Var4.J[0] != 1) {
                                        e70Var4.v(e70Var3.j());
                                    }
                                    e70Var5 = qnHx8.l0;
                                    if (e70Var5.J[1] != 1) {
                                        e70Var5.s(qnHx3.l0.g());
                                    }
                                    qnHx3.l0.X = 8;
                                }
                            }
                        }
                        arrayList3 = constraintLayout.x;
                        size4 = arrayList3.size();
                        if (size4 > 0) {
                            while (i31 < size4) {
                                arrayList3.get(i31).getClass();
                            }
                        }
                    } else {
                        f9Var2 = f9Var;
                    }
                    i13 = f70Var.q0;
                    arrayList = f9Var2.a;
                    size2 = arrayList.size();
                    if (i9 > 0) {
                        i14 = i10;
                        i15 = i11;
                        f9Var2.b(f70Var, i14, i15);
                    } else {
                        i14 = i10;
                        i15 = i11;
                    }
                    if (size2 > 0) {
                        iArr2 = f70Var.J;
                        if (iArr2[0] == 2) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (iArr2[1] == 2) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        int iJ15 = f70Var.j();
                        f70 f70Var12 = f9Var2.c;
                        iMax3 = Math.max(iJ15, f70Var12.S);
                        iMax4 = Math.max(f70Var.g(), f70Var12.T);
                        i18 = 0;
                        zA = false;
                        while (true) {
                            qnHx = w60.QnHx.BOTTOM;
                            qnHx2 = w60.QnHx.RIGHT;
                            if (i18 >= size2) {
                                break;
                                break;
                            }
                            e70Var2 = arrayList.get(i18);
                            int i5111 = i13;
                            if (e70Var2 instanceof gk5) {
                                cQf5 = cQf2;
                            } else {
                                iJ4 = e70Var2.j();
                                iG4 = e70Var2.g();
                                cQf5 = cQf2;
                                boolean zA6 = zA | f9Var2.a(cQf5, e70Var2, true);
                                iJ5 = e70Var2.j();
                                z8 = zA6;
                                iG5 = e70Var2.g();
                                if (iJ5 != iJ4) {
                                    e70Var2.v(iJ5);
                                    if (z4) {
                                        iMax3 = Math.max(iMax3, e70Var2.e(qnHx2).b() + e70Var2.k() + e70Var2.L);
                                    }
                                    z8 = true;
                                }
                                if (iG5 != iG4) {
                                    e70Var2.s(iG5);
                                    if (z5) {
                                        iMax4 = Math.max(iMax4, e70Var2.e(qnHx).b() + e70Var2.l() + e70Var2.M);
                                    }
                                    z9 = true;
                                } else {
                                    z9 = z8;
                                }
                                zA = z9 | false;
                            }
                            i18++;
                            cQf2 = cQf5;
                            i13 = i5111;
                            i14 = i14;
                            i15 = i15;
                            f70Var = f70Var;
                        }
                        f70Var3 = f70Var;
                        i16 = i13;
                        i19 = i14;
                        i20 = i15;
                        cQf3 = cQf2;
                        i22 = 0;
                        while (i22 < i21) {
                            i25 = 0;
                            while (i25 < size2) {
                                e70Var = arrayList.get(i25);
                                if (e70Var instanceof wc1) {
                                    if (e70Var.X == 8) {
                                        arrayList2 = arrayList;
                                        i28 = size2;
                                        cQf4 = cQf3;
                                    } else {
                                        iJ2 = e70Var.j();
                                        iG2 = e70Var.g();
                                        arrayList2 = arrayList;
                                        int i5112 = e70Var.R;
                                        i28 = size2;
                                        zA |= f9Var2.a(cQf3, e70Var, true);
                                        iJ3 = e70Var.j();
                                        cQf4 = cQf3;
                                        iG3 = e70Var.g();
                                        if (iJ3 != iJ2) {
                                            e70Var.v(iJ3);
                                            if (z4) {
                                                iMax3 = Math.max(iMax3, e70Var.e(qnHx2).b() + e70Var.k() + e70Var.L);
                                            }
                                            zA = true;
                                        }
                                        if (iG3 != iG2) {
                                            e70Var.s(iG3);
                                            if (z5) {
                                                iMax4 = Math.max(iMax4, e70Var.e(qnHx).b() + e70Var.l() + e70Var.M);
                                            }
                                            zA = true;
                                        }
                                        if (!e70Var.w) {
                                        }
                                    }
                                } else if (e70Var.X == 8) {
                                    arrayList2 = arrayList;
                                    i28 = size2;
                                    cQf4 = cQf3;
                                } else {
                                    iJ2 = e70Var.j();
                                    iG2 = e70Var.g();
                                    arrayList2 = arrayList;
                                    int i5113 = e70Var.R;
                                    i28 = size2;
                                    zA |= f9Var2.a(cQf3, e70Var, true);
                                    iJ3 = e70Var.j();
                                    cQf4 = cQf3;
                                    iG3 = e70Var.g();
                                    if (iJ3 != iJ2) {
                                        e70Var.v(iJ3);
                                        if (z4) {
                                            iMax3 = Math.max(iMax3, e70Var.e(qnHx2).b() + e70Var.k() + e70Var.L);
                                        }
                                        zA = true;
                                    }
                                    if (iG3 != iG2) {
                                        e70Var.s(iG3);
                                        if (z5) {
                                            iMax4 = Math.max(iMax4, e70Var.e(qnHx).b() + e70Var.l() + e70Var.M);
                                        }
                                        zA = true;
                                    }
                                    if (!e70Var.w) {
                                    }
                                }
                                i25++;
                                arrayList = arrayList2;
                                size2 = i28;
                                cQf3 = cQf4;
                            }
                            ArrayList<e70> arrayList10 = arrayList;
                            int i5114 = size2;
                            f9.CQf cQf12 = cQf3;
                            if (zA) {
                                i26 = i19;
                                i27 = i20;
                                f70Var4 = f70Var3;
                                f9Var2.b(f70Var4, i26, i27);
                                zA = false;
                            } else {
                                i26 = i19;
                                i27 = i20;
                                f70Var4 = f70Var3;
                            }
                            i22++;
                            i19 = i26;
                            i20 = i27;
                            f70Var3 = f70Var4;
                            arrayList = arrayList10;
                            size2 = i5114;
                            cQf3 = cQf12;
                        }
                        i23 = i19;
                        i24 = i20;
                        f70Var2 = f70Var3;
                        if (zA) {
                            f9Var2.b(f70Var2, i23, i24);
                            if (f70Var2.j() < iMax3) {
                                f70Var2.v(iMax3);
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (f70Var2.g() < iMax4) {
                                f70Var2.s(iMax4);
                                z7 = true;
                            } else {
                                z7 = z6;
                            }
                            if (z7) {
                                f9Var2.b(f70Var2, i23, i24);
                            }
                        }
                    } else {
                        f70Var2 = f70Var;
                        i16 = i13;
                    }
                    i17 = i16;
                    f70Var2.q0 = i17;
                    if ((i17 & 256) == 256) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    o32.p = z3;
                }
                int iJ16 = f70Var2.j();
                int iG13 = f70Var2.g();
                z11 = f70Var2.r0;
                z12 = f70Var2.s0;
                int i5115 = cQf7.e;
                int iResolveSizeAndState5 = View.resolveSizeAndState(iJ16 + cQf7.d, i, 0);
                int iResolveSizeAndState6 = View.resolveSizeAndState(iG13 + i5115, i2, 0) & 16777215;
                iMin2 = Math.min(this.B, iResolveSizeAndState5 & 16777215);
                iMin3 = Math.min(this.C, iResolveSizeAndState6);
                if (z11) {
                    iMin2 |= 16777216;
                }
                if (z12) {
                    iMin3 |= 16777216;
                }
                setMeasuredDimension(iMin2, iMin3);
            }
            if (childCount2 == 0) {
                iMax = Math.max(0, this.z);
            } else {
                i41 = 2;
            }
            iMin5 = 0;
            i3 = i41;
            iMax = iMin5;
            if (mode2 != Integer.MIN_VALUE) {
                if (mode2 != 0) {
                    if (mode2 != 1073741824) {
                        i4 = 1;
                        iMin = 0;
                    } else {
                        iMin = Math.min(this.C - i49, i48);
                        i4 = 1;
                    }
                    if (iMax == f70Var6.j()) {
                        oj0Var2.c = true;
                    } else {
                        oj0Var2.c = true;
                    }
                    f70Var6.P = 0;
                    f70Var6.Q = 0;
                    int i5116 = this.B - i50;
                    iArr = f70Var6.u;
                    iArr[0] = i5116;
                    iArr[1] = this.C - i49;
                    f70Var6.S = 0;
                    f70Var6.T = 0;
                    f70Var6.t(i3);
                    f70Var6.v(iMax);
                    f70Var6.u(i4);
                    f70Var6.s(iMin);
                    i5 = this.z - i50;
                    if (i5 < 0) {
                        i6 = 0;
                        f70Var6.S = 0;
                    } else {
                        i6 = 0;
                        f70Var6.S = i5;
                    }
                    i7 = this.A - i49;
                    if (i7 < 0) {
                        f70Var6.T = i6;
                    } else {
                        f70Var6.T = i7;
                    }
                    f70Var6.k0 = iMax7;
                    f70Var6.l0 = iMax5;
                    f9Var4.getClass();
                    cQf = f70Var6.h0;
                    size = f70Var6.e0.size();
                    iJ = f70Var6.j();
                    iG = f70Var6.g();
                    if ((i45 & 128) == 128) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        z2 = true;
                    } else {
                        if ((i45 & 64) == 64) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        if (z21) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                    if (z2) {
                        i40 = 0;
                        while (i40 < size) {
                            e70Var7 = f70Var6.e0.get(i40);
                            iArr4 = e70Var7.J;
                            if (iArr4[0] == 3) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            if (iArr4[1] == 3) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            if (z18) {
                                z20 = false;
                            } else {
                                z20 = false;
                            }
                            if (!e70Var7.o()) {
                            }
                            z2 = false;
                            break;
                        }
                    }
                    i8 = mode2;
                    if (z2 && ((mode != 1073741824 && i8 == 1073741824) || z)) {
                        int iMin9 = Math.min(iArr[0], i47);
                        iMin4 = Math.min(iArr[1], i48);
                        if (mode == 1073741824) {
                            oj0Var = oj0Var2;
                        } else {
                            oj0Var = oj0Var2;
                        }
                        if (i8 == 1073741824) {
                            f70Var6.s(iMin4);
                            oj0Var.b = true;
                        }
                        if (mode == 1073741824) {
                            cQf2 = cQf;
                            i9 = size;
                            f9Var = f9Var4;
                            i10 = iJ;
                            i11 = iG;
                            i32 = i8;
                            z13 = oj0Var.b;
                            f70Var5 = oj0Var.a;
                            if (z13) {
                                while (r0.hasNext()) {
                                    e70Var9.a = false;
                                    gd1 gd1Var12 = e70Var9.d;
                                    gd1Var12.e.j = false;
                                    gd1Var12.g = false;
                                    gd1Var12.n();
                                    wh5 wh5Var12 = e70Var9.e;
                                    wh5Var12.e.j = false;
                                    wh5Var12.g = false;
                                    wh5Var12.m();
                                }
                                i33 = 0;
                                f70Var5.a = false;
                                gd1 gd1Var13 = f70Var5.d;
                                gd1Var13.e.j = false;
                                gd1Var13.g = false;
                                gd1Var13.n();
                                wh5 wh5Var13 = f70Var5.e;
                                wh5Var13.e.j = false;
                                wh5Var13.g = false;
                                wh5Var13.m();
                                oj0Var.c();
                            } else {
                                i33 = 0;
                            }
                            oj0Var.b(oj0Var.d);
                            f70Var5.P = i33;
                            f70Var5.Q = i33;
                            f70Var5.d.h.d(i33);
                            f70Var5.e.h.d(i33);
                            i34 = 1073741824;
                            if (mode == 1073741824) {
                                f70Var = f70Var6;
                                i35 = 1;
                                zB = f70Var.B(i33, z) & true;
                                i12 = 1;
                            } else {
                                f70Var = f70Var6;
                                i35 = 1;
                                zB = true;
                                i12 = 0;
                            }
                            if (i32 == 1073741824) {
                                zB &= f70Var.B(i35, z);
                                i12++;
                            }
                        } else {
                            cQf2 = cQf;
                            i9 = size;
                            f9Var = f9Var4;
                            i10 = iJ;
                            i11 = iG;
                            i32 = i8;
                            z13 = oj0Var.b;
                            f70Var5 = oj0Var.a;
                            if (z13) {
                                while (r0.hasNext()) {
                                    e70Var9.a = false;
                                    gd1 gd1Var14 = e70Var9.d;
                                    gd1Var14.e.j = false;
                                    gd1Var14.g = false;
                                    gd1Var14.n();
                                    wh5 wh5Var14 = e70Var9.e;
                                    wh5Var14.e.j = false;
                                    wh5Var14.g = false;
                                    wh5Var14.m();
                                }
                                i33 = 0;
                                f70Var5.a = false;
                                gd1 gd1Var15 = f70Var5.d;
                                gd1Var15.e.j = false;
                                gd1Var15.g = false;
                                gd1Var15.n();
                                wh5 wh5Var15 = f70Var5.e;
                                wh5Var15.e.j = false;
                                wh5Var15.g = false;
                                wh5Var15.m();
                                oj0Var.c();
                            } else {
                                i33 = 0;
                            }
                            oj0Var.b(oj0Var.d);
                            f70Var5.P = i33;
                            f70Var5.Q = i33;
                            f70Var5.d.h.d(i33);
                            f70Var5.e.h.d(i33);
                            i34 = 1073741824;
                            if (mode == 1073741824) {
                                f70Var = f70Var6;
                                i35 = 1;
                                zB = f70Var.B(i33, z) & true;
                                i12 = 1;
                            } else {
                                f70Var = f70Var6;
                                i35 = 1;
                                zB = true;
                                i12 = 0;
                            }
                            if (i32 == 1073741824) {
                                zB &= f70Var.B(i35, z);
                                i12++;
                            }
                        }
                        if (zB) {
                            if (mode == i34) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (i32 == i34) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            f70Var.w(z14, z15);
                        }
                    } else {
                        cQf2 = cQf;
                        i9 = size;
                        f70Var = f70Var6;
                        f9Var = f9Var4;
                        i10 = iJ;
                        i11 = iG;
                        zB = false;
                        i12 = 0;
                    }
                    if (zB) {
                        if (i9 > 0) {
                            size3 = f70Var.e0.size();
                            cQf6 = f70Var.h0;
                            i29 = 0;
                            while (i29 < size3) {
                                e70Var6 = f70Var.e0.get(i29);
                                if (e70Var6 instanceof bb1) {
                                    f9Var3 = f9Var;
                                } else {
                                    iF = e70Var6.f(0);
                                    int iF9 = e70Var6.f(1);
                                    if (iF == 3) {
                                        z10 = false;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        f9Var3 = f9Var;
                                    } else {
                                        f9Var3 = f9Var;
                                        f9Var3.a(cQf6, e70Var6, false);
                                    }
                                }
                                i29++;
                                f9Var = f9Var3;
                            }
                            f9Var2 = f9Var;
                            constraintLayout = ((CQf) cQf6).a;
                            childCount = constraintLayout.getChildCount();
                            while (i30 < childCount) {
                                childAt = constraintLayout.getChildAt(i30);
                                if (childAt instanceof LPt8Fixed) {
                                    lPt8 = (LPt8Fixed) childAt;
                                    if (lPt8.x != null) {
                                        QnHx qnHx9 = (QnHx) lPt8.getLayoutParams();
                                        qnHx3 = (QnHx) lPt8.x.getLayoutParams();
                                        e70Var3 = qnHx3.l0;
                                        e70Var3.X = 0;
                                        e70Var4 = qnHx9.l0;
                                        if (e70Var4.J[0] != 1) {
                                            e70Var4.v(e70Var3.j());
                                        }
                                        e70Var5 = qnHx9.l0;
                                        if (e70Var5.J[1] != 1) {
                                            e70Var5.s(qnHx3.l0.g());
                                        }
                                        qnHx3.l0.X = 8;
                                    }
                                }
                            }
                            arrayList3 = constraintLayout.x;
                            size4 = arrayList3.size();
                            if (size4 > 0) {
                                while (i31 < size4) {
                                    arrayList3.get(i31).getClass();
                                }
                            }
                        } else {
                            f9Var2 = f9Var;
                        }
                        i13 = f70Var.q0;
                        arrayList = f9Var2.a;
                        size2 = arrayList.size();
                        if (i9 > 0) {
                            i14 = i10;
                            i15 = i11;
                            f9Var2.b(f70Var, i14, i15);
                        } else {
                            i14 = i10;
                            i15 = i11;
                        }
                        if (size2 > 0) {
                            iArr2 = f70Var.J;
                            if (iArr2[0] == 2) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (iArr2[1] == 2) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            int iJ17 = f70Var.j();
                            f70 f70Var13 = f9Var2.c;
                            iMax3 = Math.max(iJ17, f70Var13.S);
                            iMax4 = Math.max(f70Var.g(), f70Var13.T);
                            i18 = 0;
                            zA = false;
                            while (true) {
                                qnHx = w60.QnHx.BOTTOM;
                                qnHx2 = w60.QnHx.RIGHT;
                                if (i18 >= size2) {
                                    break;
                                    break;
                                }
                                e70Var2 = arrayList.get(i18);
                                int i5117 = i13;
                                if (e70Var2 instanceof gk5) {
                                    cQf5 = cQf2;
                                } else {
                                    iJ4 = e70Var2.j();
                                    iG4 = e70Var2.g();
                                    cQf5 = cQf2;
                                    boolean zA7 = zA | f9Var2.a(cQf5, e70Var2, true);
                                    iJ5 = e70Var2.j();
                                    z8 = zA7;
                                    iG5 = e70Var2.g();
                                    if (iJ5 != iJ4) {
                                        e70Var2.v(iJ5);
                                        if (z4) {
                                            iMax3 = Math.max(iMax3, e70Var2.e(qnHx2).b() + e70Var2.k() + e70Var2.L);
                                        }
                                        z8 = true;
                                    }
                                    if (iG5 != iG4) {
                                        e70Var2.s(iG5);
                                        if (z5) {
                                            iMax4 = Math.max(iMax4, e70Var2.e(qnHx).b() + e70Var2.l() + e70Var2.M);
                                        }
                                        z9 = true;
                                    } else {
                                        z9 = z8;
                                    }
                                    zA = z9 | false;
                                }
                                i18++;
                                cQf2 = cQf5;
                                i13 = i5117;
                                i14 = i14;
                                i15 = i15;
                                f70Var = f70Var;
                            }
                            f70Var3 = f70Var;
                            i16 = i13;
                            i19 = i14;
                            i20 = i15;
                            cQf3 = cQf2;
                            i22 = 0;
                            while (i22 < i21) {
                                i25 = 0;
                                while (i25 < size2) {
                                    e70Var = arrayList.get(i25);
                                    if (e70Var instanceof wc1) {
                                        if (e70Var.X == 8) {
                                            arrayList2 = arrayList;
                                            i28 = size2;
                                            cQf4 = cQf3;
                                        } else {
                                            iJ2 = e70Var.j();
                                            iG2 = e70Var.g();
                                            arrayList2 = arrayList;
                                            int i5118 = e70Var.R;
                                            i28 = size2;
                                            zA |= f9Var2.a(cQf3, e70Var, true);
                                            iJ3 = e70Var.j();
                                            cQf4 = cQf3;
                                            iG3 = e70Var.g();
                                            if (iJ3 != iJ2) {
                                                e70Var.v(iJ3);
                                                if (z4) {
                                                    iMax3 = Math.max(iMax3, e70Var.e(qnHx2).b() + e70Var.k() + e70Var.L);
                                                }
                                                zA = true;
                                            }
                                            if (iG3 != iG2) {
                                                e70Var.s(iG3);
                                                if (z5) {
                                                    iMax4 = Math.max(iMax4, e70Var.e(qnHx).b() + e70Var.l() + e70Var.M);
                                                }
                                                zA = true;
                                            }
                                            if (!e70Var.w) {
                                            }
                                        }
                                    } else if (e70Var.X == 8) {
                                        arrayList2 = arrayList;
                                        i28 = size2;
                                        cQf4 = cQf3;
                                    } else {
                                        iJ2 = e70Var.j();
                                        iG2 = e70Var.g();
                                        arrayList2 = arrayList;
                                        int i5119 = e70Var.R;
                                        i28 = size2;
                                        zA |= f9Var2.a(cQf3, e70Var, true);
                                        iJ3 = e70Var.j();
                                        cQf4 = cQf3;
                                        iG3 = e70Var.g();
                                        if (iJ3 != iJ2) {
                                            e70Var.v(iJ3);
                                            if (z4) {
                                                iMax3 = Math.max(iMax3, e70Var.e(qnHx2).b() + e70Var.k() + e70Var.L);
                                            }
                                            zA = true;
                                        }
                                        if (iG3 != iG2) {
                                            e70Var.s(iG3);
                                            if (z5) {
                                                iMax4 = Math.max(iMax4, e70Var.e(qnHx).b() + e70Var.l() + e70Var.M);
                                            }
                                            zA = true;
                                        }
                                        if (!e70Var.w) {
                                        }
                                    }
                                    i25++;
                                    arrayList = arrayList2;
                                    size2 = i28;
                                    cQf3 = cQf4;
                                }
                                ArrayList<e70> arrayList11 = arrayList;
                                int i51110 = size2;
                                f9.CQf cQf13 = cQf3;
                                if (zA) {
                                    i26 = i19;
                                    i27 = i20;
                                    f70Var4 = f70Var3;
                                    f9Var2.b(f70Var4, i26, i27);
                                    zA = false;
                                } else {
                                    i26 = i19;
                                    i27 = i20;
                                    f70Var4 = f70Var3;
                                }
                                i22++;
                                i19 = i26;
                                i20 = i27;
                                f70Var3 = f70Var4;
                                arrayList = arrayList11;
                                size2 = i51110;
                                cQf3 = cQf13;
                            }
                            i23 = i19;
                            i24 = i20;
                            f70Var2 = f70Var3;
                            if (zA) {
                                f9Var2.b(f70Var2, i23, i24);
                                if (f70Var2.j() < iMax3) {
                                    f70Var2.v(iMax3);
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (f70Var2.g() < iMax4) {
                                    f70Var2.s(iMax4);
                                    z7 = true;
                                } else {
                                    z7 = z6;
                                }
                                if (z7) {
                                    f9Var2.b(f70Var2, i23, i24);
                                }
                            }
                        } else {
                            f70Var2 = f70Var;
                            i16 = i13;
                        }
                        i17 = i16;
                        f70Var2.q0 = i17;
                        if ((i17 & 256) == 256) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        o32.p = z3;
                    } else {
                        if (i9 > 0) {
                            size3 = f70Var.e0.size();
                            cQf6 = f70Var.h0;
                            i29 = 0;
                            while (i29 < size3) {
                                e70Var6 = f70Var.e0.get(i29);
                                if (e70Var6 instanceof bb1) {
                                    f9Var3 = f9Var;
                                } else {
                                    iF = e70Var6.f(0);
                                    int iF10 = e70Var6.f(1);
                                    if (iF == 3) {
                                        z10 = false;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        f9Var3 = f9Var;
                                    } else {
                                        f9Var3 = f9Var;
                                        f9Var3.a(cQf6, e70Var6, false);
                                    }
                                }
                                i29++;
                                f9Var = f9Var3;
                            }
                            f9Var2 = f9Var;
                            constraintLayout = ((CQf) cQf6).a;
                            childCount = constraintLayout.getChildCount();
                            while (i30 < childCount) {
                                childAt = constraintLayout.getChildAt(i30);
                                if (childAt instanceof LPt8Fixed) {
                                    lPt8 = (LPt8Fixed) childAt;
                                    if (lPt8.x != null) {
                                        QnHx qnHx10 = (QnHx) lPt8.getLayoutParams();
                                        qnHx3 = (QnHx) lPt8.x.getLayoutParams();
                                        e70Var3 = qnHx3.l0;
                                        e70Var3.X = 0;
                                        e70Var4 = qnHx10.l0;
                                        if (e70Var4.J[0] != 1) {
                                            e70Var4.v(e70Var3.j());
                                        }
                                        e70Var5 = qnHx10.l0;
                                        if (e70Var5.J[1] != 1) {
                                            e70Var5.s(qnHx3.l0.g());
                                        }
                                        qnHx3.l0.X = 8;
                                    }
                                }
                            }
                            arrayList3 = constraintLayout.x;
                            size4 = arrayList3.size();
                            if (size4 > 0) {
                                while (i31 < size4) {
                                    arrayList3.get(i31).getClass();
                                }
                            }
                        } else {
                            f9Var2 = f9Var;
                        }
                        i13 = f70Var.q0;
                        arrayList = f9Var2.a;
                        size2 = arrayList.size();
                        if (i9 > 0) {
                            i14 = i10;
                            i15 = i11;
                            f9Var2.b(f70Var, i14, i15);
                        } else {
                            i14 = i10;
                            i15 = i11;
                        }
                        if (size2 > 0) {
                            iArr2 = f70Var.J;
                            if (iArr2[0] == 2) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (iArr2[1] == 2) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            int iJ18 = f70Var.j();
                            f70 f70Var14 = f9Var2.c;
                            iMax3 = Math.max(iJ18, f70Var14.S);
                            iMax4 = Math.max(f70Var.g(), f70Var14.T);
                            i18 = 0;
                            zA = false;
                            while (true) {
                                qnHx = w60.QnHx.BOTTOM;
                                qnHx2 = w60.QnHx.RIGHT;
                                if (i18 >= size2) {
                                    break;
                                    break;
                                }
                                e70Var2 = arrayList.get(i18);
                                int i51111 = i13;
                                if (e70Var2 instanceof gk5) {
                                    cQf5 = cQf2;
                                } else {
                                    iJ4 = e70Var2.j();
                                    iG4 = e70Var2.g();
                                    cQf5 = cQf2;
                                    boolean zA8 = zA | f9Var2.a(cQf5, e70Var2, true);
                                    iJ5 = e70Var2.j();
                                    z8 = zA8;
                                    iG5 = e70Var2.g();
                                    if (iJ5 != iJ4) {
                                        e70Var2.v(iJ5);
                                        if (z4) {
                                            iMax3 = Math.max(iMax3, e70Var2.e(qnHx2).b() + e70Var2.k() + e70Var2.L);
                                        }
                                        z8 = true;
                                    }
                                    if (iG5 != iG4) {
                                        e70Var2.s(iG5);
                                        if (z5) {
                                            iMax4 = Math.max(iMax4, e70Var2.e(qnHx).b() + e70Var2.l() + e70Var2.M);
                                        }
                                        z9 = true;
                                    } else {
                                        z9 = z8;
                                    }
                                    zA = z9 | false;
                                }
                                i18++;
                                cQf2 = cQf5;
                                i13 = i51111;
                                i14 = i14;
                                i15 = i15;
                                f70Var = f70Var;
                            }
                            f70Var3 = f70Var;
                            i16 = i13;
                            i19 = i14;
                            i20 = i15;
                            cQf3 = cQf2;
                            i22 = 0;
                            while (i22 < i21) {
                                i25 = 0;
                                while (i25 < size2) {
                                    e70Var = arrayList.get(i25);
                                    if (e70Var instanceof wc1) {
                                        if (e70Var.X == 8) {
                                            arrayList2 = arrayList;
                                            i28 = size2;
                                            cQf4 = cQf3;
                                        } else {
                                            iJ2 = e70Var.j();
                                            iG2 = e70Var.g();
                                            arrayList2 = arrayList;
                                            int i51112 = e70Var.R;
                                            i28 = size2;
                                            zA |= f9Var2.a(cQf3, e70Var, true);
                                            iJ3 = e70Var.j();
                                            cQf4 = cQf3;
                                            iG3 = e70Var.g();
                                            if (iJ3 != iJ2) {
                                                e70Var.v(iJ3);
                                                if (z4) {
                                                    iMax3 = Math.max(iMax3, e70Var.e(qnHx2).b() + e70Var.k() + e70Var.L);
                                                }
                                                zA = true;
                                            }
                                            if (iG3 != iG2) {
                                                e70Var.s(iG3);
                                                if (z5) {
                                                    iMax4 = Math.max(iMax4, e70Var.e(qnHx).b() + e70Var.l() + e70Var.M);
                                                }
                                                zA = true;
                                            }
                                            if (!e70Var.w) {
                                            }
                                        }
                                    } else if (e70Var.X == 8) {
                                        arrayList2 = arrayList;
                                        i28 = size2;
                                        cQf4 = cQf3;
                                    } else {
                                        iJ2 = e70Var.j();
                                        iG2 = e70Var.g();
                                        arrayList2 = arrayList;
                                        int i51113 = e70Var.R;
                                        i28 = size2;
                                        zA |= f9Var2.a(cQf3, e70Var, true);
                                        iJ3 = e70Var.j();
                                        cQf4 = cQf3;
                                        iG3 = e70Var.g();
                                        if (iJ3 != iJ2) {
                                            e70Var.v(iJ3);
                                            if (z4) {
                                                iMax3 = Math.max(iMax3, e70Var.e(qnHx2).b() + e70Var.k() + e70Var.L);
                                            }
                                            zA = true;
                                        }
                                        if (iG3 != iG2) {
                                            e70Var.s(iG3);
                                            if (z5) {
                                                iMax4 = Math.max(iMax4, e70Var.e(qnHx).b() + e70Var.l() + e70Var.M);
                                            }
                                            zA = true;
                                        }
                                        if (!e70Var.w) {
                                        }
                                    }
                                    i25++;
                                    arrayList = arrayList2;
                                    size2 = i28;
                                    cQf3 = cQf4;
                                }
                                ArrayList<e70> arrayList12 = arrayList;
                                int i51114 = size2;
                                f9.CQf cQf14 = cQf3;
                                if (zA) {
                                    i26 = i19;
                                    i27 = i20;
                                    f70Var4 = f70Var3;
                                    f9Var2.b(f70Var4, i26, i27);
                                    zA = false;
                                } else {
                                    i26 = i19;
                                    i27 = i20;
                                    f70Var4 = f70Var3;
                                }
                                i22++;
                                i19 = i26;
                                i20 = i27;
                                f70Var3 = f70Var4;
                                arrayList = arrayList12;
                                size2 = i51114;
                                cQf3 = cQf14;
                            }
                            i23 = i19;
                            i24 = i20;
                            f70Var2 = f70Var3;
                            if (zA) {
                                f9Var2.b(f70Var2, i23, i24);
                                if (f70Var2.j() < iMax3) {
                                    f70Var2.v(iMax3);
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (f70Var2.g() < iMax4) {
                                    f70Var2.s(iMax4);
                                    z7 = true;
                                } else {
                                    z7 = z6;
                                }
                                if (z7) {
                                    f9Var2.b(f70Var2, i23, i24);
                                }
                            }
                        } else {
                            f70Var2 = f70Var;
                            i16 = i13;
                        }
                        i17 = i16;
                        f70Var2.q0 = i17;
                        if ((i17 & 256) == 256) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        o32.p = z3;
                    }
                    int iJ19 = f70Var2.j();
                    int iG14 = f70Var2.g();
                    z11 = f70Var2.r0;
                    z12 = f70Var2.s0;
                    int i51115 = cQf7.e;
                    int iResolveSizeAndState7 = View.resolveSizeAndState(iJ19 + cQf7.d, i, 0);
                    int iResolveSizeAndState8 = View.resolveSizeAndState(iG14 + i51115, i2, 0) & 16777215;
                    iMin2 = Math.min(this.B, iResolveSizeAndState7 & 16777215);
                    iMin3 = Math.min(this.C, iResolveSizeAndState8);
                    if (z11) {
                        iMin2 |= 16777216;
                    }
                    if (z12) {
                        iMin3 |= 16777216;
                    }
                    setMeasuredDimension(iMin2, iMin3);
                }
                if (childCount2 == 0) {
                    iMax2 = Math.max(0, this.A);
                } else {
                    iMin = 0;
                    i4 = 2;
                }
                if (iMax == f70Var6.j()) {
                    oj0Var2.c = true;
                } else {
                    oj0Var2.c = true;
                }
                f70Var6.P = 0;
                f70Var6.Q = 0;
                int i51116 = this.B - i50;
                iArr = f70Var6.u;
                iArr[0] = i51116;
                iArr[1] = this.C - i49;
                f70Var6.S = 0;
                f70Var6.T = 0;
                f70Var6.t(i3);
                f70Var6.v(iMax);
                f70Var6.u(i4);
                f70Var6.s(iMin);
                i5 = this.z - i50;
                if (i5 < 0) {
                    i6 = 0;
                    f70Var6.S = 0;
                } else {
                    i6 = 0;
                    f70Var6.S = i5;
                }
                i7 = this.A - i49;
                if (i7 < 0) {
                    f70Var6.T = i6;
                } else {
                    f70Var6.T = i7;
                }
                f70Var6.k0 = iMax7;
                f70Var6.l0 = iMax5;
                f9Var4.getClass();
                cQf = f70Var6.h0;
                size = f70Var6.e0.size();
                iJ = f70Var6.j();
                iG = f70Var6.g();
                if ((i45 & 128) == 128) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    z2 = true;
                } else {
                    if ((i45 & 64) == 64) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    if (z21) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    i40 = 0;
                    while (i40 < size) {
                        e70Var7 = f70Var6.e0.get(i40);
                        iArr4 = e70Var7.J;
                        if (iArr4[0] == 3) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (iArr4[1] == 3) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        if (z18) {
                            z20 = false;
                        } else {
                            z20 = false;
                        }
                        if (!e70Var7.o()) {
                        }
                        z2 = false;
                        break;
                    }
                }
                i8 = mode2;
                if (z2 && ((mode != 1073741824 && i8 == 1073741824) || z)) {
                    int iMin10 = Math.min(iArr[0], i47);
                    iMin4 = Math.min(iArr[1], i48);
                    if (mode == 1073741824) {
                        oj0Var = oj0Var2;
                    } else {
                        oj0Var = oj0Var2;
                    }
                    if (i8 == 1073741824) {
                        f70Var6.s(iMin4);
                        oj0Var.b = true;
                    }
                    if (mode == 1073741824) {
                        cQf2 = cQf;
                        i9 = size;
                        f9Var = f9Var4;
                        i10 = iJ;
                        i11 = iG;
                        i32 = i8;
                        z13 = oj0Var.b;
                        f70Var5 = oj0Var.a;
                        if (z13) {
                            while (r0.hasNext()) {
                                e70Var9.a = false;
                                gd1 gd1Var16 = e70Var9.d;
                                gd1Var16.e.j = false;
                                gd1Var16.g = false;
                                gd1Var16.n();
                                wh5 wh5Var16 = e70Var9.e;
                                wh5Var16.e.j = false;
                                wh5Var16.g = false;
                                wh5Var16.m();
                            }
                            i33 = 0;
                            f70Var5.a = false;
                            gd1 gd1Var17 = f70Var5.d;
                            gd1Var17.e.j = false;
                            gd1Var17.g = false;
                            gd1Var17.n();
                            wh5 wh5Var17 = f70Var5.e;
                            wh5Var17.e.j = false;
                            wh5Var17.g = false;
                            wh5Var17.m();
                            oj0Var.c();
                        } else {
                            i33 = 0;
                        }
                        oj0Var.b(oj0Var.d);
                        f70Var5.P = i33;
                        f70Var5.Q = i33;
                        f70Var5.d.h.d(i33);
                        f70Var5.e.h.d(i33);
                        i34 = 1073741824;
                        if (mode == 1073741824) {
                            f70Var = f70Var6;
                            i35 = 1;
                            zB = f70Var.B(i33, z) & true;
                            i12 = 1;
                        } else {
                            f70Var = f70Var6;
                            i35 = 1;
                            zB = true;
                            i12 = 0;
                        }
                        if (i32 == 1073741824) {
                            zB &= f70Var.B(i35, z);
                            i12++;
                        }
                    } else {
                        cQf2 = cQf;
                        i9 = size;
                        f9Var = f9Var4;
                        i10 = iJ;
                        i11 = iG;
                        i32 = i8;
                        z13 = oj0Var.b;
                        f70Var5 = oj0Var.a;
                        if (z13) {
                            while (r0.hasNext()) {
                                e70Var9.a = false;
                                gd1 gd1Var18 = e70Var9.d;
                                gd1Var18.e.j = false;
                                gd1Var18.g = false;
                                gd1Var18.n();
                                wh5 wh5Var18 = e70Var9.e;
                                wh5Var18.e.j = false;
                                wh5Var18.g = false;
                                wh5Var18.m();
                            }
                            i33 = 0;
                            f70Var5.a = false;
                            gd1 gd1Var19 = f70Var5.d;
                            gd1Var19.e.j = false;
                            gd1Var19.g = false;
                            gd1Var19.n();
                            wh5 wh5Var19 = f70Var5.e;
                            wh5Var19.e.j = false;
                            wh5Var19.g = false;
                            wh5Var19.m();
                            oj0Var.c();
                        } else {
                            i33 = 0;
                        }
                        oj0Var.b(oj0Var.d);
                        f70Var5.P = i33;
                        f70Var5.Q = i33;
                        f70Var5.d.h.d(i33);
                        f70Var5.e.h.d(i33);
                        i34 = 1073741824;
                        if (mode == 1073741824) {
                            f70Var = f70Var6;
                            i35 = 1;
                            zB = f70Var.B(i33, z) & true;
                            i12 = 1;
                        } else {
                            f70Var = f70Var6;
                            i35 = 1;
                            zB = true;
                            i12 = 0;
                        }
                        if (i32 == 1073741824) {
                            zB &= f70Var.B(i35, z);
                            i12++;
                        }
                    }
                    if (zB) {
                        if (mode == i34) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (i32 == i34) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        f70Var.w(z14, z15);
                    }
                } else {
                    cQf2 = cQf;
                    i9 = size;
                    f70Var = f70Var6;
                    f9Var = f9Var4;
                    i10 = iJ;
                    i11 = iG;
                    zB = false;
                    i12 = 0;
                }
                if (zB) {
                    if (i9 > 0) {
                        size3 = f70Var.e0.size();
                        cQf6 = f70Var.h0;
                        i29 = 0;
                        while (i29 < size3) {
                            e70Var6 = f70Var.e0.get(i29);
                            if (e70Var6 instanceof bb1) {
                                f9Var3 = f9Var;
                            } else {
                                iF = e70Var6.f(0);
                                int iF11 = e70Var6.f(1);
                                if (iF == 3) {
                                    z10 = false;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    f9Var3 = f9Var;
                                } else {
                                    f9Var3 = f9Var;
                                    f9Var3.a(cQf6, e70Var6, false);
                                }
                            }
                            i29++;
                            f9Var = f9Var3;
                        }
                        f9Var2 = f9Var;
                        constraintLayout = ((CQf) cQf6).a;
                        childCount = constraintLayout.getChildCount();
                        while (i30 < childCount) {
                            childAt = constraintLayout.getChildAt(i30);
                            if (childAt instanceof LPt8Fixed) {
                                lPt8 = (LPt8Fixed) childAt;
                                if (lPt8.x != null) {
                                    QnHx qnHx11 = (QnHx) lPt8.getLayoutParams();
                                    qnHx3 = (QnHx) lPt8.x.getLayoutParams();
                                    e70Var3 = qnHx3.l0;
                                    e70Var3.X = 0;
                                    e70Var4 = qnHx11.l0;
                                    if (e70Var4.J[0] != 1) {
                                        e70Var4.v(e70Var3.j());
                                    }
                                    e70Var5 = qnHx11.l0;
                                    if (e70Var5.J[1] != 1) {
                                        e70Var5.s(qnHx3.l0.g());
                                    }
                                    qnHx3.l0.X = 8;
                                }
                            }
                        }
                        arrayList3 = constraintLayout.x;
                        size4 = arrayList3.size();
                        if (size4 > 0) {
                            while (i31 < size4) {
                                arrayList3.get(i31).getClass();
                            }
                        }
                    } else {
                        f9Var2 = f9Var;
                    }
                    i13 = f70Var.q0;
                    arrayList = f9Var2.a;
                    size2 = arrayList.size();
                    if (i9 > 0) {
                        i14 = i10;
                        i15 = i11;
                        f9Var2.b(f70Var, i14, i15);
                    } else {
                        i14 = i10;
                        i15 = i11;
                    }
                    if (size2 > 0) {
                        iArr2 = f70Var.J;
                        if (iArr2[0] == 2) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (iArr2[1] == 2) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        int iJ110 = f70Var.j();
                        f70 f70Var15 = f9Var2.c;
                        iMax3 = Math.max(iJ110, f70Var15.S);
                        iMax4 = Math.max(f70Var.g(), f70Var15.T);
                        i18 = 0;
                        zA = false;
                        while (true) {
                            qnHx = w60.QnHx.BOTTOM;
                            qnHx2 = w60.QnHx.RIGHT;
                            if (i18 >= size2) {
                                break;
                                break;
                            }
                            e70Var2 = arrayList.get(i18);
                            int i51117 = i13;
                            if (e70Var2 instanceof gk5) {
                                cQf5 = cQf2;
                            } else {
                                iJ4 = e70Var2.j();
                                iG4 = e70Var2.g();
                                cQf5 = cQf2;
                                boolean zA9 = zA | f9Var2.a(cQf5, e70Var2, true);
                                iJ5 = e70Var2.j();
                                z8 = zA9;
                                iG5 = e70Var2.g();
                                if (iJ5 != iJ4) {
                                    e70Var2.v(iJ5);
                                    if (z4) {
                                        iMax3 = Math.max(iMax3, e70Var2.e(qnHx2).b() + e70Var2.k() + e70Var2.L);
                                    }
                                    z8 = true;
                                }
                                if (iG5 != iG4) {
                                    e70Var2.s(iG5);
                                    if (z5) {
                                        iMax4 = Math.max(iMax4, e70Var2.e(qnHx).b() + e70Var2.l() + e70Var2.M);
                                    }
                                    z9 = true;
                                } else {
                                    z9 = z8;
                                }
                                zA = z9 | false;
                            }
                            i18++;
                            cQf2 = cQf5;
                            i13 = i51117;
                            i14 = i14;
                            i15 = i15;
                            f70Var = f70Var;
                        }
                        f70Var3 = f70Var;
                        i16 = i13;
                        i19 = i14;
                        i20 = i15;
                        cQf3 = cQf2;
                        i22 = 0;
                        while (i22 < i21) {
                            i25 = 0;
                            while (i25 < size2) {
                                e70Var = arrayList.get(i25);
                                if (e70Var instanceof wc1) {
                                    if (e70Var.X == 8) {
                                        arrayList2 = arrayList;
                                        i28 = size2;
                                        cQf4 = cQf3;
                                    } else {
                                        iJ2 = e70Var.j();
                                        iG2 = e70Var.g();
                                        arrayList2 = arrayList;
                                        int i51118 = e70Var.R;
                                        i28 = size2;
                                        zA |= f9Var2.a(cQf3, e70Var, true);
                                        iJ3 = e70Var.j();
                                        cQf4 = cQf3;
                                        iG3 = e70Var.g();
                                        if (iJ3 != iJ2) {
                                            e70Var.v(iJ3);
                                            if (z4) {
                                                iMax3 = Math.max(iMax3, e70Var.e(qnHx2).b() + e70Var.k() + e70Var.L);
                                            }
                                            zA = true;
                                        }
                                        if (iG3 != iG2) {
                                            e70Var.s(iG3);
                                            if (z5) {
                                                iMax4 = Math.max(iMax4, e70Var.e(qnHx).b() + e70Var.l() + e70Var.M);
                                            }
                                            zA = true;
                                        }
                                        if (!e70Var.w) {
                                        }
                                    }
                                } else if (e70Var.X == 8) {
                                    arrayList2 = arrayList;
                                    i28 = size2;
                                    cQf4 = cQf3;
                                } else {
                                    iJ2 = e70Var.j();
                                    iG2 = e70Var.g();
                                    arrayList2 = arrayList;
                                    int i51119 = e70Var.R;
                                    i28 = size2;
                                    zA |= f9Var2.a(cQf3, e70Var, true);
                                    iJ3 = e70Var.j();
                                    cQf4 = cQf3;
                                    iG3 = e70Var.g();
                                    if (iJ3 != iJ2) {
                                        e70Var.v(iJ3);
                                        if (z4) {
                                            iMax3 = Math.max(iMax3, e70Var.e(qnHx2).b() + e70Var.k() + e70Var.L);
                                        }
                                        zA = true;
                                    }
                                    if (iG3 != iG2) {
                                        e70Var.s(iG3);
                                        if (z5) {
                                            iMax4 = Math.max(iMax4, e70Var.e(qnHx).b() + e70Var.l() + e70Var.M);
                                        }
                                        zA = true;
                                    }
                                    if (!e70Var.w) {
                                    }
                                }
                                i25++;
                                arrayList = arrayList2;
                                size2 = i28;
                                cQf3 = cQf4;
                            }
                            ArrayList<e70> arrayList13 = arrayList;
                            int i511110 = size2;
                            f9.CQf cQf15 = cQf3;
                            if (zA) {
                                i26 = i19;
                                i27 = i20;
                                f70Var4 = f70Var3;
                                f9Var2.b(f70Var4, i26, i27);
                                zA = false;
                            } else {
                                i26 = i19;
                                i27 = i20;
                                f70Var4 = f70Var3;
                            }
                            i22++;
                            i19 = i26;
                            i20 = i27;
                            f70Var3 = f70Var4;
                            arrayList = arrayList13;
                            size2 = i511110;
                            cQf3 = cQf15;
                        }
                        i23 = i19;
                        i24 = i20;
                        f70Var2 = f70Var3;
                        if (zA) {
                            f9Var2.b(f70Var2, i23, i24);
                            if (f70Var2.j() < iMax3) {
                                f70Var2.v(iMax3);
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (f70Var2.g() < iMax4) {
                                f70Var2.s(iMax4);
                                z7 = true;
                            } else {
                                z7 = z6;
                            }
                            if (z7) {
                                f9Var2.b(f70Var2, i23, i24);
                            }
                        }
                    } else {
                        f70Var2 = f70Var;
                        i16 = i13;
                    }
                    i17 = i16;
                    f70Var2.q0 = i17;
                    if ((i17 & 256) == 256) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    o32.p = z3;
                } else {
                    if (i9 > 0) {
                        size3 = f70Var.e0.size();
                        cQf6 = f70Var.h0;
                        i29 = 0;
                        while (i29 < size3) {
                            e70Var6 = f70Var.e0.get(i29);
                            if (e70Var6 instanceof bb1) {
                                f9Var3 = f9Var;
                            } else {
                                iF = e70Var6.f(0);
                                int iF12 = e70Var6.f(1);
                                if (iF == 3) {
                                    z10 = false;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    f9Var3 = f9Var;
                                } else {
                                    f9Var3 = f9Var;
                                    f9Var3.a(cQf6, e70Var6, false);
                                }
                            }
                            i29++;
                            f9Var = f9Var3;
                        }
                        f9Var2 = f9Var;
                        constraintLayout = ((CQf) cQf6).a;
                        childCount = constraintLayout.getChildCount();
                        while (i30 < childCount) {
                            childAt = constraintLayout.getChildAt(i30);
                            if (childAt instanceof LPt8Fixed) {
                                lPt8 = (LPt8Fixed) childAt;
                                if (lPt8.x != null) {
                                    QnHx qnHx12 = (QnHx) lPt8.getLayoutParams();
                                    qnHx3 = (QnHx) lPt8.x.getLayoutParams();
                                    e70Var3 = qnHx3.l0;
                                    e70Var3.X = 0;
                                    e70Var4 = qnHx12.l0;
                                    if (e70Var4.J[0] != 1) {
                                        e70Var4.v(e70Var3.j());
                                    }
                                    e70Var5 = qnHx12.l0;
                                    if (e70Var5.J[1] != 1) {
                                        e70Var5.s(qnHx3.l0.g());
                                    }
                                    qnHx3.l0.X = 8;
                                }
                            }
                        }
                        arrayList3 = constraintLayout.x;
                        size4 = arrayList3.size();
                        if (size4 > 0) {
                            while (i31 < size4) {
                                arrayList3.get(i31).getClass();
                            }
                        }
                    } else {
                        f9Var2 = f9Var;
                    }
                    i13 = f70Var.q0;
                    arrayList = f9Var2.a;
                    size2 = arrayList.size();
                    if (i9 > 0) {
                        i14 = i10;
                        i15 = i11;
                        f9Var2.b(f70Var, i14, i15);
                    } else {
                        i14 = i10;
                        i15 = i11;
                    }
                    if (size2 > 0) {
                        iArr2 = f70Var.J;
                        if (iArr2[0] == 2) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (iArr2[1] == 2) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        int iJ111 = f70Var.j();
                        f70 f70Var16 = f9Var2.c;
                        iMax3 = Math.max(iJ111, f70Var16.S);
                        iMax4 = Math.max(f70Var.g(), f70Var16.T);
                        i18 = 0;
                        zA = false;
                        while (true) {
                            qnHx = w60.QnHx.BOTTOM;
                            qnHx2 = w60.QnHx.RIGHT;
                            if (i18 >= size2) {
                                break;
                                break;
                            }
                            e70Var2 = arrayList.get(i18);
                            int i511111 = i13;
                            if (e70Var2 instanceof gk5) {
                                cQf5 = cQf2;
                            } else {
                                iJ4 = e70Var2.j();
                                iG4 = e70Var2.g();
                                cQf5 = cQf2;
                                boolean zA10 = zA | f9Var2.a(cQf5, e70Var2, true);
                                iJ5 = e70Var2.j();
                                z8 = zA10;
                                iG5 = e70Var2.g();
                                if (iJ5 != iJ4) {
                                    e70Var2.v(iJ5);
                                    if (z4) {
                                        iMax3 = Math.max(iMax3, e70Var2.e(qnHx2).b() + e70Var2.k() + e70Var2.L);
                                    }
                                    z8 = true;
                                }
                                if (iG5 != iG4) {
                                    e70Var2.s(iG5);
                                    if (z5) {
                                        iMax4 = Math.max(iMax4, e70Var2.e(qnHx).b() + e70Var2.l() + e70Var2.M);
                                    }
                                    z9 = true;
                                } else {
                                    z9 = z8;
                                }
                                zA = z9 | false;
                            }
                            i18++;
                            cQf2 = cQf5;
                            i13 = i511111;
                            i14 = i14;
                            i15 = i15;
                            f70Var = f70Var;
                        }
                        f70Var3 = f70Var;
                        i16 = i13;
                        i19 = i14;
                        i20 = i15;
                        cQf3 = cQf2;
                        i22 = 0;
                        while (i22 < i21) {
                            i25 = 0;
                            while (i25 < size2) {
                                e70Var = arrayList.get(i25);
                                if (e70Var instanceof wc1) {
                                    if (e70Var.X == 8) {
                                        arrayList2 = arrayList;
                                        i28 = size2;
                                        cQf4 = cQf3;
                                    } else {
                                        iJ2 = e70Var.j();
                                        iG2 = e70Var.g();
                                        arrayList2 = arrayList;
                                        int i511112 = e70Var.R;
                                        i28 = size2;
                                        zA |= f9Var2.a(cQf3, e70Var, true);
                                        iJ3 = e70Var.j();
                                        cQf4 = cQf3;
                                        iG3 = e70Var.g();
                                        if (iJ3 != iJ2) {
                                            e70Var.v(iJ3);
                                            if (z4) {
                                                iMax3 = Math.max(iMax3, e70Var.e(qnHx2).b() + e70Var.k() + e70Var.L);
                                            }
                                            zA = true;
                                        }
                                        if (iG3 != iG2) {
                                            e70Var.s(iG3);
                                            if (z5) {
                                                iMax4 = Math.max(iMax4, e70Var.e(qnHx).b() + e70Var.l() + e70Var.M);
                                            }
                                            zA = true;
                                        }
                                        if (!e70Var.w) {
                                        }
                                    }
                                } else if (e70Var.X == 8) {
                                    arrayList2 = arrayList;
                                    i28 = size2;
                                    cQf4 = cQf3;
                                } else {
                                    iJ2 = e70Var.j();
                                    iG2 = e70Var.g();
                                    arrayList2 = arrayList;
                                    int i511113 = e70Var.R;
                                    i28 = size2;
                                    zA |= f9Var2.a(cQf3, e70Var, true);
                                    iJ3 = e70Var.j();
                                    cQf4 = cQf3;
                                    iG3 = e70Var.g();
                                    if (iJ3 != iJ2) {
                                        e70Var.v(iJ3);
                                        if (z4) {
                                            iMax3 = Math.max(iMax3, e70Var.e(qnHx2).b() + e70Var.k() + e70Var.L);
                                        }
                                        zA = true;
                                    }
                                    if (iG3 != iG2) {
                                        e70Var.s(iG3);
                                        if (z5) {
                                            iMax4 = Math.max(iMax4, e70Var.e(qnHx).b() + e70Var.l() + e70Var.M);
                                        }
                                        zA = true;
                                    }
                                    if (!e70Var.w) {
                                    }
                                }
                                i25++;
                                arrayList = arrayList2;
                                size2 = i28;
                                cQf3 = cQf4;
                            }
                            ArrayList<e70> arrayList14 = arrayList;
                            int i511114 = size2;
                            f9.CQf cQf16 = cQf3;
                            if (zA) {
                                i26 = i19;
                                i27 = i20;
                                f70Var4 = f70Var3;
                                f9Var2.b(f70Var4, i26, i27);
                                zA = false;
                            } else {
                                i26 = i19;
                                i27 = i20;
                                f70Var4 = f70Var3;
                            }
                            i22++;
                            i19 = i26;
                            i20 = i27;
                            f70Var3 = f70Var4;
                            arrayList = arrayList14;
                            size2 = i511114;
                            cQf3 = cQf16;
                        }
                        i23 = i19;
                        i24 = i20;
                        f70Var2 = f70Var3;
                        if (zA) {
                            f9Var2.b(f70Var2, i23, i24);
                            if (f70Var2.j() < iMax3) {
                                f70Var2.v(iMax3);
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (f70Var2.g() < iMax4) {
                                f70Var2.s(iMax4);
                                z7 = true;
                            } else {
                                z7 = z6;
                            }
                            if (z7) {
                                f9Var2.b(f70Var2, i23, i24);
                            }
                        }
                    } else {
                        f70Var2 = f70Var;
                        i16 = i13;
                    }
                    i17 = i16;
                    f70Var2.q0 = i17;
                    if ((i17 & 256) == 256) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    o32.p = z3;
                }
                int iJ112 = f70Var2.j();
                int iG15 = f70Var2.g();
                z11 = f70Var2.r0;
                z12 = f70Var2.s0;
                int i511115 = cQf7.e;
                int iResolveSizeAndState9 = View.resolveSizeAndState(iJ112 + cQf7.d, i, 0);
                int iResolveSizeAndState10 = View.resolveSizeAndState(iG15 + i511115, i2, 0) & 16777215;
                iMin2 = Math.min(this.B, iResolveSizeAndState9 & 16777215);
                iMin3 = Math.min(this.C, iResolveSizeAndState10);
                if (z11) {
                    iMin2 |= 16777216;
                }
                if (z12) {
                    iMin3 |= 16777216;
                }
                setMeasuredDimension(iMin2, iMin3);
            }
            if (childCount2 == 0) {
                iMax2 = Math.max(0, this.A);
            } else {
                iMax2 = i48;
            }
            iMin = iMax2;
            i4 = 2;
            if (iMax == f70Var6.j()) {
                oj0Var2.c = true;
            } else {
                oj0Var2.c = true;
            }
            f70Var6.P = 0;
            f70Var6.Q = 0;
            int i511116 = this.B - i50;
            iArr = f70Var6.u;
            iArr[0] = i511116;
            iArr[1] = this.C - i49;
            f70Var6.S = 0;
            f70Var6.T = 0;
            f70Var6.t(i3);
            f70Var6.v(iMax);
            f70Var6.u(i4);
            f70Var6.s(iMin);
            i5 = this.z - i50;
            if (i5 < 0) {
                i6 = 0;
                f70Var6.S = 0;
            } else {
                i6 = 0;
                f70Var6.S = i5;
            }
            i7 = this.A - i49;
            if (i7 < 0) {
                f70Var6.T = i6;
            } else {
                f70Var6.T = i7;
            }
            f70Var6.k0 = iMax7;
            f70Var6.l0 = iMax5;
            f9Var4.getClass();
            cQf = f70Var6.h0;
            size = f70Var6.e0.size();
            iJ = f70Var6.j();
            iG = f70Var6.g();
            if ((i45 & 128) == 128) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                z2 = true;
            } else {
                if ((i45 & 64) == 64) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                if (z21) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            if (z2) {
                i40 = 0;
                while (i40 < size) {
                    e70Var7 = f70Var6.e0.get(i40);
                    iArr4 = e70Var7.J;
                    if (iArr4[0] == 3) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (iArr4[1] == 3) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (z18) {
                        z20 = false;
                    } else {
                        z20 = false;
                    }
                    if (!e70Var7.o()) {
                    }
                    z2 = false;
                    break;
                }
            }
            i8 = mode2;
            if (z2 && ((mode != 1073741824 && i8 == 1073741824) || z)) {
                int iMin11 = Math.min(iArr[0], i47);
                iMin4 = Math.min(iArr[1], i48);
                if (mode == 1073741824) {
                    oj0Var = oj0Var2;
                } else {
                    oj0Var = oj0Var2;
                }
                if (i8 == 1073741824) {
                    f70Var6.s(iMin4);
                    oj0Var.b = true;
                }
                if (mode == 1073741824) {
                    cQf2 = cQf;
                    i9 = size;
                    f9Var = f9Var4;
                    i10 = iJ;
                    i11 = iG;
                    i32 = i8;
                    z13 = oj0Var.b;
                    f70Var5 = oj0Var.a;
                    if (z13) {
                        while (r0.hasNext()) {
                            e70Var9.a = false;
                            gd1 gd1Var110 = e70Var9.d;
                            gd1Var110.e.j = false;
                            gd1Var110.g = false;
                            gd1Var110.n();
                            wh5 wh5Var110 = e70Var9.e;
                            wh5Var110.e.j = false;
                            wh5Var110.g = false;
                            wh5Var110.m();
                        }
                        i33 = 0;
                        f70Var5.a = false;
                        gd1 gd1Var111 = f70Var5.d;
                        gd1Var111.e.j = false;
                        gd1Var111.g = false;
                        gd1Var111.n();
                        wh5 wh5Var111 = f70Var5.e;
                        wh5Var111.e.j = false;
                        wh5Var111.g = false;
                        wh5Var111.m();
                        oj0Var.c();
                    } else {
                        i33 = 0;
                    }
                    oj0Var.b(oj0Var.d);
                    f70Var5.P = i33;
                    f70Var5.Q = i33;
                    f70Var5.d.h.d(i33);
                    f70Var5.e.h.d(i33);
                    i34 = 1073741824;
                    if (mode == 1073741824) {
                        f70Var = f70Var6;
                        i35 = 1;
                        zB = f70Var.B(i33, z) & true;
                        i12 = 1;
                    } else {
                        f70Var = f70Var6;
                        i35 = 1;
                        zB = true;
                        i12 = 0;
                    }
                    if (i32 == 1073741824) {
                        zB &= f70Var.B(i35, z);
                        i12++;
                    }
                } else {
                    cQf2 = cQf;
                    i9 = size;
                    f9Var = f9Var4;
                    i10 = iJ;
                    i11 = iG;
                    i32 = i8;
                    z13 = oj0Var.b;
                    f70Var5 = oj0Var.a;
                    if (z13) {
                        while (r0.hasNext()) {
                            e70Var9.a = false;
                            gd1 gd1Var112 = e70Var9.d;
                            gd1Var112.e.j = false;
                            gd1Var112.g = false;
                            gd1Var112.n();
                            wh5 wh5Var112 = e70Var9.e;
                            wh5Var112.e.j = false;
                            wh5Var112.g = false;
                            wh5Var112.m();
                        }
                        i33 = 0;
                        f70Var5.a = false;
                        gd1 gd1Var113 = f70Var5.d;
                        gd1Var113.e.j = false;
                        gd1Var113.g = false;
                        gd1Var113.n();
                        wh5 wh5Var113 = f70Var5.e;
                        wh5Var113.e.j = false;
                        wh5Var113.g = false;
                        wh5Var113.m();
                        oj0Var.c();
                    } else {
                        i33 = 0;
                    }
                    oj0Var.b(oj0Var.d);
                    f70Var5.P = i33;
                    f70Var5.Q = i33;
                    f70Var5.d.h.d(i33);
                    f70Var5.e.h.d(i33);
                    i34 = 1073741824;
                    if (mode == 1073741824) {
                        f70Var = f70Var6;
                        i35 = 1;
                        zB = f70Var.B(i33, z) & true;
                        i12 = 1;
                    } else {
                        f70Var = f70Var6;
                        i35 = 1;
                        zB = true;
                        i12 = 0;
                    }
                    if (i32 == 1073741824) {
                        zB &= f70Var.B(i35, z);
                        i12++;
                    }
                }
                if (zB) {
                    if (mode == i34) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (i32 == i34) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    f70Var.w(z14, z15);
                }
            } else {
                cQf2 = cQf;
                i9 = size;
                f70Var = f70Var6;
                f9Var = f9Var4;
                i10 = iJ;
                i11 = iG;
                zB = false;
                i12 = 0;
            }
            if (zB) {
                if (i9 > 0) {
                    size3 = f70Var.e0.size();
                    cQf6 = f70Var.h0;
                    i29 = 0;
                    while (i29 < size3) {
                        e70Var6 = f70Var.e0.get(i29);
                        if (e70Var6 instanceof bb1) {
                            f9Var3 = f9Var;
                        } else {
                            iF = e70Var6.f(0);
                            int iF13 = e70Var6.f(1);
                            if (iF == 3) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                f9Var3 = f9Var;
                            } else {
                                f9Var3 = f9Var;
                                f9Var3.a(cQf6, e70Var6, false);
                            }
                        }
                        i29++;
                        f9Var = f9Var3;
                    }
                    f9Var2 = f9Var;
                    constraintLayout = ((CQf) cQf6).a;
                    childCount = constraintLayout.getChildCount();
                    while (i30 < childCount) {
                        childAt = constraintLayout.getChildAt(i30);
                        if (childAt instanceof LPt8Fixed) {
                            lPt8 = (LPt8Fixed) childAt;
                            if (lPt8.x != null) {
                                QnHx qnHx13 = (QnHx) lPt8.getLayoutParams();
                                qnHx3 = (QnHx) lPt8.x.getLayoutParams();
                                e70Var3 = qnHx3.l0;
                                e70Var3.X = 0;
                                e70Var4 = qnHx13.l0;
                                if (e70Var4.J[0] != 1) {
                                    e70Var4.v(e70Var3.j());
                                }
                                e70Var5 = qnHx13.l0;
                                if (e70Var5.J[1] != 1) {
                                    e70Var5.s(qnHx3.l0.g());
                                }
                                qnHx3.l0.X = 8;
                            }
                        }
                    }
                    arrayList3 = constraintLayout.x;
                    size4 = arrayList3.size();
                    if (size4 > 0) {
                        while (i31 < size4) {
                            arrayList3.get(i31).getClass();
                        }
                    }
                } else {
                    f9Var2 = f9Var;
                }
                i13 = f70Var.q0;
                arrayList = f9Var2.a;
                size2 = arrayList.size();
                if (i9 > 0) {
                    i14 = i10;
                    i15 = i11;
                    f9Var2.b(f70Var, i14, i15);
                } else {
                    i14 = i10;
                    i15 = i11;
                }
                if (size2 > 0) {
                    iArr2 = f70Var.J;
                    if (iArr2[0] == 2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (iArr2[1] == 2) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    int iJ113 = f70Var.j();
                    f70 f70Var17 = f9Var2.c;
                    iMax3 = Math.max(iJ113, f70Var17.S);
                    iMax4 = Math.max(f70Var.g(), f70Var17.T);
                    i18 = 0;
                    zA = false;
                    while (true) {
                        qnHx = w60.QnHx.BOTTOM;
                        qnHx2 = w60.QnHx.RIGHT;
                        if (i18 >= size2) {
                            break;
                            break;
                        }
                        e70Var2 = arrayList.get(i18);
                        int i511117 = i13;
                        if (e70Var2 instanceof gk5) {
                            cQf5 = cQf2;
                        } else {
                            iJ4 = e70Var2.j();
                            iG4 = e70Var2.g();
                            cQf5 = cQf2;
                            boolean zA11 = zA | f9Var2.a(cQf5, e70Var2, true);
                            iJ5 = e70Var2.j();
                            z8 = zA11;
                            iG5 = e70Var2.g();
                            if (iJ5 != iJ4) {
                                e70Var2.v(iJ5);
                                if (z4) {
                                    iMax3 = Math.max(iMax3, e70Var2.e(qnHx2).b() + e70Var2.k() + e70Var2.L);
                                }
                                z8 = true;
                            }
                            if (iG5 != iG4) {
                                e70Var2.s(iG5);
                                if (z5) {
                                    iMax4 = Math.max(iMax4, e70Var2.e(qnHx).b() + e70Var2.l() + e70Var2.M);
                                }
                                z9 = true;
                            } else {
                                z9 = z8;
                            }
                            zA = z9 | false;
                        }
                        i18++;
                        cQf2 = cQf5;
                        i13 = i511117;
                        i14 = i14;
                        i15 = i15;
                        f70Var = f70Var;
                    }
                    f70Var3 = f70Var;
                    i16 = i13;
                    i19 = i14;
                    i20 = i15;
                    cQf3 = cQf2;
                    i22 = 0;
                    while (i22 < i21) {
                        i25 = 0;
                        while (i25 < size2) {
                            e70Var = arrayList.get(i25);
                            if (e70Var instanceof wc1) {
                                if (e70Var.X == 8) {
                                    arrayList2 = arrayList;
                                    i28 = size2;
                                    cQf4 = cQf3;
                                } else {
                                    iJ2 = e70Var.j();
                                    iG2 = e70Var.g();
                                    arrayList2 = arrayList;
                                    int i511118 = e70Var.R;
                                    i28 = size2;
                                    zA |= f9Var2.a(cQf3, e70Var, true);
                                    iJ3 = e70Var.j();
                                    cQf4 = cQf3;
                                    iG3 = e70Var.g();
                                    if (iJ3 != iJ2) {
                                        e70Var.v(iJ3);
                                        if (z4) {
                                            iMax3 = Math.max(iMax3, e70Var.e(qnHx2).b() + e70Var.k() + e70Var.L);
                                        }
                                        zA = true;
                                    }
                                    if (iG3 != iG2) {
                                        e70Var.s(iG3);
                                        if (z5) {
                                            iMax4 = Math.max(iMax4, e70Var.e(qnHx).b() + e70Var.l() + e70Var.M);
                                        }
                                        zA = true;
                                    }
                                    if (!e70Var.w) {
                                    }
                                }
                            } else if (e70Var.X == 8) {
                                arrayList2 = arrayList;
                                i28 = size2;
                                cQf4 = cQf3;
                            } else {
                                iJ2 = e70Var.j();
                                iG2 = e70Var.g();
                                arrayList2 = arrayList;
                                int i511119 = e70Var.R;
                                i28 = size2;
                                zA |= f9Var2.a(cQf3, e70Var, true);
                                iJ3 = e70Var.j();
                                cQf4 = cQf3;
                                iG3 = e70Var.g();
                                if (iJ3 != iJ2) {
                                    e70Var.v(iJ3);
                                    if (z4) {
                                        iMax3 = Math.max(iMax3, e70Var.e(qnHx2).b() + e70Var.k() + e70Var.L);
                                    }
                                    zA = true;
                                }
                                if (iG3 != iG2) {
                                    e70Var.s(iG3);
                                    if (z5) {
                                        iMax4 = Math.max(iMax4, e70Var.e(qnHx).b() + e70Var.l() + e70Var.M);
                                    }
                                    zA = true;
                                }
                                if (!e70Var.w) {
                                }
                            }
                            i25++;
                            arrayList = arrayList2;
                            size2 = i28;
                            cQf3 = cQf4;
                        }
                        ArrayList<e70> arrayList15 = arrayList;
                        int i5111110 = size2;
                        f9.CQf cQf17 = cQf3;
                        if (zA) {
                            i26 = i19;
                            i27 = i20;
                            f70Var4 = f70Var3;
                            f9Var2.b(f70Var4, i26, i27);
                            zA = false;
                        } else {
                            i26 = i19;
                            i27 = i20;
                            f70Var4 = f70Var3;
                        }
                        i22++;
                        i19 = i26;
                        i20 = i27;
                        f70Var3 = f70Var4;
                        arrayList = arrayList15;
                        size2 = i5111110;
                        cQf3 = cQf17;
                    }
                    i23 = i19;
                    i24 = i20;
                    f70Var2 = f70Var3;
                    if (zA) {
                        f9Var2.b(f70Var2, i23, i24);
                        if (f70Var2.j() < iMax3) {
                            f70Var2.v(iMax3);
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (f70Var2.g() < iMax4) {
                            f70Var2.s(iMax4);
                            z7 = true;
                        } else {
                            z7 = z6;
                        }
                        if (z7) {
                            f9Var2.b(f70Var2, i23, i24);
                        }
                    }
                } else {
                    f70Var2 = f70Var;
                    i16 = i13;
                }
                i17 = i16;
                f70Var2.q0 = i17;
                if ((i17 & 256) == 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                o32.p = z3;
            } else {
                if (i9 > 0) {
                    size3 = f70Var.e0.size();
                    cQf6 = f70Var.h0;
                    i29 = 0;
                    while (i29 < size3) {
                        e70Var6 = f70Var.e0.get(i29);
                        if (e70Var6 instanceof bb1) {
                            f9Var3 = f9Var;
                        } else {
                            iF = e70Var6.f(0);
                            int iF14 = e70Var6.f(1);
                            if (iF == 3) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                f9Var3 = f9Var;
                            } else {
                                f9Var3 = f9Var;
                                f9Var3.a(cQf6, e70Var6, false);
                            }
                        }
                        i29++;
                        f9Var = f9Var3;
                    }
                    f9Var2 = f9Var;
                    constraintLayout = ((CQf) cQf6).a;
                    childCount = constraintLayout.getChildCount();
                    while (i30 < childCount) {
                        childAt = constraintLayout.getChildAt(i30);
                        if (childAt instanceof LPt8Fixed) {
                            lPt8 = (LPt8Fixed) childAt;
                            if (lPt8.x != null) {
                                QnHx qnHx14 = (QnHx) lPt8.getLayoutParams();
                                qnHx3 = (QnHx) lPt8.x.getLayoutParams();
                                e70Var3 = qnHx3.l0;
                                e70Var3.X = 0;
                                e70Var4 = qnHx14.l0;
                                if (e70Var4.J[0] != 1) {
                                    e70Var4.v(e70Var3.j());
                                }
                                e70Var5 = qnHx14.l0;
                                if (e70Var5.J[1] != 1) {
                                    e70Var5.s(qnHx3.l0.g());
                                }
                                qnHx3.l0.X = 8;
                            }
                        }
                    }
                    arrayList3 = constraintLayout.x;
                    size4 = arrayList3.size();
                    if (size4 > 0) {
                        while (i31 < size4) {
                            arrayList3.get(i31).getClass();
                        }
                    }
                } else {
                    f9Var2 = f9Var;
                }
                i13 = f70Var.q0;
                arrayList = f9Var2.a;
                size2 = arrayList.size();
                if (i9 > 0) {
                    i14 = i10;
                    i15 = i11;
                    f9Var2.b(f70Var, i14, i15);
                } else {
                    i14 = i10;
                    i15 = i11;
                }
                if (size2 > 0) {
                    iArr2 = f70Var.J;
                    if (iArr2[0] == 2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (iArr2[1] == 2) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    int iJ114 = f70Var.j();
                    f70 f70Var18 = f9Var2.c;
                    iMax3 = Math.max(iJ114, f70Var18.S);
                    iMax4 = Math.max(f70Var.g(), f70Var18.T);
                    i18 = 0;
                    zA = false;
                    while (true) {
                        qnHx = w60.QnHx.BOTTOM;
                        qnHx2 = w60.QnHx.RIGHT;
                        if (i18 >= size2) {
                            break;
                            break;
                        }
                        e70Var2 = arrayList.get(i18);
                        int i5111111 = i13;
                        if (e70Var2 instanceof gk5) {
                            cQf5 = cQf2;
                        } else {
                            iJ4 = e70Var2.j();
                            iG4 = e70Var2.g();
                            cQf5 = cQf2;
                            boolean zA12 = zA | f9Var2.a(cQf5, e70Var2, true);
                            iJ5 = e70Var2.j();
                            z8 = zA12;
                            iG5 = e70Var2.g();
                            if (iJ5 != iJ4) {
                                e70Var2.v(iJ5);
                                if (z4) {
                                    iMax3 = Math.max(iMax3, e70Var2.e(qnHx2).b() + e70Var2.k() + e70Var2.L);
                                }
                                z8 = true;
                            }
                            if (iG5 != iG4) {
                                e70Var2.s(iG5);
                                if (z5) {
                                    iMax4 = Math.max(iMax4, e70Var2.e(qnHx).b() + e70Var2.l() + e70Var2.M);
                                }
                                z9 = true;
                            } else {
                                z9 = z8;
                            }
                            zA = z9 | false;
                        }
                        i18++;
                        cQf2 = cQf5;
                        i13 = i5111111;
                        i14 = i14;
                        i15 = i15;
                        f70Var = f70Var;
                    }
                    f70Var3 = f70Var;
                    i16 = i13;
                    i19 = i14;
                    i20 = i15;
                    cQf3 = cQf2;
                    i22 = 0;
                    while (i22 < i21) {
                        i25 = 0;
                        while (i25 < size2) {
                            e70Var = arrayList.get(i25);
                            if (e70Var instanceof wc1) {
                                if (e70Var.X == 8) {
                                    arrayList2 = arrayList;
                                    i28 = size2;
                                    cQf4 = cQf3;
                                } else {
                                    iJ2 = e70Var.j();
                                    iG2 = e70Var.g();
                                    arrayList2 = arrayList;
                                    int i5111112 = e70Var.R;
                                    i28 = size2;
                                    zA |= f9Var2.a(cQf3, e70Var, true);
                                    iJ3 = e70Var.j();
                                    cQf4 = cQf3;
                                    iG3 = e70Var.g();
                                    if (iJ3 != iJ2) {
                                        e70Var.v(iJ3);
                                        if (z4) {
                                            iMax3 = Math.max(iMax3, e70Var.e(qnHx2).b() + e70Var.k() + e70Var.L);
                                        }
                                        zA = true;
                                    }
                                    if (iG3 != iG2) {
                                        e70Var.s(iG3);
                                        if (z5) {
                                            iMax4 = Math.max(iMax4, e70Var.e(qnHx).b() + e70Var.l() + e70Var.M);
                                        }
                                        zA = true;
                                    }
                                    if (!e70Var.w) {
                                    }
                                }
                            } else if (e70Var.X == 8) {
                                arrayList2 = arrayList;
                                i28 = size2;
                                cQf4 = cQf3;
                            } else {
                                iJ2 = e70Var.j();
                                iG2 = e70Var.g();
                                arrayList2 = arrayList;
                                int i5111113 = e70Var.R;
                                i28 = size2;
                                zA |= f9Var2.a(cQf3, e70Var, true);
                                iJ3 = e70Var.j();
                                cQf4 = cQf3;
                                iG3 = e70Var.g();
                                if (iJ3 != iJ2) {
                                    e70Var.v(iJ3);
                                    if (z4) {
                                        iMax3 = Math.max(iMax3, e70Var.e(qnHx2).b() + e70Var.k() + e70Var.L);
                                    }
                                    zA = true;
                                }
                                if (iG3 != iG2) {
                                    e70Var.s(iG3);
                                    if (z5) {
                                        iMax4 = Math.max(iMax4, e70Var.e(qnHx).b() + e70Var.l() + e70Var.M);
                                    }
                                    zA = true;
                                }
                                if (!e70Var.w) {
                                }
                            }
                            i25++;
                            arrayList = arrayList2;
                            size2 = i28;
                            cQf3 = cQf4;
                        }
                        ArrayList<e70> arrayList16 = arrayList;
                        int i5111114 = size2;
                        f9.CQf cQf18 = cQf3;
                        if (zA) {
                            i26 = i19;
                            i27 = i20;
                            f70Var4 = f70Var3;
                            f9Var2.b(f70Var4, i26, i27);
                            zA = false;
                        } else {
                            i26 = i19;
                            i27 = i20;
                            f70Var4 = f70Var3;
                        }
                        i22++;
                        i19 = i26;
                        i20 = i27;
                        f70Var3 = f70Var4;
                        arrayList = arrayList16;
                        size2 = i5111114;
                        cQf3 = cQf18;
                    }
                    i23 = i19;
                    i24 = i20;
                    f70Var2 = f70Var3;
                    if (zA) {
                        f9Var2.b(f70Var2, i23, i24);
                        if (f70Var2.j() < iMax3) {
                            f70Var2.v(iMax3);
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (f70Var2.g() < iMax4) {
                            f70Var2.s(iMax4);
                            z7 = true;
                        } else {
                            z7 = z6;
                        }
                        if (z7) {
                            f9Var2.b(f70Var2, i23, i24);
                        }
                    }
                } else {
                    f70Var2 = f70Var;
                    i16 = i13;
                }
                i17 = i16;
                f70Var2.q0 = i17;
                if ((i17 & 256) == 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                o32.p = z3;
            }
            int iJ115 = f70Var2.j();
            int iG16 = f70Var2.g();
            z11 = f70Var2.r0;
            z12 = f70Var2.s0;
            int i5111115 = cQf7.e;
            int iResolveSizeAndState11 = View.resolveSizeAndState(iJ115 + cQf7.d, i, 0);
            int iResolveSizeAndState12 = View.resolveSizeAndState(iG16 + i5111115, i2, 0) & 16777215;
            iMin2 = Math.min(this.B, iResolveSizeAndState11 & 16777215);
            iMin3 = Math.min(this.C, iResolveSizeAndState12);
            if (z11) {
                iMin2 |= 16777216;
            }
            if (z12) {
                iMin3 |= 16777216;
            }
            setMeasuredDimension(iMin2, iMin3);
        }
        iMax = childCount2 == 0 ? Math.max(0, this.z) : i47;
        i3 = 2;
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                if (mode2 != 1073741824) {
                    i4 = 1;
                    iMin = 0;
                } else {
                    iMin = Math.min(this.C - i49, i48);
                    i4 = 1;
                }
                if (iMax == f70Var6.j()) {
                    oj0Var2.c = true;
                } else {
                    oj0Var2.c = true;
                }
                f70Var6.P = 0;
                f70Var6.Q = 0;
                int i5111116 = this.B - i50;
                iArr = f70Var6.u;
                iArr[0] = i5111116;
                iArr[1] = this.C - i49;
                f70Var6.S = 0;
                f70Var6.T = 0;
                f70Var6.t(i3);
                f70Var6.v(iMax);
                f70Var6.u(i4);
                f70Var6.s(iMin);
                i5 = this.z - i50;
                if (i5 < 0) {
                    i6 = 0;
                    f70Var6.S = 0;
                } else {
                    i6 = 0;
                    f70Var6.S = i5;
                }
                i7 = this.A - i49;
                if (i7 < 0) {
                    f70Var6.T = i6;
                } else {
                    f70Var6.T = i7;
                }
                f70Var6.k0 = iMax7;
                f70Var6.l0 = iMax5;
                f9Var4.getClass();
                cQf = f70Var6.h0;
                size = f70Var6.e0.size();
                iJ = f70Var6.j();
                iG = f70Var6.g();
                if ((i45 & 128) == 128) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    z2 = true;
                } else {
                    if ((i45 & 64) == 64) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    if (z21) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    i40 = 0;
                    while (i40 < size) {
                        e70Var7 = f70Var6.e0.get(i40);
                        iArr4 = e70Var7.J;
                        if (iArr4[0] == 3) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (iArr4[1] == 3) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        if (z18) {
                            z20 = false;
                        } else {
                            z20 = false;
                        }
                        if (!e70Var7.o()) {
                        }
                        z2 = false;
                        break;
                    }
                }
                i8 = mode2;
                if (z2 && ((mode != 1073741824 && i8 == 1073741824) || z)) {
                    int iMin12 = Math.min(iArr[0], i47);
                    iMin4 = Math.min(iArr[1], i48);
                    if (mode == 1073741824) {
                        oj0Var = oj0Var2;
                    } else {
                        oj0Var = oj0Var2;
                    }
                    if (i8 == 1073741824) {
                        f70Var6.s(iMin4);
                        oj0Var.b = true;
                    }
                    if (mode == 1073741824) {
                        cQf2 = cQf;
                        i9 = size;
                        f9Var = f9Var4;
                        i10 = iJ;
                        i11 = iG;
                        i32 = i8;
                        z13 = oj0Var.b;
                        f70Var5 = oj0Var.a;
                        if (z13) {
                            while (r0.hasNext()) {
                                e70Var9.a = false;
                                gd1 gd1Var114 = e70Var9.d;
                                gd1Var114.e.j = false;
                                gd1Var114.g = false;
                                gd1Var114.n();
                                wh5 wh5Var114 = e70Var9.e;
                                wh5Var114.e.j = false;
                                wh5Var114.g = false;
                                wh5Var114.m();
                            }
                            i33 = 0;
                            f70Var5.a = false;
                            gd1 gd1Var115 = f70Var5.d;
                            gd1Var115.e.j = false;
                            gd1Var115.g = false;
                            gd1Var115.n();
                            wh5 wh5Var115 = f70Var5.e;
                            wh5Var115.e.j = false;
                            wh5Var115.g = false;
                            wh5Var115.m();
                            oj0Var.c();
                        } else {
                            i33 = 0;
                        }
                        oj0Var.b(oj0Var.d);
                        f70Var5.P = i33;
                        f70Var5.Q = i33;
                        f70Var5.d.h.d(i33);
                        f70Var5.e.h.d(i33);
                        i34 = 1073741824;
                        if (mode == 1073741824) {
                            f70Var = f70Var6;
                            i35 = 1;
                            zB = f70Var.B(i33, z) & true;
                            i12 = 1;
                        } else {
                            f70Var = f70Var6;
                            i35 = 1;
                            zB = true;
                            i12 = 0;
                        }
                        if (i32 == 1073741824) {
                            zB &= f70Var.B(i35, z);
                            i12++;
                        }
                    } else {
                        cQf2 = cQf;
                        i9 = size;
                        f9Var = f9Var4;
                        i10 = iJ;
                        i11 = iG;
                        i32 = i8;
                        z13 = oj0Var.b;
                        f70Var5 = oj0Var.a;
                        if (z13) {
                            while (r0.hasNext()) {
                                e70Var9.a = false;
                                gd1 gd1Var116 = e70Var9.d;
                                gd1Var116.e.j = false;
                                gd1Var116.g = false;
                                gd1Var116.n();
                                wh5 wh5Var116 = e70Var9.e;
                                wh5Var116.e.j = false;
                                wh5Var116.g = false;
                                wh5Var116.m();
                            }
                            i33 = 0;
                            f70Var5.a = false;
                            gd1 gd1Var117 = f70Var5.d;
                            gd1Var117.e.j = false;
                            gd1Var117.g = false;
                            gd1Var117.n();
                            wh5 wh5Var117 = f70Var5.e;
                            wh5Var117.e.j = false;
                            wh5Var117.g = false;
                            wh5Var117.m();
                            oj0Var.c();
                        } else {
                            i33 = 0;
                        }
                        oj0Var.b(oj0Var.d);
                        f70Var5.P = i33;
                        f70Var5.Q = i33;
                        f70Var5.d.h.d(i33);
                        f70Var5.e.h.d(i33);
                        i34 = 1073741824;
                        if (mode == 1073741824) {
                            f70Var = f70Var6;
                            i35 = 1;
                            zB = f70Var.B(i33, z) & true;
                            i12 = 1;
                        } else {
                            f70Var = f70Var6;
                            i35 = 1;
                            zB = true;
                            i12 = 0;
                        }
                        if (i32 == 1073741824) {
                            zB &= f70Var.B(i35, z);
                            i12++;
                        }
                    }
                    if (zB) {
                        if (mode == i34) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (i32 == i34) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        f70Var.w(z14, z15);
                    }
                } else {
                    cQf2 = cQf;
                    i9 = size;
                    f70Var = f70Var6;
                    f9Var = f9Var4;
                    i10 = iJ;
                    i11 = iG;
                    zB = false;
                    i12 = 0;
                }
                if (zB) {
                    if (i9 > 0) {
                        size3 = f70Var.e0.size();
                        cQf6 = f70Var.h0;
                        i29 = 0;
                        while (i29 < size3) {
                            e70Var6 = f70Var.e0.get(i29);
                            if (e70Var6 instanceof bb1) {
                                f9Var3 = f9Var;
                            } else {
                                iF = e70Var6.f(0);
                                int iF15 = e70Var6.f(1);
                                if (iF == 3) {
                                    z10 = false;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    f9Var3 = f9Var;
                                } else {
                                    f9Var3 = f9Var;
                                    f9Var3.a(cQf6, e70Var6, false);
                                }
                            }
                            i29++;
                            f9Var = f9Var3;
                        }
                        f9Var2 = f9Var;
                        constraintLayout = ((CQf) cQf6).a;
                        childCount = constraintLayout.getChildCount();
                        while (i30 < childCount) {
                            childAt = constraintLayout.getChildAt(i30);
                            if (childAt instanceof LPt8Fixed) {
                                lPt8 = (LPt8Fixed) childAt;
                                if (lPt8.x != null) {
                                    QnHx qnHx15 = (QnHx) lPt8.getLayoutParams();
                                    qnHx3 = (QnHx) lPt8.x.getLayoutParams();
                                    e70Var3 = qnHx3.l0;
                                    e70Var3.X = 0;
                                    e70Var4 = qnHx15.l0;
                                    if (e70Var4.J[0] != 1) {
                                        e70Var4.v(e70Var3.j());
                                    }
                                    e70Var5 = qnHx15.l0;
                                    if (e70Var5.J[1] != 1) {
                                        e70Var5.s(qnHx3.l0.g());
                                    }
                                    qnHx3.l0.X = 8;
                                }
                            }
                        }
                        arrayList3 = constraintLayout.x;
                        size4 = arrayList3.size();
                        if (size4 > 0) {
                            while (i31 < size4) {
                                arrayList3.get(i31).getClass();
                            }
                        }
                    } else {
                        f9Var2 = f9Var;
                    }
                    i13 = f70Var.q0;
                    arrayList = f9Var2.a;
                    size2 = arrayList.size();
                    if (i9 > 0) {
                        i14 = i10;
                        i15 = i11;
                        f9Var2.b(f70Var, i14, i15);
                    } else {
                        i14 = i10;
                        i15 = i11;
                    }
                    if (size2 > 0) {
                        iArr2 = f70Var.J;
                        if (iArr2[0] == 2) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (iArr2[1] == 2) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        int iJ116 = f70Var.j();
                        f70 f70Var19 = f9Var2.c;
                        iMax3 = Math.max(iJ116, f70Var19.S);
                        iMax4 = Math.max(f70Var.g(), f70Var19.T);
                        i18 = 0;
                        zA = false;
                        while (true) {
                            qnHx = w60.QnHx.BOTTOM;
                            qnHx2 = w60.QnHx.RIGHT;
                            if (i18 >= size2) {
                                break;
                                break;
                            }
                            e70Var2 = arrayList.get(i18);
                            int i5111117 = i13;
                            if (e70Var2 instanceof gk5) {
                                cQf5 = cQf2;
                            } else {
                                iJ4 = e70Var2.j();
                                iG4 = e70Var2.g();
                                cQf5 = cQf2;
                                boolean zA13 = zA | f9Var2.a(cQf5, e70Var2, true);
                                iJ5 = e70Var2.j();
                                z8 = zA13;
                                iG5 = e70Var2.g();
                                if (iJ5 != iJ4) {
                                    e70Var2.v(iJ5);
                                    if (z4) {
                                        iMax3 = Math.max(iMax3, e70Var2.e(qnHx2).b() + e70Var2.k() + e70Var2.L);
                                    }
                                    z8 = true;
                                }
                                if (iG5 != iG4) {
                                    e70Var2.s(iG5);
                                    if (z5) {
                                        iMax4 = Math.max(iMax4, e70Var2.e(qnHx).b() + e70Var2.l() + e70Var2.M);
                                    }
                                    z9 = true;
                                } else {
                                    z9 = z8;
                                }
                                zA = z9 | false;
                            }
                            i18++;
                            cQf2 = cQf5;
                            i13 = i5111117;
                            i14 = i14;
                            i15 = i15;
                            f70Var = f70Var;
                        }
                        f70Var3 = f70Var;
                        i16 = i13;
                        i19 = i14;
                        i20 = i15;
                        cQf3 = cQf2;
                        i22 = 0;
                        while (i22 < i21) {
                            i25 = 0;
                            while (i25 < size2) {
                                e70Var = arrayList.get(i25);
                                if (e70Var instanceof wc1) {
                                    if (e70Var.X == 8) {
                                        arrayList2 = arrayList;
                                        i28 = size2;
                                        cQf4 = cQf3;
                                    } else {
                                        iJ2 = e70Var.j();
                                        iG2 = e70Var.g();
                                        arrayList2 = arrayList;
                                        int i5111118 = e70Var.R;
                                        i28 = size2;
                                        zA |= f9Var2.a(cQf3, e70Var, true);
                                        iJ3 = e70Var.j();
                                        cQf4 = cQf3;
                                        iG3 = e70Var.g();
                                        if (iJ3 != iJ2) {
                                            e70Var.v(iJ3);
                                            if (z4) {
                                                iMax3 = Math.max(iMax3, e70Var.e(qnHx2).b() + e70Var.k() + e70Var.L);
                                            }
                                            zA = true;
                                        }
                                        if (iG3 != iG2) {
                                            e70Var.s(iG3);
                                            if (z5) {
                                                iMax4 = Math.max(iMax4, e70Var.e(qnHx).b() + e70Var.l() + e70Var.M);
                                            }
                                            zA = true;
                                        }
                                        if (!e70Var.w) {
                                        }
                                    }
                                } else if (e70Var.X == 8) {
                                    arrayList2 = arrayList;
                                    i28 = size2;
                                    cQf4 = cQf3;
                                } else {
                                    iJ2 = e70Var.j();
                                    iG2 = e70Var.g();
                                    arrayList2 = arrayList;
                                    int i5111119 = e70Var.R;
                                    i28 = size2;
                                    zA |= f9Var2.a(cQf3, e70Var, true);
                                    iJ3 = e70Var.j();
                                    cQf4 = cQf3;
                                    iG3 = e70Var.g();
                                    if (iJ3 != iJ2) {
                                        e70Var.v(iJ3);
                                        if (z4) {
                                            iMax3 = Math.max(iMax3, e70Var.e(qnHx2).b() + e70Var.k() + e70Var.L);
                                        }
                                        zA = true;
                                    }
                                    if (iG3 != iG2) {
                                        e70Var.s(iG3);
                                        if (z5) {
                                            iMax4 = Math.max(iMax4, e70Var.e(qnHx).b() + e70Var.l() + e70Var.M);
                                        }
                                        zA = true;
                                    }
                                    if (!e70Var.w) {
                                    }
                                }
                                i25++;
                                arrayList = arrayList2;
                                size2 = i28;
                                cQf3 = cQf4;
                            }
                            ArrayList<e70> arrayList17 = arrayList;
                            int i51111110 = size2;
                            f9.CQf cQf19 = cQf3;
                            if (zA) {
                                i26 = i19;
                                i27 = i20;
                                f70Var4 = f70Var3;
                                f9Var2.b(f70Var4, i26, i27);
                                zA = false;
                            } else {
                                i26 = i19;
                                i27 = i20;
                                f70Var4 = f70Var3;
                            }
                            i22++;
                            i19 = i26;
                            i20 = i27;
                            f70Var3 = f70Var4;
                            arrayList = arrayList17;
                            size2 = i51111110;
                            cQf3 = cQf19;
                        }
                        i23 = i19;
                        i24 = i20;
                        f70Var2 = f70Var3;
                        if (zA) {
                            f9Var2.b(f70Var2, i23, i24);
                            if (f70Var2.j() < iMax3) {
                                f70Var2.v(iMax3);
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (f70Var2.g() < iMax4) {
                                f70Var2.s(iMax4);
                                z7 = true;
                            } else {
                                z7 = z6;
                            }
                            if (z7) {
                                f9Var2.b(f70Var2, i23, i24);
                            }
                        }
                    } else {
                        f70Var2 = f70Var;
                        i16 = i13;
                    }
                    i17 = i16;
                    f70Var2.q0 = i17;
                    if ((i17 & 256) == 256) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    o32.p = z3;
                } else {
                    if (i9 > 0) {
                        size3 = f70Var.e0.size();
                        cQf6 = f70Var.h0;
                        i29 = 0;
                        while (i29 < size3) {
                            e70Var6 = f70Var.e0.get(i29);
                            if (e70Var6 instanceof bb1) {
                                f9Var3 = f9Var;
                            } else {
                                iF = e70Var6.f(0);
                                int iF16 = e70Var6.f(1);
                                if (iF == 3) {
                                    z10 = false;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    f9Var3 = f9Var;
                                } else {
                                    f9Var3 = f9Var;
                                    f9Var3.a(cQf6, e70Var6, false);
                                }
                            }
                            i29++;
                            f9Var = f9Var3;
                        }
                        f9Var2 = f9Var;
                        constraintLayout = ((CQf) cQf6).a;
                        childCount = constraintLayout.getChildCount();
                        while (i30 < childCount) {
                            childAt = constraintLayout.getChildAt(i30);
                            if (childAt instanceof LPt8Fixed) {
                                lPt8 = (LPt8Fixed) childAt;
                                if (lPt8.x != null) {
                                    QnHx qnHx16 = (QnHx) lPt8.getLayoutParams();
                                    qnHx3 = (QnHx) lPt8.x.getLayoutParams();
                                    e70Var3 = qnHx3.l0;
                                    e70Var3.X = 0;
                                    e70Var4 = qnHx16.l0;
                                    if (e70Var4.J[0] != 1) {
                                        e70Var4.v(e70Var3.j());
                                    }
                                    e70Var5 = qnHx16.l0;
                                    if (e70Var5.J[1] != 1) {
                                        e70Var5.s(qnHx3.l0.g());
                                    }
                                    qnHx3.l0.X = 8;
                                }
                            }
                        }
                        arrayList3 = constraintLayout.x;
                        size4 = arrayList3.size();
                        if (size4 > 0) {
                            while (i31 < size4) {
                                arrayList3.get(i31).getClass();
                            }
                        }
                    } else {
                        f9Var2 = f9Var;
                    }
                    i13 = f70Var.q0;
                    arrayList = f9Var2.a;
                    size2 = arrayList.size();
                    if (i9 > 0) {
                        i14 = i10;
                        i15 = i11;
                        f9Var2.b(f70Var, i14, i15);
                    } else {
                        i14 = i10;
                        i15 = i11;
                    }
                    if (size2 > 0) {
                        iArr2 = f70Var.J;
                        if (iArr2[0] == 2) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (iArr2[1] == 2) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        int iJ117 = f70Var.j();
                        f70 f70Var110 = f9Var2.c;
                        iMax3 = Math.max(iJ117, f70Var110.S);
                        iMax4 = Math.max(f70Var.g(), f70Var110.T);
                        i18 = 0;
                        zA = false;
                        while (true) {
                            qnHx = w60.QnHx.BOTTOM;
                            qnHx2 = w60.QnHx.RIGHT;
                            if (i18 >= size2) {
                                break;
                                break;
                            }
                            e70Var2 = arrayList.get(i18);
                            int i51111111 = i13;
                            if (e70Var2 instanceof gk5) {
                                cQf5 = cQf2;
                            } else {
                                iJ4 = e70Var2.j();
                                iG4 = e70Var2.g();
                                cQf5 = cQf2;
                                boolean zA14 = zA | f9Var2.a(cQf5, e70Var2, true);
                                iJ5 = e70Var2.j();
                                z8 = zA14;
                                iG5 = e70Var2.g();
                                if (iJ5 != iJ4) {
                                    e70Var2.v(iJ5);
                                    if (z4) {
                                        iMax3 = Math.max(iMax3, e70Var2.e(qnHx2).b() + e70Var2.k() + e70Var2.L);
                                    }
                                    z8 = true;
                                }
                                if (iG5 != iG4) {
                                    e70Var2.s(iG5);
                                    if (z5) {
                                        iMax4 = Math.max(iMax4, e70Var2.e(qnHx).b() + e70Var2.l() + e70Var2.M);
                                    }
                                    z9 = true;
                                } else {
                                    z9 = z8;
                                }
                                zA = z9 | false;
                            }
                            i18++;
                            cQf2 = cQf5;
                            i13 = i51111111;
                            i14 = i14;
                            i15 = i15;
                            f70Var = f70Var;
                        }
                        f70Var3 = f70Var;
                        i16 = i13;
                        i19 = i14;
                        i20 = i15;
                        cQf3 = cQf2;
                        i22 = 0;
                        while (i22 < i21) {
                            i25 = 0;
                            while (i25 < size2) {
                                e70Var = arrayList.get(i25);
                                if (e70Var instanceof wc1) {
                                    if (e70Var.X == 8) {
                                        arrayList2 = arrayList;
                                        i28 = size2;
                                        cQf4 = cQf3;
                                    } else {
                                        iJ2 = e70Var.j();
                                        iG2 = e70Var.g();
                                        arrayList2 = arrayList;
                                        int i51111112 = e70Var.R;
                                        i28 = size2;
                                        zA |= f9Var2.a(cQf3, e70Var, true);
                                        iJ3 = e70Var.j();
                                        cQf4 = cQf3;
                                        iG3 = e70Var.g();
                                        if (iJ3 != iJ2) {
                                            e70Var.v(iJ3);
                                            if (z4) {
                                                iMax3 = Math.max(iMax3, e70Var.e(qnHx2).b() + e70Var.k() + e70Var.L);
                                            }
                                            zA = true;
                                        }
                                        if (iG3 != iG2) {
                                            e70Var.s(iG3);
                                            if (z5) {
                                                iMax4 = Math.max(iMax4, e70Var.e(qnHx).b() + e70Var.l() + e70Var.M);
                                            }
                                            zA = true;
                                        }
                                        if (!e70Var.w) {
                                        }
                                    }
                                } else if (e70Var.X == 8) {
                                    arrayList2 = arrayList;
                                    i28 = size2;
                                    cQf4 = cQf3;
                                } else {
                                    iJ2 = e70Var.j();
                                    iG2 = e70Var.g();
                                    arrayList2 = arrayList;
                                    int i51111113 = e70Var.R;
                                    i28 = size2;
                                    zA |= f9Var2.a(cQf3, e70Var, true);
                                    iJ3 = e70Var.j();
                                    cQf4 = cQf3;
                                    iG3 = e70Var.g();
                                    if (iJ3 != iJ2) {
                                        e70Var.v(iJ3);
                                        if (z4) {
                                            iMax3 = Math.max(iMax3, e70Var.e(qnHx2).b() + e70Var.k() + e70Var.L);
                                        }
                                        zA = true;
                                    }
                                    if (iG3 != iG2) {
                                        e70Var.s(iG3);
                                        if (z5) {
                                            iMax4 = Math.max(iMax4, e70Var.e(qnHx).b() + e70Var.l() + e70Var.M);
                                        }
                                        zA = true;
                                    }
                                    if (!e70Var.w) {
                                    }
                                }
                                i25++;
                                arrayList = arrayList2;
                                size2 = i28;
                                cQf3 = cQf4;
                            }
                            ArrayList<e70> arrayList18 = arrayList;
                            int i51111114 = size2;
                            f9.CQf cQf110 = cQf3;
                            if (zA) {
                                i26 = i19;
                                i27 = i20;
                                f70Var4 = f70Var3;
                                f9Var2.b(f70Var4, i26, i27);
                                zA = false;
                            } else {
                                i26 = i19;
                                i27 = i20;
                                f70Var4 = f70Var3;
                            }
                            i22++;
                            i19 = i26;
                            i20 = i27;
                            f70Var3 = f70Var4;
                            arrayList = arrayList18;
                            size2 = i51111114;
                            cQf3 = cQf110;
                        }
                        i23 = i19;
                        i24 = i20;
                        f70Var2 = f70Var3;
                        if (zA) {
                            f9Var2.b(f70Var2, i23, i24);
                            if (f70Var2.j() < iMax3) {
                                f70Var2.v(iMax3);
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (f70Var2.g() < iMax4) {
                                f70Var2.s(iMax4);
                                z7 = true;
                            } else {
                                z7 = z6;
                            }
                            if (z7) {
                                f9Var2.b(f70Var2, i23, i24);
                            }
                        }
                    } else {
                        f70Var2 = f70Var;
                        i16 = i13;
                    }
                    i17 = i16;
                    f70Var2.q0 = i17;
                    if ((i17 & 256) == 256) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    o32.p = z3;
                }
                int iJ118 = f70Var2.j();
                int iG17 = f70Var2.g();
                z11 = f70Var2.r0;
                z12 = f70Var2.s0;
                int i51111115 = cQf7.e;
                int iResolveSizeAndState13 = View.resolveSizeAndState(iJ118 + cQf7.d, i, 0);
                int iResolveSizeAndState14 = View.resolveSizeAndState(iG17 + i51111115, i2, 0) & 16777215;
                iMin2 = Math.min(this.B, iResolveSizeAndState13 & 16777215);
                iMin3 = Math.min(this.C, iResolveSizeAndState14);
                if (z11) {
                    iMin2 |= 16777216;
                }
                if (z12) {
                    iMin3 |= 16777216;
                }
                setMeasuredDimension(iMin2, iMin3);
            }
            if (childCount2 == 0) {
                iMax2 = Math.max(0, this.A);
            } else {
                iMin = 0;
                i4 = 2;
            }
            if (iMax == f70Var6.j()) {
                oj0Var2.c = true;
            } else {
                oj0Var2.c = true;
            }
            f70Var6.P = 0;
            f70Var6.Q = 0;
            int i51111116 = this.B - i50;
            iArr = f70Var6.u;
            iArr[0] = i51111116;
            iArr[1] = this.C - i49;
            f70Var6.S = 0;
            f70Var6.T = 0;
            f70Var6.t(i3);
            f70Var6.v(iMax);
            f70Var6.u(i4);
            f70Var6.s(iMin);
            i5 = this.z - i50;
            if (i5 < 0) {
                i6 = 0;
                f70Var6.S = 0;
            } else {
                i6 = 0;
                f70Var6.S = i5;
            }
            i7 = this.A - i49;
            if (i7 < 0) {
                f70Var6.T = i6;
            } else {
                f70Var6.T = i7;
            }
            f70Var6.k0 = iMax7;
            f70Var6.l0 = iMax5;
            f9Var4.getClass();
            cQf = f70Var6.h0;
            size = f70Var6.e0.size();
            iJ = f70Var6.j();
            iG = f70Var6.g();
            if ((i45 & 128) == 128) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                z2 = true;
            } else {
                if ((i45 & 64) == 64) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                if (z21) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            if (z2) {
                i40 = 0;
                while (i40 < size) {
                    e70Var7 = f70Var6.e0.get(i40);
                    iArr4 = e70Var7.J;
                    if (iArr4[0] == 3) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (iArr4[1] == 3) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (z18) {
                        z20 = false;
                    } else {
                        z20 = false;
                    }
                    if (!e70Var7.o()) {
                    }
                    z2 = false;
                    break;
                }
            }
            i8 = mode2;
            if (z2 && ((mode != 1073741824 && i8 == 1073741824) || z)) {
                int iMin13 = Math.min(iArr[0], i47);
                iMin4 = Math.min(iArr[1], i48);
                if (mode == 1073741824) {
                    oj0Var = oj0Var2;
                } else {
                    oj0Var = oj0Var2;
                }
                if (i8 == 1073741824) {
                    f70Var6.s(iMin4);
                    oj0Var.b = true;
                }
                if (mode == 1073741824) {
                    cQf2 = cQf;
                    i9 = size;
                    f9Var = f9Var4;
                    i10 = iJ;
                    i11 = iG;
                    i32 = i8;
                    z13 = oj0Var.b;
                    f70Var5 = oj0Var.a;
                    if (z13) {
                        while (r0.hasNext()) {
                            e70Var9.a = false;
                            gd1 gd1Var118 = e70Var9.d;
                            gd1Var118.e.j = false;
                            gd1Var118.g = false;
                            gd1Var118.n();
                            wh5 wh5Var118 = e70Var9.e;
                            wh5Var118.e.j = false;
                            wh5Var118.g = false;
                            wh5Var118.m();
                        }
                        i33 = 0;
                        f70Var5.a = false;
                        gd1 gd1Var119 = f70Var5.d;
                        gd1Var119.e.j = false;
                        gd1Var119.g = false;
                        gd1Var119.n();
                        wh5 wh5Var119 = f70Var5.e;
                        wh5Var119.e.j = false;
                        wh5Var119.g = false;
                        wh5Var119.m();
                        oj0Var.c();
                    } else {
                        i33 = 0;
                    }
                    oj0Var.b(oj0Var.d);
                    f70Var5.P = i33;
                    f70Var5.Q = i33;
                    f70Var5.d.h.d(i33);
                    f70Var5.e.h.d(i33);
                    i34 = 1073741824;
                    if (mode == 1073741824) {
                        f70Var = f70Var6;
                        i35 = 1;
                        zB = f70Var.B(i33, z) & true;
                        i12 = 1;
                    } else {
                        f70Var = f70Var6;
                        i35 = 1;
                        zB = true;
                        i12 = 0;
                    }
                    if (i32 == 1073741824) {
                        zB &= f70Var.B(i35, z);
                        i12++;
                    }
                } else {
                    cQf2 = cQf;
                    i9 = size;
                    f9Var = f9Var4;
                    i10 = iJ;
                    i11 = iG;
                    i32 = i8;
                    z13 = oj0Var.b;
                    f70Var5 = oj0Var.a;
                    if (z13) {
                        while (r0.hasNext()) {
                            e70Var9.a = false;
                            gd1 gd1Var1110 = e70Var9.d;
                            gd1Var1110.e.j = false;
                            gd1Var1110.g = false;
                            gd1Var1110.n();
                            wh5 wh5Var1110 = e70Var9.e;
                            wh5Var1110.e.j = false;
                            wh5Var1110.g = false;
                            wh5Var1110.m();
                        }
                        i33 = 0;
                        f70Var5.a = false;
                        gd1 gd1Var1111 = f70Var5.d;
                        gd1Var1111.e.j = false;
                        gd1Var1111.g = false;
                        gd1Var1111.n();
                        wh5 wh5Var1111 = f70Var5.e;
                        wh5Var1111.e.j = false;
                        wh5Var1111.g = false;
                        wh5Var1111.m();
                        oj0Var.c();
                    } else {
                        i33 = 0;
                    }
                    oj0Var.b(oj0Var.d);
                    f70Var5.P = i33;
                    f70Var5.Q = i33;
                    f70Var5.d.h.d(i33);
                    f70Var5.e.h.d(i33);
                    i34 = 1073741824;
                    if (mode == 1073741824) {
                        f70Var = f70Var6;
                        i35 = 1;
                        zB = f70Var.B(i33, z) & true;
                        i12 = 1;
                    } else {
                        f70Var = f70Var6;
                        i35 = 1;
                        zB = true;
                        i12 = 0;
                    }
                    if (i32 == 1073741824) {
                        zB &= f70Var.B(i35, z);
                        i12++;
                    }
                }
                if (zB) {
                    if (mode == i34) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (i32 == i34) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    f70Var.w(z14, z15);
                }
            } else {
                cQf2 = cQf;
                i9 = size;
                f70Var = f70Var6;
                f9Var = f9Var4;
                i10 = iJ;
                i11 = iG;
                zB = false;
                i12 = 0;
            }
            if (zB) {
                if (i9 > 0) {
                    size3 = f70Var.e0.size();
                    cQf6 = f70Var.h0;
                    i29 = 0;
                    while (i29 < size3) {
                        e70Var6 = f70Var.e0.get(i29);
                        if (e70Var6 instanceof bb1) {
                            f9Var3 = f9Var;
                        } else {
                            iF = e70Var6.f(0);
                            int iF17 = e70Var6.f(1);
                            if (iF == 3) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                f9Var3 = f9Var;
                            } else {
                                f9Var3 = f9Var;
                                f9Var3.a(cQf6, e70Var6, false);
                            }
                        }
                        i29++;
                        f9Var = f9Var3;
                    }
                    f9Var2 = f9Var;
                    constraintLayout = ((CQf) cQf6).a;
                    childCount = constraintLayout.getChildCount();
                    while (i30 < childCount) {
                        childAt = constraintLayout.getChildAt(i30);
                        if (childAt instanceof LPt8Fixed) {
                            lPt8 = (LPt8Fixed) childAt;
                            if (lPt8.x != null) {
                                QnHx qnHx17 = (QnHx) lPt8.getLayoutParams();
                                qnHx3 = (QnHx) lPt8.x.getLayoutParams();
                                e70Var3 = qnHx3.l0;
                                e70Var3.X = 0;
                                e70Var4 = qnHx17.l0;
                                if (e70Var4.J[0] != 1) {
                                    e70Var4.v(e70Var3.j());
                                }
                                e70Var5 = qnHx17.l0;
                                if (e70Var5.J[1] != 1) {
                                    e70Var5.s(qnHx3.l0.g());
                                }
                                qnHx3.l0.X = 8;
                            }
                        }
                    }
                    arrayList3 = constraintLayout.x;
                    size4 = arrayList3.size();
                    if (size4 > 0) {
                        while (i31 < size4) {
                            arrayList3.get(i31).getClass();
                        }
                    }
                } else {
                    f9Var2 = f9Var;
                }
                i13 = f70Var.q0;
                arrayList = f9Var2.a;
                size2 = arrayList.size();
                if (i9 > 0) {
                    i14 = i10;
                    i15 = i11;
                    f9Var2.b(f70Var, i14, i15);
                } else {
                    i14 = i10;
                    i15 = i11;
                }
                if (size2 > 0) {
                    iArr2 = f70Var.J;
                    if (iArr2[0] == 2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (iArr2[1] == 2) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    int iJ119 = f70Var.j();
                    f70 f70Var111 = f9Var2.c;
                    iMax3 = Math.max(iJ119, f70Var111.S);
                    iMax4 = Math.max(f70Var.g(), f70Var111.T);
                    i18 = 0;
                    zA = false;
                    while (true) {
                        qnHx = w60.QnHx.BOTTOM;
                        qnHx2 = w60.QnHx.RIGHT;
                        if (i18 >= size2) {
                            break;
                            break;
                        }
                        e70Var2 = arrayList.get(i18);
                        int i51111117 = i13;
                        if (e70Var2 instanceof gk5) {
                            cQf5 = cQf2;
                        } else {
                            iJ4 = e70Var2.j();
                            iG4 = e70Var2.g();
                            cQf5 = cQf2;
                            boolean zA15 = zA | f9Var2.a(cQf5, e70Var2, true);
                            iJ5 = e70Var2.j();
                            z8 = zA15;
                            iG5 = e70Var2.g();
                            if (iJ5 != iJ4) {
                                e70Var2.v(iJ5);
                                if (z4) {
                                    iMax3 = Math.max(iMax3, e70Var2.e(qnHx2).b() + e70Var2.k() + e70Var2.L);
                                }
                                z8 = true;
                            }
                            if (iG5 != iG4) {
                                e70Var2.s(iG5);
                                if (z5) {
                                    iMax4 = Math.max(iMax4, e70Var2.e(qnHx).b() + e70Var2.l() + e70Var2.M);
                                }
                                z9 = true;
                            } else {
                                z9 = z8;
                            }
                            zA = z9 | false;
                        }
                        i18++;
                        cQf2 = cQf5;
                        i13 = i51111117;
                        i14 = i14;
                        i15 = i15;
                        f70Var = f70Var;
                    }
                    f70Var3 = f70Var;
                    i16 = i13;
                    i19 = i14;
                    i20 = i15;
                    cQf3 = cQf2;
                    i22 = 0;
                    while (i22 < i21) {
                        i25 = 0;
                        while (i25 < size2) {
                            e70Var = arrayList.get(i25);
                            if (e70Var instanceof wc1) {
                                if (e70Var.X == 8) {
                                    arrayList2 = arrayList;
                                    i28 = size2;
                                    cQf4 = cQf3;
                                } else {
                                    iJ2 = e70Var.j();
                                    iG2 = e70Var.g();
                                    arrayList2 = arrayList;
                                    int i51111118 = e70Var.R;
                                    i28 = size2;
                                    zA |= f9Var2.a(cQf3, e70Var, true);
                                    iJ3 = e70Var.j();
                                    cQf4 = cQf3;
                                    iG3 = e70Var.g();
                                    if (iJ3 != iJ2) {
                                        e70Var.v(iJ3);
                                        if (z4) {
                                            iMax3 = Math.max(iMax3, e70Var.e(qnHx2).b() + e70Var.k() + e70Var.L);
                                        }
                                        zA = true;
                                    }
                                    if (iG3 != iG2) {
                                        e70Var.s(iG3);
                                        if (z5) {
                                            iMax4 = Math.max(iMax4, e70Var.e(qnHx).b() + e70Var.l() + e70Var.M);
                                        }
                                        zA = true;
                                    }
                                    if (!e70Var.w) {
                                    }
                                }
                            } else if (e70Var.X == 8) {
                                arrayList2 = arrayList;
                                i28 = size2;
                                cQf4 = cQf3;
                            } else {
                                iJ2 = e70Var.j();
                                iG2 = e70Var.g();
                                arrayList2 = arrayList;
                                int i51111119 = e70Var.R;
                                i28 = size2;
                                zA |= f9Var2.a(cQf3, e70Var, true);
                                iJ3 = e70Var.j();
                                cQf4 = cQf3;
                                iG3 = e70Var.g();
                                if (iJ3 != iJ2) {
                                    e70Var.v(iJ3);
                                    if (z4) {
                                        iMax3 = Math.max(iMax3, e70Var.e(qnHx2).b() + e70Var.k() + e70Var.L);
                                    }
                                    zA = true;
                                }
                                if (iG3 != iG2) {
                                    e70Var.s(iG3);
                                    if (z5) {
                                        iMax4 = Math.max(iMax4, e70Var.e(qnHx).b() + e70Var.l() + e70Var.M);
                                    }
                                    zA = true;
                                }
                                if (!e70Var.w) {
                                }
                            }
                            i25++;
                            arrayList = arrayList2;
                            size2 = i28;
                            cQf3 = cQf4;
                        }
                        ArrayList<e70> arrayList19 = arrayList;
                        int i511111110 = size2;
                        f9.CQf cQf111 = cQf3;
                        if (zA) {
                            i26 = i19;
                            i27 = i20;
                            f70Var4 = f70Var3;
                            f9Var2.b(f70Var4, i26, i27);
                            zA = false;
                        } else {
                            i26 = i19;
                            i27 = i20;
                            f70Var4 = f70Var3;
                        }
                        i22++;
                        i19 = i26;
                        i20 = i27;
                        f70Var3 = f70Var4;
                        arrayList = arrayList19;
                        size2 = i511111110;
                        cQf3 = cQf111;
                    }
                    i23 = i19;
                    i24 = i20;
                    f70Var2 = f70Var3;
                    if (zA) {
                        f9Var2.b(f70Var2, i23, i24);
                        if (f70Var2.j() < iMax3) {
                            f70Var2.v(iMax3);
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (f70Var2.g() < iMax4) {
                            f70Var2.s(iMax4);
                            z7 = true;
                        } else {
                            z7 = z6;
                        }
                        if (z7) {
                            f9Var2.b(f70Var2, i23, i24);
                        }
                    }
                } else {
                    f70Var2 = f70Var;
                    i16 = i13;
                }
                i17 = i16;
                f70Var2.q0 = i17;
                if ((i17 & 256) == 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                o32.p = z3;
            } else {
                if (i9 > 0) {
                    size3 = f70Var.e0.size();
                    cQf6 = f70Var.h0;
                    i29 = 0;
                    while (i29 < size3) {
                        e70Var6 = f70Var.e0.get(i29);
                        if (e70Var6 instanceof bb1) {
                            f9Var3 = f9Var;
                        } else {
                            iF = e70Var6.f(0);
                            int iF18 = e70Var6.f(1);
                            if (iF == 3) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                f9Var3 = f9Var;
                            } else {
                                f9Var3 = f9Var;
                                f9Var3.a(cQf6, e70Var6, false);
                            }
                        }
                        i29++;
                        f9Var = f9Var3;
                    }
                    f9Var2 = f9Var;
                    constraintLayout = ((CQf) cQf6).a;
                    childCount = constraintLayout.getChildCount();
                    while (i30 < childCount) {
                        childAt = constraintLayout.getChildAt(i30);
                        if (childAt instanceof LPt8Fixed) {
                            lPt8 = (LPt8Fixed) childAt;
                            if (lPt8.x != null) {
                                QnHx qnHx18 = (QnHx) lPt8.getLayoutParams();
                                qnHx3 = (QnHx) lPt8.x.getLayoutParams();
                                e70Var3 = qnHx3.l0;
                                e70Var3.X = 0;
                                e70Var4 = qnHx18.l0;
                                if (e70Var4.J[0] != 1) {
                                    e70Var4.v(e70Var3.j());
                                }
                                e70Var5 = qnHx18.l0;
                                if (e70Var5.J[1] != 1) {
                                    e70Var5.s(qnHx3.l0.g());
                                }
                                qnHx3.l0.X = 8;
                            }
                        }
                    }
                    arrayList3 = constraintLayout.x;
                    size4 = arrayList3.size();
                    if (size4 > 0) {
                        while (i31 < size4) {
                            arrayList3.get(i31).getClass();
                        }
                    }
                } else {
                    f9Var2 = f9Var;
                }
                i13 = f70Var.q0;
                arrayList = f9Var2.a;
                size2 = arrayList.size();
                if (i9 > 0) {
                    i14 = i10;
                    i15 = i11;
                    f9Var2.b(f70Var, i14, i15);
                } else {
                    i14 = i10;
                    i15 = i11;
                }
                if (size2 > 0) {
                    iArr2 = f70Var.J;
                    if (iArr2[0] == 2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (iArr2[1] == 2) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    int iJ1110 = f70Var.j();
                    f70 f70Var112 = f9Var2.c;
                    iMax3 = Math.max(iJ1110, f70Var112.S);
                    iMax4 = Math.max(f70Var.g(), f70Var112.T);
                    i18 = 0;
                    zA = false;
                    while (true) {
                        qnHx = w60.QnHx.BOTTOM;
                        qnHx2 = w60.QnHx.RIGHT;
                        if (i18 >= size2) {
                            break;
                            break;
                        }
                        e70Var2 = arrayList.get(i18);
                        int i511111111 = i13;
                        if (e70Var2 instanceof gk5) {
                            cQf5 = cQf2;
                        } else {
                            iJ4 = e70Var2.j();
                            iG4 = e70Var2.g();
                            cQf5 = cQf2;
                            boolean zA16 = zA | f9Var2.a(cQf5, e70Var2, true);
                            iJ5 = e70Var2.j();
                            z8 = zA16;
                            iG5 = e70Var2.g();
                            if (iJ5 != iJ4) {
                                e70Var2.v(iJ5);
                                if (z4) {
                                    iMax3 = Math.max(iMax3, e70Var2.e(qnHx2).b() + e70Var2.k() + e70Var2.L);
                                }
                                z8 = true;
                            }
                            if (iG5 != iG4) {
                                e70Var2.s(iG5);
                                if (z5) {
                                    iMax4 = Math.max(iMax4, e70Var2.e(qnHx).b() + e70Var2.l() + e70Var2.M);
                                }
                                z9 = true;
                            } else {
                                z9 = z8;
                            }
                            zA = z9 | false;
                        }
                        i18++;
                        cQf2 = cQf5;
                        i13 = i511111111;
                        i14 = i14;
                        i15 = i15;
                        f70Var = f70Var;
                    }
                    f70Var3 = f70Var;
                    i16 = i13;
                    i19 = i14;
                    i20 = i15;
                    cQf3 = cQf2;
                    i22 = 0;
                    while (i22 < i21) {
                        i25 = 0;
                        while (i25 < size2) {
                            e70Var = arrayList.get(i25);
                            if (e70Var instanceof wc1) {
                                if (e70Var.X == 8) {
                                    arrayList2 = arrayList;
                                    i28 = size2;
                                    cQf4 = cQf3;
                                } else {
                                    iJ2 = e70Var.j();
                                    iG2 = e70Var.g();
                                    arrayList2 = arrayList;
                                    int i511111112 = e70Var.R;
                                    i28 = size2;
                                    zA |= f9Var2.a(cQf3, e70Var, true);
                                    iJ3 = e70Var.j();
                                    cQf4 = cQf3;
                                    iG3 = e70Var.g();
                                    if (iJ3 != iJ2) {
                                        e70Var.v(iJ3);
                                        if (z4) {
                                            iMax3 = Math.max(iMax3, e70Var.e(qnHx2).b() + e70Var.k() + e70Var.L);
                                        }
                                        zA = true;
                                    }
                                    if (iG3 != iG2) {
                                        e70Var.s(iG3);
                                        if (z5) {
                                            iMax4 = Math.max(iMax4, e70Var.e(qnHx).b() + e70Var.l() + e70Var.M);
                                        }
                                        zA = true;
                                    }
                                    if (!e70Var.w) {
                                    }
                                }
                            } else if (e70Var.X == 8) {
                                arrayList2 = arrayList;
                                i28 = size2;
                                cQf4 = cQf3;
                            } else {
                                iJ2 = e70Var.j();
                                iG2 = e70Var.g();
                                arrayList2 = arrayList;
                                int i511111113 = e70Var.R;
                                i28 = size2;
                                zA |= f9Var2.a(cQf3, e70Var, true);
                                iJ3 = e70Var.j();
                                cQf4 = cQf3;
                                iG3 = e70Var.g();
                                if (iJ3 != iJ2) {
                                    e70Var.v(iJ3);
                                    if (z4) {
                                        iMax3 = Math.max(iMax3, e70Var.e(qnHx2).b() + e70Var.k() + e70Var.L);
                                    }
                                    zA = true;
                                }
                                if (iG3 != iG2) {
                                    e70Var.s(iG3);
                                    if (z5) {
                                        iMax4 = Math.max(iMax4, e70Var.e(qnHx).b() + e70Var.l() + e70Var.M);
                                    }
                                    zA = true;
                                }
                                if (!e70Var.w) {
                                }
                            }
                            i25++;
                            arrayList = arrayList2;
                            size2 = i28;
                            cQf3 = cQf4;
                        }
                        ArrayList<e70> arrayList110 = arrayList;
                        int i511111114 = size2;
                        f9.CQf cQf112 = cQf3;
                        if (zA) {
                            i26 = i19;
                            i27 = i20;
                            f70Var4 = f70Var3;
                            f9Var2.b(f70Var4, i26, i27);
                            zA = false;
                        } else {
                            i26 = i19;
                            i27 = i20;
                            f70Var4 = f70Var3;
                        }
                        i22++;
                        i19 = i26;
                        i20 = i27;
                        f70Var3 = f70Var4;
                        arrayList = arrayList110;
                        size2 = i511111114;
                        cQf3 = cQf112;
                    }
                    i23 = i19;
                    i24 = i20;
                    f70Var2 = f70Var3;
                    if (zA) {
                        f9Var2.b(f70Var2, i23, i24);
                        if (f70Var2.j() < iMax3) {
                            f70Var2.v(iMax3);
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (f70Var2.g() < iMax4) {
                            f70Var2.s(iMax4);
                            z7 = true;
                        } else {
                            z7 = z6;
                        }
                        if (z7) {
                            f9Var2.b(f70Var2, i23, i24);
                        }
                    }
                } else {
                    f70Var2 = f70Var;
                    i16 = i13;
                }
                i17 = i16;
                f70Var2.q0 = i17;
                if ((i17 & 256) == 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                o32.p = z3;
            }
            int iJ1111 = f70Var2.j();
            int iG18 = f70Var2.g();
            z11 = f70Var2.r0;
            z12 = f70Var2.s0;
            int i511111115 = cQf7.e;
            int iResolveSizeAndState15 = View.resolveSizeAndState(iJ1111 + cQf7.d, i, 0);
            int iResolveSizeAndState16 = View.resolveSizeAndState(iG18 + i511111115, i2, 0) & 16777215;
            iMin2 = Math.min(this.B, iResolveSizeAndState15 & 16777215);
            iMin3 = Math.min(this.C, iResolveSizeAndState16);
            if (z11) {
                iMin2 |= 16777216;
            }
            if (z12) {
                iMin3 |= 16777216;
            }
            setMeasuredDimension(iMin2, iMin3);
        }
        if (childCount2 == 0) {
            iMax2 = Math.max(0, this.A);
        } else {
            iMax2 = i48;
        }
        iMin = iMax2;
        i4 = 2;
        if (iMax == f70Var6.j()) {
            oj0Var2.c = true;
        } else {
            oj0Var2.c = true;
        }
        f70Var6.P = 0;
        f70Var6.Q = 0;
        int i511111116 = this.B - i50;
        iArr = f70Var6.u;
        iArr[0] = i511111116;
        iArr[1] = this.C - i49;
        f70Var6.S = 0;
        f70Var6.T = 0;
        f70Var6.t(i3);
        f70Var6.v(iMax);
        f70Var6.u(i4);
        f70Var6.s(iMin);
        i5 = this.z - i50;
        if (i5 < 0) {
            i6 = 0;
            f70Var6.S = 0;
        } else {
            i6 = 0;
            f70Var6.S = i5;
        }
        i7 = this.A - i49;
        if (i7 < 0) {
            f70Var6.T = i6;
        } else {
            f70Var6.T = i7;
        }
        f70Var6.k0 = iMax7;
        f70Var6.l0 = iMax5;
        f9Var4.getClass();
        cQf = f70Var6.h0;
        size = f70Var6.e0.size();
        iJ = f70Var6.j();
        iG = f70Var6.g();
        if ((i45 & 128) == 128) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            z2 = true;
        } else {
            if ((i45 & 64) == 64) {
                z21 = true;
            } else {
                z21 = false;
            }
            if (z21) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        if (z2) {
            i40 = 0;
            while (i40 < size) {
                e70Var7 = f70Var6.e0.get(i40);
                iArr4 = e70Var7.J;
                if (iArr4[0] == 3) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (iArr4[1] == 3) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (z18) {
                    z20 = false;
                } else {
                    z20 = false;
                }
                if (!e70Var7.o()) {
                }
                z2 = false;
                break;
            }
        }
        i8 = mode2;
        if (z2 && ((mode != 1073741824 && i8 == 1073741824) || z)) {
            int iMin14 = Math.min(iArr[0], i47);
            iMin4 = Math.min(iArr[1], i48);
            if (mode == 1073741824) {
                oj0Var = oj0Var2;
            } else {
                oj0Var = oj0Var2;
            }
            if (i8 == 1073741824) {
                f70Var6.s(iMin4);
                oj0Var.b = true;
            }
            if (mode == 1073741824) {
                cQf2 = cQf;
                i9 = size;
                f9Var = f9Var4;
                i10 = iJ;
                i11 = iG;
                i32 = i8;
                z13 = oj0Var.b;
                f70Var5 = oj0Var.a;
                if (z13) {
                    while (r0.hasNext()) {
                        e70Var9.a = false;
                        gd1 gd1Var1112 = e70Var9.d;
                        gd1Var1112.e.j = false;
                        gd1Var1112.g = false;
                        gd1Var1112.n();
                        wh5 wh5Var1112 = e70Var9.e;
                        wh5Var1112.e.j = false;
                        wh5Var1112.g = false;
                        wh5Var1112.m();
                    }
                    i33 = 0;
                    f70Var5.a = false;
                    gd1 gd1Var1113 = f70Var5.d;
                    gd1Var1113.e.j = false;
                    gd1Var1113.g = false;
                    gd1Var1113.n();
                    wh5 wh5Var1113 = f70Var5.e;
                    wh5Var1113.e.j = false;
                    wh5Var1113.g = false;
                    wh5Var1113.m();
                    oj0Var.c();
                } else {
                    i33 = 0;
                }
                oj0Var.b(oj0Var.d);
                f70Var5.P = i33;
                f70Var5.Q = i33;
                f70Var5.d.h.d(i33);
                f70Var5.e.h.d(i33);
                i34 = 1073741824;
                if (mode == 1073741824) {
                    f70Var = f70Var6;
                    i35 = 1;
                    zB = f70Var.B(i33, z) & true;
                    i12 = 1;
                } else {
                    f70Var = f70Var6;
                    i35 = 1;
                    zB = true;
                    i12 = 0;
                }
                if (i32 == 1073741824) {
                    zB &= f70Var.B(i35, z);
                    i12++;
                }
            } else {
                cQf2 = cQf;
                i9 = size;
                f9Var = f9Var4;
                i10 = iJ;
                i11 = iG;
                i32 = i8;
                z13 = oj0Var.b;
                f70Var5 = oj0Var.a;
                if (z13) {
                    while (r0.hasNext()) {
                        e70Var9.a = false;
                        gd1 gd1Var1114 = e70Var9.d;
                        gd1Var1114.e.j = false;
                        gd1Var1114.g = false;
                        gd1Var1114.n();
                        wh5 wh5Var1114 = e70Var9.e;
                        wh5Var1114.e.j = false;
                        wh5Var1114.g = false;
                        wh5Var1114.m();
                    }
                    i33 = 0;
                    f70Var5.a = false;
                    gd1 gd1Var1115 = f70Var5.d;
                    gd1Var1115.e.j = false;
                    gd1Var1115.g = false;
                    gd1Var1115.n();
                    wh5 wh5Var1115 = f70Var5.e;
                    wh5Var1115.e.j = false;
                    wh5Var1115.g = false;
                    wh5Var1115.m();
                    oj0Var.c();
                } else {
                    i33 = 0;
                }
                oj0Var.b(oj0Var.d);
                f70Var5.P = i33;
                f70Var5.Q = i33;
                f70Var5.d.h.d(i33);
                f70Var5.e.h.d(i33);
                i34 = 1073741824;
                if (mode == 1073741824) {
                    f70Var = f70Var6;
                    i35 = 1;
                    zB = f70Var.B(i33, z) & true;
                    i12 = 1;
                } else {
                    f70Var = f70Var6;
                    i35 = 1;
                    zB = true;
                    i12 = 0;
                }
                if (i32 == 1073741824) {
                    zB &= f70Var.B(i35, z);
                    i12++;
                }
            }
            if (zB) {
                if (mode == i34) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (i32 == i34) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                f70Var.w(z14, z15);
            }
        } else {
            cQf2 = cQf;
            i9 = size;
            f70Var = f70Var6;
            f9Var = f9Var4;
            i10 = iJ;
            i11 = iG;
            zB = false;
            i12 = 0;
        }
        if (zB) {
            if (i9 > 0) {
                size3 = f70Var.e0.size();
                cQf6 = f70Var.h0;
                i29 = 0;
                while (i29 < size3) {
                    e70Var6 = f70Var.e0.get(i29);
                    if (e70Var6 instanceof bb1) {
                        f9Var3 = f9Var;
                    } else {
                        iF = e70Var6.f(0);
                        int iF19 = e70Var6.f(1);
                        if (iF == 3) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            f9Var3 = f9Var;
                        } else {
                            f9Var3 = f9Var;
                            f9Var3.a(cQf6, e70Var6, false);
                        }
                    }
                    i29++;
                    f9Var = f9Var3;
                }
                f9Var2 = f9Var;
                constraintLayout = ((CQf) cQf6).a;
                childCount = constraintLayout.getChildCount();
                while (i30 < childCount) {
                    childAt = constraintLayout.getChildAt(i30);
                    if (childAt instanceof LPt8Fixed) {
                        lPt8 = (LPt8Fixed) childAt;
                        if (lPt8.x != null) {
                            QnHx qnHx19 = (QnHx) lPt8.getLayoutParams();
                            qnHx3 = (QnHx) lPt8.x.getLayoutParams();
                            e70Var3 = qnHx3.l0;
                            e70Var3.X = 0;
                            e70Var4 = qnHx19.l0;
                            if (e70Var4.J[0] != 1) {
                                e70Var4.v(e70Var3.j());
                            }
                            e70Var5 = qnHx19.l0;
                            if (e70Var5.J[1] != 1) {
                                e70Var5.s(qnHx3.l0.g());
                            }
                            qnHx3.l0.X = 8;
                        }
                    }
                }
                arrayList3 = constraintLayout.x;
                size4 = arrayList3.size();
                if (size4 > 0) {
                    while (i31 < size4) {
                        arrayList3.get(i31).getClass();
                    }
                }
            } else {
                f9Var2 = f9Var;
            }
            i13 = f70Var.q0;
            arrayList = f9Var2.a;
            size2 = arrayList.size();
            if (i9 > 0) {
                i14 = i10;
                i15 = i11;
                f9Var2.b(f70Var, i14, i15);
            } else {
                i14 = i10;
                i15 = i11;
            }
            if (size2 > 0) {
                iArr2 = f70Var.J;
                if (iArr2[0] == 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (iArr2[1] == 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                int iJ1112 = f70Var.j();
                f70 f70Var113 = f9Var2.c;
                iMax3 = Math.max(iJ1112, f70Var113.S);
                iMax4 = Math.max(f70Var.g(), f70Var113.T);
                i18 = 0;
                zA = false;
                while (true) {
                    qnHx = w60.QnHx.BOTTOM;
                    qnHx2 = w60.QnHx.RIGHT;
                    if (i18 >= size2) {
                        break;
                        break;
                    }
                    e70Var2 = arrayList.get(i18);
                    int i511111117 = i13;
                    if (e70Var2 instanceof gk5) {
                        cQf5 = cQf2;
                    } else {
                        iJ4 = e70Var2.j();
                        iG4 = e70Var2.g();
                        cQf5 = cQf2;
                        boolean zA17 = zA | f9Var2.a(cQf5, e70Var2, true);
                        iJ5 = e70Var2.j();
                        z8 = zA17;
                        iG5 = e70Var2.g();
                        if (iJ5 != iJ4) {
                            e70Var2.v(iJ5);
                            if (z4) {
                                iMax3 = Math.max(iMax3, e70Var2.e(qnHx2).b() + e70Var2.k() + e70Var2.L);
                            }
                            z8 = true;
                        }
                        if (iG5 != iG4) {
                            e70Var2.s(iG5);
                            if (z5) {
                                iMax4 = Math.max(iMax4, e70Var2.e(qnHx).b() + e70Var2.l() + e70Var2.M);
                            }
                            z9 = true;
                        } else {
                            z9 = z8;
                        }
                        zA = z9 | false;
                    }
                    i18++;
                    cQf2 = cQf5;
                    i13 = i511111117;
                    i14 = i14;
                    i15 = i15;
                    f70Var = f70Var;
                }
                f70Var3 = f70Var;
                i16 = i13;
                i19 = i14;
                i20 = i15;
                cQf3 = cQf2;
                i22 = 0;
                while (i22 < i21) {
                    i25 = 0;
                    while (i25 < size2) {
                        e70Var = arrayList.get(i25);
                        if (e70Var instanceof wc1) {
                            if (e70Var.X == 8) {
                                arrayList2 = arrayList;
                                i28 = size2;
                                cQf4 = cQf3;
                            } else {
                                iJ2 = e70Var.j();
                                iG2 = e70Var.g();
                                arrayList2 = arrayList;
                                int i511111118 = e70Var.R;
                                i28 = size2;
                                zA |= f9Var2.a(cQf3, e70Var, true);
                                iJ3 = e70Var.j();
                                cQf4 = cQf3;
                                iG3 = e70Var.g();
                                if (iJ3 != iJ2) {
                                    e70Var.v(iJ3);
                                    if (z4) {
                                        iMax3 = Math.max(iMax3, e70Var.e(qnHx2).b() + e70Var.k() + e70Var.L);
                                    }
                                    zA = true;
                                }
                                if (iG3 != iG2) {
                                    e70Var.s(iG3);
                                    if (z5) {
                                        iMax4 = Math.max(iMax4, e70Var.e(qnHx).b() + e70Var.l() + e70Var.M);
                                    }
                                    zA = true;
                                }
                                if (!e70Var.w) {
                                }
                            }
                        } else if (e70Var.X == 8) {
                            arrayList2 = arrayList;
                            i28 = size2;
                            cQf4 = cQf3;
                        } else {
                            iJ2 = e70Var.j();
                            iG2 = e70Var.g();
                            arrayList2 = arrayList;
                            int i511111119 = e70Var.R;
                            i28 = size2;
                            zA |= f9Var2.a(cQf3, e70Var, true);
                            iJ3 = e70Var.j();
                            cQf4 = cQf3;
                            iG3 = e70Var.g();
                            if (iJ3 != iJ2) {
                                e70Var.v(iJ3);
                                if (z4) {
                                    iMax3 = Math.max(iMax3, e70Var.e(qnHx2).b() + e70Var.k() + e70Var.L);
                                }
                                zA = true;
                            }
                            if (iG3 != iG2) {
                                e70Var.s(iG3);
                                if (z5) {
                                    iMax4 = Math.max(iMax4, e70Var.e(qnHx).b() + e70Var.l() + e70Var.M);
                                }
                                zA = true;
                            }
                            if (!e70Var.w) {
                            }
                        }
                        i25++;
                        arrayList = arrayList2;
                        size2 = i28;
                        cQf3 = cQf4;
                    }
                    ArrayList<e70> arrayList111 = arrayList;
                    int i5111111110 = size2;
                    f9.CQf cQf113 = cQf3;
                    if (zA) {
                        i26 = i19;
                        i27 = i20;
                        f70Var4 = f70Var3;
                        f9Var2.b(f70Var4, i26, i27);
                        zA = false;
                    } else {
                        i26 = i19;
                        i27 = i20;
                        f70Var4 = f70Var3;
                    }
                    i22++;
                    i19 = i26;
                    i20 = i27;
                    f70Var3 = f70Var4;
                    arrayList = arrayList111;
                    size2 = i5111111110;
                    cQf3 = cQf113;
                }
                i23 = i19;
                i24 = i20;
                f70Var2 = f70Var3;
                if (zA) {
                    f9Var2.b(f70Var2, i23, i24);
                    if (f70Var2.j() < iMax3) {
                        f70Var2.v(iMax3);
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (f70Var2.g() < iMax4) {
                        f70Var2.s(iMax4);
                        z7 = true;
                    } else {
                        z7 = z6;
                    }
                    if (z7) {
                        f9Var2.b(f70Var2, i23, i24);
                    }
                }
            } else {
                f70Var2 = f70Var;
                i16 = i13;
            }
            i17 = i16;
            f70Var2.q0 = i17;
            if ((i17 & 256) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            o32.p = z3;
        } else {
            if (i9 > 0) {
                size3 = f70Var.e0.size();
                cQf6 = f70Var.h0;
                i29 = 0;
                while (i29 < size3) {
                    e70Var6 = f70Var.e0.get(i29);
                    if (e70Var6 instanceof bb1) {
                        f9Var3 = f9Var;
                    } else {
                        iF = e70Var6.f(0);
                        int iF110 = e70Var6.f(1);
                        if (iF == 3) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            f9Var3 = f9Var;
                        } else {
                            f9Var3 = f9Var;
                            f9Var3.a(cQf6, e70Var6, false);
                        }
                    }
                    i29++;
                    f9Var = f9Var3;
                }
                f9Var2 = f9Var;
                constraintLayout = ((CQf) cQf6).a;
                childCount = constraintLayout.getChildCount();
                while (i30 < childCount) {
                    childAt = constraintLayout.getChildAt(i30);
                    if (childAt instanceof LPt8Fixed) {
                        lPt8 = (LPt8Fixed) childAt;
                        if (lPt8.x != null) {
                            QnHx qnHx110 = (QnHx) lPt8.getLayoutParams();
                            qnHx3 = (QnHx) lPt8.x.getLayoutParams();
                            e70Var3 = qnHx3.l0;
                            e70Var3.X = 0;
                            e70Var4 = qnHx110.l0;
                            if (e70Var4.J[0] != 1) {
                                e70Var4.v(e70Var3.j());
                            }
                            e70Var5 = qnHx110.l0;
                            if (e70Var5.J[1] != 1) {
                                e70Var5.s(qnHx3.l0.g());
                            }
                            qnHx3.l0.X = 8;
                        }
                    }
                }
                arrayList3 = constraintLayout.x;
                size4 = arrayList3.size();
                if (size4 > 0) {
                    while (i31 < size4) {
                        arrayList3.get(i31).getClass();
                    }
                }
            } else {
                f9Var2 = f9Var;
            }
            i13 = f70Var.q0;
            arrayList = f9Var2.a;
            size2 = arrayList.size();
            if (i9 > 0) {
                i14 = i10;
                i15 = i11;
                f9Var2.b(f70Var, i14, i15);
            } else {
                i14 = i10;
                i15 = i11;
            }
            if (size2 > 0) {
                iArr2 = f70Var.J;
                if (iArr2[0] == 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (iArr2[1] == 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                int iJ1113 = f70Var.j();
                f70 f70Var114 = f9Var2.c;
                iMax3 = Math.max(iJ1113, f70Var114.S);
                iMax4 = Math.max(f70Var.g(), f70Var114.T);
                i18 = 0;
                zA = false;
                while (true) {
                    qnHx = w60.QnHx.BOTTOM;
                    qnHx2 = w60.QnHx.RIGHT;
                    if (i18 >= size2) {
                        break;
                        break;
                    }
                    e70Var2 = arrayList.get(i18);
                    int i5111111111 = i13;
                    if (e70Var2 instanceof gk5) {
                        cQf5 = cQf2;
                    } else {
                        iJ4 = e70Var2.j();
                        iG4 = e70Var2.g();
                        cQf5 = cQf2;
                        boolean zA18 = zA | f9Var2.a(cQf5, e70Var2, true);
                        iJ5 = e70Var2.j();
                        z8 = zA18;
                        iG5 = e70Var2.g();
                        if (iJ5 != iJ4) {
                            e70Var2.v(iJ5);
                            if (z4) {
                                iMax3 = Math.max(iMax3, e70Var2.e(qnHx2).b() + e70Var2.k() + e70Var2.L);
                            }
                            z8 = true;
                        }
                        if (iG5 != iG4) {
                            e70Var2.s(iG5);
                            if (z5) {
                                iMax4 = Math.max(iMax4, e70Var2.e(qnHx).b() + e70Var2.l() + e70Var2.M);
                            }
                            z9 = true;
                        } else {
                            z9 = z8;
                        }
                        zA = z9 | false;
                    }
                    i18++;
                    cQf2 = cQf5;
                    i13 = i5111111111;
                    i14 = i14;
                    i15 = i15;
                    f70Var = f70Var;
                }
                f70Var3 = f70Var;
                i16 = i13;
                i19 = i14;
                i20 = i15;
                cQf3 = cQf2;
                i22 = 0;
                while (i22 < i21) {
                    i25 = 0;
                    while (i25 < size2) {
                        e70Var = arrayList.get(i25);
                        if (e70Var instanceof wc1) {
                            if (e70Var.X == 8) {
                                arrayList2 = arrayList;
                                i28 = size2;
                                cQf4 = cQf3;
                            } else {
                                iJ2 = e70Var.j();
                                iG2 = e70Var.g();
                                arrayList2 = arrayList;
                                int i5111111112 = e70Var.R;
                                i28 = size2;
                                zA |= f9Var2.a(cQf3, e70Var, true);
                                iJ3 = e70Var.j();
                                cQf4 = cQf3;
                                iG3 = e70Var.g();
                                if (iJ3 != iJ2) {
                                    e70Var.v(iJ3);
                                    if (z4) {
                                        iMax3 = Math.max(iMax3, e70Var.e(qnHx2).b() + e70Var.k() + e70Var.L);
                                    }
                                    zA = true;
                                }
                                if (iG3 != iG2) {
                                    e70Var.s(iG3);
                                    if (z5) {
                                        iMax4 = Math.max(iMax4, e70Var.e(qnHx).b() + e70Var.l() + e70Var.M);
                                    }
                                    zA = true;
                                }
                                if (!e70Var.w) {
                                }
                            }
                        } else if (e70Var.X == 8) {
                            arrayList2 = arrayList;
                            i28 = size2;
                            cQf4 = cQf3;
                        } else {
                            iJ2 = e70Var.j();
                            iG2 = e70Var.g();
                            arrayList2 = arrayList;
                            int i5111111113 = e70Var.R;
                            i28 = size2;
                            zA |= f9Var2.a(cQf3, e70Var, true);
                            iJ3 = e70Var.j();
                            cQf4 = cQf3;
                            iG3 = e70Var.g();
                            if (iJ3 != iJ2) {
                                e70Var.v(iJ3);
                                if (z4) {
                                    iMax3 = Math.max(iMax3, e70Var.e(qnHx2).b() + e70Var.k() + e70Var.L);
                                }
                                zA = true;
                            }
                            if (iG3 != iG2) {
                                e70Var.s(iG3);
                                if (z5) {
                                    iMax4 = Math.max(iMax4, e70Var.e(qnHx).b() + e70Var.l() + e70Var.M);
                                }
                                zA = true;
                            }
                            if (!e70Var.w) {
                            }
                        }
                        i25++;
                        arrayList = arrayList2;
                        size2 = i28;
                        cQf3 = cQf4;
                    }
                    ArrayList<e70> arrayList112 = arrayList;
                    int i5111111114 = size2;
                    f9.CQf cQf114 = cQf3;
                    if (zA) {
                        i26 = i19;
                        i27 = i20;
                        f70Var4 = f70Var3;
                        f9Var2.b(f70Var4, i26, i27);
                        zA = false;
                    } else {
                        i26 = i19;
                        i27 = i20;
                        f70Var4 = f70Var3;
                    }
                    i22++;
                    i19 = i26;
                    i20 = i27;
                    f70Var3 = f70Var4;
                    arrayList = arrayList112;
                    size2 = i5111111114;
                    cQf3 = cQf114;
                }
                i23 = i19;
                i24 = i20;
                f70Var2 = f70Var3;
                if (zA) {
                    f9Var2.b(f70Var2, i23, i24);
                    if (f70Var2.j() < iMax3) {
                        f70Var2.v(iMax3);
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (f70Var2.g() < iMax4) {
                        f70Var2.s(iMax4);
                        z7 = true;
                    } else {
                        z7 = z6;
                    }
                    if (z7) {
                        f9Var2.b(f70Var2, i23, i24);
                    }
                }
            } else {
                f70Var2 = f70Var;
                i16 = i13;
            }
            i17 = i16;
            f70Var2.q0 = i17;
            if ((i17 & 256) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            o32.p = z3;
        }
        int iJ1114 = f70Var2.j();
        int iG19 = f70Var2.g();
        z11 = f70Var2.r0;
        z12 = f70Var2.s0;
        int i5111111115 = cQf7.e;
        int iResolveSizeAndState17 = View.resolveSizeAndState(iJ1114 + cQf7.d, i, 0);
        int iResolveSizeAndState18 = View.resolveSizeAndState(iG19 + i5111111115, i2, 0) & 16777215;
        iMin2 = Math.min(this.B, iResolveSizeAndState17 & 16777215);
        iMin3 = Math.min(this.C, iResolveSizeAndState18);
        if (z11) {
            iMin2 |= 16777216;
        }
        if (z12) {
            iMin3 |= 16777216;
        }
        setMeasuredDimension(iMin2, iMin3);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        e70 e70VarB = b(view);
        if ((view instanceof Guideline) && !(e70VarB instanceof bb1)) {
            QnHx qnHx = (QnHx) view.getLayoutParams();
            bb1 bb1Var = new bb1();
            qnHx.l0 = bb1Var;
            qnHx.Y = true;
            bb1Var.y(qnHx.R);
        }
        if (view instanceof androidx.constraintlayout.widget.QnHx) {
            androidx.constraintlayout.widget.QnHx qnHx2 = (androidx.constraintlayout.widget.QnHx) view;
            qnHx2.g();
            ((QnHx) view.getLayoutParams()).Z = true;
            ArrayList<androidx.constraintlayout.widget.QnHx> arrayList = this.x;
            if (!arrayList.contains(qnHx2)) {
                arrayList.add(qnHx2);
            }
        }
        this.w.put(view.getId(), view);
        this.D = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.w.remove(view.getId());
        e70 e70VarB = b(view);
        this.y.e0.remove(e70VarB);
        e70VarB.K = null;
        this.x.remove(view);
        this.D = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.D = true;
        super.requestLayout();
    }

    public void setConstraintSet(androidx.constraintlayout.widget.CQf cQf) {
        this.F = cQf;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray<View> sparseArray = this.w;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.C) {
            return;
        }
        this.C = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.B) {
            return;
        }
        this.B = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.A) {
            return;
        }
        this.A = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.z) {
            return;
        }
        this.z = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(i70 i70Var) {
        z60 z60Var = this.G;
        if (z60Var != null) {
            z60Var.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.E = i;
        this.y.q0 = i;
        o32.p = (i & 256) == 256;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new QnHx(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.w = new SparseArray<>();
        this.x = new ArrayList<>(4);
        this.y = new f70();
        this.z = 0;
        this.A = 0;
        this.B = Integer.MAX_VALUE;
        this.C = Integer.MAX_VALUE;
        this.D = true;
        this.E = 263;
        this.F = null;
        this.G = null;
        this.H = -1;
        this.I = new HashMap<>();
        this.J = new SparseArray<>();
        this.K = new CQf(this);
        c(attributeSet, i);
    }

    public static class QnHx extends ViewGroup.MarginLayoutParams {
        public float A;
        public String B;
        public final int C;
        public float D;
        public float E;
        public int F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public float N;
        public float O;
        public int P;
        public int Q;
        public int R;
        public boolean S;
        public boolean T;
        public String U;
        public boolean V;
        public boolean W;
        public boolean X;
        public boolean Y;
        public boolean Z;
        public int a;
        public boolean a0;
        public int b;
        public int b0;
        public float c;
        public int c0;
        public int d;
        public int d0;
        public int e;
        public int e0;
        public int f;
        public int f0;
        public int g;
        public int g0;
        public int h;
        public float h0;
        public int i;
        public int i0;
        public int j;
        public int j0;
        public int k;
        public float k0;
        public int l;
        public e70 l0;
        public int m;
        public int n;
        public float o;
        public int p;
        public int q;
        public int r;
        public int s;
        public final int t;
        public int u;
        public final int v;
        public int w;
        public int x;
        public int y;
        public float z;

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$QnHx$QnHx, reason: collision with other inner class name */
        public static class C0022QnHx {
            public static final SparseIntArray a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                a = sparseIntArray;
                sparseIntArray.append(63, 8);
                sparseIntArray.append(64, 9);
                sparseIntArray.append(66, 10);
                sparseIntArray.append(67, 11);
                sparseIntArray.append(73, 12);
                sparseIntArray.append(72, 13);
                sparseIntArray.append(45, 14);
                sparseIntArray.append(44, 15);
                sparseIntArray.append(42, 16);
                sparseIntArray.append(46, 2);
                sparseIntArray.append(48, 3);
                sparseIntArray.append(47, 4);
                sparseIntArray.append(81, 49);
                sparseIntArray.append(82, 50);
                sparseIntArray.append(52, 5);
                sparseIntArray.append(53, 6);
                sparseIntArray.append(54, 7);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(68, 17);
                sparseIntArray.append(69, 18);
                sparseIntArray.append(51, 19);
                sparseIntArray.append(50, 20);
                sparseIntArray.append(85, 21);
                sparseIntArray.append(88, 22);
                sparseIntArray.append(86, 23);
                sparseIntArray.append(83, 24);
                sparseIntArray.append(87, 25);
                sparseIntArray.append(84, 26);
                sparseIntArray.append(59, 29);
                sparseIntArray.append(74, 30);
                sparseIntArray.append(49, 44);
                sparseIntArray.append(61, 45);
                sparseIntArray.append(76, 46);
                sparseIntArray.append(60, 47);
                sparseIntArray.append(75, 48);
                sparseIntArray.append(40, 27);
                sparseIntArray.append(39, 28);
                sparseIntArray.append(77, 31);
                sparseIntArray.append(55, 32);
                sparseIntArray.append(79, 33);
                sparseIntArray.append(78, 34);
                sparseIntArray.append(80, 35);
                sparseIntArray.append(57, 36);
                sparseIntArray.append(56, 37);
                sparseIntArray.append(58, 38);
                sparseIntArray.append(62, 39);
                sparseIntArray.append(71, 40);
                sparseIntArray.append(65, 41);
                sparseIntArray.append(43, 42);
                sparseIntArray.append(41, 43);
                sparseIntArray.append(70, 51);
            }
        }

        public QnHx(Context context, AttributeSet attributeSet) {
            int i;
            super(context, attributeSet);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = 0;
            this.o = 0.0f;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 1;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = 0;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 1.0f;
            this.O = 1.0f;
            this.P = -1;
            this.Q = -1;
            this.R = -1;
            this.S = false;
            this.T = false;
            this.U = null;
            this.V = true;
            this.W = true;
            this.X = false;
            this.Y = false;
            this.Z = false;
            this.a0 = false;
            this.b0 = -1;
            this.c0 = -1;
            this.d0 = -1;
            this.e0 = -1;
            this.f0 = -1;
            this.g0 = -1;
            this.h0 = 0.5f;
            this.l0 = new e70();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g7.y);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                int i3 = C0022QnHx.a.get(index);
                switch (i3) {
                    case 1:
                        this.R = typedArrayObtainStyledAttributes.getInt(index, this.R);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.m);
                        this.m = resourceId;
                        if (resourceId == -1) {
                            this.m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 3:
                        this.n = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.n);
                        break;
                    case 4:
                        float f = typedArrayObtainStyledAttributes.getFloat(index, this.o) % 360.0f;
                        this.o = f;
                        if (f < 0.0f) {
                            this.o = (360.0f - f) % 360.0f;
                        }
                        break;
                    case 5:
                        this.a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.a);
                        break;
                    case 6:
                        this.b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.b);
                        break;
                    case 7:
                        this.c = typedArrayObtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.d);
                        this.d = resourceId2;
                        if (resourceId2 == -1) {
                            this.d = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.e);
                        this.e = resourceId3;
                        if (resourceId3 == -1) {
                            this.e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f);
                        this.f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.g);
                        this.g = resourceId5;
                        if (resourceId5 == -1) {
                            this.g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.h);
                        this.h = resourceId6;
                        if (resourceId6 == -1) {
                            this.h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.i);
                        this.i = resourceId7;
                        if (resourceId7 == -1) {
                            this.i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.j);
                        this.j = resourceId8;
                        if (resourceId8 == -1) {
                            this.j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.k);
                        this.k = resourceId9;
                        if (resourceId9 == -1) {
                            this.k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.l);
                        this.l = resourceId10;
                        if (resourceId10 == -1) {
                            this.l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.p);
                        this.p = resourceId11;
                        if (resourceId11 == -1) {
                            this.p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.q);
                        this.q = resourceId12;
                        if (resourceId12 == -1) {
                            this.q = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.r);
                        this.r = resourceId13;
                        if (resourceId13 == -1) {
                            this.r = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.s);
                        this.s = resourceId14;
                        if (resourceId14 == -1) {
                            this.s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 21:
                        this.t = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.t);
                        break;
                    case 22:
                        this.u = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.u);
                        break;
                    case 23:
                        this.v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.v);
                        break;
                    case 24:
                        this.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.w);
                        break;
                    case 25:
                        this.x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.x);
                        break;
                    case 26:
                        this.y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.y);
                        break;
                    case 27:
                        this.S = typedArrayObtainStyledAttributes.getBoolean(index, this.S);
                        break;
                    case 28:
                        this.T = typedArrayObtainStyledAttributes.getBoolean(index, this.T);
                        break;
                    case 29:
                        this.z = typedArrayObtainStyledAttributes.getFloat(index, this.z);
                        break;
                    case 30:
                        this.A = typedArrayObtainStyledAttributes.getFloat(index, this.A);
                        break;
                    case 31:
                        int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.H = i4;
                        if (i4 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        }
                        break;
                    case 32:
                        int i5 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.I = i5;
                        if (i5 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        }
                        break;
                    case 33:
                        try {
                            this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.J) == -2) {
                                this.J = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.L) == -2) {
                                this.L = -2;
                            }
                        }
                        break;
                    case 35:
                        this.N = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.N));
                        this.H = 2;
                        break;
                    case 36:
                        try {
                            this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.K) == -2) {
                                this.K = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.M) == -2) {
                                this.M = -2;
                            }
                        }
                        break;
                    case 38:
                        this.O = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.O));
                        this.I = 2;
                        break;
                    default:
                        switch (i3) {
                            case 44:
                                String string = typedArrayObtainStyledAttributes.getString(index);
                                this.B = string;
                                this.C = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int iIndexOf = this.B.indexOf(44);
                                    if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                                        i = 0;
                                    } else {
                                        String strSubstring = this.B.substring(0, iIndexOf);
                                        if (strSubstring.equalsIgnoreCase("W")) {
                                            this.C = 0;
                                        } else if (strSubstring.equalsIgnoreCase("H")) {
                                            this.C = 1;
                                        }
                                        i = iIndexOf + 1;
                                    }
                                    int iIndexOf2 = this.B.indexOf(58);
                                    if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                                        String strSubstring2 = this.B.substring(i);
                                        if (strSubstring2.length() > 0) {
                                            Float.parseFloat(strSubstring2);
                                        }
                                    } else {
                                        String strSubstring3 = this.B.substring(i, iIndexOf2);
                                        String strSubstring4 = this.B.substring(iIndexOf2 + 1);
                                        if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                                            try {
                                                float f2 = Float.parseFloat(strSubstring3);
                                                float f3 = Float.parseFloat(strSubstring4);
                                                if (f2 > 0.0f && f3 > 0.0f) {
                                                    if (this.C == 1) {
                                                        Math.abs(f3 / f2);
                                                    } else {
                                                        Math.abs(f2 / f3);
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                            }
                                        }
                                    }
                                }
                                break;
                            case 45:
                                this.D = typedArrayObtainStyledAttributes.getFloat(index, this.D);
                                break;
                            case 46:
                                this.E = typedArrayObtainStyledAttributes.getFloat(index, this.E);
                                break;
                            case 47:
                                this.F = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.G = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.P = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.P);
                                break;
                            case 50:
                                this.Q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.Q);
                                break;
                            case 51:
                                this.U = typedArrayObtainStyledAttributes.getString(index);
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            a();
        }

        public final void a() {
            this.Y = false;
            this.V = true;
            this.W = true;
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == -2 && this.S) {
                this.V = false;
                if (this.H == 0) {
                    this.H = 1;
                }
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i2 == -2 && this.T) {
                this.W = false;
                if (this.I == 0) {
                    this.I = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.V = false;
                if (i == 0 && this.H == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.S = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.W = false;
                if (i2 == 0 && this.I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.T = true;
                }
            }
            if (this.c == -1.0f && this.a == -1 && this.b == -1) {
                return;
            }
            this.Y = true;
            this.V = true;
            this.W = true;
            if (!(this.l0 instanceof bb1)) {
                this.l0 = new bb1();
            }
            ((bb1) this.l0).y(this.R);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0048  */
        /* JADX WARN: Code duplicated, block: B:20:0x004f  */
        /* JADX WARN: Code duplicated, block: B:23:0x0056  */
        /* JADX WARN: Code duplicated, block: B:26:0x005c  */
        /* JADX WARN: Code duplicated, block: B:29:0x0062  */
        /* JADX WARN: Code duplicated, block: B:36:0x0074  */
        /* JADX WARN: Code duplicated, block: B:37:0x007c A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:38:0x007e  */
        /* JADX WARN: Code duplicated, block: B:39:0x0085 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:40:0x0087  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @TargetApi(17)
        public final void resolveLayoutDirection(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i7 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i);
            boolean z = false;
            boolean z2 = 1 == getLayoutDirection();
            this.d0 = -1;
            this.e0 = -1;
            this.b0 = -1;
            this.c0 = -1;
            this.f0 = this.t;
            this.g0 = this.v;
            float f = this.z;
            this.h0 = f;
            int i8 = this.a;
            this.i0 = i8;
            int i9 = this.b;
            this.j0 = i9;
            float f2 = this.c;
            this.k0 = f2;
            if (z2) {
                int i10 = this.p;
                if (i10 != -1) {
                    this.d0 = i10;
                } else {
                    int i11 = this.q;
                    if (i11 != -1) {
                        this.e0 = i11;
                    } else {
                        i2 = this.r;
                        if (i2 != -1) {
                            this.c0 = i2;
                            z = true;
                        }
                        i3 = this.s;
                        if (i3 != -1) {
                            this.b0 = i3;
                            z = true;
                        }
                        i4 = this.x;
                        if (i4 != -1) {
                            this.g0 = i4;
                        }
                        i5 = this.y;
                        if (i5 != -1) {
                            this.f0 = i5;
                        }
                        if (z) {
                            this.h0 = 1.0f - f;
                        }
                        if (this.Y && this.R == 1) {
                            if (f2 != -1.0f) {
                                this.k0 = 1.0f - f2;
                                this.i0 = -1;
                                this.j0 = -1;
                            } else if (i8 != -1) {
                                this.j0 = i8;
                                this.i0 = -1;
                                this.k0 = -1.0f;
                            } else if (i9 != -1) {
                                this.i0 = i9;
                                this.j0 = -1;
                                this.k0 = -1.0f;
                            }
                        }
                    }
                }
                z = true;
                i2 = this.r;
                if (i2 != -1) {
                    this.c0 = i2;
                    z = true;
                }
                i3 = this.s;
                if (i3 != -1) {
                    this.b0 = i3;
                    z = true;
                }
                i4 = this.x;
                if (i4 != -1) {
                    this.g0 = i4;
                }
                i5 = this.y;
                if (i5 != -1) {
                    this.f0 = i5;
                }
                if (z) {
                    this.h0 = 1.0f - f;
                }
                if (this.Y) {
                    if (f2 != -1.0f) {
                        this.k0 = 1.0f - f2;
                        this.i0 = -1;
                        this.j0 = -1;
                    } else if (i8 != -1) {
                        this.j0 = i8;
                        this.i0 = -1;
                        this.k0 = -1.0f;
                    } else if (i9 != -1) {
                        this.i0 = i9;
                        this.j0 = -1;
                        this.k0 = -1.0f;
                    }
                }
            } else {
                int i12 = this.p;
                if (i12 != -1) {
                    this.c0 = i12;
                }
                int i13 = this.q;
                if (i13 != -1) {
                    this.b0 = i13;
                }
                int i14 = this.r;
                if (i14 != -1) {
                    this.d0 = i14;
                }
                int i15 = this.s;
                if (i15 != -1) {
                    this.e0 = i15;
                }
                int i16 = this.x;
                if (i16 != -1) {
                    this.f0 = i16;
                }
                int i17 = this.y;
                if (i17 != -1) {
                    this.g0 = i17;
                }
            }
            if (this.r == -1 && this.s == -1 && this.q == -1 && this.p == -1) {
                int i18 = this.f;
                if (i18 != -1) {
                    this.d0 = i18;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                } else {
                    int i19 = this.g;
                    if (i19 != -1) {
                        this.e0 = i19;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                        }
                    }
                }
                int i20 = this.d;
                if (i20 != -1) {
                    this.b0 = i20;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                    return;
                }
                int i21 = this.e;
                if (i21 != -1) {
                    this.c0 = i21;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                }
            }
        }

        public QnHx() {
            super(-2, -2);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = 0;
            this.o = 0.0f;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 1;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = 0;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 1.0f;
            this.O = 1.0f;
            this.P = -1;
            this.Q = -1;
            this.R = -1;
            this.S = false;
            this.T = false;
            this.U = null;
            this.V = true;
            this.W = true;
            this.X = false;
            this.Y = false;
            this.Z = false;
            this.a0 = false;
            this.b0 = -1;
            this.c0 = -1;
            this.d0 = -1;
            this.e0 = -1;
            this.f0 = -1;
            this.g0 = -1;
            this.h0 = 0.5f;
            this.l0 = new e70();
        }

        public QnHx(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = 0;
            this.o = 0.0f;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 1;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = 0;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 1.0f;
            this.O = 1.0f;
            this.P = -1;
            this.Q = -1;
            this.R = -1;
            this.S = false;
            this.T = false;
            this.U = null;
            this.V = true;
            this.W = true;
            this.X = false;
            this.Y = false;
            this.Z = false;
            this.a0 = false;
            this.b0 = -1;
            this.c0 = -1;
            this.d0 = -1;
            this.e0 = -1;
            this.f0 = -1;
            this.g0 = -1;
            this.h0 = 0.5f;
            this.l0 = new e70();
        }
    }
}
