package com.facebook.ads.redexgen.X;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.annotation.CallSuper;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.androidx.support.v4.view.ViewPager;
import com.facebook.ads.internal.androidx.support.v4.view.ViewPager$DecorView;
import com.facebook.ads.internal.androidx.support.v4.view.ViewPager$SavedState;
import com.facebook.ads.internal.util.parcelable.WrappedParcelable;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3M, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C3M extends ViewGroup {
    public static byte[] A0u;
    public static String[] A0v = {"Pb5dMBpLoD8olSqqN3M1wt71s6WfJWWx", "mawes8eGWKEfT5kg0DwbKE", "yCX0UAcI", "nBGVAWTalDrx8Q3Q0HTp4hPpqgaJoZ5h", "", "", "gKpLqM1fc4CgqUT7jB7tIrf4xsKdVFyY", "wKHjR3FqXT8StRIGs0zAAfuJmbbhub4H"};
    public static final int[] A0w;
    public static final Interpolator A0x;
    public static final C3L A0y;
    public static final Comparator<C3E> A0z;
    public int A00;
    public AbstractC03102t A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public int A0R;
    public Drawable A0S;
    public Parcelable A0T;
    public VelocityTracker A0U;
    public EdgeEffect A0V;
    public EdgeEffect A0W;
    public Scroller A0X;
    public C3H A0Y;
    public C3H A0Z;
    public C3I A0a;
    public C3J A0b;
    public ClassLoader A0c;
    public ArrayList<View> A0d;
    public List<ViewPager.OnAdapterChangeListener> A0e;
    public List<C3H> A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public final Rect A0q;
    public final C3E A0r;
    public final Runnable A0s;
    public final ArrayList<C3E> A0t;

    public static String A08(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0u, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 104);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0C() {
        A0u = new byte[]{-99, -70, -69, -99, -62, -14, 3, 9, 7, 20, -62, 5, 14, 3, 21, 21, -36, -62, -48, 0, 17, 23, 21, 34, -48, 25, 20, -22, -48, -34, 14, 48, 45, 32, 42, 35, 43, 31, 50, 39, 33, -34, 31, 34, 31, 46, 50, 35, 48, -8, -34, -30, 54, 49, 49, -30, 53, 47, 35, 46, 46, -3, -30, 38, 39, 40, 35, 55, 46, 54, 43, 48, 41, -30, 54, 49, -30, -66, -78, -8, 1, 7, 0, -10, -52, -78, -69, -39, -26, -26, -25, -20, -104, -39, -36, -36, -104, -24, -39, -33, -35, -22, -104, -36, -35, -37, -25, -22, -104, -18, -31, -35, -17, -104, -36, -19, -22, -31, -26, -33, -104, -28, -39, -15, -25, -19, -20, -10, 9, 21, 25, 9, 23, 24, 9, 8, -60, 19, 10, 10, 23, 7, 22, 9, 9, 18, -60, 20, 5, 11, 9, -60, 16, 13, 17, 13, 24, -60, -10, 10, 7, -62, 3, 18, 18, 14, 11, 5, 3, 22, 11, 17, 16, -55, 21, -62, -14, 3, 9, 7, 20, -29, 6, 3, 18, 22, 7, 20, -62, 5, 10, 3, 16, 9, 7, 6, -62, 22, 10, 7, -62, 3, 6, 3, 18, 22, 7, 20, -55, 21, -62, 5, 17, 16, 22, 7, 16, 22, 21, -62, 25, 11, 22, 10, 17, 23, 22, -62, 5, 3, 14, 14, 11, 16, 9, -62, -14, 3, 9, 7, 20, -29, 6, 3, 18, 22, 7, 20, -59, 16, 17, 22, 11, 8, 27, -26, 3, 22, 3, -11, 7, 22, -27, 10, 3, 16, 9, 7, 6, -61, -62, -25, 26, 18, 7, 5, 22, 7, 6, -62, 3, 6, 3, 18, 22, 7, 20, -62, 11, 22, 7, 15, -62, 5, 17, 23, 16, 22, -36, -62, -19, 0, -4, 14, -25, -8, -2, -4, 9, 25, 42, 42, 39, 47, 11, 27, 42, 39, 36, 36, -40, 44, 42, 33, 29, 28, -40, 44, 39, -40, 30, 33, 38, 28, -40, 30, 39, 27, 45, 43, -40, 26, 25, 43, 29, 28, -40, 39, 38, -40, 38, 39, 38, -27, 27, 32, 33, 36, 28, -40, 27, 45, 42, 42, 29, 38, 44, -40, 30, 39, 27, 45, 43, 29, 28, -40, 46, 33, 29, 47, -40, 76, 75, 30, 65, 62, 77, 81, 66, 79, 32, 69, 62, 75, 68, 66, 65, 19, 18, -12, 5, 11, 9, -9, 7, 22, 19, 16, 16, 9, 8, -60, 8, 13, 8, -60, 18, 19, 24, -60, 7, 5, 16, 16, -60, 23, 25, 20, 9, 22, 7, 16, 5, 23, 23, -60, 13, 17, 20, 16, 9, 17, 9, 18, 24, 5, 24, 13, 19, 18, 85, 83, 66, 79, 84, 71, 80, 83, 78, 49, 66, 72, 70};
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [com.facebook.ads.redexgen.X.3L] */
    static {
        A0C();
        A0w = new int[]{R.attr.layout_gravity};
        A0z = new Comparator<C3E>() { // from class: com.facebook.ads.redexgen.X.3A
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final int compare(C3E c3e, C3E c3e2) {
                return c3e.A02 - c3e2.A02;
            }
        };
        A0x = new Interpolator() { // from class: com.facebook.ads.redexgen.X.3B
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        };
        A0y = new Comparator<View>() { // from class: com.facebook.ads.redexgen.X.3L
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final int compare(View view, View view2) {
                C3F c3f = (C3F) view.getLayoutParams();
                C3F c3f2 = (C3F) view2.getLayoutParams();
                if (c3f.A05 != c3f2.A05) {
                    return c3f.A05 ? 1 : -1;
                }
                return c3f.A02 - c3f2.A02;
            }
        };
    }

    public C3M(Context context) {
        super(context);
        this.A0t = new ArrayList<>();
        this.A0r = new C3E();
        this.A0q = new Rect();
        this.A0O = -1;
        this.A0T = null;
        this.A0c = null;
        this.A02 = -3.4028235E38f;
        this.A07 = Float.MAX_VALUE;
        this.A0L = 1;
        this.A08 = -1;
        this.A0i = true;
        this.A0n = false;
        this.A0s = new Runnable() { // from class: com.facebook.ads.redexgen.X.3C
            @Override // java.lang.Runnable
            public final void run() {
                this.A00.setScrollState(0);
                this.A00.A0f();
            }
        };
        this.A0P = 0;
        A0D();
    }

    private final float A00(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    private int A01(int i, float f, int i2, int i3) {
        if (Math.abs(i3) > this.A0H && Math.abs(i2) > this.A0K) {
            if (i2 <= 0) {
                i++;
            }
        } else {
            i += (int) (f + (i >= this.A00 ? 0.4f : 0.6f));
        }
        if (this.A0t.size() > 0) {
            C3E c3e = this.A0t.get(0);
            ArrayList<C3E> arrayList = this.A0t;
            return Math.max(c3e.A02, Math.min(i, arrayList.get(arrayList.size() - 1).A02));
        }
        return i;
    }

    private Rect A02(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private C3E A03() {
        int clientWidth = getClientWidth();
        float scrollOffset = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        if (clientWidth > 0) {
            float scrollOffset2 = this.A0M;
            scrollOffset = scrollOffset2 / clientWidth;
        }
        int i = -1;
        float leftBound = 0.0f;
        float rightBound = 0.0f;
        boolean z = true;
        C3E c3e = null;
        int i2 = 0;
        while (i2 < this.A0t.size()) {
            C3E c3e2 = this.A0t.get(i2);
            if (!z && c3e2.A02 != i + 1) {
                c3e2 = this.A0r;
                c3e2.A00 = leftBound + rightBound + scrollOffset;
                c3e2.A02 = i + 1;
                c3e2.A01 = this.A01.A04(c3e2.A02);
                i2--;
            }
            leftBound = c3e2.A00;
            float rightBound2 = c3e2.A01 + leftBound + scrollOffset;
            if (!z) {
                String[] strArr = A0v;
                if (strArr[4].length() != strArr[5].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0v;
                strArr2[3] = "VrUwTTzuyHD2SkMMCenWDHvarMqbXCCI";
                strArr2[6] = "LX2NnyEsDXWEx3dFbPH8p7fzI1U1dTZ8";
                if (scrollX < leftBound) {
                    return c3e;
                }
            }
            if (scrollX >= rightBound2) {
                int size = this.A0t.size() - 1;
                String[] strArr3 = A0v;
                if (strArr3[3].charAt(15) != strArr3[6].charAt(15)) {
                    A0v[2] = "sbP3P6ChvdnfvWI";
                    if (i2 != size) {
                        z = false;
                        i = c3e2.A02;
                        rightBound = c3e2.A01;
                        c3e = c3e2;
                        i2++;
                    }
                } else {
                    A0v[1] = "kvGf4Zg53U8bz7GLeUNnCLzy4o";
                    if (i2 != size) {
                        z = false;
                        i = c3e2.A02;
                        rightBound = c3e2.A01;
                        c3e = c3e2;
                        i2++;
                    }
                }
            }
            return c3e2;
        }
        return c3e;
    }

    private final C3E A04(int i) {
        for (int i2 = 0; i2 < this.A0t.size(); i2++) {
            C3E c3e = this.A0t.get(i2);
            if (c3e.A02 == i) {
                return c3e;
            }
        }
        return null;
    }

    private final C3E A05(int i, int i2) {
        C3E c3e = new C3E();
        c3e.A02 = i;
        c3e.A03 = this.A01.A08(this, i);
        c3e.A01 = this.A01.A04(i);
        if (i2 < 0 || i2 >= this.A0t.size()) {
            this.A0t.add(c3e);
        } else {
            this.A0t.add(i2, c3e);
        }
        return c3e;
    }

    private final C3E A06(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent != this) {
                if (parent == null || !(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } else {
                return A07(view);
            }
        }
    }

    private final C3E A07(View view) {
        for (int i = 0; i < this.A0t.size(); i++) {
            C3E c3e = this.A0t.get(i);
            if (this.A01.A0C(view, c3e.A03)) {
                return c3e;
            }
        }
        String[] strArr = A0v;
        if (strArr[4].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        A0v[1] = "T6ty";
        return null;
    }

    private void A09() {
        this.A0k = false;
        this.A0m = false;
        VelocityTracker velocityTracker = this.A0U;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            String[] strArr = A0v;
            if (strArr[7].charAt(10) != strArr[0].charAt(10)) {
                throw new RuntimeException();
            }
            A0v[1] = "yoRarqzFlsm2scdQtgnfRphmjo";
            this.A0U = null;
        }
    }

    private void A0A() {
        int i = 0;
        while (i < getChildCount()) {
            C3F lp = (C3F) getChildAt(i).getLayoutParams();
            if (!lp.A05) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    private void A0B() {
        if (this.A0F != 0) {
            ArrayList<View> arrayList = this.A0d;
            if (arrayList == null) {
                this.A0d = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.A0d.add(getChildAt(i));
            }
            Collections.sort(this.A0d, A0y);
        }
    }

    private final void A0D() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.A0X = new Scroller(context, A0x);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.A0R = viewConfiguration.getScaledPagingTouchSlop();
        this.A0K = (int) (400.0f * f);
        this.A0J = viewConfiguration.getScaledMaximumFlingVelocity();
        this.A0V = new EdgeEffect(context);
        this.A0W = new EdgeEffect(context);
        this.A0H = (int) (25.0f * f);
        this.A0C = (int) (2.0f * f);
        this.A0E = (int) (16.0f * f);
        AnonymousClass38.A0B(this, new C1273cM(this));
        if (AnonymousClass38.A00(this) == 0) {
            AnonymousClass38.A09(this, 1);
        }
        AnonymousClass38.A0C(this, new C1274cN(this));
    }

    private void A0E(int i) {
        C3H c3h = this.A0Z;
        List<C3H> list = this.A0f;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.A0f.get(i2);
            }
        }
        C3H c3h2 = this.A0Y;
    }

    private void A0F(int i) {
        C3H c3h = this.A0Z;
        List<C3H> list = this.A0f;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.A0f.get(i2);
            }
        }
        C3H c3h2 = this.A0Y;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0273  */
    /* JADX WARN: Code duplicated, block: B:126:0x0285  */
    /* JADX WARN: Code duplicated, block: B:128:0x0291  */
    /* JADX WARN: Code duplicated, block: B:71:0x013c  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:96:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:98:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:99:0x01e5  */
    private final void A0G(int i) {
        String hexString;
        C3E ii;
        C3E c3e;
        C3E c3e2;
        ArrayList<C3E> arrayList;
        String[] strArr;
        C3E c3eA04 = null;
        int i2 = this.A00;
        if (i2 != i) {
            c3eA04 = A04(i2);
            this.A00 = i;
        }
        if (this.A01 == null) {
            A0B();
            return;
        }
        if (this.A0o) {
            A0B();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        int i3 = this.A0L;
        int iMax = Math.max(0, this.A00 - i3);
        int pageLimit = this.A01.A05();
        int startPos = this.A00;
        int iMin = Math.min(pageLimit - 1, startPos + i3);
        int startPos2 = this.A0G;
        if (pageLimit == startPos2) {
            C3E c3eA05 = null;
            if (A0v[2].length() != 14) {
                A0v[1] = "Tot0RAE";
                int i4 = 0;
                while (i4 < this.A0t.size()) {
                    C3E c3e3 = this.A0t.get(i4);
                    if (c3e3.A02 >= this.A00) {
                        if (c3e3.A02 != this.A00) {
                            break;
                        }
                        c3eA05 = c3e3;
                        break;
                    }
                    i4++;
                }
                if (c3eA05 == null && pageLimit > 0) {
                    int i5 = this.A00;
                    if (A0v[1].length() != 12) {
                        A0v[2] = "0";
                        c3eA05 = A05(i5, i4);
                    } else {
                        String[] strArr2 = A0v;
                        strArr2[4] = "";
                        strArr2[5] = "";
                        c3eA05 = A05(i5, i4);
                    }
                }
                if (c3eA05 != null) {
                    float f = 0.0f;
                    int i6 = i4 - 1;
                    if (i6 >= 0) {
                        C3E c3e4 = this.A0t.get(i6);
                        String[] strArr3 = A0v;
                        String str = strArr3[3];
                        String str2 = strArr3[6];
                        int itemIndex = str.charAt(15);
                        if (itemIndex != str2.charAt(15)) {
                            A0v[1] = "VNMCyWdkMCax4jTa2KYBa9F64T8dlp";
                            c3e = c3e4;
                        }
                    } else {
                        c3e = null;
                    }
                    int clientWidth = getClientWidth();
                    float paddingLeft = clientWidth <= 0 ? 0.0f : (getPaddingLeft() / clientWidth) + (2.0f - c3eA05.A01);
                    int clientWidth2 = this.A00;
                    for (int i7 = clientWidth2 - 1; i7 >= 0; i7--) {
                        if (f >= paddingLeft && i7 < iMax) {
                            if (c3e == null) {
                                break;
                            }
                            if (i7 == c3e.A02) {
                                boolean z = c3e.A04;
                                if (A0v[1].length() != 12) {
                                    String[] strArr4 = A0v;
                                    strArr4[3] = "QhiOcGNIJcLOaoEYV3OP8NOecDWqJ7D8";
                                    strArr4[6] = "FbcNVe1VrEtA3cJ1GoNXvysouMCttgtj";
                                    if (!z) {
                                        this.A0t.remove(i6);
                                        this.A01.A0B(this, i7, c3e.A03);
                                        i6--;
                                        i4--;
                                        if (i6 >= 0) {
                                            c3e = this.A0t.get(i6);
                                        } else {
                                            c3e = null;
                                        }
                                    }
                                } else {
                                    A0v[1] = "W7mkeiNJnWKv2ju5RZqhAYu";
                                    if (!z) {
                                        this.A0t.remove(i6);
                                        this.A01.A0B(this, i7, c3e.A03);
                                        i6--;
                                        i4--;
                                        if (i6 >= 0) {
                                            c3e = this.A0t.get(i6);
                                        } else {
                                            c3e = null;
                                        }
                                    }
                                }
                            }
                        } else if (c3e == null || i7 != c3e.A02) {
                            C3E ii2 = A05(i7, i6 + 1);
                            f += ii2.A01;
                            i4++;
                            c3e = i6 >= 0 ? this.A0t.get(i6) : null;
                        } else {
                            float f2 = c3e.A01;
                            String[] strArr5 = A0v;
                            if (strArr5[3].charAt(15) == strArr5[6].charAt(15)) {
                                throw new RuntimeException();
                            }
                            String[] strArr6 = A0v;
                            strArr6[7] = "jwRLJzle6w88GhXZAW5feXHTmtVqtTMH";
                            strArr6[0] = "ykl9XiQ4Zu8NQzfhQsr725QVQS98nQxx";
                            f += f2;
                            i6--;
                            c3e = i6 >= 0 ? this.A0t.get(i6) : null;
                        }
                    }
                    float f3 = c3eA05.A01;
                    int pos = i4 + 1;
                    if (f3 < 2.0f) {
                        int itemIndex2 = this.A0t.size();
                        if (pos < itemIndex2) {
                            c3e2 = this.A0t.get(pos);
                        } else {
                            c3e2 = null;
                        }
                        float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                        for (int i8 = this.A00 + 1; i8 < pageLimit; i8++) {
                            if (f3 >= paddingRight && i8 > iMin) {
                                if (c3e2 == null) {
                                    break;
                                }
                                if (i8 == c3e2.A02) {
                                    boolean z2 = c3e2.A04;
                                    String[] strArr7 = A0v;
                                    if (strArr7[4].length() == strArr7[5].length()) {
                                        A0v[2] = "5WkOlDapAzWg8W2";
                                        if (!z2) {
                                            this.A0t.remove(pos);
                                            this.A01.A0B(this, i8, c3e2.A03);
                                            if (pos < this.A0t.size()) {
                                                arrayList = this.A0t;
                                                strArr = A0v;
                                                if (strArr[4].length() != strArr[5].length()) {
                                                    c3e2 = arrayList.get(pos);
                                                } else {
                                                    A0v[2] = "XVMyMt846jP";
                                                    c3e2 = arrayList.get(pos);
                                                }
                                            } else {
                                                c3e2 = null;
                                            }
                                        }
                                    } else if (!z2) {
                                        this.A0t.remove(pos);
                                        this.A01.A0B(this, i8, c3e2.A03);
                                        if (pos < this.A0t.size()) {
                                            arrayList = this.A0t;
                                            strArr = A0v;
                                            if (strArr[4].length() != strArr[5].length()) {
                                                c3e2 = arrayList.get(pos);
                                            } else {
                                                A0v[2] = "XVMyMt846jP";
                                                c3e2 = arrayList.get(pos);
                                            }
                                        } else {
                                            c3e2 = null;
                                        }
                                    }
                                }
                            } else if (c3e2 != null && i8 == c3e2.A02) {
                                f3 += c3e2.A01;
                                pos++;
                                c3e2 = pos < this.A0t.size() ? this.A0t.get(pos) : null;
                            } else {
                                C3E c3eA06 = A05(i8, pos);
                                pos++;
                                f3 += c3eA06.A01;
                                c3e2 = pos < this.A0t.size() ? this.A0t.get(pos) : null;
                            }
                        }
                    }
                    A0Q(c3eA05, i4, c3eA04);
                }
                int childCount = getChildCount();
                for (int i9 = 0; i9 < childCount; i9++) {
                    View childAt = getChildAt(i9);
                    C3F c3f = (C3F) childAt.getLayoutParams();
                    c3f.A01 = i9;
                    if (!c3f.A05 && c3f.A00 == 0.0f) {
                        C3E c3eA07 = A07(childAt);
                        String[] strArr8 = A0v;
                        if (strArr8[7].charAt(10) != strArr8[0].charAt(10)) {
                            if (c3eA07 != null) {
                                c3f.A00 = c3eA07.A01;
                                c3f.A02 = c3eA07.A02;
                            }
                        } else {
                            A0v[1] = "EEa7ILjnbFiKaMBJBW0FEjvS9loAIL";
                            if (c3eA07 != null) {
                                c3f.A00 = c3eA07.A01;
                                c3f.A02 = c3eA07.A02;
                            }
                        }
                    }
                }
                A0B();
                boolean zHasFocus = hasFocus();
                String[] strArr9 = A0v;
                String str3 = strArr9[7];
                String str4 = strArr9[0];
                int startPos3 = str3.charAt(10);
                if (startPos3 != str4.charAt(10)) {
                    String[] strArr10 = A0v;
                    strArr10[3] = "NE38g6Z97jz5qfHCFa20rs9T6KYjQOQv";
                    strArr10[6] = "QpeTyhXvOSG32zhXIQZ7qi9J0rEUnEgr";
                    if (!zHasFocus) {
                        return;
                    }
                } else {
                    String[] strArr11 = A0v;
                    strArr11[4] = "";
                    strArr11[5] = "";
                    if (!zHasFocus) {
                        return;
                    }
                }
                View viewFindFocus = findFocus();
                if (viewFindFocus != null) {
                    ii = A06(viewFindFocus);
                } else {
                    ii = null;
                }
                if (ii != null) {
                    int startPos4 = ii.A02;
                    if (startPos4 == this.A00) {
                        return;
                    }
                }
                for (int i10 = 0; i10 < i; i10++) {
                    View childAt2 = getChildAt(i10);
                    C3E c3eA08 = A07(childAt2);
                    if (c3eA08 != null) {
                        int startPos5 = c3eA08.A02;
                        if (startPos5 == this.A00 && childAt2.requestFocus(2)) {
                            return;
                        }
                    }
                }
                return;
            }
            throw new RuntimeException();
        }
        try {
            hexString = getResources().getResourceName(getId());
        } catch (Resources.NotFoundException unused) {
            hexString = Integer.toHexString(getId());
        }
        throw new IllegalStateException(A08(158, 142, 58) + this.A0G + A08(77, 9, 42) + pageLimit + A08(18, 11, 72) + hexString + A08(4, 14, 58) + getClass() + A08(29, 22, 86) + this.A01.getClass());
    }

    private void A0H(int i, float f, int i2) {
        C3H c3h = this.A0Z;
        List<C3H> list = this.A0f;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                this.A0f.get(i3);
            }
        }
        C3H c3h2 = this.A0Y;
    }

    @CallSuper
    private final void A0I(int scrollX, float f, int paddingLeft) {
        int iMax;
        if (this.A0D > 0) {
            int i = getScrollX();
            int paddingLeft2 = getPaddingLeft();
            int paddingRight = getPaddingRight();
            if (A0v[1].length() == 12) {
                throw new RuntimeException();
            }
            String[] strArr = A0v;
            strArr[3] = "hSwONVQ9BwzgmNPK4tziO3X6uj4eQvsQ";
            strArr[6] = "gKhZoL4mhYlFRC9fFMXnjqdiW6EOuKfZ";
            int width = getWidth();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C3F c3f = (C3F) childAt.getLayoutParams();
                if (c3f.A05) {
                    int i3 = c3f.A04 & 7;
                    if (i3 == 1) {
                        int childOffset = childAt.getMeasuredWidth();
                        iMax = Math.max((width - childOffset) / 2, paddingLeft2);
                    } else if (i3 == 3) {
                        iMax = paddingLeft2;
                        int childOffset2 = childAt.getWidth();
                        paddingLeft2 += childOffset2;
                    } else if (i3 != 5) {
                        iMax = paddingLeft2;
                    } else {
                        int childOffset3 = childAt.getMeasuredWidth();
                        iMax = (width - paddingRight) - childOffset3;
                        int childOffset4 = childAt.getMeasuredWidth();
                        paddingRight += childOffset4;
                    }
                    int childLeft = childAt.getLeft();
                    int i4 = (iMax + i) - childLeft;
                    if (i4 != 0) {
                        childAt.offsetLeftAndRight(i4);
                    }
                }
            }
        }
        A0H(scrollX, f, paddingLeft);
        if (this.A0a != null) {
            getScrollX();
            int childCount2 = getChildCount();
            for (int i5 = 0; i5 < childCount2; i5++) {
                View childAt2 = getChildAt(i5);
                if (!((C3F) childAt2.getLayoutParams()).A05) {
                    childAt2.getLeft();
                    getClientWidth();
                    throw new NullPointerException(A08(450, 13, 121));
                }
            }
        }
        this.A0g = true;
    }

    private final void A0J(int i, int i2, int width) {
        int dy;
        int iRound;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.A0X;
        int dx = (scroller == null || scroller.isFinished()) ? 0 : 1;
        if (dx != 0) {
            if (this.A0l) {
                dy = this.A0X.getCurrX();
            } else {
                dy = this.A0X.getStartX();
            }
            this.A0X.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            dy = getScrollX();
        }
        int scrollY = getScrollY();
        int i3 = i - dy;
        int velocity = i2 - scrollY;
        if (i3 == 0 && velocity == 0) {
            A0R(false);
            A0f();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i4 = clientWidth / 2;
        float fA00 = i4 + (i4 * A00(Math.min(1.0f, (Math.abs(i3) * 1.0f) / clientWidth)));
        int halfWidth = Math.abs(width);
        if (halfWidth > 0) {
            float f = halfWidth;
            if (A0v[1].length() == 12) {
                throw new RuntimeException();
            }
            String[] strArr = A0v;
            strArr[4] = "";
            strArr[5] = "";
            iRound = Math.round(Math.abs(fA00 / f) * 1000.0f) * 4;
        } else {
            float fA04 = clientWidth * this.A01.A04(this.A00);
            float fAbs = Math.abs(i3);
            float pageWidth = this.A0M;
            iRound = (int) ((1.0f + (fAbs / (pageWidth + fA04))) * 100.0f);
        }
        int iMin = Math.min(iRound, 600);
        this.A0l = false;
        this.A0X.startScroll(dy, scrollY, i3, velocity, iMin);
        AnonymousClass38.A07(this);
    }

    private void A0K(int i, int i2, int i3, int i4) {
        if (i2 > 0) {
            ArrayList<C3E> arrayList = this.A0t;
            String[] strArr = A0v;
            if (strArr[7].charAt(10) != strArr[0].charAt(10)) {
                throw new RuntimeException();
            }
            A0v[1] = "xS6wP2kv8Ukjp2mlI4OFB7EI";
            if (!arrayList.isEmpty()) {
                boolean zIsFinished = this.A0X.isFinished();
                if (A0v[1].length() == 12) {
                    throw new RuntimeException();
                }
                A0v[2] = "M3IvNYMGgF0qb538wmgDMK0nNkgqAt";
                if (!zIsFinished) {
                    this.A0X.setFinalX(getCurrentItem() * getClientWidth());
                    return;
                }
                int oldWidthWithMargin = ((i - getPaddingLeft()) - getPaddingRight()) + i3;
                int xpos = ((i2 - getPaddingLeft()) - getPaddingRight()) + i4;
                scrollTo((int) (oldWidthWithMargin * (getScrollX() / xpos)), getScrollY());
                return;
            }
        }
        C3E c3eA04 = A04(this.A00);
        int paddingLeft = (int) (((i - getPaddingLeft()) - getPaddingRight()) * (c3eA04 != null ? Math.min(c3eA04.A00, this.A07) : 0.0f));
        if (paddingLeft != getScrollX()) {
            A0R(false);
            scrollTo(paddingLeft, getScrollY());
        }
    }

    private final void A0L(int i, boolean z) {
        this.A0o = false;
        A0N(i, z, false);
    }

    private void A0M(int destX, boolean z, int i, boolean z2) {
        C3E c3eA04 = A04(destX);
        int clientWidth = 0;
        if (c3eA04 != null) {
            clientWidth = (int) (getClientWidth() * Math.max(this.A02, Math.min(c3eA04.A00, this.A07)));
        }
        if (A0v[2].length() == 14) {
            throw new RuntimeException();
        }
        String[] strArr = A0v;
        strArr[3] = "qWyJthdIKprwmupmlWytZXkwKuTz6nwm";
        strArr[6] = "fDmSwMvEmt93O90vXMKXMmFP8biUMO95";
        if (z) {
            A0J(clientWidth, 0, i);
            if (z2) {
                A0E(destX);
                return;
            }
            return;
        }
        if (z2) {
            A0E(destX);
        }
        A0R(false);
        scrollTo(clientWidth, 0);
        A0Z(clientWidth);
    }

    private final void A0N(int i, boolean z, boolean z2) {
        A0O(i, z, z2, 0);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0067  */
    /* JADX WARN: Code duplicated, block: B:32:0x0070 A[LOOP:0: B:30:0x0068->B:32:0x0070, LOOP_END] */
    private final void A0O(int i, boolean z, boolean z2, int i2) {
        int i3;
        AbstractC03102t abstractC03102t = this.A01;
        if (abstractC03102t == null || abstractC03102t.A05() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z2 && this.A00 == i && this.A0t.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        boolean z3 = true;
        if (i < 0) {
            i = 0;
        } else if (i >= this.A01.A05()) {
            i = this.A01.A05() - 1;
        }
        int i4 = this.A0L;
        int i5 = this.A00;
        if (i <= i5 + i4) {
            int i6 = i5 - i4;
            String[] strArr = A0v;
            if (strArr[7].charAt(10) != strArr[0].charAt(10)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0v;
            strArr2[3] = "HdD8kb8A1NTv0LjA3C8pNf8B8Uhf5Rjf";
            strArr2[6] = "hEPxY7plOgAB5ujpSYVhyDABeqG0KedF";
            if (i < i6) {
                for (i3 = 0; i3 < this.A0t.size(); i3++) {
                    this.A0t.get(i3).A04 = true;
                }
            }
        } else {
            while (i3 < this.A0t.size()) {
                this.A0t.get(i3).A04 = true;
            }
        }
        if (this.A00 == i) {
            z3 = false;
        }
        if (this.A0i) {
            this.A00 = i;
            if (z3) {
                A0E(i);
            }
            requestLayout();
            return;
        }
        A0G(i);
        A0M(i, z, i2, z3);
    }

    private void A0P(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.A08) {
            int i = actionIndex == 0 ? 1 : 0;
            this.A05 = motionEvent.getX(i);
            String[] strArr = A0v;
            if (strArr[4].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0v;
            strArr2[4] = "";
            strArr2[5] = "";
            this.A08 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.A0U;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:76:0x018b  */
    private void A0Q(C3E c3e, int i, C3E c3e2) {
        float f;
        C3E c3e3;
        C3E c3e4;
        int pos = this.A01.A05();
        int clientWidth = getClientWidth();
        float f2 = clientWidth > 0 ? this.A0M / clientWidth : 0.0f;
        if (c3e2 != null) {
            int i2 = c3e2.A02;
            if (i2 < c3e.A02) {
                int i3 = 0;
                float fA04 = c3e2.A00 + c3e2.A01 + f2;
                int i4 = i2 + 1;
                while (i4 <= c3e.A02 && i3 < this.A0t.size()) {
                    C3E c3e5 = this.A0t.get(i3);
                    while (true) {
                        c3e4 = c3e5;
                        if (i4 <= c3e4.A02 || i3 >= this.A0t.size() - 1) {
                            break;
                        }
                        i3++;
                        c3e5 = this.A0t.get(i3);
                    }
                    while (i4 < c3e4.A02) {
                        AbstractC03102t abstractC03102t = this.A01;
                        if (A0v[2].length() == 14) {
                            throw new RuntimeException();
                        }
                        A0v[2] = "unjnr1JPHveRA3A";
                        fA04 += abstractC03102t.A04(i4) + f2;
                        i4++;
                    }
                    c3e4.A00 = fA04;
                    fA04 += c3e4.A01 + f2;
                    i4++;
                }
            } else if (i2 > c3e.A02) {
                int size = this.A0t.size() - 1;
                float fA05 = c3e2.A00;
                int i5 = i2 - 1;
                while (i5 >= c3e.A02 && size >= 0) {
                    C3E c3e6 = this.A0t.get(size);
                    while (true) {
                        c3e3 = c3e6;
                        if (i5 >= c3e3.A02 || size <= 0) {
                            break;
                        }
                        size--;
                        c3e6 = this.A0t.get(size);
                    }
                    while (true) {
                        int i6 = c3e3.A02;
                        String[] strArr = A0v;
                        if (strArr[4].length() == strArr[5].length()) {
                            A0v[2] = "eK1wjFwqyv9CJUk";
                            if (i5 <= i6) {
                                break;
                            }
                            fA05 -= this.A01.A04(i5) + f2;
                            i5--;
                        } else {
                            A0v[1] = "tUoZSKhLB59JJ";
                            if (i5 <= i6) {
                                break;
                            }
                            fA05 -= this.A01.A04(i5) + f2;
                            i5--;
                        }
                    }
                    fA05 -= c3e3.A01 + f2;
                    c3e3.A00 = fA05;
                    i5--;
                }
            }
        }
        int size2 = this.A0t.size();
        float fA06 = c3e.A00;
        int i7 = c3e.A02 - 1;
        float offset = c3e.A02 == 0 ? c3e.A00 : -3.4028235E38f;
        this.A02 = offset;
        if (c3e.A02 == pos - 1) {
            float f3 = c3e.A00;
            float offset2 = c3e.A01;
            f = (f3 + offset2) - 1.0f;
        } else {
            f = Float.MAX_VALUE;
        }
        this.A07 = f;
        int i8 = i - 1;
        while (i8 >= 0) {
            C3E c3e7 = this.A0t.get(i8);
            while (i7 > c3e7.A02) {
                int i9 = i7 - 1;
                fA06 -= this.A01.A04(i7) + f2;
                i7 = i9;
            }
            fA06 -= c3e7.A01 + f2;
            c3e7.A00 = fA06;
            if (c3e7.A02 == 0) {
                this.A02 = fA06;
            }
            i8--;
            i7--;
        }
        float fA07 = c3e.A00 + c3e.A01 + f2;
        int i10 = c3e.A02 + 1;
        int i11 = i + 1;
        while (i11 < size2) {
            C3E c3e8 = this.A0t.get(i11);
            while (i10 < c3e8.A02) {
                fA07 += this.A01.A04(i10) + f2;
                i10++;
            }
            int i12 = c3e8.A02;
            if (A0v[2].length() != 14) {
                String[] strArr2 = A0v;
                strArr2[3] = "LKMrFShf3NXE5XfaxsCGHUW3hns0S8Wh";
                strArr2[6] = "xptjAJKkekqR5TDnJjimQZvUd22mQJJ9";
                if (i12 == pos - 1) {
                    this.A07 = (c3e8.A01 + fA07) - 1.0f;
                }
            } else if (i12 == pos - 1) {
                this.A07 = (c3e8.A01 + fA07) - 1.0f;
            }
            c3e8.A00 = fA07;
            fA07 += c3e8.A01 + f2;
            i11++;
            i10++;
        }
        this.A0n = false;
    }

    private void A0R(boolean z) {
        boolean z2 = this.A0P == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (true ^ this.A0X.isFinished()) {
                this.A0X.abortAnimation();
                if (A0v[1].length() == 12) {
                    throw new RuntimeException();
                }
                A0v[1] = "La7";
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int oldX = this.A0X.getCurrX();
                int x = this.A0X.getCurrY();
                if (scrollX != oldX || scrollY != x) {
                    scrollTo(oldX, x);
                    if (oldX != scrollX) {
                        A0Z(oldX);
                    }
                }
            }
        }
        this.A0o = false;
        for (int i = 0; i < this.A0t.size(); i++) {
            C3E ii = this.A0t.get(i);
            if (ii.A04) {
                z2 = true;
                ii.A04 = false;
            }
        }
        if (z2) {
            if (z) {
                AnonymousClass38.A0D(this, this.A0s);
            } else {
                this.A0s.run();
            }
        }
    }

    private void A0S(boolean z) {
        int i;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (z) {
                i = this.A0N;
            } else {
                i = 0;
            }
            getChildAt(i2).setLayerType(i, null);
        }
    }

    private void A0T(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private boolean A0U() {
        this.A08 = -1;
        A09();
        this.A0V.onRelease();
        this.A0W.onRelease();
        return this.A0V.isFinished() || this.A0W.isFinished();
    }

    private final boolean A0V() {
        int i = this.A00;
        if (i > 0) {
            A0L(i - 1, true);
            return true;
        }
        return false;
    }

    private final boolean A0W() {
        AbstractC03102t abstractC03102t = this.A01;
        if (abstractC03102t != null && this.A00 < abstractC03102t.A05() - 1) {
            A0L(this.A00 + 1, true);
            return true;
        }
        if (A0v[2].length() == 14) {
            throw new RuntimeException();
        }
        String[] strArr = A0v;
        strArr[7] = "AXA5EDUbYu85ntxkUdYhY3hIIlQIUQar";
        strArr[0] = "7HhQN1X94o8BEMOAnE9vO9t08zapWTmy";
        return false;
    }

    private boolean A0X(float deltaX) {
        boolean z = false;
        float f = this.A05 - deltaX;
        this.A05 = deltaX;
        float scrollX = getScrollX() + f;
        int clientWidth = getClientWidth();
        float over = clientWidth * this.A02;
        float leftBound = this.A07;
        float f2 = clientWidth * leftBound;
        boolean z2 = true;
        boolean z3 = true;
        C3E c3e = this.A0t.get(0);
        ArrayList<C3E> arrayList = this.A0t;
        C3E c3e2 = arrayList.get(arrayList.size() - 1);
        if (c3e.A02 != 0) {
            z2 = false;
            float f3 = c3e.A00;
            int width = A0v[1].length();
            if (width == 12) {
                throw new RuntimeException();
            }
            A0v[1] = "a";
            over = f3 * clientWidth;
        }
        int width2 = c3e2.A02;
        if (width2 != this.A01.A05() - 1) {
            z3 = false;
            f2 = c3e2.A00 * clientWidth;
        }
        if (scrollX < over) {
            if (z2) {
                this.A0V.onPull(Math.abs(over - scrollX) / clientWidth);
                z = true;
            }
            scrollX = over;
        } else if (scrollX > f2) {
            if (z3) {
                EdgeEffect edgeEffect = this.A0W;
                float fAbs = Math.abs(scrollX - f2);
                float f4 = clientWidth;
                String[] strArr = A0v;
                String str = strArr[4];
                String str2 = strArr[5];
                int width3 = str.length();
                if (width3 != str2.length()) {
                    edgeEffect.onPull(fAbs / f4);
                    z = true;
                } else {
                    A0v[1] = "TwKB2lBmR";
                    edgeEffect.onPull(fAbs / f4);
                    z = true;
                }
            }
            scrollX = f2;
        }
        this.A05 += scrollX - ((int) scrollX);
        int width4 = (int) scrollX;
        scrollTo(width4, getScrollY());
        A0Z((int) scrollX);
        return z;
    }

    private final boolean A0Y(float f, float f2) {
        if (f >= this.A0I || f2 <= 0.0f) {
            if (f > getWidth() - this.A0I) {
                if (A0v[2].length() == 14) {
                    throw new RuntimeException();
                }
                String[] strArr = A0v;
                strArr[3] = "LoLbwLodEQ0RZhoADzk4YxqyeMxGbPNe";
                strArr[6] = "uXFtlpuRRgamX4n9Zkql1HjWorEkSQ7b";
                if (f2 < 0.0f) {
                }
            }
            return false;
        }
        return true;
    }

    private boolean A0Z(int i) {
        int size = this.A0t.size();
        String strA08 = A08(397, 53, 60);
        if (size == 0) {
            if (this.A0i) {
                return false;
            }
            this.A0g = false;
            A0I(0, 0.0f, 0);
            String[] strArr = A0v;
            if (strArr[4].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A0v[2] = "c3ramapljB1reDSufYjA";
            if (this.A0g) {
                return false;
            }
            throw new IllegalStateException(strA08);
        }
        C3E c3eA03 = A03();
        int clientWidth = getClientWidth();
        int i2 = this.A0M;
        int i3 = c3eA03.A02;
        float f = ((i / clientWidth) - c3eA03.A00) / (c3eA03.A01 + (i2 / clientWidth));
        int currentPage = (int) ((clientWidth + i2) * f);
        this.A0g = false;
        A0I(i3, f, currentPage);
        if (this.A0g) {
            return true;
        }
        throw new IllegalStateException(strA08);
    }

    private final boolean A0a(int i) {
        View nextFocused = findFocus();
        if (nextFocused == this) {
            nextFocused = null;
        } else if (nextFocused != null) {
            boolean z = false;
            for (ViewParent parent = nextFocused.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                if (parent == this) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                StringBuilder sb = new StringBuilder();
                sb.append(nextFocused.getClass().getSimpleName());
                for (ViewParent parent2 = nextFocused.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    sb.append(A08(0, 4, 21));
                    sb.append(parent2.getClass().getSimpleName());
                }
                Log.e(A08(RCHTTPStatusCodes.UNSUCCESSFUL, 9, 47), A08(309, 72, 80) + sb.toString());
                nextFocused = null;
            }
        }
        boolean zA0V = false;
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, nextFocused, i);
        if (viewFindNextFocus != null && viewFindNextFocus != nextFocused) {
            if (i == 17) {
                int i2 = A02(this.A0q, viewFindNextFocus).left;
                int currLeft = A02(this.A0q, nextFocused).left;
                zA0V = (nextFocused == null || i2 < currLeft) ? viewFindNextFocus.requestFocus() : A0V();
            } else if (i == 66) {
                int i3 = A02(this.A0q, viewFindNextFocus).left;
                int currLeft2 = A02(this.A0q, nextFocused).left;
                zA0V = (nextFocused == null || i3 > currLeft2) ? viewFindNextFocus.requestFocus() : A0W();
            }
        } else if (i == 17 || i == 1) {
            zA0V = A0V();
        } else if (i == 66 || i == 2) {
            zA0V = A0W();
        }
        if (zA0V) {
            int currLeft3 = SoundEffectConstants.getContantForFocusDirection(i);
            playSoundEffect(currLeft3);
        }
        return zA0V;
    }

    private final boolean A0b(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 21) {
            if (keyEvent.hasModifiers(2)) {
                return A0V();
            }
            return A0a(17);
        }
        if (keyCode == 22) {
            if (keyEvent.hasModifiers(2)) {
                return A0W();
            }
            return A0a(66);
        }
        if (keyCode != 61) {
            return false;
        }
        if (keyEvent.hasNoModifiers()) {
            return A0a(2);
        }
        boolean zHasModifiers = keyEvent.hasModifiers(1);
        String[] strArr = A0v;
        if (strArr[4].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        A0v[1] = "lC1XoLB2bpdljamdt6Vm";
        if (!zHasModifiers) {
            return false;
        }
        return A0a(1);
    }

    public static boolean A0c(@NonNull View view) {
        Class<?> clazz = view.getClass();
        return clazz.getAnnotation(ViewPager$DecorView.class) != null;
    }

    private final boolean A0d(View view, boolean z, int scrollX, int scrollY, int count) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX2 = view.getScrollX();
            int scrollY2 = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (scrollY + scrollX2 >= childAt.getLeft() && scrollY + scrollX2 < childAt.getRight() && count + scrollY2 >= childAt.getTop() && count + scrollY2 < childAt.getBottom()) {
                    int left = (scrollY + scrollX2) - childAt.getLeft();
                    int i = count + scrollY2;
                    if (A0v[1].length() == 12) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0v;
                    strArr[4] = "";
                    strArr[5] = "";
                    if (A0d(childAt, true, scrollX, left, i - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        return z && view.canScrollHorizontally(-scrollX);
    }

    public final void A0e() {
        int newCurrItem = this.A01.A05();
        this.A0G = newCurrItem;
        boolean z = this.A0t.size() < (this.A0L * 2) + 1 && this.A0t.size() < newCurrItem;
        int iMax = this.A00;
        boolean z2 = false;
        int i = 0;
        while (i < i) {
            C3E c3e = this.A0t.get(i);
            int iA06 = this.A01.A06(c3e.A03);
            if (iA06 != -1) {
                if (iA06 == -2) {
                    this.A0t.remove(i);
                    i--;
                    if (!z2) {
                        z2 = true;
                    }
                    this.A01.A0B(this, c3e.A02, c3e.A03);
                    z = true;
                    if (this.A00 == c3e.A02) {
                        iMax = Math.max(0, Math.min(this.A00, newCurrItem - 1));
                        z = true;
                    }
                } else if (c3e.A02 != iA06) {
                    if (c3e.A02 == this.A00) {
                        iMax = iA06;
                    }
                    c3e.A02 = iA06;
                    z = true;
                }
            }
            i++;
        }
        Collections.sort(this.A0t, A0z);
        if (z) {
            int newCurrItem2 = getChildCount();
            for (int i2 = 0; i2 < newCurrItem2; i2++) {
                View child = getChildAt(i2);
                C3F c3f = (C3F) child.getLayoutParams();
                if (!c3f.A05) {
                    c3f.A00 = 0.0f;
                }
            }
            A0N(iMax, false, true);
            if (A0v[2].length() == 14) {
                throw new RuntimeException();
            }
            A0v[2] = "iBz2AIJ6C";
            requestLayout();
        }
    }

    public final void A0f() {
        A0G(this.A00);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C3E c3eA07;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (c3eA07 = A07(childAt)) != null && c3eA07.A02 == this.A00) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
            return;
        }
        arrayList.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList<View> arrayList) {
        C3E c3eA07;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (c3eA07 = A07(childAt)) != null && c3eA07.A02 == this.A00) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C3F c3f = (C3F) layoutParams;
        c3f.A05 |= A0c(view);
        if (this.A0j) {
            if (!c3f.A05) {
                c3f.A03 = true;
                addViewInLayout(view, i, layoutParams);
                return;
            }
            throw new IllegalStateException(A08(86, 41, 16));
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.A01 == null) {
            return false;
        }
        int scrollX = getClientWidth();
        int scrollX2 = getScrollX();
        if (i < 0) {
            return scrollX2 > ((int) (((float) scrollX) * this.A02));
        }
        return i > 0 && scrollX2 < ((int) (((float) scrollX) * this.A07));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C3F) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.A0l = true;
        if (!this.A0X.isFinished() && this.A0X.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.A0X.getCurrX();
            int oldY = this.A0X.getCurrY();
            if (scrollX != currX || scrollY != oldY) {
                scrollTo(currX, oldY);
                if (!A0Z(currX)) {
                    this.A0X.abortAnimation();
                    scrollTo(0, oldY);
                }
            }
            AnonymousClass38.A07(this);
            return;
        }
        A0R(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || A0b(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C3E ii;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (ii = A07(childAt)) != null) {
                int i2 = ii.A02;
                String[] strArr = A0v;
                if (strArr[7].charAt(10) != strArr[0].charAt(10)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0v;
                strArr2[4] = "";
                strArr2[5] = "";
                if (i2 == this.A00 && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0038  */
    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0054  */
    /* JADX WARN: Code duplicated, block: B:21:0x0094  */
    /* JADX WARN: Code duplicated, block: B:25:0x00d5  */
    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean zIsFinished;
        super.draw(canvas);
        boolean zDraw = false;
        int overScrollMode = getOverScrollMode();
        if (overScrollMode == 0) {
            zIsFinished = this.A0V.isFinished();
            if (A0v[1].length() != 12) {
                A0v[1] = "sR19g1oBfMrUqPxbyG4ArbsnA";
                if (!zIsFinished) {
                    int iSave = canvas.save();
                    int width = (getHeight() - getPaddingTop()) - getPaddingBottom();
                    int width2 = getWidth();
                    canvas.rotate(270.0f);
                    int height = getPaddingTop();
                    canvas.translate((-width) + height, this.A02 * width2);
                    this.A0V.setSize(width, width2);
                    zDraw = false | this.A0V.draw(canvas);
                    canvas.restoreToCount(iSave);
                }
            } else {
                String[] strArr = A0v;
                strArr[4] = "";
                strArr[5] = "";
                if (!zIsFinished) {
                    int iSave2 = canvas.save();
                    int width3 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                    int width4 = getWidth();
                    canvas.rotate(270.0f);
                    int height2 = getPaddingTop();
                    canvas.translate((-width3) + height2, this.A02 * width4);
                    this.A0V.setSize(width3, width4);
                    zDraw = false | this.A0V.draw(canvas);
                    canvas.restoreToCount(iSave2);
                }
            }
            if (!this.A0W.isFinished()) {
                int iSave3 = canvas.save();
                int width5 = getWidth();
                int height3 = getHeight();
                int width6 = getPaddingTop();
                int i = height3 - width6;
                int width7 = getPaddingBottom();
                int height4 = i - width7;
                canvas.rotate(90.0f);
                int width8 = getPaddingTop();
                canvas.translate(-width8, (-(this.A07 + 1.0f)) * width5);
                this.A0W.setSize(height4, width5);
                zDraw |= this.A0W.draw(canvas);
                canvas.restoreToCount(iSave3);
            }
        } else {
            if (overScrollMode == 1) {
                AbstractC03102t abstractC03102t = this.A01;
                String[] strArr2 = A0v;
                if (strArr2[7].charAt(10) != strArr2[0].charAt(10)) {
                    throw new RuntimeException();
                }
                A0v[1] = "uCo1AgFx4bPu4bwpitwpleYcuNfeFds";
                if (abstractC03102t != null && abstractC03102t.A05() > 1) {
                    zIsFinished = this.A0V.isFinished();
                    if (A0v[1].length() != 12) {
                        A0v[1] = "sR19g1oBfMrUqPxbyG4ArbsnA";
                        if (!zIsFinished) {
                            int iSave4 = canvas.save();
                            int width9 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                            int width10 = getWidth();
                            canvas.rotate(270.0f);
                            int height5 = getPaddingTop();
                            canvas.translate((-width9) + height5, this.A02 * width10);
                            this.A0V.setSize(width9, width10);
                            zDraw = false | this.A0V.draw(canvas);
                            canvas.restoreToCount(iSave4);
                        }
                    } else {
                        String[] strArr3 = A0v;
                        strArr3[4] = "";
                        strArr3[5] = "";
                        if (!zIsFinished) {
                            int iSave5 = canvas.save();
                            int width11 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                            int width12 = getWidth();
                            canvas.rotate(270.0f);
                            int height6 = getPaddingTop();
                            canvas.translate((-width11) + height6, this.A02 * width12);
                            this.A0V.setSize(width11, width12);
                            zDraw = false | this.A0V.draw(canvas);
                            canvas.restoreToCount(iSave5);
                        }
                    }
                    if (!this.A0W.isFinished()) {
                        int iSave6 = canvas.save();
                        int width13 = getWidth();
                        int height7 = getHeight();
                        int width14 = getPaddingTop();
                        int i2 = height7 - width14;
                        int width15 = getPaddingBottom();
                        int height8 = i2 - width15;
                        canvas.rotate(90.0f);
                        int width16 = getPaddingTop();
                        canvas.translate(-width16, (-(this.A07 + 1.0f)) * width13);
                        this.A0W.setSize(height8, width13);
                        zDraw |= this.A0W.draw(canvas);
                        canvas.restoreToCount(iSave6);
                    }
                }
            }
            this.A0V.finish();
            this.A0W.finish();
        }
        if (zDraw) {
            AnonymousClass38.A07(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.A0S;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C3F();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C3F(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public AbstractC03102t getAdapter() {
        return this.A01;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return ((C3F) this.A0d.get(this.A0F == 2 ? (i - 1) - i2 : i2).getLayoutParams()).A01;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public int getCurrentItem() {
        return this.A00;
    }

    public int getOffscreenPageLimit() {
        return this.A0L;
    }

    public int getPageMargin() {
        return this.A0M;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0i = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.A0s);
        Scroller scroller = this.A0X;
        if (scroller != null && !scroller.isFinished()) {
            this.A0X.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        if (this.A0M > 0 && this.A0S != null && this.A0t.size() > 0 && this.A01 != null) {
            int firstPos = getScrollX();
            int lastPos = getWidth();
            float widthFactor = this.A0M / lastPos;
            int i = 0;
            C3E c3e = this.A0t.get(0);
            float f2 = c3e.A00;
            int size = this.A0t.size();
            int itemCount = size - 1;
            int itemCount2 = this.A0t.get(itemCount).A02;
            for (int i2 = c3e.A02; i2 < itemCount2; i2++) {
                while (i2 > pos && i < size) {
                    i++;
                    C3E c3e2 = this.A0t.get(i);
                    String[] strArr = A0v;
                    String str = strArr[7];
                    String str2 = strArr[0];
                    int iCharAt = str.charAt(10);
                    int pos = str2.charAt(10);
                    if (iCharAt != pos) {
                        throw new RuntimeException();
                    }
                    A0v[2] = "Qpfq";
                    c3e = c3e2;
                }
                int pos2 = c3e.A02;
                if (i2 == pos2) {
                    f = (c3e.A00 + c3e.A01) * lastPos;
                    f2 = c3e.A00 + c3e.A01 + widthFactor;
                } else {
                    float fA04 = this.A01.A04(i2);
                    float marginOffset = lastPos;
                    f = (f2 + fA04) * marginOffset;
                    f2 += fA04 + widthFactor;
                }
                int pos3 = this.A0M;
                if (pos3 + f > firstPos) {
                    this.A0S.setBounds(Math.round(f), this.A0Q, Math.round(this.A0M + f), this.A09);
                    Drawable drawable = this.A0S;
                    String[] strArr2 = A0v;
                    if (strArr2[7].charAt(10) != strArr2[0].charAt(10)) {
                        A0v[1] = "";
                        drawable.draw(canvas);
                    } else {
                        String[] strArr3 = A0v;
                        strArr3[4] = "";
                        strArr3[5] = "";
                        drawable.draw(canvas);
                    }
                }
                int i3 = firstPos + lastPos;
                if (A0v[1].length() == 12) {
                    throw new RuntimeException();
                }
                A0v[1] = "DrXdt";
                float marginOffset2 = i3;
                if (f > marginOffset2) {
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            A0U();
            String[] strArr = A0v;
            if (strArr[4].length() == strArr[5].length()) {
                A0v[2] = "iW5W";
                return false;
            }
        } else {
            if (action != 0) {
                if (this.A0k) {
                    return true;
                }
                if (this.A0m) {
                    return false;
                }
            }
            if (action != 0) {
                if (action == 2) {
                    int i = this.A08;
                    if (i != -1) {
                        int pointerIndex = motionEvent.findPointerIndex(i);
                        float x = motionEvent.getX(pointerIndex);
                        float x2 = this.A05;
                        float f2 = x - x2;
                        float fAbs = Math.abs(f2);
                        float y = motionEvent.getY(pointerIndex);
                        float dx = this.A04;
                        float fAbs2 = Math.abs(y - dx);
                        if (f2 != 0.0f && !A0Y(this.A05, f2) && A0d(this, false, (int) f2, (int) x, (int) y)) {
                            this.A05 = x;
                            this.A06 = y;
                            this.A0m = true;
                            return false;
                        }
                        float f3 = this.A0R;
                        if (A0v[1].length() != 12) {
                            String[] strArr2 = A0v;
                            strArr2[7] = "NnThZj9Wv9885vPNkfCF8DoAZte0LwUX";
                            strArr2[0] = "g2aolHvSBW8By3vUeqDyYWaFAgdqNGTo";
                            if (fAbs > f3 && 0.5f * fAbs > fAbs2) {
                                this.A0k = true;
                                A0T(true);
                                setScrollState(1);
                                if (f2 <= 0.0f) {
                                    f = this.A03 - this.A0R;
                                } else {
                                    float f4 = this.A03;
                                    int i2 = this.A0R;
                                    String[] strArr3 = A0v;
                                    if (strArr3[7].charAt(10) != strArr3[0].charAt(10)) {
                                        f = f4 + i2;
                                    } else {
                                        String[] strArr4 = A0v;
                                        strArr4[7] = "WpQimEPBWZ8vG05HKhTxshBMY3NNEur0";
                                        strArr4[0] = "BEtp4ufX6D8x3OZlDxdpMoFh1oKQqP0t";
                                        f = f4 + i2;
                                    }
                                }
                                this.A05 = f;
                                this.A06 = y;
                                setScrollingCacheEnabled(true);
                            } else if (fAbs2 > this.A0R) {
                                this.A0m = true;
                            }
                            if (this.A0k && A0X(x)) {
                                AnonymousClass38.A07(this);
                            }
                        }
                    }
                } else if (action == 6) {
                    A0P(motionEvent);
                }
            } else {
                float yDiff = motionEvent.getX();
                this.A03 = yDiff;
                this.A05 = yDiff;
                float y2 = motionEvent.getY();
                this.A04 = y2;
                this.A06 = y2;
                this.A08 = motionEvent.getPointerId(0);
                this.A0m = false;
                this.A0l = true;
                this.A0X.computeScrollOffset();
                if (this.A0P != 2 || Math.abs(this.A0X.getFinalX() - this.A0X.getCurrX()) <= this.A0C) {
                    A0R(false);
                    this.A0k = false;
                } else {
                    this.A0X.abortAnimation();
                    this.A0o = false;
                    A0f();
                    this.A0k = true;
                    A0T(true);
                    setScrollState(1);
                }
            }
            if (this.A0U == null) {
                this.A0U = VelocityTracker.obtain();
            }
            this.A0U.addMovement(motionEvent);
            return this.A0k;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0087  */
    /* JADX WARN: Code duplicated, block: B:27:0x009d  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e7  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        C3E c3eA07;
        int iMax;
        int iMax2;
        String[] strArr;
        int paddingBottom = getChildCount();
        int childTop = i3 - i;
        int i5 = i4 - i2;
        int i6 = getPaddingLeft();
        int childLeft = getPaddingTop();
        int paddingRight = getPaddingRight();
        int vgrav = getPaddingBottom();
        int childTop2 = getScrollX();
        int hgrav = 0;
        int paddingLeft = 0;
        while (true) {
            int count = 8;
            String[] strArr2 = A0v;
            if (strArr2[4].length() != strArr2[5].length()) {
                break;
            }
            A0v[1] = "";
            if (paddingLeft < paddingBottom) {
                View childAt = getChildAt(paddingLeft);
                if (childAt.getVisibility() != 8) {
                    C3F c3f = (C3F) childAt.getLayoutParams();
                    if (c3f.A05) {
                        int i7 = c3f.A04 & 7;
                        int i8 = c3f.A04 & 112;
                        if (i7 == 1) {
                            int measuredWidth = childAt.getMeasuredWidth();
                            if (A0v[1].length() == 12) {
                                break;
                            }
                            A0v[1] = "cEG6crY";
                            int paddingTop = childTop - measuredWidth;
                            iMax = Math.max(paddingTop / 2, i6);
                        } else if (i7 == 3) {
                            iMax = i6;
                            int paddingTop2 = childAt.getMeasuredWidth();
                            i6 += paddingTop2;
                        } else if (i7 != 5) {
                            iMax = i6;
                        } else {
                            int paddingTop3 = childAt.getMeasuredWidth();
                            iMax = (childTop - paddingRight) - paddingTop3;
                            int paddingTop4 = childAt.getMeasuredWidth();
                            paddingRight += paddingTop4;
                        }
                        if (i8 != 16) {
                            String[] strArr3 = A0v;
                            if (strArr3[4].length() == strArr3[5].length()) {
                                String[] strArr4 = A0v;
                                strArr4[7] = "MABJA51Hkg88aIvdKLNPKtpDPx4feUgS";
                                strArr4[0] = "re5uoSp4mr8xr4T7F9jmqa7JfXqBIVyF";
                                if (i8 != 48) {
                                    strArr = A0v;
                                    if (strArr[7].charAt(10) != strArr[0].charAt(10)) {
                                        A0v[2] = "D8xV1TWmEwTp2AdSb5ATv3";
                                        if (i8 != 80) {
                                            iMax2 = childLeft;
                                        } else {
                                            int paddingTop5 = childAt.getMeasuredHeight();
                                            iMax2 = (i5 - vgrav) - paddingTop5;
                                            int paddingTop6 = childAt.getMeasuredHeight();
                                            vgrav += paddingTop6;
                                        }
                                    } else {
                                        String[] strArr5 = A0v;
                                        strArr5[3] = "1ewPUp1k8Pl5lyl6fUi6LymHiaJ9xmay";
                                        strArr5[6] = "wiWTa2PhZxJDNWnFVxR2jmvUAFeWjohE";
                                        if (i8 != 80) {
                                            iMax2 = childLeft;
                                        } else {
                                            int paddingTop7 = childAt.getMeasuredHeight();
                                            iMax2 = (i5 - vgrav) - paddingTop7;
                                            int paddingTop8 = childAt.getMeasuredHeight();
                                            vgrav += paddingTop8;
                                        }
                                    }
                                } else {
                                    iMax2 = childLeft;
                                    int paddingTop9 = childAt.getMeasuredHeight();
                                    childLeft += paddingTop9;
                                }
                            } else if (i8 != 48) {
                                strArr = A0v;
                                if (strArr[7].charAt(10) != strArr[0].charAt(10)) {
                                    A0v[2] = "D8xV1TWmEwTp2AdSb5ATv3";
                                    if (i8 != 80) {
                                        iMax2 = childLeft;
                                    } else {
                                        int paddingTop10 = childAt.getMeasuredHeight();
                                        iMax2 = (i5 - vgrav) - paddingTop10;
                                        int paddingTop11 = childAt.getMeasuredHeight();
                                        vgrav += paddingTop11;
                                    }
                                } else {
                                    String[] strArr6 = A0v;
                                    strArr6[3] = "1ewPUp1k8Pl5lyl6fUi6LymHiaJ9xmay";
                                    strArr6[6] = "wiWTa2PhZxJDNWnFVxR2jmvUAFeWjohE";
                                    if (i8 != 80) {
                                        iMax2 = childLeft;
                                    } else {
                                        int paddingTop12 = childAt.getMeasuredHeight();
                                        iMax2 = (i5 - vgrav) - paddingTop12;
                                        int paddingTop13 = childAt.getMeasuredHeight();
                                        vgrav += paddingTop13;
                                    }
                                }
                            } else {
                                iMax2 = childLeft;
                                int paddingTop14 = childAt.getMeasuredHeight();
                                childLeft += paddingTop14;
                            }
                        } else {
                            int paddingTop15 = childAt.getMeasuredHeight();
                            iMax2 = Math.max((i5 - paddingTop15) / 2, childLeft);
                        }
                        int i9 = iMax + childTop2;
                        int measuredWidth2 = childAt.getMeasuredWidth() + i9;
                        int paddingTop16 = childAt.getMeasuredHeight();
                        childAt.layout(i9, iMax2, measuredWidth2, paddingTop16 + iMax2);
                        hgrav++;
                    } else {
                        continue;
                    }
                }
                paddingLeft++;
            } else {
                int childTop3 = (childTop - i6) - paddingRight;
                int i10 = 0;
                while (i10 < paddingBottom) {
                    View childAt2 = getChildAt(i10);
                    int paddingTop17 = childAt2.getVisibility();
                    if (paddingTop17 != count) {
                        C3F lp = (C3F) childAt2.getLayoutParams();
                        if (!lp.A05 && (c3eA07 = A07(childAt2)) != null) {
                            float f = childTop3;
                            String[] strArr7 = A0v;
                            String str = strArr7[4];
                            String str2 = strArr7[5];
                            int length = str.length();
                            int paddingTop18 = str2.length();
                            if (length != paddingTop18) {
                                break;
                            }
                            String[] strArr8 = A0v;
                            strArr8[4] = "";
                            strArr8[5] = "";
                            int paddingTop19 = (int) (f * c3eA07.A00);
                            int i11 = i6 + paddingTop19;
                            if (lp.A03) {
                                lp.A03 = false;
                                int width = (int) (childTop3 * lp.A00);
                                int loff = View.MeasureSpec.makeMeasureSpec(width, 1073741824);
                                int width2 = i5 - childLeft;
                                int paddingLeft2 = width2 - vgrav;
                                childAt2.measure(loff, View.MeasureSpec.makeMeasureSpec(paddingLeft2, 1073741824));
                            }
                            int count2 = childAt2.getMeasuredWidth();
                            int loff2 = childAt2.getMeasuredHeight();
                            int paddingLeft3 = childLeft;
                            childAt2.layout(i11, paddingLeft3, count2 + i11, loff2 + paddingLeft3);
                        }
                    }
                    i10++;
                    count = 8;
                }
                this.A0Q = childLeft;
                this.A09 = i5 - vgrav;
                this.A0D = hgrav;
                if (this.A0i) {
                    int loff3 = this.A00;
                    z2 = false;
                    A0M(loff3, false, 0, false);
                } else {
                    z2 = false;
                }
                this.A0i = z2;
                return;
            }
        }
        throw new RuntimeException();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        C3F c3f;
        int i3;
        int i4;
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        int maxGutterSize = measuredWidth / 10;
        this.A0I = Math.min(maxGutterSize, this.A0E);
        int maxGutterSize2 = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredWidth2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            int size = childAt.getVisibility();
            if (size != 8) {
                C3F c3f2 = (C3F) childAt.getLayoutParams();
                int childWidthSize = A0v[1].length();
                if (childWidthSize == 12) {
                    throw new RuntimeException();
                }
                String[] strArr = A0v;
                strArr[4] = "";
                strArr[5] = "";
                if (c3f2 != null && c3f2.A05) {
                    int i6 = c3f2.A04 & 7;
                    int hgrav = c3f2.A04;
                    int i7 = hgrav & 112;
                    int i8 = Integer.MIN_VALUE;
                    int i9 = Integer.MIN_VALUE;
                    boolean z = i7 == 48 || i7 == 80;
                    boolean z2 = i6 == 3 || i6 == 5;
                    if (z) {
                        i8 = 1073741824;
                    } else if (z2) {
                        i9 = 1073741824;
                    }
                    if (c3f2.width != -2) {
                        i8 = 1073741824;
                        if (c3f2.width != -1) {
                            i3 = c3f2.width;
                        } else {
                            i3 = maxGutterSize2;
                        }
                    } else {
                        i3 = maxGutterSize2;
                    }
                    if (c3f2.height != -2) {
                        i9 = 1073741824;
                        if (c3f2.height != -1) {
                            i4 = c3f2.height;
                            if (A0v[1].length() != 12) {
                                A0v[1] = "VKsSzAx6pk9J5wmYrW5ACp";
                            }
                        } else {
                            i4 = measuredWidth2;
                        }
                    } else {
                        i4 = measuredWidth2;
                    }
                    int widthSpec = View.MeasureSpec.makeMeasureSpec(i3, i8);
                    int heightMode = View.MeasureSpec.makeMeasureSpec(i4, i9);
                    childAt.measure(widthSpec, heightMode);
                    if (z) {
                        int heightMode2 = childAt.getMeasuredHeight();
                        measuredWidth2 -= heightMode2;
                    } else if (z2) {
                        maxGutterSize2 -= childAt.getMeasuredWidth();
                    }
                }
            }
        }
        int heightMode3 = View.MeasureSpec.makeMeasureSpec(maxGutterSize2, 1073741824);
        this.A0B = heightMode3;
        int heightMode4 = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
        this.A0A = heightMode4;
        this.A0j = true;
        A0f();
        this.A0j = false;
        int childCount2 = getChildCount();
        for (int i10 = 0; i10 < childCount2; i10++) {
            View childAt2 = getChildAt(i10);
            if (childAt2.getVisibility() != 8 && ((c3f = (C3F) childAt2.getLayoutParams()) == null || !c3f.A05)) {
                float f = maxGutterSize2;
                String[] strArr2 = A0v;
                if (strArr2[4].length() != strArr2[5].length()) {
                    throw new RuntimeException();
                }
                A0v[1] = "11cm9STM7FlxGR3";
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) (f * c3f.A00), 1073741824);
                int widthSpec2 = this.A0A;
                childAt2.measure(iMakeMeasureSpec, widthSpec2);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int index, Rect rect) {
        int i;
        int i2;
        C3E c3eA07;
        int end = getChildCount();
        if ((index & 2) != 0) {
            i = 0;
            i2 = 1;
        } else {
            i = end - 1;
            i2 = -1;
            end = -1;
        }
        while (i != end) {
            View childAt = getChildAt(i);
            if (A0v[2].length() == 14) {
                throw new RuntimeException();
            }
            String[] strArr = A0v;
            strArr[3] = "wvs0VrXDMEHK1ZrgMliCmQkmYIqFRPYZ";
            strArr[6] = "yeuyy9yC0QSIfk9tyj8D1No5khczL5F7";
            int i3 = childAt.getVisibility();
            if (i3 == 0 && (c3eA07 = A07(childAt)) != null) {
                int i4 = c3eA07.A02;
                int i5 = this.A00;
                if (i4 == i5 && childAt.requestFocus(index, rect)) {
                    return true;
                }
            }
            i += i2;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof WrappedParcelable)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            Context context = getContext();
            String[] strArr = A0v;
            if (strArr[3].charAt(15) == strArr[6].charAt(15)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0v;
            strArr2[7] = "Ly8LvMv3iU8o2fiJAVqvd6K7Aqz3gZKY";
            strArr2[0] = "HcNmsPXina8Ul250FP3kUGj1pgK53N1r";
            classLoader = context.getClassLoader();
        }
        Parcelable parcelableUnwrap = ((WrappedParcelable) parcelable).unwrap(classLoader);
        if (!(parcelableUnwrap instanceof ViewPager$SavedState)) {
            super.onRestoreInstanceState(parcelableUnwrap);
            return;
        }
        ViewPager$SavedState viewPager$SavedState = (ViewPager$SavedState) parcelableUnwrap;
        super.onRestoreInstanceState(viewPager$SavedState.A02());
        if (this.A01 != null) {
            A0N(viewPager$SavedState.A00, false, true);
            return;
        }
        this.A0O = viewPager$SavedState.A00;
        this.A0T = viewPager$SavedState.A01;
        this.A0c = viewPager$SavedState.A02;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ViewPager$SavedState viewPager$SavedState = new ViewPager$SavedState(super.onSaveInstanceState());
        viewPager$SavedState.A00 = this.A00;
        AbstractC03102t abstractC03102t = this.A01;
        if (abstractC03102t != null) {
            viewPager$SavedState.A01 = abstractC03102t.A07();
        }
        return new WrappedParcelable(viewPager$SavedState);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.A0M;
            A0K(i, i3, i5, i5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00d8  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC03102t abstractC03102t;
        float f;
        if (this.A0h) {
            return true;
        }
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (abstractC03102t = this.A01) == null || abstractC03102t.A05() == 0) {
            return false;
        }
        if (this.A0U == null) {
            this.A0U = VelocityTracker.obtain();
        }
        this.A0U.addMovement(motionEvent);
        boolean zA0U = false;
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.A0X.abortAnimation();
            this.A0o = false;
            A0f();
            float x = motionEvent.getX();
            this.A03 = x;
            this.A05 = x;
            float y = motionEvent.getY();
            this.A04 = y;
            this.A06 = y;
            this.A08 = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        float x2 = motionEvent.getX(actionIndex);
                        this.A05 = x2;
                        this.A08 = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        A0P(motionEvent);
                        this.A05 = motionEvent.getX(motionEvent.findPointerIndex(this.A08));
                    }
                } else if (this.A0k) {
                    A0M(this.A00, true, 0, false);
                    zA0U = A0U();
                }
            } else if (!this.A0k) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.A08);
                if (iFindPointerIndex == -1) {
                    zA0U = A0U();
                } else {
                    float x3 = motionEvent.getX(iFindPointerIndex);
                    float fAbs = Math.abs(x3 - this.A05);
                    float xDiff = motionEvent.getY(iFindPointerIndex);
                    float y2 = this.A06;
                    float fAbs2 = Math.abs(xDiff - y2);
                    float yDiff = this.A0R;
                    if (fAbs > yDiff && fAbs > fAbs2) {
                        this.A0k = true;
                        A0T(true);
                        float f2 = this.A03;
                        if (x3 - f2 > 0.0f) {
                            float yDiff2 = this.A0R;
                            f = f2 + yDiff2;
                        } else {
                            f = f2 - this.A0R;
                        }
                        this.A05 = f;
                        this.A06 = xDiff;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.A0k) {
                        int activePointerIndex = motionEvent.findPointerIndex(this.A08);
                        zA0U = false | A0X(motionEvent.getX(activePointerIndex));
                    }
                }
            } else if (this.A0k) {
                int activePointerIndex2 = motionEvent.findPointerIndex(this.A08);
                zA0U = false | A0X(motionEvent.getX(activePointerIndex2));
            }
        } else if (this.A0k) {
            VelocityTracker velocityTracker = this.A0U;
            velocityTracker.computeCurrentVelocity(AdError.NETWORK_ERROR_CODE, this.A0J);
            int xVelocity = (int) velocityTracker.getXVelocity(this.A08);
            this.A0o = true;
            int clientWidth = getClientWidth();
            int width = getScrollX();
            C3E c3eA03 = A03();
            int scrollX = this.A0M;
            int i = c3eA03.A02;
            float f3 = ((width / clientWidth) - c3eA03.A00) / (c3eA03.A01 + (scrollX / clientWidth));
            int currentPage = this.A08;
            int activePointerIndex3 = motionEvent.findPointerIndex(currentPage);
            float x4 = motionEvent.getX(activePointerIndex3);
            float x5 = this.A03;
            A0O(A01(i, f3, xVelocity, (int) (x4 - x5)), true, true, xVelocity);
            zA0U = A0U();
        }
        if (zA0U) {
            AnonymousClass38.A07(this);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.A0j) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [com.facebook.ads.redexgen.X.3J] */
    public void setAdapter(AbstractC03102t abstractC03102t) {
        AbstractC03102t abstractC03102t2 = this.A01;
        if (abstractC03102t2 != null) {
            abstractC03102t2.A0A(null);
            for (int i = 0; i < this.A0t.size(); i++) {
                C3E c3e = this.A0t.get(i);
                this.A01.A0B(this, c3e.A02, c3e.A03);
            }
            this.A0t.clear();
            A0A();
            this.A00 = 0;
            scrollTo(0, 0);
        }
        this.A01 = abstractC03102t;
        this.A0G = 0;
        if (this.A01 != null) {
            if (this.A0b == null) {
                this.A0b = new DataSetObserver() { // from class: com.facebook.ads.redexgen.X.3J
                    @Override // android.database.DataSetObserver
                    public final void onChanged() {
                        this.A00.A0e();
                    }

                    @Override // android.database.DataSetObserver
                    public final void onInvalidated() {
                        this.A00.A0e();
                    }
                };
            }
            this.A01.A0A(this.A0b);
            this.A0o = false;
            boolean z = this.A0i;
            this.A0i = true;
            this.A0G = this.A01.A05();
            if (this.A0O >= 0) {
                A0N(this.A0O, false, true);
                this.A0O = -1;
                this.A0T = null;
                this.A0c = null;
            } else if (!z) {
                A0f();
            } else {
                requestLayout();
            }
        }
        List<ViewPager.OnAdapterChangeListener> list = this.A0e;
        if (list != null && !list.isEmpty()) {
            int count = this.A0e.size();
            if (0 < count) {
                this.A0e.get(0);
                throw new NullPointerException(A08(381, 16, 117));
            }
        }
    }

    public void setCurrentItem(int i) {
        this.A0o = false;
        A0N(i, !this.A0i, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w(A08(RCHTTPStatusCodes.UNSUCCESSFUL, 9, 47), A08(127, 31, 60) + i + A08(51, 26, 90) + 1);
            i = 1;
        }
        if (i != this.A0L) {
            this.A0L = i;
            A0f();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(C3H c3h) {
        this.A0Z = c3h;
    }

    public void setPageMargin(int width) {
        int i = this.A0M;
        this.A0M = width;
        int width2 = getWidth();
        A0K(width2, width2, width, i);
        requestLayout();
    }

    public void setPageMarginDrawable(@DrawableRes int i) {
        setPageMarginDrawable(C2P.A00(getContext(), i));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.A0S = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i) {
        if (this.A0P == i) {
            return;
        }
        this.A0P = i;
        if (this.A0a != null) {
            A0S(i != 0);
        }
        A0F(i);
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.A0p != z) {
            this.A0p = z;
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.A0S;
    }
}
