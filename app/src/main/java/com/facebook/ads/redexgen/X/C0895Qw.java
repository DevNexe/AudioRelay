package com.facebook.ads.redexgen.X;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Vector;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0895Qw {
    public static byte[] A0G;
    public static String[] A0H = {"4lWoymCKcFFqvR4KGqpukkAdeBkDHFLG", "4SfXhahvn2cvHTwc", "1H78NFRDPNrHyZuRtW6OfnE16", "5zR7eGXCNOES3F", "tNutlosLurIud7dAWRzPLPvdzTHVgEY0", "XrTXE7Mp98Q", "ALMz8CaD4gcY6rgjWR0f79B0Q", "oMfYSWXrIKFBNYq7bMfMNj8ewYt05Dn"};
    public static final String A0I;
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public L8 A04;
    public C0896Qx A05;
    public Map<String, Integer> A06;
    public boolean A07;
    public boolean A08;
    public final int A09;
    public final int A0A;
    public final Handler A0B;
    public final View A0C;
    public final C1075Xy A0D;
    public final WeakReference<AbstractC0894Qv> A0E;
    public final boolean A0F;

    public static String A0H(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0G, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 88);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0M() {
        A0G = new byte[]{-40, -32, -35, -26, -23, 30, -35, -35, -31, -28, 45, 55, -28, -60, 27, 13, 24, 12, -60, 22, 9, 5, 23, 19, 18, -34, -60, -79, -91, -19, -62, -89, -54, -122, -49, -39, -122, -43, -44, -122, -38, -43, -42, -122, -43, -52, -122, -38, -50, -53, -122, -78, -43, -55, -47, -39, -55, -40, -53, -53, -44, -108, -58, -28, -15, -15, -14, -9, -93, -22, -24, -9, -93, -17, -14, -26, -28, -9, -20, -14, -15, -93, -14, -15, -93, -10, -26, -11, -24, -24, -15, -79, -86, -43, -53, -39, -44, -115, -38, -122, -45, -57, -47, -53, -122, -39, -53, -44, -39, -53, -122, -38, -43, -122, -39, -53, -38, -122, -55, -50, -53, -55, -47, -122, -49, -44, -38, -53, -40, -36, -57, -46, -122, -52, -43, -40, -122, -44, -43, -44, -109, -40, -53, -42, -53, -57, -38, -122, -55, -50, -53, -55, -47, -53, -40, -108, -16, 10, 30, 12, 26, 6, 23, 9, -59, 14, 24, -59, 20, 7, 24, 25, 23, 26, 8, 25, 14, 19, 12, -59, 27, 14, 10, 28, -45, -23, -7, 8, -5, -5, 4, -74, -1, 9, -74, 4, 5, 10, -74, -1, 4, 10, -5, 8, -9, -7, 10, -1, 12, -5, -60, -64, -44, -47, -116, -32, -43, -49, -41, -47, -34, -116, -49, -51, -38, -38, -37, -32, -116, -50, -47, -116, -38, -47, -45, -51, -32, -43, -30, -47, 28, 47, 43, 61, -26, -31, -19, -21, -84, -28, -33, -31, -29, -32, -19, -19, -23, -84, -33, -30, -15, -84, -25, -20, -14, -29, -16, -20, -33, -22, -84, -12, -25, -29, -11, -84, -60, -13, -22, -22, -47, -31, -16, -29, -29, -20, -65, -30, -46, -19, -19, -22, -32, -33, -16, -2, -46, -11, -25, -6, -10, 8, -79, -7, -14, 4, -79, -6, -1, 7, -6, 4, -6, -13, -3, -10, -79, -11, -6, -2, -10, -1, 4, -6, 0, -1, 4, -79, -71, 8, -50, 40, -4, 31, 17, 36, 32, 50, -37, 35, 28, 46, -37, 41, 42, -37, 43, 28, 45, 32, 41, 47, -23, -28, -72, -37, -51, -32, -36, -18, -105, -32, -22, -105, -27, -20, -29, -29, -91, -29, -73, -38, -52, -33, -37, -19, -106, -33, -23, -106, -22, -27, -27, -106, -22, -24, -41, -28, -23, -26, -41, -24, -37, -28, -22, -92, 4, -40, -5, -19, 0, -4, 14, -73, 0, 10, -73, 13, 0, 10, 0, -7, 3, -4, -59, 54, 10, 45, 31, 50, 46, 64, -23, 57, 42, 59, 46, 55, 61, -23, 50, 60, -23, 55, 56, 61, -23, 60, 46, 61, -23, 61, 56, -23, 31, 18, 28, 18, 11, 21, 14, -9, -17, -61, -26, -40, -21, -25, -7, -94, -8, -21, -11, -21, -28, -18, -25, -94, -29, -12, -25, -29, -94, -21, -11, -94, -10, -15, -15, -94, -11, -17, -29, -18, -18, -94, -35, -89, -80, -76, -24, -89, -89, -94, -8, -21, -11, -21, -28, -18, -25, -82, -94, -27, -9, -12, -12, -25, -16, -10, -94, -10, -22, -12, -25, -11, -22, -15, -18, -26, -94, -89, -80, -76, -24, -89, -89, -33, 40, -4, 31, 17, 36, 32, 50, -37, 50, 36, 41, 31, 42, 50, -37, 36, 46, -37, 41, 42, 47, -37, 46, 32, 47, -37, 47, 42, -37, 17, 4, 14, 4, -3, 7, 0, -23, 63, 64, 69, -15, 71, 58, 54, 72, 50, 51, 61, 54, 73, 59, 31, 18, 14, 32, 10, 11, 21, 14, 47, 41, 34, 30, 15, 18, 16, 60, 46, 51, 41, 52, 60};
    }

    static {
        A0M();
        A0I = C0895Qw.class.getSimpleName();
    }

    public C0895Qw(View view, int i, int i2, boolean z, WeakReference<AbstractC0894Qv> weakReference, C1075Xy c1075Xy) {
        this.A0B = new Handler();
        this.A01 = 0;
        this.A02 = AdError.NETWORK_ERROR_CODE;
        this.A08 = true;
        this.A05 = new C0896Qx(C0Q.A0M);
        this.A06 = new HashMap();
        this.A03 = 0L;
        this.A00 = 0;
        this.A07 = true;
        this.A0D = c1075Xy;
        this.A0C = view;
        if (this.A0C.getId() == -1) {
            MS.A0K(this.A0C);
        }
        this.A0A = i;
        this.A0E = weakReference;
        this.A0F = z;
        if (i2 < 0) {
            if (BuildConfigApi.isDebug()) {
                Log.w(A0I, A0H(211, 29, 20));
            }
            i2 = 0;
        }
        this.A09 = i2;
    }

    public C0895Qw(View view, int i, WeakReference<AbstractC0894Qv> weakReference, C1075Xy c1075Xy) {
        this(view, i, 0, false, weakReference, c1075Xy);
    }

    public C0895Qw(View view, int i, boolean z, WeakReference<AbstractC0894Qv> weakReference, C1075Xy c1075Xy) {
        this(view, i, 0, z, weakReference, c1075Xy);
    }

    @VisibleForTesting
    public static float A00(View view) {
        float alpha = view.getAlpha();
        while (view.getParent() instanceof ViewGroup) {
            view = (View) view.getParent();
            float alpha2 = view.getAlpha();
            if (alpha2 < 0.0f) {
                alpha2 = 0.0f;
            }
            if (alpha2 > 1.0f) {
                alpha2 = 1.0f;
            }
            alpha *= alpha2;
        }
        return alpha;
    }

    @VisibleForTesting
    public static int A01(int viewArea, View view) {
        int width = view.getWidth() * view.getHeight();
        return (int) Math.max(viewArea, Math.ceil(width > 0 ? 100.0f / width : 100.0f));
    }

    public static /* synthetic */ int A05(C0895Qw c0895Qw) {
        int i = c0895Qw.A00;
        c0895Qw.A00 = i + 1;
        return i;
    }

    public static int A08(Vector<Rect> vector) {
        int i;
        int size = vector.size();
        int[] iArr = new int[size * 2];
        int[] iArr2 = new int[size * 2];
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) boolean.class, size * 2, size * 2);
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Rect rectElementAt = vector.elementAt(i4);
            int i5 = i2 + 1;
            iArr[i2] = rectElementAt.left;
            int i6 = i3 + 1;
            int yPos = rectElementAt.bottom;
            iArr2[i3] = yPos;
            i2 = i5 + 1;
            int yPos2 = rectElementAt.right;
            iArr[i5] = yPos2;
            i3 = i6 + 1;
            int yPos3 = rectElementAt.top;
            iArr2[i6] = yPos3;
        }
        Arrays.sort(iArr);
        Arrays.sort(iArr2);
        for (int i7 = 0; i7 < size; i7++) {
            Rect rectElementAt2 = vector.elementAt(i7);
            int xPos = rectElementAt2.left;
            int iA09 = A09(iArr, xPos);
            int xPos2 = rectElementAt2.right;
            int iA010 = A09(iArr, xPos2);
            int rightEdgeIndex = rectElementAt2.top;
            int iA011 = A09(iArr2, rightEdgeIndex);
            int i8 = rectElementAt2.bottom;
            int leftEdgeIndex = A0H[0].charAt(24);
            if (leftEdgeIndex != 101) {
                throw new RuntimeException();
            }
            A0H[5] = "OkBp9M6GoSG";
            int iA012 = A09(iArr2, i8);
            for (int i9 = iA09 + 1; i9 <= iA010; i9++) {
                for (int m = iA011 + 1; m <= iA012; m++) {
                    zArr[i9][m] = true;
                }
            }
        }
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            int i12 = 0;
            while (true) {
                int i13 = size * 2;
                String[] strArr = A0H;
                String str = strArr[3];
                String str2 = strArr[6];
                int j = str.length();
                int i14 = str2.length();
                if (j == i14) {
                    throw new RuntimeException();
                }
                A0H[5] = "8mdjYFfHzfR";
                if (i12 < i13) {
                    if (zArr[i11][i12]) {
                        int i15 = i11 - 1;
                        int i16 = iArr[i11] - iArr[i15];
                        int j2 = iArr2[i12];
                        int i17 = i12 - 1;
                        i = i16 * (j2 - iArr2[i17]);
                    } else {
                        i = 0;
                    }
                    i10 += i;
                    String[] strArr2 = A0H;
                    String str3 = strArr2[3];
                    String str4 = strArr2[6];
                    int j3 = str3.length();
                    int i18 = str4.length();
                    if (j3 != i18) {
                        A0H[5] = "Lo9ucXqSR57";
                        i12++;
                    } else {
                        String[] strArr3 = A0H;
                        strArr3[3] = "Va2huEuqJLy8G9";
                        strArr3[6] = "xLD3f1Ctst12pSyAioan4nQjy";
                        i12 += 0;
                    }
                }
            }
        }
        return i10;
    }

    public static int A09(int[] iArr, int high) {
        int mid = 0;
        int length = iArr.length;
        while (mid < length) {
            int i = ((length - mid) / 2) + mid;
            if (iArr[i] == high) {
                return i;
            }
            int i2 = iArr[i];
            String[] strArr = A0H;
            if (strArr[2].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            A0H[0] = "QqEyOv5K4c2a7TamOIPTrCyFewVDGSxi";
            if (i2 > high) {
                length = i;
            } else {
                mid = i + 1;
            }
        }
        return -1;
    }

    public static C0896Qx A0E(View view, int i, C1075Xy c1075Xy) {
        if (view == null) {
            A0N(null, false, A0H(353, 16, 31));
            return new C0896Qx(C0Q.A08);
        }
        boolean zA1x = JR.A1x(c1075Xy);
        String strA0H = A0H(415, 37, 113);
        String strA0H2 = A0H(331, 22, 99);
        if (zA1x) {
            if (view.getParent() == null) {
                A0N(view, false, strA0H2);
                return new C0896Qx(C0Q.A0K);
            }
            if (!view.isShown()) {
                A0N(view, false, strA0H);
                return new C0896Qx(C0Q.A0N);
            }
        } else {
            if (view.getParent() == null) {
                A0N(view, false, strA0H2);
                return new C0896Qx(C0Q.A0H);
            }
            if (!view.isShown()) {
                A0N(view, false, strA0H);
                return new C0896Qx(C0Q.A0H);
            }
        }
        if (view.getWindowVisibility() != 0) {
            A0N(view, false, A0H(528, 37, 99));
            return new C0896Qx(C0Q.A0I);
        }
        if (view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0) {
            A0N(view, false, A0H(295, 36, 57) + view.getMeasuredWidth() + A0H(27, 4, 45) + view.getMeasuredHeight());
            return new C0896Qx(C0Q.A0G);
        }
        if (A00(view) < 0.9f) {
            A0N(view, false, A0H(369, 27, 30));
            return new C0896Qx(C0Q.A0B);
        }
        view.getWidth();
        view.getHeight();
        if (A0H[4].charAt(15) == 'A') {
            A0H[4] = "6urEtCeD4ew6lB3ALfyGXwnH3LBfrVYN";
            try {
                view.getLocationOnScreen(new int[2]);
                Rect rect = new Rect();
                if (!view.getGlobalVisibleRect(rect)) {
                    return new C0896Qx(C0Q.A07);
                }
                int i2 = Build.VERSION.SDK_INT;
                if (A0H[1].length() == 16) {
                    A0H[1] = "Od97VXu84qI514kY";
                    if (i2 >= 17) {
                        ((WindowManager) c1075Xy.getSystemService(A0H(594, 6, 109))).getDefaultDisplay().getRealMetrics(new DisplayMetrics());
                    } else {
                        Resources resources = c1075Xy.getResources();
                        if (A0H[5].length() != 11) {
                            throw new RuntimeException();
                        }
                        A0H[5] = "7BlUoPG8r9G";
                        resources.getDisplayMetrics();
                    }
                    Vector<Rect> rectVector = A0K(view);
                    int areaSize = A08(rectVector);
                    rectVector.add(rect);
                    int targetAreaSize = A08(rectVector) - areaSize;
                    int measuredHeight = view.getMeasuredHeight();
                    int areaSize2 = view.getMeasuredWidth();
                    float f = (targetAreaSize * 1.0f) / (measuredHeight * areaSize2);
                    int mViewabilityThreshold = A01(i, view);
                    float f2 = mViewabilityThreshold / 100.0f;
                    if (f < f2) {
                        A0N(view, false, String.format(Locale.US, A0H(452, 76, 42), Float.valueOf(f), Float.valueOf(f2)));
                        return new C0896Qx(C0Q.A04, f);
                    }
                    if (!C0778Mj.A03(c1075Xy)) {
                        A0N(view, false, A0H(185, 26, 62));
                        return new C0896Qx(C0Q.A0L, f);
                    }
                    Map<String, String> mapA01 = C0779Mk.A01(c1075Xy);
                    if (MT.A04(mapA01)) {
                        A0N(view, false, A0H(156, 29, 77));
                        return new C0896Qx(C0Q.A0A, f);
                    }
                    if (JR.A1N(c1075Xy) && MT.A03(mapA01)) {
                        A0N(view, false, A0H(31, 31, 14));
                        return new C0896Qx(C0Q.A05, f, mapA01);
                    }
                    A0N(view, true, A0H(396, 19, 63));
                    return new C0896Qx(C0Q.A0J, f, mapA01);
                }
            } catch (NullPointerException unused) {
                A0N(view, false, A0H(62, 30, 43));
                return new C0896Qx(C0Q.A0G);
            }
        }
        throw new RuntimeException();
    }

    public static Vector<Rect> A0K(View view) {
        Vector<Rect> vector = new Vector<>();
        if (!(view.getParent() instanceof ViewGroup)) {
            return vector;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int childIndex = viewGroup.indexOfChild(view);
        for (int i = childIndex + 1; i < i; i++) {
            View childAt = viewGroup.getChildAt(i);
            boolean z = !(childAt instanceof C0855Pi);
            boolean z2 = ((childAt instanceof SX) && C0897Qy.A00(childAt)) ? false : true;
            if (z && z2) {
                vector.addAll(A0L(childAt));
            }
        }
        vector.addAll(A0K(viewGroup));
        return vector;
    }

    public static Vector<Rect> A0L(View view) {
        Vector<Rect> vector = new Vector<>();
        if (!view.isShown() || (Build.VERSION.SDK_INT >= 11 && view.getAlpha() <= 0.0f)) {
            return vector;
        }
        int i = (view.getClass().getName().equals(A0H(245, 50, 38)) && view.getBackground() != null && (view.getBackground() instanceof GradientDrawable)) ? 1 : 0;
        if ((view instanceof ViewGroup) && (C0897Qy.A00(view) || i != 0)) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                vector.addAll(A0L(viewGroup.getChildAt(i2)));
            }
            return vector;
        }
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            vector.add(rect);
        }
        return vector;
    }

    public static void A0N(View view, boolean z, String str) {
        if (BuildConfigApi.isDebug()) {
            StringBuilder sb = new StringBuilder();
            sb.append(A0H(240, 5, 110));
            sb.append(view);
            sb.append(A0H(9, 4, 108));
            sb.append(z ? A0H(579, 8, 81) : A0H(565, 12, 121));
            sb.append(A0H(13, 14, 76));
            sb.append(str);
            sb.toString();
        }
    }

    public final synchronized String A0R() {
        return C0Q.valuesCustom()[this.A05.A01()].toString() + String.format(Locale.US, A0H(0, 9, 96), Float.valueOf(this.A05.A00() * 100.0f));
    }

    public final synchronized Map<String, String> A0S() {
        HashMap map;
        map = new HashMap();
        map.put(A0H(589, 3, 84), String.valueOf(this.A05.A01()));
        map.put(A0H(587, 2, 97), String.valueOf(this.A05.A00()));
        map.put(A0H(577, 2, 123), new JSONObject(this.A06).toString());
        map.put(A0H(592, 2, 68), MJ.A05(this.A03));
        map.putAll(this.A05.A03());
        return map;
    }

    public final synchronized void A0T() {
        this.A05 = new C0896Qx(C0Q.A0M);
    }

    public final synchronized void A0U() {
        if (this.A04 != null) {
            A0V();
        }
        if (this.A07) {
            this.A0D.A0D().A35();
        }
        this.A04 = new C4S(this, this.A0D);
        this.A0B.postDelayed(this.A04, this.A01);
        this.A08 = false;
        this.A00 = 0;
        this.A05 = new C0896Qx(C0Q.A0M);
        this.A06 = new HashMap();
    }

    public final synchronized void A0V() {
        if (this.A07) {
            this.A0D.A0D().A36();
        }
        this.A0B.removeCallbacks(this.A04);
        this.A04 = null;
        this.A08 = true;
        this.A00 = 0;
    }

    public final void A0W(int i) {
        this.A01 = i;
    }

    public final void A0X(int i) {
        if (BuildConfigApi.isDebug() && !this.A0F) {
            Log.w(A0I, A0H(92, 64, 14));
        }
        this.A02 = i;
    }

    public final void A0Y(boolean z) {
        this.A07 = z;
    }

    public final synchronized boolean A0Z() {
        return this.A08;
    }
}
