package com.facebook.ads.redexgen.X;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView;
import com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$SavedState;
import com.facebook.ads.internal.util.parcelable.WrappedParcelable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class F9 extends ViewGroup implements InterfaceC1276cQ {
    public static byte[] A18;
    public static String[] A19 = {"EzQ8zede2M", "Jhjgeach8ubRdn89CHbftPIFCkhy8Cmz", "AI0RoC", "LwFgY3t3Qwi2PJUU36Pvm2", "gOCwMU1oDfpLVyXTNaTi7eQdHjis00sx", "GZYggCcl1OWg4VOzBYKk2kBvqjxmktta", "Te26Sy6xLG0KtVPzJaOHws0Kts3F9NRb", "K773CdyIAwEU"};
    public static final Interpolator A1A;
    public static final boolean A1B;
    public static final boolean A1C;
    public static final boolean A1D;
    public static final boolean A1E;
    public static final boolean A1F;
    public static final boolean A1G;
    public static final int[] A1H;
    public static final int[] A1I;
    public static final Class<?>[] A1J;
    public C1265cD A00;
    public C03333r A01;
    public C1264cC A02;
    public AnonymousClass44 A03;
    public C4H A04;
    public C4P A05;

    @VisibleForTesting
    public C4T A06;
    public InterfaceC03434c A07;
    public RunnableC03514k A08;
    public C1251by A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;

    @VisibleForTesting
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public float A0L;
    public float A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public int A0R;
    public int A0S;
    public int A0T;
    public int A0U;
    public int A0V;
    public int A0W;
    public int A0X;
    public VelocityTracker A0Y;
    public EdgeEffect A0Z;
    public EdgeEffect A0a;
    public EdgeEffect A0b;
    public EdgeEffect A0c;
    public C03072q A0d;
    public C4K A0e;
    public C4N A0f;
    public C4W A0g;
    public C4X A0h;
    public C4Y A0i;
    public RecyclerView$SavedState A0j;
    public Runnable A0k;
    public List<RecyclerView.OnChildAttachStateChangeListener> A0l;
    public List<C4Y> A0m;
    public boolean A0n;
    public boolean A0o;
    public final Rect A0p;
    public final RectF A0q;
    public final C03424b A0r;
    public final C03494i A0s;
    public final C03604t A0t;
    public final Runnable A0u;
    public final ArrayList<C4Q> A0v;

    @VisibleForTesting
    public final List<AbstractC03524l> A0w;
    public final int A0x;
    public final int A0y;
    public final Rect A0z;
    public final AccessibilityManager A10;
    public final C1253c1 A11;
    public final InterfaceC03594s A12;
    public final ArrayList<C4X> A13;
    public final int[] A14;
    public final int[] A15;
    public final int[] A16;
    public final int[] A17;

    public static String A0J(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A18, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 85);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0X() {
        A18 = new byte[]{-74, -74, -96, -74, -20, -1, -5, 13, -74, -34, 5, 2, -6, -5, 8, -74, -56, -48, -100, -33, -35, -22, -22, -21, -16, -100, -34, -31, -100, -30, -21, -15, -22, -32, -100, -34, -15, -16, -100, -27, -16, -100, -27, -17, -100, -22, -31, -33, -31, -17, -17, -35, -18, -11, -100, -30, -21, -18, -100, 126, -57, -47, 126, -65, -54, -48, -61, -65, -62, -41, 126, -65, -46, -46, -65, -63, -58, -61, -62, 126, -46, -51, 126, -65, 126, -80, -61, -63, -41, -63, -54, -61, -48, -76, -57, -61, -43, -104, -12, 61, 71, -12, 66, 67, 72, -12, 53, -12, 56, 61, 70, 57, 55, 72, -12, 55, 60, 61, 64, 56, -12, 67, 58, -12, -93, -15, -14, -9, -93, -23, -14, -8, -15, -25, -79, -93, -57, -20, -25, -93, -28, -15, -4, -93, -48, -14, -9, -20, -14, -15, -56, -7, -24, -15, -9, -10, -93, -22, -24, -9, -93, -10, -18, -20, -13, -13, -24, -25, -62, -45, -57, 8, 11, 8, 23, 27, 12, 25, -31, -117, 127, -62, -50, -51, -45, -60, -41, -45, -103, -56, -68, 8, -3, 21, 11, 17, 16, -42, 9, -18, 67, 65, 55, 60, 53, -18, 50, 51, 52, 47, 67, 58, 66, -18, 68, 47, 58, 67, 51, -67, -37, -26, -26, -33, -34, -102, -20, -33, -25, -23, -16, -33, -66, -33, -18, -37, -35, -30, -33, -34, -48, -29, -33, -15, -102, -15, -29, -18, -30, -102, -37, -102, -16, -29, -33, -15, -102, -15, -30, -29, -35, -30, -102, -29, -19, -102, -24, -23, -18, -102, -32, -26, -37, -31, -31, -33, -34, -102, -37, -19, -102, -18, -25, -22, -102, -34, -33, -18, -37, -35, -30, -33, -34, -88, -80, -50, -37, -37, -36, -31, -115, -48, -50, -39, -39, -115, -31, -43, -42, -32, -115, -38, -46, -31, -43, -36, -47, -115, -42, -37, -115, -50, -115, -32, -48, -33, -36, -39, -39, -115, -48, -50, -39, -39, -49, -50, -48, -40, -101, -115, -64, -48, -33, -36, -39, -39, -115, -48, -50, -39, -39, -49, -50, -48, -40, -32, -115, -38, -42, -44, -43, -31, -49, -46, -115, -33, -30, -37, -115, -47, -30, -33, -42, -37, -44, -115, -50, -115, -38, -46, -50, -32, -30, -33, -46, -115, -109, -115, -39, -50, -26, -36, -30, -31, -115, -35, -50, -32, -32, -115, -28, -43, -46, -33, -46, -115, -26, -36, -30, -115, -48, -50, -37, -37, -36, -31, -115, -48, -43, -50, -37, -44, -46, -115, -31, -43, -46, -65, -46, -48, -26, -48, -39, -46, -33, -61, -42, -46, -28, -115, -47, -50, -31, -50, -101, -115, -82, -37, -26, -115, -38, -46, -31, -43, -36, -47, -115, -48, -50, -39, -39, -115, -31, -43, -50, -31, -115, -38, -42, -44, -43, -31, -115, -48, -43, -50, -37, -44, -46, -115, -31, -43, -46, -115, -32, -31, -33, -30, -48, -31, -30, -33, -46, -36, -45, -115, -31, -43, -46, -115, -65, -46, -48, -26, -48, -39, -46, -33, -61, -42, -46, -28, -115, -36, -33, -115, -31, -43, -46, -115, -50, -47, -50, -35, -31, -46, -33, -115, -48, -36, -37, -31, -46, -37, -31, -32, -115, -32, -43, -36, -30, -39, -47, -115, -49, -46, -115, -35, -36, -32, -31, -35, -36, -37, -46, -47, -115, -31, -36, -31, -43, -46, -115, -37, -46, -27, -31, -115, -45, -33, -50, -38, -46, -101, -55, -25, -12, -12, -11, -6, -90, -23, -25, -14, -14, -90, -6, -18, -17, -7, -90, -13, -21, -6, -18, -11, -22, -90, -3, -18, -17, -14, -21, -90, -40, -21, -23, -1, -23, -14, -21, -8, -36, -17, -21, -3, -90, -17, -7, -90, -23, -11, -13, -10, -5, -6, -17, -12, -19, -90, -25, -90, -14, -25, -1, -11, -5, -6, -90, -11, -8, -90, -7, -23, -8, -11, -14, -14, -17, -12, -19, -28, 2, 15, 15, 16, 21, -63, 7, 13, 10, 15, 8, -63, 24, 10, 21, 9, 16, 22, 21, -63, 2, -63, -19, 2, 26, 16, 22, 21, -18, 2, 15, 2, 8, 6, 19, -63, 20, 6, 21, -49, -63, -28, 2, 13, 13, -63, 20, 6, 21, -19, 2, 26, 16, 22, 21, -18, 2, 15, 2, 8, 6, 19, -63, 24, 10, 21, 9, -63, 2, -63, 15, 16, 15, -50, 15, 22, 13, 13, -63, 2, 19, 8, 22, 14, 6, 15, 21, -49, -35, -5, 8, 8, 9, 14, -70, 13, -3, 12, 9, 6, 6, -70, 14, 9, -70, 10, 9, 13, 3, 14, 3, 9, 8, -70, -5, -70, -26, -5, 19, 9, 15, 14, -25, -5, 8, -5, 1, -1, 12, -70, 13, -1, 14, -56, -70, -35, -5, 6, 6, -70, 13, -1, 14, -26, -5, 19, 9, 15, 14, -25, -5, 8, -5, 1, -1, 12, -70, 17, 3, 14, 2, -70, -5, -70, 8, 9, 8, -57, 8, 15, 6, 6, -70, -5, 12, 1, 15, 7, -1, 8, 14, -56, -33, -3, 10, 10, 11, 16, -68, 15, -1, 14, 11, 8, 8, -68, 19, 5, 16, 4, 11, 17, 16, -68, -3, -68, -24, -3, 21, 11, 17, 16, -23, -3, 10, -3, 3, 1, 14, -68, 15, 1, 16, -54, -68, -33, -3, 8, 8, -68, 15, 1, 16, -24, -3, 21, 11, 17, 16, -23, -3, 10, -3, 3, 1, 14, -68, 19, 5, 16, 4, -68, -3, -68, 10, 11, 10, -55, 10, 17, 8, 8, -68, -3, 14, 3, 17, 9, 1, 10, 16, -54, -29, 1, 14, 14, 15, 20, -64, 19, 13, 15, 15, 20, 8, -64, 19, 3, 18, 15, 12, 12, -64, 23, 9, 20, 8, 15, 21, 20, -64, 1, -64, -20, 1, 25, 15, 21, 20, -19, 1, 14, 1, 7, 5, 18, -64, 19, 5, 20, -50, -64, -29, 1, 12, 12, -64, 19, 5, 20, -20, 1, 25, 15, 21, 20, -19, 1, 14, 1, 7, 5, 18, -64, 23, 9, 20, 8, 
        -64, 1, -64, 14, 15, 14, -51, 14, 21, 12, 12, -64, 1, 18, 7, 21, 13, 5, 14, 20, -50, -18, 25, -54, 24, 25, 30, -54, 29, 15, 30, -10, 11, 35, 25, 31, 30, -16, 28, 25, 36, 15, 24, -54, 19, 24, -54, 22, 11, 35, 25, 31, 30, -54, 25, 28, -54, 29, 13, 28, 25, 22, 22, -52, -7, -7, -10, -7, -89, -9, -7, -10, -22, -20, -6, -6, -16, -11, -18, -89, -6, -22, -7, -10, -13, -13, -62, -89, -9, -10, -16, -11, -5, -20, -7, -89, -16, -11, -21, -20, -1, -89, -19, -10, -7, -89, -16, -21, -89, -7, 14, 38, 28, 34, 33, -6, 14, 27, 14, 20, 18, 31, -51, -53, -20, -99, -34, -31, -34, -19, -15, -30, -17, -99, -34, -15, -15, -34, -32, -27, -30, -31, -72, -99, -16, -24, -26, -19, -19, -26, -21, -28, -99, -23, -34, -10, -20, -14, -15, -52, -19, -98, -22, -33, -9, -19, -13, -14, -98, -21, -33, -20, -33, -27, -29, -16, -98, -33, -14, -14, -33, -31, -26, -29, -30, -71, -98, -15, -23, -25, -18, -18, -25, -20, -27, -98, -22, -33, -9, -19, -13, -14, -1, 33, 30, 17, 27, 20, 28, -49, 38, 23, 24, 27, 20, -49, 28, 16, 35, 18, 23, 24, 29, 22, -49, 18, 23, 16, 29, 22, 20, 19, -49, 37, 24, 20, 38, -49, 23, 30, 27, 19, 20, 33, 34, -49, 38, 24, 35, 23, -49, 35, 23, 20, -49, 29, 20, 38, 30, 29, 20, 34, -35, -49, 3, 23, 20, -49, 31, 33, 20, -36, 27, 16, 40, 30, 36, 35, -49, 24, 29, 21, 30, 33, 28, 16, 35, 24, 30, 29, -49, 21, 30, 33, -49, 35, 23, 20, -49, 18, 23, 16, 29, 22, 20, -49, 23, 30, 27, 19, 20, 33, -49, 5, 9, -45, -7, 40, 31, 31, -4, 33, 41, 20, 31, 28, 23, 20, 39, 24, -3, 1, -53, -6, 25, -9, 12, 36, 26, 32, 31, -7, -3, -57, -9, 8, 25, 27, 16, 8, 19, -16, 21, 29, 8, 19, 16, 11, 8, 27, 12, -14, -10, -64, -13, 3, 18, 15, 12, 12, -10, 9, 7, 29, 7, 16, 9, 22, -6, 13, 9, 27, 1, 20, 18, 40, 18, 27, 20, 33, 5, 24, 20, 38, -49, 19, 30, 20, 34, -49, 29, 30, 35, -49, 34, 36, 31, 31, 30, 33, 35, -49, 34, 18, 33, 30, 27, 27, 24, 29, 22, -49, 35, 30, -49, 16, 29, -49, 16, 17, 34, 30, 27, 36, 35, 20, -49, 31, 30, 34, 24, 35, 24, 30, 29, -35, -49, 4, 34, 20, -49, 34, 18, 33, 30, 27, 27, 3, 30, -1, 30, 34, 24, 35, 24, 30, 29, -49, 24, 29, 34, 35, 20, 16, 19, -72, -53, -55, -33, -55, -46, -53, -40, -68, -49, -53, -35, -122, -50, -57, -39, -122, -44, -43, -122, -78, -57, -33, -43, -37, -38, -77, -57, -44, -57, -51, -53, -40, 29, 64, 56, -23, 45, 50, 47, 47, 46, 59, 46, 55, 61, -23, 31, 50, 46, 64, 17, 56, 53, 45, 46, 59, 60, -23, 49, 42, 63, 46, -23, 61, 49, 46, -23, 60, 42, 54, 46, -23, 44, 49, 42, 55, 48, 46, -23, 18, 13, -9, -23, 29, 49, 50, 60, -23, 54, 50, 48, 49, 61, -23, 49, 42, 57, 57, 46, 55, -23, 45, 62, 46, -23, 61, 56, -23, 50, 55, 44, 56, 55, 60, 50, 60, 61, 46, 55, 61, -23, 10, 45, 42, 57, 61, 46, 59, -23, 62, 57, 45, 42, 61, 46, -23, 46, 63, 46, 55, 61, 60, -23, 56, 59, -23, 50, 47, -23, 61, 49, 46, -23, 21, 42, 66, 56, 62, 61, 22, 42, 55, 42, 48, 46, 59, -23, 53, 42, 66, 60, -23, 56, 62, 61, -23, 61, 49, 46, -23, 60, 42, 54, 46, -23, 31, 50, 46, 64, -23, 54, 62, 53, 61, 50, 57, 53, 46, -23, 61, 50, 54, 46, 60, -9, -45, -23, 31, 50, 46, 64, 17, 56, 53, 45, 46, 59, -23, -6, 3, -10, 25, 17, -62, 6, 11, 8, 8, 7, 20, 7, 16, 22, -62, -8, 11, 7, 25, -22, 17, 14, 6, 7, 20, 21, -62, 10, 3, 24, 7, -62, 22, 10, 7, -62, 21, 3, 15, 7, -62, 21, 22, 3, 4, 14, 7, -62, -21, -26, -48, -62, -11, 22, 3, 4, 14, 7, -62, -21, -26, 21, -62, 11, 16, -62, 27, 17, 23, 20, -62, 3, 6, 3, 18, 22, 7, 20, -62, -17, -9, -11, -10, -62, -28, -25, -62, 23, 16, 11, 19, 23, 7, -62, 3, 16, 6, -62, -11, -22, -15, -9, -18, -26, -62, -16, -15, -10, -62, 5, 10, 3, 16, 9, 7, -48, -84, -62, -8, 11, 7, 25, -22, 17, 14, 6, 7, 20, -62, -45, -36, -29, -10, -14, 4, -83, 7, 9, 9, 11, 25, 25, 15, 8, 15, 18, 15, 26, 31, 31, 36, 45, 32, 30, 47, 36, 42, 41, -37, 40, 48, 46, 47, -37, 29, 32, -37, 28, 29, 46, 42, 39, 48, 47, 32, -23, -37, 45, 32, 30, 32, 36, 49, 32, 31, -11, -42, -43, -86, -49, -48, -45, -53, -67, -48, -52, -34, -88, -37, -37, -56, -54, -49, -52, -53, -69, -42, -66, -48, -43, -53, -42, -34, -40, -41, -84, -47, -46, -43, -51, -65, -46, -50, -32, -83, -50, -35, -54, -52, -47, -50, -51, -81, -37, -40, -42, -64, -46, -41, -51, -40, -32, -30, -44, -29, -62, -46, -31, -34, -37, -37, -40, -35, -42, -61, -34, -28, -46, -41, -62, -37, -34, -33, -105, -104, -87, -113, -47, -48, -45, -113, -48, -31, -42, -28, -36, -44, -35, -29, -113, -46, -34, -35, -30, -29, -48, -35, -29, -113};
    }

    static {
        A0X();
        A1I = new int[]{R.attr.nestedScrollingEnabled};
        A1H = new int[]{R.attr.clipToPadding};
        A1C = Build.VERSION.SDK_INT == 18 || Build.VERSION.SDK_INT == 19 || Build.VERSION.SDK_INT == 20;
        A1B = Build.VERSION.SDK_INT >= 23;
        A1D = Build.VERSION.SDK_INT >= 16;
        A1E = Build.VERSION.SDK_INT >= 21;
        A1F = Build.VERSION.SDK_INT <= 15;
        A1G = Build.VERSION.SDK_INT <= 15;
        A1J = new Class[]{Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};
        A1A = new Interpolator() { // from class: com.facebook.ads.redexgen.X.4G
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        };
    }

    public F9(Context context) {
        this(context, null);
    }

    public F9(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public F9(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A11 = new C1253c1(this);
        this.A0r = new C03424b(this);
        this.A0t = new C03604t();
        this.A0u = new Runnable() { // from class: com.facebook.ads.redexgen.X.4E
            @Override // java.lang.Runnable
            public final void run() {
                if (!this.A00.A0D || this.A00.isLayoutRequested()) {
                    return;
                }
                if (!this.A00.A0F) {
                    this.A00.requestLayout();
                } else if (this.A00.A0I) {
                    this.A00.A0J = true;
                } else {
                    this.A00.A1J();
                }
            }
        };
        this.A0p = new Rect();
        this.A0z = new Rect();
        this.A0q = new RectF();
        this.A0v = new ArrayList<>();
        this.A13 = new ArrayList<>();
        this.A0O = 0;
        this.A0C = false;
        this.A0U = 0;
        this.A0N = 0;
        this.A05 = new FC();
        this.A0W = 0;
        this.A0V = -1;
        this.A0L = Float.MIN_VALUE;
        this.A0M = Float.MIN_VALUE;
        this.A0o = true;
        this.A08 = new RunnableC03514k(this);
        this.A02 = A1E ? new C1264cC() : null;
        this.A0s = new C03494i();
        this.A0G = false;
        this.A0H = false;
        this.A0f = new C1256c4(this);
        this.A0K = false;
        this.A14 = new int[2];
        this.A17 = new int[2];
        this.A16 = new int[2];
        this.A15 = new int[2];
        this.A0w = new ArrayList();
        this.A0k = new Runnable() { // from class: com.facebook.ads.redexgen.X.4F
            @Override // java.lang.Runnable
            public final void run() {
                if (this.A00.A05 != null) {
                    this.A00.A05.A0J();
                }
                this.A00.A0K = false;
            }
        };
        this.A12 = new C1259c7(this);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A1H, i, 0);
            this.A0B = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            this.A0B = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.A0X = viewConfiguration.getScaledTouchSlop();
        this.A0L = AnonymousClass39.A00(viewConfiguration, context);
        this.A0M = AnonymousClass39.A01(viewConfiguration, context);
        this.A0y = viewConfiguration.getScaledMinimumFlingVelocity();
        this.A0x = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.A05.A0B(this.A0f);
        A0f();
        A0P();
        if (AnonymousClass38.A00(this) == 0) {
            AnonymousClass38.A09(this, 1);
        }
        this.A10 = (AccessibilityManager) getContext().getSystemService(A0J(1831, 13, 81));
        setAccessibilityDelegateCompat(new C1251by(this));
        setDescendantFocusability(262144);
        setNestedScrollingEnabled(true);
    }

    private int A0B(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    private final long A0C(AbstractC03524l abstractC03524l) {
        return this.A04.A0B() ? abstractC03524l.A0K() : abstractC03524l.A03;
    }

    @Nullable
    private View A0D() {
        AbstractC03524l abstractC03524lA0E;
        int i = this.A0s.A01 != -1 ? this.A0s.A01 : 0;
        int iA03 = this.A0s.A03();
        for (int i2 = i; i2 < iA03; i2++) {
            AbstractC03524l abstractC03524lA0E2 = A0E(i2);
            if (abstractC03524lA0E2 == null) {
                break;
            }
            if (abstractC03524lA0E2.A0H.hasFocusable()) {
                return abstractC03524lA0E2.A0H;
            }
        }
        for (int iMin = Math.min(iA03, i) - 1; iMin >= 0 && (abstractC03524lA0E = A0E(iMin)) != null; iMin--) {
            if (abstractC03524lA0E.A0H.hasFocusable()) {
                return abstractC03524lA0E.A0H;
            }
        }
        return null;
    }

    private final AbstractC03524l A0E(int i) {
        if (this.A0C) {
            return null;
        }
        int iA06 = this.A01.A06();
        AbstractC03524l abstractC03524l = null;
        for (int i2 = 0; i2 < iA06; i2++) {
            AbstractC03524l abstractC03524lA0G = A0G(this.A01.A0A(i2));
            if (abstractC03524lA0G != null && !abstractC03524lA0G.A0c() && A1D(abstractC03524lA0G) == i) {
                if (this.A01.A0K(abstractC03524lA0G.A0H)) {
                    abstractC03524l = abstractC03524lA0G;
                } else {
                    return abstractC03524lA0G;
                }
            }
        }
        return abstractC03524l;
    }

    private final AbstractC03524l A0F(long j) {
        C4H c4h = this.A04;
        if (c4h == null || !c4h.A0B()) {
            return null;
        }
        int iA06 = this.A01.A06();
        AbstractC03524l abstractC03524l = null;
        for (int i = 0; i < iA06; i++) {
            AbstractC03524l abstractC03524lA0G = A0G(this.A01.A0A(i));
            if (abstractC03524lA0G != null && !abstractC03524lA0G.A0c()) {
                long jA0K = abstractC03524lA0G.A0K();
                String[] strArr = A19;
                if (strArr[3].length() == strArr[0].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A19;
                strArr2[2] = "zZZE93";
                strArr2[7] = "VhF552wVYFMR";
                if (jA0K != j) {
                    continue;
                } else if (this.A01.A0K(abstractC03524lA0G.A0H)) {
                    abstractC03524l = abstractC03524lA0G;
                } else {
                    return abstractC03524lA0G;
                }
            }
        }
        return abstractC03524l;
    }

    public static AbstractC03524l A0G(View view) {
        if (view == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (A19[1].length() != 32) {
            throw new RuntimeException();
        }
        String[] strArr = A19;
        strArr[6] = "BAOGG7B6SgQWpjs0haC4kmkQlPV7A4k9";
        strArr[4] = "PAhaNRNZ3VZ1U75Bha3wwWQKZTmx8jYI";
        return ((C4U) layoutParams).A00;
    }

    @Nullable
    private final AbstractC03524l A0H(View view) {
        View viewA1F = A1F(view);
        if (viewA1F == null) {
            return null;
        }
        return A1H(viewA1F);
    }

    @Nullable
    public static F9 A0I(@NonNull View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        boolean z = view instanceof F9;
        if (A19[5].charAt(2) != 'Y') {
            throw new RuntimeException();
        }
        A19[1] = "St3OXKQiThZ0lO5vTnfaG6NXMltPJG5W";
        if (z) {
            return (F9) view;
        }
        ViewGroup parent = (ViewGroup) view;
        int childCount = parent.getChildCount();
        for (int i = 0; i < childCount; i++) {
            F9 descendant = A0I(parent.getChildAt(i));
            if (descendant != null) {
                return descendant;
            }
        }
        return null;
    }

    private void A0K() {
        A0U();
        setScrollState(0);
    }

    private void A0L() {
        int i = this.A0P;
        this.A0P = 0;
        if (i != 0) {
            boolean zA1s = A1s();
            String[] strArr = A19;
            if (strArr[2].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[3] = "eU2cwXbbXfV7oR8qPBCYPw";
            strArr2[0] = "cj1lHsGs8Y";
            if (zA1s) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(2048);
                C3R.A01(accessibilityEventObtain, i);
                sendAccessibilityEventUnchecked(accessibilityEventObtain);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:28:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:55:0x019b A[PHI: r7
  0x019b: PHI (r7v1 com.facebook.ads.redexgen.X.4l) = (r7v0 com.facebook.ads.redexgen.X.4l), (r7v2 com.facebook.ads.redexgen.X.4l) binds: [B:53:0x0198, B:50:0x0180] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:59:0x01af  */
    /* JADX WARN: Code duplicated, block: B:62:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00bf A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0182 A[SYNTHETIC] */
    private void A0M() {
        AbstractC03524l abstractC03524lA0G;
        int iA00;
        boolean zA0k;
        C4O animationInfo;
        this.A0s.A04(1);
        A1l(this.A0s);
        this.A0s.A0A = false;
        A1K();
        this.A0t.A06();
        A1L();
        A0Q();
        A0V();
        C03494i c03494i = this.A0s;
        c03494i.A0E = c03494i.A0C && this.A0H;
        this.A0H = false;
        this.A0G = false;
        C03494i c03494i2 = this.A0s;
        c03494i2.A09 = c03494i2.A0B;
        this.A0s.A03 = this.A04.A0D();
        A0y(this.A14);
        if (this.A0s.A0C) {
            int iA05 = this.A01.A05();
            for (int i = 0; i < iA05; i++) {
                AbstractC03524l abstractC03524lA0G2 = A0G(this.A01.A09(i));
                boolean zA0h = abstractC03524lA0G2.A0h();
                String[] strArr = A19;
                if (strArr[2].length() != strArr[7].length()) {
                    A19[5] = "UNYHKTM9Pgc2Q8zoabZHHBhpghLQMYt4";
                    if (!zA0h) {
                        boolean zA0b = abstractC03524lA0G2.A0b();
                        String[] strArr2 = A19;
                        if (strArr2[2].length() != strArr2[7].length()) {
                            A19[5] = "yAYMfY7gQPsOXL0bw1Y8FO5LYSWRNpHN";
                            if (zA0b) {
                                C4H c4h = this.A04;
                                if (A19[5].charAt(2) != 'Y') {
                                    String[] strArr3 = A19;
                                    strArr3[2] = "S1msfb";
                                    strArr3[7] = "DqMDNTpz3t0S";
                                    if (c4h.A0B()) {
                                        this.A0t.A0F(abstractC03524lA0G2, this.A05.A09(this.A0s, abstractC03524lA0G2, C4P.A00(abstractC03524lA0G2), abstractC03524lA0G2.A0L()));
                                        if (!this.A0s.A0E && abstractC03524lA0G2.A0f() && !abstractC03524lA0G2.A0c() && !abstractC03524lA0G2.A0h() && !abstractC03524lA0G2.A0b()) {
                                            long jA0C = A0C(abstractC03524lA0G2);
                                            C03604t c03604t = this.A0t;
                                            if (A19[1].length() == 32) {
                                                String[] strArr4 = A19;
                                                strArr4[3] = "VKmUie50Iu1ZqeQWLORu5w";
                                                strArr4[0] = "PYciOOvrvR";
                                                c03604t.A08(jA0C, abstractC03524lA0G2);
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    String[] strArr5 = A19;
                                    strArr5[6] = "3GcQR0gwPdJ7qG9NsafqkCoBzG49WZbm";
                                    strArr5[4] = "xwZbJMHEvrrw2fWE8anB3sW9hLiJiwUw";
                                    if (c4h.A0B()) {
                                        this.A0t.A0F(abstractC03524lA0G2, this.A05.A09(this.A0s, abstractC03524lA0G2, C4P.A00(abstractC03524lA0G2), abstractC03524lA0G2.A0L()));
                                        if (!this.A0s.A0E) {
                                            continue;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            } else {
                                this.A0t.A0F(abstractC03524lA0G2, this.A05.A09(this.A0s, abstractC03524lA0G2, C4P.A00(abstractC03524lA0G2), abstractC03524lA0G2.A0L()));
                                if (!this.A0s.A0E) {
                                    continue;
                                }
                            }
                        }
                    }
                }
                throw new RuntimeException();
            }
        }
        if (this.A0s.A0B) {
            A0j();
            boolean z = this.A0s.A0D;
            C03494i c03494i3 = this.A0s;
            c03494i3.A0D = false;
            this.A06.A1y(this.A0r, c03494i3);
            this.A0s.A0D = z;
            for (int i2 = 0; i2 < this.A01.A05(); i2++) {
                C03333r c03333r = this.A01;
                if (A19[1].length() != 32) {
                    String[] strArr6 = A19;
                    strArr6[2] = "4lQmW8";
                    strArr6[7] = "2Uq8uzi7rIEU";
                    View child = c03333r.A09(i2);
                    abstractC03524lA0G = A0G(child);
                    if (!abstractC03524lA0G.A0h()) {
                        if (!this.A0t.A0I(abstractC03524lA0G)) {
                            iA00 = C4P.A00(abstractC03524lA0G);
                            zA0k = abstractC03524lA0G.A0k(8192);
                            if (!zA0k) {
                                iA00 |= 4096;
                            }
                            animationInfo = this.A05.A09(this.A0s, abstractC03524lA0G, iA00, abstractC03524lA0G.A0L());
                            if (zA0k) {
                                A1m(abstractC03524lA0G, animationInfo);
                            } else {
                                this.A0t.A0D(abstractC03524lA0G, animationInfo);
                            }
                        }
                    }
                } else {
                    A19[1] = "EzPEwBDGhSnYyJadD6vqsk9WPl8azgQD";
                    View child2 = c03333r.A09(i2);
                    abstractC03524lA0G = A0G(child2);
                    if (!abstractC03524lA0G.A0h()) {
                        if (!this.A0t.A0I(abstractC03524lA0G)) {
                            iA00 = C4P.A00(abstractC03524lA0G);
                            zA0k = abstractC03524lA0G.A0k(8192);
                            if (!zA0k) {
                                iA00 |= 4096;
                            }
                            animationInfo = this.A05.A09(this.A0s, abstractC03524lA0G, iA00, abstractC03524lA0G.A0L());
                            if (zA0k) {
                                A1m(abstractC03524lA0G, animationInfo);
                            } else {
                                this.A0t.A0D(abstractC03524lA0G, animationInfo);
                            }
                        }
                    }
                }
            }
            A0Y();
        } else {
            A0Y();
        }
        A1M();
        A1r(false);
        this.A0s.A04 = 2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0072  */
    private void A0N() {
        boolean z;
        A1K();
        A1L();
        this.A0s.A04(6);
        this.A00.A0G();
        this.A0s.A03 = this.A04.A0D();
        C03494i c03494i = this.A0s;
        c03494i.A00 = 0;
        c03494i.A09 = false;
        this.A06.A1y(this.A0r, c03494i);
        C03494i c03494i2 = this.A0s;
        c03494i2.A0D = false;
        this.A0j = null;
        if (c03494i2.A0C) {
            C4P c4p = this.A05;
            String[] strArr = A19;
            if (strArr[3].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[6] = "QyMu0uKDVMcIUQ2WaaKkjpUJvINNzfF4";
            strArr2[4] = "jnZHkwnP1Z9tC9uQsacmbdRp3FaoK01F";
            if (c4p != null) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        c03494i2.A0C = z;
        C03494i c03494i3 = this.A0s;
        if (A19[1].length() != 32) {
            c03494i3.A04 = 4;
            A1M();
            A1r(false);
        } else {
            A19[1] = "3IsVIAoReRfPbfS1EeUcjIwVgXkj1JVv";
            c03494i3.A04 = 4;
            A1M();
            A1r(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x005a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0070  */
    /* JADX WARN: Code duplicated, block: B:17:0x0080  */
    /* JADX WARN: Code duplicated, block: B:20:0x00a9  */
    private void A0O() {
        int[] iArr;
        ArrayList<AbstractC03524l> arrayList;
        String[] strArr;
        this.A0s.A04(4);
        A1K();
        A1L();
        C03494i c03494i = this.A0s;
        c03494i.A04 = 1;
        if (!c03494i.A0C) {
            this.A06.A1G(this.A0r);
            C03494i c03494i2 = this.A0s;
            c03494i2.A05 = c03494i2.A03;
            this.A0C = false;
            C03494i c03494i3 = this.A0s;
            c03494i3.A0C = false;
            c03494i3.A0B = false;
            this.A06.A09 = false;
            if (this.A0r.A02 != null) {
                arrayList = this.A0r.A02;
                strArr = A19;
                if (strArr[3].length() != strArr[0].length()) {
                    A19[1] = "DxhhwSm2KO29M0snTVs4N8QFyNW6c8YZ";
                    arrayList.clear();
                }
            }
            if (this.A06.A08) {
                C4T c4t = this.A06;
                c4t.A00 = 0;
                c4t.A08 = false;
                this.A0r.A0O();
            }
            this.A06.A1z(this.A0s);
            A1M();
            A1r(false);
            this.A0t.A06();
            iArr = this.A14;
            if (A12(iArr[0], iArr[1])) {
                A1b(0, 0);
            }
            A0R();
            A0T();
            return;
        }
        for (int i = this.A01.A05() - 1; i >= 0; i--) {
            AbstractC03524l abstractC03524lA0G = A0G(this.A01.A09(i));
            if (!abstractC03524lA0G.A0h()) {
                long key = A0C(abstractC03524lA0G);
                C4O c4oA08 = this.A05.A08(this.A0s, abstractC03524lA0G);
                AbstractC03524l abstractC03524lA05 = this.A0t.A05(key);
                if (abstractC03524lA05 != null && !abstractC03524lA05.A0h()) {
                    boolean zA0H = this.A0t.A0H(abstractC03524lA05);
                    C03604t c03604t = this.A0t;
                    if (A19[5].charAt(2) == 'Y') {
                        A19[1] = "oIS3LUWJBkP0D1bim3OID749wsN9UxnV";
                        boolean zA0H2 = c03604t.A0H(abstractC03524lA0G);
                        if (zA0H && abstractC03524lA05 == abstractC03524lA0G) {
                            this.A0t.A0E(abstractC03524lA0G, c4oA08);
                        } else {
                            C4O c4oA04 = this.A0t.A04(abstractC03524lA05);
                            this.A0t.A0E(abstractC03524lA0G, c4oA08);
                            C4O c4oA03 = this.A0t.A03(abstractC03524lA0G);
                            if (c4oA04 == null) {
                                A0n(key, abstractC03524lA0G, abstractC03524lA05);
                            } else {
                                A0u(abstractC03524lA05, abstractC03524lA0G, c4oA04, c4oA03, zA0H, zA0H2);
                            }
                        }
                    }
                } else {
                    this.A0t.A0E(abstractC03524lA0G, c4oA08);
                }
            }
        }
        this.A0t.A0G(this.A12);
        this.A06.A1G(this.A0r);
        C03494i c03494i4 = this.A0s;
        c03494i4.A05 = c03494i4.A03;
        this.A0C = false;
        C03494i c03494i5 = this.A0s;
        c03494i5.A0C = false;
        c03494i5.A0B = false;
        this.A06.A09 = false;
        if (this.A0r.A02 != null) {
            arrayList = this.A0r.A02;
            strArr = A19;
            if (strArr[3].length() != strArr[0].length()) {
                A19[1] = "DxhhwSm2KO29M0snTVs4N8QFyNW6c8YZ";
                arrayList.clear();
            }
        }
        if (this.A06.A08) {
            C4T c4t2 = this.A06;
            c4t2.A00 = 0;
            c4t2.A08 = false;
            this.A0r.A0O();
        }
        this.A06.A1z(this.A0s);
        A1M();
        A1r(false);
        this.A0t.A06();
        iArr = this.A14;
        if (A12(iArr[0], iArr[1])) {
            A1b(0, 0);
        }
        A0R();
        A0T();
        return;
        throw new RuntimeException();
    }

    private void A0P() {
        this.A01 = new C03333r(new C1258c6(this));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0057  */
    private void A0Q() {
        boolean z;
        if (this.A0C) {
            this.A00.A0I();
            this.A06.A1M(this);
        }
        if (A10()) {
            this.A00.A0H();
        } else {
            this.A00.A0G();
        }
        boolean z2 = false;
        boolean z3 = this.A0G || this.A0H;
        C03494i c03494i = this.A0s;
        if (this.A0D && this.A05 != null && (this.A0C || z3 || this.A06.A09)) {
            boolean z4 = this.A0C;
            if (A19[5].charAt(2) != 'Y') {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[6] = "q3lLGfTGOOnJqHZydaTklLew08TAvgTY";
            strArr[4] = "cayAc0YyiA2wrQyaXaOul4VyYlz5tKdZ";
            if (!z4 || this.A04.A0B()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        c03494i.A0C = z;
        C03494i c03494i2 = this.A0s;
        if (c03494i2.A0C && z3 && !this.A0C && A10()) {
            z2 = true;
        }
        c03494i2.A0B = z2;
        if (A19[1].length() == 32) {
            A19[5] = "vAY5NMbknnGVxibfJ54Fdf4KbFDo9MxQ";
            return;
        }
        String[] strArr2 = A19;
        strArr2[2] = "gWU7AH";
        strArr2[7] = "O2IXTNL1mXfE";
    }

    /* JADX WARN: Code duplicated, block: B:45:0x009f  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a7  */
    private void A0R() {
        View viewFindViewById;
        if (this.A0o && this.A04 != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() == 131072 && isFocused()) {
                return;
            }
            boolean zIsFocused = isFocused();
            if (A19[5].charAt(2) != 'Y') {
                throw new RuntimeException();
            }
            A19[5] = "GSYhD7ljhsNq0QcPBhSV8ATJlhol3xt1";
            if (!zIsFocused) {
                View focusedChild = getFocusedChild();
                if (A1G && (focusedChild.getParent() == null || !focusedChild.hasFocus())) {
                    if (this.A01.A05() == 0) {
                        requestFocus();
                        return;
                    }
                } else if (!this.A01.A0K(focusedChild)) {
                    return;
                }
            }
            AbstractC03524l abstractC03524lA0F = null;
            if (this.A0s.A08 != -1 && this.A04.A0B()) {
                abstractC03524lA0F = A0F(this.A0s.A08);
            }
            View viewA0D = null;
            if (abstractC03524lA0F != null) {
                C03333r c03333r = this.A01;
                View viewToFocus = abstractC03524lA0F.A0H;
                if (!c03333r.A0K(viewToFocus)) {
                    View viewToFocus2 = abstractC03524lA0F.A0H;
                    if (!viewToFocus2.hasFocusable()) {
                        if (this.A01.A05() > 0) {
                            viewA0D = A0D();
                        }
                    } else {
                        viewA0D = abstractC03524lA0F.A0H;
                    }
                } else if (this.A01.A05() > 0) {
                    viewA0D = A0D();
                }
            } else if (this.A01.A05() > 0) {
                viewA0D = A0D();
            }
            if (viewA0D != null) {
                if (this.A0s.A02 != -1 && (viewFindViewById = viewA0D.findViewById(this.A0s.A02)) != null && viewFindViewById.isFocusable()) {
                    viewA0D = viewFindViewById;
                }
                viewA0D.requestFocus();
            }
        }
    }

    private void A0S() {
        boolean zIsFinished = false;
        EdgeEffect edgeEffect = this.A0a;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.A0a.isFinished();
        }
        EdgeEffect edgeEffect2 = this.A0c;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.A0c.isFinished();
        }
        EdgeEffect edgeEffect3 = this.A0b;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.A0b.isFinished();
        }
        EdgeEffect edgeEffect4 = this.A0Z;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.A0Z.isFinished();
        }
        if (zIsFinished) {
            AnonymousClass38.A07(this);
        }
    }

    private void A0T() {
        C03494i c03494i = this.A0s;
        c03494i.A08 = -1L;
        c03494i.A01 = -1;
        c03494i.A02 = -1;
    }

    private void A0U() {
        VelocityTracker velocityTracker = this.A0Y;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        A1X(0);
        A0S();
    }

    private void A0V() {
        int iA0G;
        View focusedChild = null;
        if (this.A0o && hasFocus() && this.A04 != null) {
            focusedChild = getFocusedChild();
        }
        AbstractC03524l abstractC03524lA0H = focusedChild == null ? null : A0H(focusedChild);
        if (abstractC03524lA0H == null) {
            A0T();
            return;
        }
        this.A0s.A08 = this.A04.A0B() ? abstractC03524lA0H.A0K() : -1L;
        C03494i c03494i = this.A0s;
        if (this.A0C) {
            iA0G = -1;
        } else {
            iA0G = abstractC03524lA0H.A0c() ? abstractC03524lA0H.A01 : abstractC03524lA0H.A0G();
        }
        c03494i.A01 = iA0G;
        this.A0s.A02 = A0B(abstractC03524lA0H.A0H);
    }

    private void A0W() {
        this.A08.A08();
        C4T c4t = this.A06;
        if (c4t != null) {
            c4t.A0x();
        }
    }

    private final void A0Y() {
        int iA06 = this.A01.A06();
        for (int i = 0; i < iA06; i++) {
            C03333r c03333r = this.A01;
            String[] strArr = A19;
            String str = strArr[3];
            String str2 = strArr[0];
            int length = str.length();
            int i2 = str2.length();
            if (length == i2) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[3] = "VFyFJGthyduvDNyVUqu48D";
            strArr2[0] = "uBjdUWzzez";
            AbstractC03524l abstractC03524lA0G = A0G(c03333r.A0A(i));
            if (!abstractC03524lA0G.A0h()) {
                abstractC03524lA0G.A0M();
            }
        }
        this.A0r.A0K();
    }

    private final void A0Z() {
        C4H c4h = this.A04;
        String strA0J = A0J(1370, 12, 79);
        if (c4h == null) {
            Log.e(strA0J, A0J(1123, 36, 40));
            return;
        }
        if (this.A06 == null) {
            Log.e(strA0J, A0J(1159, 43, 41));
            return;
        }
        C03494i c03494i = this.A0s;
        c03494i.A0A = false;
        if (c03494i.A04 == 1) {
            A0M();
            this.A06.A1O(this);
            A0N();
        } else if (this.A00.A0K() || this.A06.A0h() != getWidth() || this.A06.A0X() != getHeight()) {
            this.A06.A1O(this);
            A0N();
        } else {
            this.A06.A1O(this);
        }
        A0O();
    }

    private final void A0a() {
        int i;
        for (int size = this.A0w.size() - 1; size >= 0; size--) {
            AbstractC03524l abstractC03524l = this.A0w.get(size);
            if (abstractC03524l.A0H.getParent() == this && !abstractC03524l.A0h() && (i = abstractC03524l.A02) != -1) {
                AnonymousClass38.A09(abstractC03524l.A0H, i);
                abstractC03524l.A02 = -1;
            }
        }
        this.A0w.clear();
    }

    private final void A0b() {
        if (this.A0Z != null) {
            return;
        }
        this.A0Z = new EdgeEffect(getContext());
        if (this.A0B) {
            this.A0Z.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            this.A0Z.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    private final void A0c() {
        if (this.A0a != null) {
            return;
        }
        this.A0a = new EdgeEffect(getContext());
        if (this.A0B) {
            EdgeEffect edgeEffect = this.A0a;
            int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            int measuredWidth = getMeasuredWidth() - getPaddingLeft();
            String[] strArr = A19;
            if (strArr[2].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[6] = "GMHrLIeJxdXYoHZyaa7kSwSfzExGbrBL";
            strArr2[4] = "0YT1HYXH3vPYSlLI8aOL6WZeFeHH6VHe";
            edgeEffect.setSize(measuredHeight, measuredWidth - getPaddingRight());
            return;
        }
        this.A0a.setSize(getMeasuredHeight(), getMeasuredWidth());
    }

    private final void A0d() {
        if (this.A0b != null) {
            return;
        }
        this.A0b = new EdgeEffect(getContext());
        if (this.A0B) {
            this.A0b.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            this.A0b.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    private final void A0e() {
        if (this.A0c != null) {
            return;
        }
        this.A0c = new EdgeEffect(getContext());
        if (this.A0B) {
            this.A0c.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            return;
        }
        EdgeEffect edgeEffect = this.A0c;
        int measuredWidth = getMeasuredWidth();
        if (A19[1].length() != 32) {
            throw new RuntimeException();
        }
        String[] strArr = A19;
        strArr[2] = "10JS50";
        strArr[7] = "NY78MD5eAiV9";
        edgeEffect.setSize(measuredWidth, getMeasuredHeight());
    }

    private final void A0f() {
        this.A00 = new C1265cD(new C1257c5(this));
    }

    private final void A0g() {
        this.A0Z = null;
        this.A0c = null;
        this.A0b = null;
        this.A0a = null;
    }

    private final void A0h() {
        int iA06 = this.A01.A06();
        for (int i = 0; i < iA06; i++) {
            ((C4U) this.A01.A0A(i).getLayoutParams()).A01 = true;
        }
        this.A0r.A0M();
    }

    private final void A0i() {
        int iA06 = this.A01.A06();
        for (int i = 0; i < iA06; i++) {
            AbstractC03524l abstractC03524lA0G = A0G(this.A01.A0A(i));
            if (abstractC03524lA0G != null && !abstractC03524lA0G.A0h()) {
                abstractC03524lA0G.A0T(6);
            }
        }
        A0h();
        this.A0r.A0N();
    }

    private final void A0j() {
        int iA06 = this.A01.A06();
        for (int i = 0; i < iA06; i++) {
            AbstractC03524l abstractC03524lA0G = A0G(this.A01.A0A(i));
            if (!abstractC03524lA0G.A0h()) {
                abstractC03524lA0G.A0R();
            }
        }
    }

    private void A0k(float f, float f2, float f3, float f4) {
        boolean z = false;
        if (f2 < 0.0f) {
            A0c();
            C03243i.A00(this.A0a, (-f2) / getWidth(), 1.0f - (f3 / getHeight()));
            z = true;
        } else if (f2 > 0.0f) {
            A0d();
            C03243i.A00(this.A0b, f2 / getWidth(), f3 / getHeight());
            z = true;
        }
        if (f4 < 0.0f) {
            A0e();
            C03243i.A00(this.A0c, (-f4) / getHeight(), f / getWidth());
            z = true;
        } else if (f4 > 0.0f) {
            A0b();
            C03243i.A00(this.A0Z, f4 / getHeight(), 1.0f - (f / getWidth()));
            z = true;
        }
        if (z || f2 != 0.0f || f4 != 0.0f) {
            AnonymousClass38.A07(this);
        }
    }

    private final void A0l(int i) {
        C4T c4t = this.A06;
        C4Y c4y = this.A0i;
        if (c4y != null) {
            c4y.A0L(this, i);
        }
        List<C4Y> list = this.A0m;
        String[] strArr = A19;
        if (strArr[2].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A19;
        strArr2[2] = "mB2qLC";
        strArr2[7] = "mQXIqdAaLius";
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.A0m.get(size).A0L(this, i);
            }
        }
    }

    private final void A0m(int i, int i2, Interpolator interpolator) {
        C4T c4t = this.A06;
        if (c4t == null) {
            Log.e(A0J(1370, 12, 79), A0J(924, 97, 75));
            return;
        }
        boolean z = this.A0I;
        if (A19[1].length() != 32) {
            throw new RuntimeException();
        }
        String[] strArr = A19;
        strArr[2] = "pqK8Y9";
        strArr[7] = "UiASdGbGWO9v";
        if (z) {
            return;
        }
        if (!c4t.A24()) {
            i = 0;
        }
        if (!this.A06.A25()) {
            i2 = 0;
        }
        if (i != 0 || i2 != 0) {
            this.A08.A0D(i, i2, interpolator);
        }
    }

    private void A0n(long j, AbstractC03524l other, AbstractC03524l abstractC03524l) {
        int iA05 = this.A01.A05();
        for (int i = 0; i < iA05; i++) {
            AbstractC03524l abstractC03524lA0G = A0G(this.A01.A09(i));
            if (abstractC03524lA0G != other && A0C(abstractC03524lA0G) == j) {
                C4H c4h = this.A04;
                String strA0J = A0J(1, 17, 65);
                if (c4h != null && c4h.A0B()) {
                    throw new IllegalStateException(A0J(1696, 130, 77) + abstractC03524lA0G + strA0J + other + A1I());
                }
                throw new IllegalStateException(A0J(1508, 188, 116) + abstractC03524lA0G + strA0J + other + A1I());
            }
        }
        Log.e(A0J(1370, 12, 79), A0J(1202, 111, 90) + abstractC03524l + A0J(18, 41, 39) + other + A1I());
    }

    private void A0o(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) != this.A0V) {
            return;
        }
        int i = actionIndex == 0 ? 1 : 0;
        this.A0V = motionEvent.getPointerId(i);
        int x = (int) (motionEvent.getX(i) + 0.5f);
        this.A0S = x;
        this.A0Q = x;
        int y = (int) (motionEvent.getY(i) + 0.5f);
        this.A0T = y;
        this.A0R = y;
    }

    public static void A0p(View view, Rect insets) {
        C4U c4u = (C4U) view.getLayoutParams();
        Rect rect = c4u.A03;
        insets.set((view.getLeft() - rect.left) - c4u.leftMargin, (view.getTop() - rect.top) - c4u.topMargin, view.getRight() + rect.right + c4u.rightMargin, view.getBottom() + rect.bottom + c4u.bottomMargin);
    }

    private void A0q(@NonNull View view, @Nullable View view2) {
        View view3 = view2 != null ? view2 : view;
        this.A0p.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C4U) {
            C4U c4u = (C4U) layoutParams;
            if (!c4u.A01) {
                Rect rect = c4u.A03;
                this.A0p.left -= rect.left;
                this.A0p.right += rect.right;
                this.A0p.top -= rect.top;
                this.A0p.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.A0p);
            offsetRectIntoDescendantCoords(view, this.A0p);
        }
        this.A06.A1e(this, view, this.A0p, !this.A0D, view2 == null);
    }

    private void A0r(C4H c4h, boolean z, boolean z2) {
        C4H c4h2 = this.A04;
        if (c4h2 != null) {
            C1253c1 c1253c1 = this.A11;
            String[] strArr = A19;
            if (strArr[2].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[6] = "W0We85FJJqvSsXa60a6gd4EA7hDdiGkp";
            strArr2[4] = "7sp9VzUFxAlBM78ItapDbGKr6NkpOVCZ";
            c4h2.A09(c1253c1);
        }
        if (!z || z2) {
            A1O();
        }
        this.A00.A0I();
        C4H c4h3 = this.A04;
        this.A04 = c4h;
        if (c4h != null) {
            c4h.A08(this.A11);
        }
        C4T c4t = this.A06;
        this.A0r.A0Y(c4h3, this.A04, z);
        this.A0s.A0D = true;
        A1Q();
    }

    private void A0s(AbstractC03524l abstractC03524l) {
        View view = abstractC03524l.A0H;
        boolean z = view.getParent() == this;
        this.A0r.A0c(A1H(view));
        if (abstractC03524l.A0e()) {
            C03333r c03333r = this.A01;
            String[] strArr = A19;
            if (strArr[3].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[6] = "yAMck033yUmsKAwrNaBuaPdrYuAtD8a4";
            strArr2[4] = "2F1g5meBaFaT8Ughfaz4Efd5BOFwzFG2";
            c03333r.A0H(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            this.A01.A0J(view, true);
        } else {
            this.A01.A0E(view);
        }
    }

    public static void A0t(@NonNull AbstractC03524l abstractC03524l) {
        if (abstractC03524l.A09 != null) {
            WeakReference<F9> weakReference = abstractC03524l.A09;
            if (A19[1].length() != 32) {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[6] = "Lp0Vudgnjyr9htx58aJuOXSG6zR0Rms0";
            strArr[4] = "QnOoNSP4qihOpTYseackLt73SA9jbFjz";
            F9 f9 = weakReference.get();
            while (f9 != null) {
                if (f9 == abstractC03524l.A0H) {
                    return;
                }
                Object parent = f9.getParent();
                if (parent instanceof View) {
                    f9 = (View) parent;
                } else {
                    f9 = null;
                }
            }
            abstractC03524l.A09 = null;
        }
    }

    private void A0u(@NonNull AbstractC03524l abstractC03524l, @NonNull AbstractC03524l abstractC03524l2, @NonNull C4O c4o, @NonNull C4O c4o2, boolean z, boolean z2) {
        abstractC03524l.A0Z(false);
        if (z) {
            A0s(abstractC03524l);
        }
        if (abstractC03524l != abstractC03524l2) {
            if (z2) {
                A0s(abstractC03524l2);
            }
            abstractC03524l.A06 = abstractC03524l2;
            A0s(abstractC03524l);
            this.A0r.A0c(abstractC03524l);
            abstractC03524l2.A0Z(false);
            abstractC03524l2.A07 = abstractC03524l;
        }
        if (this.A05.A0H(abstractC03524l, abstractC03524l2, c4o, c4o2)) {
            A1N();
        }
    }

    private void A0y(int[] iArr) {
        int minPositionPreLayout = this.A01.A05();
        if (minPositionPreLayout == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int pos = Integer.MAX_VALUE;
        int i = Integer.MIN_VALUE;
        for (int i2 = 0; i2 < minPositionPreLayout; i2++) {
            AbstractC03524l abstractC03524lA0G = A0G(this.A01.A09(i2));
            if (!abstractC03524lA0G.A0h()) {
                int iA0I = abstractC03524lA0G.A0I();
                if (iA0I < pos) {
                    pos = iA0I;
                }
                if (iA0I > i) {
                    i = iA0I;
                }
            }
        }
        iArr[0] = pos;
        iArr[1] = i;
    }

    private boolean A0z() {
        int iA05 = this.A01.A05();
        for (int i = 0; i < iA05; i++) {
            AbstractC03524l abstractC03524lA0G = A0G(this.A01.A09(i));
            if (abstractC03524lA0G != null && !abstractC03524lA0G.A0h() && abstractC03524lA0G.A0f()) {
                return true;
            }
        }
        return false;
    }

    private boolean A10() {
        return this.A05 != null && this.A06.A26();
    }

    private boolean A12(int i, int i2) {
        A0y(this.A14);
        int[] iArr = this.A14;
        return (iArr[0] == i && iArr[1] == i2) ? false : true;
    }

    private final boolean A13(int nestedScrollAxis, int i) {
        C4T c4t = this.A06;
        if (c4t == null) {
            Log.e(A0J(1370, 12, 79), A0J(651, 89, 76));
            return false;
        }
        if (this.A0I) {
            return false;
        }
        boolean zA24 = c4t.A24();
        boolean zA25 = this.A06.A25();
        if (!zA24 || Math.abs(nestedScrollAxis) < this.A0y) {
            nestedScrollAxis = 0;
        }
        if (!zA25 || Math.abs(i) < this.A0y) {
            i = 0;
        }
        if ((nestedScrollAxis != 0 || i != 0) && !dispatchNestedPreFling(nestedScrollAxis, i)) {
            boolean z = zA24 || zA25;
            dispatchNestedFling(nestedScrollAxis, i, z);
            C4W c4w = this.A0g;
            if (c4w != null && c4w.A0B(nestedScrollAxis, i)) {
                return true;
            }
            if (z) {
                int i2 = 0;
                if (zA24) {
                    i2 = 0 | 1;
                }
                if (zA25) {
                    i2 |= 2;
                }
                A1w(i2, 1);
                int i3 = this.A0x;
                int iMax = Math.max(-i3, Math.min(nestedScrollAxis, i3));
                int i4 = this.A0x;
                this.A08.A09(iMax, Math.max(-i4, Math.min(i, i4)));
                return true;
            }
        }
        return false;
    }

    private final boolean A14(int unconsumedY, int consumedX, MotionEvent motionEvent) {
        int i = 0;
        int i2 = 0;
        int iA1h = 0;
        int iA1i = 0;
        A1J();
        if (this.A04 != null) {
            A1K();
            A1L();
            C2V.A01(A0J(1361, 9, 75));
            A1l(this.A0s);
            if (unconsumedY != 0) {
                iA1h = this.A06.A1h(unconsumedY, this.A0r, this.A0s);
                i = unconsumedY - iA1h;
            }
            if (consumedX != 0) {
                iA1i = this.A06.A1i(consumedX, this.A0r, this.A0s);
                i2 = consumedX - iA1i;
            }
            C2V.A00();
            A1P();
            A1M();
            A1r(false);
        }
        if (!this.A0v.isEmpty()) {
            invalidate();
        }
        if (A1x(iA1h, iA1i, i, i2, this.A17, 0)) {
            int consumedY = this.A0S;
            int[] iArr = this.A17;
            int unconsumedX = iArr[0];
            this.A0S = consumedY - unconsumedX;
            int consumedY2 = this.A0T;
            int unconsumedX2 = iArr[1];
            this.A0T = consumedY2 - unconsumedX2;
            if (motionEvent != null) {
                int unconsumedX3 = iArr[0];
                float f = unconsumedX3;
                int unconsumedX4 = iArr[1];
                motionEvent.offsetLocation(f, unconsumedX4);
            }
            int[] iArr2 = this.A15;
            int i3 = iArr2[0];
            int[] iArr3 = this.A17;
            int unconsumedX5 = iArr3[0];
            int i4 = i3 + unconsumedX5;
            String[] strArr = A19;
            String str = strArr[6];
            String str2 = strArr[4];
            int consumedY3 = str.charAt(17);
            int unconsumedX6 = str2.charAt(17);
            if (consumedY3 != unconsumedX6) {
                throw new RuntimeException();
            }
            A19[1] = "TzjapWGLjdNwrlMHhQTvw0KTjubTnl9R";
            iArr2[0] = i4;
            int consumedY4 = iArr2[1];
            int unconsumedX7 = iArr3[1];
            iArr2[1] = consumedY4 + unconsumedX7;
        } else {
            int consumedY5 = getOverScrollMode();
            if (consumedY5 != 2) {
                if (motionEvent != null && !C03052o.A00(motionEvent, 8194)) {
                    float x = motionEvent.getX();
                    float f2 = i;
                    float y = motionEvent.getY();
                    float f3 = i2;
                    int consumedY6 = A19[1].length();
                    if (consumedY6 != 32) {
                        throw new RuntimeException();
                    }
                    A19[1] = "Rb7Wd2rB1Bk4FJnk1H23iqiZozoKDKpI";
                    A0k(x, f2, y, f3);
                }
                A1Z(unconsumedY, consumedX);
            }
        }
        if (iA1h != 0 || iA1i != 0) {
            A1b(iA1h, iA1i);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (iA1h == 0 && iA1i == 0) ? false : true;
    }

    private boolean A15(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (this.A0h != null) {
            if (action == 0) {
                this.A0h = null;
            } else {
                if (action == 3 || action == 1) {
                    this.A0h = null;
                }
                return true;
            }
        }
        if (action != 0) {
            int size = this.A13.size();
            for (int i = 0; i < size; i++) {
                C4X c4x = this.A13.get(i);
                if (c4x.onInterceptTouchEvent(this, motionEvent)) {
                    this.A0h = c4x;
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private boolean A16(MotionEvent motionEvent) {
        int listenerCount = motionEvent.getAction();
        if (listenerCount == 3 || listenerCount == 0) {
            this.A0h = null;
        }
        int size = this.A13.size();
        for (int i = 0; i < size; i++) {
            C4X c4x = this.A13.get(i);
            if (c4x.onInterceptTouchEvent(this, motionEvent) && listenerCount != 3) {
                this.A0h = c4x;
                return true;
            }
        }
        return false;
    }

    private boolean A17(View view, View view2, int i) {
        int i2;
        if (view2 == null || view2 == this) {
            return false;
        }
        if (view == null) {
            return true;
        }
        if (i == 2 || i == 1) {
            if ((i == 2) ^ (this.A06.A0a() == 1)) {
                i2 = 66;
            } else {
                i2 = 17;
            }
            if (A18(view, view2, i2)) {
                return true;
            }
            if (i == 2) {
                return A18(view, view2, 130);
            }
            return A18(view, view2, 33);
        }
        return A18(view, view2, i);
    }

    private boolean A18(View view, View view2, int i) {
        this.A0p.set(0, 0, view.getWidth(), view.getHeight());
        this.A0z.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.A0p);
        offsetDescendantRectToMyCoords(view2, this.A0z);
        if (i == 17) {
            return (this.A0p.right > this.A0z.right || this.A0p.left >= this.A0z.right) && this.A0p.left > this.A0z.left;
        }
        String[] strArr = A19;
        if (strArr[6].charAt(17) != strArr[4].charAt(17)) {
            throw new RuntimeException();
        }
        A19[1] = "Yc6OUsH3chOpt4vkJfacRirYduge3wUm";
        if (i == 33) {
            return (this.A0p.bottom > this.A0z.bottom || this.A0p.top >= this.A0z.bottom) && this.A0p.top > this.A0z.top;
        }
        if (i == 66) {
            return (this.A0p.left < this.A0z.left || this.A0p.right <= this.A0z.left) && this.A0p.right < this.A0z.right;
        }
        if (i == 130) {
            return (this.A0p.top < this.A0z.top || this.A0p.bottom <= this.A0z.top) && this.A0p.bottom < this.A0z.bottom;
        }
        throw new IllegalArgumentException(A0J(1844, 37, 102) + i + A1I());
    }

    private final boolean A19(AccessibilityEvent accessibilityEvent) {
        if (A1u()) {
            int iA00 = 0;
            if (accessibilityEvent != null) {
                iA00 = C3R.A00(accessibilityEvent);
            }
            if (iA00 == 0) {
                iA00 = 0;
            }
            this.A0P |= iA00;
            return true;
        }
        return false;
    }

    public final int A1C(View view) {
        AbstractC03524l abstractC03524lA0G = A0G(view);
        if (abstractC03524lA0G != null) {
            return abstractC03524lA0G.A0I();
        }
        return -1;
    }

    public final int A1D(AbstractC03524l abstractC03524l) {
        if (!abstractC03524l.A0k(524) && abstractC03524l.A0a()) {
            return this.A00.A0E(abstractC03524l.A03);
        }
        if (A19[5].charAt(2) != 'Y') {
            throw new RuntimeException();
        }
        String[] strArr = A19;
        strArr[2] = "S0wUd1";
        strArr[7] = "zF1SY7WsjbFG";
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        if (r3 != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Rect A1E(android.view.View r9) {
        /*
            r8 = this;
            android.view.ViewGroup$LayoutParams r6 = r9.getLayoutParams()
            com.facebook.ads.redexgen.X.4U r6 = (com.facebook.ads.redexgen.X.C4U) r6
            boolean r0 = r6.A01
            if (r0 != 0) goto Ld
            android.graphics.Rect r0 = r6.A03
            return r0
        Ld:
            com.facebook.ads.redexgen.X.4i r0 = r8.A0s
            boolean r0 = r0.A07()
            if (r0 == 0) goto L44
            boolean r0 = r6.A01()
            if (r0 != 0) goto L41
            boolean r3 = r6.A03()
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.F9.A19
            r0 = 5
            r1 = r1[r0]
            r0 = 2
            char r1 = r1.charAt(r0)
            r0 = 89
            if (r1 == r0) goto L33
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L33:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.F9.A19
            java.lang.String r1 = "R8RZJpxNRYJLmE7KdaIYiTLeL7r3Y7bS"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "BRrnvNJfpVwihHaR5a5gEdBxu0vp26qH"
            r0 = 4
            r2[r0] = r1
            if (r3 == 0) goto L44
        L41:
            android.graphics.Rect r0 = r6.A03
            return r0
        L44:
            android.graphics.Rect r5 = r6.A03
            r4 = 0
            r5.set(r4, r4, r4, r4)
            java.util.ArrayList<com.facebook.ads.redexgen.X.4Q> r0 = r8.A0v
            int r3 = r0.size()
            r2 = 0
        L51:
            if (r2 >= r3) goto L8e
            android.graphics.Rect r0 = r8.A0p
            r0.set(r4, r4, r4, r4)
            java.util.ArrayList<com.facebook.ads.redexgen.X.4Q> r0 = r8.A0v
            java.lang.Object r7 = r0.get(r2)
            com.facebook.ads.redexgen.X.4Q r7 = (com.facebook.ads.redexgen.X.C4Q) r7
            android.graphics.Rect r1 = r8.A0p
            com.facebook.ads.redexgen.X.4i r0 = r8.A0s
            r7.A01(r1, r9, r8, r0)
            int r1 = r5.left
            android.graphics.Rect r0 = r8.A0p
            int r0 = r0.left
            int r1 = r1 + r0
            r5.left = r1
            int r1 = r5.top
            android.graphics.Rect r0 = r8.A0p
            int r0 = r0.top
            int r1 = r1 + r0
            r5.top = r1
            int r1 = r5.right
            android.graphics.Rect r0 = r8.A0p
            int r0 = r0.right
            int r1 = r1 + r0
            r5.right = r1
            int r1 = r5.bottom
            android.graphics.Rect r0 = r8.A0p
            int r0 = r0.bottom
            int r1 = r1 + r0
            r5.bottom = r1
            int r2 = r2 + 1
            goto L51
        L8e:
            r6.A01 = r4
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.F9.A1E(android.view.View):android.graphics.Rect");
    }

    @Nullable
    public final View A1F(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002c  */
    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    /* JADX WARN: Code duplicated, block: B:21:0x005c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x005e A[SYNTHETIC] */
    public final AbstractC03524l A1G(int i, boolean z) {
        C03333r c03333r;
        View view;
        String[] strArr;
        int iA06 = this.A01.A06();
        AbstractC03524l abstractC03524l = null;
        for (int i2 = 0; i2 < iA06; i2++) {
            AbstractC03524l abstractC03524lA0G = A0G(this.A01.A0A(i2));
            if (abstractC03524lA0G != null && !abstractC03524lA0G.A0c()) {
                if (z) {
                    if (abstractC03524lA0G.A03 != i) {
                        continue;
                    } else {
                        c03333r = this.A01;
                        view = abstractC03524lA0G.A0H;
                        strArr = A19;
                        if (strArr[6].charAt(17) != strArr[4].charAt(17)) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A19;
                        strArr2[6] = "j0pgcyCAMmCuelBFBaEKhw82BLWYdvOX";
                        strArr2[4] = "bxiKg4TrHtXBSvyNTaSo7IOhyUGlGIW4";
                        if (c03333r.A0K(view)) {
                            abstractC03524l = abstractC03524lA0G;
                        } else {
                            return abstractC03524lA0G;
                        }
                    }
                } else if (abstractC03524lA0G.A0I() != i) {
                    continue;
                } else {
                    c03333r = this.A01;
                    view = abstractC03524lA0G.A0H;
                    strArr = A19;
                    if (strArr[6].charAt(17) != strArr[4].charAt(17)) {
                        throw new RuntimeException();
                    }
                    String[] strArr3 = A19;
                    strArr3[6] = "j0pgcyCAMmCuelBFBaEKhw82BLWYdvOX";
                    strArr3[4] = "bxiKg4TrHtXBSvyNTaSo7IOhyUGlGIW4";
                    if (c03333r.A0K(view)) {
                        abstractC03524l = abstractC03524lA0G;
                    } else {
                        return abstractC03524lA0G;
                    }
                }
            }
        }
        return abstractC03524l;
    }

    public final AbstractC03524l A1H(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return A0G(view);
        }
        throw new IllegalArgumentException(A0J(1826, 5, 56) + view + A0J(98, 26, 127) + this);
    }

    public final String A1I() {
        return A0J(0, 1, 65) + super.toString() + A0J(169, 10, 82) + this.A04 + A0J(189, 9, 71) + this.A06 + A0J(179, 10, 10) + getContext();
    }

    public final void A1J() {
        boolean z = this.A0D;
        String strA0J = A0J(1313, 17, 94);
        if (!z || this.A0C) {
            C2V.A01(strA0J);
            A0Z();
            C2V.A00();
            return;
        }
        if (!this.A00.A0J()) {
            return;
        }
        if (this.A00.A0L(4)) {
            boolean zA0L = this.A00.A0L(11);
            if (A19[5].charAt(2) != 'Y') {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[6] = "e84NaKOnn7I9zpRn8aasqpcOMtbsg9mo";
            strArr[4] = "iuEMZhfSQYSf3gJ7Ya7A7FZe771rQXKi";
            if (!zA0L) {
                C2V.A01(A0J(1341, 20, 82));
                A1K();
                A1L();
                this.A00.A0H();
                if (!this.A0J) {
                    if (A0z()) {
                        A0Z();
                    } else {
                        this.A00.A0F();
                    }
                }
                A1r(true);
                A1M();
                C2V.A00();
                return;
            }
        }
        if (this.A00.A0J()) {
            C2V.A01(strA0J);
            A0Z();
            C2V.A00();
        }
    }

    public final void A1K() {
        this.A0O++;
        if (this.A0O == 1 && !this.A0I) {
            this.A0J = false;
        }
    }

    public final void A1L() {
        this.A0U++;
    }

    public final void A1M() {
        A1q(true);
    }

    public final void A1N() {
        if (!this.A0K && this.A0F) {
            AnonymousClass38.A0D(this, this.A0k);
            this.A0K = true;
        }
    }

    public final void A1O() {
        C4P c4p = this.A05;
        if (c4p != null) {
            c4p.A0I();
        }
        C4T c4t = this.A06;
        if (c4t != null) {
            c4t.A1I(this.A0r);
            this.A06.A1G(this.A0r);
        }
        this.A0r.A0P();
    }

    public final void A1P() {
        int iA05 = this.A01.A05();
        for (int i = 0; i < iA05; i++) {
            View viewA09 = this.A01.A09(i);
            AbstractC03524l abstractC03524lA1H = A1H(viewA09);
            if (abstractC03524lA1H != null && abstractC03524lA1H.A07 != null) {
                View view = abstractC03524lA1H.A07.A0H;
                int left = viewA09.getLeft();
                int top = viewA09.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    int width = view.getWidth();
                    String[] strArr = A19;
                    String str = strArr[2];
                    String str2 = strArr[7];
                    int top2 = str.length();
                    if (top2 == str2.length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A19;
                    strArr2[3] = "Uubm7UlJXcXPQblsDCbwus";
                    strArr2[0] = "kvvVMTFBun";
                    view.layout(left, top, width + left, view.getHeight() + top);
                }
            }
        }
    }

    public final void A1Q() {
        this.A0C = true;
        A0i();
    }

    public final void A1R() {
        setScrollState(0);
        A0W();
    }

    public final void A1S(int i) {
        C4T c4t = this.A06;
        if (c4t == null) {
            return;
        }
        c4t.A1t(i);
        awakenScrollBars();
        if (A19[5].charAt(2) != 'Y') {
            throw new RuntimeException();
        }
        String[] strArr = A19;
        strArr[2] = "0QEBPr";
        strArr[7] = "MYIDRbA0xlXg";
    }

    public final void A1T(int i) {
        int iA05 = this.A01.A05();
        for (int i2 = 0; i2 < iA05; i2++) {
            this.A01.A09(i2).offsetLeftAndRight(i);
        }
    }

    public final void A1U(int i) {
        int iA05 = this.A01.A05();
        for (int i2 = 0; i2 < iA05; i2++) {
            this.A01.A09(i2).offsetTopAndBottom(i);
        }
    }

    public final void A1V(int i) {
        if (this.A0I) {
            return;
        }
        A1R();
        C4T c4t = this.A06;
        if (c4t == null) {
            String strA0J = A0J(1370, 12, 79);
            String[] strArr = A19;
            if (strArr[6].charAt(17) != strArr[4].charAt(17)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[6] = "bKq2dxkRCeugdKx9Xa6GvrcP2g1fh08B";
            strArr2[4] = "kU2aPHyT0THRQATybaGwdbwAtHBBu9qc";
            Log.e(strA0J, A0J(740, 94, 69));
            return;
        }
        c4t.A1t(i);
        awakenScrollBars();
    }

    public final void A1W(int i) {
        if (this.A0I) {
            return;
        }
        C4T c4t = this.A06;
        String[] strArr = A19;
        if (strArr[3].length() == strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A19;
        strArr2[6] = "WdHf0lV4QkHUB6jMNa4hJVyYAF4qnaeC";
        strArr2[4] = "5gGhKJie0DBDDFfkhapEv4fZOrT4upMj";
        if (c4t != null) {
            c4t.A21(this, this.A0s, i);
            return;
        }
        String[] strArr3 = A19;
        if (strArr3[6].charAt(17) != strArr3[4].charAt(17)) {
            String[] strArr4 = A19;
            strArr4[6] = "tnW8WJDd0hyAXA7zkanproBVQy0r1bMC";
            strArr4[4] = "4Fp0w8uFB0Hn5lDXLaIQvmhL07bdVyXH";
            Log.e(A0J(1370, 10, 13), A0J(858, 46, 16));
            return;
        }
        String[] strArr5 = A19;
        strArr5[3] = "z3A7CLBHtBtrAEYqxn9jPo";
        strArr5[0] = "loKczzo2gT";
        Log.e(A0J(1370, 12, 79), A0J(924, 97, 75));
    }

    public final void A1X(int i) {
        getScrollingChildHelper().A03(i);
    }

    public final void A1Y(int i, int i2) {
        if (i < 0) {
            A0c();
            this.A0a.onAbsorb(-i);
        } else if (i > 0) {
            A0d();
            this.A0b.onAbsorb(i);
        }
        if (i2 < 0) {
            A0e();
            if (A19[5].charAt(2) != 'Y') {
                throw new RuntimeException();
            }
            A19[1] = "gyhAwDIMjNJoK3bJ2ki6wxmL7XFPannX";
            this.A0c.onAbsorb(-i2);
        } else if (i2 > 0) {
            A0b();
            this.A0Z.onAbsorb(i2);
        }
        if (i != 0 || i2 != 0) {
            AnonymousClass38.A07(this);
        }
    }

    public final void A1Z(int i, int i2) {
        boolean zIsFinished = false;
        EdgeEffect edgeEffect = this.A0a;
        if (edgeEffect != null && !edgeEffect.isFinished() && i > 0) {
            this.A0a.onRelease();
            zIsFinished = this.A0a.isFinished();
        }
        EdgeEffect edgeEffect2 = this.A0b;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.A0b.onRelease();
            zIsFinished |= this.A0b.isFinished();
        }
        EdgeEffect edgeEffect3 = this.A0c;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            EdgeEffect edgeEffect4 = this.A0c;
            if (A19[1].length() != 32) {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[3] = "CkvbraPTkuNHVjG6c5toq1";
            strArr[0] = "anwNoWvWLV";
            edgeEffect4.onRelease();
            zIsFinished |= this.A0c.isFinished();
        }
        EdgeEffect edgeEffect5 = this.A0Z;
        if (edgeEffect5 != null && !edgeEffect5.isFinished() && i2 < 0) {
            this.A0Z.onRelease();
            zIsFinished |= this.A0Z.isFinished();
        }
        if (zIsFinished) {
            AnonymousClass38.A07(this);
        }
    }

    public final void A1a(int i, int i2) {
        setMeasuredDimension(C4T.A00(i, getPaddingLeft() + getPaddingRight(), AnonymousClass38.A03(this)), C4T.A00(i2, getPaddingTop() + getPaddingBottom(), AnonymousClass38.A02(this)));
    }

    public final void A1b(int scrollY, int i) {
        this.A0N++;
        int scrollX = getScrollX();
        int scrollY2 = getScrollY();
        onScrollChanged(scrollX, scrollY2, scrollX, scrollY2);
        C4Y c4y = this.A0i;
        if (c4y != null) {
            c4y.A0M(this, scrollY, i);
        }
        List<C4Y> list = this.A0m;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.A0m.get(size).A0M(this, scrollY, i);
            }
        }
        this.A0N--;
    }

    public final void A1c(int i, int i2) {
        int iA06 = this.A01.A06();
        for (int i3 = 0; i3 < iA06; i3++) {
            AbstractC03524l abstractC03524lA0G = A0G(this.A01.A0A(i3));
            if (abstractC03524lA0G != null && !abstractC03524lA0G.A0h()) {
                int i4 = abstractC03524lA0G.A03;
                if (A19[5].charAt(2) != 'Y') {
                    throw new RuntimeException();
                }
                A19[1] = "WfIl2QLxhpsV1cZ5bwDa0wyCBTSIuEWm";
                if (i4 >= i) {
                    abstractC03524lA0G.A0W(i2, false);
                    this.A0s.A0D = true;
                }
            }
        }
        this.A0r.A0R(i, i2);
        requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0078  */
    public final void A1d(int start, int end) {
        int i;
        int i2;
        int i3;
        int i4 = this.A01.A06();
        if (start < end) {
            i = start;
            i2 = end;
            i3 = -1;
        } else {
            i = end;
            i2 = start;
            i3 = 1;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            AbstractC03524l abstractC03524lA0G = A0G(this.A01.A0A(i5));
            if (A19[5].charAt(2) != 'Y') {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[2] = "SA2Eyd";
            strArr[7] = "XMtlHmP9rGs3";
            if (abstractC03524lA0G != null) {
                int inBetweenOffset = abstractC03524lA0G.A03;
                if (inBetweenOffset >= i) {
                    int inBetweenOffset2 = abstractC03524lA0G.A03;
                    if (inBetweenOffset2 <= i2) {
                        int i6 = abstractC03524lA0G.A03;
                        String[] strArr2 = A19;
                        String str = strArr2[6];
                        String str2 = strArr2[4];
                        int iCharAt = str.charAt(17);
                        int inBetweenOffset3 = str2.charAt(17);
                        if (iCharAt == inBetweenOffset3) {
                            String[] strArr3 = A19;
                            strArr3[6] = "BcaezuMb6aDfAWKozakh45MfYrs0kuIc";
                            strArr3[4] = "5erwLY6dW1OUzDMynaZgWLcHWlHtC3ze";
                            if (i6 == start) {
                                int inBetweenOffset4 = end - start;
                                abstractC03524lA0G.A0W(inBetweenOffset4, false);
                            } else {
                                abstractC03524lA0G.A0W(i3, false);
                            }
                        } else if (i6 == start) {
                            int inBetweenOffset5 = end - start;
                            abstractC03524lA0G.A0W(inBetweenOffset5, false);
                        } else {
                            abstractC03524lA0G.A0W(i3, false);
                        }
                        this.A0s.A0D = true;
                    }
                }
            }
        }
        this.A0r.A0S(start, end);
        requestLayout();
    }

    public final void A1e(int i, int i2) {
        A0m(i, i2, null);
    }

    public final void A1f(int positionEnd, int i, Object obj) {
        int iA06 = this.A01.A06();
        int i2 = positionEnd + i;
        for (int i3 = 0; i3 < iA06; i3++) {
            View viewA0A = this.A01.A0A(i3);
            AbstractC03524l abstractC03524lA0G = A0G(viewA0A);
            if (abstractC03524lA0G != null && !abstractC03524lA0G.A0h()) {
                int i4 = abstractC03524lA0G.A03;
                if (A19[1].length() != 32) {
                    throw new RuntimeException();
                }
                String[] strArr = A19;
                strArr[2] = "87XYbE";
                strArr[7] = "GV1T0vfadOcw";
                if (i4 >= positionEnd && abstractC03524lA0G.A03 < i2) {
                    abstractC03524lA0G.A0T(2);
                    abstractC03524lA0G.A0Y(obj);
                    ((C4U) viewA0A.getLayoutParams()).A01 = true;
                }
            }
        }
        this.A0r.A0T(positionEnd, i);
    }

    public final void A1g(int childCount, int i, boolean z) {
        int i2 = childCount + i;
        int iA06 = this.A01.A06();
        for (int i3 = 0; i3 < iA06; i3++) {
            AbstractC03524l abstractC03524lA0G = A0G(this.A01.A0A(i3));
            if (abstractC03524lA0G != null && !abstractC03524lA0G.A0h()) {
                if (abstractC03524lA0G.A03 >= i2) {
                    abstractC03524lA0G.A0W(-i, z);
                    this.A0s.A0D = true;
                } else if (abstractC03524lA0G.A03 >= childCount) {
                    abstractC03524lA0G.A0V(childCount - 1, -i, z);
                    if (A19[1].length() != 32) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A19;
                    strArr[2] = "dcjb0S";
                    strArr[7] = "CcIDXd599Ygw";
                    this.A0s.A0D = true;
                } else {
                    continue;
                }
            }
        }
        this.A0r.A0U(childCount, i, z);
        requestLayout();
    }

    public final void A1h(View view) {
        int i;
        A0G(view);
        C4H c4h = this.A04;
        List<RecyclerView.OnChildAttachStateChangeListener> list = this.A0l;
        if (A19[5].charAt(2) != 'Y') {
            throw new RuntimeException();
        }
        A19[5] = "qDYnzfveQxKkK3O0opuqDthRtcgsED9a";
        if (list != null && (i = list.size() - 1) >= 0) {
            this.A0l.get(i);
            throw new NullPointerException(A0J(1881, 27, 18));
        }
    }

    public final void A1i(View view) {
        int i;
        A0G(view);
        C4H c4h = this.A04;
        List<RecyclerView.OnChildAttachStateChangeListener> list = this.A0l;
        if (list != null && (i = list.size() - 1) >= 0) {
            this.A0l.get(i);
            throw new NullPointerException(A0J(1908, 29, 20));
        }
    }

    public final void A1j(C4Y c4y) {
        if (this.A0m == null) {
            this.A0m = new ArrayList();
        }
        this.A0m.add(c4y);
    }

    public final void A1k(C4Y c4y) {
        List<C4Y> list = this.A0m;
        if (list != null) {
            list.remove(c4y);
        }
    }

    public final void A1l(C03494i c03494i) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.A08.A01;
            c03494i.A06 = overScroller.getFinalX() - overScroller.getCurrX();
            c03494i.A07 = overScroller.getFinalY() - overScroller.getCurrY();
        } else {
            c03494i.A06 = 0;
            c03494i.A07 = 0;
        }
    }

    public final void A1m(AbstractC03524l abstractC03524l, C4O c4o) {
        abstractC03524l.A0U(0, 8192);
        if (this.A0s.A0E && abstractC03524l.A0f() && !abstractC03524l.A0c() && !abstractC03524l.A0h()) {
            this.A0t.A08(A0C(abstractC03524l), abstractC03524l);
        }
        this.A0t.A0F(abstractC03524l, c4o);
    }

    public final void A1n(@NonNull AbstractC03524l abstractC03524l, @Nullable C4O c4o, @NonNull C4O c4o2) {
        abstractC03524l.A0Z(false);
        if (this.A05.A0E(abstractC03524l, c4o, c4o2)) {
            A1N();
        }
    }

    public final void A1o(@NonNull AbstractC03524l abstractC03524l, @NonNull C4O c4o, @Nullable C4O c4o2) {
        A0s(abstractC03524l);
        abstractC03524l.A0Z(false);
        if (this.A05.A0F(abstractC03524l, c4o, c4o2)) {
            A1N();
        }
    }

    public final void A1p(String str) {
        if (A1u()) {
            if (str == null) {
                throw new IllegalStateException(A0J(574, 77, 49) + A1I());
            }
            throw new IllegalStateException(str);
        }
        if (this.A0N > 0) {
            Log.w(A0J(1370, 12, 79), A0J(294, 280, 24), new IllegalStateException(A0J(0, 0, 62) + A1I()));
        }
    }

    public final void A1q(boolean z) {
        this.A0U--;
        if (this.A0U < 1) {
            this.A0U = 0;
            if (z) {
                A0L();
                if (A19[1].length() != 32) {
                    throw new RuntimeException();
                }
                String[] strArr = A19;
                strArr[6] = "clcdgLago0QzUCUQna9RqUvMnx3zufId";
                strArr[4] = "dGTmnJIudyc2xKqsUaVYnInX4VXDIHXZ";
                A0a();
            }
        }
    }

    public final void A1r(boolean z) {
        if (this.A0O < 1) {
            this.A0O = 1;
        }
        if (!z) {
            this.A0J = false;
        }
        if (this.A0O == 1) {
            if (z && this.A0J && !this.A0I && this.A06 != null && this.A04 != null) {
                A0Z();
            }
            if (!this.A0I) {
                this.A0J = false;
            }
        }
        this.A0O--;
    }

    public final boolean A1s() {
        AccessibilityManager accessibilityManager = this.A10;
        if (accessibilityManager != null) {
            boolean zIsEnabled = accessibilityManager.isEnabled();
            String[] strArr = A19;
            if (strArr[6].charAt(17) != strArr[4].charAt(17)) {
                throw new RuntimeException();
            }
            A19[5] = "qqYNnQooq1iBe19qNxONRBmcR9jcXf5d";
            if (zIsEnabled) {
                return true;
            }
        }
        return false;
    }

    public final boolean A1t() {
        return !this.A0D || this.A0C || this.A00.A0J();
    }

    public final boolean A1u() {
        return this.A0U > 0;
    }

    public final boolean A1v(int i) {
        return getScrollingChildHelper().A09(i);
    }

    public final boolean A1w(int i, int i2) {
        return getScrollingChildHelper().A0B(i, i2);
    }

    public final boolean A1x(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().A0D(i, i2, i3, i4, iArr, i5);
    }

    public final boolean A1y(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().A0F(i, i2, iArr, iArr2, i3);
    }

    public final boolean A1z(View view) {
        A1K();
        boolean zA0L = this.A01.A0L(view);
        if (zA0L) {
            AbstractC03524l abstractC03524lA0G = A0G(view);
            this.A0r.A0c(abstractC03524lA0G);
            this.A0r.A0b(abstractC03524lA0G);
        }
        A1r(!zA0L);
        if (A19[1].length() != 32) {
            throw new RuntimeException();
        }
        String[] strArr = A19;
        strArr[3] = "2BT72D7B0XXfHPWJs3DbS8";
        strArr[0] = "RgGvPpmRJD";
        return zA0L;
    }

    public final boolean A20(AbstractC03524l abstractC03524l) {
        C4P c4p = this.A05;
        return c4p == null || c4p.A0M(abstractC03524l, abstractC03524l.A0L());
    }

    @VisibleForTesting
    public final boolean A21(AbstractC03524l abstractC03524l, int i) {
        if (A1u()) {
            abstractC03524l.A02 = i;
            this.A0w.add(abstractC03524l);
            return false;
        }
        AnonymousClass38.A09(abstractC03524l.A0H, i);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C4T c4t = this.A06;
        if (c4t != null) {
            boolean zA1g = c4t.A1g(this, arrayList, i, i2);
            if (A19[5].charAt(2) != 'Y') {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[2] = "qzNrCd";
            strArr[7] = "bMAkXN6Kp1Dd";
            if (zA1g) {
                return;
            }
        }
        super.addFocusables(arrayList, i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C4U) && this.A06.A1c((C4U) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        C4T c4t = this.A06;
        if (c4t != null && c4t.A24()) {
            return this.A06.A1j(this.A0s);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        C4T c4t = this.A06;
        if (c4t != null && c4t.A24()) {
            return this.A06.A1k(this.A0s);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        C4T c4t = this.A06;
        if (c4t == null) {
            return 0;
        }
        boolean zA24 = c4t.A24();
        if (A19[5].charAt(2) != 'Y') {
            throw new RuntimeException();
        }
        A19[1] = "GzwOa56ahdwGOmec9vc3XIggLcxaXOnz";
        if (zA24) {
            return this.A06.A1l(this.A0s);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        C4T c4t = this.A06;
        if (c4t == null) {
            return 0;
        }
        boolean zA25 = c4t.A25();
        String[] strArr = A19;
        if (strArr[3].length() != strArr[0].length()) {
            String[] strArr2 = A19;
            strArr2[2] = "Wsbuah";
            strArr2[7] = "lDl9g1VSjrmk";
            if (!zA25) {
                return 0;
            }
            C4T c4t2 = this.A06;
            String[] strArr3 = A19;
            if (strArr3[3].length() != strArr3[0].length()) {
                A19[5] = "sfYwg45p3roym5legx720iFNlg07mmUN";
                return c4t2.A1m(this.A0s);
            }
        }
        throw new RuntimeException();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        C4T c4t = this.A06;
        if (c4t != null && c4t.A25()) {
            return this.A06.A1n(this.A0s);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        C4T c4t = this.A06;
        if (c4t == null || !c4t.A25()) {
            return 0;
        }
        C4T c4t2 = this.A06;
        if (A19[5].charAt(2) != 'Y') {
            throw new RuntimeException();
        }
        String[] strArr = A19;
        strArr[6] = "NPPquBudgt65Kfhzva46C14iIBYgw5ng";
        strArr[4] = "gzaMlk0wrsXS1BjbnaI8sjsGlzE0u55w";
        return c4t2.A1o(this.A0s);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().A08(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().A07(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().A0E(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().A0C(i, i2, i3, i4, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> container) {
        dispatchThawSelfOnly(container);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray<Parcelable> container) {
        dispatchFreezeSelfOnly(container);
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0128  */
    /* JADX WARN: Code duplicated, block: B:76:0x014f  */
    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int width;
        super.draw(canvas);
        int size = this.A0v.size();
        for (int i = 0; i < size; i++) {
            this.A0v.get(i);
        }
        int padding = 0;
        EdgeEffect edgeEffect = this.A0a;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int paddingBottom = this.A0B ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.A0a;
            padding = (edgeEffect2 == null || !edgeEffect2.draw(canvas)) ? 0 : 1;
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.A0c;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.A0B) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.A0c;
            padding |= (edgeEffect4 == null || !edgeEffect4.draw(canvas)) ? 0 : 1;
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.A0b;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width2 = getWidth();
            int paddingTop = this.A0B ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            int width3 = -paddingTop;
            float f = width3;
            int width4 = -width2;
            canvas.translate(f, width4);
            EdgeEffect edgeEffect6 = this.A0b;
            if (edgeEffect6 != null) {
                boolean zDraw = edgeEffect6.draw(canvas);
                String[] strArr = A19;
                String str = strArr[2];
                String str2 = strArr[7];
                int length = str.length();
                int width5 = str2.length();
                if (length == width5) {
                    throw new RuntimeException();
                }
                A19[5] = "ItYbouux6ivob9pa5cwYanZ1Qwg84bbh";
                if (zDraw) {
                    width = 1;
                } else {
                    width = 0;
                }
            } else {
                width = 0;
            }
            padding |= width;
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.A0Z;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.A0B) {
                int width6 = getWidth();
                int i2 = -width6;
                int width7 = getPaddingRight();
                float f2 = i2 + width7;
                int width8 = getHeight();
                int i3 = -width8;
                int width9 = getPaddingBottom();
                canvas.translate(f2, i3 + width9);
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.A0Z;
            padding |= (edgeEffect8 == null || !edgeEffect8.draw(canvas)) ? 0 : 1;
            canvas.restoreToCount(iSave4);
        }
        if (padding == 0 && this.A05 != null && this.A0v.size() > 0) {
            C4P c4p = this.A05;
            if (A19[5].charAt(2) != 'Y') {
                if (c4p.A0L()) {
                    padding = 1;
                }
            } else {
                A19[5] = "slYCg9imVkQI2IB5irC0agqTwBjTAdyw";
                if (c4p.A0L()) {
                    padding = 1;
                }
            }
        }
        if (padding != 0) {
            AnonymousClass38.A07(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00a2  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        boolean z;
        View viewFindNextFocus;
        int i2;
        View viewA0u = this.A06.A0u(view, i);
        if (viewA0u != null) {
            return viewA0u;
        }
        if (this.A04 != null) {
            C4T c4t = this.A06;
            String[] strArr = A19;
            if (strArr[2].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A19;
            strArr2[3] = "RhZxCClAx00iKsBYiNgalY";
            strArr2[0] = "xpwAZ9hAV8";
            if (c4t == null || A1u() || this.A0I) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z && (i == 2 || i == 1)) {
            int i3 = 0;
            if (this.A06.A25()) {
                int i4 = i == 2 ? 130 : 33;
                i3 = focusFinder.findNextFocus(this, view, i4) == null ? 1 : 0;
                if (A1F) {
                    i = i4;
                }
            }
            if (i3 == 0 && this.A06.A24()) {
                if ((i == 2) ^ (this.A06.A0a() == 1)) {
                    i2 = 66;
                } else {
                    i2 = 17;
                }
                int absDir = focusFinder.findNextFocus(this, view, i2) != null ? 0 : 1;
                i3 = absDir;
                if (A1F) {
                    i = i2;
                }
            }
            if (i3 != 0) {
                A1J();
                if (A1F(view) == null) {
                    return null;
                }
                A1K();
                this.A06.A1r(view, i, this.A0r, this.A0s);
                A1r(false);
            }
            viewFindNextFocus = focusFinder.findNextFocus(this, view, i);
        } else {
            viewFindNextFocus = focusFinder.findNextFocus(this, view, i);
            if (viewFindNextFocus == null && z) {
                A1J();
                if (A1F(view) == null) {
                    return null;
                }
                A1K();
                viewFindNextFocus = this.A06.A1r(view, i, this.A0r, this.A0s);
                A1r(false);
            }
        }
        if (viewFindNextFocus == null || viewFindNextFocus.hasFocusable()) {
            return A17(view, viewFindNextFocus, i) ? viewFindNextFocus : super.focusSearch(view, i);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        }
        A0q(viewFindNextFocus, null);
        return view;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C4T c4t = this.A06;
        if (c4t != null) {
            return c4t.A1s();
        }
        throw new IllegalStateException(A0J(1475, 33, 17) + A1I());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        C4T c4t = this.A06;
        if (c4t != null) {
            return c4t.A0v(getContext(), attributeSet);
        }
        throw new IllegalStateException(A0J(1475, 33, 17) + A1I());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C4T c4t = this.A06;
        if (c4t != null) {
            C4U c4uA0w = c4t.A0w(layoutParams);
            if (A19[1].length() != 32) {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[3] = "4uZ9QAUZcjEo06EXHPHPN1";
            strArr[0] = "ePNmh1lbEA";
            return c4uA0w;
        }
        throw new IllegalStateException(A0J(1475, 33, 17) + A1I());
    }

    public C4H getAdapter() {
        return this.A04;
    }

    @Override // android.view.View
    public int getBaseline() {
        C4T c4t = this.A06;
        if (c4t != null) {
            int iA0V = c4t.A0V();
            if (A19[1].length() != 32) {
                throw new RuntimeException();
            }
            A19[1] = "WUntfQVcja1qFzj09nDprclvV6sI7lKs";
            return iA0V;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        C4K c4k = this.A0e;
        if (c4k == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        return c4k.onGetChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.A0B;
    }

    public C1251by getCompatAccessibilityDelegate() {
        return this.A09;
    }

    public C4P getItemAnimator() {
        return this.A05;
    }

    public C4T getLayoutManager() {
        return this.A06;
    }

    public int getMaxFlingVelocity() {
        return this.A0x;
    }

    public int getMinFlingVelocity() {
        return this.A0y;
    }

    public long getNanoTime() {
        if (A1E) {
            return System.nanoTime();
        }
        return 0L;
    }

    @Nullable
    public C4W getOnFlingListener() {
        return this.A0g;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.A0o;
    }

    public C4a getRecycledViewPool() {
        return this.A0r.A0H();
    }

    public int getScrollState() {
        return this.A0W;
    }

    private C03072q getScrollingChildHelper() {
        if (this.A0d == null) {
            this.A0d = new C03072q(this);
        }
        return this.A0d;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().A05();
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.A0F;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().A06();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0U = 0;
        boolean z = true;
        this.A0F = true;
        if (!this.A0D || isLayoutRequested()) {
            z = false;
        }
        this.A0D = z;
        C4T c4t = this.A06;
        if (c4t != null) {
            c4t.A1N(this);
        }
        this.A0K = false;
        if (A1E) {
            this.A03 = AnonymousClass44.A07.get();
            if (this.A03 == null) {
                this.A03 = new AnonymousClass44();
                Display displayA04 = AnonymousClass38.A04(this);
                float f = 60.0f;
                if (!isInEditMode() && displayA04 != null) {
                    float refreshRate = displayA04.getRefreshRate();
                    String[] strArr = A19;
                    if (strArr[2].length() == strArr[7].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A19;
                    strArr2[3] = "HPKMSTrO6rgllPECADdom7";
                    strArr2[0] = "yPSN9KqlOS";
                    if (refreshRate >= 30.0f) {
                        f = refreshRate;
                    }
                }
                this.A03.A00 = (long) (1.0E9f / f);
                AnonymousClass44.A07.set(this.A03);
            }
            this.A03.A09(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        AnonymousClass44 anonymousClass44;
        super.onDetachedFromWindow();
        C4P c4p = this.A05;
        if (c4p != null) {
            c4p.A0I();
        }
        A1R();
        this.A0F = false;
        C4T c4t = this.A06;
        if (c4t != null) {
            c4t.A1U(this, this.A0r);
        }
        this.A0w.clear();
        removeCallbacks(this.A0k);
        this.A0t.A07();
        if (A1E && (anonymousClass44 = this.A03) != null) {
            anonymousClass44.A0A(this);
            this.A03 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.A0v.size();
        for (int i = 0; i < size; i++) {
            this.A0v.get(i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0087  */
    /* JADX WARN: Code duplicated, block: B:36:0x0095  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b0  */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float hScroll;
        float axisValue;
        if (this.A06 == null) {
            return false;
        }
        boolean z = this.A0I;
        if (A19[1].length() != 32) {
            throw new RuntimeException();
        }
        String[] strArr = A19;
        strArr[2] = "hfCCVZ";
        strArr[7] = "6Rxn0wTGDCgs";
        if (!z && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                if (this.A06.A25()) {
                    hScroll = -motionEvent.getAxisValue(9);
                } else {
                    hScroll = 0.0f;
                }
                if (this.A06.A24()) {
                    axisValue = motionEvent.getAxisValue(10);
                } else {
                    axisValue = 0.0f;
                }
            } else {
                int source = motionEvent.getSource();
                if (A19[5].charAt(2) == 'Y') {
                    A19[5] = "SrYzqcFycO4E61WX0CCI79FBiQDWLxq8";
                    if ((source & 4194304) != 0) {
                        axisValue = motionEvent.getAxisValue(26);
                        if (this.A06.A25()) {
                            hScroll = -axisValue;
                            axisValue = 0.0f;
                        } else if (this.A06.A24()) {
                            hScroll = 0.0f;
                        } else {
                            hScroll = 0.0f;
                            axisValue = 0.0f;
                        }
                    } else {
                        hScroll = 0.0f;
                        axisValue = 0.0f;
                    }
                } else if ((source & 4194304) != 0) {
                    axisValue = motionEvent.getAxisValue(26);
                    if (this.A06.A25()) {
                        hScroll = -axisValue;
                        axisValue = 0.0f;
                    } else if (this.A06.A24()) {
                        hScroll = 0.0f;
                    } else {
                        hScroll = 0.0f;
                        axisValue = 0.0f;
                    }
                } else {
                    hScroll = 0.0f;
                    axisValue = 0.0f;
                }
            }
            if (hScroll != 0.0f || axisValue != 0.0f) {
                A14((int) (this.A0L * axisValue), (int) (this.A0M * hScroll), motionEvent);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.A0I) {
            return false;
        }
        if (A16(motionEvent)) {
            A0K();
            return true;
        }
        C4T c4t = this.A06;
        if (c4t == null) {
            return false;
        }
        boolean zA24 = c4t.A24();
        boolean zA25 = this.A06.A25();
        if (this.A0Y == null) {
            this.A0Y = VelocityTracker.obtain();
        }
        this.A0Y.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        String[] strArr = A19;
        String str = strArr[2];
        String str2 = strArr[7];
        int length = str.length();
        int action = str2.length();
        if (length == action) {
            throw new RuntimeException();
        }
        String[] strArr2 = A19;
        strArr2[3] = "Oz3Y31ex0QABqFtFM6aXix";
        strArr2[0] = "OpGO9pAa6R";
        if (actionMasked == 0) {
            boolean startScroll = this.A0n;
            if (startScroll) {
                this.A0n = false;
            }
            this.A0V = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.A0S = x;
            this.A0Q = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.A0T = y;
            this.A0R = y;
            if (this.A0W == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
            int[] iArr = this.A15;
            iArr[1] = 0;
            iArr[0] = 0;
            int nestedScrollAxis = 0;
            if (zA24) {
                nestedScrollAxis = 0 | 1;
            }
            if (zA25) {
                nestedScrollAxis |= 2;
            }
            A1w(nestedScrollAxis, 0);
        } else if (actionMasked == 1) {
            this.A0Y.clear();
            A1X(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.A0V);
            if (iFindPointerIndex < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(A0J(1063, 46, 50));
                int index = this.A0V;
                sb.append(index);
                sb.append(A0J(124, 45, 46));
                Log.e(A0J(1370, 12, 79), sb.toString());
                return false;
            }
            int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            int x3 = this.A0W;
            if (x3 != 1) {
                int x4 = this.A0Q;
                int i = x2 - x4;
                int x5 = this.A0R;
                int i2 = y2 - x5;
                boolean z = false;
                if (zA24 && Math.abs(i) > this.A0X) {
                    this.A0S = x2;
                    z = true;
                }
                if (zA25 && Math.abs(i2) > this.A0X) {
                    this.A0T = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            A0K();
        } else if (actionMasked == 5) {
            this.A0V = motionEvent.getPointerId(actionIndex);
            int x6 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.A0S = x6;
            this.A0Q = x6;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.A0T = y3;
            this.A0R = y3;
        } else if (actionMasked == 6) {
            A0o(motionEvent);
        }
        int action2 = this.A0W;
        return action2 == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C2V.A01(A0J(1330, 11, 86));
        A0Z();
        C2V.A00();
        this.A0D = true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        C4T c4t = this.A06;
        if (c4t == null) {
            A1a(i, i2);
            return;
        }
        boolean z = false;
        if (c4t.A06) {
            int mode = View.MeasureSpec.getMode(i);
            int heightMode = View.MeasureSpec.getMode(i2);
            if (mode == 1073741824 && heightMode == 1073741824) {
                z = true;
            }
            this.A06.A1J(this.A0r, this.A0s, i, i2);
            if (z || this.A04 == null) {
                return;
            }
            if (this.A0s.A04 == 1) {
                A0M();
            }
            this.A06.A11(i, i2);
            this.A0s.A0A = true;
            A0N();
            this.A06.A12(i, i2);
            if (this.A06.A23()) {
                this.A06.A11(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                C03494i c03494i = this.A0s;
                if (A19[1].length() != 32) {
                    String[] strArr = A19;
                    strArr[6] = "SNs0MIA5NFIkFiTpWaOkIZpcAnFttQ5E";
                    strArr[4] = "fXihHPq3ps5k4WwfOaG7U1bhyi9cbGtD";
                    c03494i.A0A = true;
                    A0N();
                    this.A06.A12(i, i2);
                    return;
                }
                String[] strArr2 = A19;
                strArr2[3] = "mxGjlxdGGYffeE2i6ToSoo";
                strArr2[0] = "9Nm63BEsB7";
                c03494i.A0A = true;
                A0N();
                this.A06.A12(i, i2);
                return;
            }
            return;
        }
        if (this.A0E) {
            this.A06.A1J(this.A0r, this.A0s, i, i2);
            return;
        }
        if (this.A0A) {
            A1K();
            A1L();
            A0Q();
            A1M();
            if (this.A0s.A0B) {
                C03494i c03494i2 = this.A0s;
                String[] strArr3 = A19;
                if (strArr3[3].length() == strArr3[0].length()) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A19;
                strArr4[6] = "KQlS07WJlXQIeKT2EaNKgCMREedmurGg";
                strArr4[4] = "TSw2akNEB1AJctHCwaDYxiu1Uwr65JPJ";
                c03494i2.A09 = true;
            } else {
                this.A00.A0G();
                this.A0s.A09 = false;
            }
            this.A0A = false;
            A1r(false);
        } else if (this.A0s.A0B) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        C4H c4h = this.A04;
        if (c4h != null) {
            this.A0s.A03 = c4h.A0D();
        } else {
            this.A0s.A03 = 0;
        }
        A1K();
        this.A06.A1J(this.A0r, this.A0s, i, i2);
        A1r(false);
        this.A0s.A09 = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (A1u()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof WrappedParcelable)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            classLoader = getContext().getClassLoader();
        }
        Parcelable parcelableUnwrap = ((WrappedParcelable) parcelable).unwrap(classLoader);
        if (!(parcelableUnwrap instanceof RecyclerView$SavedState)) {
            super.onRestoreInstanceState(parcelableUnwrap);
            return;
        }
        this.A0j = (RecyclerView$SavedState) parcelableUnwrap;
        super.onRestoreInstanceState(this.A0j.A02());
        if (this.A06 != null && this.A0j.A00 != null) {
            this.A06.A1w(this.A0j.A00);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        RecyclerView$SavedState recyclerView$SavedState = new RecyclerView$SavedState(super.onSaveInstanceState());
        RecyclerView$SavedState recyclerView$SavedState2 = this.A0j;
        if (recyclerView$SavedState2 != null) {
            recyclerView$SavedState.A03(recyclerView$SavedState2);
        } else {
            C4T c4t = this.A06;
            if (c4t != null) {
                recyclerView$SavedState.A00 = c4t.A1p();
            } else {
                recyclerView$SavedState.A00 = null;
            }
        }
        return new WrappedParcelable(recyclerView$SavedState);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            A0g();
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0211  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float xvel;
        float f;
        if (this.A0I || this.A0n) {
            return false;
        }
        boolean zA15 = A15(motionEvent);
        if (A19[5].charAt(2) != 'Y') {
            throw new RuntimeException();
        }
        A19[5] = "8sYT0RnpvG2arPES2UJ12JYFoUL9IQDo";
        if (zA15) {
            A0K();
            return true;
        }
        C4T c4t = this.A06;
        if (c4t == null) {
            return false;
        }
        boolean zA24 = c4t.A24();
        boolean zA25 = this.A06.A25();
        if (this.A0Y == null) {
            this.A0Y = VelocityTracker.obtain();
        }
        boolean z = false;
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.A15;
            iArr[1] = 0;
            String[] strArr = A19;
            String str = strArr[2];
            String str2 = strArr[7];
            int length = str.length();
            int actionIndex2 = str2.length();
            if (length != actionIndex2) {
                A19[5] = "w9Y7A1oKaVmj8Ov6eZqRiF6tVMdmRve8";
                iArr[0] = 0;
            } else {
                String[] strArr2 = A19;
                strArr2[6] = "DE62WFMw5Qbi4eBk1auhfUxeLGhnsE7e";
                strArr2[4] = "A6rUAAhMCRWi1Exz9agrYLVLW1oNRabf";
                iArr[0] = 0;
            }
        }
        int[] iArr2 = this.A15;
        int actionIndex3 = iArr2[0];
        float f2 = actionIndex3;
        int actionIndex4 = iArr2[1];
        motionEventObtain.offsetLocation(f2, actionIndex4);
        if (actionMasked == 0) {
            this.A0V = motionEvent.getPointerId(0);
            int index = (int) (motionEvent.getX() + 0.5f);
            this.A0S = index;
            this.A0Q = index;
            int index2 = (int) (motionEvent.getY() + 0.5f);
            this.A0T = index2;
            this.A0R = index2;
            int index3 = 0;
            if (zA24) {
                index3 = 0 | 1;
            }
            if (zA25) {
                index3 |= 2;
            }
            A1w(index3, 0);
        } else if (actionMasked == 1) {
            this.A0Y.addMovement(motionEventObtain);
            z = true;
            this.A0Y.computeCurrentVelocity(AdError.NETWORK_ERROR_CODE, this.A0x);
            if (zA24) {
                VelocityTracker velocityTracker = this.A0Y;
                int dy = this.A0V;
                String[] strArr3 = A19;
                if (strArr3[2].length() != strArr3[7].length()) {
                    A19[5] = "cvYQb2BcK3cjm46xX51a5wS3GdK3mOIc";
                    xvel = -velocityTracker.getXVelocity(dy);
                } else {
                    String[] strArr4 = A19;
                    strArr4[2] = "HePLvk";
                    strArr4[7] = "sISGhSA4Sc4c";
                    xvel = -velocityTracker.getXVelocity(dy);
                }
            } else {
                xvel = 0.0f;
            }
            if (zA25) {
                VelocityTracker velocityTracker2 = this.A0Y;
                int i = this.A0V;
                String[] strArr5 = A19;
                if (strArr5[6].charAt(17) != strArr5[4].charAt(17)) {
                    f = -velocityTracker2.getYVelocity(i);
                } else {
                    A19[5] = "lUYbAzGh0vj4LSfow0o2VnAou7QhBgLk";
                    f = -velocityTracker2.getYVelocity(i);
                }
            } else {
                f = 0.0f;
            }
            if (xvel != 0.0f || f != 0.0f) {
                if (!A13((int) xvel, (int) f)) {
                    setScrollState(0);
                }
            } else {
                setScrollState(0);
            }
            A0U();
        } else if (actionMasked == 2) {
            int actionIndex5 = this.A0V;
            int iFindPointerIndex = motionEvent.findPointerIndex(actionIndex5);
            if (iFindPointerIndex >= 0) {
                int x = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                int y = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                int i2 = this.A0S - x;
                int dx = this.A0T - y;
                if (A1y(i2, dx, this.A16, this.A17, 0)) {
                    int[] iArr3 = this.A16;
                    i2 -= iArr3[0];
                    dx -= iArr3[1];
                    int[] iArr4 = this.A17;
                    motionEventObtain.offsetLocation(iArr4[0], iArr4[1]);
                    int[] iArr5 = this.A15;
                    int dy2 = iArr5[0];
                    int[] iArr6 = this.A17;
                    iArr5[0] = dy2 + iArr6[0];
                    iArr5[1] = iArr5[1] + iArr6[1];
                }
                if (this.A0W != 1) {
                    boolean z2 = false;
                    if (zA24) {
                        int dy3 = Math.abs(i2);
                        int index4 = this.A0X;
                        if (dy3 > index4) {
                            if (i2 > 0) {
                                i2 -= index4;
                            } else {
                                i2 += index4;
                            }
                            z2 = true;
                        }
                    }
                    if (zA25) {
                        int dy4 = Math.abs(dx);
                        int index5 = this.A0X;
                        if (dy4 > index5) {
                            if (dx > 0) {
                                dx -= index5;
                            } else {
                                dx += index5;
                            }
                            z2 = true;
                        }
                    }
                    if (z2) {
                        setScrollState(1);
                    }
                }
                if (this.A0W == 1) {
                    int[] iArr7 = this.A17;
                    this.A0S = x - iArr7[0];
                    this.A0T = y - iArr7[1];
                    if (A14(zA24 ? i2 : 0, zA25 ? dx : 0, motionEventObtain)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    if (this.A03 != null && (i2 != 0 || dx != 0)) {
                        this.A03.A0B(this, i2, dx);
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(A0J(1063, 46, 50));
                int actionIndex6 = this.A0V;
                sb.append(actionIndex6);
                sb.append(A0J(124, 45, 46));
                Log.e(A0J(1370, 12, 79), sb.toString());
                return false;
            }
        } else if (actionMasked == 3) {
            A0K();
        } else if (actionMasked == 5) {
            int actionIndex7 = motionEvent.getPointerId(actionIndex);
            this.A0V = actionIndex7;
            int actionIndex8 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.A0S = actionIndex8;
            this.A0Q = actionIndex8;
            int actionIndex9 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.A0T = actionIndex9;
            this.A0R = actionIndex9;
        } else if (actionMasked == 6) {
            A0o(motionEvent);
        }
        if (!z) {
            this.A0Y.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        AbstractC03524l abstractC03524lA0G = A0G(view);
        if (abstractC03524lA0G != null) {
            if (abstractC03524lA0G.A0e()) {
                abstractC03524lA0G.A0P();
            } else if (!abstractC03524lA0G.A0h()) {
                throw new IllegalArgumentException(A0J(219, 75, 37) + abstractC03524lA0G + A1I());
            }
        }
        view.clearAnimation();
        A1i(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.A06.A1f(this, this.A0s, view, view2) && view2 != null) {
            A0q(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.A06.A1d(this, view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.A13.size();
        for (int i = 0; i < size; i++) {
            this.A13.get(i);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.A0O == 0 && !this.A0I) {
            super.requestLayout();
        } else {
            this.A0J = true;
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        C4T c4t = this.A06;
        if (c4t == null) {
            Log.e(A0J(1370, 12, 79), A0J(834, 90, 71));
            return;
        }
        if (this.A0I) {
            return;
        }
        boolean zA24 = c4t.A24();
        boolean zA25 = this.A06.A25();
        if (zA24 || zA25) {
            if (!zA24) {
                i = 0;
            }
            A14(i, zA25 ? i2 : 0, null);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w(A0J(1370, 12, 79), A0J(1382, 93, 90));
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (A19(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(C1251by c1251by) {
        this.A09 = c1251by;
        AnonymousClass38.A0B(this, this.A09);
    }

    public void setAdapter(C4H c4h) {
        setLayoutFrozen(false);
        A0r(c4h, false, true);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(C4K c4k) {
        if (c4k == this.A0e) {
            return;
        }
        this.A0e = c4k;
        setChildrenDrawingOrderEnabled(this.A0e != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.A0B) {
            A0g();
        }
        this.A0B = z;
        super.setClipToPadding(z);
        if (this.A0D) {
            requestLayout();
        }
    }

    public void setHasFixedSize(boolean z) {
        this.A0E = z;
    }

    public void setItemAnimator(C4P c4p) {
        C4P c4p2 = this.A05;
        if (c4p2 != null) {
            c4p2.A0I();
            this.A05.A0B(null);
        }
        this.A05 = c4p;
        C4P c4p3 = this.A05;
        if (c4p3 != null) {
            C4N c4n = this.A0f;
            if (A19[1].length() != 32) {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[3] = "lbql160khUomfa8gG92Y7q";
            strArr[0] = "AtGY6u7EZb";
            c4p3.A0B(c4n);
        }
    }

    public void setItemViewCacheSize(int i) {
        this.A0r.A0Q(i);
    }

    public void setLayoutFrozen(boolean z) {
        if (z != this.A0I) {
            A1p(A0J(1021, 42, 85));
            if (!z) {
                this.A0I = false;
                if (this.A0J && this.A06 != null && this.A04 != null) {
                    requestLayout();
                }
                this.A0J = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent cancelEvent = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            onTouchEvent(cancelEvent);
            this.A0I = true;
            this.A0n = true;
            A1R();
        }
    }

    public void setLayoutManager(C4T c4t) {
        if (c4t == this.A06) {
            return;
        }
        A1R();
        if (this.A06 != null) {
            C4P c4p = this.A05;
            if (c4p != null) {
                c4p.A0I();
            }
            this.A06.A1I(this.A0r);
            this.A06.A1G(this.A0r);
            this.A0r.A0P();
            if (this.A0F) {
                this.A06.A1U(this, this.A0r);
            }
            this.A06.A1P(null);
            this.A06 = null;
        } else {
            this.A0r.A0P();
        }
        this.A01.A0B();
        this.A06 = c4t;
        if (c4t != null) {
            F9 f9 = c4t.A03;
            if (A19[1].length() != 32) {
                throw new RuntimeException();
            }
            String[] strArr = A19;
            strArr[6] = "5zwSvF43vthb6lIFeaOoDRJ244Dq07FI";
            strArr[4] = "COyIsU8he0MLuT7wFa9x9SZ5A7LzgdfA";
            if (f9 == null) {
                this.A06.A1P(this);
                if (this.A0F) {
                    this.A06.A1N(this);
                }
            } else {
                throw new IllegalArgumentException(A0J(1109, 14, 88) + c4t + A0J(59, 39, 9) + c4t.A03.A1I());
            }
        }
        this.A0r.A0O();
        requestLayout();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().A04(z);
    }

    public void setOnFlingListener(@Nullable C4W c4w) {
        this.A0g = c4w;
    }

    @Deprecated
    public void setOnScrollListener(C4Y c4y) {
        this.A0i = c4y;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.A0o = z;
    }

    public void setRecycledViewPool(C4a c4a) {
        this.A0r.A0Z(c4a);
    }

    public void setRecyclerListener(InterfaceC03434c interfaceC03434c) {
        this.A07 = interfaceC03434c;
    }

    public void setScrollState(int i) {
        if (i == this.A0W) {
            return;
        }
        this.A0W = i;
        if (i != 2) {
            A0W();
        }
        A0l(i);
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i != 1) {
                Log.w(A0J(1370, 12, 79), A0J(1937, 47, 26) + i + A0J(198, 21, 121));
            } else {
                this.A0X = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.A0X = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(AbstractC03504j abstractC03504j) {
        this.A0r.A0a(abstractC03504j);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().A0A(i);
    }

    @Override // android.view.View, com.facebook.ads.redexgen.X.InterfaceC03062p
    public final void stopNestedScroll() {
        getScrollingChildHelper().A02();
    }
}
