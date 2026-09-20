package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import com.google.ads.mediation.facebook.FacebookAdapter;
import defpackage.N;
import defpackage.O;
import defpackage.b70;
import defpackage.fXUx;
import defpackage.g7;
import defpackage.qh3;
import defpackage.x60;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class CQf {
    public static final int[] d = {0, 4, 8};
    public static final SparseIntArray e;
    public final HashMap<String, x60> a = new HashMap<>();
    public final boolean b = true;
    public final HashMap<Integer, QnHx> c = new HashMap<>();

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.CQf$CQf, reason: collision with other inner class name */
    public static class C0021CQf {
        public static final SparseIntArray j0;
        public int b;
        public int c;
        public int[] d0;
        public String e0;
        public String f0;
        public boolean a = false;
        public int d = -1;
        public int e = -1;
        public float f = -1.0f;
        public int g = -1;
        public int h = -1;
        public int i = -1;
        public int j = -1;
        public int k = -1;
        public int l = -1;
        public int m = -1;
        public int n = -1;
        public int o = -1;
        public int p = -1;
        public int q = -1;
        public int r = -1;
        public int s = -1;
        public float t = 0.5f;
        public float u = 0.5f;
        public String v = null;
        public int w = -1;
        public int x = 0;
        public float y = 0.0f;
        public int z = -1;
        public int A = -1;
        public int B = -1;
        public int C = -1;
        public int D = -1;
        public int E = -1;
        public int F = -1;
        public int G = -1;
        public int H = -1;
        public int I = -1;
        public int J = -1;
        public int K = -1;
        public int L = -1;
        public int M = -1;
        public int N = -1;
        public float O = -1.0f;
        public float P = -1.0f;
        public int Q = 0;
        public int R = 0;
        public int S = 0;
        public int T = 0;
        public int U = -1;
        public int V = -1;
        public int W = -1;
        public int X = -1;
        public float Y = 1.0f;
        public float Z = 1.0f;
        public int a0 = -1;
        public int b0 = 0;
        public int c0 = -1;
        public boolean g0 = false;
        public boolean h0 = false;
        public boolean i0 = true;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            j0 = sparseIntArray;
            sparseIntArray.append(38, 24);
            sparseIntArray.append(39, 25);
            sparseIntArray.append(41, 28);
            sparseIntArray.append(42, 29);
            sparseIntArray.append(47, 35);
            sparseIntArray.append(46, 34);
            sparseIntArray.append(20, 4);
            sparseIntArray.append(19, 3);
            sparseIntArray.append(17, 1);
            sparseIntArray.append(55, 6);
            sparseIntArray.append(56, 7);
            sparseIntArray.append(27, 17);
            sparseIntArray.append(28, 18);
            sparseIntArray.append(29, 19);
            sparseIntArray.append(0, 26);
            sparseIntArray.append(43, 31);
            sparseIntArray.append(44, 32);
            sparseIntArray.append(26, 10);
            sparseIntArray.append(25, 9);
            sparseIntArray.append(59, 13);
            sparseIntArray.append(62, 16);
            sparseIntArray.append(60, 14);
            sparseIntArray.append(57, 11);
            sparseIntArray.append(61, 15);
            sparseIntArray.append(58, 12);
            sparseIntArray.append(50, 38);
            sparseIntArray.append(36, 37);
            sparseIntArray.append(35, 39);
            sparseIntArray.append(49, 40);
            sparseIntArray.append(34, 20);
            sparseIntArray.append(48, 36);
            sparseIntArray.append(24, 5);
            sparseIntArray.append(37, 76);
            sparseIntArray.append(45, 76);
            sparseIntArray.append(40, 76);
            sparseIntArray.append(18, 76);
            sparseIntArray.append(16, 76);
            sparseIntArray.append(3, 23);
            sparseIntArray.append(5, 27);
            sparseIntArray.append(7, 30);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(4, 33);
            sparseIntArray.append(6, 2);
            sparseIntArray.append(1, 22);
            sparseIntArray.append(2, 21);
            sparseIntArray.append(21, 61);
            sparseIntArray.append(23, 62);
            sparseIntArray.append(22, 63);
            sparseIntArray.append(54, 69);
            sparseIntArray.append(33, 70);
            sparseIntArray.append(12, 71);
            sparseIntArray.append(10, 72);
            sparseIntArray.append(11, 73);
            sparseIntArray.append(13, 74);
            sparseIntArray.append(9, 75);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g7.B);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                SparseIntArray sparseIntArray = j0;
                int i2 = sparseIntArray.get(index);
                if (i2 == 80) {
                    this.g0 = typedArrayObtainStyledAttributes.getBoolean(index, this.g0);
                } else if (i2 != 81) {
                    switch (i2) {
                        case 1:
                            this.o = CQf.f(typedArrayObtainStyledAttributes, index, this.o);
                            break;
                        case 2:
                            this.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.F);
                            break;
                        case 3:
                            this.n = CQf.f(typedArrayObtainStyledAttributes, index, this.n);
                            break;
                        case 4:
                            this.m = CQf.f(typedArrayObtainStyledAttributes, index, this.m);
                            break;
                        case 5:
                            this.v = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.z = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.z);
                            break;
                        case 7:
                            this.A = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.A);
                            break;
                        case 8:
                            this.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.G);
                            break;
                        case 9:
                            this.s = CQf.f(typedArrayObtainStyledAttributes, index, this.s);
                            break;
                        case 10:
                            this.r = CQf.f(typedArrayObtainStyledAttributes, index, this.r);
                            break;
                        case 11:
                            this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            break;
                        case 12:
                            this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            break;
                        case 13:
                            this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.I);
                            break;
                        case 14:
                            this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            break;
                        case 15:
                            this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            break;
                        case 16:
                            this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.J);
                            break;
                        case 17:
                            this.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.d);
                            break;
                        case 18:
                            this.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                            break;
                        case 19:
                            this.f = typedArrayObtainStyledAttributes.getFloat(index, this.f);
                            break;
                        case 20:
                            this.t = typedArrayObtainStyledAttributes.getFloat(index, this.t);
                            break;
                        case 21:
                            this.c = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.c);
                            break;
                        case 22:
                            this.b = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.b);
                            break;
                        case 23:
                            this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.C);
                            break;
                        case 24:
                            this.g = CQf.f(typedArrayObtainStyledAttributes, index, this.g);
                            break;
                        case 25:
                            this.h = CQf.f(typedArrayObtainStyledAttributes, index, this.h);
                            break;
                        case 26:
                            this.B = typedArrayObtainStyledAttributes.getInt(index, this.B);
                            break;
                        case 27:
                            this.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.D);
                            break;
                        case 28:
                            this.i = CQf.f(typedArrayObtainStyledAttributes, index, this.i);
                            break;
                        case 29:
                            this.j = CQf.f(typedArrayObtainStyledAttributes, index, this.j);
                            break;
                        case 30:
                            this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.H);
                            break;
                        case 31:
                            this.p = CQf.f(typedArrayObtainStyledAttributes, index, this.p);
                            break;
                        case 32:
                            this.q = CQf.f(typedArrayObtainStyledAttributes, index, this.q);
                            break;
                        case 33:
                            this.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.E);
                            break;
                        case 34:
                            this.l = CQf.f(typedArrayObtainStyledAttributes, index, this.l);
                            break;
                        case 35:
                            this.k = CQf.f(typedArrayObtainStyledAttributes, index, this.k);
                            break;
                        case 36:
                            this.u = typedArrayObtainStyledAttributes.getFloat(index, this.u);
                            break;
                        case 37:
                            this.P = typedArrayObtainStyledAttributes.getFloat(index, this.P);
                            break;
                        case 38:
                            this.O = typedArrayObtainStyledAttributes.getFloat(index, this.O);
                            break;
                        case 39:
                            this.Q = typedArrayObtainStyledAttributes.getInt(index, this.Q);
                            break;
                        case 40:
                            this.R = typedArrayObtainStyledAttributes.getInt(index, this.R);
                            break;
                        default:
                            switch (i2) {
                                case 54:
                                    this.S = typedArrayObtainStyledAttributes.getInt(index, this.S);
                                    break;
                                case 55:
                                    this.T = typedArrayObtainStyledAttributes.getInt(index, this.T);
                                    break;
                                case 56:
                                    this.U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.U);
                                    break;
                                case 57:
                                    this.V = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.V);
                                    break;
                                case 58:
                                    this.W = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.W);
                                    break;
                                case 59:
                                    this.X = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.X);
                                    break;
                                default:
                                    switch (i2) {
                                        case 61:
                                            this.w = CQf.f(typedArrayObtainStyledAttributes, index, this.w);
                                            break;
                                        case 62:
                                            this.x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.x);
                                            break;
                                        case 63:
                                            this.y = typedArrayObtainStyledAttributes.getFloat(index, this.y);
                                            break;
                                        default:
                                            switch (i2) {
                                                case 69:
                                                    this.Y = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 70:
                                                    this.Z = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    break;
                                                case 72:
                                                    this.a0 = typedArrayObtainStyledAttributes.getInt(index, this.a0);
                                                    break;
                                                case 73:
                                                    this.b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.b0);
                                                    break;
                                                case 74:
                                                    this.e0 = typedArrayObtainStyledAttributes.getString(index);
                                                    break;
                                                case 75:
                                                    this.i0 = typedArrayObtainStyledAttributes.getBoolean(index, this.i0);
                                                    break;
                                                case 76:
                                                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                                    break;
                                                case 77:
                                                    this.f0 = typedArrayObtainStyledAttributes.getString(index);
                                                    break;
                                                default:
                                                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    this.h0 = typedArrayObtainStyledAttributes.getBoolean(index, this.h0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class F1 {
        public static final SparseIntArray e;
        public int a = -1;
        public int b = -1;
        public float c = Float.NaN;
        public float d = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            e = sparseIntArray;
            sparseIntArray.append(2, 1);
            sparseIntArray.append(4, 2);
            sparseIntArray.append(5, 3);
            sparseIntArray.append(1, 4);
            sparseIntArray.append(0, 5);
            sparseIntArray.append(3, 6);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g7.C);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (e.get(index)) {
                    case 1:
                        this.d = typedArrayObtainStyledAttributes.getFloat(index, this.d);
                        break;
                    case 2:
                        this.b = typedArrayObtainStyledAttributes.getInt(index, this.b);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            String str = fXUx.w[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.a = CQf.f(typedArrayObtainStyledAttributes, index, this.a);
                        break;
                    case 6:
                        this.c = typedArrayObtainStyledAttributes.getFloat(index, this.c);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class LPt8Fixed {
        public int a = 0;
        public int b = 0;
        public float c = 1.0f;
        public float d = Float.NaN;

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g7.D);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.c = typedArrayObtainStyledAttributes.getFloat(index, this.c);
                } else if (index == 0) {
                    int i2 = typedArrayObtainStyledAttributes.getInt(index, this.a);
                    this.a = i2;
                    this.a = CQf.d[i2];
                } else if (index == 4) {
                    this.b = typedArrayObtainStyledAttributes.getInt(index, this.b);
                } else if (index == 3) {
                    this.d = typedArrayObtainStyledAttributes.getFloat(index, this.d);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class NUlFixed {
        public static final SparseIntArray m;
        public float a = 0.0f;
        public float b = 0.0f;
        public float c = 0.0f;
        public float d = 1.0f;
        public float e = 1.0f;
        public float f = Float.NaN;
        public float g = Float.NaN;
        public float h = 0.0f;
        public float i = 0.0f;
        public float j = 0.0f;
        public boolean k = false;
        public float l = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            m = sparseIntArray;
            sparseIntArray.append(6, 1);
            sparseIntArray.append(7, 2);
            sparseIntArray.append(8, 3);
            sparseIntArray.append(4, 4);
            sparseIntArray.append(5, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(1, 7);
            sparseIntArray.append(2, 8);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(9, 10);
            sparseIntArray.append(10, 11);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g7.F);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (m.get(index)) {
                    case 1:
                        this.a = typedArrayObtainStyledAttributes.getFloat(index, this.a);
                        break;
                    case 2:
                        this.b = typedArrayObtainStyledAttributes.getFloat(index, this.b);
                        break;
                    case 3:
                        this.c = typedArrayObtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case 4:
                        this.d = typedArrayObtainStyledAttributes.getFloat(index, this.d);
                        break;
                    case 5:
                        this.e = typedArrayObtainStyledAttributes.getFloat(index, this.e);
                        break;
                    case 6:
                        this.f = typedArrayObtainStyledAttributes.getDimension(index, this.f);
                        break;
                    case 7:
                        this.g = typedArrayObtainStyledAttributes.getDimension(index, this.g);
                        break;
                    case 8:
                        this.h = typedArrayObtainStyledAttributes.getDimension(index, this.h);
                        break;
                    case 9:
                        this.i = typedArrayObtainStyledAttributes.getDimension(index, this.i);
                        break;
                    case 10:
                        this.j = typedArrayObtainStyledAttributes.getDimension(index, this.j);
                        break;
                    case 11:
                        this.k = true;
                        this.l = typedArrayObtainStyledAttributes.getDimension(index, this.l);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class QnHx {
        public int a;
        public final LPt8Fixed b = new LPt8Fixed();
        public final F1 c = new F1();
        public final C0021CQf d = new C0021CQf();
        public final NUlFixed e = new NUlFixed();
        public HashMap<String, x60> f = new HashMap<>();

        public final void a(ConstraintLayout.QnHx qnHx) {
            C0021CQf c0021CQf = this.d;
            qnHx.d = c0021CQf.g;
            qnHx.e = c0021CQf.h;
            qnHx.f = c0021CQf.i;
            qnHx.g = c0021CQf.j;
            qnHx.h = c0021CQf.k;
            qnHx.i = c0021CQf.l;
            qnHx.j = c0021CQf.m;
            qnHx.k = c0021CQf.n;
            qnHx.l = c0021CQf.o;
            qnHx.p = c0021CQf.p;
            qnHx.q = c0021CQf.q;
            qnHx.r = c0021CQf.r;
            qnHx.s = c0021CQf.s;
            ((ViewGroup.MarginLayoutParams) qnHx).leftMargin = c0021CQf.C;
            ((ViewGroup.MarginLayoutParams) qnHx).rightMargin = c0021CQf.D;
            ((ViewGroup.MarginLayoutParams) qnHx).topMargin = c0021CQf.E;
            ((ViewGroup.MarginLayoutParams) qnHx).bottomMargin = c0021CQf.F;
            qnHx.x = c0021CQf.N;
            qnHx.y = c0021CQf.M;
            qnHx.u = c0021CQf.J;
            qnHx.w = c0021CQf.L;
            qnHx.z = c0021CQf.t;
            qnHx.A = c0021CQf.u;
            qnHx.m = c0021CQf.w;
            qnHx.n = c0021CQf.x;
            qnHx.o = c0021CQf.y;
            qnHx.B = c0021CQf.v;
            qnHx.P = c0021CQf.z;
            qnHx.Q = c0021CQf.A;
            qnHx.E = c0021CQf.O;
            qnHx.D = c0021CQf.P;
            qnHx.G = c0021CQf.R;
            qnHx.F = c0021CQf.Q;
            qnHx.S = c0021CQf.g0;
            qnHx.T = c0021CQf.h0;
            qnHx.H = c0021CQf.S;
            qnHx.I = c0021CQf.T;
            qnHx.L = c0021CQf.U;
            qnHx.M = c0021CQf.V;
            qnHx.J = c0021CQf.W;
            qnHx.K = c0021CQf.X;
            qnHx.N = c0021CQf.Y;
            qnHx.O = c0021CQf.Z;
            qnHx.R = c0021CQf.B;
            qnHx.c = c0021CQf.f;
            qnHx.a = c0021CQf.d;
            qnHx.b = c0021CQf.e;
            ((ViewGroup.MarginLayoutParams) qnHx).width = c0021CQf.b;
            ((ViewGroup.MarginLayoutParams) qnHx).height = c0021CQf.c;
            String str = c0021CQf.f0;
            if (str != null) {
                qnHx.U = str;
            }
            qnHx.setMarginStart(c0021CQf.H);
            qnHx.setMarginEnd(c0021CQf.G);
            qnHx.a();
        }

        public final void b(int i, ConstraintLayout.QnHx qnHx) {
            this.a = i;
            int i2 = qnHx.d;
            C0021CQf c0021CQf = this.d;
            c0021CQf.g = i2;
            c0021CQf.h = qnHx.e;
            c0021CQf.i = qnHx.f;
            c0021CQf.j = qnHx.g;
            c0021CQf.k = qnHx.h;
            c0021CQf.l = qnHx.i;
            c0021CQf.m = qnHx.j;
            c0021CQf.n = qnHx.k;
            c0021CQf.o = qnHx.l;
            c0021CQf.p = qnHx.p;
            c0021CQf.q = qnHx.q;
            c0021CQf.r = qnHx.r;
            c0021CQf.s = qnHx.s;
            c0021CQf.t = qnHx.z;
            c0021CQf.u = qnHx.A;
            c0021CQf.v = qnHx.B;
            c0021CQf.w = qnHx.m;
            c0021CQf.x = qnHx.n;
            c0021CQf.y = qnHx.o;
            c0021CQf.z = qnHx.P;
            c0021CQf.A = qnHx.Q;
            c0021CQf.B = qnHx.R;
            c0021CQf.f = qnHx.c;
            c0021CQf.d = qnHx.a;
            c0021CQf.e = qnHx.b;
            c0021CQf.b = ((ViewGroup.MarginLayoutParams) qnHx).width;
            c0021CQf.c = ((ViewGroup.MarginLayoutParams) qnHx).height;
            c0021CQf.C = ((ViewGroup.MarginLayoutParams) qnHx).leftMargin;
            c0021CQf.D = ((ViewGroup.MarginLayoutParams) qnHx).rightMargin;
            c0021CQf.E = ((ViewGroup.MarginLayoutParams) qnHx).topMargin;
            c0021CQf.F = ((ViewGroup.MarginLayoutParams) qnHx).bottomMargin;
            c0021CQf.O = qnHx.E;
            c0021CQf.P = qnHx.D;
            c0021CQf.R = qnHx.G;
            c0021CQf.Q = qnHx.F;
            c0021CQf.g0 = qnHx.S;
            c0021CQf.h0 = qnHx.T;
            c0021CQf.S = qnHx.H;
            c0021CQf.T = qnHx.I;
            c0021CQf.U = qnHx.L;
            c0021CQf.V = qnHx.M;
            c0021CQf.W = qnHx.J;
            c0021CQf.X = qnHx.K;
            c0021CQf.Y = qnHx.N;
            c0021CQf.Z = qnHx.O;
            c0021CQf.f0 = qnHx.U;
            c0021CQf.J = qnHx.u;
            c0021CQf.L = qnHx.w;
            c0021CQf.I = qnHx.t;
            c0021CQf.K = qnHx.v;
            c0021CQf.N = qnHx.x;
            c0021CQf.M = qnHx.y;
            c0021CQf.G = qnHx.getMarginEnd();
            c0021CQf.H = qnHx.getMarginStart();
        }

        public final void c(int i, androidx.constraintlayout.widget.F1.QnHx qnHx) {
            b(i, qnHx);
            this.b.c = qnHx.m0;
            float f = qnHx.p0;
            NUlFixed nUl = this.e;
            nUl.a = f;
            nUl.b = qnHx.q0;
            nUl.c = qnHx.r0;
            nUl.d = qnHx.s0;
            nUl.e = qnHx.t0;
            nUl.f = qnHx.u0;
            nUl.g = qnHx.v0;
            nUl.h = qnHx.w0;
            nUl.i = qnHx.x0;
            nUl.j = qnHx.y0;
            nUl.l = qnHx.o0;
            nUl.k = qnHx.n0;
        }

        public final Object clone() {
            QnHx qnHx = new QnHx();
            C0021CQf c0021CQf = qnHx.d;
            c0021CQf.getClass();
            C0021CQf c0021CQf2 = this.d;
            c0021CQf.a = c0021CQf2.a;
            c0021CQf.b = c0021CQf2.b;
            c0021CQf.c = c0021CQf2.c;
            c0021CQf.d = c0021CQf2.d;
            c0021CQf.e = c0021CQf2.e;
            c0021CQf.f = c0021CQf2.f;
            c0021CQf.g = c0021CQf2.g;
            c0021CQf.h = c0021CQf2.h;
            c0021CQf.i = c0021CQf2.i;
            c0021CQf.j = c0021CQf2.j;
            c0021CQf.k = c0021CQf2.k;
            c0021CQf.l = c0021CQf2.l;
            c0021CQf.m = c0021CQf2.m;
            c0021CQf.n = c0021CQf2.n;
            c0021CQf.o = c0021CQf2.o;
            c0021CQf.p = c0021CQf2.p;
            c0021CQf.q = c0021CQf2.q;
            c0021CQf.r = c0021CQf2.r;
            c0021CQf.s = c0021CQf2.s;
            c0021CQf.t = c0021CQf2.t;
            c0021CQf.u = c0021CQf2.u;
            c0021CQf.v = c0021CQf2.v;
            c0021CQf.w = c0021CQf2.w;
            c0021CQf.x = c0021CQf2.x;
            c0021CQf.y = c0021CQf2.y;
            c0021CQf.z = c0021CQf2.z;
            c0021CQf.A = c0021CQf2.A;
            c0021CQf.B = c0021CQf2.B;
            c0021CQf.C = c0021CQf2.C;
            c0021CQf.D = c0021CQf2.D;
            c0021CQf.E = c0021CQf2.E;
            c0021CQf.F = c0021CQf2.F;
            c0021CQf.G = c0021CQf2.G;
            c0021CQf.H = c0021CQf2.H;
            c0021CQf.I = c0021CQf2.I;
            c0021CQf.J = c0021CQf2.J;
            c0021CQf.K = c0021CQf2.K;
            c0021CQf.L = c0021CQf2.L;
            c0021CQf.M = c0021CQf2.M;
            c0021CQf.N = c0021CQf2.N;
            c0021CQf.O = c0021CQf2.O;
            c0021CQf.P = c0021CQf2.P;
            c0021CQf.Q = c0021CQf2.Q;
            c0021CQf.R = c0021CQf2.R;
            c0021CQf.S = c0021CQf2.S;
            c0021CQf.T = c0021CQf2.T;
            c0021CQf.U = c0021CQf2.U;
            c0021CQf.V = c0021CQf2.V;
            c0021CQf.W = c0021CQf2.W;
            c0021CQf.X = c0021CQf2.X;
            c0021CQf.Y = c0021CQf2.Y;
            c0021CQf.Z = c0021CQf2.Z;
            c0021CQf.a0 = c0021CQf2.a0;
            c0021CQf.b0 = c0021CQf2.b0;
            c0021CQf.c0 = c0021CQf2.c0;
            c0021CQf.f0 = c0021CQf2.f0;
            int[] iArr = c0021CQf2.d0;
            if (iArr != null) {
                c0021CQf.d0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                c0021CQf.d0 = null;
            }
            c0021CQf.e0 = c0021CQf2.e0;
            c0021CQf.g0 = c0021CQf2.g0;
            c0021CQf.h0 = c0021CQf2.h0;
            c0021CQf.i0 = c0021CQf2.i0;
            F1 f1 = qnHx.c;
            f1.getClass();
            F1 f2 = this.c;
            f2.getClass();
            f1.a = f2.a;
            f1.b = f2.b;
            f1.d = f2.d;
            f1.c = f2.c;
            LPt8Fixed lPt8 = qnHx.b;
            lPt8.getClass();
            LPt8Fixed lPt9 = this.b;
            lPt9.getClass();
            lPt8.a = lPt9.a;
            lPt8.c = lPt9.c;
            lPt8.d = lPt9.d;
            lPt8.b = lPt9.b;
            NUlFixed nUl = qnHx.e;
            nUl.getClass();
            NUlFixed nUl2 = this.e;
            nUl2.getClass();
            nUl.a = nUl2.a;
            nUl.b = nUl2.b;
            nUl.c = nUl2.c;
            nUl.d = nUl2.d;
            nUl.e = nUl2.e;
            nUl.f = nUl2.f;
            nUl.g = nUl2.g;
            nUl.h = nUl2.h;
            nUl.i = nUl2.i;
            nUl.j = nUl2.j;
            nUl.k = nUl2.k;
            nUl.l = nUl2.l;
            qnHx.a = this.a;
            return qnHx;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e = sparseIntArray;
        sparseIntArray.append(76, 25);
        sparseIntArray.append(77, 26);
        sparseIntArray.append(79, 29);
        sparseIntArray.append(80, 30);
        sparseIntArray.append(86, 36);
        sparseIntArray.append(85, 35);
        sparseIntArray.append(58, 4);
        sparseIntArray.append(57, 3);
        sparseIntArray.append(55, 1);
        sparseIntArray.append(94, 6);
        sparseIntArray.append(95, 7);
        sparseIntArray.append(65, 17);
        sparseIntArray.append(66, 18);
        sparseIntArray.append(67, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(81, 32);
        sparseIntArray.append(82, 33);
        sparseIntArray.append(64, 10);
        sparseIntArray.append(63, 9);
        sparseIntArray.append(98, 13);
        sparseIntArray.append(101, 16);
        sparseIntArray.append(99, 14);
        sparseIntArray.append(96, 11);
        sparseIntArray.append(100, 15);
        sparseIntArray.append(97, 12);
        sparseIntArray.append(89, 40);
        sparseIntArray.append(74, 39);
        sparseIntArray.append(73, 41);
        sparseIntArray.append(88, 42);
        sparseIntArray.append(72, 20);
        sparseIntArray.append(87, 37);
        sparseIntArray.append(62, 5);
        sparseIntArray.append(75, 82);
        sparseIntArray.append(84, 82);
        sparseIntArray.append(78, 82);
        sparseIntArray.append(56, 82);
        sparseIntArray.append(54, 82);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(90, 54);
        sparseIntArray.append(68, 55);
        sparseIntArray.append(91, 56);
        sparseIntArray.append(69, 57);
        sparseIntArray.append(92, 58);
        sparseIntArray.append(70, 59);
        sparseIntArray.append(59, 61);
        sparseIntArray.append(61, 62);
        sparseIntArray.append(60, 63);
        sparseIntArray.append(27, 64);
        sparseIntArray.append(106, 65);
        sparseIntArray.append(33, 66);
        sparseIntArray.append(107, 67);
        sparseIntArray.append(103, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(102, 68);
        sparseIntArray.append(93, 69);
        sparseIntArray.append(71, 70);
        sparseIntArray.append(31, 71);
        sparseIntArray.append(29, 72);
        sparseIntArray.append(30, 73);
        sparseIntArray.append(32, 74);
        sparseIntArray.append(28, 75);
        sparseIntArray.append(104, 76);
        sparseIntArray.append(83, 77);
        sparseIntArray.append(108, 78);
        sparseIntArray.append(53, 80);
        sparseIntArray.append(52, 81);
    }

    public static int[] c(Barrier barrier, String str) {
        int iIntValue;
        HashMap<String, Integer> map;
        String[] strArrSplit = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            Integer num = null;
            try {
                iIntValue = qh3.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, FacebookAdapter.KEY_ID, context.getPackageName());
            }
            if (iIntValue == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                constraintLayout.getClass();
                if ((strTrim instanceof String) && (map = constraintLayout.I) != null && map.containsKey(strTrim)) {
                    num = constraintLayout.I.get(strTrim);
                }
                if (num != null && (num instanceof Integer)) {
                    iIntValue = num.intValue();
                }
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    public static QnHx d(Context context, AttributeSet attributeSet) {
        QnHx qnHx = new QnHx();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g7.x);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            LPt8Fixed lPt8 = qnHx.b;
            F1 f1 = qnHx.c;
            NUlFixed nUl = qnHx.e;
            C0021CQf c0021CQf = qnHx.d;
            if (index != 1 && 23 != index && 24 != index) {
                f1.getClass();
                c0021CQf.getClass();
                lPt8.getClass();
                nUl.getClass();
            }
            SparseIntArray sparseIntArray = e;
            switch (sparseIntArray.get(index)) {
                case 1:
                    c0021CQf.o = f(typedArrayObtainStyledAttributes, index, c0021CQf.o);
                    break;
                case 2:
                    c0021CQf.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0021CQf.F);
                    break;
                case 3:
                    c0021CQf.n = f(typedArrayObtainStyledAttributes, index, c0021CQf.n);
                    break;
                case 4:
                    c0021CQf.m = f(typedArrayObtainStyledAttributes, index, c0021CQf.m);
                    break;
                case 5:
                    c0021CQf.v = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 6:
                    c0021CQf.z = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0021CQf.z);
                    break;
                case 7:
                    c0021CQf.A = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0021CQf.A);
                    break;
                case 8:
                    c0021CQf.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0021CQf.G);
                    break;
                case 9:
                    c0021CQf.s = f(typedArrayObtainStyledAttributes, index, c0021CQf.s);
                    break;
                case 10:
                    c0021CQf.r = f(typedArrayObtainStyledAttributes, index, c0021CQf.r);
                    break;
                case 11:
                    c0021CQf.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0021CQf.L);
                    break;
                case 12:
                    c0021CQf.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0021CQf.M);
                    break;
                case 13:
                    c0021CQf.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0021CQf.I);
                    break;
                case 14:
                    c0021CQf.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0021CQf.K);
                    break;
                case 15:
                    c0021CQf.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0021CQf.N);
                    break;
                case 16:
                    c0021CQf.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0021CQf.J);
                    break;
                case 17:
                    c0021CQf.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0021CQf.d);
                    break;
                case 18:
                    c0021CQf.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0021CQf.e);
                    break;
                case 19:
                    c0021CQf.f = typedArrayObtainStyledAttributes.getFloat(index, c0021CQf.f);
                    break;
                case 20:
                    c0021CQf.t = typedArrayObtainStyledAttributes.getFloat(index, c0021CQf.t);
                    break;
                case 21:
                    c0021CQf.c = typedArrayObtainStyledAttributes.getLayoutDimension(index, c0021CQf.c);
                    break;
                case 22:
                    lPt8.a = d[typedArrayObtainStyledAttributes.getInt(index, lPt8.a)];
                    break;
                case 23:
                    c0021CQf.b = typedArrayObtainStyledAttributes.getLayoutDimension(index, c0021CQf.b);
                    break;
                case 24:
                    c0021CQf.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0021CQf.C);
                    break;
                case 25:
                    c0021CQf.g = f(typedArrayObtainStyledAttributes, index, c0021CQf.g);
                    break;
                case 26:
                    c0021CQf.h = f(typedArrayObtainStyledAttributes, index, c0021CQf.h);
                    break;
                case 27:
                    c0021CQf.B = typedArrayObtainStyledAttributes.getInt(index, c0021CQf.B);
                    break;
                case 28:
                    c0021CQf.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0021CQf.D);
                    break;
                case 29:
                    c0021CQf.i = f(typedArrayObtainStyledAttributes, index, c0021CQf.i);
                    break;
                case 30:
                    c0021CQf.j = f(typedArrayObtainStyledAttributes, index, c0021CQf.j);
                    break;
                case 31:
                    c0021CQf.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0021CQf.H);
                    break;
                case 32:
                    c0021CQf.p = f(typedArrayObtainStyledAttributes, index, c0021CQf.p);
                    break;
                case 33:
                    c0021CQf.q = f(typedArrayObtainStyledAttributes, index, c0021CQf.q);
                    break;
                case 34:
                    c0021CQf.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0021CQf.E);
                    break;
                case 35:
                    c0021CQf.l = f(typedArrayObtainStyledAttributes, index, c0021CQf.l);
                    break;
                case 36:
                    c0021CQf.k = f(typedArrayObtainStyledAttributes, index, c0021CQf.k);
                    break;
                case 37:
                    c0021CQf.u = typedArrayObtainStyledAttributes.getFloat(index, c0021CQf.u);
                    break;
                case 38:
                    qnHx.a = typedArrayObtainStyledAttributes.getResourceId(index, qnHx.a);
                    break;
                case 39:
                    c0021CQf.P = typedArrayObtainStyledAttributes.getFloat(index, c0021CQf.P);
                    break;
                case 40:
                    c0021CQf.O = typedArrayObtainStyledAttributes.getFloat(index, c0021CQf.O);
                    break;
                case 41:
                    c0021CQf.Q = typedArrayObtainStyledAttributes.getInt(index, c0021CQf.Q);
                    break;
                case 42:
                    c0021CQf.R = typedArrayObtainStyledAttributes.getInt(index, c0021CQf.R);
                    break;
                case 43:
                    lPt8.c = typedArrayObtainStyledAttributes.getFloat(index, lPt8.c);
                    break;
                case 44:
                    nUl.k = true;
                    nUl.l = typedArrayObtainStyledAttributes.getDimension(index, nUl.l);
                    break;
                case 45:
                    nUl.b = typedArrayObtainStyledAttributes.getFloat(index, nUl.b);
                    break;
                case 46:
                    nUl.c = typedArrayObtainStyledAttributes.getFloat(index, nUl.c);
                    break;
                case 47:
                    nUl.d = typedArrayObtainStyledAttributes.getFloat(index, nUl.d);
                    break;
                case 48:
                    nUl.e = typedArrayObtainStyledAttributes.getFloat(index, nUl.e);
                    break;
                case 49:
                    nUl.f = typedArrayObtainStyledAttributes.getDimension(index, nUl.f);
                    break;
                case 50:
                    nUl.g = typedArrayObtainStyledAttributes.getDimension(index, nUl.g);
                    break;
                case 51:
                    nUl.h = typedArrayObtainStyledAttributes.getDimension(index, nUl.h);
                    break;
                case 52:
                    nUl.i = typedArrayObtainStyledAttributes.getDimension(index, nUl.i);
                    break;
                case 53:
                    nUl.j = typedArrayObtainStyledAttributes.getDimension(index, nUl.j);
                    break;
                case 54:
                    c0021CQf.S = typedArrayObtainStyledAttributes.getInt(index, c0021CQf.S);
                    break;
                case 55:
                    c0021CQf.T = typedArrayObtainStyledAttributes.getInt(index, c0021CQf.T);
                    break;
                case 56:
                    c0021CQf.U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0021CQf.U);
                    break;
                case 57:
                    c0021CQf.V = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0021CQf.V);
                    break;
                case 58:
                    c0021CQf.W = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0021CQf.W);
                    break;
                case 59:
                    c0021CQf.X = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0021CQf.X);
                    break;
                case 60:
                    nUl.a = typedArrayObtainStyledAttributes.getFloat(index, nUl.a);
                    break;
                case 61:
                    c0021CQf.w = f(typedArrayObtainStyledAttributes, index, c0021CQf.w);
                    break;
                case 62:
                    c0021CQf.x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0021CQf.x);
                    break;
                case 63:
                    c0021CQf.y = typedArrayObtainStyledAttributes.getFloat(index, c0021CQf.y);
                    break;
                case 64:
                    f1.a = f(typedArrayObtainStyledAttributes, index, f1.a);
                    break;
                case 65:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                        f1.getClass();
                    } else {
                        String str = fXUx.w[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        f1.getClass();
                    }
                    break;
                case 66:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    f1.getClass();
                    break;
                case 67:
                    f1.d = typedArrayObtainStyledAttributes.getFloat(index, f1.d);
                    break;
                case 68:
                    lPt8.d = typedArrayObtainStyledAttributes.getFloat(index, lPt8.d);
                    break;
                case 69:
                    c0021CQf.Y = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 70:
                    c0021CQf.Z = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    c0021CQf.a0 = typedArrayObtainStyledAttributes.getInt(index, c0021CQf.a0);
                    break;
                case 73:
                    c0021CQf.b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0021CQf.b0);
                    break;
                case 74:
                    c0021CQf.e0 = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 75:
                    c0021CQf.i0 = typedArrayObtainStyledAttributes.getBoolean(index, c0021CQf.i0);
                    break;
                case 76:
                    f1.b = typedArrayObtainStyledAttributes.getInt(index, f1.b);
                    break;
                case 77:
                    c0021CQf.f0 = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 78:
                    lPt8.b = typedArrayObtainStyledAttributes.getInt(index, lPt8.b);
                    break;
                case 79:
                    f1.c = typedArrayObtainStyledAttributes.getFloat(index, f1.c);
                    break;
                case 80:
                    c0021CQf.g0 = typedArrayObtainStyledAttributes.getBoolean(index, c0021CQf.g0);
                    break;
                case 81:
                    c0021CQf.h0 = typedArrayObtainStyledAttributes.getBoolean(index, c0021CQf.h0);
                    break;
                case 82:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return qnHx;
    }

    public static int f(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    public final void a(ConstraintLayout constraintLayout) {
        int i;
        Iterator<String> it;
        String resourceEntryName;
        CQf cQf = this;
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, QnHx> map = cQf.c;
        HashSet<Integer> hashSet = new HashSet(map.keySet());
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!map.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    resourceEntryName = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    resourceEntryName = "UNKNOWN";
                }
                sb.append(resourceEntryName);
                Log.w("ConstraintSet", sb.toString());
            } else {
                if (cQf.b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (map.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        QnHx qnHx = map.get(Integer.valueOf(id));
                        if (childAt instanceof Barrier) {
                            qnHx.d.c0 = 1;
                        }
                        int i3 = qnHx.d.c0;
                        if (i3 != -1 && i3 == 1) {
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            C0021CQf c0021CQf = qnHx.d;
                            barrier.setType(c0021CQf.a0);
                            barrier.setMargin(c0021CQf.b0);
                            barrier.setAllowsGoneWidget(c0021CQf.i0);
                            int[] iArr = c0021CQf.d0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = c0021CQf.e0;
                                if (str != null) {
                                    int[] iArrC = c(barrier, str);
                                    c0021CQf.d0 = iArrC;
                                    barrier.setReferencedIds(iArrC);
                                }
                            }
                        }
                        ConstraintLayout.QnHx qnHx2 = (ConstraintLayout.QnHx) childAt.getLayoutParams();
                        qnHx2.a();
                        qnHx.a(qnHx2);
                        HashMap<String, x60> map2 = qnHx.f;
                        Class<?> cls = childAt.getClass();
                        Iterator<String> it2 = map2.keySet().iterator();
                        while (it2.hasNext()) {
                            String next = it2.next();
                            x60 x60Var = map2.get(next);
                            int i4 = childCount;
                            String strA = b70.a("set", next);
                            HashMap<String, x60> map3 = map2;
                            try {
                                switch (O.h(x60Var.a)) {
                                    case 0:
                                        it = it2;
                                        cls.getMethod(strA, Integer.TYPE).invoke(childAt, Integer.valueOf(x60Var.b));
                                        break;
                                    case 1:
                                        it = it2;
                                        cls.getMethod(strA, Float.TYPE).invoke(childAt, Float.valueOf(x60Var.c));
                                        break;
                                    case 2:
                                        it = it2;
                                        cls.getMethod(strA, Integer.TYPE).invoke(childAt, Integer.valueOf(x60Var.f));
                                        break;
                                    case 3:
                                        it = it2;
                                        Method method = cls.getMethod(strA, Drawable.class);
                                        ColorDrawable colorDrawable = new ColorDrawable();
                                        colorDrawable.setColor(x60Var.f);
                                        method.invoke(childAt, colorDrawable);
                                        break;
                                    case 4:
                                        it = it2;
                                        cls.getMethod(strA, CharSequence.class).invoke(childAt, x60Var.d);
                                        break;
                                    case 5:
                                        it = it2;
                                        cls.getMethod(strA, Boolean.TYPE).invoke(childAt, Boolean.valueOf(x60Var.e));
                                        break;
                                    case 6:
                                        it = it2;
                                        try {
                                            cls.getMethod(strA, Float.TYPE).invoke(childAt, Float.valueOf(x60Var.c));
                                        } catch (IllegalAccessException e2) {
                                            e = e2;
                                            StringBuilder sbA = N.a(" Custom Attribute \"", next, "\" not found on ");
                                            sbA.append(cls.getName());
                                            Log.e("TransitionLayout", sbA.toString());
                                            e.printStackTrace();
                                        } catch (NoSuchMethodException e3) {
                                            e = e3;
                                            Log.e("TransitionLayout", e.getMessage());
                                            Log.e("TransitionLayout", " Custom Attribute \"" + next + "\" not found on " + cls.getName());
                                            Log.e("TransitionLayout", cls.getName() + " must have a method " + strA);
                                        } catch (InvocationTargetException e4) {
                                            e = e4;
                                            StringBuilder sbA2 = N.a(" Custom Attribute \"", next, "\" not found on ");
                                            sbA2.append(cls.getName());
                                            Log.e("TransitionLayout", sbA2.toString());
                                            e.printStackTrace();
                                        }
                                        break;
                                    default:
                                        it = it2;
                                        break;
                                }
                            } catch (IllegalAccessException e5) {
                                e = e5;
                                it = it2;
                            } catch (NoSuchMethodException e6) {
                                e = e6;
                                it = it2;
                            } catch (InvocationTargetException e7) {
                                e = e7;
                                it = it2;
                            }
                            childCount = i4;
                            map2 = map3;
                            it2 = it;
                        }
                        i = childCount;
                        childAt.setLayoutParams(qnHx2);
                        LPt8Fixed lPt8 = qnHx.b;
                        if (lPt8.b == 0) {
                            childAt.setVisibility(lPt8.a);
                        }
                        childAt.setAlpha(lPt8.c);
                        NUlFixed nUl = qnHx.e;
                        childAt.setRotation(nUl.a);
                        childAt.setRotationX(nUl.b);
                        childAt.setRotationY(nUl.c);
                        childAt.setScaleX(nUl.d);
                        childAt.setScaleY(nUl.e);
                        if (!Float.isNaN(nUl.f)) {
                            childAt.setPivotX(nUl.f);
                        }
                        if (!Float.isNaN(nUl.g)) {
                            childAt.setPivotY(nUl.g);
                        }
                        childAt.setTranslationX(nUl.h);
                        childAt.setTranslationY(nUl.i);
                        childAt.setTranslationZ(nUl.j);
                        if (nUl.k) {
                            childAt.setElevation(nUl.l);
                        }
                    } else {
                        i = childCount;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
                i2++;
                cQf = this;
                childCount = i;
            }
            i = childCount;
            i2++;
            cQf = this;
            childCount = i;
        }
        for (Integer num : hashSet) {
            QnHx qnHx3 = map.get(num);
            C0021CQf c0021CQf2 = qnHx3.d;
            int i5 = c0021CQf2.c0;
            if (i5 != -1 && i5 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                int[] iArr2 = c0021CQf2.d0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str2 = c0021CQf2.e0;
                    if (str2 != null) {
                        int[] iArrC2 = c(barrier2, str2);
                        c0021CQf2.d0 = iArrC2;
                        barrier2.setReferencedIds(iArrC2);
                    }
                }
                barrier2.setType(c0021CQf2.a0);
                barrier2.setMargin(c0021CQf2.b0);
                int i6 = ConstraintLayout.L;
                ConstraintLayout.QnHx qnHx4 = new ConstraintLayout.QnHx();
                barrier2.g();
                qnHx3.a(qnHx4);
                constraintLayout.addView(barrier2, qnHx4);
            }
            if (c0021CQf2.a) {
                View guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                int i7 = ConstraintLayout.L;
                ConstraintLayout.QnHx qnHx5 = new ConstraintLayout.QnHx();
                qnHx3.a(qnHx5);
                constraintLayout.addView(guideline, qnHx5);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i;
        CQf cQf = this;
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, QnHx> map = cQf.c;
        map.clear();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            ConstraintLayout.QnHx qnHx = (ConstraintLayout.QnHx) childAt.getLayoutParams();
            int id = childAt.getId();
            if (cQf.b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id))) {
                map.put(Integer.valueOf(id), new QnHx());
            }
            QnHx qnHx2 = map.get(Integer.valueOf(id));
            HashMap<String, x60> map2 = cQf.a;
            HashMap<String, x60> map3 = new HashMap<>();
            Class<?> cls = childAt.getClass();
            for (String str : map2.keySet()) {
                x60 x60Var = map2.get(str);
                try {
                    if (str.equals("BackgroundColor")) {
                        map3.put(str, new x60(x60Var, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                    } else {
                        i = childCount;
                        try {
                            map3.put(str, new x60(x60Var, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0])));
                        } catch (IllegalAccessException e2) {
                            e = e2;
                            e.printStackTrace();
                        } catch (NoSuchMethodException e3) {
                            e = e3;
                            e.printStackTrace();
                        } catch (InvocationTargetException e4) {
                            e = e4;
                            e.printStackTrace();
                        }
                        childCount = i;
                    }
                } catch (IllegalAccessException e5) {
                    e = e5;
                    i = childCount;
                } catch (NoSuchMethodException e6) {
                    e = e6;
                    i = childCount;
                } catch (InvocationTargetException e7) {
                    e = e7;
                    i = childCount;
                }
            }
            int i3 = childCount;
            qnHx2.f = map3;
            qnHx2.b(id, qnHx);
            int visibility = childAt.getVisibility();
            LPt8Fixed lPt8 = qnHx2.b;
            lPt8.a = visibility;
            lPt8.c = childAt.getAlpha();
            float rotation = childAt.getRotation();
            NUlFixed nUl = qnHx2.e;
            nUl.a = rotation;
            nUl.b = childAt.getRotationX();
            nUl.c = childAt.getRotationY();
            nUl.d = childAt.getScaleX();
            nUl.e = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                nUl.f = pivotX;
                nUl.g = pivotY;
            }
            nUl.h = childAt.getTranslationX();
            nUl.i = childAt.getTranslationY();
            nUl.j = childAt.getTranslationZ();
            if (nUl.k) {
                nUl.l = childAt.getElevation();
            }
            if (childAt instanceof Barrier) {
                Barrier barrier = (Barrier) childAt;
                boolean z = barrier.E.h0;
                C0021CQf c0021CQf = qnHx2.d;
                c0021CQf.i0 = z;
                c0021CQf.d0 = barrier.getReferencedIds();
                c0021CQf.a0 = barrier.getType();
                c0021CQf.b0 = barrier.getMargin();
            }
            i2++;
            cQf = this;
            childCount = i3;
        }
    }

    public final void e(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    QnHx qnHxD = d(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        qnHxD.d.a = true;
                    }
                    this.c.put(Integer.valueOf(qnHxD.a), qnHxD);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }
}
